package wi;

import com.google.android.gms.common.api.a;
import io.grpc.internal.e2;
import io.grpc.internal.f2;
import io.grpc.internal.g1;
import io.grpc.internal.h;
import io.grpc.internal.n2;
import io.grpc.internal.o1;
import io.grpc.internal.q0;
import io.grpc.internal.t;
import io.grpc.internal.v;
import io.grpc.okhttp.internal.b;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import vi.m1;
import vi.t0;

/* loaded from: classes3.dex */
public final class f extends io.grpc.internal.b<f> {

    /* renamed from: r */
    private static final Logger f30041r = Logger.getLogger(f.class.getName());

    /* renamed from: s */
    static final io.grpc.okhttp.internal.b f30042s = new b.C0302b(io.grpc.okhttp.internal.b.f19419f).f(io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).i(io.grpc.okhttp.internal.k.TLS_1_2).h(true).e();

    /* renamed from: t */
    private static final long f30043t = TimeUnit.DAYS.toNanos(1000);

    /* renamed from: u */
    private static final e2.d<Executor> f30044u;

    /* renamed from: v */
    static final o1<Executor> f30045v;

    /* renamed from: w */
    private static final EnumSet<m1> f30046w;

    /* renamed from: b */
    private final g1 f30047b;

    /* renamed from: f */
    private SocketFactory f30051f;

    /* renamed from: g */
    private SSLSocketFactory f30052g;

    /* renamed from: i */
    private HostnameVerifier f30054i;

    /* renamed from: o */
    private boolean f30060o;

    /* renamed from: c */
    private n2.b f30048c = n2.a();

    /* renamed from: d */
    private o1<Executor> f30049d = f30045v;

    /* renamed from: e */
    private o1<ScheduledExecutorService> f30050e = f2.c(q0.f19102v);

    /* renamed from: j */
    private io.grpc.okhttp.internal.b f30055j = f30042s;

    /* renamed from: k */
    private c f30056k = c.TLS;

    /* renamed from: l */
    private long f30057l = Long.MAX_VALUE;

    /* renamed from: m */
    private long f30058m = q0.f19094n;

    /* renamed from: n */
    private int f30059n = 65535;

    /* renamed from: p */
    private int f30061p = a.e.API_PRIORITY_OTHER;

    /* renamed from: q */
    private final boolean f30062q = false;

    /* renamed from: h */
    private final boolean f30053h = false;

