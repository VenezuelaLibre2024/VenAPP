package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzafh extends zzafg {
    private final zzfp zzb;
    private final zzfp zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzafh(zzaea zzaeaVar) {
        super(zzaeaVar);
        this.zzb = new zzfp(zzgm.zza);
        this.zzc = new zzfp(4);
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zza(zzfp zzfpVar) {
        int zzm = zzfpVar.zzm();
        int i10 = zzm >> 4;
        int i11 = zzm & 15;
        if (i11 == 7) {
            this.zzg = i10;
            return i10 != 5;
        }
        throw new zzaff("Video format not supported: " + i11);
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zzb(zzfp zzfpVar, long j10) {
        int i10;
        int zzm = zzfpVar.zzm();
        long zzh = zzfpVar.zzh();
        if (zzm == 0) {
            if (!this.zze) {
                zzfp zzfpVar2 = new zzfp(new byte[zzfpVar.zzb()]);
                zzfpVar.zzG(zzfpVar2.zzM(), 0, zzfpVar.zzb());
                zzabz zza = zzabz.zza(zzfpVar2);
                this.zzd = zza.zzb;
                zzak zzakVar = new zzak();
                zzakVar.zzW("video/avc");
                zzakVar.zzz(zza.zzk);
                zzakVar.zzab(zza.zzc);
                zzakVar.zzI(zza.zzd);
                zzakVar.zzS(zza.zzj);
                zzakVar.zzL(zza.zza);
                this.zza.zzl(zzakVar.zzac());
                this.zze = true;
                return false;
            }
        } else if (zzm == 1 && this.zze) {
            int i11 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i10 = i11;
            } else if (i11 != 0) {
                i10 = 1;
            }
            byte[] zzM = this.zzc.zzM();
            zzM[0] = 0;
            zzM[1] = 0;
            zzM[2] = 0;
            int i12 = 4 - this.zzd;
            int i13 = 0;
            while (zzfpVar.zzb() > 0) {
                zzfpVar.zzG(this.zzc.zzM(), i12, this.zzd);
                this.zzc.zzK(0);
                zzfp zzfpVar3 = this.zzc;
                zzfp zzfpVar4 = this.zzb;
                int zzp = zzfpVar3.zzp();
                zzfpVar4.zzK(0);
                this.zza.zzr(this.zzb, 4);
                this.zza.zzr(zzfpVar, zzp);
                i13 = i13 + 4 + zzp;
            }
            this.zza.zzt(j10 + (zzh * 1000), i10, i13, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
