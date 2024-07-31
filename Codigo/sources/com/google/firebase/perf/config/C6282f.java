package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p274oe.C9929a;

/* renamed from: com.google.firebase.perf.config.f */
/* loaded from: classes.dex */
public final class C6282f extends AbstractC6298v<String> {

    /* renamed from: a */
    private static C6282f f13474a;

    /* renamed from: b */
    private static final Map<Long, String> f13475b = Collections.unmodifiableMap(new a());

    /* renamed from: com.google.firebase.perf.config.f$a */
    /* loaded from: classes.dex */
    class a extends HashMap<Long, String> {
        a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private C6282f() {
    }

    /* renamed from: e */
    public static synchronized C6282f m17308e() {
        C6282f c6282f;
        synchronized (C6282f.class) {
            if (f13474a == null) {
                f13474a = new C6282f();
            }
            c6282f = f13474a;
        }
        return c6282f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public static String m17309f(long j10) {
        return f13475b.get(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public static boolean m17310g(long j10) {
        return f13475b.containsKey(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: a */
    public String mo17302a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6298v
    /* renamed from: c */
    public String mo17304c() {
        return "fpr_log_source";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public String m17311d() {
        return C9929a.f24453c;
    }
}
