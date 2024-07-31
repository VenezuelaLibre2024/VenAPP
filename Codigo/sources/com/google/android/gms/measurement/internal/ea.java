package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class ea implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f10161a;

    /* renamed from: b */
    private final /* synthetic */ da f10162b;

    public ea(da daVar, long j10) {
        this.f10162b = daVar;
        this.f10161a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        da.x(this.f10162b, this.f10161a);
    }
}
