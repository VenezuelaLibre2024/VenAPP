package vi;

import com.google.common.collect.AbstractC5911y;
import io.grpc.internal.C8838d0;
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
import p082eb.C7159o;
import vi.AbstractC11957y0;
import vi.C11912f1;

/* renamed from: vi.a1 */
/* loaded from: classes3.dex */
public final class C11897a1 {

    /* renamed from: e */
    private static final Logger f31466e = Logger.getLogger(C11897a1.class.getName());

    /* renamed from: f */
    private static C11897a1 f31467f;

    /* renamed from: a */
    private final AbstractC11957y0.d f31468a = new b();

    /* renamed from: b */
    private String f31469b = "unknown";

    /* renamed from: c */
    private final LinkedHashSet<AbstractC11959z0> f31470c = new LinkedHashSet<>();

    /* renamed from: d */
    private AbstractC5911y<String, AbstractC11959z0> f31471d = AbstractC5911y.m15111k();

    /* renamed from: vi.a1$b */
    /* loaded from: classes3.dex */
    private final class b extends AbstractC11957y0.d {
        private b() {
        }

        @Override // vi.AbstractC11957y0.d
        /* renamed from: a */
        public String mo25385a() {
            String str;
            synchronized (C11897a1.this) {
                str = C11897a1.this.f31469b;
            }
            return str;
        }

        @Override // vi.AbstractC11957y0.d
        /* renamed from: b */
        public AbstractC11957y0 mo25386b(URI uri, AbstractC11957y0.b bVar) {
            AbstractC11959z0 abstractC11959z0 = C11897a1.this.m38061f().get(uri.getScheme());
            if (abstractC11959z0 == null) {
                return null;
            }
            return abstractC11959z0.mo25386b(uri, bVar);
        }
    }

    /* renamed from: vi.a1$c */
    /* loaded from: classes3.dex */
    private static final class c implements C11912f1.b<AbstractC11959z0> {
        private c() {
        }

        @Override // vi.C11912f1.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo38063b(AbstractC11959z0 abstractC11959z0) {
            return abstractC11959z0.mo25388e();
        }

        @Override // vi.C11912f1.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo38062a(AbstractC11959z0 abstractC11959z0) {
            return abstractC11959z0.mo25387d();
        }
    }

    /* renamed from: b */
    private synchronized void m38056b(AbstractC11959z0 abstractC11959z0) {
        C7159o.m21302e(abstractC11959z0.mo25387d(), "isAvailable() returned false");
        this.f31470c.add(abstractC11959z0);
    }

    /* renamed from: d */
    public static synchronized C11897a1 m38057d() {
        C11897a1 c11897a1;
        synchronized (C11897a1.class) {
            if (f31467f == null) {
                List<AbstractC11959z0> m38128e = C11912f1.m38128e(AbstractC11959z0.class, m38058e(), AbstractC11959z0.class.getClassLoader(), new c());
                if (m38128e.isEmpty()) {
                    f31466e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f31467f = new C11897a1();
                for (AbstractC11959z0 abstractC11959z0 : m38128e) {
                    f31466e.fine("Service loader found " + abstractC11959z0);
                    f31467f.m38056b(abstractC11959z0);
                }
                f31467f.m38059g();
            }
            c11897a1 = f31467f;
        }
        return c11897a1;
    }

    /* renamed from: e */
    static List<Class<?>> m38058e() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C8838d0.class);
        } catch (ClassNotFoundException e10) {
            f31466e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e10);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    private synchronized void m38059g() {
        HashMap hashMap = new HashMap();
        String str = "unknown";
        Iterator<AbstractC11959z0> it = this.f31470c.iterator();
        int i10 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            AbstractC11959z0 next = it.next();
            String m38385c = next.m38385c();
            AbstractC11959z0 abstractC11959z0 = (AbstractC11959z0) hashMap.get(m38385c);
            if (abstractC11959z0 == null || abstractC11959z0.mo25388e() < next.mo25388e()) {
                hashMap.put(m38385c, next);
            }
            if (i10 < next.mo25388e()) {
                i10 = next.mo25388e();
                str = next.m38385c();
            }
        }
        this.f31471d = AbstractC5911y.m15110c(hashMap);
        this.f31469b = str;
    }

    /* renamed from: c */
    public AbstractC11957y0.d m38060c() {
        return this.f31468a;
    }

    /* renamed from: f */
    synchronized Map<String, AbstractC11959z0> m38061f() {
        return this.f31471d;
    }
}
