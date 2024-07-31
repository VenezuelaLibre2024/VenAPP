package p065df;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import ck.C2037v;
import kotlin.jvm.internal.C9322n;

/* renamed from: df.i0 */
/* loaded from: classes2.dex */
public final class C6920i0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static final C6920i0 f15423a = new C6920i0();

    /* renamed from: b */
    private static boolean f15424b;

    /* renamed from: c */
    private static C6914f0 f15425c;

    private C6920i0() {
    }

    /* renamed from: a */
    public final void m20035a(C6914f0 c6914f0) {
        f15425c = c6914f0;
        if (c6914f0 == null || !f15424b) {
            return;
        }
        f15424b = false;
        c6914f0.m20027k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C9322n.m27781e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C9322n.m27781e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C9322n.m27781e(activity, "activity");
        C6914f0 c6914f0 = f15425c;
        if (c6914f0 != null) {
            c6914f0.m20025h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C2037v c2037v;
        C9322n.m27781e(activity, "activity");
        C6914f0 c6914f0 = f15425c;
        if (c6914f0 != null) {
            c6914f0.m20027k();
            c2037v = C2037v.f8089a;
        } else {
            c2037v = null;
        }
        if (c2037v == null) {
            f15424b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        C9322n.m27781e(activity, "activity");
        C9322n.m27781e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C9322n.m27781e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C9322n.m27781e(activity, "activity");
    }
}
