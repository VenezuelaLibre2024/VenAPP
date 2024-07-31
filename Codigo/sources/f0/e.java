package f0;

import androidx.camera.core.impl.n;
import androidx.camera.core.impl.p;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.t;
import androidx.camera.core.o;
import w.h0;

/* loaded from: classes.dex */
public final class e extends a<o> {
    public e(int i10, c<o> cVar) {
        super(i10, cVar);
    }

    private boolean e(h0 h0Var) {
        s a10 = t.a(h0Var);
        return (a10.f() == p.LOCKED_FOCUSED || a10.f() == p.PASSIVE_FOCUSED) && a10.h() == n.CONVERGED && a10.g() == q.CONVERGED;
    }

    public void d(o oVar) {
        if (e(oVar.e1())) {
            super.b(oVar);
        } else {
            this.f14846d.a(oVar);
        }
    }
}
