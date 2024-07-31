package zk;

import gk.Continuation;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class l0 {
    public static final k0 a(gk.f fVar) {
        y b10;
        if (fVar.b(w1.f32940q) == null) {
            b10 = b2.b(null, 1, null);
            fVar = fVar.U(b10);
        }
        return new el.f(fVar);
    }

    public static final k0 b() {
        return new el.f(q2.b(null, 1, null).U(a1.c()));
    }

    public static final void c(k0 k0Var, CancellationException cancellationException) {
        w1 w1Var = (w1) k0Var.h().b(w1.f32940q);
        if (w1Var != null) {
            w1Var.O(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + k0Var).toString());
    }

    public static /* synthetic */ void d(k0 k0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(k0Var, cancellationException);
    }

    public static final <R> Object e(ok.p<? super k0, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        Object c10;
        el.d0 d0Var = new el.d0(continuation.getContext(), continuation);
        Object b10 = fl.b.b(d0Var, d0Var, pVar);
        c10 = hk.d.c();
        if (b10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return b10;
    }

    public static final void f(k0 k0Var) {
        a2.h(k0Var.h());
    }

    public static final boolean g(k0 k0Var) {
        w1 w1Var = (w1) k0Var.h().b(w1.f32940q);
        if (w1Var != null) {
            return w1Var.a();
        }
        return true;
    }
}
