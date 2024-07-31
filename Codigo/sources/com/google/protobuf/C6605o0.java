package com.google.protobuf;

/* renamed from: com.google.protobuf.o0 */
/* loaded from: classes2.dex */
final class C6605o0 {

    /* renamed from: a */
    private static final InterfaceC6599m0 f14574a = m18977c();

    /* renamed from: b */
    private static final InterfaceC6599m0 f14575b = new C6602n0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC6599m0 m18975a() {
        return f14574a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC6599m0 m18976b() {
        return f14575b;
    }

    /* renamed from: c */
    private static InterfaceC6599m0 m18977c() {
        try {
            return (InterfaceC6599m0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
