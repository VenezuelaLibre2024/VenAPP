package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C6196c;
import com.google.firebase.installations.C6197d;
import ee.InterfaceC7183b;
import ge.InterfaceC7557a;
import ge.InterfaceC7558b;
import ie.AbstractC7964d;
import ie.AbstractC7966f;
import ie.C7963c;
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
import p106fe.C7339h;
import p106fe.InterfaceC7337f;
import p140he.AbstractC7717d;
import p140he.C7715b;
import p140he.C7716c;
import p273od.InterfaceC9919i;
import p294pc.C10156w;
import p485zb.C12867g;

/* renamed from: com.google.firebase.installations.c */
/* loaded from: classes.dex */
public class C6196c implements InterfaceC7337f {

    /* renamed from: m */
    private static final Object f13185m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f13186n = new a();

    /* renamed from: a */
    private final C12867g f13187a;

    /* renamed from: b */
    private final C7963c f13188b;

    /* renamed from: c */
    private final C7716c f13189c;

    /* renamed from: d */
    private final C6202i f13190d;

    /* renamed from: e */
    private final C10156w<C7715b> f13191e;

    /* renamed from: f */
    private final C7339h f13192f;

    /* renamed from: g */
    private final Object f13193g;

    /* renamed from: h */
    private final ExecutorService f13194h;

    /* renamed from: i */
    private final Executor f13195i;

    /* renamed from: j */
    private String f13196j;

    /* renamed from: k */
    private Set<InterfaceC7557a> f13197k;

    /* renamed from: l */
    private final List<InterfaceC6201h> f13198l;

    /* renamed from: com.google.firebase.installations.c$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f13199a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f13199a.getAndIncrement())));
        }
    }

    /* renamed from: com.google.firebase.installations.c$b */
    /* loaded from: classes.dex */
    class b implements InterfaceC7558b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC7557a f13200a;

