package com.google.protobuf;

/* loaded from: classes2.dex */
final class o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final m0 f13300a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final m0 f13301b = new n0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 a() {
        return f13300a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 b() {
        return f13301b;
    }

    private static m0 c() {
        try {
            return (m0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
