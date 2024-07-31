package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbst extends zzayg implements zzbsv {
    public zzbst(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final zzbsy zzb(String str) {
        zzbsy zzbswVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbswVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbswVar = queryLocalInterface instanceof zzbsy ? (zzbsy) queryLocalInterface : new zzbsw(readStrongBinder);
        }
        zzbl.recycle();
        return zzbswVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final zzbus zzc(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbl = zzbl(3, zza);
        zzbus zzb = zzbur.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final boolean zzd(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbl = zzbl(4, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final boolean zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbl = zzbl(2, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }
}
