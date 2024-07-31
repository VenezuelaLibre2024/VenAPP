package com.google.android.gms.internal.mlkit_vision_barcode;

import jd.c;
import jd.d;

/* loaded from: classes2.dex */
final class zzmn implements d {
    static final zzmn zza = new zzmn();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;

    static {
        c.b a10 = c.a("languageOption");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(3);
        zzb = a10.b(zzfcVar.zzb()).a();
        c.b a11 = c.a("isUsingLegacyApi");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(4);
        zzc = a11.b(zzfcVar2.zzb()).a();
        c.b a12 = c.a("sdkVersion");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(5);
        zzd = a12.b(zzfcVar3.zzb()).a();
    }

    private zzmn() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
