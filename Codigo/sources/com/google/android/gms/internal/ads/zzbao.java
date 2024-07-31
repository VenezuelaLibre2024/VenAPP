package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzbao extends zzayg implements zzbaq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzb() {
        zzbm(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzc() {
        zzbm(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzd(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zze() {
        zzbm(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzf() {
        zzbm(1, zza());
    }
}
