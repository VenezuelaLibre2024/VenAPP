package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbsv;

/* renamed from: com.google.android.gms.ads.internal.client.v0 */
/* loaded from: classes.dex */
public final class C4919v0 extends zzayg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4919v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: f2 */
    public final IBinder m12460f2(InterfaceC5312b interfaceC5312b, C4947z4 c4947z4, String str, zzbsv zzbsvVar, int i10, int i11) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzd(zza, c4947z4);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        zza.writeInt(i11);
        Parcel zzbl = zzbl(2, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        zzbl.recycle();
        return readStrongBinder;
    }
}
