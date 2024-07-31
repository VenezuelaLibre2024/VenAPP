package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaiu implements zzair {
    private final zzfp zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaiu(zzain zzainVar) {
        zzfp zzfpVar = zzainVar.zza;
        this.zza = zzfpVar;
        zzfpVar.zzK(12);
        this.zzc = zzfpVar.zzp() & 255;
        this.zzb = zzfpVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzair
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzair
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzair
    public final int zzc() {
        int i10 = this.zzc;
        if (i10 == 8) {
            return this.zza.zzm();
        }
        if (i10 == 16) {
            return this.zza.zzq();
        }
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        if (i11 % 2 != 0) {
            return this.zze & 15;
        }
        int zzm = this.zza.zzm();
        this.zze = zzm;
        return (zzm & 240) >> 4;
    }
}
