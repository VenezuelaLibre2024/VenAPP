package com.google.android.gms.internal.mlkit_vision_common;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzdb implements d {
    static final zzdb zza = new zzdb();
    private static final c zzb;
    private static final c zzc;

    static {
        c.b a10 = c.a("maxResults");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a10.b(zzaeVar.zzb()).a();
        c.b a11 = c.a("modelType");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a11.b(zzaeVar2.zzb()).a();
    }

    private zzdb() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
