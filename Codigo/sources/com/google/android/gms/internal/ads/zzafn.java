package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzafn extends zzadi {
    private final long zza;

    public zzafn(zzacv zzacvVar, long j10) {
        super(zzacvVar);
        zzek.zzd(zzacvVar.zzf() >= j10);
        this.zza = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzadi, com.google.android.gms.internal.ads.zzacv
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadi, com.google.android.gms.internal.ads.zzacv
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadi, com.google.android.gms.internal.ads.zzacv
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
