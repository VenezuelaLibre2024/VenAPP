package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhe implements zzgv {
    private zzhy zzb;
    private String zzc;
    private boolean zzf;
    private final zzhs zza = new zzhs();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzhe zzb(boolean z10) {
        this.zzf = true;
        return this;
    }

    public final zzhe zzc(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzhe zzd(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzhe zze(zzhy zzhyVar) {
        this.zzb = zzhyVar;
        return this;
    }

    public final zzhe zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    /* renamed from: zzg */
    public final zzhj zza() {
        zzhj zzhjVar = new zzhj(this.zzc, this.zzd, this.zze, this.zzf, this.zza);
        zzhy zzhyVar = this.zzb;
        if (zzhyVar != null) {
            zzhjVar.zzf(zzhyVar);
        }
        return zzhjVar;
    }
}
