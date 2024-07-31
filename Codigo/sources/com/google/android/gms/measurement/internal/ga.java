package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class ga implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f10206a;

    /* renamed from: b */
    private final /* synthetic */ da f10207b;

    public ga(da daVar, long j10) {
        this.f10207b = daVar;
        this.f10206a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        da.D(this.f10207b, this.f10206a);
    }
}
