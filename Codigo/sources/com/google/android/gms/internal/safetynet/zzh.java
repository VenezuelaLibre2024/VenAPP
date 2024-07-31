package com.google.android.gms.internal.safetynet;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzh extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    public final void zzc(zzg zzgVar, byte[] bArr, String str) {
        Parcel zza = zza();
        zzc.zzb(zza, zzgVar);
        zza.writeByteArray(bArr);
        zza.writeString(str);
        zzb(7, zza);
    }

    public final void zzd(zzg zzgVar) {
        Parcel zza = zza();
        zzc.zzb(zza, zzgVar);
        zzb(4, zza);
    }

    public final void zze(zzg zzgVar) {
        Parcel zza = zza();
        zzc.zzb(zza, zzgVar);
        zzb(12, zza);
    }

    public final void zzf(zzg zzgVar) {
        Parcel zza = zza();
        zzc.zzb(zza, zzgVar);
        zzb(14, zza);
    }

    public final void zzg(zzg zzgVar) {
        Parcel zza = zza();
        zzc.zzb(zza, zzgVar);
        zzb(5, zza);
    }

    public final void zzh(zzg zzgVar, String str, int[] iArr, int i10, String str2) {
        Parcel zza = zza();
        zzc.zzb(zza, zzgVar);
        zza.writeString(str);
        zza.writeIntArray(iArr);
        zza.writeInt(i10);
        zza.writeString(str2);
        zzb(3, zza);
    }

    public final void zzi() {
        zzb(13, zza());
    }

    public final void zzj(zzg zzgVar, String str) {
        Parcel zza = zza();
        zzc.zzb(zza, zzgVar);
        zza.writeString(str);
        zzb(6, zza);
    }
}
