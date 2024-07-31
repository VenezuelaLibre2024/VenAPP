package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.x */
/* loaded from: classes2.dex */
class C6016x implements InterfaceC5998q0 {

    /* renamed from: a */
    private static final C6016x f12775a = new C6016x();

    private C6016x() {
    }

    /* renamed from: c */
    public static C6016x m16218c() {
        return f12775a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5998q0
    /* renamed from: a */
    public InterfaceC5995p0 mo15671a(Class<?> cls) {
        if (!AbstractC6018y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC5995p0) AbstractC6018y.m16233z(cls.asSubclass(AbstractC6018y.class)).m16244o();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5998q0
    /* renamed from: b */
    public boolean mo15672b(Class<?> cls) {
        return AbstractC6018y.class.isAssignableFrom(cls);
    }
}
