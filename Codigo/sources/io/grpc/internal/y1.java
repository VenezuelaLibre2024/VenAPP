package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import vi.k;
import vi.w0;

/* loaded from: classes3.dex */
public abstract class y1<ReqT> implements io.grpc.internal.q {
    static final w0.g<String> A;
    static final w0.g<String> B;
    private static final vi.g1 C;
    private static Random D;

    /* renamed from: a */
    private final vi.x0<ReqT, ?> f19266a;

    /* renamed from: b */
    private final Executor f19267b;

    /* renamed from: d */
    private final ScheduledExecutorService f19269d;

    /* renamed from: e */
    private final vi.w0 f19270e;

    /* renamed from: f */
    private final z1 f19271f;

    /* renamed from: g */
    private final s0 f19272g;

    /* renamed from: h */
    private final boolean f19273h;

    /* renamed from: j */
    private final t f19275j;

    /* renamed from: k */
    private final long f19276k;

    /* renamed from: l */
    private final long f19277l;

    /* renamed from: m */
    private final c0 f19278m;

    /* renamed from: s */
    private vi.g1 f19284s;

    /* renamed from: t */
    private long f19285t;

    /* renamed from: u */
    private io.grpc.internal.r f19286u;

    /* renamed from: v */
    private u f19287v;

    /* renamed from: w */
    private u f19288w;

    /* renamed from: x */
    private long f19289x;

    /* renamed from: y */
    private vi.g1 f19290y;

    /* renamed from: z */
    private boolean f19291z;

    /* renamed from: c */
    private final Executor f19268c = new vi.k1(new a());

    /* renamed from: i */
    private final Object f19274i = new Object();

    /* renamed from: n */
    private final w0 f19279n = new w0();

    /* renamed from: o */
    private volatile z f19280o = new z(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* renamed from: p */
    private final AtomicBoolean f19281p = new AtomicBoolean();

    /* renamed from: q */
    private final AtomicInteger f19282q = new AtomicInteger();

    /* renamed from: r */
    private final AtomicInteger f19283r = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Thread.UncaughtExceptionHandler {
        a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            throw vi.g1.l(th2).r("Uncaught exception in the SynchronizationContext. Re-thrown.").d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class a0 implements io.grpc.internal.r {

        /* renamed from: a */
        final b0 f19293a;

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ vi.w0 f19295a;

            a(vi.w0 w0Var) {
                this.f19295a = w0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f19286u.b(this.f19295a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ b0 f19297a;

            /* loaded from: classes3.dex */
            class a implements Runnable {
                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b bVar = b.this;
                    y1.this.f0(bVar.f19297a);
                }
            }

            b(b0 b0Var) {
                this.f19297a = b0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f19267b.execute(new a());
            }
        }

        /* loaded from: classes3.dex */
        class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ b0 f19300a;

            c(b0 b0Var) {
                this.f19300a = b0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f0(this.f19300a);
            }
        }

        /* loaded from: classes3.dex */
        class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ j2.a f19302a;

            d(j2.a aVar) {
                this.f19302a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f19286u.a(this.f19302a);
            }
        }

        /* loaded from: classes3.dex */
        class e implements Runnable {
            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (y1.this.f19291z) {
                    return;
                }
                y1.this.f19286u.c();
            }
        }

        a0(b0 b0Var) {
            this.f19293a = b0Var;
        }

