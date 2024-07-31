package oe;

import android.content.Context;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;
import zb.r;

/* loaded from: classes.dex */
public class b {
    public b(zb.g gVar, r rVar, Executor executor) {
        Context m10 = gVar.m();
        com.google.firebase.perf.config.a.g().O(m10);
        com.google.firebase.perf.application.a b10 = com.google.firebase.perf.application.a.b();
        b10.i(m10);
        b10.j(new f());
        if (rVar != null) {
            AppStartTrace j10 = AppStartTrace.j();
            j10.t(m10);
            executor.execute(new AppStartTrace.c(j10));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
