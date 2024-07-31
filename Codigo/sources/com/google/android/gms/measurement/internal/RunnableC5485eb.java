package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* renamed from: com.google.android.gms.measurement.internal.eb */
/* loaded from: classes2.dex */
final class RunnableC5485eb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzcv f11335a;

    /* renamed from: b */
    private final /* synthetic */ AppMeasurementDynamiteService f11336b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5485eb(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar) {
        this.f11336b = appMeasurementDynamiteService;
        this.f11335a = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11336b.f11045a.m14500G().m14024O(this.f11335a, this.f11336b.f11045a.m14511j());
    }
}
