using StraitJacket.Constructs;

namespace StraitJacket {

    // For mangling names.
    public static class Mangler {

        public static string ManglePrefix() {
            return "_A";
        }

        public static string MangleScope(Scope s) {
            Scope curr = s;
            string ret = "";
            while (curr != null) {
                if (curr.Name.Length == 0) { curr = curr.Parent; continue; }
                ret = curr.Name.Length + curr.Name + ret;
                curr = curr.Parent;
            }
            return ret;
        }

        public static string MangleType(VarType type) {
            string ret = "";
            if (type.Constant) ret += "C";
            if (type.Static) ret += "S";
            if (type.Volatile) ret += "V";
            if (type.Atomic) ret += "A";
            if (type.Variadic) ret += "I";
            switch(type.Type) {
                case VarTypeEnum.Primitive:
                    switch (type.Primitive) {
                        case Primitives.String:
                            return ret + "s";
                        case Primitives.Bool:
                            return ret + "b";
                        case Primitives.Unsigned:
                            return ret + "u" + type.BitWidth.ToString();
                        case Primitives.Signed:
                            return ret + "i" + type.BitWidth.ToString();
                        case Primitives.Half:
                            return ret + "h";
                        case Primitives.Float:
                            return ret + "f";
                        case Primitives.Double:
                            return ret + "d";
                        case Primitives.Extended:
                            return ret + "e";
                        case Primitives.Decimal:
                            return ret + "c";
                        case Primitives.Fixed:
                            return ret + "x" + type.BitWidth.ToString() + "X" + type.FractionWidth.ToString();
                        case Primitives.VariableLength:
                            return ret + "l";
                        case Primitives.Object:
                            return ret + "o";
                        case Primitives.Void:
                            return ret + "v";
                        case Primitives.Function:
                            string func = "";
                            foreach (var m in type.Members) {
                                func += MangleType(m);
                            }
                            return ret + "n" + func;
                        case Primitives.Event:
                            string evt= "";
                            foreach (var m in type.Members) {
                                evt += MangleType(m);
                            }
                            return ret + "t" + evt;
                        case Primitives.Char:
                            return ret + "r";
                        case Primitives.WideChar:
                            return ret + "w";
                        case Primitives.ToBeDetermined:
                            throw new System.Exception("????");
                        case Primitives.UnsignedAny:
                            return ret + "U";
                        case Primitives.SignedAny:
                            return ret + "I";
                        case Primitives.FloatingAny:
                            return ret + "F";
                        case Primitives.FixedAny:
                            return ret + "X";
                    }
                    break;
                case VarTypeEnum.Tuple:
                    string tpl = "";
                    foreach (var m in type.Members) {
                        tpl += MangleType(m);
                    }
                    return "T" + tpl;
                case VarTypeEnum.Custom:
                    if (!type.ContainsStruct) {
                        return MangleType(type.Scope.ResolveType(type.ToResolve));
                    }
                    string scopeMangle = MangleScope(type.Scope);
                    return ret + scopeMangle + type.Name.Length + type.Name + "E";
                case VarTypeEnum.Pointer:
                    return "p" + MangleType(type.EmbeddedType);
                case VarTypeEnum.Reference:
                    return "P" + MangleType(type.EmbeddedType);
                case VarTypeEnum.Array:
                    return "a" + MangleType(type.EmbeddedType);
                case VarTypeEnum.Generics:
                    throw new System.Exception("TODO!!!");
            }
            return null;
        }

        public static string MangleFunction(Function f) {
            string pars = "";
            for (int i = 0; i < f.Parameters.Count; i++) {
                pars += MangleType(f.Parameters[i].Value.Type);
            }
            string ret = ManglePrefix() + MangleScope(f.Scope) + f.Name.Length + f.Name + "E" + pars;
            if (!(f.ReturnType.Type == VarTypeEnum.Primitive && f.ReturnType.Primitive == Primitives.Void)) {
                ret += "R" + MangleType(f.ReturnType);
            }
            return ret;
        }

    }

}