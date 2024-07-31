package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzbue extends zzayg implements zzbug {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzf(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzg(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzh(zzbte zzbteVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbteVar);
        zzbm(4, zza);
    }
}
