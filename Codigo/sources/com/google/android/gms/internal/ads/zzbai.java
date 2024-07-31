package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.h2;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbai extends zzayh implements zzbaj {
    public zzbai() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface zze;
        zzbaq zzbaoVar;
        switch (i10) {
            case 2:
                zze = zze();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzban) {
                    }
                }
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzbaoVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbaoVar = queryLocalInterface2 instanceof zzbaq ? (zzbaq) queryLocalInterface2 : new zzbao(readStrongBinder2);
                }
                zzayi.zzc(parcel);
                zzi(f22, zzbaoVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zze = zzf();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zze);
                return true;
            case 6:
                boolean zzg = zzayi.zzg(parcel);
                zzayi.zzc(parcel);
                zzg(zzg);
                parcel2.writeNoException();
                return true;
            case 7:
                i2 f23 = h2.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzh(f23);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
