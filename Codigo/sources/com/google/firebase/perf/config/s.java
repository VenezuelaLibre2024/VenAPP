package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class s extends v<Long> {

    /* renamed from: a, reason: collision with root package name */
    private static s f12269a;

    private s() {
    }

    public static synchronized s e() {
        s sVar;
        synchronized (s.class) {
            if (f12269a == null) {
                f12269a = new s();
            }
            sVar = f12269a;
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 30L;
    }
}
