package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.d;
import ie.d;
import ie.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import pc.w;

/* loaded from: classes.dex */
public class c implements fe.f {

    /* renamed from: m */
    private static final Object f11970m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f11971n = new a();

    /* renamed from: a */
    private final zb.g f11972a;

    /* renamed from: b */
    private final ie.c f11973b;

    /* renamed from: c */
    private final he.c f11974c;

    /* renamed from: d */
    private final i f11975d;

    /* renamed from: e */
    private final w<he.b> f11976e;

    /* renamed from: f */
    private final fe.h f11977f;

    /* renamed from: g */
    private final Object f11978g;

    /* renamed from: h */
    private final ExecutorService f11979h;

    /* renamed from: i */
    private final Executor f11980i;

    /* renamed from: j */
    private String f11981j;

    /* renamed from: k */
    private Set<ge.a> f11982k;

    /* renamed from: l */
    private final List<h> f11983l;

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f11984a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f11984a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ge.b {

        /* renamed from: a */
        final /* synthetic */ ge.a f11985a;

        b(ge.a aVar) {
            this.f11985a = aVar;
        }
    }

    /* renamed from: com.google.firebase.installations.c$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0176c {

        /* renamed from: a */
        static final /* synthetic */ int[] f11987a;

        /* renamed from: b */
        static final /* synthetic */ int[] f11988b;

        static {
            int[] iArr = new int[f.b.values().length];
            f11988b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11988b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11988b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f11987a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11987a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(ExecutorService executorService, Executor executor, zb.g gVar, ie.c cVar, he.c cVar2, i iVar, w<he.b> wVar, fe.h hVar) {
        this.f11978g = new Object();
        this.f11982k = new HashSet();
        this.f11983l = new ArrayList();
        this.f11972a = gVar;
        this.f11973b = cVar;
        this.f11974c = cVar2;
        this.f11975d = iVar;
        this.f11976e = wVar;
        this.f11977f = hVar;
        this.f11979h = executorService;
        this.f11980i = executor;
    }

    public c(zb.g gVar, ee.b<od.i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, gVar, new ie.c(gVar.m(), bVar), new he.c(gVar), i.c(), new w(new ee.b() { // from class: fe.d
            public /* synthetic */ d() {
            }

            @Override // ee.b
            public final Object get() {
                he.b B;
                B = com.google.firebase.installations.c.B(zb.g.this);
                return B;
            }
        }), new fe.h());
    }

    public static /* synthetic */ he.b B(zb.g gVar) {
        return new he.b(gVar);
    }

