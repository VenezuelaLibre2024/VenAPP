package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.y0 */
/* loaded from: classes.dex */
final class C1216y0 {

    /* renamed from: a */
    private static final InterfaceC1212w0 f5039a = m6580c();

    /* renamed from: b */
    private static final InterfaceC1212w0 f5040b = new C1214x0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC1212w0 m6578a() {
        return f5039a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC1212w0 m6579b() {
        return f5040b;
    }

    /* renamed from: c */
    private static InterfaceC1212w0 m6580c() {
        try {
            return (InterfaceC1212w0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
