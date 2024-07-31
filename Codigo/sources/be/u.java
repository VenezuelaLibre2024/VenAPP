package be;

import android.app.Application;

/* loaded from: classes.dex */
public class u {
    public ij.a<String> a(Application application) {
        zd.k0 k0Var = new zd.k0();
        ij.a<String> b10 = k0Var.b();
        b10.K();
        application.registerActivityLifecycleCallbacks(k0Var);
        return b10;
    }
}
