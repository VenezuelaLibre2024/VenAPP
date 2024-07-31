package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final m0 f4228a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final m0 f4229b = new n0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 a() {
        return f4228a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 b() {
        return f4229b;
    }

    private static m0 c() {
        try {
            return (m0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
