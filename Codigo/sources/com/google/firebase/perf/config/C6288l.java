package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.l */
/* loaded from: classes.dex */
public final class C6288l extends AbstractC6298v<Boolean> {

    /* renamed from: a */
    private static C6288l f13481a;

    protected C6288l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6288l m17323e() {
        C6288l c6288l;
        synchronized (C6288l.class) {
            if (f13481a == null) {
                f13481a = new C6288l();
            }
            c6288l = f13481a;
        }
        return c6288l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_enabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean m17324d() {
        return Boolean.TRUE;
    }
}
