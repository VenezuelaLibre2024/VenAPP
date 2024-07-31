package p078e7;

import p459y6.InterfaceC12622l;

/* renamed from: e7.g */
/* loaded from: classes.dex */
final class C7133g {

    /* renamed from: d */
    private static final long[] f16003d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f16004a = new byte[8];

    /* renamed from: b */
    private int f16005b;

    /* renamed from: c */
    private int f16006c;

    /* renamed from: a */
    public static long m21146a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f16003d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    /* renamed from: c */
    public static int m21147c(int i10) {
        long j10;
        int i11 = 0;
        do {
            long[] jArr = f16003d;
            if (i11 >= jArr.length) {
                return -1;
            }
            j10 = jArr[i11] & i10;
            i11++;
        } while (j10 == 0);
        return i11;
    }

    /* renamed from: b */
    public int m21148b() {
        return this.f16006c;
    }

    /* renamed from: d */
    public long m21149d(InterfaceC12622l interfaceC12622l, boolean z10, boolean z11, int i10) {
        if (this.f16005b == 0) {
            if (!interfaceC12622l.mo41535g(this.f16004a, 0, 1, z10)) {
                return -1L;
            }
            int m21147c = m21147c(this.f16004a[0] & 255);
            this.f16006c = m21147c;
            if (m21147c == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f16005b = 1;
        }
        int i11 = this.f16006c;
        if (i11 > i10) {
            this.f16005b = 0;
            return -2L;
        }
        if (i11 != 1) {
            interfaceC12622l.readFully(this.f16004a, 1, i11 - 1);
        }
        this.f16005b = 0;
        return m21146a(this.f16004a, this.f16006c, z11);
    }

    /* renamed from: e */
    public void m21150e() {
        this.f16005b = 0;
        this.f16006c = 0;
    }
}
