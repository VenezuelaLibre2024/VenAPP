package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbsv;

/* loaded from: classes.dex */
public final class r0 extends zzayg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
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
