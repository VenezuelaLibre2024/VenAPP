package dm;

import ck.C2037v;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: dm.a */
/* loaded from: classes3.dex */
public class C7054a extends C7081y {

    /* renamed from: i */
    public static final a f15625i = new a(null);

    /* renamed from: j */
    private static final long f15626j;

    /* renamed from: k */
    private static final long f15627k;

    /* renamed from: l */
    private static C7054a f15628l;

    /* renamed from: f */
    private boolean f15629f;

    /* renamed from: g */
    private C7054a f15630g;

    /* renamed from: h */
    private long f15631h;

    /* renamed from: dm.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m20679d(C7054a c7054a) {
            synchronized (C7054a.class) {
                if (!c7054a.f15629f) {
                    return false;
                }
                c7054a.f15629f = false;
                for (C7054a c7054a2 = C7054a.f15628l; c7054a2 != null; c7054a2 = c7054a2.f15630g) {
                    if (c7054a2.f15630g == c7054a) {
                        c7054a2.f15630g = c7054a.f15630g;
                        c7054a.f15630g = null;
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
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m20680e(dm.C7054a r6, long r7, boolean r9) {
            /*
                r5 = this;
                java.lang.Class<dm.a> r0 = dm.C7054a.class
                monitor-enter(r0)
                boolean r1 = dm.C7054a.m20662l(r6)     // Catch: java.lang.Throwable -> L9b
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L8f
                dm.C7054a.m20666q(r6, r2)     // Catch: java.lang.Throwable -> L9b
                dm.a r1 = dm.C7054a.m20659i()     // Catch: java.lang.Throwable -> L9b
                if (r1 != 0) goto L24
                dm.a r1 = new dm.a     // Catch: java.lang.Throwable -> L9b
                r1.<init>()     // Catch: java.lang.Throwable -> L9b
                dm.C7054a.m20665p(r1)     // Catch: java.lang.Throwable -> L9b
                dm.a$b r1 = new dm.a$b     // Catch: java.lang.Throwable -> L9b
                r1.<init>()     // Catch: java.lang.Throwable -> L9b
                r1.start()     // Catch: java.lang.Throwable -> L9b
            L24:
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L9b
                r3 = 0
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 == 0) goto L3e
                if (r9 == 0) goto L3e
                long r3 = r6.mo20788c()     // Catch: java.lang.Throwable -> L9b
                long r3 = r3 - r1
                long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L9b
            L39:
                long r7 = r7 + r1
                dm.C7054a.m20668s(r6, r7)     // Catch: java.lang.Throwable -> L9b
                goto L4a
            L3e:
                if (r3 == 0) goto L41
                goto L39
            L41:
                if (r9 == 0) goto L89
                long r7 = r6.mo20788c()     // Catch: java.lang.Throwable -> L9b
                dm.C7054a.m20668s(r6, r7)     // Catch: java.lang.Throwable -> L9b
            L4a:
                long r7 = dm.C7054a.m20664o(r6, r1)     // Catch: java.lang.Throwable -> L9b
                dm.a r9 = dm.C7054a.m20659i()     // Catch: java.lang.Throwable -> L9b
            L52:
                kotlin.jvm.internal.C9322n.m27778b(r9)     // Catch: java.lang.Throwable -> L9b
                dm.a r3 = dm.C7054a.m20663m(r9)     // Catch: java.lang.Throwable -> L9b
                if (r3 == 0) goto L70
                dm.a r3 = dm.C7054a.m20663m(r9)     // Catch: java.lang.Throwable -> L9b
                kotlin.jvm.internal.C9322n.m27778b(r3)     // Catch: java.lang.Throwable -> L9b
                long r3 = dm.C7054a.m20664o(r3, r1)     // Catch: java.lang.Throwable -> L9b
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 >= 0) goto L6b
                goto L70
            L6b:
                dm.a r9 = dm.C7054a.m20663m(r9)     // Catch: java.lang.Throwable -> L9b
                goto L52
            L70:
                dm.a r7 = dm.C7054a.m20663m(r9)     // Catch: java.lang.Throwable -> L9b
                dm.C7054a.m20667r(r6, r7)     // Catch: java.lang.Throwable -> L9b
                dm.C7054a.m20667r(r9, r6)     // Catch: java.lang.Throwable -> L9b
                dm.a r6 = dm.C7054a.m20659i()     // Catch: java.lang.Throwable -> L9b
                if (r9 != r6) goto L85
                java.lang.Class<dm.a> r6 = dm.C7054a.class
                r6.notify()     // Catch: java.lang.Throwable -> L9b
            L85:
                ck.v r6 = ck.C2037v.f8089a     // Catch: java.lang.Throwable -> L9b
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
            throw new UnsupportedOperationException("Method not decompiled: dm.C7054a.a.m20680e(dm.a, long, boolean):void");
        }

        /* renamed from: c */
        public final C7054a m20681c() {
            C7054a c7054a = C7054a.f15628l;
            C9322n.m27778b(c7054a);
            C7054a c7054a2 = c7054a.f15630g;
            long nanoTime = System.nanoTime();
            if (c7054a2 == null) {
                C7054a.class.wait(C7054a.f15626j);
                C7054a c7054a3 = C7054a.f15628l;
                C9322n.m27778b(c7054a3);
                if (c7054a3.f15630g != null || System.nanoTime() - nanoTime < C7054a.f15627k) {
                    return null;
                }
                return C7054a.f15628l;
            }
            long m20669w = c7054a2.m20669w(nanoTime);
            if (m20669w > 0) {
                long j10 = m20669w / 1000000;
                C7054a.class.wait(j10, (int) (m20669w - (1000000 * j10)));
                return null;
            }
            C7054a c7054a4 = C7054a.f15628l;
            C9322n.m27778b(c7054a4);
            c7054a4.f15630g = c7054a2.f15630g;
            c7054a2.f15630g = null;
            return c7054a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dm.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C7054a m20681c;
            while (true) {
                try {
                    synchronized (C7054a.class) {
                        m20681c = C7054a.f15625i.m20681c();
                        if (m20681c == C7054a.f15628l) {
                            C7054a.f15628l = null;
                            return;
                        }
                        C2037v c2037v = C2037v.f8089a;
                    }
                    if (m20681c != null) {
                        m20681c.mo20676z();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: dm.a$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC7078v {

        /* renamed from: b */
        final /* synthetic */ InterfaceC7078v f15633b;

        c(InterfaceC7078v interfaceC7078v) {
            this.f15633b = interfaceC7078v;
        }

        @Override // dm.InterfaceC7078v
        /* renamed from: K0 */
        public void mo19710K0(C7056b source, long j10) {
            C9322n.m27781e(source, "source");
            C7059c0.m20745b(source.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                C7075s c7075s = source.f15638a;
                while (true) {
                    C9322n.m27778b(c7075s);
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += c7075s.f15683c - c7075s.f15682b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    c7075s = c7075s.f15686f;
                }
                C7054a c7054a = C7054a.this;
                InterfaceC7078v interfaceC7078v = this.f15633b;
                c7054a.m20671t();
                try {
                    interfaceC7078v.mo19710K0(source, j11);
                    C2037v c2037v = C2037v.f8089a;
                    if (c7054a.m20672u()) {
                        throw c7054a.m20670n(null);
                    }
                    j10 -= j11;
                } catch (IOException e10) {
                    if (!c7054a.m20672u()) {
                        throw e10;
                    }
                    throw c7054a.m20670n(e10);
                } finally {
                    c7054a.m20672u();
                }
            }
        }

        @Override // dm.InterfaceC7078v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7054a mo20683m() {
            return C7054a.this;
        }

        @Override // dm.InterfaceC7078v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C7054a c7054a = C7054a.this;
            InterfaceC7078v interfaceC7078v = this.f15633b;
            c7054a.m20671t();
            try {
                interfaceC7078v.close();
                C2037v c2037v = C2037v.f8089a;
                if (c7054a.m20672u()) {
                    throw c7054a.m20670n(null);
                }
            } catch (IOException e10) {
                if (!c7054a.m20672u()) {
                    throw e10;
                }
                throw c7054a.m20670n(e10);
            } finally {
                c7054a.m20672u();
            }
        }

        @Override // dm.InterfaceC7078v, java.io.Flushable
        public void flush() {
            C7054a c7054a = C7054a.this;
            InterfaceC7078v interfaceC7078v = this.f15633b;
            c7054a.m20671t();
            try {
                interfaceC7078v.flush();
                C2037v c2037v = C2037v.f8089a;
                if (c7054a.m20672u()) {
                    throw c7054a.m20670n(null);
                }
            } catch (IOException e10) {
                if (!c7054a.m20672u()) {
                    throw e10;
                }
                throw c7054a.m20670n(e10);
            } finally {
                c7054a.m20672u();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f15633b + ')';
        }
    }

    /* renamed from: dm.a$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC7080x {

        /* renamed from: b */
        final /* synthetic */ InterfaceC7080x f15635b;

        d(InterfaceC7080x interfaceC7080x) {
            this.f15635b = interfaceC7080x;
        }

        @Override // dm.InterfaceC7080x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7054a mo20685m() {
            return C7054a.this;
        }

        @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C7054a c7054a = C7054a.this;
            InterfaceC7080x interfaceC7080x = this.f15635b;
            c7054a.m20671t();
            try {
                interfaceC7080x.close();
                C2037v c2037v = C2037v.f8089a;
                if (c7054a.m20672u()) {
                    throw c7054a.m20670n(null);
                }
            } catch (IOException e10) {
                if (!c7054a.m20672u()) {
                    throw e10;
                }
                throw c7054a.m20670n(e10);
            } finally {
                c7054a.m20672u();
            }
        }

        @Override // dm.InterfaceC7080x
        /* renamed from: s1 */
        public long mo20686s1(C7056b sink, long j10) {
            C9322n.m27781e(sink, "sink");
            C7054a c7054a = C7054a.this;
            InterfaceC7080x interfaceC7080x = this.f15635b;
            c7054a.m20671t();
            try {
                long mo20686s1 = interfaceC7080x.mo20686s1(sink, j10);
                if (c7054a.m20672u()) {
                    throw c7054a.m20670n(null);
                }
                return mo20686s1;
            } catch (IOException e10) {
                if (c7054a.m20672u()) {
                    throw c7054a.m20670n(e10);
                }
                throw e10;
            } finally {
                c7054a.m20672u();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f15635b + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f15626j = millis;
        f15627k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final long m20669w(long j10) {
        return this.f15631h - j10;
    }

    /* renamed from: n */
    public final IOException m20670n(IOException iOException) {
        return mo20673v(iOException);
    }

    /* renamed from: t */
    public final void m20671t() {
        long m20847h = m20847h();
        boolean mo20790e = mo20790e();
        if (m20847h != 0 || mo20790e) {
            f15625i.m20680e(this, m20847h, mo20790e);
        }
    }

    /* renamed from: u */
    public final boolean m20672u() {
        return f15625i.m20679d(this);
    }

    /* renamed from: v */
    protected IOException mo20673v(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: x */
    public final InterfaceC7078v m20674x(InterfaceC7078v sink) {
        C9322n.m27781e(sink, "sink");
        return new c(sink);
    }

    /* renamed from: y */
    public final InterfaceC7080x m20675y(InterfaceC7080x source) {
        C9322n.m27781e(source, "source");
        return new d(source);
    }

    /* renamed from: z */
    protected void mo20676z() {
    }
}
