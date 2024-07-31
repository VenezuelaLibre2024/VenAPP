package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbws extends zzayh implements zzbwt {
    public zzbws() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbwt zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof zzbwt ? (zzbwt) queryLocalInterface : new zzbwr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzl(bundle);
                break;
            case 2:
                break;
            case 3:
                zzt();
                break;
            case 4:
                zzr();
                break;
            case 5:
                zzo();
                break;
            case 6:
                Bundle bundle2 = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzs(bundle2);
                parcel2.writeNoException();
                zzayi.zze(parcel2, bundle2);
                return true;
            case 7:
                zzu();
                break;
            case 8:
                zzm();
                break;
            case 9:
                zzx();
                break;
            case 10:
                zzi();
                break;
            case 11:
                boolean zzH = zzH();
                parcel2.writeNoException();
                int i12 = zzayi.zza;
                parcel2.writeInt(zzH ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                zzayi.zzc(parcel);
                break;
            case 13:
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzk(f22);
                break;
            case 14:
                zzv();
                break;
            case 15:
                int readInt = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                zzayi.zzc(parcel);
                zzp(readInt, createStringArray, createIntArray);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
