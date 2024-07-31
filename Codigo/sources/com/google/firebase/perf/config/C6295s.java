package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.s */
/* loaded from: classes.dex */
public final class C6295s extends AbstractC6298v<Long> {

    /* renamed from: a */
    private static C6295s f13488a;

    private C6295s() {
    }

    /* renamed from: e */
    public static synchronized C6295s m17340e() {
        C6295s c6295s;
        synchronized (C6295s.class) {
            if (f13488a == null) {
                f13488a = new C6295s();
            }
            c6295s = f13488a;
        }
        return c6295s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_rl_trace_event_count_bg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m17341d() {
        return 30L;
    }
}
