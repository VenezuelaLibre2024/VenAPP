package com.google.android.gms.internal.mlkit_vision_barcode;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzly implements d {
    static final zzly zza = new zzly();
    private static final c zzb;
    private static final c zzc;

    static {
        c.b a10 = c.a("confidence");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        zzb = a10.b(zzfcVar.zzb()).a();
        c.b a11 = c.a("languageCode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        zzc = a11.b(zzfcVar2.zzb()).a();
    }

    private zzly() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
