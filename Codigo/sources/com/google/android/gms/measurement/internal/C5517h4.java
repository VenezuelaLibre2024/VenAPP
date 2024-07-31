package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h4 */
/* loaded from: classes2.dex */
public final class C5517h4<V> {

    /* renamed from: h */
    private static final Object f11384h = new Object();

    /* renamed from: a */
    private final String f11385a;

    /* renamed from: b */
    private final InterfaceC5504g4<V> f11386b;

    /* renamed from: c */
    private final V f11387c;

    /* renamed from: d */
    private final V f11388d;

    /* renamed from: e */
    private final Object f11389e;

    /* renamed from: f */
    private volatile V f11390f;

    /* renamed from: g */
    private volatile V f11391g;

    private C5517h4(String str, V v10, V v11, InterfaceC5504g4<V> interfaceC5504g4) {
        this.f11389e = new Object();
        this.f11390f = null;
        this.f11391g = null;
        this.f11385a = str;
        this.f11387c = v10;
        this.f11388d = v11;
        this.f11386b = interfaceC5504g4;
    }

    /* renamed from: a */
    public final V m13918a(V v10) {
        synchronized (this.f11389e) {
        }
        if (v10 != null) {
            return v10;
        }
        if (C5491f4.f11344a == null) {
            return this.f11387c;
        }
        synchronized (f11384h) {
            if (C5473e.m13775a()) {
                return this.f11391g == null ? this.f11387c : this.f11391g;
            }
            try {
                for (C5517h4 c5517h4 : C5474e0.m13876z0()) {
                    if (C5473e.m13775a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V v11 = null;
                    try {
                        InterfaceC5504g4<V> interfaceC5504g4 = c5517h4.f11386b;
                        if (interfaceC5504g4 != null) {
                            v11 = interfaceC5504g4.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f11384h) {
                        c5517h4.f11391g = v11;
                    }
                }
            } catch (SecurityException unused2) {
            }
            InterfaceC5504g4<V> interfaceC5504g42 = this.f11386b;
            if (interfaceC5504g42 == null) {
                return this.f11387c;
            }
            try {
                return interfaceC5504g42.zza();
            } catch (IllegalStateException unused3) {
                return this.f11387c;
            } catch (SecurityException unused4) {
                return this.f11387c;
            }
        }
    }

    /* renamed from: b */
    public final String m13919b() {
        return this.f11385a;
    }
}
