package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbzv extends zzayg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbzu zzbzuVar, String str, String str2) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbzuVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbm(2, zza);
    }
}
