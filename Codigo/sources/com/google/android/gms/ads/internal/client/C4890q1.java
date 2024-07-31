package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.q1 */
/* loaded from: classes.dex */
public final class C4890q1 extends zzayg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4890q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    /* renamed from: f2 */
    public final IBinder m12435f2(InterfaceC5312b interfaceC5312b, int i10) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        zzbl.recycle();
        return readStrongBinder;
    }
}
