package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgrd implements zzggp {
    private final zzggx zza;
    private final zzgrx zzb;
    private final zzgrx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgrd(zzggx zzggxVar, zzgrc zzgrcVar) {
        zzgrx zzgrxVar;
        this.zza = zzggxVar;
        if (zzggxVar.zzf()) {
            zzgry zzb = zzgnz.zza().zzb();
            zzgsd zza = zzgns.zza(zzggxVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            zzgrxVar = zzb.zza(zza, "mac", "verify");
        } else {
            zzgrxVar = zzgns.zza;
            this.zzb = zzgrxVar;
        }
        this.zzc = zzgrxVar;
    }
}
