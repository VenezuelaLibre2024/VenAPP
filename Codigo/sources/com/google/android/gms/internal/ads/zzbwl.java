package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbwl extends zzayh implements zzbwm {
    public zzbwl() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbwm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbwm ? (zzbwm) queryLocalInterface : new zzbwk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                Intent intent = (Intent) zzayi.zza(parcel, Intent.CREATOR);
                zzayi.zzc(parcel);
                zze(intent);
                break;
            case 2:
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzayi.zzc(parcel);
                zzi(f22, readString, readString2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzg(f23);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                com.google.android.gms.dynamic.b f24 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzf(createStringArray, createIntArray, f24);
                break;
            case 6:
                com.google.android.gms.dynamic.b f25 = b.a.f2(parcel.readStrongBinder());
                f9.a aVar = (f9.a) zzayi.zza(parcel, f9.a.CREATOR);
                zzayi.zzc(parcel);
                zzj(f25, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
