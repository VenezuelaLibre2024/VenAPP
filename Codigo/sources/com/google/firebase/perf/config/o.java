package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class o extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static o f12265a;

    private o() {
    }

    public static synchronized o e() {
        o oVar;
        synchronized (o.class) {
            if (f12265a == null) {
                f12265a = new o();
            }
            oVar = f12265a;
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_max_length_minutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_session_max_duration_min";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 240L;
    }
}
