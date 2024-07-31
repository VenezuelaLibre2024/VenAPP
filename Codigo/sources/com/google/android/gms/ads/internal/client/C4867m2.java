package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbsv;

/* renamed from: com.google.android.gms.ads.internal.client.m2 */
/* loaded from: classes.dex */
public final class C4867m2 extends zzayg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4867m2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    /* renamed from: f2 */
    public final InterfaceC4861l2 m12407f2(InterfaceC5312b interfaceC5312b, zzbsv zzbsvVar, int i10) {
        InterfaceC4861l2 c4849j2;
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4849j2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c4849j2 = queryLocalInterface instanceof InterfaceC4861l2 ? (InterfaceC4861l2) queryLocalInterface : new C4849j2(readStrongBinder);
        }
        zzbl.recycle();
        return c4849j2;
    }
}
