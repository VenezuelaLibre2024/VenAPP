package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o0 */
/* loaded from: classes2.dex */
final class C5992o0 {

    /* renamed from: a */
    private static final InterfaceC5986m0 f12687a = m15913c();

    /* renamed from: b */
    private static final InterfaceC5986m0 f12688b = new C5989n0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC5986m0 m15911a() {
        return f12687a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC5986m0 m15912b() {
        return f12688b;
    }

    /* renamed from: c */
    private static InterfaceC5986m0 m15913c() {
        try {
            return (InterfaceC5986m0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
