package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzuj implements zzup, zzuo {
    public final zzur zza;
    private final long zzb;
    private zzut zzc;
    private zzup zzd;
    private zzuo zze;
    private long zzf = -9223372036854775807L;
    private final zzyx zzg;

    public zzuj(zzur zzurVar, zzyx zzyxVar, long j10) {
        this.zza = zzurVar;
        this.zzg = zzyxVar;
        this.zzb = j10;
    }

    private final long zzv(long j10) {
        long j11 = this.zzf;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j10, zzmj zzmjVar) {
        zzup zzupVar = this.zzd;
        int i10 = zzfy.zza;
        return zzupVar.zza(j10, zzmjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final long zzb() {
        zzup zzupVar = this.zzd;
        int i10 = zzfy.zza;
        return zzupVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final long zzc() {
        zzup zzupVar = this.zzd;
        int i10 = zzfy.zza;
        return zzupVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        zzup zzupVar = this.zzd;
        int i10 = zzfy.zza;
        return zzupVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j10) {
        zzup zzupVar = this.zzd;
        int i10 = zzfy.zza;
        return zzupVar.zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzf(zzyi[] zzyiVarArr, boolean[] zArr, zzwh[] zzwhVarArr, boolean[] zArr2, long j10) {
        long j11 = this.zzf;
        long j12 = (j11 == -9223372036854775807L || j10 != this.zzb) ? j10 : j11;
        this.zzf = -9223372036854775807L;
        zzup zzupVar = this.zzd;
        int i10 = zzfy.zza;
        return zzupVar.zzf(zzyiVarArr, zArr, zzwhVarArr, zArr2, j12);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final /* bridge */ /* synthetic */ void zzg(zzwj zzwjVar) {
        zzuo zzuoVar = this.zze;
        int i10 = zzfy.zza;
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzws zzh() {
        zzup zzupVar = this.zzd;
        int i10 = zzfy.zza;
        return zzupVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        zzuo zzuoVar = this.zze;
        int i10 = zzfy.zza;
        zzuoVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j10, boolean z10) {
        zzup zzupVar = this.zzd;
        int i10 = zzfy.zza;
        zzupVar.zzj(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() {
        try {
            zzup zzupVar = this.zzd;
            if (zzupVar != null) {
                zzupVar.zzk();
                return;
            }
            zzut zzutVar = this.zzc;
            if (zzutVar != null) {
                zzutVar.zzz();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j10) {
        this.zze = zzuoVar;
        zzup zzupVar = this.zzd;
        if (zzupVar != null) {
            zzupVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final void zzm(long j10) {
        zzup zzupVar = this.zzd;
        int i10 = zzfy.zza;
        zzupVar.zzm(j10);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final boolean zzo(zzlg zzlgVar) {
        zzup zzupVar = this.zzd;
        return zzupVar != null && zzupVar.zzo(zzlgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final boolean zzp() {
        zzup zzupVar = this.zzd;
        return zzupVar != null && zzupVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzur zzurVar) {
        long zzv = zzv(this.zzb);
        zzut zzutVar = this.zzc;
        zzutVar.getClass();
        zzup zzI = zzutVar.zzI(zzurVar, this.zzg, zzv);
        this.zzd = zzI;
        if (this.zze != null) {
            zzI.zzl(this, zzv);
        }
    }

    public final void zzs(long j10) {
        this.zzf = j10;
    }

    public final void zzt() {
        zzup zzupVar = this.zzd;
        if (zzupVar != null) {
            zzut zzutVar = this.zzc;
            zzutVar.getClass();
            zzutVar.zzG(zzupVar);
        }
    }

    public final void zzu(zzut zzutVar) {
        zzek.zzf(this.zzc == null);
        this.zzc = zzutVar;
    }
}
