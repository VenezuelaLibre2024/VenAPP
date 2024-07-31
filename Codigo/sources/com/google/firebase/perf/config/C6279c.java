package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.c */
/* loaded from: classes.dex */
public final class C6279c extends AbstractC6298v<Boolean> {

    /* renamed from: a */
    private static C6279c f13471a;

    private C6279c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static synchronized C6279c m17301d() {
        C6279c c6279c;
        synchronized (C6279c.class) {
            if (f13471a == null) {
                f13471a = new C6279c();
            }
            c6279c = f13471a;
        }
        return c6279c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "isEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: b */
    public String mo17299b() {
        return "firebase_performance_collection_enabled";
    }
}
