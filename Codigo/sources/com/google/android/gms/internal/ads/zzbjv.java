package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbjv extends zzayh implements zzbjw {
    public zzbjv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbjw zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof zzbjw ? (zzbjw) queryLocalInterface : new zzbju(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
            zzayi.zzc(parcel);
            zzc(f22);
        } else if (i10 == 2) {
            zzd();
        } else {
            if (i10 != 3) {
                return false;
            }
            com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
            zzayi.zzc(parcel);
            zzb(f23);
        }
        parcel2.writeNoException();
        return true;
    }
}
