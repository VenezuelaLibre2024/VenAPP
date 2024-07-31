package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.q;

/* loaded from: classes2.dex */
public final class zzos {
    private final zzoq zza;
    private final Integer zzb;
    private final Integer zzc;
    private final Boolean zzd;

    public /* synthetic */ zzos(zzop zzopVar, zzor zzorVar) {
        zzoq zzoqVar;
        Integer num;
        zzoqVar = zzopVar.zza;
        this.zza = zzoqVar;
        num = zzopVar.zzb;
        this.zzb = num;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzos)) {
            return false;
        }
        zzos zzosVar = (zzos) obj;
        return q.b(this.zza, zzosVar.zza) && q.b(this.zzb, zzosVar.zzb) && q.b(null, null) && q.b(null, null);
    }

    public final int hashCode() {
        return q.c(this.zza, this.zzb, null, null);
    }

    @zzfg(zza = 1)
    public final zzoq zza() {
        return this.zza;
    }

    @zzfg(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}
