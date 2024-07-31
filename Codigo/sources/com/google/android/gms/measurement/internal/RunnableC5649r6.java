package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* renamed from: com.google.android.gms.measurement.internal.r6 */
/* loaded from: classes2.dex */
final class RunnableC5649r6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzcv f11797a;

    /* renamed from: b */
    private final /* synthetic */ AppMeasurementDynamiteService f11798b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5649r6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar) {
        this.f11798b = appMeasurementDynamiteService;
        this.f11797a = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11798b.f11045a.m14498E().m14411y(this.f11797a);
    }
}
