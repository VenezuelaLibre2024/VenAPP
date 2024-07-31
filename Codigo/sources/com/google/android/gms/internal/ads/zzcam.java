package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.e2;
import com.google.android.gms.ads.internal.client.f2;
import com.google.android.gms.ads.internal.client.h2;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzcam extends zzayh implements zzcan {
    public zzcam() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzcan zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzcan ? (zzcan) queryLocalInterface : new zzcal(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface zzd;
        zzcau zzcauVar = null;
        zzcau zzcauVar2 = null;
        zzcav zzcavVar = null;
        zzcaq zzcaqVar = null;
        switch (i10) {
            case 1:
                u4 u4Var = (u4) zzayi.zza(parcel, u4.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcauVar = queryLocalInterface instanceof zzcau ? (zzcau) queryLocalInterface : new zzcas(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzf(u4Var, zzcauVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcaqVar = queryLocalInterface2 instanceof zzcaq ? (zzcaq) queryLocalInterface2 : new zzcao(readStrongBinder2);
                }
                zzayi.zzc(parcel);
                zzk(zzcaqVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i12 = zzayi.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzm(f22);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzcavVar = queryLocalInterface3 instanceof zzcav ? (zzcav) queryLocalInterface3 : new zzcav(readStrongBinder3);
                }
                zzayi.zzc(parcel);
                zzp(zzcavVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcbb zzcbbVar = (zzcbb) zzayi.zza(parcel, zzcbb.CREATOR);
                zzayi.zzc(parcel);
                zzl(zzcbbVar);
                parcel2.writeNoException();
                return true;
            case 8:
                f2 f23 = e2.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzi(f23);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zzb);
                return true;
            case 10:
                com.google.android.gms.dynamic.b f24 = b.a.f2(parcel.readStrongBinder());
                boolean zzg = zzayi.zzg(parcel);
                zzayi.zzc(parcel);
                zzn(f24, zzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzd = zzd();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzd);
                return true;
            case 12:
                zzd = zzc();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzd);
                return true;
            case 13:
                i2 f25 = h2.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzj(f25);
                parcel2.writeNoException();
                return true;
            case 14:
                u4 u4Var2 = (u4) zzayi.zza(parcel, u4.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcauVar2 = queryLocalInterface4 instanceof zzcau ? (zzcau) queryLocalInterface4 : new zzcas(readStrongBinder4);
                }
                zzayi.zzc(parcel);
                zzg(u4Var2, zzcauVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzg2 = zzayi.zzg(parcel);
                zzayi.zzc(parcel);
                zzh(zzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
