package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* loaded from: classes2.dex */
final class eb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzcv f10163a;

    /* renamed from: b */
    private final /* synthetic */ AppMeasurementDynamiteService f10164b;

    public eb(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar) {
        this.f10164b = appMeasurementDynamiteService;
        this.f10163a = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10164b.f9925a.G().O(this.f10163a, this.f10164b.f9925a.j());
    }
}
