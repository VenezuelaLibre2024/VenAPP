package zd;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public class k0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    private Runnable f32661d;

    /* renamed from: a */
    private final Handler f32658a = new Handler();

    /* renamed from: b */
    private boolean f32659b = false;

    /* renamed from: c */
    private boolean f32660c = true;

    /* renamed from: e */
    private final ak.a<String> f32662e = ak.a.w();

    public /* synthetic */ void c() {
        boolean z10 = this.f32659b;
        this.f32659b = !(z10 && this.f32660c) && z10;
    }

    public ij.a<String> b() {
        return this.f32662e.u(dj.a.BUFFER).C();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f32660c = true;
        Runnable runnable = this.f32661d;
        if (runnable != null) {
            this.f32658a.removeCallbacks(runnable);
        }
        Handler handler = this.f32658a;
        j0 j0Var = new Runnable() { // from class: zd.j0
            public /* synthetic */ j0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                k0.this.c();
            }
        };
        this.f32661d = j0Var;
        handler.postDelayed(j0Var, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f32660c = false;
        boolean z10 = !this.f32659b;
        this.f32659b = true;
        Runnable runnable = this.f32661d;
        if (runnable != null) {
            this.f32658a.removeCallbacks(runnable);
        }
        if (z10) {
            l2.c("went foreground");
            this.f32662e.c("ON_FOREGROUND");
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
