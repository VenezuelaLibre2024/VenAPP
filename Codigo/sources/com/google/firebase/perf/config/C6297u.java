package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.u */
/* loaded from: classes.dex */
public final class C6297u extends AbstractC6298v<Double> {

    /* renamed from: a */
    private static C6297u f13490a;

    private C6297u() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public static synchronized C6297u m17344f() {
        C6297u c6297u;
        synchronized (C6297u.class) {
            if (f13490a == null) {
                f13490a = new C6297u();
            }
            c6297u = f13490a;
        }
        return c6297u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_vc_trace_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Double m17345d() {
        return Double.valueOf(1.0d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public Double m17346e() {
        return Double.valueOf(m17345d().doubleValue() / 1000.0d);
    }
}
