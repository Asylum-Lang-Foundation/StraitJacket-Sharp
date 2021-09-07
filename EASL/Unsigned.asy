// Implementation for unsigned numbers.
impl unsigned {

    // Constructors.
    pub inline This() { value = 0; }
    pub inline This(This v) { value = v; }
    pub inline This(signed s) { value = (This)s; }
    pub inline This(floating f) { value = (This)f; }

    // Classic math operators.
    inline operator +(This a, This b) -> This => (This)llvm("add", a, b);
    inline operator -(This a, This b) -> This => (This)llvm("sub", a, b);
    inline operator *(This a, This b) -> This => (This)llvm("mul", a, b);
    inline operator /(This a, This b) -> This => (This)llvm("udiv", a, b);
    inline operator %(This a, This b) -> This => (This)llvm("urem", a, b);
    inline operator &(This a, This b) -> This => (This)llvm("and", a, b);
    inline operator |(This a, This b) -> This => (This)llvm("or", a, b);
    inline operator ^(This a, This b) -> This => (This)llvm("xor", a, b);
    inline operator ~(This v) -> This => (This)llvm("not", v);
    inline operator +(This v) -> This => value;

    // Value set operators.
    inline operator =(This v) { value = v.value; }
    inline operator +=(This v) { value = value + v; }
    inline operator -=(This v) { value = value - v; }
    inline operator *=(This v) { value = value * v; }
    inline operator /=(This v) { value = value / v; }
    inline operator %=(This v) { value = value % v; }
    inline operator **=(This v) {
        This bak = value;
        value = 1;
        for (x in 0..v)
            value *= bak;
    }
    inline operator &=(This v) { value = value & v; }
    inline operator |=(This v) { value = value | v; }
    inline operator ^=(This v) { value = value ^ v; }

    // Comparison operators. Even though NE, LE, and GE are not needed, it's more efficient to have them.
    inline operator ==(This a, This b) -> bool => (bool)llvm("icmp", "eq", a, b);
    inline operator !=(This a, This b) -> bool => (bool)llvm("icmp", "ne", a, b);
    inline operator <(This a, This b) -> bool => (bool)llvm("icmp", "ult", a, b);
    inline operator >(This a, This b) -> bool => (bool)llvm("icmp", "ugt", a, b);
    inline operator <=(This a, This b) -> bool => (bool)llvm("icmp", "ule", a, b);
    inline operator >=(This a, This b) -> bool => (bool)llvm("icmp", "uge", a, b);

    // Other operations.
    inline operator ++() { value += 1; }
    inline operator --() { value -= 1; }

    // Conversion functions.
    inline explicitcast(signed s) -> This => (This)(object)s;
    inline explicitcast(floating f) -> This => (This)llvm("fptoui", typeof(floating), typeof(This), f);

}