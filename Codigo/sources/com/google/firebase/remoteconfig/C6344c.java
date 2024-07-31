package com.google.firebase.remoteconfig;

import ac.C0097c;
import af.C0108a;
import af.C0112e;
import android.app.Application;
import android.content.Context;
import bf.InterfaceC1776a;
import cc.InterfaceC1940a;
import cf.InterfaceC1963f;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C5119c;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.C6344c;
import com.google.firebase.remoteconfig.internal.C6350f;
import com.google.firebase.remoteconfig.internal.C6351g;
import com.google.firebase.remoteconfig.internal.C6357m;
import com.google.firebase.remoteconfig.internal.C6359o;
import com.google.firebase.remoteconfig.internal.C6360p;
import com.google.firebase.remoteconfig.internal.C6361q;
import com.google.firebase.remoteconfig.internal.C6365u;
import com.google.firebase.remoteconfig.internal.C6368x;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import ee.InterfaceC7183b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import la.C9464i;
import la.InterfaceC9459d;
import la.InterfaceC9461f;
import p063dc.InterfaceC6880b;
import p073e2.C7099c;
import p106fe.InterfaceC7337f;
import p485zb.C12867g;

/* renamed from: com.google.firebase.remoteconfig.c */
/* loaded from: classes2.dex */
public class C6344c implements InterfaceC1776a {

    /* renamed from: j */
    private static final InterfaceC9461f f13634j = C9464i.m28142d();

    /* renamed from: k */
    private static final Random f13635k = new Random();

    /* renamed from: l */
    private static final Map<String, C6342a> f13636l = new HashMap();

    /* renamed from: a */
    private final Map<String, C6342a> f13637a;

    /* renamed from: b */
    private final Context f13638b;

    /* renamed from: c */
    private final ScheduledExecutorService f13639c;

    /* renamed from: d */
    private final C12867g f13640d;

    /* renamed from: e */
    private final InterfaceC7337f f13641e;

    /* renamed from: f */
    private final C0097c f13642f;

    /* renamed from: g */
    private final InterfaceC7183b<InterfaceC1940a> f13643g;

    /* renamed from: h */
    private final String f13644h;

    /* renamed from: i */
    private Map<String, String> f13645i;

    /* renamed from: com.google.firebase.remoteconfig.c$a */
    /* loaded from: classes2.dex */
    private static class a implements ComponentCallbacks2C5119c.a {

        /* renamed from: a */
        private static final AtomicReference<a> f13646a = new AtomicReference<>();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static void m17586c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = f13646a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (C7099c.m20926a(atomicReference, null, aVar)) {
                    ComponentCallbacks2C5119c.m13011c(application);
                    ComponentCallbacks2C5119c.m13010b().m13013a(aVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C5119c.a
        /* renamed from: a */
        public void mo13016a(boolean z10) {
            C6344c.m17578r(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6344c(Context context, @InterfaceC6880b ScheduledExecutorService scheduledExecutorService, C12867g c12867g, InterfaceC7337f interfaceC7337f, C0097c c0097c, InterfaceC7183b<InterfaceC1940a> interfaceC7183b) {
        this(context, scheduledExecutorService, c12867g, interfaceC7337f, c0097c, interfaceC7183b, true);
    }

    protected C6344c(Context context, ScheduledExecutorService scheduledExecutorService, C12867g c12867g, InterfaceC7337f interfaceC7337f, C0097c c0097c, InterfaceC7183b<InterfaceC1940a> interfaceC7183b, boolean z10) {
        this.f13637a = new HashMap();
        this.f13645i = new HashMap();
        this.f13638b = context;
        this.f13639c = scheduledExecutorService;
        this.f13640d = c12867g;
        this.f13641e = interfaceC7337f;
        this.f13642f = c0097c;
        this.f13643g = interfaceC7183b;
        this.f13644h = c12867g.m42632r().m42644c();
        a.m17586c(context);
        if (z10) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C6344c.this.m17581g();
                }
            });
        }
    }

    /* renamed from: f */
    private C6350f m17570f(String str, String str2) {
        return C6350f.m17614h(this.f13639c, C6365u.m17746c(this.f13638b, String.format("%s_%s_%s_%s.json", "frc", this.f13644h, str, str2)));
    }

    /* renamed from: j */
    private C6359o m17571j(C6350f c6350f, C6350f c6350f2) {
        return new C6359o(this.f13639c, c6350f, c6350f2);
    }

