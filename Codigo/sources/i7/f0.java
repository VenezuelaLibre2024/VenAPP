package i7;

import t8.n0;
import t8.r0;

/* loaded from: classes.dex */
final class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f17247a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17250d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17251e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17252f;

    /* renamed from: b, reason: collision with root package name */
    private final n0 f17248b = new n0(0);

    /* renamed from: g, reason: collision with root package name */
    private long f17253g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f17254h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f17255i = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final t8.e0 f17249c = new t8.e0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(int i10) {
        this.f17247a = i10;
    }

    private int a(y6.l lVar) {
        this.f17249c.R(r0.f26749f);
        this.f17250d = true;
        lVar.f();
        return 0;
    }

    private int f(y6.l lVar, y6.y yVar, int i10) {
        int min = (int) Math.min(this.f17247a, lVar.getLength());
        long j10 = 0;
        if (lVar.getPosition() != j10) {
            yVar.f31795a = j10;
            return 1;
        }
        this.f17249c.Q(min);
        lVar.f();
        lVar.q(this.f17249c.e(), 0, min);
        this.f17253g = g(this.f17249c, i10);
        this.f17251e = true;
        return 0;
    }

    private long g(t8.e0 e0Var, int i10) {
        int g10 = e0Var.g();
        for (int f10 = e0Var.f(); f10 < g10; f10++) {
            if (e0Var.e()[f10] == 71) {
                long c10 = j0.c(e0Var, f10, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(y6.l lVar, y6.y yVar, int i10) {
        long length = lVar.getLength();
        int min = (int) Math.min(this.f17247a, length);
        long j10 = length - min;
        if (lVar.getPosition() != j10) {
            yVar.f31795a = j10;
            return 1;
        }
        this.f17249c.Q(min);
        lVar.f();
        lVar.q(this.f17249c.e(), 0, min);
        this.f17254h = i(this.f17249c, i10);
        this.f17252f = true;
        return 0;
    }

    private long i(t8.e0 e0Var, int i10) {
        int f10 = e0Var.f();
        int g10 = e0Var.g();
        for (int i11 = g10 - 188; i11 >= f10; i11--) {
            if (j0.b(e0Var.e(), f10, g10, i11)) {
                long c10 = j0.c(e0Var, i11, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f17255i;
    }

    public n0 c() {
        return this.f17248b;
    }

    public boolean d() {
        return this.f17250d;
    }

    public int e(y6.l lVar, y6.y yVar, int i10) {
        if (i10 <= 0) {
            return a(lVar);
        }
        if (!this.f17252f) {
            return h(lVar, yVar, i10);
        }
        if (this.f17254h == -9223372036854775807L) {
            return a(lVar);
        }
        if (!this.f17251e) {
            return f(lVar, yVar, i10);
        }
        long j10 = this.f17253g;
        if (j10 == -9223372036854775807L) {
            return a(lVar);
        }
        long b10 = this.f17248b.b(this.f17254h) - this.f17248b.b(j10);
        this.f17255i = b10;
        if (b10 < 0) {
            t8.s.i("TsDurationReader", "Invalid duration: " + this.f17255i + ". Using TIME_UNSET instead.");
            this.f17255i = -9223372036854775807L;
        }
        return a(lVar);
    }
}
