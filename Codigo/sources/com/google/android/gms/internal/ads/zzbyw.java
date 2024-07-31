package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.d0;

/* loaded from: classes2.dex */
public abstract class zzbyw extends zzayh implements zzbyx {
    public zzbyw() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzayi.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzayi.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else {
            if (i10 != 2) {
                return false;
            }
            d0 d0Var = (d0) zzayi.zza(parcel, d0.CREATOR);
            zzayi.zzc(parcel);
            zze(d0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
