package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.p */
/* loaded from: classes.dex */
public final class C6292p extends AbstractC6298v<Long> {

    /* renamed from: a */
    private static C6292p f13485a;

    private C6292p() {
    }

    /* renamed from: e */
    public static synchronized C6292p m17332e() {
        C6292p c6292p;
        synchronized (C6292p.class) {
            if (f13485a == null) {
                f13485a = new C6292p();
            }
            c6292p = f13485a;
        }
        return c6292p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: b */
    public String mo17299b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m17333d() {
        return 0L;
    }
}
