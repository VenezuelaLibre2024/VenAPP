package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
public final class zzany implements zzaol {
    private final zzanx zza;
    private final zzfp zzb = new zzfp(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzany(zzanx zzanxVar) {
        this.zza = zzanxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final void zza(zzfp zzfpVar, int i10) {
        int i11 = i10 & 1;
        int zzd = i11 != 0 ? zzfpVar.zzd() + zzfpVar.zzm() : -1;
        if (this.zzf) {
            if (i11 == 0) {
                return;
            }
            this.zzf = false;
            zzfpVar.zzK(zzd);
            this.zzd = 0;
        }
        while (zzfpVar.zzb() > 0) {
            int i12 = this.zzd;
            if (i12 < 3) {
                if (i12 == 0) {
                    int zzm = zzfpVar.zzm();
                    zzfpVar.zzK(zzfpVar.zzd() - 1);
                    if (zzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzfpVar.zzb(), 3 - this.zzd);
                zzfpVar.zzG(this.zzb.zzM(), this.zzd, min);
                int i13 = this.zzd + min;
                this.zzd = i13;
                if (i13 == 3) {
                    this.zzb.zzK(0);
                    this.zzb.zzJ(3);
                    this.zzb.zzL(1);
                    zzfp zzfpVar2 = this.zzb;
                    int zzm2 = zzfpVar2.zzm();
                    boolean z10 = (zzm2 & RecognitionOptions.ITF) != 0;
                    int zzm3 = zzfpVar2.zzm();
                    this.zze = z10;
                    this.zzc = (zzm3 | ((zzm2 & 15) << 8)) + 3;
                    int zzc = this.zzb.zzc();
                    int i14 = this.zzc;
                    if (zzc < i14) {
                        int zzc2 = this.zzb.zzc();
                        this.zzb.zzE(Math.min(4098, Math.max(i14, zzc2 + zzc2)));
                    }
                }
            } else {
                int min2 = Math.min(zzfpVar.zzb(), this.zzc - i12);
                zzfpVar.zzG(this.zzb.zzM(), this.zzd, min2);
                int i15 = this.zzd + min2;
                this.zzd = i15;
                int i16 = this.zzc;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzJ(i16);
                    } else {
                        if (zzfy.zzd(this.zzb.zzM(), 0, i16, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzJ(this.zzc - 4);
                    }
                    this.zzb.zzK(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final void zzb(zzfw zzfwVar, zzacx zzacxVar, zzaok zzaokVar) {
        this.zza.zzb(zzfwVar, zzacxVar, zzaokVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final void zzc() {
        this.zzf = true;
    }
}
