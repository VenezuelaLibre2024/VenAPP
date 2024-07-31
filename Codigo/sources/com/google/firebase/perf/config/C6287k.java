package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.k */
/* loaded from: classes.dex */
public final class C6287k extends AbstractC6298v<String> {

    /* renamed from: a */
    private static C6287k f13480a;

    protected C6287k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6287k m17321e() {
        C6287k c6287k;
        synchronized (C6287k.class) {
            if (f13480a == null) {
                f13480a = new C6287k();
            }
            c6287k = f13480a;
        }
        return c6287k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_disabled_android_versions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public String m17322d() {
        return "";
    }
}
