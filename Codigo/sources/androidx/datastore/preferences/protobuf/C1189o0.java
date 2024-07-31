package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.o0 */
/* loaded from: classes.dex */
final class C1189o0 {

    /* renamed from: a */
    private static final InterfaceC1183m0 f4939a = m6254c();

    /* renamed from: b */
    private static final InterfaceC1183m0 f4940b = new C1186n0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC1183m0 m6252a() {
        return f4939a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC1183m0 m6253b() {
        return f4940b;
    }

    /* renamed from: c */
    private static InterfaceC1183m0 m6254c() {
        try {
            return (InterfaceC1183m0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
