package p334rd;

import p029bk.InterfaceC1806a;

/* renamed from: rd.a */
/* loaded from: classes.dex */
public final class C10692a<T> implements InterfaceC1806a<T> {

    /* renamed from: c */
    private static final Object f27051c = new Object();

    /* renamed from: a */
    private volatile InterfaceC1806a<T> f27052a;

    /* renamed from: b */
    private volatile Object f27053b = f27051c;

    private C10692a(InterfaceC1806a<T> interfaceC1806a) {
        this.f27052a = interfaceC1806a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC1806a<T>, T> InterfaceC1806a<T> m32557a(P p10) {
        C10695d.m32561b(p10);
        return p10 instanceof C10692a ? p10 : new C10692a(p10);
    }

    /* renamed from: b */
    private static Object m32558b(Object obj, Object obj2) {
        if (!(obj != f27051c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p029bk.InterfaceC1806a
    public T get() {
        T t10 = (T) this.f27053b;
        Object obj = f27051c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f27053b;
                if (t10 == obj) {
                    t10 = this.f27052a.get();
                    this.f27053b = m32558b(this.f27053b, t10);
                    this.f27052a = null;
                }
            }
        }
        return t10;
    }
}
