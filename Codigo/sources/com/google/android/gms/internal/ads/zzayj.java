package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzayj extends zzayg implements zzayl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zze(com.google.android.gms.dynamic.b bVar, String str) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zza.writeString("GMA_SDK");
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zzf() {
        zzbm(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zzg(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbm(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zzh(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzbm(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zzi(int i10) {
        Parcel zza = zza();
        zza.writeInt(0);
        zzbm(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zzj(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbm(5, zza);
    }
}
