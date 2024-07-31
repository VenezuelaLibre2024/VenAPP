package zk;

import gk.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final /* synthetic */ class i {
    public static final <T> T a(gk.f fVar, ok.p<? super k0, ? super Continuation<? super T>, ? extends Object> pVar) {
        g1 a10;
        p1 p1Var;
        Thread currentThread = Thread.currentThread();
        gk.d dVar = (gk.d) fVar.b(gk.d.f16291n);
        if (dVar == null) {
            a10 = s2.f32928a.b();
            p1Var = p1.f32921a;
            fVar = fVar.U(a10);
        } else {
            g1 g1Var = dVar instanceof g1 ? (g1) dVar : null;
            if (g1Var != null) {
                g1 g1Var2 = g1Var.q1() ? g1Var : null;
                if (g1Var2 != null) {
                    a10 = g1Var2;
                    p1Var = p1.f32921a;
                }
            }
            a10 = s2.f32928a.a();
            p1Var = p1.f32921a;
        }
        f fVar2 = new f(g0.e(p1Var, fVar), currentThread, a10);
        fVar2.Q0(m0.DEFAULT, fVar2, pVar);
        return (T) fVar2.R0();
    }

    public static /* synthetic */ Object b(gk.f fVar, ok.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = gk.g.f16294a;
        }
        return h.e(fVar, pVar);
    }
}
