package com.google.android.gms.internal.mlkit_vision_barcode;

import jd.c;
import jd.d;
import jd.e;

/* loaded from: classes2.dex */
final class zzmz implements d {
    static final zzmz zza = new zzmz();
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
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        zzb = a10.b(zzfcVar.zzb()).a();
        c.b a11 = c.a("appVersion");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        zzc = a11.b(zzfcVar2.zzb()).a();
        c.b a12 = c.a("firebaseProjectId");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        zzd = a12.b(zzfcVar3.zzb()).a();
        c.b a13 = c.a("mlSdkVersion");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        zze = a13.b(zzfcVar4.zzb()).a();
        c.b a14 = c.a("tfliteSchemaVersion");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        zzf = a14.b(zzfcVar5.zzb()).a();
        c.b a15 = c.a("gcmSenderId");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        zzg = a15.b(zzfcVar6.zzb()).a();
        c.b a16 = c.a("apiKey");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        zzh = a16.b(zzfcVar7.zzb()).a();
        c.b a17 = c.a("languages");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        zzi = a17.b(zzfcVar8.zzb()).a();
        c.b a18 = c.a("mlSdkInstanceId");
        zzfc zzfcVar9 = new zzfc();
        zzfcVar9.zza(9);
        zzj = a18.b(zzfcVar9.zzb()).a();
        c.b a19 = c.a("isClearcutClient");
        zzfc zzfcVar10 = new zzfc();
        zzfcVar10.zza(10);
        zzk = a19.b(zzfcVar10.zzb()).a();
        c.b a20 = c.a("isStandaloneMlkit");
        zzfc zzfcVar11 = new zzfc();
        zzfcVar11.zza(11);
        zzl = a20.b(zzfcVar11.zzb()).a();
        c.b a21 = c.a("isJsonLogging");
        zzfc zzfcVar12 = new zzfc();
        zzfcVar12.zza(12);
        zzm = a21.b(zzfcVar12.zzb()).a();
        c.b a22 = c.a("buildLevel");
        zzfc zzfcVar13 = new zzfc();
        zzfcVar13.zza(13);
        zzn = a22.b(zzfcVar13.zzb()).a();
        c.b a23 = c.a("optionalModuleVersion");
        zzfc zzfcVar14 = new zzfc();
        zzfcVar14.zza(14);
        zzo = a23.b(zzfcVar14.zzb()).a();
    }

    private zzmz() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsl zzslVar = (zzsl) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzslVar.zzg());
        eVar.add(zzc, zzslVar.zzh());
        eVar.add(zzd, (Object) null);
        eVar.add(zze, zzslVar.zzj());
        eVar.add(zzf, zzslVar.zzk());
        eVar.add(zzg, (Object) null);
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, zzslVar.zza());
        eVar.add(zzj, zzslVar.zzi());
        eVar.add(zzk, zzslVar.zzb());
        eVar.add(zzl, zzslVar.zzd());
        eVar.add(zzm, zzslVar.zzc());
        eVar.add(zzn, zzslVar.zze());
        eVar.add(zzo, zzslVar.zzf());
    }
}
