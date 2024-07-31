package zk;

import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 {
    public static final y a(w1 w1Var) {
        return new z1(w1Var);
    }

    public static /* synthetic */ y b(w1 w1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            w1Var = null;
        }
        return a2.a(w1Var);
    }

    public static final void c(gk.f fVar, CancellationException cancellationException) {
        w1 w1Var = (w1) fVar.b(w1.f32940q);
        if (w1Var != null) {
            w1Var.O(cancellationException);
        }
    }

    public static /* synthetic */ void d(gk.f fVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        a2.c(fVar, cancellationException);
    }

    public static final void e(gk.f fVar, CancellationException cancellationException) {
        wk.d<w1> i10;
        w1 w1Var = (w1) fVar.b(w1.f32940q);
        if (w1Var == null || (i10 = w1Var.i()) == null) {
            return;
        }
        Iterator<w1> it = i10.iterator();
        while (it.hasNext()) {
            it.next().O(cancellationException);
        }
    }

    public static /* synthetic */ void f(gk.f fVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        a2.e(fVar, cancellationException);
    }

    public static final c1 g(w1 w1Var, c1 c1Var) {
        return w1Var.R(new e1(c1Var));
    }

    public static final void h(gk.f fVar) {
        w1 w1Var = (w1) fVar.b(w1.f32940q);
        if (w1Var != null) {
            a2.i(w1Var);
        }
    }

    public static final void i(w1 w1Var) {
        if (!w1Var.a()) {
            throw w1Var.n();
        }
    }

    public static final w1 j(gk.f fVar) {
        w1 w1Var = (w1) fVar.b(w1.f32940q);
        if (w1Var != null) {
            return w1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + fVar).toString());
    }
}
