package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzanp implements zzaol {
    private final zzamy zza;
    private final zzfo zzb = new zzfo(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfw zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzanp(zzamy zzamyVar) {
        this.zza = zzamyVar;
    }

    private final void zzd(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zze(zzfp zzfpVar, byte[] bArr, int i10) {
        int min = Math.min(zzfpVar.zzb(), i10 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzfpVar.zzL(min);
        } else {
            zzfpVar.zzG(bArr, this.zzd, min);
        }
        int i11 = this.zzd + min;
        this.zzd = i11;
        return i11 == i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.google.android.gms.internal.ads.zzfo] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.google.android.gms.internal.ads.zzamy] */
    @Override // com.google.android.gms.internal.ads.zzaol
    public final void zza(zzfp zzfpVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        long j10;
        int i14;
        zzek.zzb(this.zze);
        int i15 = -1;
        int i16 = 2;
        ?? r62 = 0;
        int i17 = 1;
        if ((i10 & 1) != 0) {
            int i18 = this.zzc;
            if (i18 != 0 && i18 != 1) {
                if (i18 != 2) {
                    int i19 = this.zzj;
                    if (i19 != -1) {
                        zzff.zzf("PesReader", "Unexpected start indicator: expected " + i19 + " more bytes");
                    }
                    this.zza.zzc(zzfpVar.zze() == 0);
                } else {
                    zzff.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i20 = i10;
        while (zzfpVar.zzb() > 0) {
            int i21 = this.zzc;
            if (i21 == 0) {
                i11 = i16;
                z10 = r62;
                i12 = i17;
                zzfpVar.zzL(zzfpVar.zzb());
            } else if (i21 != i17) {
                if (i21 != i16) {
                    int zzb = zzfpVar.zzb();
                    int i22 = this.zzj;
                    int i23 = i22 == i15 ? r62 : zzb - i22;
                    if (i23 > 0) {
                        zzb -= i23;
                        zzfpVar.zzJ(zzfpVar.zzd() + zzb);
                    }
                    this.zza.zza(zzfpVar);
                    int i24 = this.zzj;
                    if (i24 != i15) {
                        int i25 = i24 - zzb;
                        this.zzj = i25;
                        if (i25 == 0) {
                            this.zza.zzc(r62);
                            zzd(i17);
                        }
                    }
                } else {
                    if (zze(zzfpVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzfpVar, null, this.zzi)) {
                        this.zzb.zzk(r62);
                        if (this.zzf) {
                            this.zzb.zzm(4);
                            long zzd = this.zzb.zzd(3);
                            this.zzb.zzm(i17);
                            int zzd2 = this.zzb.zzd(15) << 15;
                            this.zzb.zzm(i17);
                            long zzd3 = this.zzb.zzd(15);
                            this.zzb.zzm(i17);
                            if (this.zzh || !this.zzg) {
                                i14 = zzd2;
                            } else {
                                this.zzb.zzm(4);
                                this.zzb.zzm(i17);
                                int zzd4 = this.zzb.zzd(15) << 15;
                                this.zzb.zzm(i17);
                                long zzd5 = this.zzb.zzd(15);
                                this.zzb.zzm(i17);
                                i14 = zzd2;
                                this.zze.zzb((this.zzb.zzd(3) << 30) | zzd4 | zzd5);
                                this.zzh = true;
                            }
                            j10 = this.zze.zzb((zzd << 30) | i14 | zzd3);
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        i20 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(j10, i20);
                        zzd(3);
                        i15 = -1;
                        i16 = 2;
                        r62 = 0;
                        i17 = 1;
                    }
                }
                i11 = i16;
                z10 = r62;
                i12 = i17;
            } else if (zze(zzfpVar, this.zzb.zza, 9)) {
                z10 = false;
                this.zzb.zzk(0);
                int zzd6 = this.zzb.zzd(24);
                i12 = 1;
                if (zzd6 != 1) {
                    zzff.zzf("PesReader", "Unexpected start code prefix: " + zzd6);
                    i15 = -1;
                    this.zzj = -1;
                    i13 = 0;
                    i11 = 2;
                } else {
                    this.zzb.zzm(8);
                    zzfo zzfoVar = this.zzb;
                    int zzd7 = zzfoVar.zzd(16);
                    zzfoVar.zzm(5);
                    this.zzk = this.zzb.zzo();
                    i11 = 2;
                    this.zzb.zzm(2);
                    this.zzf = this.zzb.zzo();
                    this.zzg = this.zzb.zzo();
                    this.zzb.zzm(6);
                    int zzd8 = this.zzb.zzd(8);
                    this.zzi = zzd8;
                    if (zzd7 == 0) {
                        this.zzj = -1;
                        i15 = -1;
                    } else {
                        int i26 = (zzd7 - 3) - zzd8;
                        this.zzj = i26;
                        if (i26 < 0) {
                            zzff.zzf("PesReader", "Found negative packet payload size: " + i26);
                            i15 = -1;
                            this.zzj = -1;
                        } else {
                            i15 = -1;
                        }
                    }
                    i13 = 2;
                }
                zzd(i13);
            } else {
                i15 = -1;
                z10 = false;
                i12 = 1;
                i11 = 2;
            }
            i17 = i12;
            r62 = z10;
            i16 = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final void zzb(zzfw zzfwVar, zzacx zzacxVar, zzaok zzaokVar) {
        this.zze = zzfwVar;
        this.zza.zzb(zzacxVar, zzaokVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
