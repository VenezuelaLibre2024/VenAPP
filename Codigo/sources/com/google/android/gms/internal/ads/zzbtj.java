package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbtj extends zzayh implements zzbtk {
    public zzbtj() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbtk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof zzbtk ? (zzbtk) queryLocalInterface : new zzbti(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String zzs;
        IInterface zzl;
        int i12;
        float zzf;
        switch (i10) {
            case 2:
                zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 3:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 4:
                zzs = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 5:
                zzl = zzl();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzl);
                return true;
            case 6:
                zzs = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 7:
                zzs = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                zzs = zzu();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 10:
                zzs = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 11:
                zzl = zzj();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzl);
                return true;
            case 12:
                parcel2.writeNoException();
                zzl = null;
                zzayi.zzf(parcel2, zzl);
                return true;
            case 13:
                zzl = zzm();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzl);
                return true;
            case 14:
                zzl = zzn();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzl);
                return true;
            case 15:
                zzl = zzo();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzl);
                return true;
            case 16:
                Bundle zzi = zzi();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zzi);
                return true;
            case 17:
                i12 = zzB();
                parcel2.writeNoException();
                int i13 = zzayi.zza;
                parcel2.writeInt(i12);
                return true;
            case 18:
                i12 = zzA();
                parcel2.writeNoException();
                int i132 = zzayi.zza;
                parcel2.writeInt(i12);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzw(f22);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b f24 = b.a.f2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b f25 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzy(f23, f24, f25);
                parcel2.writeNoException();
                return true;
            case 22:
                com.google.android.gms.dynamic.b f26 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzz(f26);
                parcel2.writeNoException();
                return true;
            case 23:
                zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 24:
                zzf = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 25:
                zzf = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            default:
                return false;
        }
    }
}
