package io.grpc.internal;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class h2 {

    /* renamed from: c */
    public static final h2 f18898c = new h2(new vi.j1[0]);

    /* renamed from: a */
    private final vi.j1[] f18899a;

    /* renamed from: b */
    private final AtomicBoolean f18900b = new AtomicBoolean(false);

    h2(vi.j1[] j1VarArr) {
        this.f18899a = j1VarArr;
    }

    public static h2 h(vi.k[] kVarArr, vi.a aVar, vi.w0 w0Var) {
        h2 h2Var = new h2(kVarArr);
        for (vi.k kVar : kVarArr) {
            kVar.m(aVar, w0Var);
        }
        return h2Var;
    }

    public void a() {
        for (vi.j1 j1Var : this.f18899a) {
            ((vi.k) j1Var).j();
        }
    }

    public void b(vi.w0 w0Var) {
        for (vi.j1 j1Var : this.f18899a) {
            ((vi.k) j1Var).k(w0Var);
        }
    }

    public void c() {
        for (vi.j1 j1Var : this.f18899a) {
            ((vi.k) j1Var).l();
        }
    }

    public void d(int i10) {
        for (vi.j1 j1Var : this.f18899a) {
            j1Var.a(i10);
        }
    }

    public void e(int i10, long j10, long j11) {
        for (vi.j1 j1Var : this.f18899a) {
            j1Var.b(i10, j10, j11);
        }
    }

    public void f(long j10) {
        for (vi.j1 j1Var : this.f18899a) {
            j1Var.c(j10);
        }
    }

    public void g(long j10) {
        for (vi.j1 j1Var : this.f18899a) {
            j1Var.d(j10);
        }
    }

    public void i(int i10) {
        for (vi.j1 j1Var : this.f18899a) {
            j1Var.e(i10);
        }
    }

    public void j(int i10, long j10, long j11) {
        for (vi.j1 j1Var : this.f18899a) {
            j1Var.f(i10, j10, j11);
        }
    }

    public void k(long j10) {
        for (vi.j1 j1Var : this.f18899a) {
            j1Var.g(j10);
        }
    }

    public void l(long j10) {
        for (vi.j1 j1Var : this.f18899a) {
            j1Var.h(j10);
        }
    }

    public void m(vi.g1 g1Var) {
        if (this.f18900b.compareAndSet(false, true)) {
            for (vi.j1 j1Var : this.f18899a) {
                j1Var.i(g1Var);
            }
        }
    }
}
