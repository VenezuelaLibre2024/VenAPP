package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* renamed from: com.google.android.gms.measurement.internal.f9 */
/* loaded from: classes2.dex */
final class RunnableC5496f9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzcv f11355a;

    /* renamed from: b */
    private final /* synthetic */ String f11356b;

    /* renamed from: c */
    private final /* synthetic */ String f11357c;

    /* renamed from: d */
    private final /* synthetic */ AppMeasurementDynamiteService f11358d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5496f9(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, String str, String str2) {
        this.f11358d = appMeasurementDynamiteService;
        this.f11355a = zzcvVar;
        this.f11356b = str;
        this.f11357c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11358d.f11045a.m14498E().m14387A(this.f11355a, this.f11356b, this.f11357c);
    }
}
