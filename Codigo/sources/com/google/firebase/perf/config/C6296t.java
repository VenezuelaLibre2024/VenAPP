package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.t */
/* loaded from: classes.dex */
public final class C6296t extends AbstractC6298v<Long> {

    /* renamed from: a */
    private static C6296t f13489a;

    private C6296t() {
    }

    /* renamed from: e */
    public static synchronized C6296t m17342e() {
        C6296t c6296t;
        synchronized (C6296t.class) {
            if (f13489a == null) {
                f13489a = new C6296t();
            }
            c6296t = f13489a;
        }
        return c6296t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_rl_trace_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m17343d() {
        return 300L;
    }
}
