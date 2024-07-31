package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbkf extends zzayh implements zzbkg {
    public zzbkf() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbkg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzbkg ? (zzbkg) queryLocalInterface : new zzbke(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String zzj;
        IInterface zzg;
        boolean z10;
        int i12;
        boolean z11;
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                zzayi.zzc(parcel);
                zzj = zzj(readString);
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzayi.zzc(parcel);
                zzg = zzg(readString2);
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzg);
                return true;
            case 3:
                List<String> zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(zzk);
                return true;
            case 4:
                zzj = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzayi.zzc(parcel);
                zzn(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                zzg = zze();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzg);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzg = zzh();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzg);
                return true;
            case 10:
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                z11 = zzs(f22);
                parcel2.writeNoException();
                i12 = z11;
                parcel2.writeInt(i12);
                return true;
            case 11:
                parcel2.writeNoException();
                zzg = null;
                zzayi.zzf(parcel2, zzg);
                return true;
            case 12:
                z10 = zzq();
                parcel2.writeNoException();
                int i13 = zzayi.zza;
                i12 = z10;
                parcel2.writeInt(i12);
                return true;
            case 13:
                z10 = zzt();
                parcel2.writeNoException();
                int i132 = zzayi.zza;
                i12 = z10;
                parcel2.writeInt(i12);
                return true;
            case 14:
                com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzp(f23);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                zzg = zzf();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzg);
                return true;
            case 17:
                com.google.android.gms.dynamic.b f24 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                z11 = zzr(f24);
                parcel2.writeNoException();
                i12 = z11;
                parcel2.writeInt(i12);
                return true;
            default:
                return false;
        }
    }
}
