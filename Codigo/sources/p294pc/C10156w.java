package p294pc;

import ee.InterfaceC7183b;

/* renamed from: pc.w */
/* loaded from: classes.dex */
public class C10156w<T> implements InterfaceC7183b<T> {

    /* renamed from: c */
    private static final Object f24961c = new Object();

    /* renamed from: a */
    private volatile Object f24962a = f24961c;

    /* renamed from: b */
    private volatile InterfaceC7183b<T> f24963b;

    public C10156w(InterfaceC7183b<T> interfaceC7183b) {
        this.f24963b = interfaceC7183b;
    }

    @Override // ee.InterfaceC7183b
    public T get() {
        T t10 = (T) this.f24962a;
        Object obj = f24961c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f24962a;
                if (t10 == obj) {
                    t10 = this.f24963b.get();
                    this.f24962a = t10;
                    this.f24963b = null;
                }
            }
        }
        return t10;
    }
}
