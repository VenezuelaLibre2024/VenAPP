package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
final class y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final w0 f11571a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final w0 f11572b = new x0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w0 a() {
        return f11571a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w0 b() {
        return f11572b;
    }

    private static w0 c() {
        try {
            return (w0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
