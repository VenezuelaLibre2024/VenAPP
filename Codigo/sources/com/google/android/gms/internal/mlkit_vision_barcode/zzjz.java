package com.google.android.gms.internal.mlkit_vision_barcode;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzjz implements d {
    static final zzjz zza = new zzjz();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;

    static {
        c.b a10 = c.a("modelType");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        zzb = a10.b(zzfcVar.zzb()).a();
        c.b a11 = c.a("isDownloaded");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        zzc = a11.b(zzfcVar2.zzb()).a();
        c.b a12 = c.a("modelName");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        zzd = a12.b(zzfcVar3.zzb()).a();
    }

    private zzjz() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}