package el;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class h {
    public static final void a(gk.f fVar, Throwable th2) {
        Iterator<zk.i0> it = g.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().e(fVar, th2);
            } catch (Throwable th3) {
                g.b(zk.j0.b(th2, th3));
            }
        }
        try {
            ck.b.a(th2, new i(fVar));
        } catch (Throwable unused) {
        }
        g.b(th2);
    }
}
