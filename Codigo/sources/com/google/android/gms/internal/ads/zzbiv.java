package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbiv extends zzayg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbiv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbyd zzbydVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbydVar);
        zzbm(1, zza);
    }
}
