package p425wi;

import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.common.util.concurrent.C5924j;
import dm.C7056b;
import dm.C7061e;
import dm.C7068l;
import dm.C7081y;
import dm.InterfaceC7058c;
import dm.InterfaceC7060d;
import dm.InterfaceC7080x;
import io.flutter.embedding.android.KeyboardMap;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.grpc.internal.AbstractC8905v0;
import io.grpc.internal.C8831b1;
import io.grpc.internal.C8856h2;
import io.grpc.internal.C8880n2;
import io.grpc.internal.C8886p0;
import io.grpc.internal.C8890q0;
import io.grpc.internal.C8902u0;
import io.grpc.internal.ExecutorC8836c2;
import io.grpc.internal.InterfaceC8863j1;
import io.grpc.internal.InterfaceC8892r;
import io.grpc.internal.InterfaceC8895s;
import io.grpc.internal.InterfaceC8904v;
import io.grpc.okhttp.internal.C8920b;
import io.grpc.okhttp.internal.C8921c;
import io.grpc.okhttp.internal.C8928j;
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
import p044cj.C2014c;
import p082eb.C7153i;
import p082eb.C7159o;
import p082eb.C7164t;
import p082eb.InterfaceC7166v;
import p425wi.C12201b;
import p425wi.C12205f;
import p425wi.C12207h;
import p425wi.C12209j;
import p425wi.C12216q;
import p448xi.C12491d;
import p448xi.C12494g;
import p448xi.C12496i;
import p448xi.EnumC12488a;
import p448xi.EnumC12492e;
import p448xi.InterfaceC12489b;
import p448xi.InterfaceC12490c;
import p448xi.InterfaceC12497j;
import p470yi.C12725a;
import p470yi.C12726b;
import vi.AbstractC11925k;
import vi.C11895a;
import vi.C11896a0;
import vi.C11899b0;
import vi.C11901c;
import vi.C11902c0;
import vi.C11915g1;
import vi.C11918h1;
import vi.C11920i0;
import vi.C11953w0;
import vi.C11955x0;
import vi.EnumC11909e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wi.i */
/* loaded from: classes3.dex */
public class C12208i implements InterfaceC8904v, C12201b.a, C12216q.d {

    /* renamed from: W */
    private static final Map<EnumC12488a, C11915g1> f32584W = m39233Q();

    /* renamed from: X */
    private static final Logger f32585X = Logger.getLogger(C12208i.class.getName());

    /* renamed from: A */
    private final SocketFactory f32586A;

    /* renamed from: B */
    private SSLSocketFactory f32587B;

    /* renamed from: C */
    private HostnameVerifier f32588C;

    /* renamed from: D */
    private Socket f32589D;

    /* renamed from: E */
    private int f32590E;

    /* renamed from: F */
    private final Deque<C12207h> f32591F;

    /* renamed from: G */
    private final C8920b f32592G;

    /* renamed from: H */
    private C8831b1 f32593H;

    /* renamed from: I */
    private boolean f32594I;

    /* renamed from: J */
    private long f32595J;

    /* renamed from: K */
    private long f32596K;

    /* renamed from: L */
    private boolean f32597L;

    /* renamed from: M */
    private final Runnable f32598M;

    /* renamed from: N */
    private final int f32599N;

    /* renamed from: O */
    private final boolean f32600O;

    /* renamed from: P */
    private final C8880n2 f32601P;

    /* renamed from: Q */
    private final AbstractC8905v0<C12207h> f32602Q;

    /* renamed from: R */
    private C11902c0.b f32603R;

    /* renamed from: S */
    final C11899b0 f32604S;

    /* renamed from: T */
    int f32605T;

    /* renamed from: U */
    Runnable f32606U;

    /* renamed from: V */
    C5924j<Void> f32607V;

    /* renamed from: a */
    private final InetSocketAddress f32608a;

    /* renamed from: b */
    private final String f32609b;

    /* renamed from: c */
    private final String f32610c;

    /* renamed from: d */
    private final Random f32611d;

    /* renamed from: e */
    private final InterfaceC7166v<C7164t> f32612e;

    /* renamed from: f */
    private final int f32613f;

    /* renamed from: g */
    private final InterfaceC12497j f32614g;

    /* renamed from: h */
    private InterfaceC8863j1.a f32615h;

    /* renamed from: i */
    private C12201b f32616i;

    /* renamed from: j */
    private C12216q f32617j;

    /* renamed from: k */
    private final Object f32618k;

    /* renamed from: l */
    private final C11920i0 f32619l;

    /* renamed from: m */
    private int f32620m;

    /* renamed from: n */
    private final Map<Integer, C12207h> f32621n;

    /* renamed from: o */
    private final Executor f32622o;

    /* renamed from: p */
    private final ExecutorC8836c2 f32623p;

    /* renamed from: q */
    private final ScheduledExecutorService f32624q;

    /* renamed from: r */
    private final int f32625r;

    /* renamed from: s */
    private int f32626s;

    /* renamed from: t */
    private e f32627t;

    /* renamed from: u */
    private C11895a f32628u;

    /* renamed from: v */
    private C11915g1 f32629v;

    /* renamed from: w */
    private boolean f32630w;

    /* renamed from: x */
    private C8902u0 f32631x;

    /* renamed from: y */
    private boolean f32632y;

    /* renamed from: z */
    private boolean f32633z;

    /* renamed from: wi.i$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC8905v0<C12207h> {
        a() {
        }

        @Override // io.grpc.internal.AbstractC8905v0
        /* renamed from: b */
        protected void mo25542b() {
            C12208i.this.f32615h.mo25537b(true);
        }

