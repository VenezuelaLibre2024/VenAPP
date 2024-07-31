package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o */
/* loaded from: classes2.dex */
final class C5991o {

    /* renamed from: a */
    static final Class<?> f12686a = m15910c();

    /* renamed from: a */
    public static C5994p m15908a() {
        C5994p m15909b = m15909b("getEmptyRegistry");
        return m15909b != null ? m15909b : C5994p.f12697d;
    }

    /* renamed from: b */
    private static final C5994p m15909b(String str) {
        Class<?> cls = f12686a;
        if (cls == null) {
            return null;
        }
        try {
            return (C5994p) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Class<?> m15910c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
