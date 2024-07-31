package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzfsd extends zzayg {
    public zzfsd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfsb zze(zzfrz zzfrzVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, zzfrzVar);
        Parcel zzbl = zzbl(1, zza);
        zzfsb zzfsbVar = (zzfsb) zzayi.zza(zzbl, zzfsb.CREATOR);
        zzbl.recycle();
        return zzfsbVar;
    }

    public final zzfsk zzf(zzfsi zzfsiVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, zzfsiVar);
        Parcel zzbl = zzbl(3, zza);
        zzfsk zzfskVar = (zzfsk) zzayi.zza(zzbl, zzfsk.CREATOR);
        zzbl.recycle();
        return zzfskVar;
    }

    public final void zzg(zzfrw zzfrwVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, zzfrwVar);
        zzbm(2, zza);
    }
}
