package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.h */
/* loaded from: classes.dex */
public final class C6284h extends AbstractC6298v<Long> {

    /* renamed from: a */
    private static C6284h f13477a;

    private C6284h() {
    }

    /* renamed from: e */
    public static synchronized C6284h m17314e() {
        C6284h c6284h;
        synchronized (C6284h.class) {
            if (f13477a == null) {
                f13477a = new C6284h();
            }
            c6284h = f13477a;
        }
        return c6284h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_rl_network_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m17315d() {
        return 700L;
    }
}
