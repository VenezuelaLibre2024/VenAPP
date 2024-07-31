package dm;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class a extends y {

    /* renamed from: i, reason: collision with root package name */
    public static final C0217a f14267i = new C0217a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final long f14268j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f14269k;

    /* renamed from: l, reason: collision with root package name */
    private static a f14270l;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14271f;

    /* renamed from: g, reason: collision with root package name */
    private a f14272g;

    /* renamed from: h, reason: collision with root package name */
    private long f14273h;

    /* renamed from: dm.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0217a {
        private C0217a() {
        }

        public /* synthetic */ C0217a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(a aVar) {
            synchronized (a.class) {
                if (!aVar.f14271f) {
                    return false;
                }
                aVar.f14271f = false;
                for (a aVar2 = a.f14270l; aVar2 != null; aVar2 = aVar2.f14272g) {
                    if (aVar2.f14272g == aVar) {
                        aVar2.f14272g = aVar.f14272g;
                        aVar.f14272g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0014, B:9:0x0024, B:12:0x0030, B:13:0x0039, B:14:0x004a, B:15:0x0052, B:17:0x005b, B:19:0x006b, B:22:0x0070, B:24:0x0080, B:25:0x0085, B:33:0x0043, B:34:0x0089, B:35:0x008e, B:36:0x008f, B:37:0x009a), top: B:3:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0014, B:9:0x0024, B:12:0x0030, B:13:0x0039, B:14:0x004a, B:15:0x0052, B:17:0x005b, B:19:0x006b, B:22:0x0070, B:24:0x0080, B:25:0x0085, B:33:0x0043, B:34:0x0089, B:35:0x008e, B:36:0x008f, B:37:0x009a), top: B:3:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[EDGE_INSN: B:29:0x0070->B:22:0x0070 BREAK  A[LOOP:0: B:15:0x0052->B:19:0x006b], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(dm.a r6, long r7, boolean r9) {
            /*
                r5 = this;
                java.lang.Class<dm.a> r0 = dm.a.class
                monitor-enter(r0)
                boolean r1 = dm.a.l(r6)     // Catch: java.lang.Throwable -> L9b
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L8f
                dm.a.q(r6, r2)     // Catch: java.lang.Throwable -> L9b
                dm.a r1 = dm.a.i()     // Catch: java.lang.Throwable -> L9b
                if (r1 != 0) goto L24
                dm.a r1 = new dm.a     // Catch: java.lang.Throwable -> L9b
                r1.<init>()     // Catch: java.lang.Throwable -> L9b
                dm.a.p(r1)     // Catch: java.lang.Throwable -> L9b
                dm.a$b r1 = new dm.a$b     // Catch: java.lang.Throwable -> L9b
                r1.<init>()     // Catch: java.lang.Throwable -> L9b
                r1.start()     // Catch: java.lang.Throwable -> L9b
            L24:
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L9b
                r3 = 0
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 == 0) goto L3e
                if (r9 == 0) goto L3e
                long r3 = r6.c()     // Catch: java.lang.Throwable -> L9b
                long r3 = r3 - r1
                long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L9b
            L39:
                long r7 = r7 + r1
                dm.a.s(r6, r7)     // Catch: java.lang.Throwable -> L9b
                goto L4a
            L3e:
                if (r3 == 0) goto L41
                goto L39
            L41:
                if (r9 == 0) goto L89
                long r7 = r6.c()     // Catch: java.lang.Throwable -> L9b
                dm.a.s(r6, r7)     // Catch: java.lang.Throwable -> L9b
            L4a:
                long r7 = dm.a.o(r6, r1)     // Catch: java.lang.Throwable -> L9b
                dm.a r9 = dm.a.i()     // Catch: java.lang.Throwable -> L9b
            L52:
                kotlin.jvm.internal.n.b(r9)     // Catch: java.lang.Throwable -> L9b
                dm.a r3 = dm.a.m(r9)     // Catch: java.lang.Throwable -> L9b
                if (r3 == 0) goto L70
                dm.a r3 = dm.a.m(r9)     // Catch: java.lang.Throwable -> L9b
                kotlin.jvm.internal.n.b(r3)     // Catch: java.lang.Throwable -> L9b
                long r3 = dm.a.o(r3, r1)     // Catch: java.lang.Throwable -> L9b
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 >= 0) goto L6b
                goto L70
            L6b:
                dm.a r9 = dm.a.m(r9)     // Catch: java.lang.Throwable -> L9b
                goto L52
            L70:
                dm.a r7 = dm.a.m(r9)     // Catch: java.lang.Throwable -> L9b
                dm.a.r(r6, r7)     // Catch: java.lang.Throwable -> L9b
                dm.a.r(r9, r6)     // Catch: java.lang.Throwable -> L9b
                dm.a r6 = dm.a.i()     // Catch: java.lang.Throwable -> L9b
                if (r9 != r6) goto L85
                java.lang.Class<dm.a> r6 = dm.a.class
                r6.notify()     // Catch: java.lang.Throwable -> L9b
            L85:
                ck.v r6 = ck.v.f7137a     // Catch: java.lang.Throwable -> L9b
                monitor-exit(r0)
                return
            L89:
                java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L9b
                r6.<init>()     // Catch: java.lang.Throwable -> L9b
                throw r6     // Catch: java.lang.Throwable -> L9b
            L8f:
                java.lang.String r6 = "Unbalanced enter/exit"
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9b
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L9b
                r7.<init>(r6)     // Catch: java.lang.Throwable -> L9b
                throw r7     // Catch: java.lang.Throwable -> L9b
            L9b:
                r6 = move-exception
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: dm.a.C0217a.e(dm.a, long, boolean):void");
        }

        public final a c() {
            a aVar = a.f14270l;
            kotlin.jvm.internal.n.b(aVar);
            a aVar2 = aVar.f14272g;
            long nanoTime = System.nanoTime();
            if (aVar2 == null) {
                a.class.wait(a.f14268j);
                a aVar3 = a.f14270l;
                kotlin.jvm.internal.n.b(aVar3);
                if (aVar3.f14272g != null || System.nanoTime() - nanoTime < a.f14269k) {
                    return null;
                }
                return a.f14270l;
            }
            long w10 = aVar2.w(nanoTime);
            if (w10 > 0) {
                long j10 = w10 / 1000000;
                a.class.wait(j10, (int) (w10 - (1000000 * j10)));
                return null;
            }
            a aVar4 = a.f14270l;
            kotlin.jvm.internal.n.b(aVar4);
            aVar4.f14272g = aVar2.f14272g;
            aVar2.f14272g = null;
            return aVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a c10;
            while (true) {
                try {
                    synchronized (a.class) {
                        c10 = a.f14267i.c();
                        if (c10 == a.f14270l) {
                            a.f14270l = null;
                            return;
                        }
                        ck.v vVar = ck.v.f7137a;
                    }
                    if (c10 != null) {
                        c10.z();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f14275b;

        c(v vVar) {
            this.f14275b = vVar;
        }

        @Override // dm.v
        public void K0(dm.b source, long j10) {
            kotlin.jvm.internal.n.e(source, "source");
            c0.b(source.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                s sVar = source.f14280a;
                while (true) {
                    kotlin.jvm.internal.n.b(sVar);
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += sVar.f14325c - sVar.f14324b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    sVar = sVar.f14328f;
                }
                a aVar = a.this;
                v vVar = this.f14275b;
                aVar.t();
                try {
                    vVar.K0(source, j11);
                    ck.v vVar2 = ck.v.f7137a;
                    if (aVar.u()) {
                        throw aVar.n(null);
                    }
                    j10 -= j11;
                } catch (IOException e10) {
                    if (!aVar.u()) {
                        throw e10;
                    }
                    throw aVar.n(e10);
                } finally {
                    aVar.u();
                }
            }
        }

        @Override // dm.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a m() {
            return a.this;
        }

        @Override // dm.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a aVar = a.this;
            v vVar = this.f14275b;
            aVar.t();
            try {
                vVar.close();
                ck.v vVar2 = ck.v.f7137a;
                if (aVar.u()) {
                    throw aVar.n(null);
                }
            } catch (IOException e10) {
                if (!aVar.u()) {
                    throw e10;
                }
                throw aVar.n(e10);
            } finally {
                aVar.u();
            }
        }

        @Override // dm.v, java.io.Flushable
        public void flush() {
            a aVar = a.this;
            v vVar = this.f14275b;
            aVar.t();
            try {
                vVar.flush();
                ck.v vVar2 = ck.v.f7137a;
                if (aVar.u()) {
                    throw aVar.n(null);
                }
            } catch (IOException e10) {
                if (!aVar.u()) {
                    throw e10;
                }
                throw aVar.n(e10);
            } finally {
                aVar.u();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f14275b + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements x {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f14277b;

        d(x xVar) {
            this.f14277b = xVar;
        }

        @Override // dm.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a m() {
            return a.this;
        }

        @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a aVar = a.this;
            x xVar = this.f14277b;
            aVar.t();
            try {
                xVar.close();
                ck.v vVar = ck.v.f7137a;
                if (aVar.u()) {
                    throw aVar.n(null);
                }
            } catch (IOException e10) {
                if (!aVar.u()) {
                    throw e10;
                }
                throw aVar.n(e10);
            } finally {
                aVar.u();
            }
        }

        @Override // dm.x
        public long s1(dm.b sink, long j10) {
            kotlin.jvm.internal.n.e(sink, "sink");
            a aVar = a.this;
            x xVar = this.f14277b;
            aVar.t();
            try {
                long s12 = xVar.s1(sink, j10);
                if (aVar.u()) {
                    throw aVar.n(null);
                }
                return s12;
            } catch (IOException e10) {
                if (aVar.u()) {
                    throw aVar.n(e10);
                }
                throw e10;
            } finally {
                aVar.u();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f14277b + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f14268j = millis;
        f14269k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long w(long j10) {
        return this.f14273h - j10;
    }

    public final IOException n(IOException iOException) {
        return v(iOException);
    }

    public final void t() {
        long h10 = h();
        boolean e10 = e();
        if (h10 != 0 || e10) {
            f14267i.e(this, h10, e10);
        }
    }

    public final boolean u() {
        return f14267i.d(this);
    }

    protected IOException v(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final v x(v sink) {
        kotlin.jvm.internal.n.e(sink, "sink");
        return new c(sink);
    }

    public final x y(x source) {
        kotlin.jvm.internal.n.e(source, "source");
        return new d(source);
    }

    protected void z() {
    }
}
