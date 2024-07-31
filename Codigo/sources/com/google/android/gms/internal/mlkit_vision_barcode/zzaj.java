package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public final class zzaj extends zza {
    public zzaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void zzd() {
        zzc(3, zza());
    }

    public final zzu[] zze(b bVar, zzan zzanVar) {
        Parcel zza = zza();
        zzc.zzb(zza, bVar);
        zzc.zza(zza, zzanVar);
        Parcel zzb = zzb(1, zza);
        zzu[] zzuVarArr = (zzu[]) zzb.createTypedArray(zzu.CREATOR);
        zzb.recycle();
        return zzuVarArr;
    }

    public final zzu[] zzf(b bVar, zzan zzanVar) {
        Parcel zza = zza();
        zzc.zzb(zza, bVar);
        zzc.zza(zza, zzanVar);
        Parcel zzb = zzb(2, zza);
        zzu[] zzuVarArr = (zzu[]) zzb.createTypedArray(zzu.CREATOR);
        zzb.recycle();
        return zzuVarArr;
    }
}