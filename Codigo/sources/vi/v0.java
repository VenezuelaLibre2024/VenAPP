package vi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vi.f1;

/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: c */
    private static final Logger f29218c = Logger.getLogger(v0.class.getName());

    /* renamed from: d */
    private static v0 f29219d;

    /* renamed from: a */
    private final LinkedHashSet<u0> f29220a = new LinkedHashSet<>();

    /* renamed from: b */
    private List<u0> f29221b = Collections.emptyList();

    /* loaded from: classes3.dex */
    public class a implements Comparator<u0> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(u0 u0Var, u0 u0Var2) {
            return u0Var.c() - u0Var2.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b implements f1.b<u0> {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // vi.f1.b
        /* renamed from: c */
        public int b(u0 u0Var) {
            return u0Var.c();
        }

        @Override // vi.f1.b
        /* renamed from: d */
        public boolean a(u0 u0Var) {
            return u0Var.b();
        }
    }

    private synchronized void a(u0 u0Var) {
        eb.o.e(u0Var.b(), "isAvailable() returned false");
        this.f29220a.add(u0Var);
    }

    public static synchronized v0 b() {
        v0 v0Var;
        synchronized (v0.class) {
            if (f29219d == null) {
                List<u0> e10 = f1.e(u0.class, c(), u0.class.getClassLoader(), new b(null));
                f29219d = new v0();
                for (u0 u0Var : e10) {
                    f29218c.fine("Service loader found " + u0Var);
                    f29219d.a(u0Var);
                }
                f29219d.f();
            }
            v0Var = f29219d;
        }
        return v0Var;
    }

    static List<Class<?>> c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(wi.g.class);
        } catch (ClassNotFoundException e10) {
            f29218c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            f29218c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e11);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e12) {
            f29218c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e12);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void f() {
        ArrayList arrayList = new ArrayList(this.f29220a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.f29221b = Collections.unmodifiableList(arrayList);
    }

    public u0 d() {
        List<u0> e10 = e();
        if (e10.isEmpty()) {
            return null;
        }
        return e10.get(0);
    }

    synchronized List<u0> e() {
        return this.f29221b;
    }
}
