package bl;

/* loaded from: classes3.dex */
public final class g<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final b f6763b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final c f6764c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f6765a;

    /* loaded from: classes3.dex */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f6766a;

        public a(Throwable th2) {
            this.f6766a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f6766a, ((a) obj).f6766a);
        }

        public int hashCode() {
            Throwable th2 = this.f6766a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // bl.g.c
        public String toString() {
            return "Closed(" + this.f6766a + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final <E> Object a(Throwable th2) {
            return g.c(new a(th2));
        }

        public final <E> Object b() {
            return g.c(g.f6764c);
        }

        public final <E> Object c(E e10) {
            return g.c(e10);
        }
    }

    /* loaded from: classes3.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ g(Object obj) {
        this.f6765a = obj;
    }

    public static final /* synthetic */ g b(Object obj) {
        return new g(obj);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof g) && kotlin.jvm.internal.n.a(obj, ((g) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f6766a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f6765a, obj);
    }

    public int hashCode() {
        return g(this.f6765a);
    }

    public final /* synthetic */ Object k() {
        return this.f6765a;
    }

    public String toString() {
        return j(this.f6765a);
    }
}