    /* loaded from: classes3.dex */
    public class a implements e2.d<Executor> {
        a() {
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: c */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: d */
        public Executor a() {
            return Executors.newCachedThreadPool(q0.i("grpc-okhttp-%d", true));
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f30063a;

        /* renamed from: b */
        static final /* synthetic */ int[] f30064b;

        static {
            int[] iArr = new int[c.values().length];
            f30064b = iArr;
            try {
                iArr[c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30064b[c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[wi.e.values().length];
            f30063a = iArr2;
            try {
                iArr2[wi.e.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30063a[wi.e.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        TLS,
        PLAINTEXT
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class d implements g1.b {
        private d() {
        }

        /* synthetic */ d(f fVar, a aVar) {
            this();
        }

        @Override // io.grpc.internal.g1.b
        public int a() {
            return f.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class e implements g1.c {
        private e() {
        }

        /* synthetic */ e(f fVar, a aVar) {
            this();
        }

        @Override // io.grpc.internal.g1.c
        public t a() {
            return f.this.d();
        }
    }

    /* renamed from: wi.f$f */
    /* loaded from: classes3.dex */
    public static final class C0487f implements t {
        private final boolean A;
        final int B;
        final boolean C;
        private boolean D;

        /* renamed from: a */
        private final o1<Executor> f30067a;

        /* renamed from: b */
        final Executor f30068b;

        /* renamed from: c */
        private final o1<ScheduledExecutorService> f30069c;

        /* renamed from: d */
        final ScheduledExecutorService f30070d;

        /* renamed from: e */
        final n2.b f30071e;

        /* renamed from: f */
        final SocketFactory f30072f;

        /* renamed from: r */
        final SSLSocketFactory f30073r;

        /* renamed from: s */
        final HostnameVerifier f30074s;

        /* renamed from: t */
        final io.grpc.okhttp.internal.b f30075t;

        /* renamed from: u */
        final int f30076u;

        /* renamed from: v */
        private final boolean f30077v;

        /* renamed from: w */
        private final long f30078w;

        /* renamed from: x */
        private final io.grpc.internal.h f30079x;

        /* renamed from: y */
        private final long f30080y;

        /* renamed from: z */
        final int f30081z;

        /* renamed from: wi.f$f$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ h.b f30082a;

            a(h.b bVar) {
                this.f30082a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f30082a.a();
            }
        }

        private C0487f(o1<Executor> o1Var, o1<ScheduledExecutorService> o1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, io.grpc.okhttp.internal.b bVar, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, n2.b bVar2, boolean z12) {
            this.f30067a = o1Var;
            this.f30068b = o1Var.a();
            this.f30069c = o1Var2;
            this.f30070d = o1Var2.a();
            this.f30072f = socketFactory;
            this.f30073r = sSLSocketFactory;
            this.f30074s = hostnameVerifier;
            this.f30075t = bVar;
            this.f30076u = i10;
            this.f30077v = z10;
            this.f30078w = j10;
            this.f30079x = new io.grpc.internal.h("keepalive time nanos", j10);
            this.f30080y = j11;
            this.f30081z = i11;
            this.A = z11;
            this.B = i12;
            this.C = z12;
            this.f30071e = (n2.b) eb.o.p(bVar2, "transportTracerFactory");
        }

        /* synthetic */ C0487f(o1 o1Var, o1 o1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, io.grpc.okhttp.internal.b bVar, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, n2.b bVar2, boolean z12, a aVar) {
            this(o1Var, o1Var2, socketFactory, sSLSocketFactory, hostnameVerifier, bVar, i10, z10, j10, j11, i11, z11, i12, bVar2, z12);
        }

        @Override // io.grpc.internal.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.D) {
                return;
            }
            this.D = true;
            this.f30067a.b(this.f30068b);
            this.f30069c.b(this.f30070d);
        }

        @Override // io.grpc.internal.t
        public v h1(SocketAddress socketAddress, t.a aVar, vi.f fVar) {
            if (this.D) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            h.b d10 = this.f30079x.d();
            i iVar = new i(this, (InetSocketAddress) socketAddress, aVar.a(), aVar.d(), aVar.b(), aVar.c(), new a(d10));
            if (this.f30077v) {
                iVar.T(true, d10.b(), this.f30080y, this.A);
            }
            return iVar;
        }

        @Override // io.grpc.internal.t
        public ScheduledExecutorService l0() {
            return this.f30070d;
        }
    }

    static {
        a aVar = new a();
        f30044u = aVar;
        f30045v = f2.c(aVar);
        f30046w = EnumSet.of(m1.MTLS, m1.CUSTOM_MANAGERS);
    }

    private f(String str) {
        this.f30047b = new g1(str, new e(this, null), new d(this, null));
    }

    public static f f(String str) {
        return new f(str);
    }

    @Override // io.grpc.internal.b
    protected t0<?> c() {
        return this.f30047b;
    }

    C0487f d() {
        return new C0487f(this.f30049d, this.f30050e, this.f30051f, e(), this.f30054i, this.f30055j, this.f18562a, this.f30057l != Long.MAX_VALUE, this.f30057l, this.f30058m, this.f30059n, this.f30060o, this.f30061p, this.f30048c, false, null);
    }

    SSLSocketFactory e() {
        int i10 = b.f30064b[this.f30056k.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 != 2) {
            throw new RuntimeException("Unknown negotiation type: " + this.f30056k);
        }
        try {
            if (this.f30052g == null) {
                this.f30052g = SSLContext.getInstance("Default", io.grpc.okhttp.internal.h.e().g()).getSocketFactory();
            }
            return this.f30052g;
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException("TLS Provider failure", e10);
        }
    }

    int g() {
        int i10 = b.f30064b[this.f30056k.ordinal()];
        if (i10 == 1) {
            return 80;
        }
        if (i10 == 2) {
            return 443;
        }
        throw new AssertionError(this.f30056k + " not handled");
    }
}
