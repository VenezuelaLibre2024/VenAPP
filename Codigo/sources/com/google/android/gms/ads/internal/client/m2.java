package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbsv;

/* loaded from: classes.dex */
public final class m2 extends zzayg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final l2 f2(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10) {
        l2 j2Var;
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            j2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            j2Var = queryLocalInterface instanceof l2 ? (l2) queryLocalInterface : new j2(readStrongBinder);
        }
        zzbl.recycle();
        return j2Var;
    }
}
