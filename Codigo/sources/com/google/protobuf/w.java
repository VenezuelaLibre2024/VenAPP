package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class w implements q0 {

    /* renamed from: a */
    private static final w f13382a = new w();

    private w() {
    }

    public static w c() {
        return f13382a;
    }

    @Override // com.google.protobuf.q0
    public p0 a(Class<?> cls) {
        if (!x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (p0) x.H(cls.asSubclass(x.class)).v();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.protobuf.q0
    public boolean b(Class<?> cls) {
        return x.class.isAssignableFrom(cls);
    }
}
