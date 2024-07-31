package wi;

import com.google.android.gms.common.api.a;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import dm.x;
import dm.y;
import eb.t;
import io.flutter.embedding.android.KeyboardMap;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.grpc.internal.b1;
import io.grpc.internal.c2;
import io.grpc.internal.h2;
import io.grpc.internal.j1;
import io.grpc.internal.n2;
import io.grpc.internal.p0;
import io.grpc.internal.q0;
import io.grpc.internal.r;
import io.grpc.internal.s;
import io.grpc.internal.u0;
import io.grpc.internal.v;
import io.grpc.internal.v0;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import vi.a0;
import vi.b0;
import vi.c0;
import vi.e1;
import vi.g1;
import vi.h1;
import vi.i0;
import vi.w0;
import vi.x0;
import wi.b;
import wi.f;
import wi.h;
import wi.j;
import wi.q;
import xi.b;
import yi.a;
import yi.b;

/* loaded from: classes3.dex */
public class i implements v, b.a, q.d {
    private static final Map<xi.a, g1> W = Q();
    private static final Logger X = Logger.getLogger(i.class.getName());
    private final SocketFactory A;
    private SSLSocketFactory B;
    private HostnameVerifier C;
    private Socket D;
    private int E;
    private final Deque<h> F;
    private final io.grpc.okhttp.internal.b G;
    private b1 H;
    private boolean I;
    private long J;
    private long K;
    private boolean L;
    private final Runnable M;
    private final int N;
    private final boolean O;
    private final n2 P;
    private final v0<h> Q;
    private c0.b R;
    final b0 S;
    int T;
    Runnable U;
    com.google.common.util.concurrent.j<Void> V;

    /* renamed from: a */
    private final InetSocketAddress f30096a;

    /* renamed from: b */
    private final String f30097b;

    /* renamed from: c */
    private final String f30098c;

    /* renamed from: d */
    private final Random f30099d;

    /* renamed from: e */
    private final eb.v<t> f30100e;

    /* renamed from: f */
    private final int f30101f;

    /* renamed from: g */
    private final xi.j f30102g;

    /* renamed from: h */
    private j1.a f30103h;

    /* renamed from: i */
    private wi.b f30104i;

    /* renamed from: j */
    private q f30105j;

    /* renamed from: k */
    private final Object f30106k;

    /* renamed from: l */
    private final i0 f30107l;

    /* renamed from: m */
    private int f30108m;

    /* renamed from: n */
    private final Map<Integer, h> f30109n;

    /* renamed from: o */
    private final Executor f30110o;

    /* renamed from: p */
    private final c2 f30111p;

    /* renamed from: q */
    private final ScheduledExecutorService f30112q;

    /* renamed from: r */
    private final int f30113r;

    /* renamed from: s */
    private int f30114s;

    /* renamed from: t */
    private e f30115t;

    /* renamed from: u */
    private vi.a f30116u;

    /* renamed from: v */
    private g1 f30117v;

    /* renamed from: w */
    private boolean f30118w;

    /* renamed from: x */
    private u0 f30119x;

    /* renamed from: y */
    private boolean f30120y;

