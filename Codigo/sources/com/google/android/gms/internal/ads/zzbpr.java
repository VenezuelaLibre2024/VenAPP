package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbpr extends zzayh implements zzbps {
    public zzbpr() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface zzb;
        zzbpv zzbptVar;
        if (i10 != 3) {
            if (i10 == 4) {
                zzd();
            } else if (i10 == 5) {
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbptVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    zzbptVar = queryLocalInterface instanceof zzbpv ? (zzbpv) queryLocalInterface : new zzbpt(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzf(f22, zzbptVar);
            } else if (i10 == 6) {
                com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zze(f23);
            } else {
                if (i10 != 7) {
                    return false;
                }
                zzb = zzc();
            }
            parcel2.writeNoException();
            return true;
        }
        zzb = zzb();
        parcel2.writeNoException();
        zzayi.zzf(parcel2, zzb);
        return true;
    }
}
