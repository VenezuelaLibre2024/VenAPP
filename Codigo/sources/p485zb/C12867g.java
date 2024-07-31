package p485zb;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C0731a;
import androidx.core.os.C0954m;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C5119c;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import ee.InterfaceC7183b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ke.C9256a;
import la.C9458c;
import la.C9471p;
import la.C9473r;
import p073e2.C7099c;
import p182jf.C9047b;
import p182jf.C9048c;
import p254nd.InterfaceC9707c;
import p273od.C9916f;
import p294pc.C10132c;
import p294pc.C10138f;
import p294pc.C10147n;
import p294pc.C10156w;
import p310qc.EnumC10432n;

/* renamed from: zb.g */
/* loaded from: classes.dex */
public class C12867g {

    /* renamed from: k */
    private static final Object f35068k = new Object();

    /* renamed from: l */
    static final Map<String, C12867g> f35069l = new C0731a();

    /* renamed from: a */
    private final Context f35070a;

    /* renamed from: b */
    private final String f35071b;

    /* renamed from: c */
    private final C12876p f35072c;

    /* renamed from: d */
    private final C10147n f35073d;

    /* renamed from: g */
    private final C10156w<C9256a> f35076g;

    /* renamed from: h */
    private final InterfaceC7183b<C9916f> f35077h;

    /* renamed from: e */
    private final AtomicBoolean f35074e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f35075f = new AtomicBoolean();

    /* renamed from: i */
    private final List<a> f35078i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final List<InterfaceC12868h> f35079j = new CopyOnWriteArrayList();

    /* renamed from: zb.g$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo42603a(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zb.g$b */
    /* loaded from: classes.dex */
    public static class b implements ComponentCallbacks2C5119c.a {

