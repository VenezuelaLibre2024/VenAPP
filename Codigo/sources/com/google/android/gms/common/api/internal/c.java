package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    private static final c f9333e = new c();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f9334a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f9335b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f9336c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f9337d = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    private c() {
    }

    public static c b() {
        return f9333e;
    }

    public static void c(Application application) {
        c cVar = f9333e;
        synchronized (cVar) {
            if (!cVar.f9337d) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f9337d = true;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f9333e) {
            Iterator it = this.f9336c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(z10);
            }
        }
    }

    public void a(a aVar) {
        synchronized (f9333e) {
            this.f9336c.add(aVar);
        }
    }

    public boolean d() {
        return this.f9334a.get();
    }

    public boolean e(boolean z10) {
        if (!this.f9335b.get()) {
            if (!la.p.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f9335b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f9334a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f9334a.compareAndSet(true, false);
        this.f9335b.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f9334a.compareAndSet(true, false);
        this.f9335b.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f9334a.compareAndSet(false, true)) {
            this.f9335b.set(true);
            f(true);
        }
    }
}
