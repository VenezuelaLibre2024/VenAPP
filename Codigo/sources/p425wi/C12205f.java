package p425wi;

import com.google.android.gms.common.api.C5101a;
import io.grpc.internal.AbstractC8829b;
import io.grpc.internal.C8844e2;
import io.grpc.internal.C8848f2;
import io.grpc.internal.C8851g1;
import io.grpc.internal.C8853h;
import io.grpc.internal.C8880n2;
import io.grpc.internal.C8890q0;
import io.grpc.internal.InterfaceC8883o1;
import io.grpc.internal.InterfaceC8898t;
import io.grpc.internal.InterfaceC8904v;
import io.grpc.okhttp.internal.C8920b;
import io.grpc.okhttp.internal.C8926h;
import io.grpc.okhttp.internal.EnumC8919a;
import io.grpc.okhttp.internal.EnumC8929k;
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
import p082eb.C7159o;
import vi.AbstractC11910f;
import vi.AbstractC11947t0;
import vi.EnumC11933m1;

/* renamed from: wi.f */
/* loaded from: classes3.dex */
public final class C12205f extends AbstractC8829b<C12205f> {

    /* renamed from: r */
    private static final Logger f32510r = Logger.getLogger(C12205f.class.getName());

    /* renamed from: s */
    static final C8920b f32511s = new C8920b.b(C8920b.f21170f).m26048f(EnumC8919a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC8919a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC8919a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC8919a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC8919a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, EnumC8919a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).m26051i(EnumC8929k.TLS_1_2).m26050h(true).m26047e();

    /* renamed from: t */
    private static final long f32512t = TimeUnit.DAYS.toNanos(1000);

    /* renamed from: u */
    private static final C8844e2.d<Executor> f32513u;

    /* renamed from: v */
    static final InterfaceC8883o1<Executor> f32514v;

    /* renamed from: w */
    private static final EnumSet<EnumC11933m1> f32515w;

    /* renamed from: b */
    private final C8851g1 f32516b;

    /* renamed from: f */
    private SocketFactory f32520f;

    /* renamed from: g */
    private SSLSocketFactory f32521g;

    /* renamed from: i */
    private HostnameVerifier f32523i;

    /* renamed from: o */
    private boolean f32529o;

    /* renamed from: c */
    private C8880n2.b f32517c = C8880n2.m25689a();

    /* renamed from: d */
    private InterfaceC8883o1<Executor> f32518d = f32514v;

    /* renamed from: e */
    private InterfaceC8883o1<ScheduledExecutorService> f32519e = C8848f2.m25567c(C8890q0.f20849v);

    /* renamed from: j */
    private C8920b f32524j = f32511s;

    /* renamed from: k */
    private c f32525k = c.TLS;

    /* renamed from: l */
    private long f32526l = Long.MAX_VALUE;

    /* renamed from: m */
    private long f32527m = C8890q0.f20841n;

    /* renamed from: n */
    private int f32528n = 65535;

    /* renamed from: p */
    private int f32530p = C5101a.e.API_PRIORITY_OTHER;

    /* renamed from: q */
    private final boolean f32531q = false;

    /* renamed from: h */
    private final boolean f32522h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wi.f$a */
    /* loaded from: classes3.dex */
    public class a implements C8844e2.d<Executor> {
        a() {
        }

