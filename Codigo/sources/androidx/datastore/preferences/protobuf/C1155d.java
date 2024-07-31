package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d */
/* loaded from: classes.dex */
final class C1155d {

    /* renamed from: a */
    private static final Class<?> f4800a = m5682a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f4801b;

    static {
        f4801b = m5682a("org.robolectric.Robolectric") != null;
    }

    /* renamed from: a */
    private static <T> Class<T> m5682a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Class<?> m5683b() {
        return f4800a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m5684c() {
        return (f4800a == null || f4801b) ? false : true;
    }
}
