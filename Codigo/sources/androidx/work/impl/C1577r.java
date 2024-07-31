package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.C0854a;
import androidx.work.C1521a;
import androidx.work.WorkerParameters;
import androidx.work.impl.RunnableC1567h0;
import androidx.work.impl.foreground.C1562b;
import androidx.work.impl.foreground.InterfaceC1561a;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p094f2.AbstractC7277j;
import p094f2.C7272e;
import p192k2.C9124m;
import p192k2.C9132u;
import p211l2.C9373y;
import p230m2.InterfaceC9536b;

/* renamed from: androidx.work.impl.r */
/* loaded from: classes.dex */
public class C1577r implements InterfaceC1552e, InterfaceC1561a {

    /* renamed from: x */
    private static final String f6747x = AbstractC7277j.m21769i("Processor");

    /* renamed from: b */
    private Context f6749b;

    /* renamed from: c */
    private C1521a f6750c;

    /* renamed from: d */
    private InterfaceC9536b f6751d;

    /* renamed from: e */
    private WorkDatabase f6752e;

    /* renamed from: t */
    private List<InterfaceC1579t> f6756t;

    /* renamed from: r */
    private Map<String, RunnableC1567h0> f6754r = new HashMap();

    /* renamed from: f */
    private Map<String, RunnableC1567h0> f6753f = new HashMap();

    /* renamed from: u */
    private Set<String> f6757u = new HashSet();

    /* renamed from: v */
    private final List<InterfaceC1552e> f6758v = new ArrayList();

    /* renamed from: a */
    private PowerManager.WakeLock f6748a = null;

    /* renamed from: w */
    private final Object f6759w = new Object();

    /* renamed from: s */
    private Map<String, Set<C1584v>> f6755s = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.r$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        private InterfaceC1552e f6760a;

        /* renamed from: b */
        private final C9124m f6761b;

        /* renamed from: c */
        private InterfaceFutureC5920f<Boolean> f6762c;

