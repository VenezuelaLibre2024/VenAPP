package g0;

import java.util.Objects;
import java.util.concurrent.Executor;
import w.i1;

/* loaded from: classes.dex */
public class y0 implements r0 {

    /* renamed from: a */
    private final w.y0 f15693a;

    /* renamed from: b */
    private final Executor f15694b;

    /* renamed from: c */
    private final androidx.core.util.a<Throwable> f15695c;

    public y0(w.k kVar) {
        w.y0 e10 = kVar.e();
        Objects.requireNonNull(e10);
        this.f15693a = e10;
        this.f15694b = kVar.c();
        this.f15695c = kVar.b();
    }

    public /* synthetic */ void f(i1 i1Var) {
        this.f15693a.b(i1Var);
    }

    public /* synthetic */ void g(w.x0 x0Var) {
        this.f15693a.a(x0Var);
    }

    @Override // w.y0
    public void a(w.x0 x0Var) {
        this.f15694b.execute(new Runnable() { // from class: g0.x0

            /* renamed from: b */
            public final /* synthetic */ w.x0 f15689b;

            public /* synthetic */ x0(w.x0 x0Var2) {
                r2 = x0Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y0.this.g(r2);
            }
        });
    }

    @Override // w.y0
    public void b(i1 i1Var) {
        this.f15694b.execute(new Runnable() { // from class: g0.w0

            /* renamed from: b */
            public final /* synthetic */ i1 f15685b;

            public /* synthetic */ w0(i1 i1Var2) {
                r2 = i1Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y0.this.f(r2);
            }
        });
    }

    @Override // g0.r0
    public com.google.common.util.concurrent.f<Void> c(int i10, int i11) {
        return a0.f.f(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    @Override // g0.r0
    public void release() {
    }
}
