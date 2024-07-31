package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: com.google.android.gms.measurement.internal.fa */
/* loaded from: classes2.dex */
final class RunnableC5497fa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AppMeasurementDynamiteService.C5419a f11359a;

    /* renamed from: b */
    private final /* synthetic */ AppMeasurementDynamiteService f11360b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5497fa(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.C5419a c5419a) {
        this.f11360b = appMeasurementDynamiteService;
        this.f11359a = c5419a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11360b.f11045a.m14496C().m13670Y(this.f11359a);
    }
}
