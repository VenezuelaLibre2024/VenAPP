package be;

import android.app.Application;
import p165ij.AbstractC8003a;
import p487zd.C12933k0;

/* renamed from: be.u */
/* loaded from: classes.dex */
public class C1767u {
    /* renamed from: a */
    public AbstractC8003a<String> m9463a(Application application) {
        C12933k0 c12933k0 = new C12933k0();
        AbstractC8003a<String> m42834b = c12933k0.m42834b();
        m42834b.m24580K();
        application.registerActivityLifecycleCallbacks(c12933k0);
        return m42834b;
    }
}
