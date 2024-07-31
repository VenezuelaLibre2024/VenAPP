package androidx.datastore.preferences.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.datastore.preferences.protobuf.o */
/* loaded from: classes.dex */
public final class C1188o {

    /* renamed from: a */
    static final Class<?> f4938a = m6251c();

    /* renamed from: a */
    public static C1191p m6249a() {
        if (f4938a != null) {
            try {
                return m6250b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C1191p.f4950e;
    }

    /* renamed from: b */
    private static final C1191p m6250b(String str) {
        return (C1191p) f4938a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: c */
    static Class<?> m6251c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