        private Integer e(vi.w0 w0Var) {
            String str = (String) w0Var.g(y1.B);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private v f(vi.g1 g1Var, vi.w0 w0Var) {
            Integer e10 = e(w0Var);
            boolean z10 = !y1.this.f19272g.f19136c.contains(g1Var.n());
            return new v((z10 || ((y1.this.f19278m == null || (z10 && (e10 == null || e10.intValue() >= 0))) ? false : y1.this.f19278m.b() ^ true)) ? false : true, e10);
        }

        private x g(vi.g1 g1Var, vi.w0 w0Var) {
            y1 y1Var;
            long j10;
            long j11 = 0;
            boolean z10 = false;
            if (y1.this.f19271f == null) {
                return new x(false, 0L);
            }
            boolean contains = y1.this.f19271f.f19417f.contains(g1Var.n());
            Integer e10 = e(w0Var);
            boolean z11 = (y1.this.f19278m == null || (!contains && (e10 == null || e10.intValue() >= 0))) ? false : !y1.this.f19278m.b();
            if (y1.this.f19271f.f19412a > this.f19293a.f19310d + 1 && !z11) {
                if (e10 == null) {
                    if (contains) {
                        j11 = (long) (y1.this.f19289x * y1.D.nextDouble());
                        y1Var = y1.this;
                        j10 = Math.min((long) (y1Var.f19289x * y1.this.f19271f.f19415d), y1.this.f19271f.f19414c);
                        y1Var.f19289x = j10;
                        z10 = true;
                    }
                } else if (e10.intValue() >= 0) {
                    j11 = TimeUnit.MILLISECONDS.toNanos(e10.intValue());
                    y1Var = y1.this;
                    j10 = y1Var.f19271f.f19413b;
                    y1Var.f19289x = j10;
                    z10 = true;
                }
            }
            return new x(z10, j11);
        }

        @Override // io.grpc.internal.j2
        public void a(j2.a aVar) {
            z zVar = y1.this.f19280o;
            eb.o.v(zVar.f19367f != null, "Headers should be received prior to messages.");
            if (zVar.f19367f != this.f19293a) {
                return;
            }
            y1.this.f19268c.execute(new d(aVar));
        }

        @Override // io.grpc.internal.r
        public void b(vi.w0 w0Var) {
            y1.this.c0(this.f19293a);
            if (y1.this.f19280o.f19367f == this.f19293a) {
                if (y1.this.f19278m != null) {
                    y1.this.f19278m.c();
                }
                y1.this.f19268c.execute(new a(w0Var));
            }
        }

        @Override // io.grpc.internal.j2
        public void c() {
            if (y1.this.d()) {
                y1.this.f19268c.execute(new e());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:103:0x01cd, code lost:
        
            if (io.grpc.internal.y1.this.f19271f.f19412a != 1) goto L209;
         */
        @Override // io.grpc.internal.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(vi.g1 r6, io.grpc.internal.r.a r7, vi.w0 r8) {
            /*
                Method dump skipped, instructions count: 511
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.y1.a0.d(vi.g1, io.grpc.internal.r$a, vi.w0):void");
        }
    }

    /* loaded from: classes3.dex */
    class b implements r {

        /* renamed from: a */
        final /* synthetic */ String f19305a;

        b(String str) {
            this.f19305a = str;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.l(this.f19305a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b0 {

        /* renamed from: a */
        io.grpc.internal.q f19307a;

        /* renamed from: b */
        boolean f19308b;

        /* renamed from: c */
        boolean f19309c;

        /* renamed from: d */
        final int f19310d;

        b0(int i10) {
            this.f19310d = i10;
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Collection f19311a;

        /* renamed from: b */
        final /* synthetic */ b0 f19312b;

        /* renamed from: c */
        final /* synthetic */ Future f19313c;

        /* renamed from: d */
        final /* synthetic */ Future f19314d;

        c(Collection collection, b0 b0Var, Future future, Future future2) {
            this.f19311a = collection;
            this.f19312b = b0Var;
            this.f19313c = future;
            this.f19314d = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (b0 b0Var : this.f19311a) {
                if (b0Var != this.f19312b) {
                    b0Var.f19307a.c(y1.C);
                }
            }
            Future future = this.f19313c;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f19314d;
            if (future2 != null) {
                future2.cancel(false);
            }
            y1.this.j0();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c0 {

        /* renamed from: a */
        final int f19316a;

        /* renamed from: b */
        final int f19317b;

        /* renamed from: c */
        final int f19318c;

        /* renamed from: d */
        final AtomicInteger f19319d;

        public c0(float f10, float f11) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f19319d = atomicInteger;
            this.f19318c = (int) (f11 * 1000.0f);
            int i10 = (int) (f10 * 1000.0f);
            this.f19316a = i10;
            this.f19317b = i10 / 2;
            atomicInteger.set(i10);
        }

        boolean a() {
            return this.f19319d.get() > this.f19317b;
        }

        boolean b() {
            int i10;
            int i11;
            do {
                i10 = this.f19319d.get();
                if (i10 == 0) {
                    return false;
                }
                i11 = i10 - 1000;
            } while (!this.f19319d.compareAndSet(i10, Math.max(i11, 0)));
            return i11 > this.f19317b;
        }

        void c() {
            int i10;
            int i11;
            do {
                i10 = this.f19319d.get();
                i11 = this.f19316a;
                if (i10 == i11) {
                    return;
                }
            } while (!this.f19319d.compareAndSet(i10, Math.min(this.f19318c + i10, i11)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            return this.f19316a == c0Var.f19316a && this.f19318c == c0Var.f19318c;
        }

        public int hashCode() {
            return eb.k.b(Integer.valueOf(this.f19316a), Integer.valueOf(this.f19318c));
        }
    }

    /* loaded from: classes3.dex */
    class d implements r {

        /* renamed from: a */
        final /* synthetic */ vi.n f19320a;

        d(vi.n nVar) {
            this.f19320a = nVar;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.a(this.f19320a);
        }
    }

    /* loaded from: classes3.dex */
    class e implements r {

        /* renamed from: a */
        final /* synthetic */ vi.t f19322a;

        e(vi.t tVar) {
            this.f19322a = tVar;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.g(this.f19322a);
        }
    }

    /* loaded from: classes3.dex */
    class f implements r {

        /* renamed from: a */
        final /* synthetic */ vi.v f19324a;

        f(vi.v vVar) {
            this.f19324a = vVar;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.k(this.f19324a);
        }
    }

    /* loaded from: classes3.dex */
    class g implements r {
        g() {
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.flush();
        }
    }

    /* loaded from: classes3.dex */
    class h implements r {

        /* renamed from: a */
        final /* synthetic */ boolean f19327a;

        h(boolean z10) {
            this.f19327a = z10;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.j(this.f19327a);
        }
    }

    /* loaded from: classes3.dex */
    class i implements r {
        i() {
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.n();
        }
    }

    /* loaded from: classes3.dex */
    class j implements r {

        /* renamed from: a */
        final /* synthetic */ int f19330a;

        j(int i10) {
            this.f19330a = i10;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.e(this.f19330a);
        }
    }

    /* loaded from: classes3.dex */
    class k implements r {

        /* renamed from: a */
        final /* synthetic */ int f19332a;

        k(int i10) {
            this.f19332a = i10;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.f(this.f19332a);
        }
    }

    /* loaded from: classes3.dex */
    class l implements r {
        l() {
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.i();
        }
    }

    /* loaded from: classes3.dex */
    class m implements r {

        /* renamed from: a */
        final /* synthetic */ int f19335a;

        m(int i10) {
            this.f19335a = i10;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.b(this.f19335a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class n implements r {

        /* renamed from: a */
        final /* synthetic */ Object f19337a;

        n(Object obj) {
            this.f19337a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.h(y1.this.f19266a.j(this.f19337a));
            b0Var.f19307a.flush();
        }
    }

    /* loaded from: classes3.dex */
    public class o extends k.a {

        /* renamed from: a */
        final /* synthetic */ vi.k f19339a;

        o(vi.k kVar) {
            this.f19339a = kVar;
        }

        @Override // vi.k.a
        public vi.k a(k.b bVar, vi.w0 w0Var) {
            return this.f19339a;
        }
    }

    /* loaded from: classes3.dex */
    public class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y1.this.f19291z) {
                return;
            }
            y1.this.f19286u.c();
        }
    }

    /* loaded from: classes3.dex */
    public class q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ vi.g1 f19342a;

        /* renamed from: b */
        final /* synthetic */ r.a f19343b;

        /* renamed from: c */
        final /* synthetic */ vi.w0 f19344c;

        q(vi.g1 g1Var, r.a aVar, vi.w0 w0Var) {
            this.f19342a = g1Var;
            this.f19343b = aVar;
            this.f19344c = w0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            y1.this.f19291z = true;
            y1.this.f19286u.d(this.f19342a, this.f19343b, this.f19344c);
        }
    }

    /* loaded from: classes3.dex */
    public interface r {
        void a(b0 b0Var);
    }

    /* loaded from: classes3.dex */
    public class s extends vi.k {

        /* renamed from: a */
        private final b0 f19346a;

        /* renamed from: b */
        long f19347b;

        s(b0 b0Var) {
            this.f19346a = b0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[Catch: all -> 0x0084, TryCatch #0 {, blocks: (B:8:0x0012, B:10:0x001c, B:13:0x0023, B:15:0x0032, B:17:0x0034, B:19:0x0041, B:20:0x0043, B:21:0x006d, B:23:0x0073, B:24:0x007b, B:30:0x0046, B:32:0x006a, B:33:0x0082), top: B:7:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
        @Override // vi.j1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h(long r6) {
            /*
                r5 = this;
                io.grpc.internal.y1 r0 = io.grpc.internal.y1.this
                io.grpc.internal.y1$z r0 = io.grpc.internal.y1.P(r0)
                io.grpc.internal.y1$b0 r0 = r0.f19367f
                if (r0 == 0) goto Lb
                return
            Lb:
                io.grpc.internal.y1 r0 = io.grpc.internal.y1.this
                java.lang.Object r0 = io.grpc.internal.y1.W(r0)
                monitor-enter(r0)
                io.grpc.internal.y1 r1 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1$z r1 = io.grpc.internal.y1.P(r1)     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1$b0 r1 = r1.f19367f     // Catch: java.lang.Throwable -> L84
                if (r1 != 0) goto L82
                io.grpc.internal.y1$b0 r1 = r5.f19346a     // Catch: java.lang.Throwable -> L84
                boolean r1 = r1.f19308b     // Catch: java.lang.Throwable -> L84
                if (r1 == 0) goto L23
                goto L82
            L23:
                long r1 = r5.f19347b     // Catch: java.lang.Throwable -> L84
                long r1 = r1 + r6
                r5.f19347b = r1     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1 r6 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L84
                long r6 = io.grpc.internal.y1.N(r6)     // Catch: java.lang.Throwable -> L84
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 > 0) goto L34
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
                return
            L34:
                long r6 = r5.f19347b     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1 r1 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L84
                long r1 = io.grpc.internal.y1.Q(r1)     // Catch: java.lang.Throwable -> L84
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                r7 = 1
                if (r6 <= 0) goto L46
                io.grpc.internal.y1$b0 r6 = r5.f19346a     // Catch: java.lang.Throwable -> L84
            L43:
                r6.f19309c = r7     // Catch: java.lang.Throwable -> L84
                goto L6d
            L46:
                io.grpc.internal.y1 r6 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1$t r6 = io.grpc.internal.y1.S(r6)     // Catch: java.lang.Throwable -> L84
                long r1 = r5.f19347b     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1 r3 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L84
                long r3 = io.grpc.internal.y1.N(r3)     // Catch: java.lang.Throwable -> L84
                long r1 = r1 - r3
                long r1 = r6.a(r1)     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1 r6 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L84
                long r3 = r5.f19347b     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1.O(r6, r3)     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1 r6 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L84
                long r3 = io.grpc.internal.y1.T(r6)     // Catch: java.lang.Throwable -> L84
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 <= 0) goto L6d
                io.grpc.internal.y1$b0 r6 = r5.f19346a     // Catch: java.lang.Throwable -> L84
                goto L43
            L6d:
                io.grpc.internal.y1$b0 r6 = r5.f19346a     // Catch: java.lang.Throwable -> L84
                boolean r7 = r6.f19309c     // Catch: java.lang.Throwable -> L84
                if (r7 == 0) goto L7a
                io.grpc.internal.y1 r7 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L84
                java.lang.Runnable r6 = io.grpc.internal.y1.U(r7, r6)     // Catch: java.lang.Throwable -> L84
                goto L7b
            L7a:
                r6 = 0
            L7b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
                if (r6 == 0) goto L81
                r6.run()
            L81:
                return
            L82:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
                return
            L84:
                r6 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.y1.s.h(long):void");
        }
    }

    /* loaded from: classes3.dex */
    public static final class t {

        /* renamed from: a */
        private final AtomicLong f19349a = new AtomicLong();

        long a(long j10) {
            return this.f19349a.addAndGet(j10);
        }
    }

    /* loaded from: classes3.dex */
    public static final class u {

        /* renamed from: a */
        final Object f19350a;

        /* renamed from: b */
        Future<?> f19351b;

        /* renamed from: c */
        boolean f19352c;

        u(Object obj) {
            this.f19350a = obj;
        }

        boolean a() {
            return this.f19352c;
        }

        Future<?> b() {
            this.f19352c = true;
            return this.f19351b;
        }

        void c(Future<?> future) {
            synchronized (this.f19350a) {
                if (!this.f19352c) {
                    this.f19351b = future;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class v {

        /* renamed from: a */
        final boolean f19353a;

        /* renamed from: b */
        final Integer f19354b;

        public v(boolean z10, Integer num) {
            this.f19353a = z10;
            this.f19354b = num;
        }
    }

    /* loaded from: classes3.dex */
    public final class w implements Runnable {

        /* renamed from: a */
        final u f19355a;

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ b0 f19357a;

            a(b0 b0Var) {
                this.f19357a = b0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar;
                y1 y1Var;
                boolean z10;
                synchronized (y1.this.f19274i) {
                    uVar = null;
                    if (w.this.f19355a.a()) {
                        z10 = true;
                    } else {
                        y1 y1Var2 = y1.this;
                        y1Var2.f19280o = y1Var2.f19280o.a(this.f19357a);
                        y1 y1Var3 = y1.this;
                        if (y1Var3.h0(y1Var3.f19280o) && (y1.this.f19278m == null || y1.this.f19278m.a())) {
                            y1Var = y1.this;
                            uVar = new u(y1Var.f19274i);
                        } else {
                            y1 y1Var4 = y1.this;
                            y1Var4.f19280o = y1Var4.f19280o.d();
                            y1Var = y1.this;
                        }
                        y1Var.f19288w = uVar;
                        z10 = false;
                    }
                }
                if (z10) {
                    this.f19357a.f19307a.c(vi.g1.f29101g.r("Unneeded hedging"));
                    return;
                }
                if (uVar != null) {
                    uVar.c(y1.this.f19269d.schedule(new w(uVar), y1.this.f19272g.f19135b, TimeUnit.NANOSECONDS));
                }
                y1.this.f0(this.f19357a);
            }
        }

        w(u uVar) {
            this.f19355a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            y1 y1Var = y1.this;
            b0 d02 = y1Var.d0(y1Var.f19280o.f19366e, false);
            if (d02 == null) {
                return;
            }
            y1.this.f19267b.execute(new a(d02));
        }
    }

    /* loaded from: classes3.dex */
    public static final class x {

        /* renamed from: a */
        final boolean f19359a;

        /* renamed from: b */
        final long f19360b;

        x(boolean z10, long j10) {
            this.f19359a = z10;
            this.f19360b = j10;
        }
    }

    /* loaded from: classes3.dex */
    public class y implements r {
        y() {
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f19307a.o(new a0(b0Var));
        }
    }

    /* loaded from: classes3.dex */
    public static final class z {

        /* renamed from: a */
        final boolean f19362a;

        /* renamed from: b */
        final List<r> f19363b;

        /* renamed from: c */
        final Collection<b0> f19364c;

        /* renamed from: d */
        final Collection<b0> f19365d;

        /* renamed from: e */
        final int f19366e;

        /* renamed from: f */
        final b0 f19367f;

        /* renamed from: g */
        final boolean f19368g;

        /* renamed from: h */
        final boolean f19369h;

        z(List<r> list, Collection<b0> collection, Collection<b0> collection2, b0 b0Var, boolean z10, boolean z11, boolean z12, int i10) {
            this.f19363b = list;
            this.f19364c = (Collection) eb.o.p(collection, "drainedSubstreams");
            this.f19367f = b0Var;
            this.f19365d = collection2;
            this.f19368g = z10;
            this.f19362a = z11;
            this.f19369h = z12;
            this.f19366e = i10;
            eb.o.v(!z11 || list == null, "passThrough should imply buffer is null");
            eb.o.v((z11 && b0Var == null) ? false : true, "passThrough should imply winningSubstream != null");
            eb.o.v(!z11 || (collection.size() == 1 && collection.contains(b0Var)) || (collection.size() == 0 && b0Var.f19308b), "passThrough should imply winningSubstream is drained");
            eb.o.v((z10 && b0Var == null) ? false : true, "cancelled should imply committed");
        }

        z a(b0 b0Var) {
            Collection unmodifiableCollection;
            eb.o.v(!this.f19369h, "hedging frozen");
            eb.o.v(this.f19367f == null, "already committed");
            if (this.f19365d == null) {
                unmodifiableCollection = Collections.singleton(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f19365d);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new z(this.f19363b, this.f19364c, unmodifiableCollection, this.f19367f, this.f19368g, this.f19362a, this.f19369h, this.f19366e + 1);
        }

        z b() {
            return new z(this.f19363b, this.f19364c, this.f19365d, this.f19367f, true, this.f19362a, this.f19369h, this.f19366e);
        }

        z c(b0 b0Var) {
            List<r> list;
            Collection emptyList;
            boolean z10;
            eb.o.v(this.f19367f == null, "Already committed");
            List<r> list2 = this.f19363b;
            if (this.f19364c.contains(b0Var)) {
                emptyList = Collections.singleton(b0Var);
                z10 = true;
                list = null;
            } else {
                list = list2;
                emptyList = Collections.emptyList();
                z10 = false;
            }
            return new z(list, emptyList, this.f19365d, b0Var, this.f19368g, z10, this.f19369h, this.f19366e);
        }

        z d() {
            return this.f19369h ? this : new z(this.f19363b, this.f19364c, this.f19365d, this.f19367f, this.f19368g, this.f19362a, true, this.f19366e);
        }

        z e(b0 b0Var) {
            ArrayList arrayList = new ArrayList(this.f19365d);
            arrayList.remove(b0Var);
            return new z(this.f19363b, this.f19364c, Collections.unmodifiableCollection(arrayList), this.f19367f, this.f19368g, this.f19362a, this.f19369h, this.f19366e);
        }

        z f(b0 b0Var, b0 b0Var2) {
            ArrayList arrayList = new ArrayList(this.f19365d);
            arrayList.remove(b0Var);
            arrayList.add(b0Var2);
            return new z(this.f19363b, this.f19364c, Collections.unmodifiableCollection(arrayList), this.f19367f, this.f19368g, this.f19362a, this.f19369h, this.f19366e);
        }

        z g(b0 b0Var) {
            b0Var.f19308b = true;
            if (!this.f19364c.contains(b0Var)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f19364c);
            arrayList.remove(b0Var);
            return new z(this.f19363b, Collections.unmodifiableCollection(arrayList), this.f19365d, this.f19367f, this.f19368g, this.f19362a, this.f19369h, this.f19366e);
        }

        z h(b0 b0Var) {
            Collection unmodifiableCollection;
            eb.o.v(!this.f19362a, "Already passThrough");
            if (b0Var.f19308b) {
                unmodifiableCollection = this.f19364c;
            } else if (this.f19364c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f19364c);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            b0 b0Var2 = this.f19367f;
            boolean z10 = b0Var2 != null;
            List<r> list = this.f19363b;
            if (z10) {
                eb.o.v(b0Var2 == b0Var, "Another RPC attempt has already committed");
                list = null;
            }
            return new z(list, collection, this.f19365d, this.f19367f, this.f19368g, z10, this.f19369h, this.f19366e);
        }
    }

    static {
        w0.d<String> dVar = vi.w0.f29225e;
        A = w0.g.e("grpc-previous-rpc-attempts", dVar);
        B = w0.g.e("grpc-retry-pushback-ms", dVar);
        C = vi.g1.f29101g.r("Stream thrown away because RetriableStream committed");
        D = new Random();
    }

    public y1(vi.x0<ReqT, ?> x0Var, vi.w0 w0Var, t tVar, long j10, long j11, Executor executor, ScheduledExecutorService scheduledExecutorService, z1 z1Var, s0 s0Var, c0 c0Var) {
        this.f19266a = x0Var;
        this.f19275j = tVar;
        this.f19276k = j10;
        this.f19277l = j11;
        this.f19267b = executor;
        this.f19269d = scheduledExecutorService;
        this.f19270e = w0Var;
        this.f19271f = z1Var;
        if (z1Var != null) {
            this.f19289x = z1Var.f19413b;
        }
        this.f19272g = s0Var;
        eb.o.e(z1Var == null || s0Var == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f19273h = s0Var != null;
        this.f19278m = c0Var;
    }

    public Runnable b0(b0 b0Var) {
        Future<?> future;
        Future<?> future2;
        synchronized (this.f19274i) {
            if (this.f19280o.f19367f != null) {
                return null;
            }
            Collection<b0> collection = this.f19280o.f19364c;
            this.f19280o = this.f19280o.c(b0Var);
            this.f19275j.a(-this.f19285t);
            u uVar = this.f19287v;
            if (uVar != null) {
                Future<?> b10 = uVar.b();
                this.f19287v = null;
                future = b10;
            } else {
                future = null;
            }
            u uVar2 = this.f19288w;
            if (uVar2 != null) {
                Future<?> b11 = uVar2.b();
                this.f19288w = null;
                future2 = b11;
            } else {
                future2 = null;
            }
            return new c(collection, b0Var, future, future2);
        }
    }

    public void c0(b0 b0Var) {
        Runnable b02 = b0(b0Var);
        if (b02 != null) {
            b02.run();
        }
    }

    public b0 d0(int i10, boolean z10) {
        int i11;
        do {
            i11 = this.f19283r.get();
            if (i11 < 0) {
                return null;
            }
        } while (!this.f19283r.compareAndSet(i11, i11 + 1));
        b0 b0Var = new b0(i10);
        b0Var.f19307a = i0(o0(this.f19270e, i10), new o(new s(b0Var)), i10, z10);
        return b0Var;
    }

    private void e0(r rVar) {
        Collection<b0> collection;
        synchronized (this.f19274i) {
            if (!this.f19280o.f19362a) {
                this.f19280o.f19363b.add(rVar);
            }
            collection = this.f19280o.f19364c;
        }
        Iterator<b0> it = collection.iterator();
        while (it.hasNext()) {
            rVar.a(it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r1 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r8.f19268c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r0 = r9.f19307a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r8.f19280o.f19367f != r9) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r9 = r8.f19290y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r0.c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r9 = io.grpc.internal.y1.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r2.hasNext() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        r4 = (io.grpc.internal.y1.r) r2.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        if ((r4 instanceof io.grpc.internal.y1.y) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r0 == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
    
        r4 = r8.f19280o;
        r5 = r4.f19367f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r5 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if (r5 == r9) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        if (r4.f19368g == false) goto L139;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f0(io.grpc.internal.y1.b0 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.f19274i
            monitor-enter(r4)
            io.grpc.internal.y1$z r5 = r8.f19280o     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L18
            io.grpc.internal.y1$b0 r6 = r5.f19367f     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L13
            if (r6 == r9) goto L13
        L11:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            goto L34
        L13:
            boolean r6 = r5.f19368g     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L18
            goto L11
        L18:
            java.util.List<io.grpc.internal.y1$r> r6 = r5.f19363b     // Catch: java.lang.Throwable -> La4
            int r6 = r6.size()     // Catch: java.lang.Throwable -> La4
            if (r2 != r6) goto L4d
            io.grpc.internal.y1$z r0 = r5.h(r9)     // Catch: java.lang.Throwable -> La4
            r8.f19280o = r0     // Catch: java.lang.Throwable -> La4
            boolean r0 = r8.d()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L2e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            return
        L2e:
            io.grpc.internal.y1$p r1 = new io.grpc.internal.y1$p     // Catch: java.lang.Throwable -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> La4
            goto L11
        L34:
            if (r1 == 0) goto L3c
            java.util.concurrent.Executor r9 = r8.f19268c
            r9.execute(r1)
            return
        L3c:
            io.grpc.internal.q r0 = r9.f19307a
            io.grpc.internal.y1$z r1 = r8.f19280o
            io.grpc.internal.y1$b0 r1 = r1.f19367f
            if (r1 != r9) goto L47
            vi.g1 r9 = r8.f19290y
            goto L49
        L47:
            vi.g1 r9 = io.grpc.internal.y1.C
        L49:
            r0.c(r9)
            return
        L4d:
            boolean r6 = r9.f19308b     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L53
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            return
        L53:
            int r6 = r2 + 128
            java.util.List<io.grpc.internal.y1$r> r7 = r5.f19363b     // Catch: java.lang.Throwable -> La4
            int r7 = r7.size()     // Catch: java.lang.Throwable -> La4
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> La4
            if (r3 != 0) goto L6d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La4
            java.util.List<io.grpc.internal.y1$r> r5 = r5.f19363b     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La4
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La4
            goto L79
        L6d:
            r3.clear()     // Catch: java.lang.Throwable -> La4
            java.util.List<io.grpc.internal.y1$r> r5 = r5.f19363b     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La4
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La4
        L79:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r2 = r3.iterator()
        L7e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La1
            java.lang.Object r4 = r2.next()
            io.grpc.internal.y1$r r4 = (io.grpc.internal.y1.r) r4
            r4.a(r9)
            boolean r4 = r4 instanceof io.grpc.internal.y1.y
            if (r4 == 0) goto L92
            r0 = 1
        L92:
            if (r0 == 0) goto L7e
            io.grpc.internal.y1$z r4 = r8.f19280o
            io.grpc.internal.y1$b0 r5 = r4.f19367f
            if (r5 == 0) goto L9d
            if (r5 == r9) goto L9d
            goto La1
        L9d:
            boolean r4 = r4.f19368g
            if (r4 == 0) goto L7e
        La1:
            r2 = r6
            goto L4
        La4:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.y1.f0(io.grpc.internal.y1$b0):void");
    }

    public void g0() {
        Future<?> future;
        synchronized (this.f19274i) {
            u uVar = this.f19288w;
            future = null;
            if (uVar != null) {
                Future<?> b10 = uVar.b();
                this.f19288w = null;
                future = b10;
            }
            this.f19280o = this.f19280o.d();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public boolean h0(z zVar) {
        return zVar.f19367f == null && zVar.f19366e < this.f19272g.f19134a && !zVar.f19369h;
    }

    public void l0(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            g0();
            return;
        }
        synchronized (this.f19274i) {
            u uVar = this.f19288w;
            if (uVar == null) {
                return;
            }
            Future<?> b10 = uVar.b();
            u uVar2 = new u(this.f19274i);
            this.f19288w = uVar2;
            if (b10 != null) {
                b10.cancel(false);
            }
            uVar2.c(this.f19269d.schedule(new w(uVar2), num.intValue(), TimeUnit.MILLISECONDS));
        }
    }

    public void m0(vi.g1 g1Var, r.a aVar, vi.w0 w0Var) {
        this.f19268c.execute(new q(g1Var, aVar, w0Var));
    }

    @Override // io.grpc.internal.i2
    public final void a(vi.n nVar) {
        e0(new d(nVar));
    }

    @Override // io.grpc.internal.i2
    public final void b(int i10) {
        z zVar = this.f19280o;
        if (zVar.f19362a) {
            zVar.f19367f.f19307a.b(i10);
        } else {
            e0(new m(i10));
        }
    }

    @Override // io.grpc.internal.q
    public final void c(vi.g1 g1Var) {
        b0 b0Var;
        b0 b0Var2 = new b0(0);
        b0Var2.f19307a = new n1();
        Runnable b02 = b0(b0Var2);
        if (b02 != null) {
            this.f19284s = g1Var;
            b02.run();
            if (this.f19283r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                m0(g1Var, r.a.PROCESSED, new vi.w0());
                return;
            }
            return;
        }
        synchronized (this.f19274i) {
            if (this.f19280o.f19364c.contains(this.f19280o.f19367f)) {
                b0Var = this.f19280o.f19367f;
            } else {
                this.f19290y = g1Var;
                b0Var = null;
            }
            this.f19280o = this.f19280o.b();
        }
        if (b0Var != null) {
            b0Var.f19307a.c(g1Var);
        }
    }

    @Override // io.grpc.internal.i2
    public final boolean d() {
        Iterator<b0> it = this.f19280o.f19364c.iterator();
        while (it.hasNext()) {
            if (it.next().f19307a.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.q
    public final void e(int i10) {
        e0(new j(i10));
    }

    @Override // io.grpc.internal.q
    public final void f(int i10) {
        e0(new k(i10));
    }

    @Override // io.grpc.internal.i2
    public final void flush() {
        z zVar = this.f19280o;
        if (zVar.f19362a) {
            zVar.f19367f.f19307a.flush();
        } else {
            e0(new g());
        }
    }

    @Override // io.grpc.internal.q
    public final void g(vi.t tVar) {
        e0(new e(tVar));
    }

    @Override // io.grpc.internal.i2
    public final void h(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // io.grpc.internal.i2
    public void i() {
        e0(new l());
    }

    abstract io.grpc.internal.q i0(vi.w0 w0Var, k.a aVar, int i10, boolean z10);

    @Override // io.grpc.internal.q
    public final void j(boolean z10) {
        e0(new h(z10));
    }

    abstract void j0();

    @Override // io.grpc.internal.q
    public final void k(vi.v vVar) {
        e0(new f(vVar));
    }

    abstract vi.g1 k0();

    @Override // io.grpc.internal.q
    public final void l(String str) {
        e0(new b(str));
    }

    @Override // io.grpc.internal.q
    public void m(w0 w0Var) {
        z zVar;
        w0 w0Var2;
        String str;
        synchronized (this.f19274i) {
            w0Var.b("closed", this.f19279n);
            zVar = this.f19280o;
        }
        if (zVar.f19367f != null) {
            w0Var2 = new w0();
            zVar.f19367f.f19307a.m(w0Var2);
            str = "committed";
        } else {
            w0Var2 = new w0();
            for (b0 b0Var : zVar.f19364c) {
                w0 w0Var3 = new w0();
                b0Var.f19307a.m(w0Var3);
                w0Var2.a(w0Var3);
            }
            str = "open";
        }
        w0Var.b(str, w0Var2);
    }

    @Override // io.grpc.internal.q
    public final void n() {
        e0(new i());
    }

    public final void n0(ReqT reqt) {
        z zVar = this.f19280o;
        if (zVar.f19362a) {
            zVar.f19367f.f19307a.h(this.f19266a.j(reqt));
        } else {
            e0(new n(reqt));
        }
    }

    @Override // io.grpc.internal.q
    public final void o(io.grpc.internal.r rVar) {
        u uVar;
        c0 c0Var;
        this.f19286u = rVar;
        vi.g1 k02 = k0();
        if (k02 != null) {
            c(k02);
            return;
        }
        synchronized (this.f19274i) {
            this.f19280o.f19363b.add(new y());
        }
        b0 d02 = d0(0, false);
        if (d02 == null) {
            return;
        }
        if (this.f19273h) {
            synchronized (this.f19274i) {
                this.f19280o = this.f19280o.a(d02);
                if (h0(this.f19280o) && ((c0Var = this.f19278m) == null || c0Var.a())) {
                    uVar = new u(this.f19274i);
                    this.f19288w = uVar;
                } else {
                    uVar = null;
                }
            }
            if (uVar != null) {
                uVar.c(this.f19269d.schedule(new w(uVar), this.f19272g.f19135b, TimeUnit.NANOSECONDS));
            }
        }
        f0(d02);
    }

    final vi.w0 o0(vi.w0 w0Var, int i10) {
        vi.w0 w0Var2 = new vi.w0();
        w0Var2.l(w0Var);
        if (i10 > 0) {
            w0Var2.o(A, String.valueOf(i10));
        }
        return w0Var2;
    }
}
