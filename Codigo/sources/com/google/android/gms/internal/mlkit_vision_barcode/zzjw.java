package com.google.android.gms.internal.mlkit_vision_barcode;

import jd.c;
import jd.d;
import jd.e;

/* loaded from: classes2.dex */
final class zzjw implements d {
    static final zzjw zza = new zzjw();
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

    static {
        c.b a10 = c.a("durationMs");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        zzb = a10.b(zzfcVar.zzb()).a();
        c.b a11 = c.a("errorCode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        zzc = a11.b(zzfcVar2.zzb()).a();
        c.b a12 = c.a("isColdCall");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        zzd = a12.b(zzfcVar3.zzb()).a();
        c.b a13 = c.a("autoManageModelOnBackground");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        zze = a13.b(zzfcVar4.zzb()).a();
        c.b a14 = c.a("autoManageModelOnLowMemory");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        zzf = a14.b(zzfcVar5.zzb()).a();
        c.b a15 = c.a("isNnApiEnabled");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        zzg = a15.b(zzfcVar6.zzb()).a();
        c.b a16 = c.a("eventsCount");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        zzh = a16.b(zzfcVar7.zzb()).a();
        c.b a17 = c.a("otherErrors");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        zzi = a17.b(zzfcVar8.zzb()).a();
        c.b a18 = c.a("remoteConfigValueForAcceleration");
        zzfc zzfcVar9 = new zzfc();
        zzfcVar9.zza(9);
        zzj = a18.b(zzfcVar9.zzb()).a();
        c.b a19 = c.a("isAccelerated");
        zzfc zzfcVar10 = new zzfc();
        zzfcVar10.zza(10);
        zzk = a19.b(zzfcVar10.zzb()).a();
    }

    private zzjw() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzoy zzoyVar = (zzoy) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzoyVar.zze());
        eVar.add(zzc, zzoyVar.zza());
        eVar.add(zzd, zzoyVar.zzd());
        eVar.add(zze, zzoyVar.zzb());
        eVar.add(zzf, zzoyVar.zzc());
        eVar.add(zzg, (Object) null);
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, (Object) null);
        eVar.add(zzj, (Object) null);
        eVar.add(zzk, (Object) null);
    }
}