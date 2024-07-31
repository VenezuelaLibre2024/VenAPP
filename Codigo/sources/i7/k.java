package i7;

import i7.i0;
import t6.u1;
import v6.p0;

/* loaded from: classes.dex */
public final class k implements m {

    /* renamed from: b, reason: collision with root package name */
    private final String f17333b;

    /* renamed from: c, reason: collision with root package name */
    private String f17334c;

    /* renamed from: d, reason: collision with root package name */
    private y6.b0 f17335d;

    /* renamed from: f, reason: collision with root package name */
    private int f17337f;

    /* renamed from: g, reason: collision with root package name */
    private int f17338g;

    /* renamed from: h, reason: collision with root package name */
    private long f17339h;

    /* renamed from: i, reason: collision with root package name */
    private u1 f17340i;

    /* renamed from: j, reason: collision with root package name */
    private int f17341j;

    /* renamed from: a, reason: collision with root package name */
    private final t8.e0 f17332a = new t8.e0(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    private int f17336e = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f17342k = -9223372036854775807L;

    public k(String str) {
        this.f17333b = str;
    }

    private boolean a(t8.e0 e0Var, byte[] bArr, int i10) {
        int min = Math.min(e0Var.a(), i10 - this.f17337f);
        e0Var.l(bArr, this.f17337f, min);
        int i11 = this.f17337f + min;
        this.f17337f = i11;
        return i11 == i10;
    }

    private void g() {
        byte[] e10 = this.f17332a.e();
        if (this.f17340i == null) {
            u1 g10 = p0.g(e10, this.f17334c, this.f17333b, null);
            this.f17340i = g10;
            this.f17335d.c(g10);
        }
        this.f17341j = p0.a(e10);
        this.f17339h = (int) ((p0.f(e10) * 1000000) / this.f17340i.K);
    }

    private boolean h(t8.e0 e0Var) {
        while (e0Var.a() > 0) {
            int i10 = this.f17338g << 8;
            this.f17338g = i10;
            int H = i10 | e0Var.H();
            this.f17338g = H;
            if (p0.d(H)) {
                byte[] e10 = this.f17332a.e();
                int i11 = this.f17338g;
                e10[0] = (byte) ((i11 >> 24) & 255);
                e10[1] = (byte) ((i11 >> 16) & 255);
                e10[2] = (byte) ((i11 >> 8) & 255);
                e10[3] = (byte) (i11 & 255);
                this.f17337f = 4;
                this.f17338g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // i7.m
    public void b(t8.e0 e0Var) {
        t8.a.i(this.f17335d);
        while (e0Var.a() > 0) {
            int i10 = this.f17336e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(e0Var.a(), this.f17341j - this.f17337f);
                    this.f17335d.a(e0Var, min);
                    int i11 = this.f17337f + min;
                    this.f17337f = i11;
                    int i12 = this.f17341j;
                    if (i11 == i12) {
                        long j10 = this.f17342k;
                        if (j10 != -9223372036854775807L) {
                            this.f17335d.b(j10, 1, i12, 0, null);
                            this.f17342k += this.f17339h;
                        }
                        this.f17336e = 0;
                    }
                } else if (a(e0Var, this.f17332a.e(), 18)) {
                    g();
                    this.f17332a.U(0);
                    this.f17335d.a(this.f17332a, 18);
                    this.f17336e = 2;
                }
            } else if (h(e0Var)) {
                this.f17336e = 1;
            }
        }
    }

    @Override // i7.m
    public void c() {
        this.f17336e = 0;
        this.f17337f = 0;
        this.f17338g = 0;
        this.f17342k = -9223372036854775807L;
    }

    @Override // i7.m
    public void d(y6.m mVar, i0.d dVar) {
        dVar.a();
        this.f17334c = dVar.b();
        this.f17335d = mVar.d(dVar.c(), 1);
    }

    @Override // i7.m
    public void e() {
    }

    @Override // i7.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f17342k = j10;
        }
    }
}
