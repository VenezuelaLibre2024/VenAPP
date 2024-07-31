package p274oe;

import android.content.Context;
import com.google.firebase.perf.application.C6273a;
import com.google.firebase.perf.config.C6277a;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;
import p485zb.AbstractC12878r;
import p485zb.C12867g;

/* renamed from: oe.b */
/* loaded from: classes.dex */
public class C9930b {
    public C9930b(C12867g c12867g, AbstractC12878r abstractC12878r, Executor executor) {
        Context m42630m = c12867g.m42630m();
        C6277a.m17265g().m17283O(m42630m);
        C6273a m17226b = C6273a.m17226b();
        m17226b.m17239i(m42630m);
        m17226b.m17240j(new C9934f());
        if (abstractC12878r != null) {
            AppStartTrace m17370j = AppStartTrace.m17370j();
            m17370j.m17380t(m42630m);
            executor.execute(new AppStartTrace.RunnableC6305c(m17370j));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
