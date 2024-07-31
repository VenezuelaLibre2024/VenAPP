package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public final class i0 extends zzayg implements k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.k0
    public final void zzb(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.k0
    public final void zzc() {
        zzbm(1, zza());
    }
}
