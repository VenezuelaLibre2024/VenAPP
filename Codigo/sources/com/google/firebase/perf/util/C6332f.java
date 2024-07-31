package com.google.firebase.perf.util;

import android.os.Bundle;
import re.C10696a;

/* renamed from: com.google.firebase.perf.util.f */
/* loaded from: classes.dex */
public final class C6332f {

    /* renamed from: b */
    private static final C10696a f13600b = C10696a.m32565e();

    /* renamed from: a */
    private final Bundle f13601a;

    public C6332f() {
        this(new Bundle());
    }

    public C6332f(Bundle bundle) {
        this.f13601a = (Bundle) bundle.clone();
    }

    /* renamed from: d */
    private C6333g<Integer> m17514d(String str) {
        if (!m17515a(str)) {
            return C6333g.m17519a();
        }
        try {
            return C6333g.m17520b((Integer) this.f13601a.get(str));
        } catch (ClassCastException e10) {
            f13600b.m32567b("Metadata key %s contains type other than int: %s", str, e10.getMessage());
            return C6333g.m17519a();
        }
    }

    /* renamed from: a */
    public boolean m17515a(String str) {
        return str != null && this.f13601a.containsKey(str);
    }

    /* renamed from: b */
    public C6333g<Boolean> m17516b(String str) {
        if (!m17515a(str)) {
            return C6333g.m17519a();
        }
        try {
            return C6333g.m17520b((Boolean) this.f13601a.get(str));
        } catch (ClassCastException e10) {
            f13600b.m32567b("Metadata key %s contains type other than boolean: %s", str, e10.getMessage());
            return C6333g.m17519a();
        }
    }

    /* renamed from: c */
    public C6333g<Double> m17517c(String str) {
        Object obj;
        if (m17515a(str) && (obj = this.f13601a.get(str)) != null) {
            if (obj instanceof Float) {
                return C6333g.m17521e(Double.valueOf(((Float) obj).doubleValue()));
            }
            if (obj instanceof Double) {
                return C6333g.m17521e((Double) obj);
            }
            f13600b.m32567b("Metadata key %s contains type other than double: %s", str);
            return C6333g.m17519a();
        }
        return C6333g.m17519a();
    }

    /* renamed from: e */
    public C6333g<Long> m17518e(String str) {
        return m17514d(str).m17523d() ? C6333g.m17521e(Long.valueOf(r3.m17522c().intValue())) : C6333g.m17519a();
    }
}
