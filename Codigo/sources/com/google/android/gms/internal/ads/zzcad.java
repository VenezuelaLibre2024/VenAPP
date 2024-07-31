package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzcad extends zzayg implements zzcaf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zze(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzf(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzg(com.google.android.gms.dynamic.b bVar, int i10) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zza.writeInt(i10);
        zzbm(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzh(com.google.android.gms.dynamic.b bVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzi(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzj(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzk(com.google.android.gms.dynamic.b bVar, int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzl(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzm(com.google.android.gms.dynamic.b bVar, zzcag zzcagVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, zzcagVar);
        zzbm(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzn(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzo(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(5, zza);
    }
}
