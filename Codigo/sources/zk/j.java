package zk;

import gk.Continuation;
import gk.d;

/* loaded from: classes3.dex */
public final /* synthetic */ class j {
    public static final <T> r0<T> a(k0 k0Var, gk.f fVar, m0 m0Var, ok.p<? super k0, ? super Continuation<? super T>, ? extends Object> pVar) {
        gk.f e10 = g0.e(k0Var, fVar);
        s0 f2Var = m0Var.i() ? new f2(e10, pVar) : new s0(e10, true);
        ((a) f2Var).Q0(m0Var, f2Var, pVar);
        return (r0<T>) f2Var;
    }

    public static /* synthetic */ r0 b(k0 k0Var, gk.f fVar, m0 m0Var, ok.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = gk.g.f16294a;
        }
        if ((i10 & 2) != 0) {
            m0Var = m0.DEFAULT;
        }
        return h.a(k0Var, fVar, m0Var, pVar);
    }

    public static final w1 c(k0 k0Var, gk.f fVar, m0 m0Var, ok.p<? super k0, ? super Continuation<? super ck.v>, ? extends Object> pVar) {
        gk.f e10 = g0.e(k0Var, fVar);
        a g2Var = m0Var.i() ? new g2(e10, pVar) : new o2(e10, true);
        g2Var.Q0(m0Var, g2Var, pVar);
        return g2Var;
    }

    public static /* synthetic */ w1 d(k0 k0Var, gk.f fVar, m0 m0Var, ok.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = gk.g.f16294a;
        }
        if ((i10 & 2) != 0) {
            m0Var = m0.DEFAULT;
        }
        return h.c(k0Var, fVar, m0Var, pVar);
    }

    public static final <T> Object e(gk.f fVar, ok.p<? super k0, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        Object R0;
        Object c10;
        gk.f context = continuation.getContext();
        gk.f d10 = g0.d(context, fVar);
        a2.h(d10);
        if (d10 == context) {
            el.d0 d0Var = new el.d0(d10, continuation);
            R0 = fl.b.b(d0Var, d0Var, pVar);
        } else {
            d.b bVar = gk.d.f16291n;
            if (kotlin.jvm.internal.n.a(d10.b(bVar), context.b(bVar))) {
                z2 z2Var = new z2(d10, continuation);
                gk.f context2 = z2Var.getContext();
                Object c11 = el.l0.c(context2, null);
                try {
                    Object b10 = fl.b.b(z2Var, z2Var, pVar);
                    el.l0.a(context2, c11);
                    R0 = b10;
                } catch (Throwable th2) {
                    el.l0.a(context2, c11);
                    throw th2;
                }
            } else {
                w0 w0Var = new w0(d10, continuation);
                fl.a.d(pVar, w0Var, w0Var, null, 4, null);
                R0 = w0Var.R0();
            }
        }
        c10 = hk.d.c();
        if (R0 == c10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return R0;
    }
}
