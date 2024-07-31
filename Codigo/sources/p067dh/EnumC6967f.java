package p067dh;

/* renamed from: dh.f */
/* loaded from: classes2.dex */
public enum EnumC6967f {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final EnumC6967f[] FOR_BITS;
    private final int bits;

    static {
        EnumC6967f enumC6967f = L;
        EnumC6967f enumC6967f2 = M;
        EnumC6967f enumC6967f3 = Q;
        FOR_BITS = new EnumC6967f[]{enumC6967f2, enumC6967f, H, enumC6967f3};
    }

    EnumC6967f(int i10) {
        this.bits = i10;
    }

    /* renamed from: b */
    public static EnumC6967f m20145b(int i10) {
        if (i10 >= 0) {
            EnumC6967f[] enumC6967fArr = FOR_BITS;
            if (i10 < enumC6967fArr.length) {
                return enumC6967fArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public int m20146h() {
        return this.bits;
    }
}
