package com.google.firebase.perf.util;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    private static final re.a f12368b = re.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f12369a;

    public f() {
        this(new Bundle());
    }

    public f(Bundle bundle) {
        this.f12369a = (Bundle) bundle.clone();
    }

    private g<Integer> d(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Integer) this.f12369a.get(str));
        } catch (ClassCastException e10) {
            f12368b.b("Metadata key %s contains type other than int: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public boolean a(String str) {
        return str != null && this.f12369a.containsKey(str);
    }

    public g<Boolean> b(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Boolean) this.f12369a.get(str));
        } catch (ClassCastException e10) {
            f12368b.b("Metadata key %s contains type other than boolean: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public g<Double> c(String str) {
        Object obj;
        if (a(str) && (obj = this.f12369a.get(str)) != null) {
            if (obj instanceof Float) {
                return g.e(Double.valueOf(((Float) obj).doubleValue()));
            }
            if (obj instanceof Double) {
                return g.e((Double) obj);
            }
            f12368b.b("Metadata key %s contains type other than double: %s", str);
            return g.a();
        }
        return g.a();
    }

    public g<Long> e(String str) {
        return d(str).d() ? g.e(Long.valueOf(r3.c().intValue())) : g.a();
    }
}
