package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzwp implements zzup, zzuo {
    private final zzup zza;
    private final long zzb;
    private zzuo zzc;

    public zzwp(zzup zzupVar, long j10) {
        this.zza = zzupVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j10, zzmj zzmjVar) {
        long j11 = this.zzb;
        return this.zza.zza(j10 - j11, zzmjVar) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j10) {
        long j11 = this.zzb;
        return this.zza.zze(j10 - j11) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzf(zzyi[] zzyiVarArr, boolean[] zArr, zzwh[] zzwhVarArr, boolean[] zArr2, long j10) {
        zzwh[] zzwhVarArr2 = new zzwh[zzwhVarArr.length];
        int i10 = 0;
        while (true) {
            zzwh zzwhVar = null;
            if (i10 >= zzwhVarArr.length) {
                break;
            }
            zzwo zzwoVar = (zzwo) zzwhVarArr[i10];
            if (zzwoVar != null) {
                zzwhVar = zzwoVar.zzc();
            }
            zzwhVarArr2[i10] = zzwhVar;
            i10++;
        }
        long zzf = this.zza.zzf(zzyiVarArr, zArr, zzwhVarArr2, zArr2, j10 - this.zzb);
        for (int i11 = 0; i11 < zzwhVarArr.length; i11++) {
            zzwh zzwhVar2 = zzwhVarArr2[i11];
            if (zzwhVar2 == null) {
                zzwhVarArr[i11] = null;
            } else {
                zzwh zzwhVar3 = zzwhVarArr[i11];
                if (zzwhVar3 == null || ((zzwo) zzwhVar3).zzc() != zzwhVar2) {
                    zzwhVarArr[i11] = new zzwo(zzwhVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final /* bridge */ /* synthetic */ void zzg(zzwj zzwjVar) {
        zzuo zzuoVar = this.zzc;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzws zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        zzuo zzuoVar = this.zzc;
        zzuoVar.getClass();
        zzuoVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j10, boolean z10) {
        this.zza.zzj(j10 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j10) {
        this.zzc = zzuoVar;
        this.zza.zzl(this, j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final void zzm(long j10) {
        this.zza.zzm(j10 - this.zzb);
    }

    public final zzup zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final boolean zzo(zzlg zzlgVar) {
        long j10 = zzlgVar.zza;
        long j11 = this.zzb;
        zzle zza = zzlgVar.zza();
        zza.zze(j10 - j11);
        return this.zza.zzo(zza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
