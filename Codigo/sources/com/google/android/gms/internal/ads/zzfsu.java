package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzfsu extends zzayg implements zzfsw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfsw
    public final void zze(com.google.android.gms.dynamic.b bVar, String str, String str2) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zza.writeString(str);
        zza.writeString(null);
        zzbm(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfsw
    public final void zzf() {
        zzbm(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfsw
    public final void zzg(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbm(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfsw
    public final void zzh(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzbm(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfsw
    public final void zzi(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbm(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfsw
    public final void zzj(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbm(5, zza);
    }
}
