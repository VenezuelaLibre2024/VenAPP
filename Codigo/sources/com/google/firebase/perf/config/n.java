package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class n extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static n f12264a;

    private n() {
    }

    public static synchronized n f() {
        n nVar;
        synchronized (n.class) {
            if (f12264a == null) {
                f12264a = new n();
            }
            nVar = f12264a;
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 100L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long e() {
        return Long.valueOf(d().longValue() * 3);
    }
}
