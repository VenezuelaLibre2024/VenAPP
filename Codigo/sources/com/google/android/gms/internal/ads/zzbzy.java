package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbzy extends zzayg implements zzcaa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcaa
    public final void zze(zzbzu zzbzuVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbzuVar);
        zzbm(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaa
    public final void zzf() {
        zzbm(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaa
    public final void zzg(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbm(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaa
    public final void zzh() {
        zzbm(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaa
    public final void zzi() {
        zzbm(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaa
    public final void zzj() {
        zzbm(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaa
    public final void zzk() {
        zzbm(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaa
    public final void zzl() {
        zzbm(3, zza());
    }
}
