package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzcld extends zzayg implements zzclf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcld(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzclf
    public final void zze(com.google.android.gms.dynamic.b bVar, zzclc zzclcVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzclcVar);
        zzbm(2, zza);
    }
}