    /* renamed from: k */
    static C6360p m17572k(Context context, String str, String str2) {
        return new C6360p(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    /* renamed from: l */
    private static C6368x m17573l(C12867g c12867g, String str, InterfaceC7183b<InterfaceC1940a> interfaceC7183b) {
        if (m17576p(c12867g) && str.equals("firebase")) {
            return new C6368x(interfaceC7183b);
        }
        return null;
    }

    /* renamed from: n */
    private C0112e m17574n(C6350f c6350f, C6359o c6359o) {
        return new C0112e(c6350f, C0108a.m520a(c6359o), this.f13639c);
    }

    /* renamed from: o */
    private static boolean m17575o(C12867g c12867g, String str) {
        return str.equals("firebase") && m17576p(c12867g);
    }

    /* renamed from: p */
    private static boolean m17576p(C12867g c12867g) {
        return c12867g.m42631q().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ InterfaceC1940a m17577q() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static synchronized void m17578r(boolean z10) {
        synchronized (C6344c.class) {
            Iterator<C6342a> it = f13636l.values().iterator();
            while (it.hasNext()) {
                it.next().m17565p(z10);
            }
        }
    }

    @Override // bf.InterfaceC1776a
    /* renamed from: a */
    public void mo9488a(String str, InterfaceC1963f interfaceC1963f) {
        m17579d(str).m17564j().m529h(interfaceC1963f);
    }

    /* renamed from: d */
    public synchronized C6342a m17579d(String str) {
        C6350f m17570f;
        C6350f m17570f2;
        C6350f m17570f3;
        C6360p m17572k;
        C6359o m17571j;
        m17570f = m17570f(str, "fetch");
        m17570f2 = m17570f(str, "activate");
        m17570f3 = m17570f(str, "defaults");
        m17572k = m17572k(this.f13638b, this.f13644h, str);
        m17571j = m17571j(m17570f2, m17570f3);
        final C6368x m17573l = m17573l(this.f13640d, str, this.f13643g);
        if (m17573l != null) {
            m17571j.m17687b(new InterfaceC9459d() { // from class: ze.o
                @Override // la.InterfaceC9459d
                public final void accept(Object obj, Object obj2) {
                    C6368x.this.m17764a((String) obj, (C6351g) obj2);
                }
            });
        }
        return m17580e(this.f13640d, str, this.f13641e, this.f13642f, this.f13639c, m17570f, m17570f2, m17570f3, m17582h(str, m17570f, m17572k), m17571j, m17572k, m17574n(m17570f2, m17571j));
    }

    /* renamed from: e */
    synchronized C6342a m17580e(C12867g c12867g, String str, InterfaceC7337f interfaceC7337f, C0097c c0097c, Executor executor, C6350f c6350f, C6350f c6350f2, C6350f c6350f3, C6357m c6357m, C6359o c6359o, C6360p c6360p, C0112e c0112e) {
        if (!this.f13637a.containsKey(str)) {
            C6342a c6342a = new C6342a(this.f13638b, c12867g, interfaceC7337f, m17575o(c12867g, str) ? c0097c : null, executor, c6350f, c6350f2, c6350f3, c6357m, c6359o, c6360p, m17584m(c12867g, interfaceC7337f, c6357m, c6350f2, this.f13638b, str, c6360p), c0112e);
            c6342a.m17566q();
            this.f13637a.put(str, c6342a);
            f13636l.put(str, c6342a);
        }
        return this.f13637a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C6342a m17581g() {
        return m17579d("firebase");
    }

    /* renamed from: h */
    synchronized C6357m m17582h(String str, C6350f c6350f, C6360p c6360p) {
        return new C6357m(this.f13641e, m17576p(this.f13640d) ? this.f13643g : new InterfaceC7183b() { // from class: ze.p
            @Override // ee.InterfaceC7183b
            public final Object get() {
                InterfaceC1940a m17577q;
                m17577q = C6344c.m17577q();
                return m17577q;
            }
        }, this.f13639c, f13634j, f13635k, c6350f, m17583i(this.f13640d.m42632r().m42643b(), str, c6360p), c6360p, this.f13645i);
    }

    /* renamed from: i */
    ConfigFetchHttpClient m17583i(String str, String str2, C6360p c6360p) {
        return new ConfigFetchHttpClient(this.f13638b, this.f13640d.m42632r().m42644c(), str, str2, c6360p.m17692b(), c6360p.m17692b());
    }

    /* renamed from: m */
    synchronized C6361q m17584m(C12867g c12867g, InterfaceC7337f interfaceC7337f, C6357m c6357m, C6350f c6350f, Context context, String str, C6360p c6360p) {
        return new C6361q(c12867g, interfaceC7337f, c6357m, c6350f, context, str, c6360p, this.f13639c);
    }
}
