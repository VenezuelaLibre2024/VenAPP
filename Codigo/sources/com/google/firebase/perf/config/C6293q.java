package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.q */
/* loaded from: classes.dex */
public final class C6293q extends AbstractC6298v<Long> {

    /* renamed from: a */
    private static C6293q f13486a;

    private C6293q() {
    }

    /* renamed from: f */
    public static synchronized C6293q m17334f() {
        C6293q c6293q;
        synchronized (C6293q.class) {
            if (f13486a == null) {
                f13486a = new C6293q();
            }
            c6293q = f13486a;
        }
        return c6293q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: b */
    public String mo17299b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m17335d() {
        return 100L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public Long m17336e() {
        return Long.valueOf(m17335d().longValue() * 3);
    }
}
