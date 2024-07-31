package rd;

/* loaded from: classes.dex */
public final class a<T> implements bk.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f24935c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile bk.a<T> f24936a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f24937b = f24935c;

    private a(bk.a<T> aVar) {
        this.f24936a = aVar;
    }

    public static <P extends bk.a<T>, T> bk.a<T> a(P p10) {
        d.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    private static Object b(Object obj, Object obj2) {
        if (!(obj != f24935c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // bk.a
    public T get() {
        T t10 = (T) this.f24937b;
        Object obj = f24935c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f24937b;
                if (t10 == obj) {
                    t10 = this.f24936a.get();
                    this.f24937b = b(this.f24937b, t10);
                    this.f24936a = null;
                }
            }
        }
        return t10;
    }
}
