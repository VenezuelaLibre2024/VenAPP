package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* loaded from: classes2.dex */
final class r6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ zzcv f10599a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10600b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar) {
        this.f10600b = appMeasurementDynamiteService;
        this.f10599a = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10600b.f9925a.E().y(this.f10599a);
    }
}
