package com.google.android.gms.internal.mlkit_common;

import jd.c;
import jd.d;
import jd.e;

/* loaded from: classes2.dex */
final class zzgd implements d {
    static final zzgd zza = new zzgd();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;

    static {
        c.b a10 = c.a("modelType");
        zzbk zzbkVar = new zzbk();
        zzbkVar.zza(1);
        zzb = a10.b(zzbkVar.zzb()).a();
        c.b a11 = c.a("isDownloaded");
        zzbk zzbkVar2 = new zzbk();
        zzbkVar2.zza(2);
        zzc = a11.b(zzbkVar2.zzb()).a();
        c.b a12 = c.a("modelName");
        zzbk zzbkVar3 = new zzbk();
        zzbkVar3.zza(3);
        zzd = a12.b(zzbkVar3.zzb()).a();
    }

    private zzgd() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlb zzlbVar = (zzlb) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzlbVar.zza());
        eVar.add(zzc, zzlbVar.zzb());
        eVar.add(zzd, (Object) null);
    }
}
