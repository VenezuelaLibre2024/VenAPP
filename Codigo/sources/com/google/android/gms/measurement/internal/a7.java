package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* loaded from: classes2.dex */
public final class a7 {

    /* renamed from: a, reason: collision with root package name */
    final Context f9956a;

    /* renamed from: b, reason: collision with root package name */
    String f9957b;

    /* renamed from: c, reason: collision with root package name */
    String f9958c;

    /* renamed from: d, reason: collision with root package name */
    String f9959d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f9960e;

    /* renamed from: f, reason: collision with root package name */
    long f9961f;

    /* renamed from: g, reason: collision with root package name */
    zzdd f9962g;

    /* renamed from: h, reason: collision with root package name */
    boolean f9963h;

    /* renamed from: i, reason: collision with root package name */
    Long f9964i;

    /* renamed from: j, reason: collision with root package name */
    String f9965j;

    public a7(Context context, zzdd zzddVar, Long l10) {
        this.f9963h = true;
        com.google.android.gms.common.internal.s.j(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.s.j(applicationContext);
        this.f9956a = applicationContext;
        this.f9964i = l10;
        if (zzddVar != null) {
            this.f9962g = zzddVar;
            this.f9957b = zzddVar.zzf;
            this.f9958c = zzddVar.zze;
            this.f9959d = zzddVar.zzd;
            this.f9963h = zzddVar.zzc;
            this.f9961f = zzddVar.zzb;
            this.f9965j = zzddVar.zzh;
            Bundle bundle = zzddVar.zzg;
            if (bundle != null) {
                this.f9960e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
