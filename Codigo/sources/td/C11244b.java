package td;

import p029bk.InterfaceC1806a;

/* renamed from: td.b */
/* loaded from: classes.dex */
public final class C11244b<T> implements InterfaceC1806a<T> {

    /* renamed from: c */
    private static final Object f29168c = new Object();

    /* renamed from: a */
    private volatile InterfaceC1806a<T> f29169a;

    /* renamed from: b */
    private volatile Object f29170b = f29168c;

    private C11244b(InterfaceC1806a<T> interfaceC1806a) {
        this.f29169a = interfaceC1806a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC1806a<T>, T> InterfaceC1806a<T> m35124a(P p10) {
        C11246d.m35130b(p10);
        return p10 instanceof C11244b ? p10 : new C11244b(p10);
    }

    /* renamed from: b */
    private static Object m35125b(Object obj, Object obj2) {
        if (!(obj != f29168c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p029bk.InterfaceC1806a
    public T get() {
        T t10 = (T) this.f29170b;
        Object obj = f29168c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f29170b;
                if (t10 == obj) {
                    t10 = this.f29169a.get();
                    this.f29170b = m35125b(this.f29170b, t10);
                    this.f29169a = null;
                }
            }
        }
        return t10;
    }
}
