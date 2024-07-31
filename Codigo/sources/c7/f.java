package c7;

import c7.e;
import t6.u1;
import t8.e0;
import t8.x;
import y6.b0;

/* loaded from: classes.dex */
final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    private final e0 f6896b;

    /* renamed from: c, reason: collision with root package name */
    private final e0 f6897c;

    /* renamed from: d, reason: collision with root package name */
    private int f6898d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6899e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6900f;

    /* renamed from: g, reason: collision with root package name */
    private int f6901g;

    public f(b0 b0Var) {
        super(b0Var);
        this.f6896b = new e0(x.f26773a);
        this.f6897c = new e0(4);
    }

    @Override // c7.e
    protected boolean b(e0 e0Var) {
        int H = e0Var.H();
        int i10 = (H >> 4) & 15;
        int i11 = H & 15;
        if (i11 == 7) {
            this.f6901g = i10;
            return i10 != 5;
        }
        throw new e.a("Video format not supported: " + i11);
    }

    @Override // c7.e
    protected boolean c(e0 e0Var, long j10) {
        int H = e0Var.H();
        long r10 = j10 + (e0Var.r() * 1000);
        if (H == 0 && !this.f6899e) {
            e0 e0Var2 = new e0(new byte[e0Var.a()]);
            e0Var.l(e0Var2.e(), 0, e0Var.a());
            u8.a b10 = u8.a.b(e0Var2);
            this.f6898d = b10.f27335b;
            this.f6895a.c(new u1.b().g0("video/avc").K(b10.f27339f).n0(b10.f27336c).S(b10.f27337d).c0(b10.f27338e).V(b10.f27334a).G());
            this.f6899e = true;
            return false;
        }
        if (H != 1 || !this.f6899e) {
            return false;
        }
        int i10 = this.f6901g == 1 ? 1 : 0;
        if (!this.f6900f && i10 == 0) {
            return false;
        }
        byte[] e10 = this.f6897c.e();
        e10[0] = 0;
        e10[1] = 0;
        e10[2] = 0;
        int i11 = 4 - this.f6898d;
        int i12 = 0;
        while (e0Var.a() > 0) {
            e0Var.l(this.f6897c.e(), i11, this.f6898d);
            this.f6897c.U(0);
            int L = this.f6897c.L();
            this.f6896b.U(0);
            this.f6895a.a(this.f6896b, 4);
            this.f6895a.a(e0Var, L);
            i12 = i12 + 4 + L;
        }
        this.f6895a.b(r10, i10, i12, 0, null);
        this.f6900f = true;
        return true;
    }
}
