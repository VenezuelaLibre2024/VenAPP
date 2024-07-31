package io.grpc.internal;

import io.grpc.internal.e2;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import vi.y0;

/* loaded from: classes3.dex */
public class c0 extends vi.y0 {
    private static final g A;
    private static String B;

    /* renamed from: s, reason: collision with root package name */
    private static final Logger f18628s = Logger.getLogger(c0.class.getName());

    /* renamed from: t, reason: collision with root package name */
    private static final Set<String> f18629t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    /* renamed from: u, reason: collision with root package name */
    private static final String f18630u;

    /* renamed from: v, reason: collision with root package name */
    private static final String f18631v;

    /* renamed from: w, reason: collision with root package name */
    private static final String f18632w;

    /* renamed from: x, reason: collision with root package name */
    static boolean f18633x;

    /* renamed from: y, reason: collision with root package name */
    static boolean f18634y;

    /* renamed from: z, reason: collision with root package name */
    protected static boolean f18635z;

    /* renamed from: a, reason: collision with root package name */
    final vi.d1 f18636a;

    /* renamed from: b, reason: collision with root package name */
    private final Random f18637b = new Random();

    /* renamed from: c, reason: collision with root package name */
    protected volatile b f18638c = d.INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<f> f18639d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    private final String f18640e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18641f;

    /* renamed from: g, reason: collision with root package name */
    private final int f18642g;

    /* renamed from: h, reason: collision with root package name */
    private final e2.d<Executor> f18643h;

    /* renamed from: i, reason: collision with root package name */
    private final long f18644i;

    /* renamed from: j, reason: collision with root package name */
    private final vi.k1 f18645j;

    /* renamed from: k, reason: collision with root package name */
    private final eb.t f18646k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f18647l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18648m;

    /* renamed from: n, reason: collision with root package name */
    private Executor f18649n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f18650o;

    /* renamed from: p, reason: collision with root package name */
    private final y0.h f18651p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f18652q;

    /* renamed from: r, reason: collision with root package name */
    private y0.e f18653r;

    /* loaded from: classes3.dex */
    public interface b {
        List<InetAddress> b(String str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private vi.g1 f18654a;

        /* renamed from: b, reason: collision with root package name */
        private List<vi.x> f18655b;

        /* renamed from: c, reason: collision with root package name */
        private y0.c f18656c;

        /* renamed from: d, reason: collision with root package name */
        public vi.a f18657d;

        private c() {
        }
    }

    /* loaded from: classes3.dex */
    private enum d implements b {
        INSTANCE;

        @Override // io.grpc.internal.c0.b
        public List<InetAddress> b(String str) {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final y0.e f18658a;

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f18660a;

            a(boolean z10) {
                this.f18660a = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f18660a) {
                    c0 c0Var = c0.this;
                    c0Var.f18647l = true;
                    if (c0Var.f18644i > 0) {
                        c0.this.f18646k.f().g();
                    }
                }
                c0.this.f18652q = false;
            }
        }

