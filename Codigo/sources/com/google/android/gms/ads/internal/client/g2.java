package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public final class g2 extends zzayg implements i2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.i2
    public final void x1(b5 b5Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, b5Var);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.i2
    public final boolean zzf() {
        Parcel zzbl = zzbl(2, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }
}
