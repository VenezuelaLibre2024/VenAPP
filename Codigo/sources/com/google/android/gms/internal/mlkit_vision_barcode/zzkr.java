package com.google.android.gms.internal.mlkit_vision_barcode;

import jd.c;
import jd.d;
import jd.e;

/* loaded from: classes2.dex */
final class zzkr implements d {
    static final zzkr zza = new zzkr();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;

    static {
        c.b a10 = c.a("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        zzb = a10.b(zzfcVar.zzb()).a();
        c.b a11 = c.a("options");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        zzc = a11.b(zzfcVar2.zzb()).a();
        c.b a12 = c.a("detectedBarcodeFormats");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        zzd = a12.b(zzfcVar3.zzb()).a();
        c.b a13 = c.a("detectedBarcodeValueTypes");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        zze = a13.b(zzfcVar4.zzb()).a();
        c.b a14 = c.a("imageInfo");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        zzf = a14.b(zzfcVar5.zzb()).a();
    }

    private zzkr() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpz zzpzVar = (zzpz) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzpzVar.zzd());
        eVar.add(zzc, zzpzVar.zze());
        eVar.add(zzd, zzpzVar.zza());
        eVar.add(zze, zzpzVar.zzb());
        eVar.add(zzf, zzpzVar.zzc());
    }
}