    private void C() {
        s.g(p(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.g(w(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.g(o(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.b(i.h(p()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.b(i.g(o()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String D(he.d dVar) {
        if ((!this.f11972a.q().equals("CHIME_ANDROID_SDK") && !this.f11972a.y()) || !dVar.m()) {
            return this.f11977f.a();
        }
        String f10 = r().f();
        return TextUtils.isEmpty(f10) ? this.f11977f.a() : f10;
    }

    private he.d F(he.d dVar) {
        ie.d d10 = this.f11973b.d(o(), dVar.d(), w(), p(), (dVar.d() == null || dVar.d().length() != 11) ? null : r().i());
        int i10 = C0176c.f11987a[d10.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(d10.c(), d10.d(), this.f11975d.b(), d10.b().c(), d10.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    private void G(Exception exc) {
        synchronized (this.f11978g) {
            Iterator<h> it = this.f11983l.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void H(he.d dVar) {
        synchronized (this.f11978g) {
            Iterator<h> it = this.f11983l.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void I(String str) {
        this.f11981j = str;
    }

    private synchronized void J(he.d dVar, he.d dVar2) {
        if (this.f11982k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<ge.a> it = this.f11982k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    private Task<g> g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i(new e(this.f11975d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i(new f(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void i(h hVar) {
        synchronized (this.f11978g) {
            this.f11983l.add(hVar);
        }
    }

    public Void k() {
        I(null);
        he.d u10 = u();
        if (u10.k()) {
            this.f11973b.e(o(), u10.d(), w(), u10.f());
        }
        x(u10.r());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(boolean r3) {
        /*
            r2 = this;
            he.d r0 = r2.u()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.d -> L5c
            if (r1 != 0) goto L22
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.d -> L5c
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.i r3 = r2.f11975d     // Catch: com.google.firebase.installations.d -> L5c
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.d -> L5c
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            he.d r3 = r2.n(r0)     // Catch: com.google.firebase.installations.d -> L5c
            goto L26
        L22:
            he.d r3 = r2.F(r0)     // Catch: com.google.firebase.installations.d -> L5c
        L26:
            r2.x(r3)
            r2.J(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.d()
            r2.I(r0)
        L39:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.d.a.BAD_CONFIG
            r3.<init>(r0)
        L46:
            r2.G(r3)
            goto L5b
        L4a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L58
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L46
        L58:
            r2.H(r3)
        L5b:
            return
        L5c:
            r3 = move-exception
            r2.G(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.y(boolean):void");
    }

    /* renamed from: m */
    public final void A(boolean z10) {
        he.d v10 = v();
        if (z10) {
            v10 = v10.p();
        }
        H(v10);
        this.f11980i.execute(new Runnable() { // from class: fe.e

            /* renamed from: b */
            public final /* synthetic */ boolean f15112b;

            public /* synthetic */ e(boolean z102) {
                r2 = z102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.y(r2);
            }
        });
    }

    private he.d n(he.d dVar) {
        ie.f f10 = this.f11973b.f(o(), dVar.d(), w(), dVar.f());
        int i10 = C0176c.f11988b[f10.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(f10.c(), f10.d(), this.f11975d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        I(null);
        return dVar.r();
    }

    private synchronized String q() {
        return this.f11981j;
    }

    private he.b r() {
        return this.f11976e.get();
    }

    public static c s() {
        return t(zb.g.o());
    }

    public static c t(zb.g gVar) {
        s.b(gVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) gVar.k(fe.f.class);
    }

    private he.d u() {
        he.d d10;
        synchronized (f11970m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f11972a.m(), "generatefid.lock");
            try {
                d10 = this.f11974c.d();
            } finally {
                if (a10 != null) {
                    a10.b();
                }
            }
        }
        return d10;
    }

    private he.d v() {
        he.d d10;
        synchronized (f11970m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f11972a.m(), "generatefid.lock");
            try {
                d10 = this.f11974c.d();
                if (d10.j()) {
                    d10 = this.f11974c.b(d10.t(D(d10)));
                }
            } finally {
                if (a10 != null) {
                    a10.b();
                }
            }
        }
        return d10;
    }

    private void x(he.d dVar) {
        synchronized (f11970m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f11972a.m(), "generatefid.lock");
            try {
                this.f11974c.b(dVar);
            } finally {
                if (a10 != null) {
                    a10.b();
                }
            }
        }
    }

    public /* synthetic */ void z() {
        A(false);
    }

    public synchronized ge.b E(ge.a aVar) {
        this.f11982k.add(aVar);
        return new b(aVar);
    }

    @Override // fe.f
    public Task<g> a(boolean z10) {
        C();
        Task<g> g10 = g();
        this.f11979h.execute(new Runnable() { // from class: fe.b

            /* renamed from: b */
            public final /* synthetic */ boolean f15108b;

            public /* synthetic */ b(boolean z102) {
                r2 = z102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.A(r2);
            }
        });
        return g10;
    }

    @Override // fe.f
    public Task<String> getId() {
        C();
        String q10 = q();
        if (q10 != null) {
            return Tasks.forResult(q10);
        }
        Task<String> h10 = h();
        this.f11979h.execute(new Runnable() { // from class: fe.c
            public /* synthetic */ c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.z();
            }
        });
        return h10;
    }

    public Task<Void> j() {
        return Tasks.call(this.f11979h, new Callable() { // from class: fe.a
            public /* synthetic */ a() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k10;
                k10 = com.google.firebase.installations.c.this.k();
                return k10;
            }
        });
    }

    String o() {
        return this.f11972a.r().b();
    }

    String p() {
        return this.f11972a.r().c();
    }

    String w() {
        return this.f11972a.r().g();
    }
}
