package yl;

import dm.v;
import dm.x;
import dm.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import ql.t;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: o */
    public static final a f32160o = new a(null);

    /* renamed from: a */
    private final int f32161a;

    /* renamed from: b */
    private final f f32162b;

    /* renamed from: c */
    private long f32163c;

    /* renamed from: d */
    private long f32164d;

    /* renamed from: e */
    private long f32165e;

    /* renamed from: f */
    private long f32166f;

    /* renamed from: g */
    private final ArrayDeque<t> f32167g;

    /* renamed from: h */
    private boolean f32168h;

    /* renamed from: i */
    private final c f32169i;

    /* renamed from: j */
    private final b f32170j;

    /* renamed from: k */
    private final d f32171k;

    /* renamed from: l */
    private final d f32172l;

    /* renamed from: m */
    private yl.b f32173m;

    /* renamed from: n */
    private IOException f32174n;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public final class b implements v {

        /* renamed from: a */
        private boolean f32175a;

        /* renamed from: b */
        private final dm.b f32176b;

        /* renamed from: c */
        private t f32177c;

        /* renamed from: d */
        private boolean f32178d;

        /* renamed from: e */
        final /* synthetic */ i f32179e;

        public b(i this$0, boolean z10) {
            kotlin.jvm.internal.n.e(this$0, "this$0");
            this.f32179e = this$0;
            this.f32175a = z10;
            this.f32176b = new dm.b();
        }

        private final void a(boolean z10) {
            long min;
            boolean z11;
            i iVar = this.f32179e;
            synchronized (iVar) {
                iVar.s().t();
                while (iVar.r() >= iVar.q() && !e() && !b() && iVar.h() == null) {
                    try {
                        iVar.F();
                    } finally {
                        iVar.s().A();
                    }
                }
                iVar.s().A();
                iVar.c();
                min = Math.min(iVar.q() - iVar.r(), this.f32176b.size());
                iVar.D(iVar.r() + min);
                z11 = z10 && min == this.f32176b.size();
                ck.v vVar = ck.v.f7137a;
            }
            this.f32179e.s().t();
            try {
                this.f32179e.g().y1(this.f32179e.j(), z11, this.f32176b, min);
            } finally {
                iVar = this.f32179e;
            }
        }

        @Override // dm.v
        public void K0(dm.b source, long j10) {
            kotlin.jvm.internal.n.e(source, "source");
            i iVar = this.f32179e;
            if (!rl.d.f25046h || !Thread.holdsLock(iVar)) {
                this.f32176b.K0(source, j10);
                while (this.f32176b.size() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
            }
        }

        public final boolean b() {
            return this.f32178d;
        }

        @Override // dm.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            i iVar = this.f32179e;
            if (rl.d.f25046h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = this.f32179e;
            synchronized (iVar2) {
                if (b()) {
                    return;
                }
                boolean z10 = iVar2.h() == null;
                ck.v vVar = ck.v.f7137a;
                if (!this.f32179e.o().f32175a) {
                    boolean z11 = this.f32176b.size() > 0;
                    if (this.f32177c != null) {
                        while (this.f32176b.size() > 0) {
                            a(false);
                        }
                        f g10 = this.f32179e.g();
                        int j10 = this.f32179e.j();
                        t tVar = this.f32177c;
                        kotlin.jvm.internal.n.b(tVar);
                        g10.z1(j10, z10, rl.d.O(tVar));
                    } else if (z11) {
                        while (this.f32176b.size() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        this.f32179e.g().y1(this.f32179e.j(), true, null, 0L);
                    }
                }
                synchronized (this.f32179e) {
                    f(true);
                    ck.v vVar2 = ck.v.f7137a;
                }
                this.f32179e.g().flush();
                this.f32179e.b();
            }
        }

        public final boolean e() {
            return this.f32175a;
        }

        public final void f(boolean z10) {
            this.f32178d = z10;
        }

        @Override // dm.v, java.io.Flushable
        public void flush() {
            i iVar = this.f32179e;
            if (rl.d.f25046h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = this.f32179e;
            synchronized (iVar2) {
                iVar2.c();
                ck.v vVar = ck.v.f7137a;
            }
            while (this.f32176b.size() > 0) {
                a(false);
                this.f32179e.g().flush();
            }
        }

        @Override // dm.v
        public y m() {
            return this.f32179e.s();
        }
    }

    /* loaded from: classes3.dex */
    public final class c implements x {

        /* renamed from: a */
        private final long f32180a;

        /* renamed from: b */
        private boolean f32181b;

        /* renamed from: c */
        private final dm.b f32182c;

        /* renamed from: d */
        private final dm.b f32183d;

        /* renamed from: e */
        private t f32184e;

        /* renamed from: f */
        private boolean f32185f;

        /* renamed from: r */
        final /* synthetic */ i f32186r;

        public c(i this$0, long j10, boolean z10) {
            kotlin.jvm.internal.n.e(this$0, "this$0");
            this.f32186r = this$0;
            this.f32180a = j10;
            this.f32181b = z10;
            this.f32182c = new dm.b();
            this.f32183d = new dm.b();
        }

        private final void n(long j10) {
            i iVar = this.f32186r;
            if (!rl.d.f25046h || !Thread.holdsLock(iVar)) {
                this.f32186r.g().x1(j10);
                return;
            }
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
        }

        public final boolean a() {
            return this.f32185f;
        }

        public final boolean b() {
            return this.f32181b;
        }

        @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            i iVar = this.f32186r;
            synchronized (iVar) {
                i(true);
                size = e().size();
                e().b();
                iVar.notifyAll();
                ck.v vVar = ck.v.f7137a;
            }
            if (size > 0) {
                n(size);
            }
            this.f32186r.b();
        }

        public final dm.b e() {
            return this.f32183d;
        }

        public final dm.b f() {
            return this.f32182c;
        }

        public final void g(dm.d source, long j10) {
            boolean b10;
            boolean z10;
            boolean z11;
            long j11;
            kotlin.jvm.internal.n.e(source, "source");
            i iVar = this.f32186r;
            if (rl.d.f25046h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + iVar);
            }
            while (j10 > 0) {
                synchronized (this.f32186r) {
                    b10 = b();
                    z10 = true;
                    z11 = e().size() + j10 > this.f32180a;
                    ck.v vVar = ck.v.f7137a;
                }
                if (z11) {
                    source.skip(j10);
                    this.f32186r.f(yl.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (b10) {
                    source.skip(j10);
                    return;
                }
                long s12 = source.s1(this.f32182c, j10);
                if (s12 == -1) {
                    throw new EOFException();
                }
                j10 -= s12;
                i iVar2 = this.f32186r;
                synchronized (iVar2) {
                    if (a()) {
                        j11 = f().size();
                        f().b();
                    } else {
                        if (e().size() != 0) {
                            z10 = false;
                        }
                        e().E0(f());
                        if (z10) {
                            iVar2.notifyAll();
                        }
                        j11 = 0;
                    }
                }
                if (j11 > 0) {
                    n(j11);
                }
            }
        }

        public final void i(boolean z10) {
            this.f32185f = z10;
        }

        public final void j(boolean z10) {
            this.f32181b = z10;
        }

        public final void l(t tVar) {
            this.f32184e = tVar;
        }

        @Override // dm.x
        public y m() {
            return this.f32186r.m();
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
        
            throw new java.io.IOException("stream closed");
         */
        @Override // dm.x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long s1(dm.b r18, long r19) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: yl.i.c.s1(dm.b, long):long");
        }
    }

    /* loaded from: classes3.dex */
    public final class d extends dm.a {

        /* renamed from: m */
        final /* synthetic */ i f32187m;

        public d(i this$0) {
            kotlin.jvm.internal.n.e(this$0, "this$0");
            this.f32187m = this$0;
        }

        public final void A() {
            if (u()) {
                throw v(null);
            }
        }

        @Override // dm.a
        protected IOException v(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // dm.a
        protected void z() {
            this.f32187m.f(yl.b.CANCEL);
            this.f32187m.g().b1();
        }
    }

    public i(int i10, f connection, boolean z10, boolean z11, t tVar) {
        kotlin.jvm.internal.n.e(connection, "connection");
        this.f32161a = i10;
        this.f32162b = connection;
        this.f32166f = connection.j0().c();
        ArrayDeque<t> arrayDeque = new ArrayDeque<>();
        this.f32167g = arrayDeque;
        this.f32169i = new c(this, connection.i0().c(), z11);
        this.f32170j = new b(this, z10);
        this.f32171k = new d(this);
        this.f32172l = new d(this);
        if (tVar == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!t())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(tVar);
        }
    }

    private final boolean e(yl.b bVar, IOException iOException) {
        if (rl.d.f25046h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            if (p().b() && o().e()) {
                return false;
            }
            z(bVar);
            A(iOException);
            notifyAll();
            ck.v vVar = ck.v.f7137a;
            this.f32162b.a1(this.f32161a);
            return true;
        }
    }

    public final void A(IOException iOException) {
        this.f32174n = iOException;
    }

    public final void B(long j10) {
        this.f32164d = j10;
    }

    public final void C(long j10) {
        this.f32163c = j10;
    }

    public final void D(long j10) {
        this.f32165e = j10;
    }

    public final synchronized t E() {
        t removeFirst;
        this.f32171k.t();
        while (this.f32167g.isEmpty() && this.f32173m == null) {
            try {
                F();
            } catch (Throwable th2) {
                this.f32171k.A();
                throw th2;
            }
        }
        this.f32171k.A();
        if (!(!this.f32167g.isEmpty())) {
            IOException iOException = this.f32174n;
            if (iOException != null) {
                throw iOException;
            }
            yl.b bVar = this.f32173m;
            kotlin.jvm.internal.n.b(bVar);
            throw new n(bVar);
        }
        removeFirst = this.f32167g.removeFirst();
        kotlin.jvm.internal.n.d(removeFirst, "headersQueue.removeFirst()");
        return removeFirst;
    }

    public final void F() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final y G() {
        return this.f32172l;
    }

    public final void a(long j10) {
        this.f32166f += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z10;
        boolean u10;
        if (rl.d.f25046h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z10 = !p().b() && p().a() && (o().e() || o().b());
            u10 = u();
            ck.v vVar = ck.v.f7137a;
        }
        if (z10) {
            d(yl.b.CANCEL, null);
        } else {
            if (u10) {
                return;
            }
            this.f32162b.a1(this.f32161a);
        }
    }

    public final void c() {
        if (this.f32170j.b()) {
            throw new IOException("stream closed");
        }
        if (this.f32170j.e()) {
            throw new IOException("stream finished");
        }
        if (this.f32173m != null) {
            IOException iOException = this.f32174n;
            if (iOException != null) {
                throw iOException;
            }
            yl.b bVar = this.f32173m;
            kotlin.jvm.internal.n.b(bVar);
            throw new n(bVar);
        }
    }

    public final void d(yl.b rstStatusCode, IOException iOException) {
        kotlin.jvm.internal.n.e(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, iOException)) {
            this.f32162b.B1(this.f32161a, rstStatusCode);
        }
    }

    public final void f(yl.b errorCode) {
        kotlin.jvm.internal.n.e(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f32162b.C1(this.f32161a, errorCode);
        }
    }

    public final f g() {
        return this.f32162b;
    }

    public final synchronized yl.b h() {
        return this.f32173m;
    }

    public final IOException i() {
        return this.f32174n;
    }

    public final int j() {
        return this.f32161a;
    }

    public final long k() {
        return this.f32164d;
    }

    public final long l() {
        return this.f32163c;
    }

    public final d m() {
        return this.f32171k;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0011, B:15:0x0017, B:16:0x0022), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0011, B:15:0x0017, B:16:0x0022), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final dm.v n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f32168h     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.t()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            ck.v r0 = ck.v.f7137a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            yl.i$b r0 = r2.f32170j
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.i.n():dm.v");
    }

    public final b o() {
        return this.f32170j;
    }

    public final c p() {
        return this.f32169i;
    }

    public final long q() {
        return this.f32166f;
    }

    public final long r() {
        return this.f32165e;
    }

    public final d s() {
        return this.f32172l;
    }

    public final boolean t() {
        return this.f32162b.S() == ((this.f32161a & 1) == 1);
    }

    public final synchronized boolean u() {
        if (this.f32173m != null) {
            return false;
        }
        if ((this.f32169i.b() || this.f32169i.a()) && (this.f32170j.e() || this.f32170j.b())) {
            if (this.f32168h) {
                return false;
            }
        }
        return true;
    }

    public final y v() {
        return this.f32171k;
    }

    public final void w(dm.d source, int i10) {
        kotlin.jvm.internal.n.e(source, "source");
        if (!rl.d.f25046h || !Thread.holdsLock(this)) {
            this.f32169i.g(source, i10);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:10:0x0038, B:14:0x0040, B:16:0x0051, B:17:0x0058, B:24:0x0048), top: B:9:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(ql.t r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.n.e(r3, r0)
            boolean r0 = rl.d.f25046h
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L37:
            monitor-enter(r2)
            boolean r0 = r2.f32168h     // Catch: java.lang.Throwable -> L6c
            r1 = 1
            if (r0 == 0) goto L48
            if (r4 != 0) goto L40
            goto L48
        L40:
            yl.i$c r0 = r2.p()     // Catch: java.lang.Throwable -> L6c
            r0.l(r3)     // Catch: java.lang.Throwable -> L6c
            goto L4f
        L48:
            r2.f32168h = r1     // Catch: java.lang.Throwable -> L6c
            java.util.ArrayDeque<ql.t> r0 = r2.f32167g     // Catch: java.lang.Throwable -> L6c
            r0.add(r3)     // Catch: java.lang.Throwable -> L6c
        L4f:
            if (r4 == 0) goto L58
            yl.i$c r3 = r2.p()     // Catch: java.lang.Throwable -> L6c
            r3.j(r1)     // Catch: java.lang.Throwable -> L6c
        L58:
            boolean r3 = r2.u()     // Catch: java.lang.Throwable -> L6c
            r2.notifyAll()     // Catch: java.lang.Throwable -> L6c
            ck.v r4 = ck.v.f7137a     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r2)
            if (r3 != 0) goto L6b
            yl.f r3 = r2.f32162b
            int r4 = r2.f32161a
            r3.a1(r4)
        L6b:
            return
        L6c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.i.x(ql.t, boolean):void");
    }

    public final synchronized void y(yl.b errorCode) {
        kotlin.jvm.internal.n.e(errorCode, "errorCode");
        if (this.f32173m == null) {
            this.f32173m = errorCode;
            notifyAll();
        }
    }

    public final void z(yl.b bVar) {
        this.f32173m = bVar;
    }
}
