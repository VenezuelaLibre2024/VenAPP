package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzcar extends zzayg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcar(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(com.google.android.gms.dynamic.b bVar, String str, zzbsv zzbsvVar, int i10) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        zzbl.recycle();
        return readStrongBinder;
    }
}
