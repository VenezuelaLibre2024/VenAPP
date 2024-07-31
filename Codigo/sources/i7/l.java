package i7;

import i7.i0;
import java.util.Collections;
import java.util.List;
import t6.u1;

/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    private final List<i0.a> f17345a;

    /* renamed from: b, reason: collision with root package name */
    private final y6.b0[] f17346b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17347c;

    /* renamed from: d, reason: collision with root package name */
    private int f17348d;

    /* renamed from: e, reason: collision with root package name */
    private int f17349e;

    /* renamed from: f, reason: collision with root package name */
    private long f17350f = -9223372036854775807L;

    public l(List<i0.a> list) {
        this.f17345a = list;
        this.f17346b = new y6.b0[list.size()];
    }

    private boolean a(t8.e0 e0Var, int i10) {
        if (e0Var.a() == 0) {
            return false;
        }
        if (e0Var.H() != i10) {
            this.f17347c = false;
        }
        this.f17348d--;
        return this.f17347c;
    }

    @Override // i7.m
    public void b(t8.e0 e0Var) {
        if (this.f17347c) {
            if (this.f17348d != 2 || a(e0Var, 32)) {
                if (this.f17348d != 1 || a(e0Var, 0)) {
                    int f10 = e0Var.f();
                    int a10 = e0Var.a();
                    for (y6.b0 b0Var : this.f17346b) {
                        e0Var.U(f10);
                        b0Var.a(e0Var, a10);
                    }
                    this.f17349e += a10;
                }
            }
        }
    }

    @Override // i7.m
    public void c() {
        this.f17347c = false;
        this.f17350f = -9223372036854775807L;
    }

    @Override // i7.m
    public void d(y6.m mVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f17346b.length; i10++) {
            i0.a aVar = this.f17345a.get(i10);
            dVar.a();
            y6.b0 d10 = mVar.d(dVar.c(), 3);
            d10.c(new u1.b().U(dVar.b()).g0("application/dvbsubs").V(Collections.singletonList(aVar.f17320c)).X(aVar.f17318a).G());
            this.f17346b[i10] = d10;
        }
    }

    @Override // i7.m
    public void e() {
        if (this.f17347c) {
            if (this.f17350f != -9223372036854775807L) {
                for (y6.b0 b0Var : this.f17346b) {
                    b0Var.b(this.f17350f, 1, this.f17349e, 0, null);
                }
            }
            this.f17347c = false;
        }
    }

    @Override // i7.m
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f17347c = true;
        if (j10 != -9223372036854775807L) {
            this.f17350f = j10;
        }
        this.f17349e = 0;
        this.f17348d = 2;
    }
}
