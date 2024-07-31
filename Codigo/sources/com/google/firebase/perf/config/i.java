package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class i extends v<Double> {

    /* renamed from: a, reason: collision with root package name */
    private static i f12259a;

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized i f() {
        i iVar;
        synchronized (i.class) {
            if (f12259a == null) {
                f12259a = new i();
            }
            iVar = f12259a;
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Double d() {
        return Double.valueOf(1.0d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
