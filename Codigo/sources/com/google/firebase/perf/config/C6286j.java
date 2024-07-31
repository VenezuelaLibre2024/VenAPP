package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.j */
/* loaded from: classes.dex */
public final class C6286j extends AbstractC6298v<Long> {

    /* renamed from: a */
    private static C6286j f13479a;

    private C6286j() {
    }

    /* renamed from: e */
    public static synchronized C6286j m17319e() {
        C6286j c6286j;
        synchronized (C6286j.class) {
            if (f13479a == null) {
                f13479a = new C6286j();
            }
            c6286j = f13479a;
        }
        return c6286j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_rl_time_limit_sec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m17320d() {
        return 600L;
    }
}
