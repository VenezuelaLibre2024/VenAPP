package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbju extends zzayg implements zzbjw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbju(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zzb(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zzc(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zzd() {
        zzbm(2, zza());
    }
}
