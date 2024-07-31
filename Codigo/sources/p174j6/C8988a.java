package p174j6;

import p029bk.InterfaceC1806a;

/* renamed from: j6.a */
/* loaded from: classes.dex */
public final class C8988a<T> implements InterfaceC1806a<T> {

    /* renamed from: c */
    private static final Object f21538c = new Object();

    /* renamed from: a */
    private volatile InterfaceC1806a<T> f21539a;

    /* renamed from: b */
    private volatile Object f21540b = f21538c;

    private C8988a(InterfaceC1806a<T> interfaceC1806a) {
        this.f21539a = interfaceC1806a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC1806a<T>, T> InterfaceC1806a<T> m26381a(P p10) {
        C8991d.m26385b(p10);
        return p10 instanceof C8988a ? p10 : new C8988a(p10);
    }

    /* renamed from: b */
    public static Object m26382b(Object obj, Object obj2) {
        if (!(obj != f21538c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p029bk.InterfaceC1806a
    public T get() {
        T t10 = (T) this.f21540b;
        Object obj = f21538c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f21540b;
                if (t10 == obj) {
                    t10 = this.f21539a.get();
                    this.f21540b = m26382b(this.f21540b, t10);
                    this.f21539a = null;
                }
            }
        }
        return t10;
    }
}
