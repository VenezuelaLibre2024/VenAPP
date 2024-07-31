package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbwn extends zzayg implements zzbwp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final zzbwm zze(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10) {
        zzbwm zzbwkVar;
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbwkVar = queryLocalInterface instanceof zzbwm ? (zzbwm) queryLocalInterface : new zzbwk(readStrongBinder);
        }
        zzbl.recycle();
        return zzbwkVar;
    }
}
