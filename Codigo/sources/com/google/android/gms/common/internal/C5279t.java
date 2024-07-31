package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.t */
/* loaded from: classes.dex */
public final class C5279t {

    /* renamed from: b */
    private static C5279t f10758b;

    /* renamed from: c */
    private static final C5282u f10759c = new C5282u(0, false, false, 0, 0);

    /* renamed from: a */
    private C5282u f10760a;

    private C5279t() {
    }

    /* renamed from: b */
    public static synchronized C5279t m13341b() {
        C5279t c5279t;
        synchronized (C5279t.class) {
            if (f10758b == null) {
                f10758b = new C5279t();
            }
            c5279t = f10758b;
        }
        return c5279t;
    }

    /* renamed from: a */
    public C5282u m13342a() {
        return this.f10760a;
    }

    /* renamed from: c */
    public final synchronized void m13343c(C5282u c5282u) {
        if (c5282u == null) {
            this.f10760a = f10759c;
            return;
        }
        C5282u c5282u2 = this.f10760a;
        if (c5282u2 == null || c5282u2.m13348y1() < c5282u.m13348y1()) {
            this.f10760a = c5282u;
        }
    }
}
