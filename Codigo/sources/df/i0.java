package df;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class i0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f14069a = new i0();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f14070b;

    /* renamed from: c, reason: collision with root package name */
    private static f0 f14071c;

    private i0() {
    }

    public final void a(f0 f0Var) {
        f14071c = f0Var;
        if (f0Var == null || !f14070b) {
            return;
        }
        f14070b = false;
        f0Var.k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.n.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.n.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.n.e(activity, "activity");
        f0 f0Var = f14071c;
        if (f0Var != null) {
            f0Var.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        ck.v vVar;
        kotlin.jvm.internal.n.e(activity, "activity");
        f0 f0Var = f14071c;
        if (f0Var != null) {
            f0Var.k();
            vVar = ck.v.f7137a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            f14070b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.n.e(activity, "activity");
        kotlin.jvm.internal.n.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.n.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.n.e(activity, "activity");
    }
}
