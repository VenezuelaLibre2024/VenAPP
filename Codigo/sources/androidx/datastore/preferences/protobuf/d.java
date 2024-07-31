package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f4089a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f4090b;

    static {
        f4090b = a("org.robolectric.Robolectric") != null;
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
        return f4089a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return (f4089a == null || f4090b) ? false : true;
    }
}
