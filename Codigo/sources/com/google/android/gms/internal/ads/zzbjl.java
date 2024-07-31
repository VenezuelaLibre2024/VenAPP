package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class zzbjl extends zzayh implements zzbjm {
    public zzbjl() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbjm zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbjm ? (zzbjm) queryLocalInterface : new zzbjk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int zzd;
        if (i10 == 1) {
            com.google.android.gms.dynamic.b zzf = zzf();
            parcel2.writeNoException();
            zzayi.zzf(parcel2, zzf);
        } else if (i10 == 2) {
            Uri zze = zze();
            parcel2.writeNoException();
            zzayi.zze(parcel2, zze);
        } else if (i10 != 3) {
            if (i10 == 4) {
                zzd = zzd();
            } else {
                if (i10 != 5) {
                    return false;
                }
                zzd = zzc();
            }
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        } else {
            double zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(zzb);
        }
        return true;
    }
}
