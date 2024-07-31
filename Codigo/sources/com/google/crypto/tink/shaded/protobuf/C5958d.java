package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d */
/* loaded from: classes2.dex */
final class C5958d {

    /* renamed from: a */
    private static boolean f12562a;

    /* renamed from: b */
    private static final Class<?> f12563b = m15342a("libcore.io.Memory");

    /* renamed from: c */
    private static final boolean f12564c;

    static {
        f12564c = (f12562a || m15342a("org.robolectric.Robolectric") == null) ? false : true;
    }

    /* renamed from: a */
    private static <T> Class<T> m15342a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Class<?> m15343b() {
        return f12563b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m15344c() {
        return f12562a || !(f12563b == null || f12564c);
    }
}
