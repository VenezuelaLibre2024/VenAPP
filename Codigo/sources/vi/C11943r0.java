package vi;

import bj.C1805h;
import io.grpc.internal.C8894r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p082eb.C7159o;
import vi.C11912f1;

/* renamed from: vi.r0 */
/* loaded from: classes3.dex */
public final class C11943r0 {

    /* renamed from: d */
    private static C11943r0 f31636d;

    /* renamed from: a */
    private final LinkedHashSet<AbstractC11941q0> f31638a = new LinkedHashSet<>();

    /* renamed from: b */
    private final LinkedHashMap<String, AbstractC11941q0> f31639b = new LinkedHashMap<>();

    /* renamed from: c */
    private static final Logger f31635c = Logger.getLogger(C11943r0.class.getName());

    /* renamed from: e */
    private static final Iterable<Class<?>> f31637e = m38256c();

    /* renamed from: vi.r0$a */
    /* loaded from: classes3.dex */
    private static final class a implements C11912f1.b<AbstractC11941q0> {
        a() {
        }

        @Override // vi.C11912f1.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo38063b(AbstractC11941q0 abstractC11941q0) {
            return abstractC11941q0.mo9650c();
        }

        @Override // vi.C11912f1.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo38062a(AbstractC11941q0 abstractC11941q0) {
            return abstractC11941q0.mo9651d();
        }
    }

    /* renamed from: a */
    private synchronized void m38254a(AbstractC11941q0 abstractC11941q0) {
        C7159o.m21302e(abstractC11941q0.mo9651d(), "isAvailable() returned false");
        this.f31638a.add(abstractC11941q0);
    }

    /* renamed from: b */
    public static synchronized C11943r0 m38255b() {
        C11943r0 c11943r0;
        synchronized (C11943r0.class) {
            if (f31636d == null) {
                List<AbstractC11941q0> m38128e = C11912f1.m38128e(AbstractC11941q0.class, f31637e, AbstractC11941q0.class.getClassLoader(), new a());
                f31636d = new C11943r0();
                for (AbstractC11941q0 abstractC11941q0 : m38128e) {
                    f31635c.fine("Service loader found " + abstractC11941q0);
                    f31636d.m38254a(abstractC11941q0);
                }
                f31636d.m38257e();
            }
            c11943r0 = f31636d;
        }
        return c11943r0;
    }

    /* renamed from: c */
    static List<Class<?>> m38256c() {
        ArrayList arrayList = new ArrayList();
        try {
            int i10 = C8894r1.f20880b;
            arrayList.add(C8894r1.class);
        } catch (ClassNotFoundException e10) {
            f31635c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e10);
        }
        try {
            int i11 = C1805h.f7667b;
            arrayList.add(C1805h.class);
        } catch (ClassNotFoundException e11) {
            f31635c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e11);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: e */
    private synchronized void m38257e() {
        this.f31639b.clear();
        Iterator<AbstractC11941q0> it = this.f31638a.iterator();
        while (it.hasNext()) {
            AbstractC11941q0 next = it.next();
            String mo9649b = next.mo9649b();
            AbstractC11941q0 abstractC11941q0 = this.f31639b.get(mo9649b);
            if (abstractC11941q0 == null || abstractC11941q0.mo9650c() < next.mo9650c()) {
                this.f31639b.put(mo9649b, next);
            }
        }
    }

    /* renamed from: d */
    public synchronized AbstractC11941q0 m38258d(String str) {
        return this.f31639b.get(C7159o.m21313p(str, "policy"));
    }
}
