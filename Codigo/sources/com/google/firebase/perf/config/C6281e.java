package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.e */
/* loaded from: classes.dex */
public final class C6281e extends AbstractC6298v<Double> {

    /* renamed from: a */
    private static C6281e f13473a;

    private C6281e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6281e m17306e() {
        C6281e c6281e;
        synchronized (C6281e.class) {
            if (f13473a == null) {
                f13473a = new C6281e();
            }
            c6281e = f13473a;
        }
        return c6281e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: b */
    public String mo17299b() {
        return "fragment_sampling_percentage";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Double m17307d() {
        return Double.valueOf(0.0d);
    }
}
