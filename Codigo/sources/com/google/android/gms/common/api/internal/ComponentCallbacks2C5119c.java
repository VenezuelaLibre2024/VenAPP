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
import la.C9471p;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C5119c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e */
    private static final ComponentCallbacks2C5119c f10441e = new ComponentCallbacks2C5119c();

    /* renamed from: a */
    private final AtomicBoolean f10442a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f10443b = new AtomicBoolean();

    /* renamed from: c */
    private final ArrayList f10444c = new ArrayList();

    /* renamed from: d */
    private boolean f10445d = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo13016a(boolean z10);
    }

    private ComponentCallbacks2C5119c() {
    }

    /* renamed from: b */
    public static ComponentCallbacks2C5119c m13010b() {
        return f10441e;
    }

    /* renamed from: c */
    public static void m13011c(Application application) {
        ComponentCallbacks2C5119c componentCallbacks2C5119c = f10441e;
        synchronized (componentCallbacks2C5119c) {
            if (!componentCallbacks2C5119c.f10445d) {
                application.registerActivityLifecycleCallbacks(componentCallbacks2C5119c);
                application.registerComponentCallbacks(componentCallbacks2C5119c);
                componentCallbacks2C5119c.f10445d = true;
            }
        }
    }

    /* renamed from: f */
    private final void m13012f(boolean z10) {
        synchronized (f10441e) {
            Iterator it = this.f10444c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).mo13016a(z10);
            }
        }
    }

    /* renamed from: a */
    public void m13013a(a aVar) {
        synchronized (f10441e) {
            this.f10444c.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean m13014d() {
        return this.f10442a.get();
    }

    /* renamed from: e */
    public boolean m13015e(boolean z10) {
        if (!this.f10443b.get()) {
            if (!C9471p.m28165b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f10443b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f10442a.set(true);
            }
        }
        return m13014d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f10442a.compareAndSet(true, false);
        this.f10443b.set(true);
        if (compareAndSet) {
            m13012f(false);
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
        boolean compareAndSet = this.f10442a.compareAndSet(true, false);
        this.f10443b.set(true);
        if (compareAndSet) {
            m13012f(false);
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
        if (i10 == 20 && this.f10442a.compareAndSet(false, true)) {
            this.f10443b.set(true);
            m13012f(true);
        }
    }
}
