package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
class x implements q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final x f11560a = new x();

    private x() {
    }

    public static x c() {
        return f11560a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public p0 a(Class<?> cls) {
        if (!y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (p0) y.z(cls.asSubclass(y.class)).o();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public boolean b(Class<?> cls) {
        return y.class.isAssignableFrom(cls);
    }
}
