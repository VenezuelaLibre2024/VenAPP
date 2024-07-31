package ck;

import java.io.Serializable;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;

/* renamed from: ck.p */
/* loaded from: classes3.dex */
final class C2031p<T> implements InterfaceC2023h<T>, Serializable {

    /* renamed from: a */
    private InterfaceC9987a<? extends T> f8081a;

    /* renamed from: b */
    private volatile Object f8082b;

    /* renamed from: c */
    private final Object f8083c;

    public C2031p(InterfaceC9987a<? extends T> initializer, Object obj) {
        C9322n.m27781e(initializer, "initializer");
        this.f8081a = initializer;
        this.f8082b = C2035t.f8088a;
        this.f8083c = obj == null ? this : obj;
    }

    public /* synthetic */ C2031p(InterfaceC9987a interfaceC9987a, Object obj, int i10, C9315g c9315g) {
        this(interfaceC9987a, (i10 & 2) != 0 ? null : obj);
    }

    private final Object writeReplace() {
        return new C2019d(getValue());
    }

    @Override // ck.InterfaceC2023h
    public T getValue() {
        T t10;
        T t11 = (T) this.f8082b;
        C2035t c2035t = C2035t.f8088a;
        if (t11 != c2035t) {
            return t11;
        }
        synchronized (this.f8083c) {
            t10 = (T) this.f8082b;
            if (t10 == c2035t) {
                InterfaceC9987a<? extends T> interfaceC9987a = this.f8081a;
                C9322n.m27778b(interfaceC9987a);
                t10 = interfaceC9987a.invoke();
                this.f8082b = t10;
                this.f8081a = null;
            }
        }
        return t10;
    }

    @Override // ck.InterfaceC2023h
    public boolean isInitialized() {
        return this.f8082b != C2035t.f8088a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
