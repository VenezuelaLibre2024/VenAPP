package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzbuk extends zzayg implements zzbum {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zzf(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zzg(zzbtk zzbtkVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbtkVar);
        zzbm(1, zza);
    }
}