        e(y0.e eVar) {
            this.f18658a = (y0.e) eb.o.p(eVar, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            vi.k1 k1Var;
            a aVar;
            Logger logger = c0.f18628s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                c0.f18628s.finer("Attempting DNS resolution of " + c0.this.f18641f);
            }
            c cVar = null;
            try {
                try {
                    vi.x n10 = c0.this.n();
                    y0.g.a d10 = y0.g.d();
                    if (n10 != null) {
                        if (c0.f18628s.isLoggable(level)) {
                            c0.f18628s.finer("Using proxy address " + n10);
                        }
                        d10.b(Collections.singletonList(n10));
                    } else {
                        cVar = c0.this.o(false);
                        if (cVar.f18654a != null) {
                            this.f18658a.b(cVar.f18654a);
                            return;
                        }
                        if (cVar.f18655b != null) {
                            d10.b(cVar.f18655b);
                        }
                        if (cVar.f18656c != null) {
                            d10.d(cVar.f18656c);
                        }
                        vi.a aVar2 = cVar.f18657d;
                        if (aVar2 != null) {
                            d10.c(aVar2);
                        }
                    }
                    this.f18658a.c(d10.a());
                    r0 = cVar != null && cVar.f18654a == null;
                    k1Var = c0.this.f18645j;
                    aVar = new a(r0);
                } catch (IOException e10) {
                    this.f18658a.b(vi.g1.f29115u.r("Unable to resolve host " + c0.this.f18641f).q(e10));
                    r0 = 0 != 0 && null.f18654a == null;
                    k1Var = c0.this.f18645j;
                    aVar = new a(r0);
                }
                k1Var.execute(aVar);
            } finally {
                c0.this.f18645j.execute(new a(0 != 0 && null.f18654a == null));
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        List<String> a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface g {
        f a();

        Throwable b();
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f18630u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f18631v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f18632w = property3;
        f18633x = Boolean.parseBoolean(property);
        f18634y = Boolean.parseBoolean(property2);
        f18635z = Boolean.parseBoolean(property3);
        A = v(c0.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c0(String str, String str2, y0.b bVar, e2.d<Executor> dVar, eb.t tVar, boolean z10) {
        eb.o.p(bVar, "args");
        this.f18643h = dVar;
        URI create = URI.create("//" + ((String) eb.o.p(str2, "name")));
        eb.o.k(create.getHost() != null, "Invalid DNS name: %s", str2);
        this.f18640e = (String) eb.o.q(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.f18641f = create.getHost();
        this.f18642g = create.getPort() == -1 ? bVar.a() : create.getPort();
        this.f18636a = (vi.d1) eb.o.p(bVar.c(), "proxyDetector");
        this.f18644i = s(z10);
        this.f18646k = (eb.t) eb.o.p(tVar, "stopwatch");
        this.f18645j = (vi.k1) eb.o.p(bVar.e(), "syncContext");
        Executor b10 = bVar.b();
        this.f18649n = b10;
        this.f18650o = b10 == null;
        this.f18651p = (y0.h) eb.o.p(bVar.d(), "serviceConfigParser");
    }

    private List<vi.x> A() {
        Exception e10 = null;
        try {
            try {
                List<InetAddress> b10 = this.f18638c.b(this.f18641f);
                ArrayList arrayList = new ArrayList(b10.size());
                Iterator<InetAddress> it = b10.iterator();
                while (it.hasNext()) {
                    arrayList.add(new vi.x(new InetSocketAddress(it.next(), this.f18642g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e11) {
                e10 = e11;
                eb.y.f(e10);
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            if (e10 != null) {
                f18628s.log(Level.FINE, "Address resolution failure", (Throwable) e10);
            }
            throw th2;
        }
    }

    private y0.c B() {
        List<String> emptyList = Collections.emptyList();
        f u10 = u();
        if (u10 != null) {
            try {
                emptyList = u10.a("_grpc_config." + this.f18641f);
            } catch (Exception e10) {
                f18628s.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e10);
            }
        }
        if (emptyList.isEmpty()) {
            f18628s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f18641f});
            return null;
        }
        y0.c x10 = x(emptyList, this.f18637b, r());
        if (x10 != null) {
            return x10.d() != null ? y0.c.b(x10.d()) : this.f18651p.a((Map) x10.c());
        }
        return null;
    }

    protected static boolean C(boolean z10, boolean z11, String str) {
        if (!z10) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z11;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z12 = true;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '.') {
                z12 &= charAt >= '0' && charAt <= '9';
            }
        }
        return true ^ z12;
    }

    private boolean m() {
        if (this.f18647l) {
            long j10 = this.f18644i;
            if (j10 != 0 && (j10 <= 0 || this.f18646k.d(TimeUnit.NANOSECONDS) <= this.f18644i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vi.x n() {
        vi.c1 a10 = this.f18636a.a(InetSocketAddress.createUnresolved(this.f18641f, this.f18642g));
        if (a10 != null) {
            return new vi.x(a10);
        }
        return null;
    }

    private static final List<String> p(Map<String, ?> map) {
        return a1.g(map, "clientLanguage");
    }

    private static final List<String> q(Map<String, ?> map) {
        return a1.g(map, "clientHostname");
    }

    private static String r() {
        if (B == null) {
            try {
                B = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e10) {
                throw new RuntimeException(e10);
            }
        }
        return B;
    }

    private static long s(boolean z10) {
        if (z10) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j10 = 30;
        if (property != null) {
            try {
                j10 = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f18628s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j10 > 0 ? TimeUnit.SECONDS.toNanos(j10) : j10;
    }

    private static final Double t(Map<String, ?> map) {
        return a1.h(map, "percentage");
    }

    static g v(ClassLoader classLoader) {
        Logger logger;
        Level level;
        String str;
        g gVar;
        try {
            try {
                try {
                    gVar = (g) Class.forName("io.grpc.internal.y0", true, classLoader).asSubclass(g.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    e = e10;
                    logger = f18628s;
                    level = Level.FINE;
                    str = "Can't construct JndiResourceResolverFactory, skipping.";
                }
            } catch (Exception e11) {
                e = e11;
                logger = f18628s;
                level = Level.FINE;
                str = "Can't find JndiResourceResolverFactory ctor, skipping.";
            }
        } catch (ClassCastException e12) {
            e = e12;
            logger = f18628s;
            level = Level.FINE;
            str = "Unable to cast JndiResourceResolverFactory, skipping.";
        } catch (ClassNotFoundException e13) {
            e = e13;
            logger = f18628s;
            level = Level.FINE;
            str = "Unable to find JndiResourceResolverFactory, skipping.";
        }
        if (gVar.b() == null) {
            return gVar;
        }
        logger = f18628s;
        level = Level.FINE;
        str = "JndiResourceResolverFactory not available, skipping.";
        e = gVar.b();
        logger.log(level, str, e);
        return null;
    }

    static Map<String, ?> w(Map<String, ?> map, Random random, String str) {
        boolean z10;
        boolean z11;
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            eb.a0.a(f18629t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List<String> p10 = p(map);
        if (p10 != null && !p10.isEmpty()) {
            Iterator<String> it = p10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                if ("java".equalsIgnoreCase(it.next())) {
                    z11 = true;
                    break;
                }
            }
            if (!z11) {
                return null;
            }
        }
        Double t10 = t(map);
        if (t10 != null) {
            int intValue = t10.intValue();
            eb.a0.a(intValue >= 0 && intValue <= 100, "Bad percentage: %s", t10);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List<String> q10 = q(map);
        if (q10 != null && !q10.isEmpty()) {
            Iterator<String> it2 = q10.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = false;
                    break;
                }
                if (it2.next().equals(str)) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                return null;
            }
        }
        Map<String, ?> j10 = a1.j(map, "serviceConfig");
        if (j10 != null) {
            return j10;
        }
        throw new eb.b0(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    static y0.c x(List<String> list, Random random, String str) {
        vi.g1 g1Var;
        String str2;
        try {
            Iterator<Map<String, ?>> it = y(list).iterator();
            Map<String, ?> map = null;
            while (it.hasNext()) {
                try {
                    map = w(it.next(), random, str);
                    if (map != null) {
                        break;
                    }
                } catch (RuntimeException e10) {
                    e = e10;
                    g1Var = vi.g1.f29102h;
                    str2 = "failed to pick service config choice";
                    return y0.c.b(g1Var.r(str2).q(e));
                }
            }
            if (map == null) {
                return null;
            }
            return y0.c.a(map);
        } catch (IOException | RuntimeException e11) {
            e = e11;
            g1Var = vi.g1.f29102h;
            str2 = "failed to parse TXT records";
        }
    }

    static List<Map<String, ?>> y(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                Object a10 = z0.a(str.substring(12));
                if (!(a10 instanceof List)) {
                    throw new ClassCastException("wrong type " + a10);
                }
                arrayList.addAll(a1.a((List) a10));
            } else {
                f18628s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    private void z() {
        if (this.f18652q || this.f18648m || !m()) {
            return;
        }
        this.f18652q = true;
        this.f18649n.execute(new e(this.f18653r));
    }

    @Override // vi.y0
    public String a() {
        return this.f18640e;
    }

    @Override // vi.y0
    public void b() {
        eb.o.v(this.f18653r != null, "not started");
        z();
    }

    @Override // vi.y0
    public void c() {
        if (this.f18648m) {
            return;
        }
        this.f18648m = true;
        Executor executor = this.f18649n;
        if (executor == null || !this.f18650o) {
            return;
        }
        this.f18649n = (Executor) e2.f(this.f18643h, executor);
    }

    @Override // vi.y0
    public void d(y0.e eVar) {
        eb.o.v(this.f18653r == null, "already started");
        if (this.f18650o) {
            this.f18649n = (Executor) e2.d(this.f18643h);
        }
        this.f18653r = (y0.e) eb.o.p(eVar, "listener");
        z();
    }

    protected c o(boolean z10) {
        c cVar = new c();
        try {
            cVar.f18655b = A();
        } catch (Exception e10) {
            if (!z10) {
                cVar.f18654a = vi.g1.f29115u.r("Unable to resolve host " + this.f18641f).q(e10);
                return cVar;
            }
        }
        if (f18635z) {
            cVar.f18656c = B();
        }
        return cVar;
    }

    protected f u() {
        g gVar;
        if (!C(f18633x, f18634y, this.f18641f)) {
            return null;
        }
        f fVar = this.f18639d.get();
        return (fVar != null || (gVar = A) == null) ? fVar : gVar.a();
    }
}
