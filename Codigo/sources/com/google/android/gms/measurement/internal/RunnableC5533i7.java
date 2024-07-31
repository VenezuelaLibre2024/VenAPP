package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
/* loaded from: classes2.dex */
final class RunnableC5533i7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzcv f11451a;

    /* renamed from: b */
    private final /* synthetic */ String f11452b;

    /* renamed from: c */
    private final /* synthetic */ String f11453c;

    /* renamed from: d */
    private final /* synthetic */ boolean f11454d;

    /* renamed from: e */
    private final /* synthetic */ AppMeasurementDynamiteService f11455e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5533i7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, String str, String str2, boolean z10) {
        this.f11455e = appMeasurementDynamiteService;
        this.f11451a = zzcvVar;
        this.f11452b = str;
        this.f11453c = str2;
        this.f11454d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11455e.f11045a.m14498E().m14388B(this.f11451a, this.f11452b, this.f11453c, this.f11454d);
    }
}
