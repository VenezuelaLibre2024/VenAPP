package p448xi;

/* renamed from: xi.i */
/* loaded from: classes3.dex */
public final class C12496i {

    /* renamed from: a */
    private int f33896a;

    /* renamed from: b */
    private int f33897b;

    /* renamed from: c */
    private int f33898c;

    /* renamed from: d */
    private final int[] f33899d = new int[10];

    /* renamed from: a */
    public int m40915a(int i10) {
        return this.f33899d[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m40916b() {
        if ((this.f33896a & 2) != 0) {
            return this.f33899d[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m40917c(int i10) {
        return (this.f33896a & 32) != 0 ? this.f33899d[5] : i10;
    }

    /* renamed from: d */
    public boolean m40918d(int i10) {
        return ((1 << i10) & this.f33896a) != 0;
    }

    /* renamed from: e */
    public C12496i m40919e(int i10, int i11, int i12) {
        int[] iArr = this.f33899d;
        if (i10 >= iArr.length) {
            return this;
        }
        int i13 = 1 << i10;
        this.f33896a |= i13;
        this.f33897b = (i11 & 1) != 0 ? this.f33897b | i13 : this.f33897b & (~i13);
        this.f33898c = (i11 & 2) != 0 ? this.f33898c | i13 : this.f33898c & (~i13);
        iArr[i10] = i12;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m40920f() {
        return Integer.bitCount(this.f33896a);
    }
}