        a(InterfaceC1552e interfaceC1552e, C9124m c9124m, InterfaceFutureC5920f<Boolean> interfaceFutureC5920f) {
            this.f6760a = interfaceC1552e;
            this.f6761b = c9124m;
            this.f6762c = interfaceFutureC5920f;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                z10 = this.f6762c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f6760a.m8750l(this.f6761b, z10);
        }
    }

    public C1577r(Context context, C1521a c1521a, InterfaceC9536b interfaceC9536b, WorkDatabase workDatabase, List<InterfaceC1579t> list) {
        this.f6749b = context;
        this.f6750c = c1521a;
        this.f6751d = interfaceC9536b;
        this.f6752e = workDatabase;
        this.f6756t = list;
    }

    /* renamed from: i */
    private static boolean m8749i(String str, RunnableC1567h0 runnableC1567h0) {
        if (runnableC1567h0 == null) {
            AbstractC7277j.m21767e().mo21770a(f6747x, "WorkerWrapper could not be found for " + str);
            return false;
        }
        runnableC1567h0.m8739g();
        AbstractC7277j.m21767e().mo21770a(f6747x, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ C9132u m8751m(ArrayList arrayList, String str) {
        arrayList.addAll(this.f6752e.mo8561K().mo26833a(str));
        return this.f6752e.mo8560J().mo26909h(str);
    }

    /* renamed from: o */
    private void m8752o(final C9124m c9124m, final boolean z10) {
        this.f6751d.mo28363a().execute(new Runnable() { // from class: androidx.work.impl.q
            @Override // java.lang.Runnable
            public final void run() {
                C1577r.this.m8750l(c9124m, z10);
            }
        });
    }

    /* renamed from: s */
    private void m8753s() {
        synchronized (this.f6759w) {
            if (!(!this.f6753f.isEmpty())) {
                try {
                    this.f6749b.startService(C1562b.m8714g(this.f6749b));
                } catch (Throwable th2) {
                    AbstractC7277j.m21767e().mo21773d(f6747x, "Unable to stop foreground service", th2);
                }
                PowerManager.WakeLock wakeLock = this.f6748a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f6748a = null;
                }
            }
        }
    }

    @Override // androidx.work.impl.foreground.InterfaceC1561a
    /* renamed from: a */
    public void mo8708a(String str) {
        synchronized (this.f6759w) {
            this.f6753f.remove(str);
            m8753s();
        }
    }

    @Override // androidx.work.impl.foreground.InterfaceC1561a
    /* renamed from: b */
    public boolean mo8709b(String str) {
        boolean containsKey;
        synchronized (this.f6759w) {
            containsKey = this.f6753f.containsKey(str);
        }
        return containsKey;
    }

    @Override // androidx.work.impl.foreground.InterfaceC1561a
    /* renamed from: c */
    public void mo8710c(String str, C7272e c7272e) {
        synchronized (this.f6759w) {
            AbstractC7277j.m21767e().mo21774f(f6747x, "Moving WorkSpec (" + str + ") to the foreground");
            RunnableC1567h0 remove = this.f6754r.remove(str);
            if (remove != null) {
                if (this.f6748a == null) {
                    PowerManager.WakeLock m27890b = C9373y.m27890b(this.f6749b, "ProcessorForegroundLck");
                    this.f6748a = m27890b;
                    m27890b.acquire();
                }
                this.f6753f.put(str, remove);
                C0854a.startForegroundService(this.f6749b, C1562b.m8713e(this.f6749b, remove.m8737d(), c7272e));
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC1552e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m8750l(C9124m c9124m, boolean z10) {
        synchronized (this.f6759w) {
            RunnableC1567h0 runnableC1567h0 = this.f6754r.get(c9124m.m26876b());
            if (runnableC1567h0 != null && c9124m.equals(runnableC1567h0.m8737d())) {
                this.f6754r.remove(c9124m.m26876b());
            }
            AbstractC7277j.m21767e().mo21770a(f6747x, getClass().getSimpleName() + " " + c9124m.m26876b() + " executed; reschedule = " + z10);
            Iterator<InterfaceC1552e> it = this.f6758v.iterator();
            while (it.hasNext()) {
                it.next().m8750l(c9124m, z10);
            }
        }
    }

    /* renamed from: g */
    public void m8754g(InterfaceC1552e interfaceC1552e) {
        synchronized (this.f6759w) {
            this.f6758v.add(interfaceC1552e);
        }
    }

    /* renamed from: h */
    public C9132u m8755h(String str) {
        synchronized (this.f6759w) {
            RunnableC1567h0 runnableC1567h0 = this.f6753f.get(str);
            if (runnableC1567h0 == null) {
                runnableC1567h0 = this.f6754r.get(str);
            }
            if (runnableC1567h0 == null) {
                return null;
            }
            return runnableC1567h0.m8738e();
        }
    }

    /* renamed from: j */
    public boolean m8756j(String str) {
        boolean contains;
        synchronized (this.f6759w) {
            contains = this.f6757u.contains(str);
        }
        return contains;
    }

    /* renamed from: k */
    public boolean m8757k(String str) {
        boolean z10;
        synchronized (this.f6759w) {
            z10 = this.f6754r.containsKey(str) || this.f6753f.containsKey(str);
        }
        return z10;
    }

    /* renamed from: n */
    public void m8758n(InterfaceC1552e interfaceC1552e) {
        synchronized (this.f6759w) {
            this.f6758v.remove(interfaceC1552e);
        }
    }

    /* renamed from: p */
    public boolean m8759p(C1584v c1584v) {
        return m8760q(c1584v, null);
    }

    /* renamed from: q */
    public boolean m8760q(C1584v c1584v, WorkerParameters.C1520a c1520a) {
        C9124m m8802a = c1584v.m8802a();
        final String m26876b = m8802a.m26876b();
        final ArrayList arrayList = new ArrayList();
        C9132u c9132u = (C9132u) this.f6752e.m32249A(new Callable() { // from class: androidx.work.impl.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C9132u m8751m;
                m8751m = C1577r.this.m8751m(arrayList, m26876b);
                return m8751m;
            }
        });
        if (c9132u == null) {
            AbstractC7277j.m21767e().mo21777k(f6747x, "Didn't find WorkSpec for id " + m8802a);
            m8752o(m8802a, false);
            return false;
        }
        synchronized (this.f6759w) {
            if (m8757k(m26876b)) {
                Set<C1584v> set = this.f6755s.get(m26876b);
                if (set.iterator().next().m8802a().m26875a() == m8802a.m26875a()) {
                    set.add(c1584v);
                    AbstractC7277j.m21767e().mo21770a(f6747x, "Work " + m8802a + " is already enqueued for processing");
                } else {
                    m8752o(m8802a, false);
                }
                return false;
            }
            if (c9132u.m26895f() != m8802a.m26875a()) {
                m8752o(m8802a, false);
                return false;
            }
            RunnableC1567h0 m8743b = new RunnableC1567h0.c(this.f6749b, this.f6750c, this.f6751d, this, this.f6752e, c9132u, arrayList).m8745d(this.f6756t).m8744c(c1520a).m8743b();
            InterfaceFutureC5920f<Boolean> m8736c = m8743b.m8736c();
            m8736c.addListener(new a(this, c1584v.m8802a(), m8736c), this.f6751d.mo28363a());
            this.f6754r.put(m26876b, m8743b);
            HashSet hashSet = new HashSet();
            hashSet.add(c1584v);
            this.f6755s.put(m26876b, hashSet);
            this.f6751d.mo28364b().execute(m8743b);
            AbstractC7277j.m21767e().mo21770a(f6747x, getClass().getSimpleName() + ": processing " + m8802a);
            return true;
        }
    }

    /* renamed from: r */
    public boolean m8761r(String str) {
        RunnableC1567h0 remove;
        boolean z10;
        synchronized (this.f6759w) {
            AbstractC7277j.m21767e().mo21770a(f6747x, "Processor cancelling " + str);
            this.f6757u.add(str);
            remove = this.f6753f.remove(str);
            z10 = remove != null;
            if (remove == null) {
                remove = this.f6754r.remove(str);
            }
            if (remove != null) {
                this.f6755s.remove(str);
            }
        }
        boolean m8749i = m8749i(str, remove);
        if (z10) {
            m8753s();
        }
        return m8749i;
    }

    /* renamed from: t */
    public boolean m8762t(C1584v c1584v) {
        RunnableC1567h0 remove;
        String m26876b = c1584v.m8802a().m26876b();
        synchronized (this.f6759w) {
            AbstractC7277j.m21767e().mo21770a(f6747x, "Processor stopping foreground work " + m26876b);
            remove = this.f6753f.remove(m26876b);
            if (remove != null) {
                this.f6755s.remove(m26876b);
            }
        }
        return m8749i(m26876b, remove);
    }

    /* renamed from: u */
    public boolean m8763u(C1584v c1584v) {
        String m26876b = c1584v.m8802a().m26876b();
        synchronized (this.f6759w) {
            RunnableC1567h0 remove = this.f6754r.remove(m26876b);
            if (remove == null) {
                AbstractC7277j.m21767e().mo21770a(f6747x, "WorkerWrapper could not be found for " + m26876b);
                return false;
            }
            Set<C1584v> set = this.f6755s.get(m26876b);
            if (set != null && set.contains(c1584v)) {
                AbstractC7277j.m21767e().mo21770a(f6747x, "Processor stopping background work " + m26876b);
                this.f6755s.remove(m26876b);
                return m8749i(m26876b, remove);
            }
            return false;
        }
    }
}
