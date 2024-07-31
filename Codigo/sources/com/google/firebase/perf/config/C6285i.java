package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.i */
/* loaded from: classes.dex */
public final class C6285i extends AbstractC6298v<Double> {

    /* renamed from: a */
    private static C6285i f13478a;

    private C6285i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public static synchronized C6285i m17316f() {
        C6285i c6285i;
        synchronized (C6285i.class) {
            if (f13478a == null) {
                f13478a = new C6285i();
            }
            c6285i = f13478a;
        }
        return c6285i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Double m17317d() {
        return Double.valueOf(1.0d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public Double m17318e() {
        return Double.valueOf(m17317d().doubleValue() / 1000.0d);
    }
}
