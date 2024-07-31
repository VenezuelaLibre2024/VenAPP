package dh;

/* loaded from: classes2.dex */
public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final f[] FOR_BITS;
    private final int bits;

    static {
        f fVar = L;
        f fVar2 = M;
        f fVar3 = Q;
        FOR_BITS = new f[]{fVar2, fVar, H, fVar3};
    }

    f(int i10) {
        this.bits = i10;
    }

    public static f b(int i10) {
        if (i10 >= 0) {
            f[] fVarArr = FOR_BITS;
            if (i10 < fVarArr.length) {
                return fVarArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }

    public int h() {
        return this.bits;
    }
}
