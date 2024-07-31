package vi;

import io.grpc.internal.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vi.f1;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: d, reason: collision with root package name */
    private static r0 f29201d;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<q0> f29203a = new LinkedHashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap<String, q0> f29204b = new LinkedHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f29200c = Logger.getLogger(r0.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final Iterable<Class<?>> f29202e = c();

    /* loaded from: classes3.dex */
    private static final class a implements f1.b<q0> {
        a() {
        }

        @Override // vi.f1.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(q0 q0Var) {
            return q0Var.c();
        }

        @Override // vi.f1.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(q0 q0Var) {
            return q0Var.d();
        }
    }

    private synchronized void a(q0 q0Var) {
        eb.o.e(q0Var.d(), "isAvailable() returned false");
        this.f29203a.add(q0Var);
    }

    public static synchronized r0 b() {
        r0 r0Var;
        synchronized (r0.class) {
            if (f29201d == null) {
                List<q0> e10 = f1.e(q0.class, f29202e, q0.class.getClassLoader(), new a());
                f29201d = new r0();
                for (q0 q0Var : e10) {
                    f29200c.fine("Service loader found " + q0Var);
                    f29201d.a(q0Var);
                }
                f29201d.e();
            }
            r0Var = f29201d;
        }
        return r0Var;
    }

    static List<Class<?>> c() {
        ArrayList arrayList = new ArrayList();
        try {
            int i10 = r1.f19133b;
            arrayList.add(r1.class);
        } catch (ClassNotFoundException e10) {
            f29200c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e10);
        }
        try {
            int i11 = bj.h.f6718b;
            arrayList.add(bj.h.class);
        } catch (ClassNotFoundException e11) {
            f29200c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e11);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void e() {
        this.f29204b.clear();
        Iterator<q0> it = this.f29203a.iterator();
        while (it.hasNext()) {
            q0 next = it.next();
            String b10 = next.b();
            q0 q0Var = this.f29204b.get(b10);
            if (q0Var == null || q0Var.c() < next.c()) {
                this.f29204b.put(b10, next);
            }
        }
    }

    public synchronized q0 d(String str) {
        return this.f29204b.get(eb.o.p(str, "policy"));
    }
}
