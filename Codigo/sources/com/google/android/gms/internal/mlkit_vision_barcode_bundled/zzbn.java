package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbn extends zzb implements zzbo {
    public zzbn() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static zzbo asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        b f22 = b.a.f2(parcel.readStrongBinder());
        zzbc zzbcVar = (zzbc) zzc.zza(parcel, zzbc.CREATOR);
        zzc.zzb(parcel);
        zzbl newBarcodeScanner = newBarcodeScanner(f22, zzbcVar);
        parcel2.writeNoException();
        parcel2.writeStrongBinder(newBarcodeScanner == null ? null : newBarcodeScanner.asBinder());
        return true;
    }
}
