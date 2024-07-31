package p487zd;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import dj.EnumC6976a;
import p016ak.C0129a;
import p165ij.AbstractC8003a;

/* renamed from: zd.k0 */
/* loaded from: classes.dex */
public class C12933k0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    private Runnable f35212d;

    /* renamed from: a */
    private final Handler f35209a = new Handler();

    /* renamed from: b */
    private boolean f35210b = false;

    /* renamed from: c */
    private boolean f35211c = true;

    /* renamed from: e */
    private final C0129a<String> f35213e = C0129a.m604w();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m42833c() {
        boolean z10 = this.f35210b;
        this.f35210b = !(z10 && this.f35211c) && z10;
    }

    /* renamed from: b */
    public AbstractC8003a<String> m42834b() {
        return this.f35213e.m20297u(EnumC6976a.BUFFER).m20223C();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f35211c = true;
        Runnable runnable = this.f35212d;
        if (runnable != null) {
            this.f35209a.removeCallbacks(runnable);
        }
        Handler handler = this.f35209a;
        Runnable runnable2 = new Runnable() { // from class: zd.j0
            @Override // java.lang.Runnable
            public final void run() {
                C12933k0.this.m42833c();
            }
        };
        this.f35212d = runnable2;
        handler.postDelayed(runnable2, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f35211c = false;
        boolean z10 = !this.f35210b;
        this.f35210b = true;
        Runnable runnable = this.f35212d;
        if (runnable != null) {
            this.f35209a.removeCallbacks(runnable);
        }
        if (z10) {
            C12940l2.m42842c("went foreground");
            this.f35213e.mo607c("ON_FOREGROUND");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
