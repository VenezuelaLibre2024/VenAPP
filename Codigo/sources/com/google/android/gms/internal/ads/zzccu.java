package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzccu extends zzayg implements zzccw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final zzcct zze(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10) {
        zzcct zzccrVar;
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(2, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzccrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzccrVar = queryLocalInterface instanceof zzcct ? (zzcct) queryLocalInterface : new zzccr(readStrongBinder);
        }
        zzbl.recycle();
        return zzccrVar;
    }
}
