package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbow extends zzayg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbow(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzboq zzboqVar, zzbov zzbovVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, zzboqVar);
        zzayi.zzf(zza, zzbovVar);
        zzbn(2, zza);
    }
}