        b(InterfaceC7557a interfaceC7557a) {
            this.f13200a = interfaceC7557a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.c$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f13202a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13203b;

        static {
            int[] iArr = new int[AbstractC7966f.b.values().length];
            f13203b = iArr;
            try {
                iArr[AbstractC7966f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13203b[AbstractC7966f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13203b[AbstractC7966f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC7964d.b.values().length];
            f13202a = iArr2;
            try {
                iArr2[AbstractC7964d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13202a[AbstractC7964d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    C6196c(ExecutorService executorService, Executor executor, C12867g c12867g, C7963c c7963c, C7716c c7716c, C6202i c6202i, C10156w<C7715b> c10156w, C7339h c7339h) {
        this.f13193g = new Object();
        this.f13197k = new HashSet();
        this.f13198l = new ArrayList();
        this.f13187a = c12867g;
        this.f13188b = c7963c;
        this.f13189c = c7716c;
        this.f13190d = c6202i;
        this.f13191e = c10156w;
        this.f13192f = c7339h;
        this.f13194h = executorService;
        this.f13195i = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6196c(final C12867g c12867g, InterfaceC7183b<InterfaceC9919i> interfaceC7183b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c12867g, new C7963c(c12867g.m42630m(), interfaceC7183b), new C7716c(c12867g), C6202i.m16862c(), new C10156w(new InterfaceC7183b() { // from class: fe.d
            @Override // ee.InterfaceC7183b
            public final Object get() {
                C7715b m16824B;
                m16824B = C6196c.m16824B(C12867g.this);
                return m16824B;
            }
        }), new C7339h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static /* synthetic */ C7715b m16824B(C12867g c12867g) {
        return new C7715b(c12867g);
    }

    /* renamed from: C */
    private void m16825C() {
        C5276s.m13321g(m16857p(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C5276s.m13321g(m16858w(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C5276s.m13321g(m16856o(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C5276s.m13316b(C6202i.m16865h(m16857p()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C5276s.m13316b(C6202i.m16864g(m16856o()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: D */
    private String m16826D(AbstractC7717d abstractC7717d) {
        if ((!this.f13187a.m42631q().equals("CHIME_ANDROID_SDK") && !this.f13187a.m42635y()) || !abstractC7717d.m23531m()) {
            return this.f13192f.m22035a();
        }
        String m23520f = m16845r().m23520f();
        return TextUtils.isEmpty(m23520f) ? this.f13192f.m22035a() : m23520f;
    }

    /* renamed from: F */
    private AbstractC7717d m16827F(AbstractC7717d abstractC7717d) {
        AbstractC7964d m24490d = this.f13188b.m24490d(m16856o(), abstractC7717d.mo23499d(), m16858w(), m16857p(), (abstractC7717d.mo23499d() == null || abstractC7717d.mo23499d().length() != 11) ? null : m16845r().m23521i());
        int i10 = c.f13202a[m24490d.mo24458e().ordinal()];
        if (i10 == 1) {
            return abstractC7717d.m23536s(m24490d.mo24456c(), m24490d.mo24457d(), this.f13190d.m16867b(), m24490d.mo24455b().mo24467c(), m24490d.mo24455b().mo24468d());
        }
        if (i10 == 2) {
            return abstractC7717d.m23534q("BAD CONFIG");
        }
        throw new C6197d("Firebase Installations Service is unavailable. Please try again later.", C6197d.a.UNAVAILABLE);
    }

    /* renamed from: G */
    private void m16828G(Exception exc) {
        synchronized (this.f13193g) {
            Iterator<InterfaceC6201h> it = this.f13198l.iterator();
            while (it.hasNext()) {
                if (it.next().mo16859a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: H */
    private void m16829H(AbstractC7717d abstractC7717d) {
        synchronized (this.f13193g) {
            Iterator<InterfaceC6201h> it = this.f13198l.iterator();
            while (it.hasNext()) {
                if (it.next().mo16860b(abstractC7717d)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: I */
    private synchronized void m16830I(String str) {
        this.f13196j = str;
    }

    /* renamed from: J */
    private synchronized void m16831J(AbstractC7717d abstractC7717d, AbstractC7717d abstractC7717d2) {
        if (this.f13197k.size() != 0 && !TextUtils.equals(abstractC7717d.mo23499d(), abstractC7717d2.mo23499d())) {
            Iterator<InterfaceC7557a> it = this.f13197k.iterator();
            while (it.hasNext()) {
                it.next().mo22939a(abstractC7717d2.mo23499d());
            }
        }
    }

    /* renamed from: g */
    private Task<AbstractC6200g> m16837g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m16839i(new C6198e(this.f13190d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: h */
    private Task<String> m16838h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m16839i(new C6199f(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: i */
    private void m16839i(InterfaceC6201h interfaceC6201h) {
        synchronized (this.f13193g) {
            this.f13198l.add(interfaceC6201h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public Void m16840k() {
        m16830I(null);
        AbstractC7717d m16848u = m16848u();
        if (m16848u.m23529k()) {
            this.f13188b.m24491e(m16856o(), m16848u.mo23499d(), m16858w(), m16848u.mo23501f());
        }
        m16850x(m16848u.m23535r());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m16851y(boolean r3) {
        /*
            r2 = this;
            he.d r0 = r2.m16848u()
            boolean r1 = r0.m23527i()     // Catch: com.google.firebase.installations.C6197d -> L5c
            if (r1 != 0) goto L22
            boolean r1 = r0.m23530l()     // Catch: com.google.firebase.installations.C6197d -> L5c
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.i r3 = r2.f13190d     // Catch: com.google.firebase.installations.C6197d -> L5c
            boolean r3 = r3.m16869f(r0)     // Catch: com.google.firebase.installations.C6197d -> L5c
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            he.d r3 = r2.m16843n(r0)     // Catch: com.google.firebase.installations.C6197d -> L5c
            goto L26
        L22:
            he.d r3 = r2.m16827F(r0)     // Catch: com.google.firebase.installations.C6197d -> L5c
        L26:
            r2.m16850x(r3)
            r2.m16831J(r0, r3)
            boolean r0 = r3.m23529k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.mo23499d()
            r2.m16830I(r0)
        L39:
            boolean r0 = r3.m23527i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.C6197d.a.BAD_CONFIG
            r3.<init>(r0)
        L46:
            r2.m16828G(r3)
            goto L5b
        L4a:
            boolean r0 = r3.m23528j()
            if (r0 == 0) goto L58
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L46
        L58:
            r2.m16829H(r3)
        L5b:
            return
        L5c:
            r3 = move-exception
            r2.m16828G(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C6196c.m16851y(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void m16823A(final boolean z10) {
        AbstractC7717d m16849v = m16849v();
        if (z10) {
            m16849v = m16849v.m23533p();
        }
        m16829H(m16849v);
        this.f13195i.execute(new Runnable() { // from class: fe.e
            @Override // java.lang.Runnable
            public final void run() {
                C6196c.this.m16851y(z10);
            }
        });
    }

    /* renamed from: n */
    private AbstractC7717d m16843n(AbstractC7717d abstractC7717d) {
        AbstractC7966f m24492f = this.f13188b.m24492f(m16856o(), abstractC7717d.mo23499d(), m16858w(), abstractC7717d.mo23501f());
        int i10 = c.f13203b[m24492f.mo24466b().ordinal()];
        if (i10 == 1) {
            return abstractC7717d.m23532o(m24492f.mo24467c(), m24492f.mo24468d(), this.f13190d.m16867b());
        }
        if (i10 == 2) {
            return abstractC7717d.m23534q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new C6197d("Firebase Installations Service is unavailable. Please try again later.", C6197d.a.UNAVAILABLE);
        }
        m16830I(null);
        return abstractC7717d.m23535r();
    }

    /* renamed from: q */
    private synchronized String m16844q() {
        return this.f13196j;
    }

    /* renamed from: r */
    private C7715b m16845r() {
        return this.f13191e.get();
    }

    /* renamed from: s */
    public static C6196c m16846s() {
        return m16847t(C12867g.m42617o());
    }

    /* renamed from: t */
    public static C6196c m16847t(C12867g c12867g) {
        C5276s.m13316b(c12867g != null, "Null is not a valid value of FirebaseApp.");
        return (C6196c) c12867g.m42629k(InterfaceC7337f.class);
    }

    /* renamed from: u */
    private AbstractC7717d m16848u() {
        AbstractC7717d m23525d;
        synchronized (f13185m) {
            C6195b m16821a = C6195b.m16821a(this.f13187a.m42630m(), "generatefid.lock");
            try {
                m23525d = this.f13189c.m23525d();
            } finally {
                if (m16821a != null) {
                    m16821a.m16822b();
                }
            }
        }
        return m23525d;
    }

    /* renamed from: v */
    private AbstractC7717d m16849v() {
        AbstractC7717d m23525d;
        synchronized (f13185m) {
            C6195b m16821a = C6195b.m16821a(this.f13187a.m42630m(), "generatefid.lock");
            try {
                m23525d = this.f13189c.m23525d();
                if (m23525d.m23528j()) {
                    m23525d = this.f13189c.m23524b(m23525d.m23537t(m16826D(m23525d)));
                }
            } finally {
                if (m16821a != null) {
                    m16821a.m16822b();
                }
            }
        }
        return m23525d;
    }

    /* renamed from: x */
    private void m16850x(AbstractC7717d abstractC7717d) {
        synchronized (f13185m) {
            C6195b m16821a = C6195b.m16821a(this.f13187a.m42630m(), "generatefid.lock");
            try {
                this.f13189c.m23524b(abstractC7717d);
            } finally {
                if (m16821a != null) {
                    m16821a.m16822b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m16852z() {
        m16823A(false);
    }

    /* renamed from: E */
    public synchronized InterfaceC7558b m16853E(InterfaceC7557a interfaceC7557a) {
        this.f13197k.add(interfaceC7557a);
        return new b(interfaceC7557a);
    }

    @Override // p106fe.InterfaceC7337f
    /* renamed from: a */
    public Task<AbstractC6200g> mo16854a(final boolean z10) {
        m16825C();
        Task<AbstractC6200g> m16837g = m16837g();
        this.f13194h.execute(new Runnable() { // from class: fe.b
            @Override // java.lang.Runnable
            public final void run() {
                C6196c.this.m16823A(z10);
            }
        });
        return m16837g;
    }

    @Override // p106fe.InterfaceC7337f
    public Task<String> getId() {
        m16825C();
        String m16844q = m16844q();
        if (m16844q != null) {
            return Tasks.forResult(m16844q);
        }
        Task<String> m16838h = m16838h();
        this.f13194h.execute(new Runnable() { // from class: fe.c
            @Override // java.lang.Runnable
            public final void run() {
                C6196c.this.m16852z();
            }
        });
        return m16838h;
    }

    /* renamed from: j */
    public Task<Void> m16855j() {
        return Tasks.call(this.f13194h, new Callable() { // from class: fe.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m16840k;
                m16840k = C6196c.this.m16840k();
                return m16840k;
            }
        });
    }

    /* renamed from: o */
    String m16856o() {
        return this.f13187a.m42632r().m42643b();
    }

    /* renamed from: p */
    String m16857p() {
        return this.f13187a.m42632r().m42644c();
    }

    /* renamed from: w */
    String m16858w() {
        return this.f13187a.m42632r().m42648g();
    }
}
