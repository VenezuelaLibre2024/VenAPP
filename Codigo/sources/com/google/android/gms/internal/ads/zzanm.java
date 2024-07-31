package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
public final class zzanm implements zzamy {
    private final zzfp zza;
    private final zzado zzb;
    private final String zzc;
    private zzaea zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzanm() {
        this(null);
    }

    public zzanm(String str) {
        this.zzf = 0;
        zzfp zzfpVar = new zzfp(4);
        this.zza = zzfpVar;
        zzfpVar.zzM()[0] = -1;
        this.zzb = new zzado();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(zzfp zzfpVar) {
        zzek.zzb(this.zzd);
        while (zzfpVar.zzb() > 0) {
            int i10 = this.zzf;
            if (i10 == 0) {
                byte[] zzM = zzfpVar.zzM();
                int zzd = zzfpVar.zzd();
                int zze = zzfpVar.zze();
                while (zzd < zze) {
                    int i11 = zzd + 1;
                    byte b10 = zzM[zzd];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.zzi && (b10 & 224) == 224;
                    this.zzi = z10;
                    if (z11) {
                        zzfpVar.zzK(i11);
                        this.zzi = false;
                        this.zza.zzM()[1] = zzM[zzd];
                        this.zzg = 2;
                        this.zzf = 1;
                        break;
                        break;
                    }
                    zzd = i11;
                }
                zzfpVar.zzK(zze);
            } else if (i10 != 1) {
                int min = Math.min(zzfpVar.zzb(), this.zzk - this.zzg);
                this.zzd.zzr(zzfpVar, min);
                int i12 = this.zzg + min;
                this.zzg = i12;
                if (i12 >= this.zzk) {
                    zzek.zzf(this.zzl != -9223372036854775807L);
                    this.zzd.zzt(this.zzl, 1, this.zzk, 0, null);
                    this.zzl += this.zzj;
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int min2 = Math.min(zzfpVar.zzb(), 4 - this.zzg);
                zzfpVar.zzG(this.zza.zzM(), this.zzg, min2);
                int i13 = this.zzg + min2;
                this.zzg = i13;
                if (i13 >= 4) {
                    this.zza.zzK(0);
                    if (!this.zzb.zza(this.zza.zzg())) {
                        this.zzg = 0;
                        this.zzf = 1;
                        break;
                    }
                    this.zzk = this.zzb.zzc;
                    if (!this.zzh) {
                        this.zzj = (r0.zzg * 1000000) / r0.zzd;
                        zzak zzakVar = new zzak();
                        zzakVar.zzK(this.zze);
                        zzakVar.zzW(this.zzb.zzb);
                        zzakVar.zzO(RecognitionOptions.AZTEC);
                        zzakVar.zzy(this.zzb.zze);
                        zzakVar.zzX(this.zzb.zzd);
                        zzakVar.zzN(this.zzc);
                        this.zzd.zzl(zzakVar.zzac());
                        this.zzh = true;
                    }
                    this.zza.zzK(0);
                    this.zzd.zzr(this.zza, 4);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        this.zze = zzaokVar.zzb();
        this.zzd = zzacxVar.zzw(zzaokVar.zza(), 1);
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
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }
}
