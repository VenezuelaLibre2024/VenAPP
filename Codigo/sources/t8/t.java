package t8;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private int f26764a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f26765b;

    public t() {
        this(32);
    }

    public t(int i10) {
        this.f26765b = new long[i10];
    }

    public void a(long j10) {
        int i10 = this.f26764a;
        long[] jArr = this.f26765b;
        if (i10 == jArr.length) {
            this.f26765b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f26765b;
        int i11 = this.f26764a;
        this.f26764a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f26764a) {
            return this.f26765b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f26764a);
    }

    public int c() {
        return this.f26764a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f26765b, this.f26764a);
    }
}
