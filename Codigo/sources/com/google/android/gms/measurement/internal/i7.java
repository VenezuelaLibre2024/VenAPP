package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* loaded from: classes2.dex */
final class i7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ zzcv f10279a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10280b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10281c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f10282d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10283e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, String str, String str2, boolean z10) {
        this.f10283e = appMeasurementDynamiteService;
        this.f10279a = zzcvVar;
        this.f10280b = str;
        this.f10281c = str2;
        this.f10282d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10283e.f9925a.E().B(this.f10279a, this.f10280b, this.f10281c, this.f10282d);
    }
}
