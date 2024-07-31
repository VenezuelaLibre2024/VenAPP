package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final q<?> f4275a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final q<?> f4276b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q<?> a() {
        q<?> qVar = f4276b;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q<?> b() {
        return f4275a;
    }

    private static q<?> c() {
        try {
            return (q) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
