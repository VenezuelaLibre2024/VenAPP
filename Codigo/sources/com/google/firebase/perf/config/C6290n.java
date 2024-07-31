package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.n */
/* loaded from: classes.dex */
public final class C6290n extends AbstractC6298v<Long> {

    /* renamed from: a */
    private static C6290n f13483a;

    private C6290n() {
    }

    /* renamed from: f */
    public static synchronized C6290n m17327f() {
        C6290n c6290n;
        synchronized (C6290n.class) {
            if (f13483a == null) {
                f13483a = new C6290n();
            }
            c6290n = f13483a;
        }
        return c6290n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: b */
    public String mo17299b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m17328d() {
        return 100L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public Long m17329e() {
        return Long.valueOf(m17328d().longValue() * 3);
    }
}
