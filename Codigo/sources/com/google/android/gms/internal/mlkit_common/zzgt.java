package com.google.android.gms.internal.mlkit_common;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzgt implements d {
    static final zzgt zza = new zzgt();
    private static final c zzb;
    private static final c zzc;

    static {
        c.b a10 = c.a("deviceInfos");
        zzbk zzbkVar = new zzbk();
        zzbkVar.zza(1);
        zzb = a10.b(zzbkVar.zzb()).a();
        c.b a11 = c.a("errorInfo");
        zzbk zzbkVar2 = new zzbk();
        zzbkVar2.zza(2);
        zzc = a11.b(zzbkVar2.zzb()).a();
    }

    private zzgt() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
