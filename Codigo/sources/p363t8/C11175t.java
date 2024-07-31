package p363t8;

import java.util.Arrays;

/* renamed from: t8.t */
/* loaded from: classes.dex */
public final class C11175t {

    /* renamed from: a */
    private int f29060a;

    /* renamed from: b */
    private long[] f29061b;

    public C11175t() {
        this(32);
    }

    public C11175t(int i10) {
        this.f29061b = new long[i10];
    }

    /* renamed from: a */
    public void m34984a(long j10) {
        int i10 = this.f29060a;
        long[] jArr = this.f29061b;
        if (i10 == jArr.length) {
            this.f29061b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f29061b;
        int i11 = this.f29060a;
        this.f29060a = i11 + 1;
        jArr2[i11] = j10;
    }

    /* renamed from: b */
    public long m34985b(int i10) {
        if (i10 >= 0 && i10 < this.f29060a) {
            return this.f29061b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f29060a);
    }

    /* renamed from: c */
    public int m34986c() {
        return this.f29060a;
    }

    /* renamed from: d */
    public long[] m34987d() {
        return Arrays.copyOf(this.f29061b, this.f29060a);
    }
}
