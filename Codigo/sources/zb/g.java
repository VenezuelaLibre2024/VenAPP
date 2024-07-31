package zb;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import pc.n;
import pc.w;

/* loaded from: classes.dex */
public class g {

    /* renamed from: k */
    private static final Object f32517k = new Object();

    /* renamed from: l */
    static final Map<String, g> f32518l = new androidx.collection.a();

    /* renamed from: a */
    private final Context f32519a;

    /* renamed from: b */
    private final String f32520b;

    /* renamed from: c */
    private final p f32521c;

    /* renamed from: d */
    private final pc.n f32522d;

    /* renamed from: g */
    private final w<ke.a> f32525g;

    /* renamed from: h */
    private final ee.b<od.f> f32526h;

    /* renamed from: e */
    private final AtomicBoolean f32523e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f32524f = new AtomicBoolean();

    /* renamed from: i */
    private final List<a> f32527i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final List<h> f32528j = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    /* loaded from: classes.dex */
    public static class b implements c.a {

        /* renamed from: a */
        private static AtomicReference<b> f32529a = new AtomicReference<>();

        private b() {
        }

        public static void c(Context context) {
            if (la.p.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f32529a.get() == null) {
                    b bVar = new b();
                    if (e2.c.a(f32529a, null, bVar)) {
                        com.google.android.gms.common.api.internal.c.c(application);
                        com.google.android.gms.common.api.internal.c.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.c.a
        public void a(boolean z10) {
            synchronized (g.f32517k) {
                Iterator it = new ArrayList(g.f32518l.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f32523e.get()) {
                        gVar.C(z10);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<c> f32530b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f32531a;

        public c(Context context) {
            this.f32531a = context;
        }

        public static void b(Context context) {
            if (f32530b.get() == null) {
                c cVar = new c(context);
                if (e2.c.a(f32530b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f32531a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (g.f32517k) {
                Iterator<g> it = g.f32518l.values().iterator();
                while (it.hasNext()) {
                    it.next().t();
                }
            }
            c();
        }
    }

    protected g(Context context, String str, p pVar) {
        this.f32519a = (Context) s.j(context);
        this.f32520b = s.f(str);
        this.f32521c = (p) s.j(pVar);
        r b10 = FirebaseInitProvider.b();
        jf.c.b("Firebase");
        jf.c.b("ComponentDiscovery");
        List<ee.b<ComponentRegistrar>> b11 = pc.f.c(context, ComponentDiscoveryService.class).b();
        jf.c.a();
        jf.c.b("Runtime");
        n.b g10 = pc.n.l(qc.n.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(pc.c.s(context, Context.class, new Class[0])).b(pc.c.s(this, g.class, new Class[0])).b(pc.c.s(pVar, p.class, new Class[0])).g(new jf.b());
        if (androidx.core.os.m.a(context) && FirebaseInitProvider.c()) {
            g10.b(pc.c.s(b10, r.class, new Class[0]));
        }
        pc.n e10 = g10.e();
        this.f32522d = e10;
        jf.c.a();
        this.f32525g = new w<>(new ee.b() { // from class: zb.e

            /* renamed from: b */
            public final /* synthetic */ Context f32515b;

            public /* synthetic */ e(Context context2) {
                r2 = context2;
            }

            @Override // ee.b
            public final Object get() {
                ke.a z10;
                z10 = g.this.z(r2);
                return z10;
            }
        });
        this.f32526h = e10.f(od.f.class);
        g(new a() { // from class: zb.f
            public /* synthetic */ f() {
            }

            @Override // zb.g.a
            public final void a(boolean z10) {
                g.this.A(z10);
            }
        });
        jf.c.a();
    }

    public /* synthetic */ void A(boolean z10) {
        if (z10) {
            return;
        }
        this.f32526h.get().l();
    }

    private static String B(String str) {
        return str.trim();
    }

    public void C(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f32527i.iterator();
        while (it.hasNext()) {
            it.next().a(z10);
        }
    }

    private void D() {
        Iterator<h> it = this.f32528j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f32520b, this.f32521c);
        }
    }

    private void i() {
        s.o(!this.f32524f.get(), "FirebaseApp was deleted");
    }

    private static List<String> l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f32517k) {
            Iterator<g> it = f32518l.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().q());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<g> n(Context context) {
        ArrayList arrayList;
        synchronized (f32517k) {
            arrayList = new ArrayList(f32518l.values());
        }
        return arrayList;
    }

    public static g o() {
        g gVar;
        synchronized (f32517k) {
            gVar = f32518l.get("[DEFAULT]");
            if (gVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + la.r.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            gVar.f32526h.get().l();
        }
        return gVar;
    }

    public static g p(String str) {
        g gVar;
        String str2;
        synchronized (f32517k) {
            gVar = f32518l.get(B(str));
            if (gVar == null) {
                List<String> l10 = l();
                if (l10.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", l10);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
            gVar.f32526h.get().l();
        }
        return gVar;
    }

    public void t() {
        if (!androidx.core.os.m.a(this.f32519a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            c.b(this.f32519a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.f32522d.o(y());
        this.f32526h.get().l();
    }

    public static g u(Context context) {
        synchronized (f32517k) {
            if (f32518l.containsKey("[DEFAULT]")) {
                return o();
            }
            p a10 = p.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return v(context, a10);
        }
    }

    public static g v(Context context, p pVar) {
        return w(context, pVar, "[DEFAULT]");
    }

    public static g w(Context context, p pVar, String str) {
        g gVar;
        b.c(context);
        String B = B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f32517k) {
            Map<String, g> map = f32518l;
            s.o(!map.containsKey(B), "FirebaseApp name " + B + " already exists!");
            s.k(context, "Application context cannot be null.");
            gVar = new g(context, B, pVar);
            map.put(B, gVar);
        }
        gVar.t();
        return gVar;
    }

    public /* synthetic */ ke.a z(Context context) {
        return new ke.a(context, s(), (nd.c) this.f32522d.get(nd.c.class));
    }

    public void E(boolean z10) {
        boolean z11;
        i();
        if (this.f32523e.compareAndSet(!z10, z10)) {
            boolean d10 = com.google.android.gms.common.api.internal.c.b().d();
            if (z10 && d10) {
                z11 = true;
            } else if (z10 || !d10) {
                return;
            } else {
                z11 = false;
            }
            C(z11);
        }
    }

    public void F(Boolean bool) {
        i();
        this.f32525g.get().e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f32520b.equals(((g) obj).q());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f32523e.get() && com.google.android.gms.common.api.internal.c.b().d()) {
            aVar.a(true);
        }
        this.f32527i.add(aVar);
    }

    public void h(h hVar) {
        i();
        s.j(hVar);
        this.f32528j.add(hVar);
    }

    public int hashCode() {
        return this.f32520b.hashCode();
    }

    public void j() {
        if (this.f32524f.compareAndSet(false, true)) {
            synchronized (f32517k) {
                f32518l.remove(this.f32520b);
            }
            D();
        }
    }

    public <T> T k(Class<T> cls) {
        i();
        return (T) this.f32522d.get(cls);
    }

    public Context m() {
        i();
        return this.f32519a;
    }

    public String q() {
        i();
        return this.f32520b;
    }

    public p r() {
        i();
        return this.f32521c;
    }

    public String s() {
        return la.c.e(q().getBytes(Charset.defaultCharset())) + "+" + la.c.e(r().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return com.google.android.gms.common.internal.q.d(this).a("name", this.f32520b).a("options", this.f32521c).toString();
    }

    public boolean x() {
        i();
        return this.f32525g.get().b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }
}
