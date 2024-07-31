package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzcae extends zzayh implements zzcaf {
    public zzcae() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzcaf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzcaf ? (zzcaf) queryLocalInterface : new zzcad(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzl(f22);
                break;
            case 2:
                com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzayi.zzc(parcel);
                zzk(f23, readInt);
                break;
            case 3:
                com.google.android.gms.dynamic.b f24 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzi(f24);
                break;
            case 4:
                com.google.android.gms.dynamic.b f25 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzj(f25);
                break;
            case 5:
                com.google.android.gms.dynamic.b f26 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzo(f26);
                break;
            case 6:
                com.google.android.gms.dynamic.b f27 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzf(f27);
                break;
            case 7:
                com.google.android.gms.dynamic.b f28 = b.a.f2(parcel.readStrongBinder());
                zzcag zzcagVar = (zzcag) zzayi.zza(parcel, zzcag.CREATOR);
                zzayi.zzc(parcel);
                zzm(f28, zzcagVar);
                break;
            case 8:
                com.google.android.gms.dynamic.b f29 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zze(f29);
                break;
            case 9:
                com.google.android.gms.dynamic.b f210 = b.a.f2(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzayi.zzc(parcel);
                zzg(f210, readInt2);
                break;
            case 10:
                com.google.android.gms.dynamic.b f211 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzh(f211);
                break;
            case 11:
                com.google.android.gms.dynamic.b f212 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzn(f212);
                break;
            case 12:
                zzayi.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
