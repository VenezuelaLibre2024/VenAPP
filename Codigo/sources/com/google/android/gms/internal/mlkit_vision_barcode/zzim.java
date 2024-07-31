package com.google.android.gms.internal.mlkit_vision_barcode;

import jd.c;
import jd.d;
import jd.e;

/* loaded from: classes2.dex */
final class zzim implements d {
    static final zzim zza = new zzim();
    private static final c zzb;

    static {
        c.b a10 = c.a("format");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        zzb = a10.b(zzfcVar.zzb()).a();
    }

    private zzim() {
    }

    @Override // jd.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((e) obj2).add(zzb, ((zzth) obj).zza());
    }
}
