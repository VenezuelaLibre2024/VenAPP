package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC1263e;
import com.google.firebase.perf.config.C6277a;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.C6327a;
import com.google.firebase.perf.util.C6333g;
import com.google.firebase.perf.util.C6336j;
import com.google.firebase.perf.util.C6338l;
import com.google.firebase.perf.util.EnumC6328b;
import com.google.firebase.perf.util.EnumC6329c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p422we.C12178k;
import p444xe.C12480m;
import p444xe.EnumC12471d;
import re.C10696a;
import se.C10907f;

/* renamed from: com.google.firebase.perf.application.a */
/* loaded from: classes.dex */
public class C6273a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: C */
    private static final C10696a f13435C = C10696a.m32565e();

    /* renamed from: D */
    private static volatile C6273a f13436D;

    /* renamed from: A */
    private boolean f13437A;

    /* renamed from: B */
    private boolean f13438B;

    /* renamed from: a */
    private final WeakHashMap<Activity, Boolean> f13439a;

    /* renamed from: b */
    private final WeakHashMap<Activity, C6276d> f13440b;

    /* renamed from: c */
    private final WeakHashMap<Activity, C6275c> f13441c;

    /* renamed from: d */
    private final WeakHashMap<Activity, Trace> f13442d;

    /* renamed from: e */
    private final Map<String, Long> f13443e;

    /* renamed from: f */
    private final Set<WeakReference<b>> f13444f;

    /* renamed from: r */
    private Set<a> f13445r;

    /* renamed from: s */
    private final AtomicInteger f13446s;

    /* renamed from: t */
    private final C12178k f13447t;

    /* renamed from: u */
    private final C6277a f13448u;

    /* renamed from: v */
    private final C6327a f13449v;

    /* renamed from: w */
    private final boolean f13450w;

    /* renamed from: x */
    private C6338l f13451x;

    /* renamed from: y */
    private C6338l f13452y;

    /* renamed from: z */
    private EnumC12471d f13453z;

    /* renamed from: com.google.firebase.perf.application.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo17243a();
    }

    /* renamed from: com.google.firebase.perf.application.a$b */
    /* loaded from: classes.dex */
    public interface b {
        void onUpdateAppState(EnumC12471d enumC12471d);
    }

    C6273a(C12178k c12178k, C6327a c6327a) {
        this(c12178k, c6327a, C6277a.m17265g(), m17228g());
    }

    C6273a(C12178k c12178k, C6327a c6327a, C6277a c6277a, boolean z10) {
        this.f13439a = new WeakHashMap<>();
        this.f13440b = new WeakHashMap<>();
        this.f13441c = new WeakHashMap<>();
        this.f13442d = new WeakHashMap<>();
        this.f13443e = new HashMap();
        this.f13444f = new HashSet();
        this.f13445r = new HashSet();
        this.f13446s = new AtomicInteger(0);
        this.f13453z = EnumC12471d.BACKGROUND;
        this.f13437A = false;
        this.f13438B = true;
        this.f13447t = c12178k;
        this.f13449v = c6327a;
        this.f13448u = c6277a;
        this.f13450w = z10;
    }

    /* renamed from: b */
    public static C6273a m17226b() {
        if (f13436D == null) {
            synchronized (C6273a.class) {
                if (f13436D == null) {
                    f13436D = new C6273a(C12178k.m39078k(), new C6327a());
                }
            }
        }
        return f13436D;
    }

    /* renamed from: c */
    public static String m17227c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    /* renamed from: g */
    private static boolean m17228g() {
        return C6276d.m17245a();
    }

    /* renamed from: l */
    private void m17229l() {
        synchronized (this.f13445r) {
            for (a aVar : this.f13445r) {
                if (aVar != null) {
                    aVar.mo17243a();
                }
            }
        }
    }

    /* renamed from: m */
    private void m17230m(Activity activity) {
        Trace trace = this.f13442d.get(activity);
        if (trace == null) {
            return;
        }
        this.f13442d.remove(activity);
        C6333g<C10907f.a> m17249e = this.f13440b.get(activity).m17249e();
        if (!m17249e.m17523d()) {
            f13435C.m32575k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            C6336j.m17526a(trace, m17249e.m17522c());
            trace.stop();
        }
    }

    /* renamed from: n */
    private void m17231n(String str, C6338l c6338l, C6338l c6338l2) {
        if (this.f13448u.m17282K()) {
            C12480m.b m40736K = C12480m.m40702H0().m40744T(str).m40742R(c6338l.m17534e()).m40743S(c6338l.m17533d(c6338l2)).m40736K(SessionManager.getInstance().perfSession().m38003a());
            int andSet = this.f13446s.getAndSet(0);
            synchronized (this.f13443e) {
                m40736K.m40738M(this.f13443e);
                if (andSet != 0) {
                    m40736K.m40740O(EnumC6328b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                this.f13443e.clear();
            }
            this.f13447t.m39094C(m40736K.build(), EnumC12471d.FOREGROUND_BACKGROUND);
        }
    }

    /* renamed from: o */
    private void m17232o(Activity activity) {
        if (m17238h() && this.f13448u.m17282K()) {
            C6276d c6276d = new C6276d(activity);
            this.f13440b.put(activity, c6276d);
            if (activity instanceof ActivityC1263e) {
                C6275c c6275c = new C6275c(this.f13449v, this.f13447t, this, c6276d);
                this.f13441c.put(activity, c6275c);
                ((ActivityC1263e) activity).getSupportFragmentManager().m7069a1(c6275c, true);
            }
        }
    }

    /* renamed from: q */
    private void m17233q(EnumC12471d enumC12471d) {
        this.f13453z = enumC12471d;
        synchronized (this.f13444f) {
            Iterator<WeakReference<b>> it = this.f13444f.iterator();
            while (it.hasNext()) {
                b bVar = it.next().get();
                if (bVar != null) {
                    bVar.onUpdateAppState(this.f13453z);
                } else {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public EnumC12471d m17234a() {
        return this.f13453z;
    }

    /* renamed from: d */
    public void m17235d(String str, long j10) {
        synchronized (this.f13443e) {
            Long l10 = this.f13443e.get(str);
            if (l10 == null) {
                this.f13443e.put(str, Long.valueOf(j10));
            } else {
                this.f13443e.put(str, Long.valueOf(l10.longValue() + j10));
            }
        }
    }

    /* renamed from: e */
    public void m17236e(int i10) {
        this.f13446s.addAndGet(i10);
    }

    /* renamed from: f */
    public boolean m17237f() {
        return this.f13438B;
    }

    /* renamed from: h */
    protected boolean m17238h() {
        return this.f13450w;
    }

    /* renamed from: i */
    public synchronized void m17239i(Context context) {
        if (this.f13437A) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f13437A = true;
        }
    }

    /* renamed from: j */
    public void m17240j(a aVar) {
        synchronized (this.f13445r) {
            this.f13445r.add(aVar);
        }
    }

    /* renamed from: k */
    public void m17241k(WeakReference<b> weakReference) {
        synchronized (this.f13444f) {
            this.f13444f.add(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        m17232o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f13440b.remove(activity);
        if (this.f13441c.containsKey(activity)) {
            ((ActivityC1263e) activity).getSupportFragmentManager().m7099q1(this.f13441c.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (this.f13439a.isEmpty()) {
            this.f13451x = this.f13449v.m17508a();
            this.f13439a.put(activity, Boolean.TRUE);
            if (this.f13438B) {
                m17233q(EnumC12471d.FOREGROUND);
                m17229l();
                this.f13438B = false;
            } else {
                m17231n(EnumC6329c.BACKGROUND_TRACE_NAME.toString(), this.f13452y, this.f13451x);
                m17233q(EnumC12471d.FOREGROUND);
            }
        } else {
            this.f13439a.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (m17238h() && this.f13448u.m17282K()) {
            if (!this.f13440b.containsKey(activity)) {
                m17232o(activity);
            }
            this.f13440b.get(activity).m17247c();
            Trace trace = new Trace(m17227c(activity), this.f13447t, this.f13449v, this);
            trace.start();
            this.f13442d.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        if (m17238h()) {
            m17230m(activity);
        }
        if (this.f13439a.containsKey(activity)) {
            this.f13439a.remove(activity);
            if (this.f13439a.isEmpty()) {
                this.f13452y = this.f13449v.m17508a();
                m17231n(EnumC6329c.FOREGROUND_TRACE_NAME.toString(), this.f13451x, this.f13452y);
                m17233q(EnumC12471d.BACKGROUND);
            }
        }
    }

    /* renamed from: p */
    public void m17242p(WeakReference<b> weakReference) {
        synchronized (this.f13444f) {
            this.f13444f.remove(weakReference);
        }
    }
}
