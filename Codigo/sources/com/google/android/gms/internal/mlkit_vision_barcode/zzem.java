package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzem extends zzeo {
    public static zzev zza(Object obj) {
        return new zzep(obj);
    }

    public static void zzb(zzev zzevVar, zzek zzekVar, Executor executor) {
        zzevVar.zzj(new zzel(zzevVar, zzekVar), executor);
    }

    public static zzev zzc(zzup zzupVar, Executor executor) {
        zzey zzeyVar = new zzey(zzupVar);
        zzeyVar.run();
        return zzeyVar;
    }
}
