package p406vl;

import ck.C2017b;
import ck.C2037v;
import dm.C7054a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.C9322n;
import p319ql.AbstractC10543r;
import p319ql.C10520a;
import p319ql.C10521a0;
import p319ql.C10525c0;
import p319ql.C10532g;
import p319ql.C10541p;
import p319ql.C10546u;
import p319ql.C10550y;
import p319ql.InterfaceC10528e;
import p319ql.InterfaceC10530f;
import p341rl.C10727d;
import p428wl.C12244g;
import p495zl.C13148j;

/* renamed from: vl.e */
/* loaded from: classes3.dex */
public final class C11978e implements InterfaceC10528e {

    /* renamed from: A */
    private volatile boolean f31778A;

    /* renamed from: B */
    private volatile C11976c f31779B;

    /* renamed from: C */
    private volatile C11979f f31780C;

    /* renamed from: a */
    private final C10550y f31781a;

    /* renamed from: b */
    private final C10521a0 f31782b;

    /* renamed from: c */
    private final boolean f31783c;

    /* renamed from: d */
    private final C11980g f31784d;

    /* renamed from: e */
    private final AbstractC10543r f31785e;

    /* renamed from: f */
    private final c f31786f;

    /* renamed from: r */
    private final AtomicBoolean f31787r;

    /* renamed from: s */
    private Object f31788s;

    /* renamed from: t */
    private C11977d f31789t;

    /* renamed from: u */
    private C11979f f31790u;

    /* renamed from: v */
    private boolean f31791v;

    /* renamed from: w */
    private C11976c f31792w;

    /* renamed from: x */
    private boolean f31793x;

    /* renamed from: y */
    private boolean f31794y;

    /* renamed from: z */
    private boolean f31795z;

    /* renamed from: vl.e$a */
    /* loaded from: classes3.dex */
    public final class a implements Runnable {

        /* renamed from: a */
        private final InterfaceC10530f f31796a;

        /* renamed from: b */
        private volatile AtomicInteger f31797b;

        /* renamed from: c */
        final /* synthetic */ C11978e f31798c;

        public a(C11978e this$0, InterfaceC10530f responseCallback) {
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(responseCallback, "responseCallback");
            this.f31798c = this$0;
            this.f31796a = responseCallback;
            this.f31797b = new AtomicInteger(0);
        }

