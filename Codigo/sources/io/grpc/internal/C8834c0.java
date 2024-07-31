package io.grpc.internal;

import io.grpc.internal.C8844e2;
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
import p082eb.C7144a0;
import p082eb.C7146b0;
import p082eb.C7159o;
import p082eb.C7164t;
import p082eb.C7169y;
import vi.AbstractC11903c1;
import vi.AbstractC11957y0;
import vi.C11895a;
import vi.C11915g1;
import vi.C11954x;
import vi.ExecutorC11927k1;
import vi.InterfaceC11906d1;

/* renamed from: io.grpc.internal.c0 */
/* loaded from: classes3.dex */
public class C8834c0 extends AbstractC11957y0 {

    /* renamed from: A */
    private static final g f20322A;

    /* renamed from: B */
    private static String f20323B;

    /* renamed from: s */
    private static final Logger f20324s = Logger.getLogger(C8834c0.class.getName());

    /* renamed from: t */
    private static final Set<String> f20325t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    /* renamed from: u */
    private static final String f20326u;

    /* renamed from: v */
    private static final String f20327v;

    /* renamed from: w */
    private static final String f20328w;

    /* renamed from: x */
    static boolean f20329x;

    /* renamed from: y */
    static boolean f20330y;

    /* renamed from: z */
    protected static boolean f20331z;

    /* renamed from: a */
    final InterfaceC11906d1 f20332a;

    /* renamed from: b */
    private final Random f20333b = new Random();

    /* renamed from: c */
    protected volatile b f20334c = d.INSTANCE;

    /* renamed from: d */
    private final AtomicReference<f> f20335d = new AtomicReference<>();

    /* renamed from: e */
    private final String f20336e;

    /* renamed from: f */
    private final String f20337f;

    /* renamed from: g */
    private final int f20338g;

    /* renamed from: h */
    private final C8844e2.d<Executor> f20339h;

    /* renamed from: i */
    private final long f20340i;

    /* renamed from: j */
    private final ExecutorC11927k1 f20341j;

    /* renamed from: k */
    private final C7164t f20342k;

    /* renamed from: l */
    protected boolean f20343l;

    /* renamed from: m */
    private boolean f20344m;

    /* renamed from: n */
    private Executor f20345n;

    /* renamed from: o */
    private final boolean f20346o;

    /* renamed from: p */
    private final AbstractC11957y0.h f20347p;

    /* renamed from: q */
    private boolean f20348q;

    /* renamed from: r */
    private AbstractC11957y0.e f20349r;

    /* renamed from: io.grpc.internal.c0$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: b */
        List<InetAddress> mo25348b(String str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: io.grpc.internal.c0$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private C11915g1 f20350a;

        /* renamed from: b */
        private List<C11954x> f20351b;

        /* renamed from: c */
        private AbstractC11957y0.c f20352c;

        /* renamed from: d */
        public C11895a f20353d;

        private c() {
        }
    }

    /* renamed from: io.grpc.internal.c0$d */
    /* loaded from: classes3.dex */
    private enum d implements b {
        INSTANCE;

