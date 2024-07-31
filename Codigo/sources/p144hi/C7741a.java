package p144hi;

import p029bk.InterfaceC1806a;

/* renamed from: hi.a */
/* loaded from: classes3.dex */
public final class C7741a<T> implements InterfaceC1806a<T> {

    /* renamed from: c */
    private static final Object f18460c = new Object();

    /* renamed from: a */
    private volatile InterfaceC1806a<T> f18461a;

    /* renamed from: b */
    private volatile Object f18462b = f18460c;

    private C7741a(InterfaceC1806a<T> interfaceC1806a) {
        this.f18461a = interfaceC1806a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC1806a<T>, T> InterfaceC1806a<T> m23636a(P p10) {
        C7742b.m23639b(p10);
        return p10 instanceof C7741a ? p10 : new C7741a(p10);
    }

    /* renamed from: b */
    public static Object m23637b(Object obj, Object obj2) {
        if (!(obj != f18460c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p029bk.InterfaceC1806a
    public T get() {
        T t10 = (T) this.f18462b;
        Object obj = f18460c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f18462b;
                if (t10 == obj) {
                    t10 = this.f18461a.get();
                    this.f18462b = m23637b(this.f18462b, t10);
                    this.f18461a = null;
                }
            }
        }
        return t10;
    }
}
