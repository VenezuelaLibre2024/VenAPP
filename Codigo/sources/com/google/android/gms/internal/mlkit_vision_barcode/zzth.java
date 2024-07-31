package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.q;

/* loaded from: classes2.dex */
public final class zzth {
    private final zzcv zza;

    public /* synthetic */ zzth(zztf zztfVar, zztg zztgVar) {
        zzcv zzcvVar;
        zzcvVar = zztfVar.zza;
        this.zza = zzcvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzth) {
            return q.b(this.zza, ((zzth) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return q.c(this.zza);
    }

    @zzfg(zza = 1)
    public final zzcv zza() {
        return this.zza;
    }
}
