package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f11347a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f11348b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f11349c;

    static {
        f11349c = (f11347a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> b() {
        return f11348b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return f11347a || !(f11348b == null || f11349c);
    }
}
