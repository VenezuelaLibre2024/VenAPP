package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzvw implements zzvd {
    private final zzgv zzc;
    private int zzd;
    private final zzvv zze;
    private final zzzb zzf;
    private final zzrp zzg;

    public zzvw(zzgv zzgvVar, zzvv zzvvVar) {
        zzrp zzrpVar = new zzrp();
        zzzb zzzbVar = new zzzb();
        this.zzc = zzgvVar;
        this.zze = zzvvVar;
        this.zzg = zzrpVar;
        this.zzf = zzzbVar;
        this.zzd = 1048576;
    }

    public final zzvw zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzvy zzb(zzbp zzbpVar) {
        zzbpVar.zzd.getClass();
        return new zzvy(zzbpVar, this.zzc, this.zze, zzry.zza, this.zzf, this.zzd, null);
    }
}
