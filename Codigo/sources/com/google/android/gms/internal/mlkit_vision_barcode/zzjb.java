package com.google.android.gms.internal.mlkit_vision_barcode;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzjb implements d {
    static final zzjb zza = new zzjb();
    private static final c zzb;
    private static final c zzc;

    static {
        c.b a10 = c.a("detectorOptions");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        zzb = a10.b(zzfcVar.zzb()).a();
        c.b a11 = c.a("errorCode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        zzc = a11.b(zzfcVar2.zzb()).a();
    }

    private zzjb() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}