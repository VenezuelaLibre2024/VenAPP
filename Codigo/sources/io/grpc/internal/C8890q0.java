package io.grpc.internal;

import com.google.common.util.concurrent.C5925k;
import io.grpc.internal.C8844e2;
import io.grpc.internal.InterfaceC8864j2;
import io.grpc.internal.InterfaceC8892r;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p082eb.C7159o;
import p082eb.C7163s;
import p082eb.C7164t;
import p082eb.InterfaceC7166v;
import vi.AbstractC11903c1;
import vi.AbstractC11925k;
import vi.AbstractC11939p0;
import vi.C11901c;
import vi.C11915g1;
import vi.C11920i0;
import vi.C11926k0;
import vi.C11953w0;
import vi.C11955x0;
import vi.InterfaceC11906d1;

/* renamed from: io.grpc.internal.q0 */
/* loaded from: classes3.dex */
public final class C8890q0 {

    /* renamed from: a */
    private static final Logger f20828a = Logger.getLogger(C8890q0.class.getName());

    /* renamed from: b */
    private static final Set<C11915g1.b> f20829b = Collections.unmodifiableSet(EnumSet.of(C11915g1.b.OK, C11915g1.b.INVALID_ARGUMENT, C11915g1.b.NOT_FOUND, C11915g1.b.ALREADY_EXISTS, C11915g1.b.FAILED_PRECONDITION, C11915g1.b.ABORTED, C11915g1.b.OUT_OF_RANGE, C11915g1.b.DATA_LOSS));

    /* renamed from: c */
    public static final Charset f20830c = Charset.forName("US-ASCII");

    /* renamed from: d */
    public static final C11953w0.g<Long> f20831d = C11953w0.g.m38322e("grpc-timeout", new i());

    /* renamed from: e */
    public static final C11953w0.g<String> f20832e;

    /* renamed from: f */
    public static final C11953w0.g<byte[]> f20833f;

    /* renamed from: g */
    public static final C11953w0.g<String> f20834g;

    /* renamed from: h */
    public static final C11953w0.g<byte[]> f20835h;

    /* renamed from: i */
    static final C11953w0.g<String> f20836i;

    /* renamed from: j */
    public static final C11953w0.g<String> f20837j;

    /* renamed from: k */
    public static final C11953w0.g<String> f20838k;

    /* renamed from: l */
    public static final C11953w0.g<String> f20839l;

    /* renamed from: m */
    public static final C7163s f20840m;

    /* renamed from: n */
    public static final long f20841n;

    /* renamed from: o */
    public static final long f20842o;

    /* renamed from: p */
    public static final long f20843p;

    /* renamed from: q */
    public static final InterfaceC11906d1 f20844q;

    /* renamed from: r */
    public static final InterfaceC11906d1 f20845r;

    /* renamed from: s */
    public static final C11901c.c<Boolean> f20846s;

    /* renamed from: t */
    private static final AbstractC11925k f20847t;

    /* renamed from: u */
    public static final C8844e2.d<Executor> f20848u;

    /* renamed from: v */
    public static final C8844e2.d<ScheduledExecutorService> f20849v;

    /* renamed from: w */
    public static final InterfaceC7166v<C7164t> f20850w;

    /* renamed from: io.grpc.internal.q0$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC11906d1 {
        a() {
        }

        @Override // vi.InterfaceC11906d1
        /* renamed from: a */
        public AbstractC11903c1 mo25759a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* renamed from: io.grpc.internal.q0$b */
    /* loaded from: classes3.dex */
    class b extends AbstractC11925k {
        b() {
        }
    }

    /* renamed from: io.grpc.internal.q0$c */
    /* loaded from: classes3.dex */
    class c implements C8844e2.d<Executor> {
        c() {
        }

