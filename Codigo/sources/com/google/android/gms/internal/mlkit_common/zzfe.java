package com.google.android.gms.internal.mlkit_common;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzfe implements d {
    static final zzfe zza = new zzfe();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;

    static {
        c.b a10 = c.a("supportedFormats");
        zzbk zzbkVar = new zzbk();
        zzbkVar.zza(1);
        zzb = a10.b(zzbkVar.zzb()).a();
        c.b a11 = c.a("durationMs");
        zzbk zzbkVar2 = new zzbk();
        zzbkVar2.zza(2);
        zzc = a11.b(zzbkVar2.zzb()).a();
        c.b a12 = c.a("errorCode");
        zzbk zzbkVar3 = new zzbk();
        zzbkVar3.zza(3);
        zzd = a12.b(zzbkVar3.zzb()).a();
        c.b a13 = c.a("allowManualInput");
        zzbk zzbkVar4 = new zzbk();
        zzbkVar4.zza(4);
        zze = a13.b(zzbkVar4.zzb()).a();
    }

    private zzfe() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
