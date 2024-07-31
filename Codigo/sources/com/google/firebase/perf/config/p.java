package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class p extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static p f12266a;

    private p() {
    }

    public static synchronized p e() {
        p pVar;
        synchronized (p.class) {
            if (f12266a == null) {
                f12266a = new p();
            }
            pVar = f12266a;
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 0L;
    }
}
