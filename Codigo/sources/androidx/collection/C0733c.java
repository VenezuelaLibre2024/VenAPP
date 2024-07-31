package androidx.collection;

/* renamed from: androidx.collection.c */
/* loaded from: classes.dex */
public final class C0733c {

    /* renamed from: a */
    private int[] f3188a;

    /* renamed from: b */
    private int f3189b;

    /* renamed from: c */
    private int f3190c;

    /* renamed from: d */
    private int f3191d;

    public C0733c() {
        this(8);
    }

    public C0733c(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f3191d = i10 - 1;
        this.f3188a = new int[i10];
    }

    /* renamed from: c */
    private void m3669c() {
        int[] iArr = this.f3188a;
        int length = iArr.length;
        int i10 = this.f3189b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f3188a, 0, iArr2, i11, this.f3189b);
        this.f3188a = iArr2;
        this.f3189b = 0;
        this.f3190c = length;
        this.f3191d = i12 - 1;
    }

    /* renamed from: a */
    public void m3670a(int i10) {
        int[] iArr = this.f3188a;
        int i11 = this.f3190c;
        iArr[i11] = i10;
        int i12 = this.f3191d & (i11 + 1);
        this.f3190c = i12;
        if (i12 == this.f3189b) {
            m3669c();
        }
    }

    /* renamed from: b */
    public void m3671b() {
        this.f3190c = this.f3189b;
    }

    /* renamed from: d */
    public boolean m3672d() {
        return this.f3189b == this.f3190c;
    }

    /* renamed from: e */
    public int m3673e() {
        int i10 = this.f3189b;
        if (i10 == this.f3190c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f3188a[i10];
        this.f3189b = (i10 + 1) & this.f3191d;
        return i11;
    }
}