        /* renamed from: a */
        private static AtomicReference<b> f35080a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static void m42637c(Context context) {
            if (C9471p.m28164a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f35080a.get() == null) {
                    b bVar = new b();
                    if (C7099c.m20926a(f35080a, null, bVar)) {
                        ComponentCallbacks2C5119c.m13011c(application);
                        ComponentCallbacks2C5119c.m13010b().m13013a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C5119c.a
        /* renamed from: a */
        public void mo13016a(boolean z10) {
            synchronized (C12867g.f35068k) {
                Iterator it = new ArrayList(C12867g.f35069l.values()).iterator();
                while (it.hasNext()) {
                    C12867g c12867g = (C12867g) it.next();
                    if (c12867g.f35074e.get()) {
                        c12867g.m42606C(z10);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zb.g$c */
    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<c> f35081b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f35082a;

        public c(Context context) {
            this.f35082a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m42639b(Context context) {
            if (f35081b.get() == null) {
                c cVar = new c(context);
                if (C7099c.m20926a(f35081b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m42640c() {
            this.f35082a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C12867g.f35068k) {
                Iterator<C12867g> it = C12867g.f35069l.values().iterator();
                while (it.hasNext()) {
                    it.next().m42619t();
                }
            }
            m42640c();
        }
    }

    protected C12867g(final Context context, String str, C12876p c12876p) {
        this.f35070a = (Context) C5276s.m13324j(context);
        this.f35071b = C5276s.m13320f(str);
        this.f35072c = (C12876p) C5276s.m13324j(c12876p);
        AbstractC12878r m17546b = FirebaseInitProvider.m17546b();
        C9048c.m26559b("Firebase");
        C9048c.m26559b("ComponentDiscovery");
        List<InterfaceC7183b<ComponentRegistrar>> m30312b = C10138f.m30309c(context, ComponentDiscoveryService.class).m30312b();
        C9048c.m26558a();
        C9048c.m26559b("Runtime");
        C10147n.b m30337g = C10147n.m30319l(EnumC10432n.INSTANCE).m30335d(m30312b).m30334c(new FirebaseCommonRegistrar()).m30334c(new ExecutorsRegistrar()).m30333b(C10132c.m30265s(context, Context.class, new Class[0])).m30333b(C10132c.m30265s(this, C12867g.class, new Class[0])).m30333b(C10132c.m30265s(c12876p, C12876p.class, new Class[0])).m30337g(new C9047b());
        if (C0954m.m4737a(context) && FirebaseInitProvider.m17547c()) {
            m30337g.m30333b(C10132c.m30265s(m17546b, AbstractC12878r.class, new Class[0]));
        }
        C10147n m30336e = m30337g.m30336e();
        this.f35073d = m30336e;
        C9048c.m26558a();
        this.f35076g = new C10156w<>(new InterfaceC7183b() { // from class: zb.e
            @Override // ee.InterfaceC7183b
            public final Object get() {
                C9256a m42623z;
                m42623z = C12867g.this.m42623z(context);
                return m42623z;
            }
        });
        this.f35077h = m30336e.mo30299f(C9916f.class);
        m42626g(new a() { // from class: zb.f
            @Override // p485zb.C12867g.a
            /* renamed from: a */
            public final void mo42603a(boolean z10) {
                C12867g.this.m42604A(z10);
            }
        });
        C9048c.m26558a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m42604A(boolean z10) {
        if (z10) {
            return;
        }
        this.f35077h.get().m29638l();
    }

    /* renamed from: B */
    private static String m42605B(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m42606C(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f35078i.iterator();
        while (it.hasNext()) {
            it.next().mo42603a(z10);
        }
    }

    /* renamed from: D */
    private void m42607D() {
        Iterator<InterfaceC12868h> it = this.f35079j.iterator();
        while (it.hasNext()) {
            it.next().mo20036a(this.f35071b, this.f35072c);
        }
    }

    /* renamed from: i */
    private void m42614i() {
        C5276s.m13329o(!this.f35075f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: l */
    private static List<String> m42615l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f35068k) {
            Iterator<C12867g> it = f35069l.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m42631q());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: n */
    public static List<C12867g> m42616n(Context context) {
        ArrayList arrayList;
        synchronized (f35068k) {
            arrayList = new ArrayList(f35069l.values());
        }
        return arrayList;
    }

    /* renamed from: o */
    public static C12867g m42617o() {
        C12867g c12867g;
        synchronized (f35068k) {
            c12867g = f35069l.get("[DEFAULT]");
            if (c12867g == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C9473r.m28177a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            c12867g.f35077h.get().m29638l();
        }
        return c12867g;
    }

    /* renamed from: p */
    public static C12867g m42618p(String str) {
        C12867g c12867g;
        String str2;
        synchronized (f35068k) {
            c12867g = f35069l.get(m42605B(str));
            if (c12867g == null) {
                List<String> m42615l = m42615l();
                if (m42615l.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", m42615l);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
            c12867g.f35077h.get().m29638l();
        }
        return c12867g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m42619t() {
        if (!C0954m.m4737a(this.f35070a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m42631q());
            c.m42639b(this.f35070a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m42631q());
        this.f35073d.m30330o(m42635y());
        this.f35077h.get().m29638l();
    }

    /* renamed from: u */
    public static C12867g m42620u(Context context) {
        synchronized (f35068k) {
            if (f35069l.containsKey("[DEFAULT]")) {
                return m42617o();
            }
            C12876p m42642a = C12876p.m42642a(context);
            if (m42642a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m42621v(context, m42642a);
        }
    }

    /* renamed from: v */
    public static C12867g m42621v(Context context, C12876p c12876p) {
        return m42622w(context, c12876p, "[DEFAULT]");
    }

    /* renamed from: w */
    public static C12867g m42622w(Context context, C12876p c12876p, String str) {
        C12867g c12867g;
        b.m42637c(context);
        String m42605B = m42605B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f35068k) {
            Map<String, C12867g> map = f35069l;
            C5276s.m13329o(!map.containsKey(m42605B), "FirebaseApp name " + m42605B + " already exists!");
            C5276s.m13325k(context, "Application context cannot be null.");
            c12867g = new C12867g(context, m42605B, c12876p);
            map.put(m42605B, c12867g);
        }
        c12867g.m42619t();
        return c12867g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ C9256a m42623z(Context context) {
        return new C9256a(context, m42633s(), (InterfaceC9707c) this.f35073d.get(InterfaceC9707c.class));
    }

    /* renamed from: E */
    public void m42624E(boolean z10) {
        boolean z11;
        m42614i();
        if (this.f35074e.compareAndSet(!z10, z10)) {
            boolean m13014d = ComponentCallbacks2C5119c.m13010b().m13014d();
            if (z10 && m13014d) {
                z11 = true;
            } else if (z10 || !m13014d) {
                return;
            } else {
                z11 = false;
            }
            m42606C(z11);
        }
    }

    /* renamed from: F */
    public void m42625F(Boolean bool) {
        m42614i();
        this.f35076g.get().m27578e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12867g) {
            return this.f35071b.equals(((C12867g) obj).m42631q());
        }
        return false;
    }

    /* renamed from: g */
    public void m42626g(a aVar) {
        m42614i();
        if (this.f35074e.get() && ComponentCallbacks2C5119c.m13010b().m13014d()) {
            aVar.mo42603a(true);
        }
        this.f35078i.add(aVar);
    }

    /* renamed from: h */
    public void m42627h(InterfaceC12868h interfaceC12868h) {
        m42614i();
        C5276s.m13324j(interfaceC12868h);
        this.f35079j.add(interfaceC12868h);
    }

    public int hashCode() {
        return this.f35071b.hashCode();
    }

    /* renamed from: j */
    public void m42628j() {
        if (this.f35075f.compareAndSet(false, true)) {
            synchronized (f35068k) {
                f35069l.remove(this.f35071b);
            }
            m42607D();
        }
    }

    /* renamed from: k */
    public <T> T m42629k(Class<T> cls) {
        m42614i();
        return (T) this.f35073d.get(cls);
    }

    /* renamed from: m */
    public Context m42630m() {
        m42614i();
        return this.f35070a;
    }

    /* renamed from: q */
    public String m42631q() {
        m42614i();
        return this.f35071b;
    }

    /* renamed from: r */
    public C12876p m42632r() {
        m42614i();
        return this.f35072c;
    }

    /* renamed from: s */
    public String m42633s() {
        return C9458c.m28128e(m42631q().getBytes(Charset.defaultCharset())) + "+" + C9458c.m28128e(m42632r().m42644c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return C5270q.m13306d(this).m13307a("name", this.f35071b).m13307a("options", this.f35072c).toString();
    }

    /* renamed from: x */
    public boolean m42634x() {
        m42614i();
        return this.f35076g.get().m27577b();
    }

    /* renamed from: y */
    public boolean m42635y() {
        return "[DEFAULT]".equals(m42631q());
    }
}
