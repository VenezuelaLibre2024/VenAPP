package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzyf extends zzyc {
    private final boolean zze;
    private final zzxu zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzyf(int r5, com.google.android.gms.internal.ads.zzcz r6, int r7, com.google.android.gms.internal.ads.zzxu r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyf.<init>(int, com.google.android.gms.internal.ads.zzcz, int, com.google.android.gms.internal.ads.zzxu, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzyf zzyfVar, zzyf zzyfVar2) {
        zzgbj zzgbjVar;
        zzgbj zza;
        zzgbj zzgbjVar2;
        if (zzyfVar.zze && zzyfVar.zzh) {
            zza = zzyg.zzc;
        } else {
            zzgbjVar = zzyg.zzc;
            zza = zzgbjVar.zza();
        }
        zzfzp zzk = zzfzp.zzk();
        Integer valueOf = Integer.valueOf(zzyfVar.zzi);
        Integer valueOf2 = Integer.valueOf(zzyfVar2.zzi);
        boolean z10 = zzyfVar.zzf.zzB;
        zzgbjVar2 = zzyg.zzd;
        return zzk.zzd(valueOf, valueOf2, zzgbjVar2).zzd(Integer.valueOf(zzyfVar.zzj), Integer.valueOf(zzyfVar2.zzj), zza).zzd(Integer.valueOf(zzyfVar.zzi), Integer.valueOf(zzyfVar2.zzi), zza).zza();
    }

    public static /* synthetic */ int zzd(zzyf zzyfVar, zzyf zzyfVar2) {
        zzfzp zzd = zzfzp.zzk().zze(zzyfVar.zzh, zzyfVar2.zzh).zzb(zzyfVar.zzl, zzyfVar2.zzl).zze(zzyfVar.zzm, zzyfVar2.zzm).zze(zzyfVar.zze, zzyfVar2.zze).zze(zzyfVar.zzg, zzyfVar2.zzg).zzd(Integer.valueOf(zzyfVar.zzk), Integer.valueOf(zzyfVar2.zzk), zzgbj.zzc().zza());
        boolean z10 = zzyfVar.zzo;
        zzfzp zze = zzd.zze(z10, zzyfVar2.zzo);
        boolean z11 = zzyfVar.zzp;
        zzfzp zze2 = zze.zze(z11, zzyfVar2.zzp);
        if (z10 && z11) {
            zze2 = zze2.zzb(zzyfVar.zzq, zzyfVar2.zzq);
        }
        return zze2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final /* bridge */ /* synthetic */ boolean zzc(zzyc zzycVar) {
        zzyf zzyfVar = (zzyf) zzycVar;
        if (!zzfy.zzF(this.zzd.zzm, zzyfVar.zzd.zzm)) {
            return false;
        }
        boolean z10 = this.zzf.zzL;
        return this.zzo == zzyfVar.zzo && this.zzp == zzyfVar.zzp;
    }
}
