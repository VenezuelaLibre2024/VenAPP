package com.google.protobuf;

/* renamed from: com.google.protobuf.y0 */
/* loaded from: classes2.dex */
final class C6632y0 {

    /* renamed from: a */
    private static final InterfaceC6628w0 f14670a = m19346c();

    /* renamed from: b */
    private static final InterfaceC6628w0 f14671b = new C6630x0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC6628w0 m19344a() {
        return f14670a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC6628w0 m19345b() {
        return f14671b;
    }

    /* renamed from: c */
    private static InterfaceC6628w0 m19346c() {
        try {
            return (InterfaceC6628w0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
