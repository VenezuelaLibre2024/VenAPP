package i7;

import t8.n0;
import t8.r0;

/* loaded from: classes.dex */
final class y {

    /* renamed from: c, reason: collision with root package name */
    private boolean f17538c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17539d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17540e;

    /* renamed from: a, reason: collision with root package name */
    private final n0 f17536a = new n0(0);

    /* renamed from: f, reason: collision with root package name */
    private long f17541f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f17542g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f17543h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final t8.e0 f17537b = new t8.e0();

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(y6.l lVar) {
        this.f17537b.R(r0.f26749f);
        this.f17538c = true;
        lVar.f();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(y6.l lVar, y6.y yVar) {
        int min = (int) Math.min(20000L, lVar.getLength());
        long j10 = 0;
        if (lVar.getPosition() != j10) {
            yVar.f31795a = j10;
            return 1;
        }
        this.f17537b.Q(min);
        lVar.f();
        lVar.q(this.f17537b.e(), 0, min);
        this.f17541f = i(this.f17537b);
        this.f17539d = true;
        return 0;
    }

    private long i(t8.e0 e0Var) {
        int g10 = e0Var.g();
        for (int f10 = e0Var.f(); f10 < g10 - 3; f10++) {
            if (f(e0Var.e(), f10) == 442) {
                e0Var.U(f10 + 4);
                long l10 = l(e0Var);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(y6.l lVar, y6.y yVar) {
        long length = lVar.getLength();
        int min = (int) Math.min(20000L, length);
        long j10 = length - min;
        if (lVar.getPosition() != j10) {
            yVar.f31795a = j10;
            return 1;
        }
        this.f17537b.Q(min);
        lVar.f();
        lVar.q(this.f17537b.e(), 0, min);
        this.f17542g = k(this.f17537b);
        this.f17540e = true;
        return 0;
    }

    private long k(t8.e0 e0Var) {
        int f10 = e0Var.f();
        for (int g10 = e0Var.g() - 4; g10 >= f10; g10--) {
            if (f(e0Var.e(), g10) == 442) {
                e0Var.U(g10 + 4);
                long l10 = l(e0Var);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(t8.e0 e0Var) {
        int f10 = e0Var.f();
        if (e0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        e0Var.l(bArr, 0, 9);
        e0Var.U(f10);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((b10 & 56) >> 3) << 30) | ((b10 & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((b11 & 248) >> 3) << 15) | ((b11 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public long c() {
        return this.f17543h;
    }

    public n0 d() {
        return this.f17536a;
    }

    public boolean e() {
        return this.f17538c;
    }

    public int g(y6.l lVar, y6.y yVar) {
        if (!this.f17540e) {
            return j(lVar, yVar);
        }
        if (this.f17542g == -9223372036854775807L) {
            return b(lVar);
        }
        if (!this.f17539d) {
            return h(lVar, yVar);
        }
        long j10 = this.f17541f;
        if (j10 == -9223372036854775807L) {
            return b(lVar);
        }
        long b10 = this.f17536a.b(this.f17542g) - this.f17536a.b(j10);
        this.f17543h = b10;
        if (b10 < 0) {
            t8.s.i("PsDurationReader", "Invalid duration: " + this.f17543h + ". Using TIME_UNSET instead.");
            this.f17543h = -9223372036854775807L;
        }
        return b(lVar);
    }
}
