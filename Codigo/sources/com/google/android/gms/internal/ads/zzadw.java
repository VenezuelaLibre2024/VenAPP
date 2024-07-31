package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
public final class zzadw implements zzacu {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzacx zzf;
    private zzaea zzg;

    public zzadw(int i10, int i11, String str) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) {
        int i10 = this.zze;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzaea zzaeaVar = this.zzg;
        zzaeaVar.getClass();
        int zza = zzady.zza(zzaeaVar, zzacvVar, RecognitionOptions.UPC_E, true);
        if (zza == -1) {
            this.zze = 2;
            this.zzg.zzt(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += zza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzf = zzacxVar;
        zzaea zzw = zzacxVar.zzw(RecognitionOptions.UPC_E, 4);
        this.zzg = zzw;
        zzak zzakVar = new zzak();
        zzakVar.zzB(this.zzc);
        zzw.zzl(zzakVar.zzac());
        this.zzf.zzD();
        this.zzf.zzO(new zzadx(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        if (j10 == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) {
        zzek.zzf((this.zza == -1 || this.zzb == -1) ? false : true);
        zzfp zzfpVar = new zzfp(this.zzb);
        ((zzack) zzacvVar).zzm(zzfpVar.zzM(), 0, this.zzb, false);
        return zzfpVar.zzq() == this.zza;
    }
}
