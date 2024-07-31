package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
final class o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final m0 f11472a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final m0 f11473b = new n0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 a() {
        return f11472a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 b() {
        return f11473b;
    }

    private static m0 c() {
        try {
            return (m0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
