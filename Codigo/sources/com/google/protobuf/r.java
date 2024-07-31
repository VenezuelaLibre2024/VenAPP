package com.google.protobuf;

/* loaded from: classes2.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final p<?> f13315a = new q();

    /* renamed from: b, reason: collision with root package name */
    private static final p<?> f13316b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p<?> a() {
        p<?> pVar = f13316b;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p<?> b() {
        return f13315a;
    }

    private static p<?> c() {
        try {
            return (p) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
