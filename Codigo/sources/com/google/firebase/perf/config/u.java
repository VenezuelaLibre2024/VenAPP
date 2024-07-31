package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class u extends v<Double> {

    /* renamed from: a, reason: collision with root package name */
    private static u f12271a;

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized u f() {
        u uVar;
        synchronized (u.class) {
            if (f12271a == null) {
                f12271a = new u();
            }
            uVar = f12271a;
        }
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_vc_trace_sampling_rate";
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
