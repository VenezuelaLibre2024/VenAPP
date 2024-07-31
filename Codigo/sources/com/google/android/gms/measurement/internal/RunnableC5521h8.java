package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
/* loaded from: classes2.dex */
final class RunnableC5521h8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzcv f11400a;

    /* renamed from: b */
    private final /* synthetic */ C5461d0 f11401b;

    /* renamed from: c */
    private final /* synthetic */ String f11402c;

    /* renamed from: d */
    private final /* synthetic */ AppMeasurementDynamiteService f11403d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5521h8(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, C5461d0 c5461d0, String str) {
        this.f11403d = appMeasurementDynamiteService;
        this.f11400a = zzcvVar;
        this.f11401b = c5461d0;
        this.f11402c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11403d.f11045a.m14498E().m14412z(this.f11400a, this.f11401b, this.f11402c);
    }
}
