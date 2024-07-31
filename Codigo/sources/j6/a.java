package j6;

/* loaded from: classes.dex */
public final class a<T> implements bk.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f19759c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile bk.a<T> f19760a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f19761b = f19759c;

    private a(bk.a<T> aVar) {
        this.f19760a = aVar;
    }

    public static <P extends bk.a<T>, T> bk.a<T> a(P p10) {
        d.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f19759c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // bk.a
    public T get() {
        T t10 = (T) this.f19761b;
        Object obj = f19759c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f19761b;
                if (t10 == obj) {
                    t10 = this.f19760a.get();
                    this.f19761b = b(this.f19761b, t10);
                    this.f19760a = null;
                }
            }
        }
        return t10;
    }
}
