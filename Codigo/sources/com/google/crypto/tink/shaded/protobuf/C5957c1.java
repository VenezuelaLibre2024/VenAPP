package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.c1 */
/* loaded from: classes2.dex */
public final class C5957c1 {

    /* renamed from: c */
    private static final C5957c1 f12559c = new C5957c1();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, InterfaceC5969g1<?>> f12561b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC5972h1 f12560a = new C5977j0();

    private C5957c1() {
    }

    /* renamed from: a */
    public static C5957c1 m15338a() {
        return f12559c;
    }

    /* renamed from: b */
    public InterfaceC5969g1<?> m15339b(Class<?> cls, InterfaceC5969g1<?> interfaceC5969g1) {
        C5950a0.m15303b(cls, "messageType");
        C5950a0.m15303b(interfaceC5969g1, "schema");
        return this.f12561b.putIfAbsent(cls, interfaceC5969g1);
    }

    /* renamed from: c */
    public <T> InterfaceC5969g1<T> m15340c(Class<T> cls) {
        C5950a0.m15303b(cls, "messageType");
        InterfaceC5969g1<T> interfaceC5969g1 = (InterfaceC5969g1) this.f12561b.get(cls);
        if (interfaceC5969g1 != null) {
            return interfaceC5969g1;
        }
        InterfaceC5969g1<T> mo15521a = this.f12560a.mo15521a(cls);
        InterfaceC5969g1<T> interfaceC5969g12 = (InterfaceC5969g1<T>) m15339b(cls, mo15521a);
        return interfaceC5969g12 != null ? interfaceC5969g12 : mo15521a;
    }

    /* renamed from: d */
    public <T> InterfaceC5969g1<T> m15341d(T t10) {
        return m15340c(t10.getClass());
    }
}
