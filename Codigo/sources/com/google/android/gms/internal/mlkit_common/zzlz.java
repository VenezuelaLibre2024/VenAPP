package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.q;

/* loaded from: classes2.dex */
public final class zzlz {
    private final String zza;
    private final String zzb;
    private final zzlx zzc;
    private final String zzd;
    private final String zze;
    private final zzlw zzf;
    private final Long zzg;
    private final Boolean zzh;
    private final Boolean zzi;

    public /* synthetic */ zzlz(zzlv zzlvVar, zzly zzlyVar) {
        String str;
        zzlx zzlxVar;
        String str2;
        zzlw zzlwVar;
        str = zzlvVar.zza;
        this.zza = str;
        this.zzb = null;
        zzlxVar = zzlvVar.zzb;
        this.zzc = zzlxVar;
        this.zzd = null;
        str2 = zzlvVar.zzc;
        this.zze = str2;
        zzlwVar = zzlvVar.zzd;
        this.zzf = zzlwVar;
        this.zzg = null;
        this.zzh = null;
        this.zzi = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlz)) {
            return false;
        }
        zzlz zzlzVar = (zzlz) obj;
        return q.b(this.zza, zzlzVar.zza) && q.b(null, null) && q.b(this.zzc, zzlzVar.zzc) && q.b(null, null) && q.b(this.zze, zzlzVar.zze) && q.b(this.zzf, zzlzVar.zzf) && q.b(null, null) && q.b(null, null) && q.b(null, null);
    }

    public final int hashCode() {
        return q.c(this.zza, null, this.zzc, null, this.zze, this.zzf, null, null, null);
    }

    @zzbo(zza = 6)
    public final zzlw zza() {
        return this.zzf;
    }

    @zzbo(zza = 3)
    public final zzlx zzb() {
        return this.zzc;
    }

    @zzbo(zza = 5)
    public final String zzc() {
        return this.zze;
    }

    @zzbo(zza = 1)
    public final String zzd() {
        return this.zza;
    }
}
