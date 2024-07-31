package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.g */
/* loaded from: classes.dex */
public final class C6283g extends AbstractC6298v<Long> {

    /* renamed from: a */
    private static C6283g f13476a;

    private C6283g() {
    }

    /* renamed from: e */
    public static synchronized C6283g m17312e() {
        C6283g c6283g;
        synchronized (C6283g.class) {
            if (f13476a == null) {
                f13476a = new C6283g();
            }
            c6283g = f13476a;
        }
        return c6283g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_rl_network_event_count_bg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m17313d() {
        return 70L;
    }
}
