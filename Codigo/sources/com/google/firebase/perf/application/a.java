package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.util.j;
import com.google.firebase.perf.util.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import se.f;
import we.k;
import xe.m;

/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    private static final re.a C = re.a.e();
    private static volatile a D;
    private boolean A;
    private boolean B;

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Activity, Boolean> f12220a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<Activity, d> f12221b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap<Activity, c> f12222c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Activity, Trace> f12223d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Long> f12224e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<WeakReference<b>> f12225f;

    /* renamed from: r, reason: collision with root package name */
    private Set<InterfaceC0178a> f12226r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicInteger f12227s;

    /* renamed from: t, reason: collision with root package name */
    private final k f12228t;

    /* renamed from: u, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f12229u;

    /* renamed from: v, reason: collision with root package name */
    private final com.google.firebase.perf.util.a f12230v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f12231w;

    /* renamed from: x, reason: collision with root package name */
    private l f12232x;

    /* renamed from: y, reason: collision with root package name */
    private l f12233y;

    /* renamed from: z, reason: collision with root package name */
    private xe.d f12234z;

    /* renamed from: com.google.firebase.perf.application.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0178a {
        void a();
    }

    /* loaded from: classes.dex */
    public interface b {
        void onUpdateAppState(xe.d dVar);
    }

    a(k kVar, com.google.firebase.perf.util.a aVar) {
        this(kVar, aVar, com.google.firebase.perf.config.a.g(), g());
    }

    a(k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, boolean z10) {
        this.f12220a = new WeakHashMap<>();
        this.f12221b = new WeakHashMap<>();
        this.f12222c = new WeakHashMap<>();
        this.f12223d = new WeakHashMap<>();
        this.f12224e = new HashMap();
        this.f12225f = new HashSet();
        this.f12226r = new HashSet();
        this.f12227s = new AtomicInteger(0);
        this.f12234z = xe.d.BACKGROUND;
        this.A = false;
        this.B = true;
        this.f12228t = kVar;
        this.f12230v = aVar;
        this.f12229u = aVar2;
        this.f12231w = z10;
    }

    public static a b() {
        if (D == null) {
            synchronized (a.class) {
                if (D == null) {
                    D = new a(k.k(), new com.google.firebase.perf.util.a());
                }
            }
        }
        return D;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private static boolean g() {
        return d.a();
    }

    private void l() {
        synchronized (this.f12226r) {
            for (InterfaceC0178a interfaceC0178a : this.f12226r) {
                if (interfaceC0178a != null) {
                    interfaceC0178a.a();
                }
            }
        }
    }

    private void m(Activity activity) {
        Trace trace = this.f12223d.get(activity);
        if (trace == null) {
            return;
        }
        this.f12223d.remove(activity);
        g<f.a> e10 = this.f12221b.get(activity).e();
        if (!e10.d()) {
            C.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            j.a(trace, e10.c());
            trace.stop();
        }
    }

    private void n(String str, l lVar, l lVar2) {
        if (this.f12229u.K()) {
            m.b K = m.H0().T(str).R(lVar.e()).S(lVar.d(lVar2)).K(SessionManager.getInstance().perfSession().a());
            int andSet = this.f12227s.getAndSet(0);
            synchronized (this.f12224e) {
                K.M(this.f12224e);
                if (andSet != 0) {
                    K.O(com.google.firebase.perf.util.b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                this.f12224e.clear();
            }
            this.f12228t.C(K.build(), xe.d.FOREGROUND_BACKGROUND);
        }
    }

    private void o(Activity activity) {
        if (h() && this.f12229u.K()) {
            d dVar = new d(activity);
            this.f12221b.put(activity, dVar);
            if (activity instanceof e) {
                c cVar = new c(this.f12230v, this.f12228t, this, dVar);
                this.f12222c.put(activity, cVar);
                ((e) activity).getSupportFragmentManager().a1(cVar, true);
            }
        }
    }

    private void q(xe.d dVar) {
        this.f12234z = dVar;
        synchronized (this.f12225f) {
            Iterator<WeakReference<b>> it = this.f12225f.iterator();
            while (it.hasNext()) {
                b bVar = it.next().get();
                if (bVar != null) {
                    bVar.onUpdateAppState(this.f12234z);
                } else {
                    it.remove();
                }
            }
        }
    }

    public xe.d a() {
        return this.f12234z;
    }

    public void d(String str, long j10) {
        synchronized (this.f12224e) {
            Long l10 = this.f12224e.get(str);
            if (l10 == null) {
                this.f12224e.put(str, Long.valueOf(j10));
            } else {
                this.f12224e.put(str, Long.valueOf(l10.longValue() + j10));
            }
        }
    }

    public void e(int i10) {
        this.f12227s.addAndGet(i10);
    }

    public boolean f() {
        return this.B;
    }

    protected boolean h() {
        return this.f12231w;
    }

    public synchronized void i(Context context) {
        if (this.A) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.A = true;
        }
    }

    public void j(InterfaceC0178a interfaceC0178a) {
        synchronized (this.f12226r) {
            this.f12226r.add(interfaceC0178a);
        }
    }

    public void k(WeakReference<b> weakReference) {
        synchronized (this.f12225f) {
            this.f12225f.add(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f12221b.remove(activity);
        if (this.f12222c.containsKey(activity)) {
            ((e) activity).getSupportFragmentManager().q1(this.f12222c.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (this.f12220a.isEmpty()) {
            this.f12232x = this.f12230v.a();
            this.f12220a.put(activity, Boolean.TRUE);
            if (this.B) {
                q(xe.d.FOREGROUND);
                l();
                this.B = false;
            } else {
                n(com.google.firebase.perf.util.c.BACKGROUND_TRACE_NAME.toString(), this.f12233y, this.f12232x);
                q(xe.d.FOREGROUND);
            }
        } else {
            this.f12220a.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (h() && this.f12229u.K()) {
            if (!this.f12221b.containsKey(activity)) {
                o(activity);
            }
            this.f12221b.get(activity).c();
            Trace trace = new Trace(c(activity), this.f12228t, this.f12230v, this);
            trace.start();
            this.f12223d.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        if (h()) {
            m(activity);
        }
        if (this.f12220a.containsKey(activity)) {
            this.f12220a.remove(activity);
            if (this.f12220a.isEmpty()) {
                this.f12233y = this.f12230v.a();
                n(com.google.firebase.perf.util.c.FOREGROUND_TRACE_NAME.toString(), this.f12232x, this.f12233y);
                q(xe.d.BACKGROUND);
            }
        }
    }

    public void p(WeakReference<b> weakReference) {
        synchronized (this.f12225f) {
            this.f12225f.remove(weakReference);
        }
    }
}
