package com.google.android.gms.internal.mlkit_vision_common;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzfk implements d {
    static final zzfk zza = new zzfk();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;

    static {
        c.b a10 = c.a("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a10.b(zzaeVar.zzb()).a();
        c.b a11 = c.a("imageInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a11.b(zzaeVar2.zzb()).a();
        c.b a12 = c.a("captionCount");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(4);
        zzd = a12.b(zzaeVar3.zzb()).a();
        c.b a13 = c.a("highestScore");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(5);
        zze = a13.b(zzaeVar4.zzb()).a();
        c.b a14 = c.a("imageType");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(6);
        zzf = a14.b(zzaeVar5.zzb()).a();
    }

    private zzfk() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
