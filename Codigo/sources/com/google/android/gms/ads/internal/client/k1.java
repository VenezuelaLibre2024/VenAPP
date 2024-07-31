package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbsv;

/* loaded from: classes.dex */
public final class k1 extends zzayg implements m1 {
    public k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.m1
    public final zzbsv getAdapterCreator() {
        Parcel zzbl = zzbl(2, zza());
        zzbsv zzf = zzbsu.zzf(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.m1
    public final q3 getLiteSdkVersion() {
        Parcel zzbl = zzbl(1, zza());
        q3 q3Var = (q3) zzayi.zza(zzbl, q3.CREATOR);
        zzbl.recycle();
        return q3Var;
    }
}
