package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.datastore.preferences.protobuf.c1 */
/* loaded from: classes.dex */
public final class C1154c1 {

    /* renamed from: c */
    private static final C1154c1 f4797c = new C1154c1();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, InterfaceC1166g1<?>> f4799b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC1169h1 f4798a = new C1174j0();

    private C1154c1() {
    }

    /* renamed from: a */
    public static C1154c1 m5677a() {
        return f4797c;
    }

    /* renamed from: b */
    public <T> void m5678b(T t10, InterfaceC1163f1 interfaceC1163f1, C1191p c1191p) {
        m5681e(t10).mo5799h(t10, interfaceC1163f1, c1191p);
    }

    /* renamed from: c */
    public InterfaceC1166g1<?> m5679c(Class<?> cls, InterfaceC1166g1<?> interfaceC1166g1) {
        C1147a0.m5644b(cls, "messageType");
        C1147a0.m5644b(interfaceC1166g1, "schema");
        return this.f4799b.putIfAbsent(cls, interfaceC1166g1);
    }

    /* renamed from: d */
    public <T> InterfaceC1166g1<T> m5680d(Class<T> cls) {
        C1147a0.m5644b(cls, "messageType");
        InterfaceC1166g1<T> interfaceC1166g1 = (InterfaceC1166g1) this.f4799b.get(cls);
        if (interfaceC1166g1 != null) {
            return interfaceC1166g1;
        }
        InterfaceC1166g1<T> mo5841a = this.f4798a.mo5841a(cls);
        InterfaceC1166g1<T> interfaceC1166g12 = (InterfaceC1166g1<T>) m5679c(cls, mo5841a);
        return interfaceC1166g12 != null ? interfaceC1166g12 : mo5841a;
    }

    /* renamed from: e */
    public <T> InterfaceC1166g1<T> m5681e(T t10) {
        return m5680d(t10.getClass());
    }
}
