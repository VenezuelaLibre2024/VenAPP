package zk;

import ck.n;
import gk.Continuation;

/* loaded from: classes3.dex */
public final class y0 {
    public static final <T> void a(x0<? super T> x0Var, int i10) {
        Continuation<? super T> b10 = x0Var.b();
        boolean z10 = i10 == 4;
        if (z10 || !(b10 instanceof el.j) || b(i10) != b(x0Var.f32943c)) {
            d(x0Var, b10, z10);
            return;
        }
        h0 h0Var = ((el.j) b10).f14774d;
        gk.f context = b10.getContext();
        if (h0Var.F0(context)) {
            h0Var.D0(context, x0Var);
        } else {
            e(x0Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(x0<? super T> x0Var, Continuation<? super T> continuation, boolean z10) {
        Object g10;
        Object i10 = x0Var.i();
        Throwable e10 = x0Var.e(i10);
        if (e10 != null) {
            n.a aVar = ck.n.f7126b;
            g10 = ck.o.a(e10);
        } else {
            n.a aVar2 = ck.n.f7126b;
            g10 = x0Var.g(i10);
        }
        Object b10 = ck.n.b(g10);
        if (!z10) {
            continuation.resumeWith(b10);
            return;
        }
        kotlin.jvm.internal.n.c(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        el.j jVar = (el.j) continuation;
        Continuation<T> continuation2 = jVar.f14775e;
        Object obj = jVar.f14777r;
        gk.f context = continuation2.getContext();
        Object c10 = el.l0.c(context, obj);
        z2<?> g11 = c10 != el.l0.f14782a ? g0.g(continuation2, context, c10) : null;
        try {
            jVar.f14775e.resumeWith(b10);
            ck.v vVar = ck.v.f7137a;
        } finally {
            if (g11 == null || g11.R0()) {
                el.l0.a(context, c10);
            }
        }
    }

    private static final void e(x0<?> x0Var) {
        g1 b10 = s2.f32928a.b();
        if (b10.a1()) {
            b10.R0(x0Var);
            return;
        }
        b10.W0(true);
        try {
            d(x0Var, x0Var.b(), true);
            do {
            } while (b10.j1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
