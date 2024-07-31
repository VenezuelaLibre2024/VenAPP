package el;

import java.util.List;
import zk.h2;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a */
    private static final boolean f14823a = true;

    private static final y a(Throwable th2, String str) {
        if (f14823a) {
            return new y(th2, str);
        }
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new ck.e();
    }

    public static /* synthetic */ y b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(h2 h2Var) {
        return h2Var.I0() instanceof y;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final h2 e(v vVar, List<? extends v> list) {
        try {
            return vVar.b(list);
        } catch (Throwable th2) {
            return a(th2, vVar.a());
        }
    }
}
