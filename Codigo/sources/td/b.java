package td;

/* loaded from: classes.dex */
public final class b<T> implements bk.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f26872c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile bk.a<T> f26873a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f26874b = f26872c;

    private b(bk.a<T> aVar) {
        this.f26873a = aVar;
    }

    public static <P extends bk.a<T>, T> bk.a<T> a(P p10) {
        d.b(p10);
        return p10 instanceof b ? p10 : new b(p10);
    }

    private static Object b(Object obj, Object obj2) {
        if (!(obj != f26872c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // bk.a
    public T get() {
        T t10 = (T) this.f26874b;
        Object obj = f26872c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f26874b;
                if (t10 == obj) {
                    t10 = this.f26873a.get();
                    this.f26874b = b(this.f26874b, t10);
                    this.f26873a = null;
                }
            }
        }
        return t10;
    }
}
