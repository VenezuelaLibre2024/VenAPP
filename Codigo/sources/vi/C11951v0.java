package vi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p082eb.C7159o;
import p425wi.C12206g;
import vi.C11912f1;

/* renamed from: vi.v0 */
/* loaded from: classes3.dex */
public final class C11951v0 {

    /* renamed from: c */
    private static final Logger f31653c = Logger.getLogger(C11951v0.class.getName());

    /* renamed from: d */
    private static C11951v0 f31654d;

    /* renamed from: a */
    private final LinkedHashSet<AbstractC11949u0> f31655a = new LinkedHashSet<>();

    /* renamed from: b */
    private List<AbstractC11949u0> f31656b = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vi.v0$a */
    /* loaded from: classes3.dex */
    public class a implements Comparator<AbstractC11949u0> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC11949u0 abstractC11949u0, AbstractC11949u0 abstractC11949u02) {
            return abstractC11949u0.mo38276c() - abstractC11949u02.mo38276c();
        }
    }

    /* renamed from: vi.v0$b */
    /* loaded from: classes3.dex */
    private static final class b implements C11912f1.b<AbstractC11949u0> {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // vi.C11912f1.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo38063b(AbstractC11949u0 abstractC11949u0) {
            return abstractC11949u0.mo38276c();
        }

        @Override // vi.C11912f1.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo38062a(AbstractC11949u0 abstractC11949u0) {
            return abstractC11949u0.mo38275b();
        }
    }

    /* renamed from: a */
    private synchronized void m38283a(AbstractC11949u0 abstractC11949u0) {
        C7159o.m21302e(abstractC11949u0.mo38275b(), "isAvailable() returned false");
        this.f31655a.add(abstractC11949u0);
    }

    /* renamed from: b */
    public static synchronized C11951v0 m38284b() {
        C11951v0 c11951v0;
        synchronized (C11951v0.class) {
            if (f31654d == null) {
                List<AbstractC11949u0> m38128e = C11912f1.m38128e(AbstractC11949u0.class, m38285c(), AbstractC11949u0.class.getClassLoader(), new b(null));
                f31654d = new C11951v0();
                for (AbstractC11949u0 abstractC11949u0 : m38128e) {
                    f31653c.fine("Service loader found " + abstractC11949u0);
                    f31654d.m38283a(abstractC11949u0);
                }
                f31654d.m38286f();
            }
            c11951v0 = f31654d;
        }
        return c11951v0;
    }

    /* renamed from: c */
    static List<Class<?>> m38285c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C12206g.class);
        } catch (ClassNotFoundException e10) {
            f31653c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            f31653c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e11);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e12) {
            f31653c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e12);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: f */
    private synchronized void m38286f() {
        ArrayList arrayList = new ArrayList(this.f31655a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.f31656b = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC11949u0 m38287d() {
        List<AbstractC11949u0> m38288e = m38288e();
        if (m38288e.isEmpty()) {
            return null;
        }
        return m38288e.get(0);
    }

    /* renamed from: e */
    synchronized List<AbstractC11949u0> m38288e() {
        return this.f31656b;
    }
}
