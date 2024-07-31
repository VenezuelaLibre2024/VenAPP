package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.s */
/* loaded from: classes2.dex */
final class C6003s {

    /* renamed from: a */
    private static final AbstractC5997q<?> f12732a = new C6000r();

    /* renamed from: b */
    private static final AbstractC5997q<?> f12733b = m16042c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC5997q<?> m16040a() {
        AbstractC5997q<?> abstractC5997q = f12733b;
        if (abstractC5997q != null) {
            return abstractC5997q;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC5997q<?> m16041b() {
        return f12732a;
    }

    /* renamed from: c */
    private static AbstractC5997q<?> m16042c() {
        try {
            return (AbstractC5997q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
