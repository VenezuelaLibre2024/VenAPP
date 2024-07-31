package e7;

import y6.l;

/* loaded from: classes.dex */
final class g {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f14580d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14581a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f14582b;

    /* renamed from: c, reason: collision with root package name */
    private int f14583c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f14580d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        long j10;
        int i11 = 0;
        do {
            long[] jArr = f14580d;
            if (i11 >= jArr.length) {
                return -1;
            }
            j10 = jArr[i11] & i10;
            i11++;
        } while (j10 == 0);
        return i11;
    }

    public int b() {
        return this.f14583c;
    }

    public long d(l lVar, boolean z10, boolean z11, int i10) {
        if (this.f14582b == 0) {
            if (!lVar.g(this.f14581a, 0, 1, z10)) {
                return -1L;
            }
            int c10 = c(this.f14581a[0] & 255);
            this.f14583c = c10;
            if (c10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f14582b = 1;
        }
        int i11 = this.f14583c;
        if (i11 > i10) {
            this.f14582b = 0;
            return -2L;
        }
        if (i11 != 1) {
            lVar.readFully(this.f14581a, 1, i11 - 1);
        }
        this.f14582b = 0;
        return a(this.f14581a, this.f14583c, z11);
    }

    public void e() {
        this.f14582b = 0;
        this.f14583c = 0;
    }
}
