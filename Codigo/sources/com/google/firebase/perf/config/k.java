package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class k extends v<String> {

    /* renamed from: a, reason: collision with root package name */
    private static k f12261a;

    protected k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized k e() {
        k kVar;
        synchronized (k.class) {
            if (f12261a == null) {
                f12261a = new k();
            }
            kVar = f12261a;
        }
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_disabled_android_versions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        return "";
    }
}
