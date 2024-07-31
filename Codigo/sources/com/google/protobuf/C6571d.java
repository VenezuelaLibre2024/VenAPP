package com.google.protobuf;

/* renamed from: com.google.protobuf.d */
/* loaded from: classes2.dex */
final class C6571d {

    /* renamed from: a */
    private static boolean f14435a;

    /* renamed from: b */
    private static final Class<?> f14436b = m18420a("libcore.io.Memory");

    /* renamed from: c */
    private static final boolean f14437c;

    static {
        f14437c = (f14435a || m18420a("org.robolectric.Robolectric") == null) ? false : true;
    }

    /* renamed from: a */
    private static <T> Class<T> m18420a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Class<?> m18421b() {
        return f14436b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m18422c() {
        return f14435a || !(f14436b == null || f14437c);
    }
}
