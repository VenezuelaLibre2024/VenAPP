package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.r */
/* loaded from: classes.dex */
public final class C6294r extends AbstractC6298v<Double> {

    /* renamed from: a */
    private static C6294r f13487a;

    private C6294r() {
    }

    /* renamed from: f */
    public static synchronized C6294r m17337f() {
        C6294r c6294r;
        synchronized (C6294r.class) {
            if (f13487a == null) {
                f13487a = new C6294r();
            }
            c6294r = f13487a;
        }
        return c6294r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: b */
    public String mo17299b() {
        return "sessions_sampling_percentage";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_vc_session_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Double m17338d() {
        return Double.valueOf(0.01d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public Double m17339e() {
        return Double.valueOf(m17338d().doubleValue() / 1000.0d);
    }
}
