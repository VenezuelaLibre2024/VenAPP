package com.google.protobuf;

/* renamed from: com.google.protobuf.w */
/* loaded from: classes2.dex */
class C6627w implements InterfaceC6611q0 {

    /* renamed from: a */
    private static final C6627w f14656a = new C6627w();

    private C6627w() {
    }

    /* renamed from: c */
    public static C6627w m19280c() {
        return f14656a;
    }

    @Override // com.google.protobuf.InterfaceC6611q0
    /* renamed from: a */
    public InterfaceC6608p0 mo18826a(Class<?> cls) {
        if (!AbstractC6629x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC6608p0) AbstractC6629x.m19284H(cls.asSubclass(AbstractC6629x.class)).m19308v();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.protobuf.InterfaceC6611q0
    /* renamed from: b */
    public boolean mo18827b(Class<?> cls) {
        return AbstractC6629x.class.isAssignableFrom(cls);
    }
}
