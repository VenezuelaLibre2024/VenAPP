package com.google.android.gms.internal.mlkit_common;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzfs implements d {
    static final zzfs zza = new zzfs();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;
    private static final c zzg;

    static {
        c.b a10 = c.a("landmarkMode");
        zzbk zzbkVar = new zzbk();
        zzbkVar.zza(1);
        zzb = a10.b(zzbkVar.zzb()).a();
        c.b a11 = c.a("classificationMode");
        zzbk zzbkVar2 = new zzbk();
        zzbkVar2.zza(2);
        zzc = a11.b(zzbkVar2.zzb()).a();
        c.b a12 = c.a("performanceMode");
        zzbk zzbkVar3 = new zzbk();
        zzbkVar3.zza(3);
        zzd = a12.b(zzbkVar3.zzb()).a();
        c.b a13 = c.a("contourMode");
        zzbk zzbkVar4 = new zzbk();
        zzbkVar4.zza(4);
        zze = a13.b(zzbkVar4.zzb()).a();
        c.b a14 = c.a("isTrackingEnabled");
        zzbk zzbkVar5 = new zzbk();
        zzbkVar5.zza(5);
        zzf = a14.b(zzbkVar5.zzb()).a();
        c.b a15 = c.a("minFaceSize");
        zzbk zzbkVar6 = new zzbk();
        zzbkVar6.zza(6);
        zzg = a15.b(zzbkVar6.zzb()).a();
    }

    private zzfs() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
