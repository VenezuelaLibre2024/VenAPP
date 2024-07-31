package hi;

/* loaded from: classes3.dex */
public final class a<T> implements bk.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f16810c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile bk.a<T> f16811a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f16812b = f16810c;

    private a(bk.a<T> aVar) {
        this.f16811a = aVar;
    }

    public static <P extends bk.a<T>, T> bk.a<T> a(P p10) {
        b.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f16810c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // bk.a
    public T get() {
        T t10 = (T) this.f16812b;
        Object obj = f16810c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f16812b;
                if (t10 == obj) {
                    t10 = this.f16811a.get();
                    this.f16812b = b(this.f16812b, t10);
                    this.f16811a = null;
                }
            }
        }
        return t10;
    }
}
