package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes2.dex */
final class fa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AppMeasurementDynamiteService.a f10187a;

    /* renamed from: b */
    private final /* synthetic */ AppMeasurementDynamiteService f10188b;

    public fa(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f10188b = appMeasurementDynamiteService;
        this.f10187a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10188b.f9925a.C().Y(this.f10187a);
    }
}