        @Override // io.grpc.internal.C8844e2.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo25433b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.C8844e2.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Executor mo25432a() {
            return Executors.newCachedThreadPool(C8890q0.m25752i("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* renamed from: io.grpc.internal.q0$d */
    /* loaded from: classes3.dex */
    class d implements C8844e2.d<ScheduledExecutorService> {
        d() {
        }

        @Override // io.grpc.internal.C8844e2.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo25433b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // io.grpc.internal.C8844e2.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService mo25432a() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, C8890q0.m25752i("grpc-timer-%d", true));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    /* renamed from: io.grpc.internal.q0$e */
    /* loaded from: classes3.dex */
    class e implements InterfaceC7166v<C7164t> {
        e() {
        }

        @Override // p082eb.InterfaceC7166v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7164t get() {
            return C7164t.m21343c();
        }
    }

    /* renamed from: io.grpc.internal.q0$f */
    /* loaded from: classes3.dex */
    class f implements InterfaceC8895s {

        /* renamed from: a */
        final /* synthetic */ AbstractC11925k.a f20851a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC8895s f20852b;

        f(AbstractC11925k.a aVar, InterfaceC8895s interfaceC8895s) {
            this.f20851a = aVar;
            this.f20852b = interfaceC8895s;
        }

        @Override // io.grpc.internal.InterfaceC8895s
        /* renamed from: c */
        public InterfaceC8889q mo25245c(C11955x0<?, ?> c11955x0, C11953w0 c11953w0, C11901c c11901c, AbstractC11925k[] abstractC11925kArr) {
            AbstractC11925k mo9634a = this.f20851a.mo9634a(AbstractC11925k.b.m38183a().m38185b(c11901c).m38184a(), c11953w0);
            C7159o.m21319v(abstractC11925kArr[abstractC11925kArr.length - 1] == C8890q0.f20847t, "lb tracer already assigned");
            abstractC11925kArr[abstractC11925kArr.length - 1] = mo9634a;
            return this.f20852b.mo25245c(c11955x0, c11953w0, c11901c, abstractC11925kArr);
        }

        @Override // vi.InterfaceC11935n0
        /* renamed from: e */
        public C11920i0 mo25247e() {
            return this.f20852b.mo25247e();
        }
    }

    /* renamed from: io.grpc.internal.q0$g */
    /* loaded from: classes3.dex */
    private static final class g implements C11926k0.a<byte[]> {
        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // vi.C11953w0.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] mo25766b(byte[] bArr) {
            return bArr;
        }

        @Override // vi.C11953w0.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] mo25765a(byte[] bArr) {
            return bArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NO_ERROR' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: io.grpc.internal.q0$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private static final /* synthetic */ h[] $VALUES;
        public static final h CANCEL;
        public static final h COMPRESSION_ERROR;
        public static final h CONNECT_ERROR;
        public static final h ENHANCE_YOUR_CALM;
        public static final h FLOW_CONTROL_ERROR;
        public static final h FRAME_SIZE_ERROR;
        public static final h HTTP_1_1_REQUIRED;
        public static final h INADEQUATE_SECURITY;
        public static final h INTERNAL_ERROR;
        public static final h NO_ERROR;
        public static final h PROTOCOL_ERROR;
        public static final h REFUSED_STREAM;
        public static final h SETTINGS_TIMEOUT;
        public static final h STREAM_CLOSED;
        private static final h[] codeMap;
        private final int code;
        private final C11915g1 status;

        static {
            C11915g1 c11915g1 = C11915g1.f31549u;
            h hVar = new h("NO_ERROR", 0, 0, c11915g1);
            NO_ERROR = hVar;
            C11915g1 c11915g12 = C11915g1.f31548t;
            h hVar2 = new h("PROTOCOL_ERROR", 1, 1, c11915g12);
            PROTOCOL_ERROR = hVar2;
            h hVar3 = new h("INTERNAL_ERROR", 2, 2, c11915g12);
            INTERNAL_ERROR = hVar3;
            h hVar4 = new h("FLOW_CONTROL_ERROR", 3, 3, c11915g12);
            FLOW_CONTROL_ERROR = hVar4;
            h hVar5 = new h("SETTINGS_TIMEOUT", 4, 4, c11915g12);
            SETTINGS_TIMEOUT = hVar5;
            h hVar6 = new h("STREAM_CLOSED", 5, 5, c11915g12);
            STREAM_CLOSED = hVar6;
            h hVar7 = new h("FRAME_SIZE_ERROR", 6, 6, c11915g12);
            FRAME_SIZE_ERROR = hVar7;
            h hVar8 = new h("REFUSED_STREAM", 7, 7, c11915g1);
            REFUSED_STREAM = hVar8;
            h hVar9 = new h("CANCEL", 8, 8, C11915g1.f31535g);
            CANCEL = hVar9;
            h hVar10 = new h("COMPRESSION_ERROR", 9, 9, c11915g12);
            COMPRESSION_ERROR = hVar10;
            h hVar11 = new h("CONNECT_ERROR", 10, 10, c11915g12);
            CONNECT_ERROR = hVar11;
            h hVar12 = new h("ENHANCE_YOUR_CALM", 11, 11, C11915g1.f31543o.m38147r("Bandwidth exhausted"));
            ENHANCE_YOUR_CALM = hVar12;
            h hVar13 = new h("INADEQUATE_SECURITY", 12, 12, C11915g1.f31541m.m38147r("Permission denied as protocol is not secure enough to call"));
            INADEQUATE_SECURITY = hVar13;
            h hVar14 = new h("HTTP_1_1_REQUIRED", 13, 13, C11915g1.f31536h);
            HTTP_1_1_REQUIRED = hVar14;
            $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14};
            codeMap = m25769b();
        }

        private h(String str, int i10, int i11, C11915g1 c11915g1) {
            this.code = i11;
            String str2 = "HTTP/2 error code: " + name();
            if (c11915g1.m38144o() != null) {
                str2 = str2 + " (" + c11915g1.m38144o() + ")";
            }
            this.status = c11915g1.m38147r(str2);
        }

        /* renamed from: b */
        private static h[] m25769b() {
            h[] values = values();
            h[] hVarArr = new h[((int) values[values.length - 1].m25772h()) + 1];
            for (h hVar : values) {
                hVarArr[(int) hVar.m25772h()] = hVar;
            }
            return hVarArr;
        }

        /* renamed from: i */
        public static h m25770i(long j10) {
            h[] hVarArr = codeMap;
            if (j10 >= hVarArr.length || j10 < 0) {
                return null;
            }
            return hVarArr[(int) j10];
        }

        /* renamed from: m */
        public static C11915g1 m25771m(long j10) {
            h m25770i = m25770i(j10);
            if (m25770i != null) {
                return m25770i.m25773l();
            }
            return C11915g1.m38134i(INTERNAL_ERROR.m25773l().m38143n().m38151i()).m38147r("Unrecognized HTTP/2 error code: " + j10);
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) $VALUES.clone();
        }

