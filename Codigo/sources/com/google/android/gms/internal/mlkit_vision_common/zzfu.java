package com.google.android.gms.internal.mlkit_vision_common;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzfu implements d {
    static final zzfu zza = new zzfu();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;

    static {
        c.b a10 = c.a("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a10.b(zzaeVar.zzb()).a();
        c.b a11 = c.a("options");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a11.b(zzaeVar2.zzb()).a();
        c.b a12 = c.a("identifyLanguageResult");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a12.b(zzaeVar3.zzb()).a();
        c.b a13 = c.a("identifyPossibleLanguagesResult");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = a13.b(zzaeVar4.zzb()).a();
    }

    private zzfu() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}