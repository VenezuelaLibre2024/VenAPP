package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
final class zzafk implements zzacu {
    private zzacx zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzahe zzg;
    private zzacv zzh;
    private zzafn zzi;
    private zzajh zzj;
    private final zzfp zza = new zzfp(6);
    private long zzf = -1;

    private final int zza(zzacv zzacvVar) {
        this.zza.zzH(2);
        ((zzack) zzacvVar).zzm(this.zza.zzM(), 0, 2, false);
        return this.zza.zzq();
    }

    private final void zzf() {
        zzg(new zzbx[0]);
        zzacx zzacxVar = this.zzb;
        zzacxVar.getClass();
        zzacxVar.zzD();
        this.zzb.zzO(new zzadt(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    private final void zzg(zzbx... zzbxVarArr) {
        zzacx zzacxVar = this.zzb;
        zzacxVar.getClass();
        zzaea zzw = zzacxVar.zzw(RecognitionOptions.UPC_E, 4);
        zzak zzakVar = new zzak();
        zzakVar.zzB("image/jpeg");
        zzakVar.zzP(new zzby(-9223372036854775807L, zzbxVarArr));
        zzw.zzl(zzakVar.zzac());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacv r24, com.google.android.gms.internal.ads.zzadr r25) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafk.zzb(com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzadr):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzb = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        if (j10 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzajh zzajhVar = this.zzj;
            zzajhVar.getClass();
            zzajhVar.zzd(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) {
        if (zza(zzacvVar) != 65496) {
            return false;
        }
        int zza = zza(zzacvVar);
        this.zzd = zza;
        if (zza == 65504) {
            this.zza.zzH(2);
            zzack zzackVar = (zzack) zzacvVar;
            zzackVar.zzm(this.zza.zzM(), 0, 2, false);
            zzackVar.zzl(this.zza.zzq() - 2, false);
            zza = zza(zzacvVar);
            this.zzd = zza;
        }
        if (zza == 65505) {
            zzack zzackVar2 = (zzack) zzacvVar;
            zzackVar2.zzl(2, false);
            this.zza.zzH(6);
            zzackVar2.zzm(this.zza.zzM(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
        }
        return false;
    }
}
