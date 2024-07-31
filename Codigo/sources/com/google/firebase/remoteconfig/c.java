package com.google.firebase.remoteconfig;

import af.e;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.q;
import com.google.firebase.remoteconfig.internal.u;
import com.google.firebase.remoteconfig.internal.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import la.d;
import la.f;
import la.i;
import zb.g;

/* loaded from: classes2.dex */
public class c implements bf.a {

    /* renamed from: j */
    private static final f f12402j = i.d();

    /* renamed from: k */
    private static final Random f12403k = new Random();

    /* renamed from: l */
    private static final Map<String, com.google.firebase.remoteconfig.a> f12404l = new HashMap();

    /* renamed from: a */
    private final Map<String, com.google.firebase.remoteconfig.a> f12405a;

    /* renamed from: b */
    private final Context f12406b;

    /* renamed from: c */
    private final ScheduledExecutorService f12407c;

    /* renamed from: d */
    private final g f12408d;

    /* renamed from: e */
    private final fe.f f12409e;

    /* renamed from: f */
    private final ac.c f12410f;

    /* renamed from: g */
    private final ee.b<cc.a> f12411g;

    /* renamed from: h */
    private final String f12412h;

    /* renamed from: i */
    private Map<String, String> f12413i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a implements c.a {

        /* renamed from: a */
        private static final AtomicReference<a> f12414a = new AtomicReference<>();

        private a() {
        }

        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = f12414a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (e2.c.a(atomicReference, null, aVar)) {
                    com.google.android.gms.common.api.internal.c.c(application);
                    com.google.android.gms.common.api.internal.c.b().a(aVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.c.a
        public void a(boolean z10) {
            c.r(z10);
        }
    }

    public c(Context context, @dc.b ScheduledExecutorService scheduledExecutorService, g gVar, fe.f fVar, ac.c cVar, ee.b<cc.a> bVar) {
        this(context, scheduledExecutorService, gVar, fVar, cVar, bVar, true);
    }

    protected c(Context context, ScheduledExecutorService scheduledExecutorService, g gVar, fe.f fVar, ac.c cVar, ee.b<cc.a> bVar, boolean z10) {
        this.f12405a = new HashMap();
        this.f12413i = new HashMap();
        this.f12406b = context;
        this.f12407c = scheduledExecutorService;
        this.f12408d = gVar;
        this.f12409e = fVar;
        this.f12410f = cVar;
        this.f12411g = bVar;
        this.f12412h = gVar.r().c();
        a.c(context);
        if (z10) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                public /* synthetic */ b() {
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.this.g();
                }
            });
        }
    }

    private com.google.firebase.remoteconfig.internal.f f(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.f.h(this.f12407c, u.c(this.f12406b, String.format("%s_%s_%s_%s.json", "frc", this.f12412h, str, str2)));
    }

    private o j(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new o(this.f12407c, fVar, fVar2);
    }

    static p k(Context context, String str, String str2) {
        return new p(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static x l(g gVar, String str, ee.b<cc.a> bVar) {
        if (p(gVar) && str.equals("firebase")) {
            return new x(bVar);
        }
        return null;
    }

    private e n(com.google.firebase.remoteconfig.internal.f fVar, o oVar) {
        return new e(fVar, af.a.a(oVar), this.f12407c);
    }

    private static boolean o(g gVar, String str) {
        return str.equals("firebase") && p(gVar);
    }

    private static boolean p(g gVar) {
        return gVar.q().equals("[DEFAULT]");
    }

    public static /* synthetic */ cc.a q() {
        return null;
    }

    public static synchronized void r(boolean z10) {
        synchronized (c.class) {
            Iterator<com.google.firebase.remoteconfig.a> it = f12404l.values().iterator();
            while (it.hasNext()) {
                it.next().p(z10);
            }
        }
    }

    @Override // bf.a
    public void a(String str, cf.f fVar) {
        d(str).j().h(fVar);
    }

    public synchronized com.google.firebase.remoteconfig.a d(String str) {
        com.google.firebase.remoteconfig.internal.f f10;
        com.google.firebase.remoteconfig.internal.f f11;
        com.google.firebase.remoteconfig.internal.f f12;
        p k10;
        o j10;
        f10 = f(str, "fetch");
        f11 = f(str, "activate");
        f12 = f(str, "defaults");
        k10 = k(this.f12406b, this.f12412h, str);
        j10 = j(f11, f12);
        x l10 = l(this.f12408d, str, this.f12411g);
        if (l10 != null) {
            j10.b(new d() { // from class: ze.o
                public /* synthetic */ o() {
                }

                @Override // la.d
                public final void accept(Object obj, Object obj2) {
                    x.this.a((String) obj, (com.google.firebase.remoteconfig.internal.g) obj2);
                }
            });
        }
        return e(this.f12408d, str, this.f12409e, this.f12410f, this.f12407c, f10, f11, f12, h(str, f10, k10), j10, k10, n(f11, j10));
    }

    synchronized com.google.firebase.remoteconfig.a e(g gVar, String str, fe.f fVar, ac.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, m mVar, o oVar, p pVar, e eVar) {
        if (!this.f12405a.containsKey(str)) {
            com.google.firebase.remoteconfig.a aVar = new com.google.firebase.remoteconfig.a(this.f12406b, gVar, fVar, o(gVar, str) ? cVar : null, executor, fVar2, fVar3, fVar4, mVar, oVar, pVar, m(gVar, fVar, mVar, fVar3, this.f12406b, str, pVar), eVar);
            aVar.q();
            this.f12405a.put(str, aVar);
            f12404l.put(str, aVar);
        }
        return this.f12405a.get(str);
    }

    public com.google.firebase.remoteconfig.a g() {
        return d("firebase");
    }

    synchronized m h(String str, com.google.firebase.remoteconfig.internal.f fVar, p pVar) {
        return new m(this.f12409e, p(this.f12408d) ? this.f12411g : new ee.b() { // from class: ze.p
            @Override // ee.b
            public final Object get() {
                cc.a q10;
                q10 = com.google.firebase.remoteconfig.c.q();
                return q10;
            }
        }, this.f12407c, f12402j, f12403k, fVar, i(this.f12408d.r().b(), str, pVar), pVar, this.f12413i);
    }

    ConfigFetchHttpClient i(String str, String str2, p pVar) {
        return new ConfigFetchHttpClient(this.f12406b, this.f12408d.r().c(), str, str2, pVar.b(), pVar.b());
    }

    synchronized q m(g gVar, fe.f fVar, m mVar, com.google.firebase.remoteconfig.internal.f fVar2, Context context, String str, p pVar) {
        return new q(gVar, fVar, mVar, fVar2, context, str, pVar, this.f12407c);
    }
}
