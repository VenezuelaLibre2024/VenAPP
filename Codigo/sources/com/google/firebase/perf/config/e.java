package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class e extends v<Double> {

    /* renamed from: a, reason: collision with root package name */
    private static e f12254a;

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized e e() {
        e eVar;
        synchronized (e.class) {
            if (f12254a == null) {
                f12254a = new e();
            }
            eVar = f12254a;
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "fragment_sampling_percentage";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Double d() {
        return Double.valueOf(0.0d);
    }
}
