package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a */
    static final Class<?> f11471a = c();

    public static p a() {
        p b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : p.f11482d;
    }

    private static final p b(String str) {
        Class<?> cls = f11471a;
        if (cls == null) {
            return null;
        }
        try {
            return (p) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
