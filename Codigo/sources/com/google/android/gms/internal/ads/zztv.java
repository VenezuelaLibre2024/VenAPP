package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zztv implements zzwh {
    public final zzwh zza;
    final /* synthetic */ zztw zzb;
    private boolean zzc;

    public zztv(zztw zztwVar, zzwh zzwhVar) {
        this.zzb = zztwVar;
        this.zza = zzwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final int zza(zzlb zzlbVar, zzih zzihVar, int i10) {
        zztw zztwVar = this.zzb;
        if (zztwVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzihVar.zzc(4);
            return -4;
        }
        long zzb = zztwVar.zzb();
        int zza = this.zza.zza(zzlbVar, zzihVar, i10);
        if (zza != -5) {
            long j10 = this.zzb.zzb;
            if (j10 == Long.MIN_VALUE || ((zza != -4 || zzihVar.zze < j10) && !(zza == -3 && zzb == Long.MIN_VALUE && !zzihVar.zzd))) {
                return zza;
            }
            zzihVar.zzb();
            zzihVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        zzam zzamVar = zzlbVar.zza;
        zzamVar.getClass();
        int i11 = zzamVar.zzC;
        if (i11 == 0) {
            if (zzamVar.zzD != 0) {
                i11 = 0;
            }
            return -5;
        }
        int i12 = this.zzb.zzb == Long.MIN_VALUE ? zzamVar.zzD : 0;
        zzak zzb2 = zzamVar.zzb();
        zzb2.zzF(i11);
        zzb2.zzG(i12);
        zzlbVar.zza = zzb2.zzac();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final int zzb(long j10) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j10);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
