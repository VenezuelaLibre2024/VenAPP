package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbky extends zzayg implements zzbla {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbky(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final void zze(zzblj zzbljVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbljVar);
        zzbm(1, zza);
    }
}
