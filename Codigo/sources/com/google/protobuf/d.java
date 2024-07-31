package com.google.protobuf;

/* loaded from: classes2.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f13161a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f13162b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13163c;

    static {
        f13163c = (f13161a || a("org.robolectric.Robolectric") == null) ? false : true;
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
        return f13162b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return f13161a || !(f13162b == null || f13163c);
    }
}
