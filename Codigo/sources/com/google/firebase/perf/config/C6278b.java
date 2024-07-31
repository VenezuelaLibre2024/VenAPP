package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.b */
/* loaded from: classes.dex */
public final class C6278b extends AbstractC6298v<Boolean> {

    /* renamed from: a */
    private static C6278b f13470a;

    private C6278b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6278b m17298e() {
        C6278b c6278b;
        synchronized (C6278b.class) {
            if (f13470a == null) {
                f13470a = new C6278b();
            }
            c6278b = f13470a;
        }
        return c6278b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: b */
    public String mo17299b() {
        return "firebase_performance_collection_deactivated";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean m17300d() {
        return Boolean.FALSE;
    }
}
