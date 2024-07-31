package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* loaded from: classes2.dex */
final class h8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzcv f10228a;

    /* renamed from: b */
    private final /* synthetic */ d0 f10229b;

    /* renamed from: c */
    private final /* synthetic */ String f10230c;

    /* renamed from: d */
    private final /* synthetic */ AppMeasurementDynamiteService f10231d;

    public h8(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, d0 d0Var, String str) {
        this.f10231d = appMeasurementDynamiteService;
        this.f10228a = zzcvVar;
        this.f10229b = d0Var;
        this.f10230c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10231d.f9925a.E().z(this.f10228a, this.f10229b, this.f10230c);
    }
}
