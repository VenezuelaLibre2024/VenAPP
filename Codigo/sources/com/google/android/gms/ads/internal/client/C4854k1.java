package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbsv;

/* renamed from: com.google.android.gms.ads.internal.client.k1 */
/* loaded from: classes.dex */
public final class C4854k1 extends zzayg implements InterfaceC4866m1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4854k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4866m1
    public final zzbsv getAdapterCreator() {
        Parcel zzbl = zzbl(2, zza());
        zzbsv zzf = zzbsu.zzf(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4866m1
    public final C4892q3 getLiteSdkVersion() {
        Parcel zzbl = zzbl(1, zza());
        C4892q3 c4892q3 = (C4892q3) zzayi.zza(zzbl, C4892q3.CREATOR);
        zzbl.recycle();
        return c4892q3;
    }
}
