package com.google.android.gms.internal.mlkit_vision_common;

import jd.c;
import jd.d;
import jd.e;

/* loaded from: classes2.dex */
final class zzgu implements d {
    static final zzgu zza = new zzgu();
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
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a10.b(zzaeVar.zzb()).a();
        c.b a11 = c.a("appVersion");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a11.b(zzaeVar2.zzb()).a();
        c.b a12 = c.a("firebaseProjectId");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a12.b(zzaeVar3.zzb()).a();
        c.b a13 = c.a("mlSdkVersion");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = a13.b(zzaeVar4.zzb()).a();
        c.b a14 = c.a("tfliteSchemaVersion");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = a14.b(zzaeVar5.zzb()).a();
        c.b a15 = c.a("gcmSenderId");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = a15.b(zzaeVar6.zzb()).a();
        c.b a16 = c.a("apiKey");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = a16.b(zzaeVar7.zzb()).a();
        c.b a17 = c.a("languages");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        zzi = a17.b(zzaeVar8.zzb()).a();
        c.b a18 = c.a("mlSdkInstanceId");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        zzj = a18.b(zzaeVar9.zzb()).a();
        c.b a19 = c.a("isClearcutClient");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        zzk = a19.b(zzaeVar10.zzb()).a();
        c.b a20 = c.a("isStandaloneMlkit");
        zzae zzaeVar11 = new zzae();
        zzaeVar11.zza(11);
        zzl = a20.b(zzaeVar11.zzb()).a();
        c.b a21 = c.a("isJsonLogging");
        zzae zzaeVar12 = new zzae();
        zzaeVar12.zza(12);
        zzm = a21.b(zzaeVar12.zzb()).a();
        c.b a22 = c.a("buildLevel");
        zzae zzaeVar13 = new zzae();
        zzaeVar13.zza(13);
        zzn = a22.b(zzaeVar13.zzb()).a();
        c.b a23 = c.a("optionalModuleVersion");
        zzae zzaeVar14 = new zzae();
        zzaeVar14.zza(14);
        zzo = a23.b(zzaeVar14.zzb()).a();
    }

    private zzgu() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzla zzlaVar = (zzla) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzlaVar.zzg());
        eVar.add(zzc, zzlaVar.zzh());
        eVar.add(zzd, (Object) null);
        eVar.add(zze, zzlaVar.zzj());
        eVar.add(zzf, zzlaVar.zzk());
        eVar.add(zzg, (Object) null);
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, zzlaVar.zza());
        eVar.add(zzj, zzlaVar.zzi());
        eVar.add(zzk, zzlaVar.zzb());
        eVar.add(zzl, zzlaVar.zzd());
        eVar.add(zzm, zzlaVar.zzc());
        eVar.add(zzn, zzlaVar.zze());
        eVar.add(zzo, zzlaVar.zzf());
    }
}
