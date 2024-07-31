package com.google.android.gms.internal.mlkit_common;

import jd.c;
import jd.d;
import jd.e;

/* loaded from: classes2.dex */
final class zzgg implements d {
    static final zzgg zza = new zzgg();
    private static final c zzb;

    static {
        c.b a10 = c.a("api");
        zzbk zzbkVar = new zzbk();
        zzbkVar.zza(1);
        zzb = a10.b(zzbkVar.zzb()).a();
    }

    private zzgg() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((e) obj2).add(zzb, ((zzlh) obj).zza());
    }
}
