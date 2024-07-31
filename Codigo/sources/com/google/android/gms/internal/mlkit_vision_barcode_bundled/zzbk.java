package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbk extends zzb implements zzbl {
    public zzbk() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzc();
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                b f22 = b.a.f2(parcel.readStrongBinder());
                zzbu zzbuVar = (zzbu) zzc.zza(parcel, zzbu.CREATOR);
                zzc.zzb(parcel);
                List zzb = zzb(f22, zzbuVar);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzb);
                return true;
            }
            zzd();
        }
        parcel2.writeNoException();
        return true;
    }
}
