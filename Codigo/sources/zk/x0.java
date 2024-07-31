package zk;

import ck.n;
import gk.Continuation;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public abstract class x0<T> extends gl.h {

    /* renamed from: c */
    public int f32943c;

    public x0(int i10) {
        this.f32943c = i10;
    }

    public void a(Object obj, Throwable th2) {
    }

    public abstract Continuation<T> b();

    public Throwable e(Object obj) {
        a0 a0Var = obj instanceof a0 ? (a0) obj : null;
        if (a0Var != null) {
            return a0Var.f32837a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(Object obj) {
        return obj;
    }

    public final void h(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            ck.b.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.n.b(th2);
        j0.a(b().getContext(), new n0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object b10;
        Object b11;
        Object b12;
        gl.i iVar = this.f16327b;
        try {
            Continuation<T> b13 = b();
            kotlin.jvm.internal.n.c(b13, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            el.j jVar = (el.j) b13;
            Continuation<T> continuation = jVar.f14775e;
            Object obj = jVar.f14777r;
            gk.f context = continuation.getContext();
            Object c10 = el.l0.c(context, obj);
            z2<?> g10 = c10 != el.l0.f14782a ? g0.g(continuation, context, c10) : null;
            try {
                gk.f context2 = continuation.getContext();
                Object i10 = i();
                Throwable e10 = e(i10);
                w1 w1Var = (e10 == null && y0.b(this.f32943c)) ? (w1) context2.b(w1.f32940q) : null;
                if (w1Var != null && !w1Var.a()) {
                    CancellationException n10 = w1Var.n();
                    a(i10, n10);
                    n.a aVar = ck.n.f7126b;
                    b11 = ck.n.b(ck.o.a(n10));
                } else if (e10 != null) {
                    n.a aVar2 = ck.n.f7126b;
                    b11 = ck.n.b(ck.o.a(e10));
                } else {
                    n.a aVar3 = ck.n.f7126b;
                    b11 = ck.n.b(g(i10));
                }
                continuation.resumeWith(b11);
                ck.v vVar = ck.v.f7137a;
                try {
                    iVar.a();
                    b12 = ck.n.b(ck.v.f7137a);
                } catch (Throwable th2) {
                    n.a aVar4 = ck.n.f7126b;
                    b12 = ck.n.b(ck.o.a(th2));
                }
                h(null, ck.n.d(b12));
            } finally {
                if (g10 == null || g10.R0()) {
                    el.l0.a(context, c10);
                }
            }
        } catch (Throwable th3) {
            try {
                n.a aVar5 = ck.n.f7126b;
                iVar.a();
                b10 = ck.n.b(ck.v.f7137a);
            } catch (Throwable th4) {
                n.a aVar6 = ck.n.f7126b;
                b10 = ck.n.b(ck.o.a(th4));
            }
            h(th3, ck.n.d(b10));
        }
    }
}
