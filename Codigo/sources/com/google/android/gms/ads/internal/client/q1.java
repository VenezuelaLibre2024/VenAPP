package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public final class q1 extends zzayg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder f2(com.google.android.gms.dynamic.b bVar, int i10) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        zzbl.recycle();
        return readStrongBinder;
    }
}
