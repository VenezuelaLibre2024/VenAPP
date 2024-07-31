package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzcav extends zzayg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcav(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcak zzcakVar, String str, String str2) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzcakVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbm(2, zza);
    }
}
