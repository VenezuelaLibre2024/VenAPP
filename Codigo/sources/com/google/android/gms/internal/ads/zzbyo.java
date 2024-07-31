package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbyo extends zzayg implements zzbyq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zze(zzbze zzbzeVar, zzbza zzbzaVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, zzbzeVar);
        zzayi.zzf(zza, zzbzaVar);
        zzbm(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzf(zzbze zzbzeVar, zzbza zzbzaVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, zzbzeVar);
        zzayi.zzf(zza, zzbzaVar);
        zzbm(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzg(zzbze zzbzeVar, zzbza zzbzaVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, zzbzeVar);
        zzayi.zzf(zza, zzbzaVar);
        zzbm(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzh(String str, zzbza zzbzaVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzayi.zzf(zza, zzbzaVar);
        zzbm(7, zza);
    }
}
