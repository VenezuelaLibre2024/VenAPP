package com.google.android.gms.internal.mlkit_vision_barcode;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzln implements d {
    static final zzln zza = new zzln();
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
        c.b a11 = c.a("imageInfo");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        zzc = a11.b(zzfcVar2.zzb()).a();
        c.b a12 = c.a("captionCount");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(4);
        zzd = a12.b(zzfcVar3.zzb()).a();
        c.b a13 = c.a("highestScore");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(5);
        zze = a13.b(zzfcVar4.zzb()).a();
        c.b a14 = c.a("imageType");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(6);
        zzf = a14.b(zzfcVar5.zzb()).a();
    }

    private zzln() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
