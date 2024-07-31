package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.c1 */
/* loaded from: classes2.dex */
public final class C6570c1 {

    /* renamed from: c */
    private static final C6570c1 f14432c = new C6570c1();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, InterfaceC6582g1<?>> f14434b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC6585h1 f14433a = new C6590j0();

    private C6570c1() {
    }

    /* renamed from: a */
    public static C6570c1 m18416a() {
        return f14432c;
    }

    /* renamed from: b */
    public InterfaceC6582g1<?> m18417b(Class<?> cls, InterfaceC6582g1<?> interfaceC6582g1) {
        C6633z.m19348b(cls, "messageType");
        C6633z.m19348b(interfaceC6582g1, "schema");
        return this.f14434b.putIfAbsent(cls, interfaceC6582g1);
    }

    /* renamed from: c */
    public <T> InterfaceC6582g1<T> m18418c(Class<T> cls) {
        C6633z.m19348b(cls, "messageType");
        InterfaceC6582g1<T> interfaceC6582g1 = (InterfaceC6582g1) this.f14434b.get(cls);
        if (interfaceC6582g1 != null) {
            return interfaceC6582g1;
        }
        InterfaceC6582g1<T> mo18624a = this.f14433a.mo18624a(cls);
        InterfaceC6582g1<T> interfaceC6582g12 = (InterfaceC6582g1<T>) m18417b(cls, mo18624a);
        return interfaceC6582g12 != null ? interfaceC6582g12 : mo18624a;
    }

    /* renamed from: d */
    public <T> InterfaceC6582g1<T> m18419d(T t10) {
        return m18418c(t10.getClass());
    }
}
