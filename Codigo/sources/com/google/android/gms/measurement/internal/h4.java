package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public final class h4<V> {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f10212h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f10213a;

    /* renamed from: b, reason: collision with root package name */
    private final g4<V> f10214b;

    /* renamed from: c, reason: collision with root package name */
    private final V f10215c;

    /* renamed from: d, reason: collision with root package name */
    private final V f10216d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f10217e;

    /* renamed from: f, reason: collision with root package name */
    private volatile V f10218f;

    /* renamed from: g, reason: collision with root package name */
    private volatile V f10219g;

    private h4(String str, V v10, V v11, g4<V> g4Var) {
        this.f10217e = new Object();
        this.f10218f = null;
        this.f10219g = null;
        this.f10213a = str;
        this.f10215c = v10;
        this.f10216d = v11;
        this.f10214b = g4Var;
    }

    public final V a(V v10) {
        synchronized (this.f10217e) {
        }
        if (v10 != null) {
            return v10;
        }
        if (f4.f10172a == null) {
            return this.f10215c;
        }
        synchronized (f10212h) {
            if (e.a()) {
                return this.f10219g == null ? this.f10215c : this.f10219g;
            }
            try {
                for (h4 h4Var : e0.z0()) {
                    if (e.a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V v11 = null;
                    try {
                        g4<V> g4Var = h4Var.f10214b;
                        if (g4Var != null) {
                            v11 = g4Var.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f10212h) {
                        h4Var.f10219g = v11;
                    }
                }
            } catch (SecurityException unused2) {
            }
            g4<V> g4Var2 = this.f10214b;
            if (g4Var2 == null) {
                return this.f10215c;
            }
            try {
                return g4Var2.zza();
            } catch (IllegalStateException unused3) {
                return this.f10215c;
            } catch (SecurityException unused4) {
                return this.f10215c;
            }
        }
    }

    public final String b() {
        return this.f10213a;
    }
}
