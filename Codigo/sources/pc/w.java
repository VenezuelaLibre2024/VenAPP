package pc;

/* loaded from: classes.dex */
public class w<T> implements ee.b<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f23028c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f23029a = f23028c;

    /* renamed from: b, reason: collision with root package name */
    private volatile ee.b<T> f23030b;

    public w(ee.b<T> bVar) {
        this.f23030b = bVar;
    }

    @Override // ee.b
    public T get() {
        T t10 = (T) this.f23029a;
        Object obj = f23028c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f23029a;
                if (t10 == obj) {
                    t10 = this.f23030b.get();
                    this.f23029a = t10;
                    this.f23030b = null;
                }
            }
        }
        return t10;
    }
}
