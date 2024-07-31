package com.google.protobuf;

/* renamed from: com.google.protobuf.r */
/* loaded from: classes2.dex */
final class C6613r {

    /* renamed from: a */
    private static final AbstractC6607p<?> f14589a = new C6610q();

    /* renamed from: b */
    private static final AbstractC6607p<?> f14590b = m19031c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC6607p<?> m19029a() {
        AbstractC6607p<?> abstractC6607p = f14590b;
        if (abstractC6607p != null) {
            return abstractC6607p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC6607p<?> m19030b() {
        return f14589a;
    }

    /* renamed from: c */
    private static AbstractC6607p<?> m19031c() {
        try {
            return (AbstractC6607p) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
