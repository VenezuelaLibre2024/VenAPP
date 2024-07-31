package xi;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private int f31376a;

    /* renamed from: b, reason: collision with root package name */
    private int f31377b;

    /* renamed from: c, reason: collision with root package name */
    private int f31378c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f31379d = new int[10];

    public int a(int i10) {
        return this.f31379d[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        if ((this.f31376a & 2) != 0) {
            return this.f31379d[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i10) {
        return (this.f31376a & 32) != 0 ? this.f31379d[5] : i10;
    }

    public boolean d(int i10) {
        return ((1 << i10) & this.f31376a) != 0;
    }

    public i e(int i10, int i11, int i12) {
        int[] iArr = this.f31379d;
        if (i10 >= iArr.length) {
            return this;
        }
        int i13 = 1 << i10;
        this.f31376a |= i13;
        this.f31377b = (i11 & 1) != 0 ? this.f31377b | i13 : this.f31377b & (~i13);
        this.f31378c = (i11 & 2) != 0 ? this.f31378c | i13 : this.f31378c & (~i13);
        iArr[i10] = i12;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return Integer.bitCount(this.f31376a);
    }
}