        /* renamed from: a */
        public final void m38455a(ExecutorService executorService) {
            C9322n.m27781e(executorService, "executorService");
            C10541p m31982l = this.f31798c.m38442k().m31982l();
            if (C10727d.f27165h && Thread.holdsLock(m31982l)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + m31982l);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f31798c.m38451v(interruptedIOException);
                    this.f31796a.mo17474b(this.f31798c, interruptedIOException);
                    this.f31798c.m38442k().m31982l().m31800g(this);
                }
            } catch (Throwable th2) {
                this.f31798c.m38442k().m31982l().m31800g(this);
                throw th2;
            }
        }

        /* renamed from: b */
        public final C11978e m38456b() {
            return this.f31798c;
        }

        /* renamed from: c */
        public final AtomicInteger m38457c() {
            return this.f31797b;
        }

        /* renamed from: d */
        public final String m38458d() {
            return this.f31798c.m38447r().m31608i().m31874h();
        }

        /* renamed from: e */
        public final void m38459e(a other) {
            C9322n.m27781e(other, "other");
            this.f31797b = other.f31797b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th2;
            IOException e10;
            C10541p m31982l;
            String m27787k = C9322n.m27787k("OkHttp ", this.f31798c.m38452w());
            C11978e c11978e = this.f31798c;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(m27787k);
            try {
                c11978e.f31786f.m20671t();
                try {
                    try {
                        z10 = true;
                    } catch (IOException e11) {
                        z10 = false;
                        e10 = e11;
                    } catch (Throwable th3) {
                        z10 = false;
                        th2 = th3;
                    }
                    try {
                        this.f31796a.mo17473a(c11978e, c11978e.m38448s());
                        m31982l = c11978e.m38442k().m31982l();
                    } catch (IOException e12) {
                        e10 = e12;
                        if (z10) {
                            C13148j.f35535a.m43385g().m43375j(C9322n.m27787k("Callback failure for ", c11978e.m38430D()), 4, e10);
                        } else {
                            this.f31796a.mo17474b(c11978e, e10);
                        }
                        m31982l = c11978e.m38442k().m31982l();
                        m31982l.m31800g(this);
                    } catch (Throwable th4) {
                        th2 = th4;
                        c11978e.cancel();
                        if (!z10) {
                            IOException iOException = new IOException(C9322n.m27787k("canceled due to ", th2));
                            C2017b.m10328a(iOException, th2);
                            this.f31796a.mo17474b(c11978e, iOException);
                        }
                        throw th2;
                    }
                    m31982l.m31800g(this);
                } catch (Throwable th5) {
                    c11978e.m38442k().m31982l().m31800g(this);
                    throw th5;
                }
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* renamed from: vl.e$b */
    /* loaded from: classes3.dex */
    public static final class b extends WeakReference<C11978e> {

        /* renamed from: a */
        private final Object f31799a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C11978e referent, Object obj) {
            super(referent);
            C9322n.m27781e(referent, "referent");
            this.f31799a = obj;
        }

        /* renamed from: a */
        public final Object m38460a() {
            return this.f31799a;
        }
    }

    /* renamed from: vl.e$c */
    /* loaded from: classes3.dex */
    public static final class c extends C7054a {
        c() {
        }

        @Override // dm.C7054a
        /* renamed from: z */
        protected void mo20676z() {
            C11978e.this.cancel();
        }
    }

    public C11978e(C10550y client, C10521a0 originalRequest, boolean z10) {
        C9322n.m27781e(client, "client");
        C9322n.m27781e(originalRequest, "originalRequest");
        this.f31781a = client;
        this.f31782b = originalRequest;
        this.f31783c = z10;
        this.f31784d = client.m31979i().m31748a();
        this.f31785e = client.m31984p().mo31835a(this);
        c cVar = new c();
        cVar.mo20792g(m38442k().m31976e(), TimeUnit.MILLISECONDS);
        this.f31786f = cVar;
        this.f31787r = new AtomicBoolean();
        this.f31795z = true;
    }

    /* renamed from: C */
    private final <E extends IOException> E m38429C(E e10) {
        if (this.f31791v || !this.f31786f.m20672u()) {
            return e10;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e10 != null) {
            interruptedIOException.initCause(e10);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final String m38430D() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo31713R0() ? "canceled " : "");
        sb2.append(this.f31783c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(m38452w());
        return sb2.toString();
    }

    /* renamed from: d */
    private final <E extends IOException> E m38433d(E e10) {
        Socket m38453x;
        boolean z10 = C10727d.f27165h;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        C11979f c11979f = this.f31790u;
        if (c11979f != null) {
            if (z10 && Thread.holdsLock(c11979f)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + c11979f);
            }
            synchronized (c11979f) {
                m38453x = m38453x();
            }
            if (this.f31790u == null) {
                if (m38453x != null) {
                    C10727d.m32654n(m38453x);
                }
                this.f31785e.m31819k(this, c11979f);
            } else {
                if (!(m38453x == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e11 = (E) m38429C(e10);
        if (e10 != null) {
            AbstractC10543r abstractC10543r = this.f31785e;
            C9322n.m27778b(e11);
            abstractC10543r.m31812d(this, e11);
        } else {
            this.f31785e.m31811c(this);
        }
        return e11;
    }

    /* renamed from: e */
    private final void m38434e() {
        this.f31788s = C13148j.f35535a.m43385g().mo43347h("response.body().close()");
        this.f31785e.m31813e(this);
    }

    /* renamed from: h */
    private final C10520a m38435h(C10546u c10546u) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C10532g c10532g;
        if (c10546u.m31875i()) {
            sSLSocketFactory = this.f31781a.m31972G();
            hostnameVerifier = this.f31781a.m31988t();
            c10532g = this.f31781a.m31977g();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            c10532g = null;
        }
        return new C10520a(c10546u.m31874h(), c10546u.m31878m(), this.f31781a.m31983m(), this.f31781a.m31971F(), sSLSocketFactory, hostnameVerifier, c10532g, this.f31781a.m31967B(), this.f31781a.m31966A(), this.f31781a.m31993z(), this.f31781a.m31980j(), this.f31781a.m31968C());
    }

    /* renamed from: A */
    public final void m38436A(C11979f c11979f) {
        this.f31780C = c11979f;
    }

    /* renamed from: B */
    public final void m38437B() {
        if (!(!this.f31791v)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f31791v = true;
        this.f31786f.m20672u();
    }

    @Override // p319ql.InterfaceC10528e
    /* renamed from: Q */
    public void mo31712Q(InterfaceC10530f responseCallback) {
        C9322n.m27781e(responseCallback, "responseCallback");
        if (!this.f31787r.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        m38434e();
        this.f31781a.m31982l().m31797b(new a(this, responseCallback));
    }

    @Override // p319ql.InterfaceC10528e
    /* renamed from: R0 */
    public boolean mo31713R0() {
        return this.f31778A;
    }

    /* renamed from: c */
    public final void m38438c(C11979f connection) {
        C9322n.m27781e(connection, "connection");
        if (!C10727d.f27165h || Thread.holdsLock(connection)) {
            if (!(this.f31790u == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f31790u = connection;
            connection.m38481n().add(new b(this, this.f31788s));
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
    }

    @Override // p319ql.InterfaceC10528e
    public void cancel() {
        if (this.f31778A) {
            return;
        }
        this.f31778A = true;
        C11976c c11976c = this.f31779B;
        if (c11976c != null) {
            c11976c.m38400b();
        }
        C11979f c11979f = this.f31780C;
        if (c11979f != null) {
            c11979f.m38478d();
        }
        this.f31785e.m31814f(this);
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C11978e clone() {
        return new C11978e(this.f31781a, this.f31782b, this.f31783c);
    }

    /* renamed from: i */
    public final void m38440i(C10521a0 request, boolean z10) {
        C9322n.m27781e(request, "request");
        if (!(this.f31792w == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f31794y)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f31793x)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            C2037v c2037v = C2037v.f8089a;
        }
        if (z10) {
            this.f31789t = new C11977d(this.f31784d, m38435h(request.m31608i()), this, this.f31785e);
        }
    }

    /* renamed from: j */
    public final void m38441j(boolean z10) {
        C11976c c11976c;
        synchronized (this) {
            if (!this.f31795z) {
                throw new IllegalStateException("released".toString());
            }
            C2037v c2037v = C2037v.f8089a;
        }
        if (z10 && (c11976c = this.f31779B) != null) {
            c11976c.m38402d();
        }
        this.f31792w = null;
    }

    /* renamed from: k */
    public final C10550y m38442k() {
        return this.f31781a;
    }

    /* renamed from: l */
    public final C11979f m38443l() {
        return this.f31790u;
    }

    /* renamed from: m */
    public final AbstractC10543r m38444m() {
        return this.f31785e;
    }

    @Override // p319ql.InterfaceC10528e
    /* renamed from: n */
    public C10525c0 mo31714n() {
        if (!this.f31787r.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f31786f.m20671t();
        m38434e();
        try {
            this.f31781a.m31982l().m31798c(this);
            return m38448s();
        } finally {
            this.f31781a.m31982l().m31801h(this);
        }
    }

    @Override // p319ql.InterfaceC10528e
    /* renamed from: o */
    public C10521a0 mo31715o() {
        return this.f31782b;
    }

    /* renamed from: p */
    public final boolean m38445p() {
        return this.f31783c;
    }

    /* renamed from: q */
    public final C11976c m38446q() {
        return this.f31792w;
    }

    /* renamed from: r */
    public final C10521a0 m38447r() {
        return this.f31782b;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p319ql.C10525c0 m38448s() {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ql.y r0 = r12.f31781a
            java.util.List r0 = r0.m31989u()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            dk.C7027p.m20558u(r2, r0)
            wl.j r0 = new wl.j
            ql.y r1 = r12.f31781a
            r0.<init>(r1)
            r2.add(r0)
            wl.a r0 = new wl.a
            ql.y r1 = r12.f31781a
            ql.n r1 = r1.m31981k()
            r0.<init>(r1)
            r2.add(r0)
            tl.a r0 = new tl.a
            ql.y r1 = r12.f31781a
            r1.m31975d()
            r9 = 0
            r0.<init>(r9)
            r2.add(r0)
            vl.a r0 = p406vl.C11974a.f31745a
            r2.add(r0)
            boolean r0 = r12.f31783c
            if (r0 != 0) goto L4a
            ql.y r0 = r12.f31781a
            java.util.List r0 = r0.m31990v()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            dk.C7027p.m20558u(r2, r0)
        L4a:
            wl.b r0 = new wl.b
            boolean r1 = r12.f31783c
            r0.<init>(r1)
            r2.add(r0)
            wl.g r10 = new wl.g
            r3 = 0
            r4 = 0
            ql.a0 r5 = r12.f31782b
            ql.y r0 = r12.f31781a
            int r6 = r0.m31978h()
            ql.y r0 = r12.f31781a
            int r7 = r0.m31969D()
            ql.y r0 = r12.f31781a
            int r8 = r0.m31973I()
            r0 = r10
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            ql.a0 r1 = r12.f31782b     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            ql.c0 r1 = r10.mo31939a(r1)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            boolean r2 = r12.mo31713R0()     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            if (r2 != 0) goto L82
            r12.m38451v(r9)
            return r1
        L82:
            p341rl.C10727d.m32653m(r1)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            throw r1     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
        L8d:
            r1 = move-exception
            goto La4
        L8f:
            r0 = move-exception
            r1 = 1
            java.io.IOException r0 = r12.m38451v(r0)     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto L9f
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> La0
            throw r0     // Catch: java.lang.Throwable -> La0
        L9f:
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
        La4:
            if (r0 != 0) goto La9
            r12.m38451v(r9)
        La9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p406vl.C11978e.m38448s():ql.c0");
    }

    /* renamed from: t */
    public final C11976c m38449t(C12244g chain) {
        C9322n.m27781e(chain, "chain");
        synchronized (this) {
            if (!this.f31795z) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f31794y)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f31793x)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            C2037v c2037v = C2037v.f8089a;
        }
        C11977d c11977d = this.f31789t;
        C9322n.m27778b(c11977d);
        C11976c c11976c = new C11976c(this, this.f31785e, c11977d, c11977d.m38424a(this.f31781a, chain));
        this.f31792w = c11976c;
        this.f31779B = c11976c;
        synchronized (this) {
            this.f31793x = true;
            this.f31794y = true;
        }
        if (this.f31778A) {
            throw new IOException("Canceled");
        }
        return c11976c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:44:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001b), top: B:43:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:44:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001b), top: B:43:0x0012 }] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E m38450u(p406vl.C11976c r2, boolean r3, boolean r4, E r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.C9322n.m27781e(r2, r0)
            vl.c r0 = r1.f31779B
            boolean r2 = kotlin.jvm.internal.C9322n.m27777a(r2, r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.f31793x     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L5a
        L19:
            if (r4 == 0) goto L41
            boolean r0 = r1.f31794y     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L41
        L1f:
            if (r3 == 0) goto L23
            r1.f31793x = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.f31794y = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.f31793x     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.f31794y     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.f31794y     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.f31795z     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L42
        L41:
            r3 = r2
        L42:
            ck.v r4 = ck.C2037v.f8089a     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            if (r2 == 0) goto L52
            r2 = 0
            r1.f31779B = r2
            vl.f r2 = r1.f31790u
            if (r2 != 0) goto L4f
            goto L52
        L4f:
            r2.m38486s()
        L52:
            if (r3 == 0) goto L59
            java.io.IOException r2 = r1.m38433d(r5)
            return r2
        L59:
            return r5
        L5a:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p406vl.C11978e.m38450u(vl.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: v */
    public final IOException m38451v(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f31795z) {
                this.f31795z = false;
                if (!this.f31793x && !this.f31794y) {
                    z10 = true;
                }
            }
            C2037v c2037v = C2037v.f8089a;
        }
        return z10 ? m38433d(iOException) : iOException;
    }

    /* renamed from: w */
    public final String m38452w() {
        return this.f31782b.m31608i().m31880o();
    }

    /* renamed from: x */
    public final Socket m38453x() {
        C11979f c11979f = this.f31790u;
        C9322n.m27778b(c11979f);
        if (C10727d.f27165h && !Thread.holdsLock(c11979f)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + c11979f);
        }
        List<Reference<C11978e>> m38481n = c11979f.m38481n();
        Iterator<Reference<C11978e>> it = m38481n.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (C9322n.m27777a(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (!(i10 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        m38481n.remove(i10);
        this.f31790u = null;
        if (m38481n.isEmpty()) {
            c11979f.m38472B(System.nanoTime());
            if (this.f31784d.m38499c(c11979f)) {
                return c11979f.m38474D();
            }
        }
        return null;
    }

    /* renamed from: z */
    public final boolean m38454z() {
        C11977d c11977d = this.f31789t;
        C9322n.m27778b(c11977d);
        return c11977d.m38426e();
    }
}
