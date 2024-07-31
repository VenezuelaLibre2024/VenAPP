package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.n */
/* loaded from: classes2.dex */
public final class C6601n {

    /* renamed from: a */
    static final Class<?> f14567a = m18950c();

    /* renamed from: a */
    public static C6604o m18948a() {
        C6604o m18949b = m18949b("getEmptyRegistry");
        return m18949b != null ? m18949b : C6604o.f14570d;
    }

    /* renamed from: b */
    private static final C6604o m18949b(String str) {
        Class<?> cls = f14567a;
        if (cls == null) {
            return null;
        }
        try {
            return (C6604o) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Class<?> m18950c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
