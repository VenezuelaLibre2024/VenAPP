package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaip {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfp zzf;
    private final zzfp zzg;
    private int zzh;
    private int zzi;

    public zzaip(zzfp zzfpVar, zzfp zzfpVar2, boolean z10) {
        this.zzg = zzfpVar;
        this.zzf = zzfpVar2;
        this.zze = z10;
        zzfpVar2.zzK(12);
        this.zza = zzfpVar2.zzp();
        zzfpVar.zzK(12);
        this.zzi = zzfpVar.zzp();
        zzacy.zzb(zzfpVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzv() : this.zzf.zzu();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzL(4);
            int i11 = this.zzi - 1;
            this.zzi = i11;
            this.zzh = i11 > 0 ? (-1) + this.zzg.zzp() : -1;
        }
        return true;
    }
}
