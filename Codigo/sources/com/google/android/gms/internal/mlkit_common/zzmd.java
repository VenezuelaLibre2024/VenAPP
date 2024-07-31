package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.q;

/* loaded from: classes2.dex */
public final class zzmd {
    private final zzlz zza;
    private final zzmb zzb;
    private final zzmb zzc;
    private final Boolean zzd;

    public /* synthetic */ zzmd(zzma zzmaVar, zzmc zzmcVar) {
        zzlz zzlzVar;
        zzlzVar = zzmaVar.zza;
        this.zza = zzlzVar;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzmd) && q.b(this.zza, ((zzmd) obj).zza) && q.b(null, null) && q.b(null, null) && q.b(null, null);
    }

    public final int hashCode() {
        return q.c(this.zza, null, null, null);
    }

    @zzbo(zza = 1)
    public final zzlz zza() {
        return this.zza;
    }
}
