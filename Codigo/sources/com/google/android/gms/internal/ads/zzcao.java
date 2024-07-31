package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzcao extends zzayg implements zzcaq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zze() {
        zzbm(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzf() {
        zzbm(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzg() {
        zzbm(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzh(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbm(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzi(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzj() {
        zzbm(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzk(zzcak zzcakVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzcakVar);
        zzbm(3, zza);
    }
}
