package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.m */
/* loaded from: classes.dex */
public final class C6289m extends AbstractC6298v<Long> {

    /* renamed from: a */
    private static C6289m f13482a;

    private C6289m() {
    }

    /* renamed from: e */
    public static synchronized C6289m m17325e() {
        C6289m c6289m;
        synchronized (C6289m.class) {
            if (f13482a == null) {
                f13482a = new C6289m();
            }
            c6289m = f13482a;
        }
        return c6289m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: b */
    public String mo17299b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m17326d() {
        return 0L;
    }
}
