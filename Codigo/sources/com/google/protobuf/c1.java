package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: c */
    private static final c1 f13158c = new c1();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, g1<?>> f13160b = new ConcurrentHashMap();

    /* renamed from: a */
    private final h1 f13159a = new j0();

    private c1() {
    }

    public static c1 a() {
        return f13158c;
    }

    public g1<?> b(Class<?> cls, g1<?> g1Var) {
        z.b(cls, "messageType");
        z.b(g1Var, "schema");
        return this.f13160b.putIfAbsent(cls, g1Var);
    }

    public <T> g1<T> c(Class<T> cls) {
        z.b(cls, "messageType");
        g1<T> g1Var = (g1) this.f13160b.get(cls);
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> a10 = this.f13159a.a(cls);
        g1<T> g1Var2 = (g1<T>) b(cls, a10);
        return g1Var2 != null ? g1Var2 : a10;
    }

    public <T> g1<T> d(T t10) {
        return c(t10.getClass());
    }
}
