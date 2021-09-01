// Implementation for floating-point based math, comparison, etc. Floating is the generic interface/derived type for floating point numbers. This is true for any bitwidth.
// Not complete, this is wack atm.
impl floating {

    // Constructors.
    inline floating() { value = 0; }
    inline floating(floating f) { value = f; }
    inline floating(unsigned u) { value = u; }
    inline floating(signed s) { value = s; }

    // Classic math operations.
    inline operator +(floating a, floating b) -> floating => (floating)llvm("fadd", a, b);
    inline operator -(floating a, floating b) -> floating => (floating)llvm("fsub", a, b);
    inline operator *(floating a, floating b) -> floating => (floating)llvm("fmul", a, b);
    inline operator /(floating a, floating b) -> floating => (floating)llvm("fdiv", a, b);
    inline operator %(floating a, floating b) -> floating => (floating)llvm("frem", a, b);

    // Value set operators.
    inline operator =(floating f) { value = f.value; }
    inline operator +=(floating f) { value = value + f; }
    inline operator -=(floating f) { value = value - f; }
    inline operator *=(floating f) { value = value * f; }
    inline operator /=(floating f) { value = value / f; }
    inline operator %=(floating f) { value = value % f; }
    inline operator **=(signed s) {
        floating bak = value;
        value = 1;
        if (s > 0) {
            for (x in 0..s)
                value *= bak;
        } else if (s < 0) {
            for (x in s..0)
                value /= bak;
        }
    }
    inline operator **=(unsigned u) {
        floating bak = value;
        value = 1;
        for (x in 0..u)
            value *= bak;
    }

    // Comparison operators. Even though NE, LE, and GE are not needed, it's more efficient to have them.
    inline operator ==(floating a, floating b) -> bool => (bool)llvm("fcmp", "oeq", a, b);
    inline operator !=(floating a, floating b) -> bool => (bool)llvm("fcmp", "one", a, b);
    inline operator <(floating a, floating b) -> bool => (bool)llvm("fcmp", "olt", a, b);
    inline operator >(floating a, floating b) -> bool => (bool)llvm("fcmp", "ogt", a, b);
    inline operator <=(floating a, floating b) -> bool => (bool)llvm("fcmp", "ole", a, b);
    inline operator >=(floating a, floating b) -> bool => (bool)llvm("fcmp", "oge", a, b);

    // Other operations. TODO: FIX!!!
    inline operator -(floating f) -> floating => (floating)llvm("fneg", f);
    inline operator ++(floating f) => (floating)llvm("fadd", f, 1);
    inline operator --(floating f) => (floating)llvm("fneg", f, 1);

    // Conversion functions.
    inline implicitcast unsigned(unsigned u) -> floating => (floating)llvm("uitofp", typeof(unsigned), u, typeof(floating));
    inline implicitcast signed(signed s) -> floating => (floating)llvm("sitofp", typeof(signed), s, typeof(floating));

    // TODO: GET STRING!

}