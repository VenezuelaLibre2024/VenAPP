package com.google.android.gms.internal.mlkit_common;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzil implements d {
    static final zzil zza = new zzil();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;

    static {
        c.b a10 = c.a("inferenceCommonLogEvent");
        zzbk zzbkVar = new zzbk();
        zzbkVar.zza(1);
        zzb = a10.b(zzbkVar.zzb()).a();
        c.b a11 = c.a("imageInfo");
        zzbk zzbkVar2 = new zzbk();
        zzbkVar2.zza(2);
        zzc = a11.b(zzbkVar2.zzb()).a();
        c.b a12 = c.a("detectorOptions");
        zzbk zzbkVar3 = new zzbk();
        zzbkVar3.zza(3);
        zzd = a12.b(zzbkVar3.zzb()).a();
    }

    private zzil() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}