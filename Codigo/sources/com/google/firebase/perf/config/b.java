package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class b extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static b f12251a;

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized b e() {
        b bVar;
        synchronized (b.class) {
            if (f12251a == null) {
                f12251a = new b();
            }
            bVar = f12251a;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "firebase_performance_collection_deactivated";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.FALSE;
    }
}
