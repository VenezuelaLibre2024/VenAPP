package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzbak extends zzayg implements zzbam {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzb(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzc(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzd(zzbaj zzbajVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbajVar);
        zzbm(1, zza);
    }
}
