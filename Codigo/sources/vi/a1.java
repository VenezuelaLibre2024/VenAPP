package vi;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import vi.f1;
import vi.y0;

/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f29032e = Logger.getLogger(a1.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private static a1 f29033f;

    /* renamed from: a, reason: collision with root package name */
    private final y0.d f29034a = new b();

    /* renamed from: b, reason: collision with root package name */
    private String f29035b = "unknown";

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<z0> f29036c = new LinkedHashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private com.google.common.collect.y<String, z0> f29037d = com.google.common.collect.y.k();

    /* loaded from: classes3.dex */
    private final class b extends y0.d {
        private b() {
        }

        @Override // vi.y0.d
        public String a() {
            String str;
            synchronized (a1.this) {
                str = a1.this.f29035b;
            }
            return str;
        }

        @Override // vi.y0.d
        public y0 b(URI uri, y0.b bVar) {
            z0 z0Var = a1.this.f().get(uri.getScheme());
            if (z0Var == null) {
                return null;
            }
            return z0Var.b(uri, bVar);
        }
    }

    /* loaded from: classes3.dex */
    private static final class c implements f1.b<z0> {
        private c() {
        }

        @Override // vi.f1.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(z0 z0Var) {
            return z0Var.e();
        }

        @Override // vi.f1.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(z0 z0Var) {
            return z0Var.d();
        }
    }

    private synchronized void b(z0 z0Var) {
        eb.o.e(z0Var.d(), "isAvailable() returned false");
        this.f29036c.add(z0Var);
    }

    public static synchronized a1 d() {
        a1 a1Var;
        synchronized (a1.class) {
            if (f29033f == null) {
                List<z0> e10 = f1.e(z0.class, e(), z0.class.getClassLoader(), new c());
                if (e10.isEmpty()) {
                    f29032e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f29033f = new a1();
                for (z0 z0Var : e10) {
                    f29032e.fine("Service loader found " + z0Var);
                    f29033f.b(z0Var);
                }
                f29033f.g();
            }
            a1Var = f29033f;
        }
        return a1Var;
    }

    static List<Class<?>> e() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(io.grpc.internal.d0.class);
        } catch (ClassNotFoundException e10) {
            f29032e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e10);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void g() {
        HashMap hashMap = new HashMap();
        String str = "unknown";
        Iterator<z0> it = this.f29036c.iterator();
        int i10 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            z0 next = it.next();
            String c10 = next.c();
            z0 z0Var = (z0) hashMap.get(c10);
            if (z0Var == null || z0Var.e() < next.e()) {
                hashMap.put(c10, next);
            }
            if (i10 < next.e()) {
                i10 = next.e();
                str = next.c();
            }
        }
        this.f29037d = com.google.common.collect.y.c(hashMap);
        this.f29035b = str;
    }

    public y0.d c() {
        return this.f29034a;
    }

    synchronized Map<String, z0> f() {
        return this.f29037d;
    }
}
