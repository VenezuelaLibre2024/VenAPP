package io.grpc.internal;

import io.grpc.internal.e2;
import io.grpc.internal.j2;
import io.grpc.internal.r;
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
import vi.c;
import vi.g1;
import vi.k;
import vi.k0;
import vi.p0;
import vi.w0;

/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: a */
    private static final Logger f19081a = Logger.getLogger(q0.class.getName());

    /* renamed from: b */
    private static final Set<g1.b> f19082b = Collections.unmodifiableSet(EnumSet.of(g1.b.OK, g1.b.INVALID_ARGUMENT, g1.b.NOT_FOUND, g1.b.ALREADY_EXISTS, g1.b.FAILED_PRECONDITION, g1.b.ABORTED, g1.b.OUT_OF_RANGE, g1.b.DATA_LOSS));

    /* renamed from: c */
    public static final Charset f19083c = Charset.forName("US-ASCII");

    /* renamed from: d */
    public static final w0.g<Long> f19084d = w0.g.e("grpc-timeout", new i());

    /* renamed from: e */
    public static final w0.g<String> f19085e;

    /* renamed from: f */
    public static final w0.g<byte[]> f19086f;

    /* renamed from: g */
    public static final w0.g<String> f19087g;

    /* renamed from: h */
    public static final w0.g<byte[]> f19088h;

    /* renamed from: i */
    static final w0.g<String> f19089i;

    /* renamed from: j */
    public static final w0.g<String> f19090j;

    /* renamed from: k */
    public static final w0.g<String> f19091k;

    /* renamed from: l */
    public static final w0.g<String> f19092l;

    /* renamed from: m */
    public static final eb.s f19093m;

    /* renamed from: n */
    public static final long f19094n;

    /* renamed from: o */
    public static final long f19095o;

    /* renamed from: p */
    public static final long f19096p;

    /* renamed from: q */
    public static final vi.d1 f19097q;

    /* renamed from: r */
    public static final vi.d1 f19098r;

    /* renamed from: s */
    public static final c.C0470c<Boolean> f19099s;

    /* renamed from: t */
    private static final vi.k f19100t;

    /* renamed from: u */
    public static final e2.d<Executor> f19101u;

    /* renamed from: v */
    public static final e2.d<ScheduledExecutorService> f19102v;

    /* renamed from: w */
    public static final eb.v<eb.t> f19103w;

    /* loaded from: classes3.dex */
    class a implements vi.d1 {
        a() {
        }

        @Override // vi.d1
        public vi.c1 a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    class b extends vi.k {
        b() {
        }
    }

    /* loaded from: classes3.dex */
    class c implements e2.d<Executor> {
        c() {
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: c */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: d */
        public Executor a() {
            return Executors.newCachedThreadPool(q0.i("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* loaded from: classes3.dex */
    class d implements e2.d<ScheduledExecutorService> {
        d() {
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: c */
        public void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: d */
        public ScheduledExecutorService a() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, q0.i("grpc-timer-%d", true));
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

    /* loaded from: classes3.dex */
    class e implements eb.v<eb.t> {
        e() {
        }

        @Override // eb.v
        /* renamed from: a */
        public eb.t get() {
            return eb.t.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements s {

        /* renamed from: a */
        final /* synthetic */ k.a f19104a;

        /* renamed from: b */
        final /* synthetic */ s f19105b;

        f(k.a aVar, s sVar) {
            this.f19104a = aVar;
            this.f19105b = sVar;
        }

        @Override // io.grpc.internal.s
        public q c(vi.x0<?, ?> x0Var, vi.w0 w0Var, vi.c cVar, vi.k[] kVarArr) {
            vi.k a10 = this.f19104a.a(k.b.a().b(cVar).a(), w0Var);
            eb.o.v(kVarArr[kVarArr.length - 1] == q0.f19100t, "lb tracer already assigned");
            kVarArr[kVarArr.length - 1] = a10;
            return this.f19105b.c(x0Var, w0Var, cVar, kVarArr);
        }

        @Override // vi.n0
        public vi.i0 e() {
            return this.f19105b.e();
        }
    }

    /* loaded from: classes3.dex */
    private static final class g implements k0.a<byte[]> {
        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // vi.w0.j
        /* renamed from: c */
        public byte[] b(byte[] bArr) {
            return bArr;
        }

        @Override // vi.w0.j
        /* renamed from: d */
        public byte[] a(byte[] bArr) {
            return bArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends Enum<h> {
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
        private final vi.g1 status;

        static {
            vi.g1 g1Var = vi.g1.f29115u;
            h hVar = new h("NO_ERROR", 0, 0, g1Var);
            NO_ERROR = hVar;
            vi.g1 g1Var2 = vi.g1.f29114t;
            h hVar2 = new h("PROTOCOL_ERROR", 1, 1, g1Var2);
            PROTOCOL_ERROR = hVar2;
            h hVar3 = new h("INTERNAL_ERROR", 2, 2, g1Var2);
            INTERNAL_ERROR = hVar3;
            h hVar4 = new h("FLOW_CONTROL_ERROR", 3, 3, g1Var2);
            FLOW_CONTROL_ERROR = hVar4;
            h hVar5 = new h("SETTINGS_TIMEOUT", 4, 4, g1Var2);
            SETTINGS_TIMEOUT = hVar5;
            h hVar6 = new h("STREAM_CLOSED", 5, 5, g1Var2);
            STREAM_CLOSED = hVar6;
            h hVar7 = new h("FRAME_SIZE_ERROR", 6, 6, g1Var2);
            FRAME_SIZE_ERROR = hVar7;
            h hVar8 = new h("REFUSED_STREAM", 7, 7, g1Var);
            REFUSED_STREAM = hVar8;
            h hVar9 = new h("CANCEL", 8, 8, vi.g1.f29101g);
            CANCEL = hVar9;
            h hVar10 = new h("COMPRESSION_ERROR", 9, 9, g1Var2);
            COMPRESSION_ERROR = hVar10;
            h hVar11 = new h("CONNECT_ERROR", 10, 10, g1Var2);
            CONNECT_ERROR = hVar11;
            h hVar12 = new h("ENHANCE_YOUR_CALM", 11, 11, vi.g1.f29109o.r("Bandwidth exhausted"));
            ENHANCE_YOUR_CALM = hVar12;
            h hVar13 = new h("INADEQUATE_SECURITY", 12, 12, vi.g1.f29107m.r("Permission denied as protocol is not secure enough to call"));
            INADEQUATE_SECURITY = hVar13;
            h hVar14 = new h("HTTP_1_1_REQUIRED", 13, 13, vi.g1.f29102h);
            HTTP_1_1_REQUIRED = hVar14;
            $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14};
            codeMap = b();
        }

        private h(String str, int i10, int i11, vi.g1 g1Var) {
            super(str, i10);
            this.code = i11;
            String str2 = "HTTP/2 error code: " + name();
            if (g1Var.o() != null) {
                str2 = str2 + " (" + g1Var.o() + ")";
            }
            this.status = g1Var.r(str2);
        }

        private static h[] b() {
            h[] values = values();
            h[] hVarArr = new h[((int) values[values.length - 1].h()) + 1];
            for (h hVar : values) {
                hVarArr[(int) hVar.h()] = hVar;
            }
            return hVarArr;
        }

        public static h i(long j10) {
            h[] hVarArr = codeMap;
            if (j10 >= hVarArr.length || j10 < 0) {
                return null;
            }
            return hVarArr[(int) j10];
        }

        public static vi.g1 m(long j10) {
            h i10 = i(j10);
            if (i10 != null) {
                return i10.l();
            }
            return vi.g1.i(INTERNAL_ERROR.l().n().i()).r("Unrecognized HTTP/2 error code: " + j10);
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) $VALUES.clone();
        }

        public long h() {
            return this.code;
        }

        public vi.g1 l() {
            return this.status;
        }
    }

    /* loaded from: classes3.dex */
    static class i implements w0.d<Long> {
        i() {
        }

        @Override // vi.w0.d
        /* renamed from: c */
        public Long b(String str) {
            TimeUnit timeUnit;
            eb.o.e(str.length() > 0, "empty timeout");
            eb.o.e(str.length() <= 9, "bad timeout format");
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

        @Override // vi.w0.d
        /* renamed from: d */
        public String a(Long l10) {
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
        w0.d<String> dVar = vi.w0.f29225e;
        f19085e = w0.g.e("grpc-encoding", dVar);
        f19086f = vi.k0.b("grpc-accept-encoding", new g(null));
        f19087g = w0.g.e("content-encoding", dVar);
        f19088h = vi.k0.b("accept-encoding", new g(null));
        f19089i = w0.g.e("content-length", dVar);
        f19090j = w0.g.e("content-type", dVar);
        f19091k = w0.g.e("te", dVar);
        f19092l = w0.g.e("user-agent", dVar);
        f19093m = eb.s.d(',').h();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f19094n = timeUnit.toNanos(20L);
        f19095o = TimeUnit.HOURS.toNanos(2L);
        f19096p = timeUnit.toNanos(20L);
        f19097q = new t1();
        f19098r = new a();
        f19099s = c.C0470c.b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f19100t = new b();
        f19101u = new c();
        f19102v = new d();
        f19103w = new e();
    }

    private q0() {
    }

    public static URI b(String str) {
        eb.o.p(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Invalid authority: " + str, e10);
        }
    }

    public static String c(String str) {
        URI b10 = b(str);
        eb.o.k(b10.getHost() != null, "No host in authority '%s'", str);
        eb.o.k(b10.getUserInfo() == null, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    public static void d(j2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                e(next);
            }
        }
    }

    public static void e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            f19081a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e10);
        }
    }

    public static vi.k[] f(vi.c cVar, vi.w0 w0Var, int i10, boolean z10) {
        List<k.a> i11 = cVar.i();
        int size = i11.size() + 1;
        vi.k[] kVarArr = new vi.k[size];
        k.b a10 = k.b.a().b(cVar).d(i10).c(z10).a();
        for (int i12 = 0; i12 < i11.size(); i12++) {
            kVarArr[i12] = i11.get(i12).a(a10, w0Var);
        }
        kVarArr[size - 1] = f19100t;
        return kVarArr;
    }

    public static String g(String str, String str2) {
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

    public static String h(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory i(String str, boolean z10) {
        return new com.google.common.util.concurrent.k().e(z10).f(str).b();
    }

    public static s j(p0.e eVar, boolean z10) {
        p0.h c10 = eVar.c();
        s a10 = c10 != null ? ((m2) c10.d()).a() : null;
        if (a10 != null) {
            k.a b10 = eVar.b();
            return b10 == null ? a10 : new f(b10, a10);
        }
        if (!eVar.a().p()) {
            if (eVar.d()) {
                return new g0(n(eVar.a()), r.a.DROPPED);
            }
            if (!z10) {
                return new g0(n(eVar.a()), r.a.PROCESSED);
            }
        }
        return null;
    }

    private static g1.b k(int i10) {
        if (i10 >= 100 && i10 < 200) {
            return g1.b.INTERNAL;
        }
        if (i10 != 400) {
            if (i10 == 401) {
                return g1.b.UNAUTHENTICATED;
            }
            if (i10 == 403) {
                return g1.b.PERMISSION_DENIED;
            }
            if (i10 == 404) {
                return g1.b.UNIMPLEMENTED;
            }
            if (i10 != 429) {
                if (i10 != 431) {
                    switch (i10) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return g1.b.UNKNOWN;
                    }
                }
            }
            return g1.b.UNAVAILABLE;
        }
        return g1.b.INTERNAL;
    }

    public static vi.g1 l(int i10) {
        return k(i10).h().r("HTTP status code " + i10);
    }

    public static boolean m(String str) {
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

    public static vi.g1 n(vi.g1 g1Var) {
        eb.o.d(g1Var != null);
        if (!f19082b.contains(g1Var.n())) {
            return g1Var;
        }
        return vi.g1.f29114t.r("Inappropriate status code from control plane: " + g1Var.n() + " " + g1Var.o()).q(g1Var.m());
    }

    public static boolean o(vi.c cVar) {
        return !Boolean.TRUE.equals(cVar.h(f19099s));
    }
}
