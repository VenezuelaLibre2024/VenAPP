package k3;

/* loaded from: classes.dex */
public final class h implements a<int[]> {
    @Override // k3.a
    public String a() {
        return "IntegerArrayPool";
    }

    @Override // k3.a
    public int b() {
        return 4;
    }

    @Override // k3.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(int[] iArr) {
        return iArr.length;
    }

    @Override // k3.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i10) {
        return new int[i10];
    }
}
