package com.google.android.gms.internal.mlkit_vision_barcode;

import jd.c;
import jd.d;
import jd.e;

/* loaded from: classes2.dex */
final class zzjm implements d {
    static final zzjm zza = new zzjm();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;
    private static final c zzg;

    static {
        c.b a10 = c.a("maxMs");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        zzb = a10.b(zzfcVar.zzb()).a();
        c.b a11 = c.a("minMs");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        zzc = a11.b(zzfcVar2.zzb()).a();
        c.b a12 = c.a("avgMs");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        zzd = a12.b(zzfcVar3.zzb()).a();
        c.b a13 = c.a("firstQuartileMs");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        zze = a13.b(zzfcVar4.zzb()).a();
        c.b a14 = c.a("medianMs");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        zzf = a14.b(zzfcVar5.zzb()).a();
        c.b a15 = c.a("thirdQuartileMs");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        zzg = a15.b(zzfcVar6.zzb()).a();
    }

    private zzjm() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzol zzolVar = (zzol) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzolVar.zzc());
        eVar.add(zzc, zzolVar.zze());
        eVar.add(zzd, zzolVar.zza());
        eVar.add(zze, zzolVar.zzb());
        eVar.add(zzf, zzolVar.zzd());
        eVar.add(zzg, zzolVar.zzf());
    }
}
