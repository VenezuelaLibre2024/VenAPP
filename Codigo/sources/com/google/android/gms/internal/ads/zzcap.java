package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public abstract class zzcap extends zzayh implements zzcaq {
    public zzcap() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzcak zzcaiVar;
        switch (i10) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcaiVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzcaiVar = queryLocalInterface instanceof zzcak ? (zzcak) queryLocalInterface : new zzcai(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzk(zzcaiVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                zzayi.zzc(parcel);
                zzh(readInt);
                break;
            case 5:
                c3 c3Var = (c3) zzayi.zza(parcel, c3.CREATOR);
                zzayi.zzc(parcel);
                zzi(c3Var);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
