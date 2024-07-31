package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s */
/* loaded from: classes.dex */
final class C1200s {

    /* renamed from: a */
    private static final AbstractC1194q<?> f4986a = new C1197r();

    /* renamed from: b */
    private static final AbstractC1194q<?> f4987b = m6377c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC1194q<?> m6375a() {
        AbstractC1194q<?> abstractC1194q = f4987b;
        if (abstractC1194q != null) {
            return abstractC1194q;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC1194q<?> m6376b() {
        return f4986a;
    }

    /* renamed from: c */
    private static AbstractC1194q<?> m6377c() {
        try {
            return (AbstractC1194q) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
