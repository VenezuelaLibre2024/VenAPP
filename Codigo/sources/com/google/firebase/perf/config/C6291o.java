package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.o */
/* loaded from: classes.dex */
public final class C6291o extends AbstractC6298v<Long> {

    /* renamed from: a */
    private static C6291o f13484a;

    private C6291o() {
    }

    /* renamed from: e */
    public static synchronized C6291o m17330e() {
        C6291o c6291o;
        synchronized (C6291o.class) {
            if (f13484a == null) {
                f13484a = new C6291o();
            }
            c6291o = f13484a;
        }
        return c6291o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: b */
    public String mo17299b() {
        return "sessions_max_length_minutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_session_max_duration_min";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m17331d() {
        return 240L;
    }
}
