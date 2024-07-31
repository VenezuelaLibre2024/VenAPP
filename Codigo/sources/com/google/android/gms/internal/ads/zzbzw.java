package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.x0;
import com.google.android.gms.ads.internal.client.y0;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbzw extends zzayh implements zzbzx {
    public zzbzw() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int i12;
        if (i10 == 1) {
            zzcab zzcabVar = (zzcab) zzayi.zza(parcel, zzcab.CREATOR);
            zzayi.zzc(parcel);
            zzg(zzcabVar);
        } else if (i10 != 2) {
            zzcaa zzcaaVar = null;
            zzbzv zzbzvVar = null;
            if (i10 == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzcaaVar = queryLocalInterface instanceof zzcaa ? (zzcaa) queryLocalInterface : new zzbzy(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzo(zzcaaVar);
            } else {
                if (i10 != 34) {
                    switch (i10) {
                        case 5:
                            i12 = zzs();
                            break;
                        case 6:
                            zzh();
                            break;
                        case 7:
                            zzj();
                            break;
                        case 8:
                            zze();
                            break;
                        case 9:
                            com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                            zzayi.zzc(parcel);
                            zzi(f22);
                            break;
                        case 10:
                            com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                            zzayi.zzc(parcel);
                            zzk(f23);
                            break;
                        case 11:
                            com.google.android.gms.dynamic.b f24 = b.a.f2(parcel.readStrongBinder());
                            zzayi.zzc(parcel);
                            zzf(f24);
                            break;
                        case 12:
                            String zzd = zzd();
                            parcel2.writeNoException();
                            parcel2.writeString(zzd);
                            return true;
                        case 13:
                            String readString = parcel.readString();
                            zzayi.zzc(parcel);
                            zzp(readString);
                            break;
                        case 14:
                            y0 f25 = x0.f2(parcel.readStrongBinder());
                            zzayi.zzc(parcel);
                            zzl(f25);
                            break;
                        case 15:
                            Bundle zzb = zzb();
                            parcel2.writeNoException();
                            zzayi.zze(parcel2, zzb);
                            return true;
                        case 16:
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                zzbzvVar = queryLocalInterface2 instanceof zzbzv ? (zzbzv) queryLocalInterface2 : new zzbzv(readStrongBinder2);
                            }
                            zzayi.zzc(parcel);
                            zzu(zzbzvVar);
                            break;
                        case 17:
                            parcel.readString();
                            zzayi.zzc(parcel);
                            break;
                        case 18:
                            com.google.android.gms.dynamic.b f26 = b.a.f2(parcel.readStrongBinder());
                            zzayi.zzc(parcel);
                            zzr(f26);
                            break;
                        case 19:
                            String readString2 = parcel.readString();
                            zzayi.zzc(parcel);
                            zzm(readString2);
                            break;
                        case 20:
                            i12 = zzt();
                            break;
                        case 21:
                            p2 zzc = zzc();
                            parcel2.writeNoException();
                            zzayi.zzf(parcel2, zzc);
                            return true;
                        default:
                            return false;
                    }
                    parcel2.writeNoException();
                    int i13 = zzayi.zza;
                    parcel2.writeInt(i12);
                    return true;
                }
                boolean zzg = zzayi.zzg(parcel);
                zzayi.zzc(parcel);
                zzn(zzg);
            }
        } else {
            zzq();
        }
        parcel2.writeNoException();
        return true;
    }
}
