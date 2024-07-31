package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final q<?> f11517a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final q<?> f11518b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q<?> a() {
        q<?> qVar = f11518b;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q<?> b() {
        return f11517a;
    }

    private static q<?> c() {
        try {
            return (q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
