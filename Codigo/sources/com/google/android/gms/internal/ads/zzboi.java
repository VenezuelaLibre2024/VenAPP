package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzboi extends zzayg implements zzbok {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final zzboh zze(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10, zzboe zzboeVar) {
        zzboh zzbofVar;
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        zzayi.zzf(zza, zzboeVar);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbofVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbofVar = queryLocalInterface instanceof zzboh ? (zzboh) queryLocalInterface : new zzbof(readStrongBinder);
        }
        zzbl.recycle();
        return zzbofVar;
    }
}
