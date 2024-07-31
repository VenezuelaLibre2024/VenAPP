package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.d0;

/* loaded from: classes2.dex */
public final class zzbyv extends zzayg implements zzbyx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final void zze(d0 d0Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, d0Var);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel zza = zza();
        zzayi.zzd(zza, parcelFileDescriptor);
        zzbm(1, zza);
    }
}