    /* renamed from: z */
    private boolean f30121z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends v0<h> {
        a() {
        }

        @Override // io.grpc.internal.v0
        protected void b() {
            i.this.f30103h.b(true);
        }

        @Override // io.grpc.internal.v0
        protected void c() {
            i.this.f30103h.b(false);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements n2.c {
        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f30124a;

        /* renamed from: b */
        final /* synthetic */ wi.a f30125b;

        /* loaded from: classes3.dex */
        class a implements x {
            a() {
            }

            @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // dm.x
            public y m() {
                return y.f14339e;
            }

            @Override // dm.x
            public long s1(dm.b bVar, long j10) {
                return -1L;
            }
        }

        c(CountDownLatch countDownLatch, wi.a aVar) {
            this.f30124a = countDownLatch;
            this.f30125b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar;
            e eVar;
            Socket S;
            SSLSession sSLSession;
            Socket socket;
            try {
                this.f30124a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            dm.d b10 = dm.l.b(new a());
            try {
                try {
                    i iVar2 = i.this;
                    b0 b0Var = iVar2.S;
                    if (b0Var == null) {
                        S = iVar2.A.createSocket(i.this.f30096a.getAddress(), i.this.f30096a.getPort());
                    } else {
                        if (!(b0Var.b() instanceof InetSocketAddress)) {
                            throw g1.f29114t.r("Unsupported SocketAddress implementation " + i.this.S.b().getClass()).c();
                        }
                        i iVar3 = i.this;
                        S = iVar3.S(iVar3.S.c(), (InetSocketAddress) i.this.S.b(), i.this.S.d(), i.this.S.a());
                    }
                    Socket socket2 = S;
                    if (i.this.B != null) {
                        SSLSocket b11 = n.b(i.this.B, i.this.C, socket2, i.this.W(), i.this.X(), i.this.G);
                        sSLSession = b11.getSession();
                        socket = b11;
                    } else {
                        sSLSession = null;
                        socket = socket2;
                    }
                    socket.setTcpNoDelay(true);
                    dm.d b12 = dm.l.b(dm.l.h(socket));
                    this.f30125b.q(dm.l.e(socket), socket);
                    i iVar4 = i.this;
                    iVar4.f30116u = iVar4.f30116u.d().d(a0.f29029a, socket.getRemoteSocketAddress()).d(a0.f29030b, socket.getLocalSocketAddress()).d(a0.f29031c, sSLSession).d(p0.f19071a, sSLSession == null ? e1.NONE : e1.PRIVACY_AND_INTEGRITY).a();
                    i iVar5 = i.this;
                    iVar5.f30115t = new e(iVar5.f30102g.b(b12, true));
                    synchronized (i.this.f30106k) {
                        i.this.D = (Socket) eb.o.p(socket, "socket");
                        if (sSLSession != null) {
                            i.this.R = new c0.b(new c0.c(sSLSession));
                        }
                    }
                } catch (h1 e10) {
                    i.this.k0(0, xi.a.INTERNAL_ERROR, e10.a());
                    iVar = i.this;
                    eVar = new e(iVar.f30102g.b(b10, true));
                    iVar.f30115t = eVar;
                } catch (Exception e11) {
                    i.this.h(e11);
                    iVar = i.this;
                    eVar = new e(iVar.f30102g.b(b10, true));
                    iVar.f30115t = eVar;
                }
            } catch (Throwable th2) {
                i iVar6 = i.this;
                iVar6.f30115t = new e(iVar6.f30102g.b(b10, true));
                throw th2;
            }
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = i.this.U;
            if (runnable != null) {
                runnable.run();
            }
            i.this.f30110o.execute(i.this.f30115t);
            synchronized (i.this.f30106k) {
                i.this.E = a.e.API_PRIORITY_OTHER;
                i.this.l0();
            }
            com.google.common.util.concurrent.j<Void> jVar = i.this.V;
            if (jVar != null) {
                jVar.A(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e implements b.a, Runnable {

        /* renamed from: b */
        xi.b f30130b;

        /* renamed from: a */
        private final j f30129a = new j(Level.FINE, (Class<?>) i.class);

        /* renamed from: c */
        boolean f30131c = true;

        e(xi.b bVar) {
            this.f30130b = bVar;
        }

        private int a(List<xi.d> list) {
            long j10 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                xi.d dVar = list.get(i10);
                j10 += dVar.f31324a.B() + 32 + dVar.f31325b.B();
            }
            return (int) Math.min(j10, 2147483647L);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // xi.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(int r8, long r9) {
            /*
                r7 = this;
                wi.j r0 = r7.f30129a
                wi.j$a r1 = wi.j.a.INBOUND
                r0.k(r1, r8, r9)
                r0 = 0
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 != 0) goto L2c
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L19
                wi.i r8 = wi.i.this
                xi.a r10 = xi.a.PROTOCOL_ERROR
                wi.i.A(r8, r10, r9)
                goto L2b
            L19:
                wi.i r0 = wi.i.this
                vi.g1 r10 = vi.g1.f29114t
                vi.g1 r2 = r10.r(r9)
                io.grpc.internal.r$a r3 = io.grpc.internal.r.a.PROCESSED
                r4 = 0
                xi.a r5 = xi.a.PROTOCOL_ERROR
                r6 = 0
                r1 = r8
                r0.U(r1, r2, r3, r4, r5, r6)
            L2b:
                return
            L2c:
                wi.i r0 = wi.i.this
                java.lang.Object r0 = wi.i.j(r0)
                monitor-enter(r0)
                if (r8 != 0) goto L42
                wi.i r8 = wi.i.this     // Catch: java.lang.Throwable -> L8e
                wi.q r8 = wi.i.w(r8)     // Catch: java.lang.Throwable -> L8e
                r1 = 0
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L8e
                r8.g(r1, r9)     // Catch: java.lang.Throwable -> L8e
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
                return
            L42:
                wi.i r1 = wi.i.this     // Catch: java.lang.Throwable -> L8e
                java.util.Map r1 = wi.i.F(r1)     // Catch: java.lang.Throwable -> L8e
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L8e
                wi.h r1 = (wi.h) r1     // Catch: java.lang.Throwable -> L8e
                if (r1 == 0) goto L67
                wi.i r2 = wi.i.this     // Catch: java.lang.Throwable -> L8e
                wi.q r2 = wi.i.w(r2)     // Catch: java.lang.Throwable -> L8e
                wi.h$b r1 = r1.t()     // Catch: java.lang.Throwable -> L8e
                wi.q$c r1 = r1.b0()     // Catch: java.lang.Throwable -> L8e
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L8e
                r2.g(r1, r9)     // Catch: java.lang.Throwable -> L8e
                goto L71
            L67:
                wi.i r9 = wi.i.this     // Catch: java.lang.Throwable -> L8e
                boolean r9 = r9.c0(r8)     // Catch: java.lang.Throwable -> L8e
                if (r9 != 0) goto L71
                r9 = 1
                goto L72
            L71:
                r9 = 0
            L72:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 == 0) goto L8d
                wi.i r9 = wi.i.this
                xi.a r10 = xi.a.PROTOCOL_ERROR
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received window_update for unknown stream: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                wi.i.A(r9, r10, r8)
            L8d:
                return
            L8e:
                r8 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: wi.i.e.d(int, long):void");
        }

        @Override // xi.b.a
        public void h(boolean z10, int i10, int i11) {
            u0 u0Var;
            long j10 = (i10 << 32) | (i11 & KeyboardMap.kValueMask);
            this.f30129a.e(j.a.INBOUND, j10);
            if (!z10) {
                synchronized (i.this.f30106k) {
                    i.this.f30104i.h(true, i10, i11);
                }
                return;
            }
            synchronized (i.this.f30106k) {
                u0Var = null;
                if (i.this.f30119x == null) {
                    i.X.warning("Received unexpected ping ack. No ping outstanding");
                } else if (i.this.f30119x.h() == j10) {
                    u0 u0Var2 = i.this.f30119x;
                    i.this.f30119x = null;
                    u0Var = u0Var2;
                } else {
                    i.X.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(i.this.f30119x.h()), Long.valueOf(j10)));
                }
            }
            if (u0Var != null) {
                u0Var.d();
            }
        }

        @Override // xi.b.a
        public void i(boolean z10, int i10, dm.d dVar, int i11) {
            this.f30129a.b(j.a.INBOUND, i10, dVar.c(), i11, z10);
            h Z = i.this.Z(i10);
            if (Z != null) {
                long j10 = i11;
                dVar.q0(j10);
                dm.b bVar = new dm.b();
                bVar.K0(dVar.c(), j10);
                cj.c.c("OkHttpClientTransport$ClientFrameHandler.data", Z.t().h0());
                synchronized (i.this.f30106k) {
                    Z.t().i0(bVar, z10);
                }
            } else {
                if (!i.this.c0(i10)) {
                    i.this.f0(xi.a.PROTOCOL_ERROR, "Received data for unknown stream: " + i10);
                    return;
                }
                synchronized (i.this.f30106k) {
                    i.this.f30104i.s(i10, xi.a.STREAM_CLOSED);
                }
                dVar.skip(i11);
            }
            i.D(i.this, i11);
            if (i.this.f30114s >= i.this.f30101f * 0.5f) {
                synchronized (i.this.f30106k) {
                    i.this.f30104i.d(0, i.this.f30114s);
                }
                i.this.f30114s = 0;
            }
        }

        @Override // xi.b.a
        public void j(int i10, int i11, List<xi.d> list) {
            this.f30129a.g(j.a.INBOUND, i10, i11, list);
            synchronized (i.this.f30106k) {
                i.this.f30104i.s(i10, xi.a.PROTOCOL_ERROR);
            }
        }

        @Override // xi.b.a
        public void k() {
        }

        @Override // xi.b.a
        public void l(int i10, int i11, int i12, boolean z10) {
        }

        @Override // java.lang.Runnable
        public void run() {
            g1 g1Var;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f30130b.p1(this)) {
                try {
                    if (i.this.H != null) {
                        i.this.H.l();
                    }
                } catch (Throwable th2) {
                    try {
                        i.this.k0(0, xi.a.PROTOCOL_ERROR, g1.f29114t.r("error in frame handler").q(th2));
                        try {
                            this.f30130b.close();
                        } catch (IOException e10) {
                            e = e10;
                            i.X.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            i.this.f30103h.c();
                            Thread.currentThread().setName(name);
                        }
                    } catch (Throwable th3) {
                        try {
                            this.f30130b.close();
                        } catch (IOException e11) {
                            i.X.log(Level.INFO, "Exception closing frame reader", (Throwable) e11);
                        }
                        i.this.f30103h.c();
                        Thread.currentThread().setName(name);
                        throw th3;
                    }
                }
            }
            synchronized (i.this.f30106k) {
                g1Var = i.this.f30117v;
            }
            if (g1Var == null) {
                g1Var = g1.f29115u.r("End of stream or IOException");
            }
            i.this.k0(0, xi.a.INTERNAL_ERROR, g1Var);
            try {
                this.f30130b.close();
            } catch (IOException e12) {
                e = e12;
                i.X.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                i.this.f30103h.c();
                Thread.currentThread().setName(name);
            }
            i.this.f30103h.c();
            Thread.currentThread().setName(name);
        }

        @Override // xi.b.a
        public void s(int i10, xi.a aVar) {
            this.f30129a.h(j.a.INBOUND, i10, aVar);
            g1 f10 = i.p0(aVar).f("Rst Stream");
            boolean z10 = f10.n() == g1.b.CANCELLED || f10.n() == g1.b.DEADLINE_EXCEEDED;
            synchronized (i.this.f30106k) {
                h hVar = (h) i.this.f30109n.get(Integer.valueOf(i10));
                if (hVar != null) {
                    cj.c.c("OkHttpClientTransport$ClientFrameHandler.rstStream", hVar.t().h0());
                    i.this.U(i10, f10, aVar == xi.a.REFUSED_STREAM ? r.a.REFUSED : r.a.PROCESSED, z10, null, null);
                }
            }
        }

        @Override // xi.b.a
        public void t(boolean z10, boolean z11, int i10, int i11, List<xi.d> list, xi.e eVar) {
            g1 g1Var;
            int a10;
            this.f30129a.d(j.a.INBOUND, i10, list, z11);
            boolean z12 = true;
            if (i.this.N == Integer.MAX_VALUE || (a10 = a(list)) <= i.this.N) {
                g1Var = null;
            } else {
                g1 g1Var2 = g1.f29109o;
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                objArr[0] = z11 ? "trailer" : "header";
                objArr[1] = Integer.valueOf(i.this.N);
                objArr[2] = Integer.valueOf(a10);
                g1Var = g1Var2.r(String.format(locale, "Response %s metadata larger than %d: %d", objArr));
            }
            synchronized (i.this.f30106k) {
                h hVar = (h) i.this.f30109n.get(Integer.valueOf(i10));
                if (hVar == null) {
                    if (i.this.c0(i10)) {
                        i.this.f30104i.s(i10, xi.a.STREAM_CLOSED);
                    }
                } else if (g1Var == null) {
                    cj.c.c("OkHttpClientTransport$ClientFrameHandler.headers", hVar.t().h0());
                    hVar.t().j0(list, z11);
                } else {
                    if (!z11) {
                        i.this.f30104i.s(i10, xi.a.CANCEL);
                    }
                    hVar.t().N(g1Var, false, new w0());
                }
                z12 = false;
            }
            if (z12) {
                i.this.f0(xi.a.PROTOCOL_ERROR, "Received header for unknown stream: " + i10);
            }
        }

        @Override // xi.b.a
        public void u(boolean z10, xi.i iVar) {
            boolean z11;
            this.f30129a.i(j.a.INBOUND, iVar);
            synchronized (i.this.f30106k) {
                if (m.b(iVar, 4)) {
                    i.this.E = m.a(iVar, 4);
                }
                if (m.b(iVar, 7)) {
                    z11 = i.this.f30105j.f(m.a(iVar, 7));
                } else {
                    z11 = false;
                }
                if (this.f30131c) {
                    i.this.f30103h.a();
                    this.f30131c = false;
                }
                i.this.f30104i.o1(iVar);
                if (z11) {
                    i.this.f30105j.h();
                }
                i.this.l0();
            }
        }

        @Override // xi.b.a
        public void v(int i10, xi.a aVar, dm.e eVar) {
            this.f30129a.c(j.a.INBOUND, i10, aVar, eVar);
            if (aVar == xi.a.ENHANCE_YOUR_CALM) {
                String F = eVar.F();
                i.X.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, F));
                if ("too_many_pings".equals(F)) {
                    i.this.M.run();
                }
            }
            g1 f10 = q0.h.m(aVar.httpCode).f("Received Goaway");
            if (eVar.B() > 0) {
                f10 = f10.f(eVar.F());
            }
            i.this.k0(i10, null, f10);
        }
    }

    private i(f.C0487f c0487f, InetSocketAddress inetSocketAddress, String str, String str2, vi.a aVar, eb.v<t> vVar, xi.j jVar, b0 b0Var, Runnable runnable) {
        this.f30099d = new Random();
        this.f30106k = new Object();
        this.f30109n = new HashMap();
        this.E = 0;
        this.F = new LinkedList();
        this.Q = new a();
        this.T = 30000;
        this.f30096a = (InetSocketAddress) eb.o.p(inetSocketAddress, "address");
        this.f30097b = str;
        this.f30113r = c0487f.f30076u;
        this.f30101f = c0487f.f30081z;
        this.f30110o = (Executor) eb.o.p(c0487f.f30068b, "executor");
        this.f30111p = new c2(c0487f.f30068b);
        this.f30112q = (ScheduledExecutorService) eb.o.p(c0487f.f30070d, "scheduledExecutorService");
        this.f30108m = 3;
        SocketFactory socketFactory = c0487f.f30072f;
        this.A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.B = c0487f.f30073r;
        this.C = c0487f.f30074s;
        this.G = (io.grpc.okhttp.internal.b) eb.o.p(c0487f.f30075t, "connectionSpec");
        this.f30100e = (eb.v) eb.o.p(vVar, "stopwatchFactory");
        this.f30102g = (xi.j) eb.o.p(jVar, "variant");
        this.f30098c = q0.g("okhttp", str2);
        this.S = b0Var;
        this.M = (Runnable) eb.o.p(runnable, "tooManyPingsRunnable");
        this.N = c0487f.B;
        this.P = c0487f.f30071e.a();
        this.f30107l = i0.a(getClass(), inetSocketAddress.toString());
        this.f30116u = vi.a.c().d(p0.f19072b, aVar).a();
        this.O = c0487f.C;
        a0();
    }

    public i(f.C0487f c0487f, InetSocketAddress inetSocketAddress, String str, String str2, vi.a aVar, b0 b0Var, Runnable runnable) {
        this(c0487f, inetSocketAddress, str, str2, aVar, q0.f19103w, new xi.g(), b0Var, runnable);
    }

    static /* synthetic */ int D(i iVar, int i10) {
        int i11 = iVar.f30114s + i10;
        iVar.f30114s = i11;
        return i11;
    }

    private static Map<xi.a, g1> Q() {
        EnumMap enumMap = new EnumMap(xi.a.class);
        xi.a aVar = xi.a.NO_ERROR;
        g1 g1Var = g1.f29114t;
        enumMap.put((EnumMap) aVar, (xi.a) g1Var.r("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) xi.a.PROTOCOL_ERROR, (xi.a) g1Var.r("Protocol error"));
        enumMap.put((EnumMap) xi.a.INTERNAL_ERROR, (xi.a) g1Var.r("Internal error"));
        enumMap.put((EnumMap) xi.a.FLOW_CONTROL_ERROR, (xi.a) g1Var.r("Flow control error"));
        enumMap.put((EnumMap) xi.a.STREAM_CLOSED, (xi.a) g1Var.r("Stream closed"));
        enumMap.put((EnumMap) xi.a.FRAME_TOO_LARGE, (xi.a) g1Var.r("Frame too large"));
        enumMap.put((EnumMap) xi.a.REFUSED_STREAM, (xi.a) g1.f29115u.r("Refused stream"));
        enumMap.put((EnumMap) xi.a.CANCEL, (xi.a) g1.f29101g.r("Cancelled"));
        enumMap.put((EnumMap) xi.a.COMPRESSION_ERROR, (xi.a) g1Var.r("Compression error"));
        enumMap.put((EnumMap) xi.a.CONNECT_ERROR, (xi.a) g1Var.r("Connect error"));
        enumMap.put((EnumMap) xi.a.ENHANCE_YOUR_CALM, (xi.a) g1.f29109o.r("Enhance your calm"));
        enumMap.put((EnumMap) xi.a.INADEQUATE_SECURITY, (xi.a) g1.f29107m.r("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    private yi.b R(InetSocketAddress inetSocketAddress, String str, String str2) {
        yi.a a10 = new a.b().k("https").h(inetSocketAddress.getHostName()).j(inetSocketAddress.getPort()).a();
        b.C0534b d10 = new b.C0534b().e(a10).d("Host", a10.c() + ":" + a10.f()).d("User-Agent", this.f30098c);
        if (str != null && str2 != null) {
            d10.d("Proxy-Authorization", io.grpc.okhttp.internal.c.a(str, str2));
        }
        return d10.c();
    }

    public Socket S(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket socket = null;
        try {
            socket = inetSocketAddress2.getAddress() != null ? this.A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socket.setTcpNoDelay(true);
            socket.setSoTimeout(this.T);
            x h10 = dm.l.h(socket);
            dm.c a10 = dm.l.a(dm.l.e(socket));
            yi.b R = R(inetSocketAddress, str, str2);
            yi.a b10 = R.b();
            a10.T(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", b10.c(), Integer.valueOf(b10.f()))).T("\r\n");
            int b11 = R.a().b();
            for (int i10 = 0; i10 < b11; i10++) {
                a10.T(R.a().a(i10)).T(": ").T(R.a().c(i10)).T("\r\n");
            }
            a10.T("\r\n");
            a10.flush();
            io.grpc.okhttp.internal.j a11 = io.grpc.okhttp.internal.j.a(g0(h10));
            do {
            } while (!g0(h10).equals(""));
            int i11 = a11.f19466b;
            if (i11 >= 200 && i11 < 300) {
                socket.setSoTimeout(0);
                return socket;
            }
            dm.b bVar = new dm.b();
            try {
                socket.shutdownOutput();
                h10.s1(bVar, 1024L);
            } catch (IOException e10) {
                bVar.T("Unable to read body: " + e10.toString());
            }
            try {
                socket.close();
            } catch (IOException unused) {
            }
            throw g1.f29115u.r(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(a11.f19466b), a11.f19467c, bVar.h0())).c();
        } catch (IOException e11) {
            if (socket != null) {
                q0.e(socket);
            }
            throw g1.f29115u.r("Failed trying to connect with proxy").q(e11).c();
        }
    }

    private Throwable Y() {
        synchronized (this.f30106k) {
            g1 g1Var = this.f30117v;
            if (g1Var != null) {
                return g1Var.c();
            }
            return g1.f29115u.r("Connection closed").c();
        }
    }

    private void a0() {
        synchronized (this.f30106k) {
            this.P.g(new b());
        }
    }

    private void d0(h hVar) {
        if (this.f30121z && this.F.isEmpty() && this.f30109n.isEmpty()) {
            this.f30121z = false;
            b1 b1Var = this.H;
            if (b1Var != null) {
                b1Var.n();
            }
        }
        if (hVar.x()) {
            this.Q.e(hVar, false);
        }
    }

    public void f0(xi.a aVar, String str) {
        k0(0, aVar, p0(aVar).f(str));
    }

    private static String g0(x xVar) {
        dm.b bVar = new dm.b();
        while (xVar.s1(bVar, 1L) != -1) {
            if (bVar.l(bVar.size() - 1) == 10) {
                return bVar.d0();
            }
        }
        throw new EOFException("\\n not found: " + bVar.I().r());
    }

    private void i0() {
        synchronized (this.f30106k) {
            this.f30104i.G();
            xi.i iVar = new xi.i();
            m.c(iVar, 7, this.f30101f);
            this.f30104i.P0(iVar);
            if (this.f30101f > 65535) {
                this.f30104i.d(0, r1 - 65535);
            }
        }
    }

    private void j0(h hVar) {
        if (!this.f30121z) {
            this.f30121z = true;
            b1 b1Var = this.H;
            if (b1Var != null) {
                b1Var.m();
            }
        }
        if (hVar.x()) {
            this.Q.e(hVar, true);
        }
    }

    public void k0(int i10, xi.a aVar, g1 g1Var) {
        synchronized (this.f30106k) {
            if (this.f30117v == null) {
                this.f30117v = g1Var;
                this.f30103h.d(g1Var);
            }
            if (aVar != null && !this.f30118w) {
                this.f30118w = true;
                this.f30104i.F(0, aVar, new byte[0]);
            }
            Iterator<Map.Entry<Integer, h>> it = this.f30109n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, h> next = it.next();
                if (next.getKey().intValue() > i10) {
                    it.remove();
                    next.getValue().t().M(g1Var, r.a.REFUSED, false, new w0());
                    d0(next.getValue());
                }
            }
            for (h hVar : this.F) {
                hVar.t().M(g1Var, r.a.MISCARRIED, true, new w0());
                d0(hVar);
            }
            this.F.clear();
            n0();
        }
    }

    public boolean l0() {
        boolean z10 = false;
        while (!this.F.isEmpty() && this.f30109n.size() < this.E) {
            m0(this.F.poll());
            z10 = true;
        }
        return z10;
    }

    private void m0(h hVar) {
        eb.o.v(hVar.t().c0() == -1, "StreamId already assigned");
        this.f30109n.put(Integer.valueOf(this.f30108m), hVar);
        j0(hVar);
        hVar.t().f0(this.f30108m);
        if ((hVar.L() != x0.d.UNARY && hVar.L() != x0.d.SERVER_STREAMING) || hVar.N()) {
            this.f30104i.flush();
        }
        int i10 = this.f30108m;
        if (i10 < 2147483645) {
            this.f30108m = i10 + 2;
        } else {
            this.f30108m = a.e.API_PRIORITY_OTHER;
            k0(a.e.API_PRIORITY_OTHER, xi.a.NO_ERROR, g1.f29115u.r("Stream ids exhausted"));
        }
    }

    private void n0() {
        if (this.f30117v == null || !this.f30109n.isEmpty() || !this.F.isEmpty() || this.f30120y) {
            return;
        }
        this.f30120y = true;
        b1 b1Var = this.H;
        if (b1Var != null) {
            b1Var.p();
        }
        u0 u0Var = this.f30119x;
        if (u0Var != null) {
            u0Var.f(Y());
            this.f30119x = null;
        }
        if (!this.f30118w) {
            this.f30118w = true;
            this.f30104i.F(0, xi.a.NO_ERROR, new byte[0]);
        }
        this.f30104i.close();
    }

    static g1 p0(xi.a aVar) {
        g1 g1Var = W.get(aVar);
        if (g1Var != null) {
            return g1Var;
        }
        return g1.f29102h.r("Unknown http2 error code: " + aVar.httpCode);
    }

    public void T(boolean z10, long j10, long j11, boolean z11) {
        this.I = z10;
        this.J = j10;
        this.K = j11;
        this.L = z11;
    }

    public void U(int i10, g1 g1Var, r.a aVar, boolean z10, xi.a aVar2, w0 w0Var) {
        synchronized (this.f30106k) {
            h remove = this.f30109n.remove(Integer.valueOf(i10));
            if (remove != null) {
                if (aVar2 != null) {
                    this.f30104i.s(i10, xi.a.CANCEL);
                }
                if (g1Var != null) {
                    h.b t10 = remove.t();
                    if (w0Var == null) {
                        w0Var = new w0();
                    }
                    t10.M(g1Var, aVar, z10, w0Var);
                }
                if (!l0()) {
                    n0();
                    d0(remove);
                }
            }
        }
    }

    public vi.a V() {
        return this.f30116u;
    }

    String W() {
        URI b10 = q0.b(this.f30097b);
        return b10.getHost() != null ? b10.getHost() : this.f30097b;
    }

    int X() {
        URI b10 = q0.b(this.f30097b);
        return b10.getPort() != -1 ? b10.getPort() : this.f30096a.getPort();
    }

    h Z(int i10) {
        h hVar;
        synchronized (this.f30106k) {
            hVar = this.f30109n.get(Integer.valueOf(i10));
        }
        return hVar;
    }

    @Override // wi.q.d
    public q.c[] a() {
        q.c[] cVarArr;
        synchronized (this.f30106k) {
            cVarArr = new q.c[this.f30109n.size()];
            Iterator<h> it = this.f30109n.values().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                cVarArr[i10] = it.next().t().b0();
                i10++;
            }
        }
        return cVarArr;
    }

    @Override // io.grpc.internal.j1
    public void b(g1 g1Var) {
        d(g1Var);
        synchronized (this.f30106k) {
            Iterator<Map.Entry<Integer, h>> it = this.f30109n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, h> next = it.next();
                it.remove();
                next.getValue().t().N(g1Var, false, new w0());
                d0(next.getValue());
            }
            for (h hVar : this.F) {
                hVar.t().M(g1Var, r.a.MISCARRIED, true, new w0());
                d0(hVar);
            }
            this.F.clear();
            n0();
        }
    }

    public boolean b0() {
        return this.B == null;
    }

    boolean c0(int i10) {
        boolean z10;
        synchronized (this.f30106k) {
            if (i10 < this.f30108m) {
                z10 = true;
                if ((i10 & 1) == 1) {
                }
            }
            z10 = false;
        }
        return z10;
    }

    @Override // io.grpc.internal.j1
    public void d(g1 g1Var) {
        synchronized (this.f30106k) {
            if (this.f30117v != null) {
                return;
            }
            this.f30117v = g1Var;
            this.f30103h.d(g1Var);
            n0();
        }
    }

    @Override // vi.n0
    public i0 e() {
        return this.f30107l;
    }

    @Override // io.grpc.internal.s
    /* renamed from: e0 */
    public h c(x0<?, ?> x0Var, w0 w0Var, vi.c cVar, vi.k[] kVarArr) {
        eb.o.p(x0Var, Constants.METHOD);
        eb.o.p(w0Var, "headers");
        h2 h10 = h2.h(kVarArr, V(), w0Var);
        synchronized (this.f30106k) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                return new h(x0Var, w0Var, this.f30104i, this, this.f30105j, this.f30106k, this.f30113r, this.f30101f, this.f30097b, this.f30098c, h10, this.P, cVar, this.O);
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.s
    public void f(s.a aVar, Executor executor) {
        long nextLong;
        synchronized (this.f30106k) {
            boolean z10 = true;
            eb.o.u(this.f30104i != null);
            if (this.f30120y) {
                u0.g(aVar, executor, Y());
                return;
            }
            u0 u0Var = this.f30119x;
            if (u0Var != null) {
                nextLong = 0;
                z10 = false;
            } else {
                nextLong = this.f30099d.nextLong();
                t tVar = this.f30100e.get();
                tVar.g();
                u0 u0Var2 = new u0(nextLong, tVar);
                this.f30119x = u0Var2;
                this.P.b();
                u0Var = u0Var2;
            }
            if (z10) {
                this.f30104i.h(false, (int) (nextLong >>> 32), (int) nextLong);
            }
            u0Var.a(aVar, executor);
        }
    }

    @Override // io.grpc.internal.j1
    public Runnable g(j1.a aVar) {
        this.f30103h = (j1.a) eb.o.p(aVar, "listener");
        if (this.I) {
            b1 b1Var = new b1(new b1.c(this), this.f30112q, this.J, this.K, this.L);
            this.H = b1Var;
            b1Var.o();
        }
        wi.a y10 = wi.a.y(this.f30111p, this, ModuleDescriptor.MODULE_VERSION);
        xi.c r10 = y10.r(this.f30102g.a(dm.l.a(y10), true));
        synchronized (this.f30106k) {
            wi.b bVar = new wi.b(this, r10);
            this.f30104i = bVar;
            this.f30105j = new q(this, bVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f30111p.execute(new c(countDownLatch, y10));
        try {
            i0();
            countDownLatch.countDown();
            this.f30111p.execute(new d());
            return null;
        } catch (Throwable th2) {
            countDownLatch.countDown();
            throw th2;
        }
    }

    @Override // wi.b.a
    public void h(Throwable th2) {
        eb.o.p(th2, "failureCause");
        k0(0, xi.a.INTERNAL_ERROR, g1.f29115u.q(th2));
    }

    public void h0(h hVar) {
        this.F.remove(hVar);
        d0(hVar);
    }

    public void o0(h hVar) {
        if (this.f30117v != null) {
            hVar.t().M(this.f30117v, r.a.MISCARRIED, true, new w0());
        } else if (this.f30109n.size() < this.E) {
            m0(hVar);
        } else {
            this.F.add(hVar);
            j0(hVar);
        }
    }

    public String toString() {
        return eb.i.c(this).c("logId", this.f30107l.d()).d("address", this.f30096a).toString();
    }
}
