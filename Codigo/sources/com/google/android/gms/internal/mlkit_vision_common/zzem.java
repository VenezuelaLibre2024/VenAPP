package com.google.android.gms.internal.mlkit_vision_common;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzem implements d {
    static final zzem zza = new zzem();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;

    static {
        c.b a10 = c.a("identifyLanguageConfidenceThreshold");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a10.b(zzaeVar.zzb()).a();
        c.b a11 = c.a("identifyAllLanguagesConfidenceThreshold");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a11.b(zzaeVar2.zzb()).a();
        c.b a12 = c.a("confidenceThreshold");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a12.b(zzaeVar3.zzb()).a();
    }

    private zzem() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}