package com.google.android.gms.ads.internal.util;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a */
    private long f8959a;

    /* renamed from: b */
    private long f8960b = Long.MIN_VALUE;

    /* renamed from: c */
    private final Object f8961c = new Object();

    public e1(long j10) {
        this.f8959a = j10;
    }

    public final void a(long j10) {
        synchronized (this.f8961c) {
            this.f8959a = j10;
        }
    }

    public final boolean b() {
        synchronized (this.f8961c) {
            long b10 = com.google.android.gms.ads.internal.t.b().b();
            if (this.f8960b + this.f8959a > b10) {
                return false;
            }
            this.f8960b = b10;
            return true;
        }
    }
}
