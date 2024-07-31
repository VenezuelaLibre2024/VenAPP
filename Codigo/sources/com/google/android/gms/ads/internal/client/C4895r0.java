package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbsv;

/* renamed from: com.google.android.gms.ads.internal.client.r0 */
/* loaded from: classes.dex */
public final class C4895r0 extends zzayg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4895r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder zze(InterfaceC5312b interfaceC5312b, String str, zzbsv zzbsvVar, int i10) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        zzbl.recycle();
        return readStrongBinder;
    }
}
