package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public final class l0 extends zzayg implements n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.n0
    public final void zzg(u4 u4Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, u4Var);
        zzbm(1, zza);
    }
}
