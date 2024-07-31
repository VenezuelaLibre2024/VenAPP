package vl;

import ck.v;
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
import kotlin.jvm.internal.n;
import ql.a0;
import ql.c0;
import ql.p;
import ql.r;
import ql.u;
import ql.y;

/* loaded from: classes3.dex */
public final class e implements ql.e {
    private volatile boolean A;
    private volatile vl.c B;
    private volatile f C;

    /* renamed from: a */
    private final y f29343a;

    /* renamed from: b */
    private final a0 f29344b;

    /* renamed from: c */
    private final boolean f29345c;

    /* renamed from: d */
    private final g f29346d;

    /* renamed from: e */
    private final r f29347e;

    /* renamed from: f */
    private final c f29348f;

    /* renamed from: r */
    private final AtomicBoolean f29349r;

    /* renamed from: s */
    private Object f29350s;

    /* renamed from: t */
    private d f29351t;

    /* renamed from: u */
    private f f29352u;

    /* renamed from: v */
    private boolean f29353v;

    /* renamed from: w */
    private vl.c f29354w;

    /* renamed from: x */
    private boolean f29355x;

    /* renamed from: y */
    private boolean f29356y;

    /* renamed from: z */
    private boolean f29357z;

    /* loaded from: classes3.dex */
    public final class a implements Runnable {

        /* renamed from: a */
        private final ql.f f29358a;

        /* renamed from: b */
        private volatile AtomicInteger f29359b;

        /* renamed from: c */
        final /* synthetic */ e f29360c;

