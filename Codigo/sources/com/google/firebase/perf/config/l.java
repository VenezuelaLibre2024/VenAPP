package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class l extends v<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static l f12262a;

    protected l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized l e() {
        l lVar;
        synchronized (l.class) {
            if (f12262a == null) {
                f12262a = new l();
            }
            lVar = f12262a;
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_enabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.TRUE;
    }
}