        @Override // io.grpc.internal.AbstractC8905v0
        /* renamed from: c */
        protected void mo25543c() {
            C12208i.this.f32615h.mo25537b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wi.i$b */
    /* loaded from: classes3.dex */
    public class b implements C8880n2.c {
        b() {
        }
    }

    /* renamed from: wi.i$c */
    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f32636a;

        /* renamed from: b */
        final /* synthetic */ C12200a f32637b;

        /* renamed from: wi.i$c$a */
        /* loaded from: classes3.dex */
        class a implements InterfaceC7080x {
            a() {
            }

            @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // dm.InterfaceC7080x
            /* renamed from: m */
            public C7081y mo20685m() {
                return C7081y.f15697e;
            }

            @Override // dm.InterfaceC7080x
            /* renamed from: s1 */
            public long mo20686s1(C7056b c7056b, long j10) {
                return -1L;
            }
        }

        c(CountDownLatch countDownLatch, C12200a c12200a) {
            this.f32636a = countDownLatch;
            this.f32637b = c12200a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12208i c12208i;
            e eVar;
            Socket m39235S;
            SSLSession sSLSession;
            Socket socket;
            try {
                this.f32636a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            InterfaceC7060d m20803b = C7068l.m20803b(new a());
            try {
                try {
                    C12208i c12208i2 = C12208i.this;
                    C11899b0 c11899b0 = c12208i2.f32604S;
                    if (c11899b0 == null) {
                        m39235S = c12208i2.f32586A.createSocket(C12208i.this.f32608a.getAddress(), C12208i.this.f32608a.getPort());
                    } else {
                        if (!(c11899b0.m38069b() instanceof InetSocketAddress)) {
                            throw C11915g1.f31548t.m38147r("Unsupported SocketAddress implementation " + C12208i.this.f32604S.m38069b().getClass()).m38138c();
                        }
                        C12208i c12208i3 = C12208i.this;
                        m39235S = c12208i3.m39235S(c12208i3.f32604S.m38070c(), (InetSocketAddress) C12208i.this.f32604S.m38069b(), C12208i.this.f32604S.m38071d(), C12208i.this.f32604S.m38068a());
                    }
                    Socket socket2 = m39235S;
                    if (C12208i.this.f32587B != null) {
                        SSLSocket m39317b = C12213n.m39317b(C12208i.this.f32587B, C12208i.this.f32588C, socket2, C12208i.this.m39269W(), C12208i.this.m39270X(), C12208i.this.f32592G);
                        sSLSession = m39317b.getSession();
                        socket = m39317b;
                    } else {
                        sSLSession = null;
                        socket = socket2;
                    }
                    socket.setTcpNoDelay(true);
                    InterfaceC7060d m20803b2 = C7068l.m20803b(C7068l.m20809h(socket));
                    this.f32637b.m39163q(C7068l.m20806e(socket), socket);
                    C12208i c12208i4 = C12208i.this;
                    c12208i4.f32628u = c12208i4.f32628u.m38049d().m38053d(C11896a0.f31463a, socket.getRemoteSocketAddress()).m38053d(C11896a0.f31464b, socket.getLocalSocketAddress()).m38053d(C11896a0.f31465c, sSLSession).m38053d(C8886p0.f20818a, sSLSession == null ? EnumC11909e1.NONE : EnumC11909e1.PRIVACY_AND_INTEGRITY).m38051a();
                    C12208i c12208i5 = C12208i.this;
                    c12208i5.f32627t = new e(c12208i5.f32614g.mo40887b(m20803b2, true));
                    synchronized (C12208i.this.f32618k) {
                        C12208i.this.f32589D = (Socket) C7159o.m21313p(socket, "socket");
                        if (sSLSession != null) {
                            C12208i.this.f32603R = new C11902c0.b(new C11902c0.c(sSLSession));
                        }
                    }
                } catch (C11918h1 e10) {
                    C12208i.this.m39246k0(0, EnumC12488a.INTERNAL_ERROR, e10.m38159a());
                    c12208i = C12208i.this;
                    eVar = new e(c12208i.f32614g.mo40887b(m20803b, true));
                    c12208i.f32627t = eVar;
                } catch (Exception e11) {
                    C12208i.this.mo39177h(e11);
                    c12208i = C12208i.this;
                    eVar = new e(c12208i.f32614g.mo40887b(m20803b, true));
                    c12208i.f32627t = eVar;
                }
            } catch (Throwable th2) {
                C12208i c12208i6 = C12208i.this;
                c12208i6.f32627t = new e(c12208i6.f32614g.mo40887b(m20803b, true));
                throw th2;
            }
        }
    }

    /* renamed from: wi.i$d */
    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = C12208i.this.f32606U;
            if (runnable != null) {
                runnable.run();
            }
            C12208i.this.f32622o.execute(C12208i.this.f32627t);
            synchronized (C12208i.this.f32618k) {
                C12208i.this.f32590E = C5101a.e.API_PRIORITY_OTHER;
                C12208i.this.m39248l0();
            }
            C5924j<Void> c5924j = C12208i.this.f32607V;
            if (c5924j != null) {
                c5924j.mo589A(null);
            }
        }
    }

    /* renamed from: wi.i$e */
    /* loaded from: classes3.dex */
    class e implements InterfaceC12489b.a, Runnable {

        /* renamed from: b */
        InterfaceC12489b f32642b;

        /* renamed from: a */
        private final C12209j f32641a = new C12209j(Level.FINE, (Class<?>) C12208i.class);

        /* renamed from: c */
        boolean f32643c = true;

        e(InterfaceC12489b interfaceC12489b) {
            this.f32642b = interfaceC12489b;
        }

        /* renamed from: a */
        private int m39278a(List<C12491d> list) {
            long j10 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                C12491d c12491d = list.get(i10);
                j10 += c12491d.f33844a.m20756B() + 32 + c12491d.f33845b.m20756B();
            }
            return (int) Math.min(j10, 2147483647L);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // p448xi.InterfaceC12489b.a
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo39279d(int r8, long r9) {
            /*
                r7 = this;
                wi.j r0 = r7.f32641a
                wi.j$a r1 = p425wi.C12209j.a.INBOUND
                r0.m39301k(r1, r8, r9)
                r0 = 0
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 != 0) goto L2c
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L19
                wi.i r8 = p425wi.C12208i.this
                xi.a r10 = p448xi.EnumC12488a.PROTOCOL_ERROR
                p425wi.C12208i.m39217A(r8, r10, r9)
                goto L2b
            L19:
                wi.i r0 = p425wi.C12208i.this
                vi.g1 r10 = vi.C11915g1.f31548t
                vi.g1 r2 = r10.m38147r(r9)
                io.grpc.internal.r$a r3 = io.grpc.internal.InterfaceC8892r.a.PROCESSED
                r4 = 0
                xi.a r5 = p448xi.EnumC12488a.PROTOCOL_ERROR
                r6 = 0
                r1 = r8
                r0.m39267U(r1, r2, r3, r4, r5, r6)
            L2b:
                return
            L2c:
                wi.i r0 = p425wi.C12208i.this
                java.lang.Object r0 = p425wi.C12208i.m39243j(r0)
                monitor-enter(r0)
                if (r8 != 0) goto L42
                wi.i r8 = p425wi.C12208i.this     // Catch: java.lang.Throwable -> L8e
                wi.q r8 = p425wi.C12208i.m39262w(r8)     // Catch: java.lang.Throwable -> L8e
                r1 = 0
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L8e
                r8.m39325g(r1, r9)     // Catch: java.lang.Throwable -> L8e
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
                return
            L42:
                wi.i r1 = p425wi.C12208i.this     // Catch: java.lang.Throwable -> L8e
                java.util.Map r1 = p425wi.C12208i.m39222F(r1)     // Catch: java.lang.Throwable -> L8e
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L8e
                wi.h r1 = (p425wi.C12207h) r1     // Catch: java.lang.Throwable -> L8e
                if (r1 == 0) goto L67
                wi.i r2 = p425wi.C12208i.this     // Catch: java.lang.Throwable -> L8e
                wi.q r2 = p425wi.C12208i.m39262w(r2)     // Catch: java.lang.Throwable -> L8e
                wi.h$b r1 = r1.mo25206t()     // Catch: java.lang.Throwable -> L8e
                wi.q$c r1 = r1.m39211b0()     // Catch: java.lang.Throwable -> L8e
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L8e
                r2.m39325g(r1, r9)     // Catch: java.lang.Throwable -> L8e
                goto L71
            L67:
                wi.i r9 = p425wi.C12208i.this     // Catch: java.lang.Throwable -> L8e
                boolean r9 = r9.m39274c0(r8)     // Catch: java.lang.Throwable -> L8e
                if (r9 != 0) goto L71
                r9 = 1
                goto L72
            L71:
                r9 = 0
            L72:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 == 0) goto L8d
                wi.i r9 = p425wi.C12208i.this
                xi.a r10 = p448xi.EnumC12488a.PROTOCOL_ERROR
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received window_update for unknown stream: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                p425wi.C12208i.m39217A(r9, r10, r8)
            L8d:
                return
            L8e:
                r8 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p425wi.C12208i.e.mo39279d(int, long):void");
        }

        @Override // p448xi.InterfaceC12489b.a
        /* renamed from: h */
        public void mo39280h(boolean z10, int i10, int i11) {
            C8902u0 c8902u0;
            long j10 = (i10 << 32) | (i11 & KeyboardMap.kValueMask);
            this.f32641a.m39295e(C12209j.a.INBOUND, j10);
            if (!z10) {
                synchronized (C12208i.this.f32618k) {
                    C12208i.this.f32616i.mo39166h(true, i10, i11);
                }
                return;
            }
            synchronized (C12208i.this.f32618k) {
                c8902u0 = null;
                if (C12208i.this.f32631x == null) {
                    C12208i.f32585X.warning("Received unexpected ping ack. No ping outstanding");
                } else if (C12208i.this.f32631x.m25862h() == j10) {
                    C8902u0 c8902u02 = C12208i.this.f32631x;
                    C12208i.this.f32631x = null;
                    c8902u0 = c8902u02;
                } else {
                    C12208i.f32585X.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(C12208i.this.f32631x.m25862h()), Long.valueOf(j10)));
                }
            }
            if (c8902u0 != null) {
                c8902u0.m25860d();
            }
        }

        @Override // p448xi.InterfaceC12489b.a
        /* renamed from: i */
        public void mo39281i(boolean z10, int i10, InterfaceC7060d interfaceC7060d, int i11) {
            this.f32641a.m39292b(C12209j.a.INBOUND, i10, interfaceC7060d.mo20717c(), i11, z10);
            C12207h m39271Z = C12208i.this.m39271Z(i10);
            if (m39271Z != null) {
                long j10 = i11;
                interfaceC7060d.mo20733q0(j10);
                C7056b c7056b = new C7056b();
                c7056b.mo19710K0(interfaceC7060d.mo20717c(), j10);
                C2014c.m10319c("OkHttpClientTransport$ClientFrameHandler.data", m39271Z.mo25206t().m39214h0());
                synchronized (C12208i.this.f32618k) {
                    m39271Z.mo25206t().m39215i0(c7056b, z10);
                }
            } else {
                if (!C12208i.this.m39274c0(i10)) {
                    C12208i.this.m39239f0(EnumC12488a.PROTOCOL_ERROR, "Received data for unknown stream: " + i10);
                    return;
                }
                synchronized (C12208i.this.f32618k) {
                    C12208i.this.f32616i.mo39168s(i10, EnumC12488a.STREAM_CLOSED);
                }
                interfaceC7060d.skip(i11);
            }
            C12208i.m39220D(C12208i.this, i11);
            if (C12208i.this.f32626s >= C12208i.this.f32613f * 0.5f) {
                synchronized (C12208i.this.f32618k) {
                    C12208i.this.f32616i.mo39174d(0, C12208i.this.f32626s);
                }
                C12208i.this.f32626s = 0;
            }
        }

        @Override // p448xi.InterfaceC12489b.a
        /* renamed from: j */
        public void mo39282j(int i10, int i11, List<C12491d> list) {
            this.f32641a.m39297g(C12209j.a.INBOUND, i10, i11, list);
            synchronized (C12208i.this.f32618k) {
                C12208i.this.f32616i.mo39168s(i10, EnumC12488a.PROTOCOL_ERROR);
            }
        }

        @Override // p448xi.InterfaceC12489b.a
        /* renamed from: k */
        public void mo39283k() {
        }

        @Override // p448xi.InterfaceC12489b.a
        /* renamed from: l */
        public void mo39284l(int i10, int i11, int i12, boolean z10) {
        }

        @Override // java.lang.Runnable
        public void run() {
            C11915g1 c11915g1;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f32642b.mo40843p1(this)) {
                try {
                    if (C12208i.this.f32593H != null) {
                        C12208i.this.f32593H.m25306l();
                    }
                } catch (Throwable th2) {
                    try {
                        C12208i.this.m39246k0(0, EnumC12488a.PROTOCOL_ERROR, C11915g1.f31548t.m38147r("error in frame handler").m38146q(th2));
                        try {
                            this.f32642b.close();
                        } catch (IOException e10) {
                            e = e10;
                            C12208i.f32585X.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            C12208i.this.f32615h.mo25538c();
                            Thread.currentThread().setName(name);
                        }
                    } catch (Throwable th3) {
                        try {
                            this.f32642b.close();
                        } catch (IOException e11) {
                            C12208i.f32585X.log(Level.INFO, "Exception closing frame reader", (Throwable) e11);
                        }
                        C12208i.this.f32615h.mo25538c();
                        Thread.currentThread().setName(name);
                        throw th3;
                    }
                }
            }
            synchronized (C12208i.this.f32618k) {
                c11915g1 = C12208i.this.f32629v;
            }
            if (c11915g1 == null) {
                c11915g1 = C11915g1.f31549u.m38147r("End of stream or IOException");
            }
            C12208i.this.m39246k0(0, EnumC12488a.INTERNAL_ERROR, c11915g1);
            try {
                this.f32642b.close();
            } catch (IOException e12) {
                e = e12;
                C12208i.f32585X.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                C12208i.this.f32615h.mo25538c();
                Thread.currentThread().setName(name);
            }
            C12208i.this.f32615h.mo25538c();
            Thread.currentThread().setName(name);
        }

        @Override // p448xi.InterfaceC12489b.a
        /* renamed from: s */
        public void mo39285s(int i10, EnumC12488a enumC12488a) {
            this.f32641a.m39298h(C12209j.a.INBOUND, i10, enumC12488a);
            C11915g1 m38141f = C12208i.m39255p0(enumC12488a).m38141f("Rst Stream");
            boolean z10 = m38141f.m38143n() == C11915g1.b.CANCELLED || m38141f.m38143n() == C11915g1.b.DEADLINE_EXCEEDED;
            synchronized (C12208i.this.f32618k) {
                C12207h c12207h = (C12207h) C12208i.this.f32621n.get(Integer.valueOf(i10));
                if (c12207h != null) {
                    C2014c.m10319c("OkHttpClientTransport$ClientFrameHandler.rstStream", c12207h.mo25206t().m39214h0());
                    C12208i.this.m39267U(i10, m38141f, enumC12488a == EnumC12488a.REFUSED_STREAM ? InterfaceC8892r.a.REFUSED : InterfaceC8892r.a.PROCESSED, z10, null, null);
                }
            }
        }

        @Override // p448xi.InterfaceC12489b.a
        /* renamed from: t */
        public void mo39286t(boolean z10, boolean z11, int i10, int i11, List<C12491d> list, EnumC12492e enumC12492e) {
            C11915g1 c11915g1;
            int m39278a;
            this.f32641a.m39294d(C12209j.a.INBOUND, i10, list, z11);
            boolean z12 = true;
            if (C12208i.this.f32599N == Integer.MAX_VALUE || (m39278a = m39278a(list)) <= C12208i.this.f32599N) {
                c11915g1 = null;
            } else {
                C11915g1 c11915g12 = C11915g1.f31543o;
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                objArr[0] = z11 ? "trailer" : "header";
                objArr[1] = Integer.valueOf(C12208i.this.f32599N);
                objArr[2] = Integer.valueOf(m39278a);
                c11915g1 = c11915g12.m38147r(String.format(locale, "Response %s metadata larger than %d: %d", objArr));
            }
            synchronized (C12208i.this.f32618k) {
                C12207h c12207h = (C12207h) C12208i.this.f32621n.get(Integer.valueOf(i10));
                if (c12207h == null) {
                    if (C12208i.this.m39274c0(i10)) {
                        C12208i.this.f32616i.mo39168s(i10, EnumC12488a.STREAM_CLOSED);
                    }
                } else if (c11915g1 == null) {
                    C2014c.m10319c("OkHttpClientTransport$ClientFrameHandler.headers", c12207h.mo25206t().m39214h0());
                    c12207h.mo25206t().m39216j0(list, z11);
                } else {
                    if (!z11) {
                        C12208i.this.f32616i.mo39168s(i10, EnumC12488a.CANCEL);
                    }
                    c12207h.mo25206t().m25232N(c11915g1, false, new C11953w0());
                }
                z12 = false;
            }
            if (z12) {
                C12208i.this.m39239f0(EnumC12488a.PROTOCOL_ERROR, "Received header for unknown stream: " + i10);
            }
        }

        @Override // p448xi.InterfaceC12489b.a
        /* renamed from: u */
        public void mo39287u(boolean z10, C12496i c12496i) {
            boolean z11;
            this.f32641a.m39299i(C12209j.a.INBOUND, c12496i);
            synchronized (C12208i.this.f32618k) {
                if (C12212m.m39314b(c12496i, 4)) {
                    C12208i.this.f32590E = C12212m.m39313a(c12496i, 4);
                }
                if (C12212m.m39314b(c12496i, 7)) {
                    z11 = C12208i.this.f32617j.m39324f(C12212m.m39313a(c12496i, 7));
                } else {
                    z11 = false;
                }
                if (this.f32643c) {
                    C12208i.this.f32615h.mo25536a();
                    this.f32643c = false;
                }
                C12208i.this.f32616i.mo39167o1(c12496i);
                if (z11) {
                    C12208i.this.f32617j.m39326h();
                }
                C12208i.this.m39248l0();
            }
        }

        @Override // p448xi.InterfaceC12489b.a
        /* renamed from: v */
        public void mo39288v(int i10, EnumC12488a enumC12488a, C7061e c7061e) {
            this.f32641a.m39293c(C12209j.a.INBOUND, i10, enumC12488a, c7061e);
            if (enumC12488a == EnumC12488a.ENHANCE_YOUR_CALM) {
                String m20760F = c7061e.m20760F();
                C12208i.f32585X.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, m20760F));
                if ("too_many_pings".equals(m20760F)) {
                    C12208i.this.f32598M.run();
                }
            }
            C11915g1 m38141f = C8890q0.h.m25771m(enumC12488a.httpCode).m38141f("Received Goaway");
            if (c7061e.m20756B() > 0) {
                m38141f = m38141f.m38141f(c7061e.m20760F());
            }
            C12208i.this.m39246k0(i10, null, m38141f);
        }
    }

    private C12208i(C12205f.f fVar, InetSocketAddress inetSocketAddress, String str, String str2, C11895a c11895a, InterfaceC7166v<C7164t> interfaceC7166v, InterfaceC12497j interfaceC12497j, C11899b0 c11899b0, Runnable runnable) {
        this.f32611d = new Random();
        this.f32618k = new Object();
        this.f32621n = new HashMap();
        this.f32590E = 0;
        this.f32591F = new LinkedList();
        this.f32602Q = new a();
        this.f32605T = 30000;
        this.f32608a = (InetSocketAddress) C7159o.m21313p(inetSocketAddress, "address");
        this.f32609b = str;
        this.f32625r = fVar.f32549u;
        this.f32613f = fVar.f32554z;
        this.f32622o = (Executor) C7159o.m21313p(fVar.f32541b, "executor");
        this.f32623p = new ExecutorC8836c2(fVar.f32541b);
        this.f32624q = (ScheduledExecutorService) C7159o.m21313p(fVar.f32543d, "scheduledExecutorService");
        this.f32620m = 3;
        SocketFactory socketFactory = fVar.f32545f;
        this.f32586A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.f32587B = fVar.f32546r;
        this.f32588C = fVar.f32547s;
        this.f32592G = (C8920b) C7159o.m21313p(fVar.f32548t, "connectionSpec");
        this.f32612e = (InterfaceC7166v) C7159o.m21313p(interfaceC7166v, "stopwatchFactory");
        this.f32614g = (InterfaceC12497j) C7159o.m21313p(interfaceC12497j, "variant");
        this.f32610c = C8890q0.m25750g("okhttp", str2);
        this.f32604S = c11899b0;
        this.f32598M = (Runnable) C7159o.m21313p(runnable, "tooManyPingsRunnable");
        this.f32599N = fVar.f32537B;
        this.f32601P = fVar.f32544e.m25696a();
        this.f32619l = C11920i0.m38161a(getClass(), inetSocketAddress.toString());
        this.f32628u = C11895a.m38047c().m38053d(C8886p0.f20819b, c11895a).m38051a();
        this.f32600O = fVar.f32538C;
        m39237a0();
    }

    public C12208i(C12205f.f fVar, InetSocketAddress inetSocketAddress, String str, String str2, C11895a c11895a, C11899b0 c11899b0, Runnable runnable) {
        this(fVar, inetSocketAddress, str, str2, c11895a, C8890q0.f20850w, new C12494g(), c11899b0, runnable);
    }

    /* renamed from: D */
    static /* synthetic */ int m39220D(C12208i c12208i, int i10) {
        int i11 = c12208i.f32626s + i10;
        c12208i.f32626s = i11;
        return i11;
    }

    /* renamed from: Q */
    private static Map<EnumC12488a, C11915g1> m39233Q() {
        EnumMap enumMap = new EnumMap(EnumC12488a.class);
        EnumC12488a enumC12488a = EnumC12488a.NO_ERROR;
        C11915g1 c11915g1 = C11915g1.f31548t;
        enumMap.put((EnumMap) enumC12488a, (EnumC12488a) c11915g1.m38147r("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) EnumC12488a.PROTOCOL_ERROR, (EnumC12488a) c11915g1.m38147r("Protocol error"));
        enumMap.put((EnumMap) EnumC12488a.INTERNAL_ERROR, (EnumC12488a) c11915g1.m38147r("Internal error"));
        enumMap.put((EnumMap) EnumC12488a.FLOW_CONTROL_ERROR, (EnumC12488a) c11915g1.m38147r("Flow control error"));
        enumMap.put((EnumMap) EnumC12488a.STREAM_CLOSED, (EnumC12488a) c11915g1.m38147r("Stream closed"));
        enumMap.put((EnumMap) EnumC12488a.FRAME_TOO_LARGE, (EnumC12488a) c11915g1.m38147r("Frame too large"));
        enumMap.put((EnumMap) EnumC12488a.REFUSED_STREAM, (EnumC12488a) C11915g1.f31549u.m38147r("Refused stream"));
        enumMap.put((EnumMap) EnumC12488a.CANCEL, (EnumC12488a) C11915g1.f31535g.m38147r("Cancelled"));
        enumMap.put((EnumMap) EnumC12488a.COMPRESSION_ERROR, (EnumC12488a) c11915g1.m38147r("Compression error"));
        enumMap.put((EnumMap) EnumC12488a.CONNECT_ERROR, (EnumC12488a) c11915g1.m38147r("Connect error"));
        enumMap.put((EnumMap) EnumC12488a.ENHANCE_YOUR_CALM, (EnumC12488a) C11915g1.f31543o.m38147r("Enhance your calm"));
        enumMap.put((EnumMap) EnumC12488a.INADEQUATE_SECURITY, (EnumC12488a) C11915g1.f31541m.m38147r("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    /* renamed from: R */
    private C12726b m39234R(InetSocketAddress inetSocketAddress, String str, String str2) {
        C12725a m41967a = new C12725a.b().m41971k("https").m41969h(inetSocketAddress.getHostName()).m41970j(inetSocketAddress.getPort()).m41967a();
        C12726b.b m41977d = new C12726b.b().m41978e(m41967a).m41977d("Host", m41967a.m41959c() + ":" + m41967a.m41960f()).m41977d("User-Agent", this.f32610c);
        if (str != null && str2 != null) {
            m41977d.m41977d("Proxy-Authorization", C8921c.m26053a(str, str2));
        }
        return m41977d.m41976c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public Socket m39235S(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket socket = null;
        try {
            socket = inetSocketAddress2.getAddress() != null ? this.f32586A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.f32586A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socket.setTcpNoDelay(true);
            socket.setSoTimeout(this.f32605T);
            InterfaceC7080x m20809h = C7068l.m20809h(socket);
            InterfaceC7058c m20802a = C7068l.m20802a(C7068l.m20806e(socket));
            C12726b m39234R = m39234R(inetSocketAddress, str, str2);
            C12725a m41973b = m39234R.m41973b();
            m20802a.mo20705T(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", m41973b.m41959c(), Integer.valueOf(m41973b.m41960f()))).mo20705T("\r\n");
            int m26063b = m39234R.m41972a().m26063b();
            for (int i10 = 0; i10 < m26063b; i10++) {
                m20802a.mo20705T(m39234R.m41972a().m26062a(i10)).mo20705T(": ").mo20705T(m39234R.m41972a().m26064c(i10)).mo20705T("\r\n");
            }
            m20802a.mo20705T("\r\n");
            m20802a.flush();
            C8928j m26101a = C8928j.m26101a(m39240g0(m20809h));
            do {
            } while (!m39240g0(m20809h).equals(""));
            int i11 = m26101a.f21217b;
            if (i11 >= 200 && i11 < 300) {
                socket.setSoTimeout(0);
                return socket;
            }
            C7056b c7056b = new C7056b();
            try {
                socket.shutdownOutput();
                m20809h.mo20686s1(c7056b, 1024L);
            } catch (IOException e10) {
                c7056b.mo20705T("Unable to read body: " + e10.toString());
            }
            try {
                socket.close();
            } catch (IOException unused) {
            }
            throw C11915g1.f31549u.m38147r(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(m26101a.f21217b), m26101a.f21218c, c7056b.m20723h0())).m38138c();
        } catch (IOException e11) {
            if (socket != null) {
                C8890q0.m25748e(socket);
            }
            throw C11915g1.f31549u.m38147r("Failed trying to connect with proxy").m38146q(e11).m38138c();
        }
    }

    /* renamed from: Y */
    private Throwable m39236Y() {
        synchronized (this.f32618k) {
            C11915g1 c11915g1 = this.f32629v;
            if (c11915g1 != null) {
                return c11915g1.m38138c();
            }
            return C11915g1.f31549u.m38147r("Connection closed").m38138c();
        }
    }

    /* renamed from: a0 */
    private void m39237a0() {
        synchronized (this.f32618k) {
            this.f32601P.m25695g(new b());
        }
    }

    /* renamed from: d0 */
    private void m39238d0(C12207h c12207h) {
        if (this.f32633z && this.f32591F.isEmpty() && this.f32621n.isEmpty()) {
            this.f32633z = false;
            C8831b1 c8831b1 = this.f32593H;
            if (c8831b1 != null) {
                c8831b1.m25308n();
            }
        }
        if (c12207h.m25209x()) {
            this.f32602Q.m25865e(c12207h, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m39239f0(EnumC12488a enumC12488a, String str) {
        m39246k0(0, enumC12488a, m39255p0(enumC12488a).m38141f(str));
    }

    /* renamed from: g0 */
    private static String m39240g0(InterfaceC7080x interfaceC7080x) {
        C7056b c7056b = new C7056b();
        while (interfaceC7080x.mo20686s1(c7056b, 1L) != -1) {
            if (c7056b.m20729l(c7056b.size() - 1) == 10) {
                return c7056b.mo20719d0();
            }
        }
        throw new EOFException("\\n not found: " + c7056b.m20697I().mo20770r());
    }

    /* renamed from: i0 */
    private void m39242i0() {
        synchronized (this.f32618k) {
            this.f32616i.mo39171G();
            C12496i c12496i = new C12496i();
            C12212m.m39315c(c12496i, 7, this.f32613f);
            this.f32616i.mo39172P0(c12496i);
            if (this.f32613f > 65535) {
                this.f32616i.mo39174d(0, r1 - 65535);
            }
        }
    }

    /* renamed from: j0 */
    private void m39244j0(C12207h c12207h) {
        if (!this.f32633z) {
            this.f32633z = true;
            C8831b1 c8831b1 = this.f32593H;
            if (c8831b1 != null) {
                c8831b1.m25307m();
            }
        }
        if (c12207h.m25209x()) {
            this.f32602Q.m25865e(c12207h, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public void m39246k0(int i10, EnumC12488a enumC12488a, C11915g1 c11915g1) {
        synchronized (this.f32618k) {
            if (this.f32629v == null) {
                this.f32629v = c11915g1;
                this.f32615h.mo25539d(c11915g1);
            }
            if (enumC12488a != null && !this.f32630w) {
                this.f32630w = true;
                this.f32616i.mo39170F(0, enumC12488a, new byte[0]);
            }
            Iterator<Map.Entry<Integer, C12207h>> it = this.f32621n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, C12207h> next = it.next();
                if (next.getKey().intValue() > i10) {
                    it.remove();
                    next.getValue().mo25206t().m25231M(c11915g1, InterfaceC8892r.a.REFUSED, false, new C11953w0());
                    m39238d0(next.getValue());
                }
            }
            for (C12207h c12207h : this.f32591F) {
                c12207h.mo25206t().m25231M(c11915g1, InterfaceC8892r.a.MISCARRIED, true, new C11953w0());
                m39238d0(c12207h);
            }
            this.f32591F.clear();
            m39252n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public boolean m39248l0() {
        boolean z10 = false;
        while (!this.f32591F.isEmpty() && this.f32621n.size() < this.f32590E) {
            m39250m0(this.f32591F.poll());
            z10 = true;
        }
        return z10;
    }

    /* renamed from: m0 */
    private void m39250m0(C12207h c12207h) {
        C7159o.m21319v(c12207h.mo25206t().m39212c0() == -1, "StreamId already assigned");
        this.f32621n.put(Integer.valueOf(this.f32620m), c12207h);
        m39244j0(c12207h);
        c12207h.mo25206t().m39213f0(this.f32620m);
        if ((c12207h.m39199L() != C11955x0.d.UNARY && c12207h.m39199L() != C11955x0.d.SERVER_STREAMING) || c12207h.m39201N()) {
            this.f32616i.flush();
        }
        int i10 = this.f32620m;
        if (i10 < 2147483645) {
            this.f32620m = i10 + 2;
        } else {
            this.f32620m = C5101a.e.API_PRIORITY_OTHER;
            m39246k0(C5101a.e.API_PRIORITY_OTHER, EnumC12488a.NO_ERROR, C11915g1.f31549u.m38147r("Stream ids exhausted"));
        }
    }

    /* renamed from: n0 */
    private void m39252n0() {
        if (this.f32629v == null || !this.f32621n.isEmpty() || !this.f32591F.isEmpty() || this.f32632y) {
            return;
        }
        this.f32632y = true;
        C8831b1 c8831b1 = this.f32593H;
        if (c8831b1 != null) {
            c8831b1.m25310p();
        }
        C8902u0 c8902u0 = this.f32631x;
        if (c8902u0 != null) {
            c8902u0.m25861f(m39236Y());
            this.f32631x = null;
        }
        if (!this.f32630w) {
            this.f32630w = true;
            this.f32616i.mo39170F(0, EnumC12488a.NO_ERROR, new byte[0]);
        }
        this.f32616i.close();
    }

    /* renamed from: p0 */
    static C11915g1 m39255p0(EnumC12488a enumC12488a) {
        C11915g1 c11915g1 = f32584W.get(enumC12488a);
        if (c11915g1 != null) {
            return c11915g1;
        }
        return C11915g1.f31536h.m38147r("Unknown http2 error code: " + enumC12488a.httpCode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m39266T(boolean z10, long j10, long j11, boolean z11) {
        this.f32594I = z10;
        this.f32595J = j10;
        this.f32596K = j11;
        this.f32597L = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m39267U(int i10, C11915g1 c11915g1, InterfaceC8892r.a aVar, boolean z10, EnumC12488a enumC12488a, C11953w0 c11953w0) {
        synchronized (this.f32618k) {
            C12207h remove = this.f32621n.remove(Integer.valueOf(i10));
            if (remove != null) {
                if (enumC12488a != null) {
                    this.f32616i.mo39168s(i10, EnumC12488a.CANCEL);
                }
                if (c11915g1 != null) {
                    C12207h.b mo25206t = remove.mo25206t();
                    if (c11953w0 == null) {
                        c11953w0 = new C11953w0();
                    }
                    mo25206t.m25231M(c11915g1, aVar, z10, c11953w0);
                }
                if (!m39248l0()) {
                    m39252n0();
                    m39238d0(remove);
                }
            }
        }
    }

    /* renamed from: V */
    public C11895a m39268V() {
        return this.f32628u;
    }

    /* renamed from: W */
    String m39269W() {
        URI m25745b = C8890q0.m25745b(this.f32609b);
        return m25745b.getHost() != null ? m25745b.getHost() : this.f32609b;
    }

    /* renamed from: X */
    int m39270X() {
        URI m25745b = C8890q0.m25745b(this.f32609b);
        return m25745b.getPort() != -1 ? m25745b.getPort() : this.f32608a.getPort();
    }

    /* renamed from: Z */
    C12207h m39271Z(int i10) {
        C12207h c12207h;
        synchronized (this.f32618k) {
            c12207h = this.f32621n.get(Integer.valueOf(i10));
        }
        return c12207h;
    }

    @Override // p425wi.C12216q.d
    /* renamed from: a */
    public C12216q.c[] mo39272a() {
        C12216q.c[] cVarArr;
        synchronized (this.f32618k) {
            cVarArr = new C12216q.c[this.f32621n.size()];
            Iterator<C12207h> it = this.f32621n.values().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                cVarArr[i10] = it.next().mo25206t().m39211b0();
                i10++;
            }
        }
        return cVarArr;
    }

    @Override // io.grpc.internal.InterfaceC8863j1
    /* renamed from: b */
    public void mo25244b(C11915g1 c11915g1) {
        mo25246d(c11915g1);
        synchronized (this.f32618k) {
            Iterator<Map.Entry<Integer, C12207h>> it = this.f32621n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, C12207h> next = it.next();
                it.remove();
                next.getValue().mo25206t().m25232N(c11915g1, false, new C11953w0());
                m39238d0(next.getValue());
            }
            for (C12207h c12207h : this.f32591F) {
                c12207h.mo25206t().m25231M(c11915g1, InterfaceC8892r.a.MISCARRIED, true, new C11953w0());
                m39238d0(c12207h);
            }
            this.f32591F.clear();
            m39252n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean m39273b0() {
        return this.f32587B == null;
    }

    /* renamed from: c0 */
    boolean m39274c0(int i10) {
        boolean z10;
        synchronized (this.f32618k) {
            if (i10 < this.f32620m) {
                z10 = true;
                if ((i10 & 1) == 1) {
                }
            }
            z10 = false;
        }
        return z10;
    }

    @Override // io.grpc.internal.InterfaceC8863j1
    /* renamed from: d */
    public void mo25246d(C11915g1 c11915g1) {
        synchronized (this.f32618k) {
            if (this.f32629v != null) {
                return;
            }
            this.f32629v = c11915g1;
            this.f32615h.mo25539d(c11915g1);
            m39252n0();
        }
    }

    @Override // vi.InterfaceC11935n0
    /* renamed from: e */
    public C11920i0 mo25247e() {
        return this.f32619l;
    }

    @Override // io.grpc.internal.InterfaceC8895s
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C12207h mo25245c(C11955x0<?, ?> c11955x0, C11953w0 c11953w0, C11901c c11901c, AbstractC11925k[] abstractC11925kArr) {
        C7159o.m21313p(c11955x0, Constants.METHOD);
        C7159o.m21313p(c11953w0, "headers");
        C8856h2 m25591h = C8856h2.m25591h(abstractC11925kArr, m39268V(), c11953w0);
        synchronized (this.f32618k) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                return new C12207h(c11955x0, c11953w0, this.f32616i, this, this.f32617j, this.f32618k, this.f32625r, this.f32613f, this.f32609b, this.f32610c, m25591h, this.f32601P, c11901c, this.f32600O);
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC8895s
    /* renamed from: f */
    public void mo25625f(InterfaceC8895s.a aVar, Executor executor) {
        long nextLong;
        synchronized (this.f32618k) {
            boolean z10 = true;
            C7159o.m21318u(this.f32616i != null);
            if (this.f32632y) {
                C8902u0.m25858g(aVar, executor, m39236Y());
                return;
            }
            C8902u0 c8902u0 = this.f32631x;
            if (c8902u0 != null) {
                nextLong = 0;
                z10 = false;
            } else {
                nextLong = this.f32611d.nextLong();
                C7164t c7164t = this.f32612e.get();
                c7164t.m21347g();
                C8902u0 c8902u02 = new C8902u0(nextLong, c7164t);
                this.f32631x = c8902u02;
                this.f32601P.m25690b();
                c8902u0 = c8902u02;
            }
            if (z10) {
                this.f32616i.mo39166h(false, (int) (nextLong >>> 32), (int) nextLong);
            }
            c8902u0.m25859a(aVar, executor);
        }
    }

    @Override // io.grpc.internal.InterfaceC8863j1
    /* renamed from: g */
    public Runnable mo25248g(InterfaceC8863j1.a aVar) {
        this.f32615h = (InterfaceC8863j1.a) C7159o.m21313p(aVar, "listener");
        if (this.f32594I) {
            C8831b1 c8831b1 = new C8831b1(new C8831b1.c(this), this.f32624q, this.f32595J, this.f32596K, this.f32597L);
            this.f32593H = c8831b1;
            c8831b1.m25309o();
        }
        C12200a m39162y = C12200a.m39162y(this.f32623p, this, ModuleDescriptor.MODULE_VERSION);
        InterfaceC12490c m39164r = m39162y.m39164r(this.f32614g.mo40886a(C7068l.m20802a(m39162y), true));
        synchronized (this.f32618k) {
            C12201b c12201b = new C12201b(this, m39164r);
            this.f32616i = c12201b;
            this.f32617j = new C12216q(this, c12201b);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f32623p.execute(new c(countDownLatch, m39162y));
        try {
            m39242i0();
            countDownLatch.countDown();
            this.f32623p.execute(new d());
            return null;
        } catch (Throwable th2) {
            countDownLatch.countDown();
            throw th2;
        }
    }

    @Override // p425wi.C12201b.a
    /* renamed from: h */
    public void mo39177h(Throwable th2) {
        C7159o.m21313p(th2, "failureCause");
        m39246k0(0, EnumC12488a.INTERNAL_ERROR, C11915g1.f31549u.m38146q(th2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void m39276h0(C12207h c12207h) {
        this.f32591F.remove(c12207h);
        m39238d0(c12207h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void m39277o0(C12207h c12207h) {
        if (this.f32629v != null) {
            c12207h.mo25206t().m25231M(this.f32629v, InterfaceC8892r.a.MISCARRIED, true, new C11953w0());
        } else if (this.f32621n.size() < this.f32590E) {
            m39250m0(c12207h);
        } else {
            this.f32591F.add(c12207h);
            m39244j0(c12207h);
        }
    }

    public String toString() {
        return C7153i.m21274c(this).m21283c("logId", this.f32619l.m38165d()).m21284d("address", this.f32608a).toString();
    }
}
