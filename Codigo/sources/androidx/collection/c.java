package androidx.collection;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private int[] f2843a;

    /* renamed from: b, reason: collision with root package name */
    private int f2844b;

    /* renamed from: c, reason: collision with root package name */
    private int f2845c;

    /* renamed from: d, reason: collision with root package name */
    private int f2846d;

    public c() {
        this(8);
    }

    public c(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f2846d = i10 - 1;
        this.f2843a = new int[i10];
    }

    private void c() {
        int[] iArr = this.f2843a;
        int length = iArr.length;
        int i10 = this.f2844b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f2843a, 0, iArr2, i11, this.f2844b);
        this.f2843a = iArr2;
        this.f2844b = 0;
        this.f2845c = length;
        this.f2846d = i12 - 1;
    }

    public void a(int i10) {
        int[] iArr = this.f2843a;
        int i11 = this.f2845c;
        iArr[i11] = i10;
        int i12 = this.f2846d & (i11 + 1);
        this.f2845c = i12;
        if (i12 == this.f2844b) {
            c();
        }
    }

    public void b() {
        this.f2845c = this.f2844b;
    }

    public boolean d() {
        return this.f2844b == this.f2845c;
    }

    public int e() {
        int i10 = this.f2844b;
        if (i10 == this.f2845c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f2843a[i10];
        this.f2844b = (i10 + 1) & this.f2846d;
        return i11;
    }
}