        @Override // io.grpc.internal.C8844e2.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo25433b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.C8844e2.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Executor mo25432a() {
            return Executors.newCachedThreadPool(C8890q0.m25752i("grpc-okhttp-%d", true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wi.f$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f32532a;

        /* renamed from: b */
        static final /* synthetic */ int[] f32533b;

        static {
            int[] iArr = new int[c.values().length];
            f32533b = iArr;
            try {
                iArr[c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32533b[c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC12204e.values().length];
            f32532a = iArr2;
            try {
                iArr2[EnumC12204e.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32532a[EnumC12204e.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wi.f$c */
    /* loaded from: classes3.dex */
    public enum c {
        TLS,
        PLAINTEXT
    }

    /* renamed from: wi.f$d */
    /* loaded from: classes3.dex */
    private final class d implements C8851g1.b {
        private d() {
        }

        /* synthetic */ d(C12205f c12205f, a aVar) {
            this();
        }

        @Override // io.grpc.internal.C8851g1.b
        /* renamed from: a */
        public int mo25577a() {
            return C12205f.this.m39184g();
        }
    }

    /* renamed from: wi.f$e */
    /* loaded from: classes3.dex */
    private final class e implements C8851g1.c {
        private e() {
        }

        /* synthetic */ e(C12205f c12205f, a aVar) {
            this();
        }

        @Override // io.grpc.internal.C8851g1.c
        /* renamed from: a */
        public InterfaceC8898t mo25578a() {
            return C12205f.this.m39182d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wi.f$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC8898t {

        /* renamed from: A */
        private final boolean f32536A;

        /* renamed from: B */
        final int f32537B;

        /* renamed from: C */
        final boolean f32538C;

        /* renamed from: D */
        private boolean f32539D;

        /* renamed from: a */
        private final InterfaceC8883o1<Executor> f32540a;

        /* renamed from: b */
        final Executor f32541b;

        /* renamed from: c */
        private final InterfaceC8883o1<ScheduledExecutorService> f32542c;

        /* renamed from: d */
        final ScheduledExecutorService f32543d;

        /* renamed from: e */
        final C8880n2.b f32544e;

        /* renamed from: f */
        final SocketFactory f32545f;

        /* renamed from: r */
        final SSLSocketFactory f32546r;

        /* renamed from: s */
        final HostnameVerifier f32547s;

        /* renamed from: t */
        final C8920b f32548t;

        /* renamed from: u */
        final int f32549u;

        /* renamed from: v */
        private final boolean f32550v;

        /* renamed from: w */
        private final long f32551w;

        /* renamed from: x */
        private final C8853h f32552x;

        /* renamed from: y */
        private final long f32553y;

        /* renamed from: z */
        final int f32554z;

        /* renamed from: wi.f$f$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C8853h.b f32555a;

            a(C8853h.b bVar) {
                this.f32555a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f32555a.m25584a();
            }
        }

        private f(InterfaceC8883o1<Executor> interfaceC8883o1, InterfaceC8883o1<ScheduledExecutorService> interfaceC8883o12, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C8920b c8920b, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, C8880n2.b bVar, boolean z12) {
            this.f32540a = interfaceC8883o1;
            this.f32541b = interfaceC8883o1.mo25568a();
            this.f32542c = interfaceC8883o12;
            this.f32543d = interfaceC8883o12.mo25568a();
            this.f32545f = socketFactory;
            this.f32546r = sSLSocketFactory;
            this.f32547s = hostnameVerifier;
            this.f32548t = c8920b;
            this.f32549u = i10;
            this.f32550v = z10;
            this.f32551w = j10;
            this.f32552x = new C8853h("keepalive time nanos", j10);
            this.f32553y = j11;
            this.f32554z = i11;
            this.f32536A = z11;
            this.f32537B = i12;
            this.f32538C = z12;
            this.f32544e = (C8880n2.b) C7159o.m21313p(bVar, "transportTracerFactory");
        }

        /* synthetic */ f(InterfaceC8883o1 interfaceC8883o1, InterfaceC8883o1 interfaceC8883o12, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C8920b c8920b, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, C8880n2.b bVar, boolean z12, a aVar) {
            this(interfaceC8883o1, interfaceC8883o12, socketFactory, sSLSocketFactory, hostnameVerifier, c8920b, i10, z10, j10, j11, i11, z11, i12, bVar, z12);
        }

        @Override // io.grpc.internal.InterfaceC8898t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f32539D) {
                return;
            }
            this.f32539D = true;
            this.f32540a.mo25569b(this.f32541b);
            this.f32542c.mo25569b(this.f32543d);
        }

        @Override // io.grpc.internal.InterfaceC8898t
        /* renamed from: h1 */
        public InterfaceC8904v mo25642h1(SocketAddress socketAddress, InterfaceC8898t.a aVar, AbstractC11910f abstractC11910f) {
            if (this.f32539D) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            C8853h.b m25583d = this.f32552x.m25583d();
            C12208i c12208i = new C12208i(this, (InetSocketAddress) socketAddress, aVar.m25820a(), aVar.m25823d(), aVar.m25821b(), aVar.m25822c(), new a(m25583d));
            if (this.f32550v) {
                c12208i.m39266T(true, m25583d.m25585b(), this.f32553y, this.f32536A);
            }
            return c12208i;
        }

        @Override // io.grpc.internal.InterfaceC8898t
        /* renamed from: l0 */
        public ScheduledExecutorService mo25643l0() {
            return this.f32543d;
        }
    }

    static {
        a aVar = new a();
        f32513u = aVar;
        f32514v = C8848f2.m25567c(aVar);
        f32515w = EnumSet.of(EnumC11933m1.MTLS, EnumC11933m1.CUSTOM_MANAGERS);
    }

    private C12205f(String str) {
        a aVar = null;
        this.f32516b = new C8851g1(str, new e(this, aVar), new d(this, aVar));
    }

    /* renamed from: f */
    public static C12205f m39181f(String str) {
        return new C12205f(str);
    }

    @Override // io.grpc.internal.AbstractC8829b
    /* renamed from: c */
    protected AbstractC11947t0<?> mo25275c() {
        return this.f32516b;
    }

    /* renamed from: d */
    f m39182d() {
        return new f(this.f32518d, this.f32519e, this.f32520f, m39183e(), this.f32523i, this.f32524j, this.f20256a, this.f32526l != Long.MAX_VALUE, this.f32526l, this.f32527m, this.f32528n, this.f32529o, this.f32530p, this.f32517c, false, null);
    }

    /* renamed from: e */
    SSLSocketFactory m39183e() {
        int i10 = b.f32533b[this.f32525k.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 != 2) {
            throw new RuntimeException("Unknown negotiation type: " + this.f32525k);
        }
        try {
            if (this.f32521g == null) {
                this.f32521g = SSLContext.getInstance("Default", C8926h.m26086e().m26092g()).getSocketFactory();
            }
            return this.f32521g;
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException("TLS Provider failure", e10);
        }
    }

    /* renamed from: g */
    int m39184g() {
        int i10 = b.f32533b[this.f32525k.ordinal()];
        if (i10 == 1) {
            return 80;
        }
        if (i10 == 2) {
            return 443;
        }
        throw new AssertionError(this.f32525k + " not handled");
    }
}
