package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzdd;

/* renamed from: com.google.android.gms.measurement.internal.a7 */
/* loaded from: classes2.dex */
public final class C5429a7 {

    /* renamed from: a */
    final Context f11076a;

    /* renamed from: b */
    String f11077b;

    /* renamed from: c */
    String f11078c;

    /* renamed from: d */
    String f11079d;

    /* renamed from: e */
    Boolean f11080e;

    /* renamed from: f */
    long f11081f;

    /* renamed from: g */
    zzdd f11082g;

    /* renamed from: h */
    boolean f11083h;

    /* renamed from: i */
    Long f11084i;

    /* renamed from: j */
    String f11085j;

    public C5429a7(Context context, zzdd zzddVar, Long l10) {
        this.f11083h = true;
        C5276s.m13324j(context);
        Context applicationContext = context.getApplicationContext();
        C5276s.m13324j(applicationContext);
        this.f11076a = applicationContext;
        this.f11084i = l10;
        if (zzddVar != null) {
            this.f11082g = zzddVar;
            this.f11077b = zzddVar.zzf;
            this.f11078c = zzddVar.zze;
            this.f11079d = zzddVar.zzd;
            this.f11083h = zzddVar.zzc;
            this.f11081f = zzddVar.zzb;
            this.f11085j = zzddVar.zzh;
            Bundle bundle = zzddVar.zzg;
            if (bundle != null) {
                this.f11080e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
