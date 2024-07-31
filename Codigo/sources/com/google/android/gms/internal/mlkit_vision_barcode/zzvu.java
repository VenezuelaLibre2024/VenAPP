package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public final class zzvu extends zza implements zzvw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvu(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzvw
    public final zzvt zzd(b bVar, zzvl zzvlVar) {
        zzvt zzvtVar;
        Parcel zza = zza();
        zzc.zzb(zza, bVar);
        zzc.zza(zza, zzvlVar);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzvtVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            zzvtVar = queryLocalInterface instanceof zzvt ? (zzvt) queryLocalInterface : new zzvt(readStrongBinder);
        }
        zzb.recycle();
        return zzvtVar;
    }
}
