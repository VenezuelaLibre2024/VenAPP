package com.google.android.gms.internal.mlkit_vision_barcode;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzip implements d {
    static final zzip zza = new zzip();
    private static final c zzb;
    private static final c zzc;

    static {
        c.b a10 = c.a("maxResults");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        zzb = a10.b(zzfcVar.zzb()).a();
        c.b a11 = c.a("modelType");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        zzc = a11.b(zzfcVar2.zzb()).a();
    }

    private zzip() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}