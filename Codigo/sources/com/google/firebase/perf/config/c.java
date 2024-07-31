package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class c extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static c f12252a;

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized c d() {
        c cVar;
        synchronized (c.class) {
            if (f12252a == null) {
                f12252a = new c();
            }
            cVar = f12252a;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "isEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "firebase_performance_collection_enabled";
    }
}
