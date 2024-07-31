package com.google.android.gms.internal.mlkit_common;

import jd.c;
import jd.d;
import jd.e;

/* loaded from: classes2.dex */
final class zzjd implements d {
    static final zzjd zza = new zzjd();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;
    private static final c zzg;
    private static final c zzh;
    private static final c zzi;
    private static final c zzj;
    private static final c zzk;
    private static final c zzl;
    private static final c zzm;
    private static final c zzn;
    private static final c zzo;

    static {
        c.b a10 = c.a("appId");
        zzbk zzbkVar = new zzbk();
        zzbkVar.zza(1);
        zzb = a10.b(zzbkVar.zzb()).a();
        c.b a11 = c.a("appVersion");
        zzbk zzbkVar2 = new zzbk();
        zzbkVar2.zza(2);
        zzc = a11.b(zzbkVar2.zzb()).a();
        c.b a12 = c.a("firebaseProjectId");
        zzbk zzbkVar3 = new zzbk();
        zzbkVar3.zza(3);
        zzd = a12.b(zzbkVar3.zzb()).a();
        c.b a13 = c.a("mlSdkVersion");
        zzbk zzbkVar4 = new zzbk();
        zzbkVar4.zza(4);
        zze = a13.b(zzbkVar4.zzb()).a();
        c.b a14 = c.a("tfliteSchemaVersion");
        zzbk zzbkVar5 = new zzbk();
        zzbkVar5.zza(5);
        zzf = a14.b(zzbkVar5.zzb()).a();
        c.b a15 = c.a("gcmSenderId");
        zzbk zzbkVar6 = new zzbk();
        zzbkVar6.zza(6);
        zzg = a15.b(zzbkVar6.zzb()).a();
        c.b a16 = c.a("apiKey");
        zzbk zzbkVar7 = new zzbk();
        zzbkVar7.zza(7);
        zzh = a16.b(zzbkVar7.zzb()).a();
        c.b a17 = c.a("languages");
        zzbk zzbkVar8 = new zzbk();
        zzbkVar8.zza(8);
        zzi = a17.b(zzbkVar8.zzb()).a();
        c.b a18 = c.a("mlSdkInstanceId");
        zzbk zzbkVar9 = new zzbk();
        zzbkVar9.zza(9);
        zzj = a18.b(zzbkVar9.zzb()).a();
        c.b a19 = c.a("isClearcutClient");
        zzbk zzbkVar10 = new zzbk();
        zzbkVar10.zza(10);
        zzk = a19.b(zzbkVar10.zzb()).a();
        c.b a20 = c.a("isStandaloneMlkit");
        zzbk zzbkVar11 = new zzbk();
        zzbkVar11.zza(11);
        zzl = a20.b(zzbkVar11.zzb()).a();
        c.b a21 = c.a("isJsonLogging");
        zzbk zzbkVar12 = new zzbk();
        zzbkVar12.zza(12);
        zzm = a21.b(zzbkVar12.zzb()).a();
        c.b a22 = c.a("buildLevel");
        zzbk zzbkVar13 = new zzbk();
        zzbkVar13.zza(13);
        zzn = a22.b(zzbkVar13.zzb()).a();
        c.b a23 = c.a("optionalModuleVersion");
        zzbk zzbkVar14 = new zzbk();
        zzbkVar14.zza(14);
        zzo = a23.b(zzbkVar14.zzb()).a();
    }

    private zzjd() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzon zzonVar = (zzon) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzonVar.zzg());
        eVar.add(zzc, zzonVar.zzh());
        eVar.add(zzd, (Object) null);
        eVar.add(zze, zzonVar.zzj());
        eVar.add(zzf, zzonVar.zzk());
        eVar.add(zzg, (Object) null);
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, zzonVar.zza());
        eVar.add(zzj, zzonVar.zzi());
        eVar.add(zzk, zzonVar.zzb());
        eVar.add(zzl, zzonVar.zzd());
        eVar.add(zzm, zzonVar.zzc());
        eVar.add(zzn, zzonVar.zze());
        eVar.add(zzo, zzonVar.zzf());
    }
}