        /* renamed from: h */
        public long m25772h() {
            return this.code;
        }

        /* renamed from: l */
        public C11915g1 m25773l() {
            return this.status;
        }
    }

    /* renamed from: io.grpc.internal.q0$i */
    /* loaded from: classes3.dex */
    static class i implements C11953w0.d<Long> {
        i() {
        }

        @Override // vi.C11953w0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long mo25775b(String str) {
            TimeUnit timeUnit;
            C7159o.m21302e(str.length() > 0, "empty timeout");
            C7159o.m21302e(str.length() <= 9, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt == 'H') {
                timeUnit = TimeUnit.HOURS;
            } else if (charAt == 'M') {
                timeUnit = TimeUnit.MINUTES;
            } else if (charAt == 'S') {
                timeUnit = TimeUnit.SECONDS;
            } else if (charAt == 'u') {
                timeUnit = TimeUnit.MICROSECONDS;
            } else {
                if (charAt != 'm') {
                    if (charAt == 'n') {
                        return Long.valueOf(parseLong);
                    }
                    throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
                }
                timeUnit = TimeUnit.MILLISECONDS;
            }
            return Long.valueOf(timeUnit.toNanos(parseLong));
        }

        @Override // vi.C11953w0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String mo25774a(Long l10) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l10.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l10.longValue() < 100000000) {
                return l10 + "n";
            }
            if (l10.longValue() < 100000000000L) {
                return timeUnit.toMicros(l10.longValue()) + "u";
            }
            if (l10.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l10.longValue()) + "m";
            }
            if (l10.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l10.longValue()) + "S";
            }
            if (l10.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l10.longValue()) + "M";
            }
            return timeUnit.toHours(l10.longValue()) + "H";
        }
    }

    static {
        C11953w0.d<String> dVar = C11953w0.f31660e;
        f20832e = C11953w0.g.m38322e("grpc-encoding", dVar);
        a aVar = null;
        f20833f = C11926k0.m38189b("grpc-accept-encoding", new g(aVar));
        f20834g = C11953w0.g.m38322e("content-encoding", dVar);
        f20835h = C11926k0.m38189b("accept-encoding", new g(aVar));
        f20836i = C11953w0.g.m38322e("content-length", dVar);
        f20837j = C11953w0.g.m38322e("content-type", dVar);
        f20838k = C11953w0.g.m38322e("te", dVar);
        f20839l = C11953w0.g.m38322e("user-agent", dVar);
        f20840m = C7163s.m21330d(',').m21334h();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f20841n = timeUnit.toNanos(20L);
        f20842o = TimeUnit.HOURS.toNanos(2L);
        f20843p = timeUnit.toNanos(20L);
        f20844q = new C8900t1();
        f20845r = new a();
        f20846s = C11901c.c.m38100b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f20847t = new b();
        f20848u = new c();
        f20849v = new d();
        f20850w = new e();
    }

    private C8890q0() {
    }

    /* renamed from: b */
    public static URI m25745b(String str) {
        C7159o.m21313p(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Invalid authority: " + str, e10);
        }
    }

    /* renamed from: c */
    public static String m25746c(String str) {
        URI m25745b = m25745b(str);
        C7159o.m21308k(m25745b.getHost() != null, "No host in authority '%s'", str);
        C7159o.m21308k(m25745b.getUserInfo() == null, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m25747d(InterfaceC8864j2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                m25748e(next);
            }
        }
    }

    /* renamed from: e */
    public static void m25748e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            f20828a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e10);
        }
    }

    /* renamed from: f */
    public static AbstractC11925k[] m25749f(C11901c c11901c, C11953w0 c11953w0, int i10, boolean z10) {
        List<AbstractC11925k.a> m38086i = c11901c.m38086i();
        int size = m38086i.size() + 1;
        AbstractC11925k[] abstractC11925kArr = new AbstractC11925k[size];
        AbstractC11925k.b m38184a = AbstractC11925k.b.m38183a().m38185b(c11901c).m38187d(i10).m38186c(z10).m38184a();
        for (int i11 = 0; i11 < m38086i.size(); i11++) {
            abstractC11925kArr[i11] = m38086i.get(i11).mo9634a(m38184a, c11953w0);
        }
        abstractC11925kArr[size - 1] = f20847t;
        return abstractC11925kArr;
    }

    /* renamed from: g */
    public static String m25750g(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(' ');
        }
        sb2.append("grpc-java-");
        sb2.append(str);
        sb2.append('/');
        sb2.append("1.52.1");
        return sb2.toString();
    }

    /* renamed from: h */
    public static String m25751h(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* renamed from: i */
    public static ThreadFactory m25752i(String str, boolean z10) {
        return new C5925k().m15186e(z10).m15187f(str).m15185b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static InterfaceC8895s m25753j(AbstractC11939p0.e eVar, boolean z10) {
        AbstractC11939p0.h m38225c = eVar.m38225c();
        InterfaceC8895s mo25675a = m38225c != null ? ((InterfaceC8876m2) m38225c.mo9559d()).mo25675a() : null;
        if (mo25675a != null) {
            AbstractC11925k.a m38224b = eVar.m38224b();
            return m38224b == null ? mo25675a : new f(m38224b, mo25675a);
        }
        if (!eVar.m38223a().m38145p()) {
            if (eVar.m38226d()) {
                return new C8850g0(m25757n(eVar.m38223a()), InterfaceC8892r.a.DROPPED);
            }
            if (!z10) {
                return new C8850g0(m25757n(eVar.m38223a()), InterfaceC8892r.a.PROCESSED);
            }
        }
        return null;
    }

    /* renamed from: k */
    private static C11915g1.b m25754k(int i10) {
        if (i10 >= 100 && i10 < 200) {
            return C11915g1.b.INTERNAL;
        }
        if (i10 != 400) {
            if (i10 == 401) {
                return C11915g1.b.UNAUTHENTICATED;
            }
            if (i10 == 403) {
                return C11915g1.b.PERMISSION_DENIED;
            }
            if (i10 == 404) {
                return C11915g1.b.UNIMPLEMENTED;
            }
            if (i10 != 429) {
                if (i10 != 431) {
                    switch (i10) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return C11915g1.b.UNKNOWN;
                    }
                }
            }
            return C11915g1.b.UNAVAILABLE;
        }
        return C11915g1.b.INTERNAL;
    }

    /* renamed from: l */
    public static C11915g1 m25755l(int i10) {
        return m25754k(i10).m38150h().m38147r("HTTP status code " + i10);
    }

    /* renamed from: m */
    public static boolean m25756m(String str) {
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() == 16) {
            return true;
        }
        char charAt = lowerCase.charAt(16);
        return charAt == '+' || charAt == ';';
    }

    /* renamed from: n */
    public static C11915g1 m25757n(C11915g1 c11915g1) {
        C7159o.m21301d(c11915g1 != null);
        if (!f20829b.contains(c11915g1.m38143n())) {
            return c11915g1;
        }
        return C11915g1.f31548t.m38147r("Inappropriate status code from control plane: " + c11915g1.m38143n() + " " + c11915g1.m38144o()).m38146q(c11915g1.m38142m());
    }

    /* renamed from: o */
    public static boolean m25758o(C11901c c11901c) {
        return !Boolean.TRUE.equals(c11901c.m38085h(f20846s));
    }
}
