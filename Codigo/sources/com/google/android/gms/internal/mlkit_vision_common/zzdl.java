package com.google.android.gms.internal.mlkit_vision_common;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzdl implements d {
    static final zzdl zza = new zzdl();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;

    static {
        c.b a10 = c.a("callingSource");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a10.b(zzaeVar.zzb()).a();
        c.b a11 = c.a("supportedFormats");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a11.b(zzaeVar2.zzb()).a();
        c.b a12 = c.a("durationMs");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a12.b(zzaeVar3.zzb()).a();
        c.b a13 = c.a("errorCode");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = a13.b(zzaeVar4.zzb()).a();
    }

    private zzdl() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}