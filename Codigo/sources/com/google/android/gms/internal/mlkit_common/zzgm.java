package com.google.android.gms.internal.mlkit_common;

import jd.c;
import jd.d;
import jd.e;

/* loaded from: classes2.dex */
final class zzgm implements d {
    static final zzgm zza = new zzgm();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;
    private static final c zzg;
    private static final c zzh;

    static {
        c.b a10 = c.a("options");
        zzbk zzbkVar = new zzbk();
        zzbkVar.zza(1);
        zzb = a10.b(zzbkVar.zzb()).a();
        c.b a11 = c.a("roughDownloadDurationMs");
        zzbk zzbkVar2 = new zzbk();
        zzbkVar2.zza(2);
        zzc = a11.b(zzbkVar2.zzb()).a();
        c.b a12 = c.a("errorCode");
        zzbk zzbkVar3 = new zzbk();
        zzbkVar3.zza(3);
        zzd = a12.b(zzbkVar3.zzb()).a();
        c.b a13 = c.a("exactDownloadDurationMs");
        zzbk zzbkVar4 = new zzbk();
        zzbkVar4.zza(4);
        zze = a13.b(zzbkVar4.zzb()).a();
        c.b a14 = c.a("downloadStatus");
        zzbk zzbkVar5 = new zzbk();
        zzbkVar5.zza(5);
        zzf = a14.b(zzbkVar5.zzb()).a();
        c.b a15 = c.a("downloadFailureStatus");
        zzbk zzbkVar6 = new zzbk();
        zzbkVar6.zza(6);
        zzg = a15.b(zzbkVar6.zzb()).a();
        c.b a16 = c.a("mddDownloadErrorCodes");
        zzbk zzbkVar7 = new zzbk();
        zzbkVar7.zza(7);
        zzh = a16.b(zzbkVar7.zzb()).a();
    }

    private zzgm() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlu zzluVar = (zzlu) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzluVar.zzc());
        eVar.add(zzc, zzluVar.zzf());
        eVar.add(zzd, zzluVar.zza());
        eVar.add(zze, zzluVar.zze());
        eVar.add(zzf, zzluVar.zzb());
        eVar.add(zzg, zzluVar.zzd());
        eVar.add(zzh, (Object) null);
    }
}
