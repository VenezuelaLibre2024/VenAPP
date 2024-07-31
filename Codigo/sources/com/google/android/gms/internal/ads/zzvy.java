package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes2.dex */
public final class zzvy extends zzts implements zzvp {
    private final zzgv zza;
    private final zzry zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzhy zzh;
    private zzbp zzi;
    private final zzvv zzj;
    private final zzzb zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzvy(zzbp zzbpVar, zzgv zzgvVar, zzvv zzvvVar, zzry zzryVar, zzzb zzzbVar, int i10, zzvx zzvxVar) {
        this.zzi = zzbpVar;
        this.zza = zzgvVar;
        this.zzj = zzvvVar;
        this.zzb = zzryVar;
        this.zzk = zzzbVar;
        this.zzc = i10;
    }

    private final void zzw() {
        long j10 = this.zze;
        boolean z10 = this.zzf;
        boolean z11 = this.zzg;
        zzbp zzJ = zzJ();
        zzwl zzwlVar = new zzwl(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, zzJ, z11 ? zzJ.zzf : null);
        zzo(this.zzd ? new zzvu(this, zzwlVar) : zzwlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzG(zzup zzupVar) {
        ((zzvt) zzupVar).zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final zzup zzI(zzur zzurVar, zzyx zzyxVar, long j10) {
        zzgw zza = this.zza.zza();
        zzhy zzhyVar = this.zzh;
        if (zzhyVar != null) {
            zza.zzf(zzhyVar);
        }
        zzbi zzbiVar = zzJ().zzd;
        zzbiVar.getClass();
        zzvv zzvvVar = this.zzj;
        zzb();
        return new zzvt(zzbiVar.zzb, zza, new zztu(zzvvVar.zza), this.zzb, zzc(zzurVar), this.zzk, zze(zzurVar), this, zzyxVar, null, this.zzc, zzfy.zzq(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final synchronized zzbp zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zza(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.zze;
        }
        if (!this.zzd && this.zze == j10 && this.zzf == z10 && this.zzg == z11) {
            return;
        }
        this.zze = j10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzts
    protected final void zzn(zzhy zzhyVar) {
        this.zzh = zzhyVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzts
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzts, com.google.android.gms.internal.ads.zzut
    public final synchronized void zzt(zzbp zzbpVar) {
        this.zzi = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzz() {
    }
}
