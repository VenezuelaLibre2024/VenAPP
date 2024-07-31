package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.d */
/* loaded from: classes.dex */
public final class C6280d extends AbstractC6298v<Boolean> {

    /* renamed from: a */
    private static C6280d f13472a;

    private C6280d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6280d m17303e() {
        C6280d c6280d;
        synchronized (C6280d.class) {
            if (f13472a == null) {
                f13472a = new C6280d();
            }
            c6280d = f13472a;
        }
        return c6280d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: b */
    public String mo17299b() {
        return "experiment_app_start_ttid";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_experiment_app_start_ttid";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean m17305d() {
        return Boolean.FALSE;
    }
}
