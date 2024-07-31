package d8;

import com.google.android.exoplayer2.source.rtsp.h;
import t8.d0;
import t8.e0;
import t8.r0;
import v6.b;
import y6.b0;
import y6.m;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a */
    private final h f13835a;

    /* renamed from: c */
    private b0 f13837c;

    /* renamed from: d */
    private int f13838d;

    /* renamed from: f */
    private long f13840f;

    /* renamed from: g */
    private long f13841g;

    /* renamed from: b */
    private final d0 f13836b = new d0();

    /* renamed from: e */
    private long f13839e = -9223372036854775807L;

    public c(h hVar) {
        this.f13835a = hVar;
    }

    private void e() {
        if (this.f13838d > 0) {
            f();
        }
    }

    private void f() {
        ((b0) r0.j(this.f13837c)).b(this.f13840f, 1, this.f13838d, 0, null);
        this.f13838d = 0;
    }

    private void g(e0 e0Var, boolean z10, int i10, long j10) {
        int a10 = e0Var.a();
        ((b0) t8.a.e(this.f13837c)).a(e0Var, a10);
        this.f13838d += a10;
        this.f13840f = j10;
        if (z10 && i10 == 3) {
            f();
        }
    }

    private void h(e0 e0Var, int i10, long j10) {
        this.f13836b.n(e0Var.e());
        this.f13836b.s(2);
        for (int i11 = 0; i11 < i10; i11++) {
            b.C0458b f10 = v6.b.f(this.f13836b);
            ((b0) t8.a.e(this.f13837c)).a(e0Var, f10.f27955e);
            ((b0) r0.j(this.f13837c)).b(j10, 1, f10.f27955e, 0, null);
            j10 += (f10.f27956f / f10.f27953c) * 1000000;
            this.f13836b.s(f10.f27955e);
        }
    }

    private void i(e0 e0Var, long j10) {
        int a10 = e0Var.a();
        ((b0) t8.a.e(this.f13837c)).a(e0Var, a10);
        ((b0) r0.j(this.f13837c)).b(j10, 1, a10, 0, null);
    }

    private static long j(long j10, long j11, long j12, int i10) {
        return j10 + r0.O0(j11 - j12, 1000000L, i10);
    }

    @Override // d8.e
    public void a(long j10, long j11) {
        this.f13839e = j10;
        this.f13841g = j11;
    }

    @Override // d8.e
    public void b(e0 e0Var, long j10, int i10, boolean z10) {
        int H = e0Var.H() & 3;
        int H2 = e0Var.H() & 255;
        long j11 = j(this.f13841g, j10, this.f13839e, this.f13835a.f8349b);
        if (H == 0) {
            e();
            if (H2 == 1) {
                i(e0Var, j11);
                return;
            } else {
                h(e0Var, H2, j11);
                return;
            }
        }
        if (H == 1 || H == 2) {
            e();
        } else if (H != 3) {
            throw new IllegalArgumentException(String.valueOf(H));
        }
        g(e0Var, z10, H, j11);
    }

    @Override // d8.e
    public void c(m mVar, int i10) {
        b0 d10 = mVar.d(i10, 1);
        this.f13837c = d10;
        d10.c(this.f13835a.f8350c);
    }

    @Override // d8.e
    public void d(long j10, int i10) {
        t8.a.g(this.f13839e == -9223372036854775807L);
        this.f13839e = j10;
    }
}