        public a(e this$0, ql.f responseCallback) {
            n.e(this$0, "this$0");
            n.e(responseCallback, "responseCallback");
            this.f29360c = this$0;
            this.f29358a = responseCallback;
            this.f29359b = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            n.e(executorService, "executorService");
            p l10 = this.f29360c.k().l();
            if (rl.d.f25046h && Thread.holdsLock(l10)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + l10);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f29360c.v(interruptedIOException);
                    this.f29358a.b(this.f29360c, interruptedIOException);
                    this.f29360c.k().l().g(this);
                }
            } catch (Throwable th2) {
                this.f29360c.k().l().g(this);
                throw th2;
            }
        }

        public final e b() {
            return this.f29360c;
        }

        public final AtomicInteger c() {
            return this.f29359b;
        }

        public final String d() {
            return this.f29360c.r().i().h();
        }

        public final void e(a other) {
            n.e(other, "other");
            this.f29359b = other.f29359b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th2;
            IOException e10;
            p l10;
            String k10 = n.k("OkHttp ", this.f29360c.w());
            e eVar = this.f29360c;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(k10);
            try {
                eVar.f29348f.t();
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
                        this.f29358a.a(eVar, eVar.s());
                        l10 = eVar.k().l();
                    } catch (IOException e12) {
                        e10 = e12;
                        if (z10) {
                            zl.j.f32984a.g().j(n.k("Callback failure for ", eVar.D()), 4, e10);
                        } else {
                            this.f29358a.b(eVar, e10);
                        }
                        l10 = eVar.k().l();
                        l10.g(this);
                    } catch (Throwable th4) {
                        th2 = th4;
                        eVar.cancel();
                        if (!z10) {
                            IOException iOException = new IOException(n.k("canceled due to ", th2));
                            ck.b.a(iOException, th2);
                            this.f29358a.b(eVar, iOException);
                        }
                        throw th2;
                    }
                    l10.g(this);
                } catch (Throwable th5) {
                    eVar.k().l().g(this);
                    throw th5;
                }
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends WeakReference<e> {

        /* renamed from: a */
        private final Object f29361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e referent, Object obj) {
            super(referent);
            n.e(referent, "referent");
            this.f29361a = obj;
        }

        public final Object a() {
            return this.f29361a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends dm.a {
        c() {
        }

        @Override // dm.a
        protected void z() {
            e.this.cancel();
        }
    }

    public e(y client, a0 originalRequest, boolean z10) {
        n.e(client, "client");
        n.e(originalRequest, "originalRequest");
        this.f29343a = client;
        this.f29344b = originalRequest;
        this.f29345c = z10;
        this.f29346d = client.i().a();
        this.f29347e = client.p().a(this);
        c cVar = new c();
        cVar.g(k().e(), TimeUnit.MILLISECONDS);
        this.f29348f = cVar;
        this.f29349r = new AtomicBoolean();
        this.f29357z = true;
    }

    private final <E extends IOException> E C(E e10) {
        if (this.f29353v || !this.f29348f.u()) {
            return e10;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e10 != null) {
            interruptedIOException.initCause(e10);
        }
        return interruptedIOException;
    }

    public final String D() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(R0() ? "canceled " : "");
        sb2.append(this.f29345c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(w());
        return sb2.toString();
    }

    private final <E extends IOException> E d(E e10) {
        Socket x10;
        boolean z10 = rl.d.f25046h;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        f fVar = this.f29352u;
        if (fVar != null) {
            if (z10 && Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                x10 = x();
            }
            if (this.f29352u == null) {
                if (x10 != null) {
                    rl.d.n(x10);
                }
                this.f29347e.k(this, fVar);
            } else {
                if (!(x10 == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e11 = (E) C(e10);
        if (e10 != null) {
            r rVar = this.f29347e;
            n.b(e11);
            rVar.d(this, e11);
        } else {
            this.f29347e.c(this);
        }
        return e11;
    }

    private final void e() {
        this.f29350s = zl.j.f32984a.g().h("response.body().close()");
        this.f29347e.e(this);
    }

    private final ql.a h(u uVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        ql.g gVar;
        if (uVar.i()) {
            sSLSocketFactory = this.f29343a.G();
            hostnameVerifier = this.f29343a.t();
            gVar = this.f29343a.g();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new ql.a(uVar.h(), uVar.m(), this.f29343a.m(), this.f29343a.F(), sSLSocketFactory, hostnameVerifier, gVar, this.f29343a.B(), this.f29343a.A(), this.f29343a.z(), this.f29343a.j(), this.f29343a.C());
    }

    public final void A(f fVar) {
        this.C = fVar;
    }

    public final void B() {
        if (!(!this.f29353v)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f29353v = true;
        this.f29348f.u();
    }

    @Override // ql.e
    public void Q(ql.f responseCallback) {
        n.e(responseCallback, "responseCallback");
        if (!this.f29349r.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        e();
        this.f29343a.l().b(new a(this, responseCallback));
    }

    @Override // ql.e
    public boolean R0() {
        return this.A;
    }

    public final void c(f connection) {
        n.e(connection, "connection");
        if (!rl.d.f25046h || Thread.holdsLock(connection)) {
            if (!(this.f29352u == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f29352u = connection;
            connection.n().add(new b(this, this.f29350s));
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
    }

    @Override // ql.e
    public void cancel() {
        if (this.A) {
            return;
        }
        this.A = true;
        vl.c cVar = this.B;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.C;
        if (fVar != null) {
            fVar.d();
        }
        this.f29347e.f(this);
    }

    /* renamed from: g */
    public e clone() {
        return new e(this.f29343a, this.f29344b, this.f29345c);
    }

    public final void i(a0 request, boolean z10) {
        n.e(request, "request");
        if (!(this.f29354w == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f29356y)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f29355x)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            v vVar = v.f7137a;
        }
        if (z10) {
            this.f29351t = new d(this.f29346d, h(request.i()), this, this.f29347e);
        }
    }

    public final void j(boolean z10) {
        vl.c cVar;
        synchronized (this) {
            if (!this.f29357z) {
                throw new IllegalStateException("released".toString());
            }
            v vVar = v.f7137a;
        }
        if (z10 && (cVar = this.B) != null) {
            cVar.d();
        }
        this.f29354w = null;
    }

    public final y k() {
        return this.f29343a;
    }

    public final f l() {
        return this.f29352u;
    }

    public final r m() {
        return this.f29347e;
    }

    @Override // ql.e
    public c0 n() {
        if (!this.f29349r.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f29348f.t();
        e();
        try {
            this.f29343a.l().c(this);
            return s();
        } finally {
            this.f29343a.l().h(this);
        }
    }

    @Override // ql.e
    public a0 o() {
        return this.f29344b;
    }

    public final boolean p() {
        return this.f29345c;
    }

    public final vl.c q() {
        return this.f29354w;
    }

    public final a0 r() {
        return this.f29344b;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ql.c0 s() {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ql.y r0 = r12.f29343a
            java.util.List r0 = r0.u()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            dk.p.u(r2, r0)
            wl.j r0 = new wl.j
            ql.y r1 = r12.f29343a
            r0.<init>(r1)
            r2.add(r0)
            wl.a r0 = new wl.a
            ql.y r1 = r12.f29343a
            ql.n r1 = r1.k()
            r0.<init>(r1)
            r2.add(r0)
            tl.a r0 = new tl.a
            ql.y r1 = r12.f29343a
            r1.d()
            r9 = 0
            r0.<init>(r9)
            r2.add(r0)
            vl.a r0 = vl.a.f29310a
            r2.add(r0)
            boolean r0 = r12.f29345c
            if (r0 != 0) goto L4a
            ql.y r0 = r12.f29343a
            java.util.List r0 = r0.v()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            dk.p.u(r2, r0)
        L4a:
            wl.b r0 = new wl.b
            boolean r1 = r12.f29345c
            r0.<init>(r1)
            r2.add(r0)
            wl.g r10 = new wl.g
            r3 = 0
            r4 = 0
            ql.a0 r5 = r12.f29344b
            ql.y r0 = r12.f29343a
            int r6 = r0.h()
            ql.y r0 = r12.f29343a
            int r7 = r0.D()
            ql.y r0 = r12.f29343a
            int r8 = r0.I()
            r0 = r10
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            ql.a0 r1 = r12.f29344b     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            ql.c0 r1 = r10.a(r1)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            boolean r2 = r12.R0()     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            if (r2 != 0) goto L82
            r12.v(r9)
            return r1
        L82:
            rl.d.m(r1)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
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
            java.io.IOException r0 = r12.v(r0)     // Catch: java.lang.Throwable -> La0
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
            r12.v(r9)
        La9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.e.s():ql.c0");
    }

    public final vl.c t(wl.g chain) {
        n.e(chain, "chain");
        synchronized (this) {
            if (!this.f29357z) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f29356y)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f29355x)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            v vVar = v.f7137a;
        }
        d dVar = this.f29351t;
        n.b(dVar);
        vl.c cVar = new vl.c(this, this.f29347e, dVar, dVar.a(this.f29343a, chain));
        this.f29354w = cVar;
        this.B = cVar;
        synchronized (this) {
            this.f29355x = true;
            this.f29356y = true;
        }
        if (this.A) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:44:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001b), top: B:43:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:44:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001b), top: B:43:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E u(vl.c r2, boolean r3, boolean r4, E r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.n.e(r2, r0)
            vl.c r0 = r1.B
            boolean r2 = kotlin.jvm.internal.n.a(r2, r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.f29355x     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L5a
        L19:
            if (r4 == 0) goto L41
            boolean r0 = r1.f29356y     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L41
        L1f:
            if (r3 == 0) goto L23
            r1.f29355x = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.f29356y = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.f29355x     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.f29356y     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.f29356y     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.f29357z     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L42
        L41:
            r3 = r2
        L42:
            ck.v r4 = ck.v.f7137a     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            if (r2 == 0) goto L52
            r2 = 0
            r1.B = r2
            vl.f r2 = r1.f29352u
            if (r2 != 0) goto L4f
            goto L52
        L4f:
            r2.s()
        L52:
            if (r3 == 0) goto L59
            java.io.IOException r2 = r1.d(r5)
            return r2
        L59:
            return r5
        L5a:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.e.u(vl.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException v(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f29357z) {
                this.f29357z = false;
                if (!this.f29355x && !this.f29356y) {
                    z10 = true;
                }
            }
            v vVar = v.f7137a;
        }
        return z10 ? d(iOException) : iOException;
    }

    public final String w() {
        return this.f29344b.i().o();
    }

    public final Socket x() {
        f fVar = this.f29352u;
        n.b(fVar);
        if (rl.d.f25046h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> n10 = fVar.n();
        Iterator<Reference<e>> it = n10.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (n.a(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (!(i10 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        n10.remove(i10);
        this.f29352u = null;
        if (n10.isEmpty()) {
            fVar.B(System.nanoTime());
            if (this.f29346d.c(fVar)) {
                return fVar.D();
            }
        }
        return null;
    }

    public final boolean z() {
        d dVar = this.f29351t;
        n.b(dVar);
        return dVar.e();
    }
}