        @Override // io.grpc.internal.C8834c0.b
        /* renamed from: b */
        public List<InetAddress> mo25348b(String str) {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.c0$e */
    /* loaded from: classes3.dex */
    public final class e implements Runnable {

        /* renamed from: a */
        private final AbstractC11957y0.e f20354a;

        /* renamed from: io.grpc.internal.c0$e$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ boolean f20356a;

            a(boolean z10) {
                this.f20356a = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f20356a) {
                    C8834c0 c8834c0 = C8834c0.this;
                    c8834c0.f20343l = true;
                    if (c8834c0.f20340i > 0) {
                        C8834c0.this.f20342k.m21346f().m21347g();
                    }
                }
                C8834c0.this.f20348q = false;
            }
        }

        e(AbstractC11957y0.e eVar) {
            this.f20354a = (AbstractC11957y0.e) C7159o.m21313p(eVar, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorC11927k1 executorC11927k1;
            a aVar;
            Logger logger = C8834c0.f20324s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                C8834c0.f20324s.finer("Attempting DNS resolution of " + C8834c0.this.f20337f);
            }
            c cVar = null;
            try {
                try {
                    C11954x m25331n = C8834c0.this.m25331n();
                    AbstractC11957y0.g.a m38376d = AbstractC11957y0.g.m38376d();
                    if (m25331n != null) {
                        if (C8834c0.f20324s.isLoggable(level)) {
                            C8834c0.f20324s.finer("Using proxy address " + m25331n);
                        }
                        m38376d.m38381b(Collections.singletonList(m25331n));
                    } else {
                        cVar = C8834c0.this.m25346o(false);
                        if (cVar.f20350a != null) {
                            this.f20354a.mo25549b(cVar.f20350a);
                            return;
                        }
                        if (cVar.f20351b != null) {
                            m38376d.m38381b(cVar.f20351b);
                        }
                        if (cVar.f20352c != null) {
                            m38376d.m38383d(cVar.f20352c);
                        }
                        C11895a c11895a = cVar.f20353d;
                        if (c11895a != null) {
                            m38376d.m38382c(c11895a);
                        }
                    }
                    this.f20354a.mo25550c(m38376d.m38380a());
                    r0 = cVar != null && cVar.f20350a == null;
                    executorC11927k1 = C8834c0.this.f20341j;
                    aVar = new a(r0);
                } catch (IOException e10) {
                    this.f20354a.mo25549b(C11915g1.f31549u.m38147r("Unable to resolve host " + C8834c0.this.f20337f).m38146q(e10));
                    r0 = 0 != 0 && null.f20350a == null;
                    executorC11927k1 = C8834c0.this.f20341j;
                    aVar = new a(r0);
                }
                executorC11927k1.execute(aVar);
            } finally {
                C8834c0.this.f20341j.execute(new a(0 != 0 && null.f20350a == null));
            }
        }
    }

    /* renamed from: io.grpc.internal.c0$f */
    /* loaded from: classes3.dex */
    public interface f {
        /* renamed from: a */
        List<String> mo25355a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.c0$g */
    /* loaded from: classes3.dex */
    public interface g {
        /* renamed from: a */
        f mo25356a();

        /* renamed from: b */
        Throwable mo25357b();
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f20326u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f20327v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f20328w = property3;
        f20329x = Boolean.parseBoolean(property);
        f20330y = Boolean.parseBoolean(property2);
        f20331z = Boolean.parseBoolean(property3);
        f20322A = m25337v(C8834c0.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8834c0(String str, String str2, AbstractC11957y0.b bVar, C8844e2.d<Executor> dVar, C7164t c7164t, boolean z10) {
        C7159o.m21313p(bVar, "args");
        this.f20339h = dVar;
        URI create = URI.create("//" + ((String) C7159o.m21313p(str2, "name")));
        C7159o.m21308k(create.getHost() != null, "Invalid DNS name: %s", str2);
        this.f20336e = (String) C7159o.m21314q(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.f20337f = create.getHost();
        this.f20338g = create.getPort() == -1 ? bVar.m38357a() : create.getPort();
        this.f20332a = (InterfaceC11906d1) C7159o.m21313p(bVar.m38359c(), "proxyDetector");
        this.f20340i = m25335s(z10);
        this.f20342k = (C7164t) C7159o.m21313p(c7164t, "stopwatch");
        this.f20341j = (ExecutorC11927k1) C7159o.m21313p(bVar.m38361e(), "syncContext");
        Executor m38358b = bVar.m38358b();
        this.f20345n = m38358b;
        this.f20346o = m38358b == null;
        this.f20347p = (AbstractC11957y0.h) C7159o.m21313p(bVar.m38360d(), "serviceConfigParser");
    }

    /* renamed from: A */
    private List<C11954x> m25320A() {
        Exception e10 = null;
        try {
            try {
                List<InetAddress> mo25348b = this.f20334c.mo25348b(this.f20337f);
                ArrayList arrayList = new ArrayList(mo25348b.size());
                Iterator<InetAddress> it = mo25348b.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C11954x(new InetSocketAddress(it.next(), this.f20338g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e11) {
                e10 = e11;
                C7169y.m21362f(e10);
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            if (e10 != null) {
                f20324s.log(Level.FINE, "Address resolution failure", (Throwable) e10);
            }
            throw th2;
        }
    }

    /* renamed from: B */
    private AbstractC11957y0.c m25321B() {
        List<String> emptyList = Collections.emptyList();
        f m25347u = m25347u();
        if (m25347u != null) {
            try {
                emptyList = m25347u.mo25355a("_grpc_config." + this.f20337f);
            } catch (Exception e10) {
                f20324s.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e10);
            }
        }
        if (emptyList.isEmpty()) {
            f20324s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f20337f});
            return null;
        }
        AbstractC11957y0.c m25339x = m25339x(emptyList, this.f20333b, m25334r());
        if (m25339x != null) {
            return m25339x.m38374d() != null ? AbstractC11957y0.c.m38372b(m25339x.m38374d()) : this.f20347p.mo25273a((Map) m25339x.m38373c());
        }
        return null;
    }

    /* renamed from: C */
    protected static boolean m25322C(boolean z10, boolean z11, String str) {
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

    /* renamed from: m */
    private boolean m25330m() {
        if (this.f20343l) {
            long j10 = this.f20340i;
            if (j10 != 0 && (j10 <= 0 || this.f20342k.m21345d(TimeUnit.NANOSECONDS) <= this.f20340i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public C11954x m25331n() {
        AbstractC11903c1 mo25759a = this.f20332a.mo25759a(InetSocketAddress.createUnresolved(this.f20337f, this.f20338g));
        if (mo25759a != null) {
            return new C11954x(mo25759a);
        }
        return null;
    }

    /* renamed from: p */
    private static final List<String> m25332p(Map<String, ?> map) {
        return C8827a1.m25263g(map, "clientLanguage");
    }

    /* renamed from: q */
    private static final List<String> m25333q(Map<String, ?> map) {
        return C8827a1.m25263g(map, "clientHostname");
    }

    /* renamed from: r */
    private static String m25334r() {
        if (f20323B == null) {
            try {
                f20323B = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e10) {
                throw new RuntimeException(e10);
            }
        }
        return f20323B;
    }

    /* renamed from: s */
    private static long m25335s(boolean z10) {
        if (z10) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j10 = 30;
        if (property != null) {
            try {
                j10 = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f20324s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j10 > 0 ? TimeUnit.SECONDS.toNanos(j10) : j10;
    }

    /* renamed from: t */
    private static final Double m25336t(Map<String, ?> map) {
        return C8827a1.m25264h(map, "percentage");
    }

    /* renamed from: v */
    static g m25337v(ClassLoader classLoader) {
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
                    logger = f20324s;
                    level = Level.FINE;
                    str = "Can't construct JndiResourceResolverFactory, skipping.";
                }
            } catch (Exception e11) {
                e = e11;
                logger = f20324s;
                level = Level.FINE;
                str = "Can't find JndiResourceResolverFactory ctor, skipping.";
            }
        } catch (ClassCastException e12) {
            e = e12;
            logger = f20324s;
            level = Level.FINE;
            str = "Unable to cast JndiResourceResolverFactory, skipping.";
        } catch (ClassNotFoundException e13) {
            e = e13;
            logger = f20324s;
            level = Level.FINE;
            str = "Unable to find JndiResourceResolverFactory, skipping.";
        }
        if (gVar.mo25357b() == null) {
            return gVar;
        }
        logger = f20324s;
        level = Level.FINE;
        str = "JndiResourceResolverFactory not available, skipping.";
        e = gVar.mo25357b();
        logger.log(level, str, e);
        return null;
    }

    /* renamed from: w */
    static Map<String, ?> m25338w(Map<String, ?> map, Random random, String str) {
        boolean z10;
        boolean z11;
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            C7144a0.m21244a(f20325t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List<String> m25332p = m25332p(map);
        if (m25332p != null && !m25332p.isEmpty()) {
            Iterator<String> it = m25332p.iterator();
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
        Double m25336t = m25336t(map);
        if (m25336t != null) {
            int intValue = m25336t.intValue();
            C7144a0.m21244a(intValue >= 0 && intValue <= 100, "Bad percentage: %s", m25336t);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List<String> m25333q = m25333q(map);
        if (m25333q != null && !m25333q.isEmpty()) {
            Iterator<String> it2 = m25333q.iterator();
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
        Map<String, ?> m25266j = C8827a1.m25266j(map, "serviceConfig");
        if (m25266j != null) {
            return m25266j;
        }
        throw new C7146b0(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    /* renamed from: x */
    static AbstractC11957y0.c m25339x(List<String> list, Random random, String str) {
        C11915g1 c11915g1;
        String str2;
        try {
            Iterator<Map<String, ?>> it = m25340y(list).iterator();
            Map<String, ?> map = null;
            while (it.hasNext()) {
                try {
                    map = m25338w(it.next(), random, str);
                    if (map != null) {
                        break;
                    }
                } catch (RuntimeException e10) {
                    e = e10;
                    c11915g1 = C11915g1.f31536h;
                    str2 = "failed to pick service config choice";
                    return AbstractC11957y0.c.m38372b(c11915g1.m38147r(str2).m38146q(e));
                }
            }
            if (map == null) {
                return null;
            }
            return AbstractC11957y0.c.m38371a(map);
        } catch (IOException | RuntimeException e11) {
            e = e11;
            c11915g1 = C11915g1.f31536h;
            str2 = "failed to parse TXT records";
        }
    }

    /* renamed from: y */
    static List<Map<String, ?>> m25340y(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                Object m26030a = C8917z0.m26030a(str.substring(12));
                if (!(m26030a instanceof List)) {
                    throw new ClassCastException("wrong type " + m26030a);
                }
                arrayList.addAll(C8827a1.m25257a((List) m26030a));
            } else {
                f20324s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    private void m25341z() {
        if (this.f20348q || this.f20344m || !m25330m()) {
            return;
        }
        this.f20348q = true;
        this.f20345n.execute(new e(this.f20349r));
    }

    @Override // vi.AbstractC11957y0
    /* renamed from: a */
    public String mo25342a() {
        return this.f20336e;
    }

    @Override // vi.AbstractC11957y0
    /* renamed from: b */
    public void mo25343b() {
        C7159o.m21319v(this.f20349r != null, "not started");
        m25341z();
    }

    @Override // vi.AbstractC11957y0
    /* renamed from: c */
    public void mo25344c() {
        if (this.f20344m) {
            return;
        }
        this.f20344m = true;
        Executor executor = this.f20345n;
        if (executor == null || !this.f20346o) {
            return;
        }
        this.f20345n = (Executor) C8844e2.m25428f(this.f20339h, executor);
    }

    @Override // vi.AbstractC11957y0
    /* renamed from: d */
    public void mo25345d(AbstractC11957y0.e eVar) {
        C7159o.m21319v(this.f20349r == null, "already started");
        if (this.f20346o) {
            this.f20345n = (Executor) C8844e2.m25427d(this.f20339h);
        }
        this.f20349r = (AbstractC11957y0.e) C7159o.m21313p(eVar, "listener");
        m25341z();
    }

    /* renamed from: o */
    protected c m25346o(boolean z10) {
        c cVar = new c();
        try {
            cVar.f20351b = m25320A();
        } catch (Exception e10) {
            if (!z10) {
                cVar.f20350a = C11915g1.f31549u.m38147r("Unable to resolve host " + this.f20337f).m38146q(e10);
                return cVar;
            }
        }
        if (f20331z) {
            cVar.f20352c = m25321B();
        }
        return cVar;
    }

    /* renamed from: u */
    protected f m25347u() {
        g gVar;
        if (!m25322C(f20329x, f20330y, this.f20337f)) {
            return null;
        }
        f fVar = this.f20335d.get();
        return (fVar != null || (gVar = f20322A) == null) ? fVar : gVar.mo25356a();
    }
}
