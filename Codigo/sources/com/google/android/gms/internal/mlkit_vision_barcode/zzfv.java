package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.q;

/* loaded from: classes2.dex */
public final class zzfv {
    private final zzpj zza;
    private final Boolean zzc;
    private final zzth zze;
    private final zzcv zzf;
    private final zzcv zzg;
    private final Boolean zzb = null;
    private final zzos zzd = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfv(zzft zzftVar, zzfu zzfuVar) {
        this.zza = zzft.zzi(zzftVar);
        this.zzc = zzft.zzk(zzftVar);
        this.zze = zzft.zzj(zzftVar);
        this.zzf = zzft.zza(zzftVar);
        this.zzg = zzft.zzb(zzftVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfv)) {
            return false;
        }
        zzfv zzfvVar = (zzfv) obj;
        return q.b(this.zza, zzfvVar.zza) && q.b(null, null) && q.b(this.zzc, zzfvVar.zzc) && q.b(null, null) && q.b(this.zze, zzfvVar.zze) && q.b(this.zzf, zzfvVar.zzf) && q.b(this.zzg, zzfvVar.zzg);
    }

    public final int hashCode() {
        return q.c(this.zza, null, this.zzc, null, this.zze, this.zzf, this.zzg);
    }

    @zzfg(zza = 6)
    public final zzcv zza() {
        return this.zzf;
    }

    @zzfg(zza = 7)
    public final zzcv zzb() {
        return this.zzg;
    }

    @zzfg(zza = 1)
    public final zzpj zzc() {
        return this.zza;
    }

    @zzfg(zza = 5)
    public final zzth zzd() {
        return this.zze;
    }

    @zzfg(zza = 3)
    public final Boolean zze() {
        return this.zzc;
    }
}
