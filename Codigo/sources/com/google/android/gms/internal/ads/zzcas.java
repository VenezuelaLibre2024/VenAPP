package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzcas extends zzayg implements zzcau {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcas(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zze(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzf(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzg() {
        zzbm(1, zza());
    }
}
