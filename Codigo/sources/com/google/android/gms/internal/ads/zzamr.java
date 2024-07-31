package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzamr implements zzamy {
    private final zzfo zza;
    private final zzfp zzb;
    private final String zzc;
    private String zzd;
    private zzaea zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzam zzj;
    private int zzk;
    private long zzl;

    public zzamr() {
        this(null);
    }

    public zzamr(String str) {
        zzfo zzfoVar = new zzfo(new byte[16], 16);
        this.zza = zzfoVar;
        this.zzb = new zzfp(zzfoVar.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(zzfp zzfpVar) {
        zzek.zzb(this.zze);
        while (zzfpVar.zzb() > 0) {
            int i10 = this.zzf;
            if (i10 == 0) {
                while (zzfpVar.zzb() > 0) {
                    if (this.zzh) {
                        int zzm = zzfpVar.zzm();
                        this.zzh = zzm == 172;
                        if (zzm != 64) {
                            if (zzm == 65) {
                                zzm = 65;
                            }
                        }
                        this.zzf = 1;
                        zzfp zzfpVar2 = this.zzb;
                        zzfpVar2.zzM()[0] = -84;
                        zzfpVar2.zzM()[1] = zzm == 65 ? (byte) 65 : (byte) 64;
                        this.zzg = 2;
                    } else {
                        this.zzh = zzfpVar.zzm() == 172;
                    }
                }
            } else if (i10 != 1) {
                int min = Math.min(zzfpVar.zzb(), this.zzk - this.zzg);
                this.zze.zzr(zzfpVar, min);
                int i11 = this.zzg + min;
                this.zzg = i11;
                if (i11 == this.zzk) {
                    zzek.zzf(this.zzl != -9223372036854775807L);
                    this.zze.zzt(this.zzl, 1, this.zzk, 0, null);
                    this.zzl += this.zzi;
                    this.zzf = 0;
                }
            } else {
                byte[] zzM = this.zzb.zzM();
                int min2 = Math.min(zzfpVar.zzb(), 16 - this.zzg);
                zzfpVar.zzG(zzM, this.zzg, min2);
                int i12 = this.zzg + min2;
                this.zzg = i12;
                if (i12 == 16) {
                    this.zza.zzk(0);
                    zzabx zza = zzaby.zza(this.zza);
                    zzam zzamVar = this.zzj;
                    if (zzamVar == null || zzamVar.zzz != 2 || zza.zza != zzamVar.zzA || !"audio/ac4".equals(zzamVar.zzm)) {
                        zzak zzakVar = new zzak();
                        zzakVar.zzK(this.zzd);
                        zzakVar.zzW("audio/ac4");
                        zzakVar.zzy(2);
                        zzakVar.zzX(zza.zza);
                        zzakVar.zzN(this.zzc);
                        zzam zzac = zzakVar.zzac();
                        this.zzj = zzac;
                        this.zze.zzl(zzac);
                    }
                    this.zzk = zza.zzb;
                    this.zzi = (zza.zzc * 1000000) / this.zzj.zzA;
                    this.zzb.zzK(0);
                    this.zze.zzr(this.zzb, 16);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        this.zzd = zzaokVar.zzb();
        this.zze = zzacxVar.zzw(zzaokVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j10, int i10) {
        this.zzl = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }
}
