package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbka extends zzayh implements zzbkb {
    public zzbka() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface zzh;
        String zzk;
        switch (i10) {
            case 2:
                zzh = zzh();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzh);
                return true;
            case 3:
                zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(zzo);
                return true;
            case 5:
                zzk = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 6:
                zzh = zzf();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzh);
                return true;
            case 7:
                zzk = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 8:
                double zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(zzb);
                return true;
            case 9:
                zzk = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 10:
                zzk = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 11:
                Bundle zzc = zzc();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                zzh = zzd();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzh);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzq(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                boolean zzs = zzs(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzs ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzr(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                zzh = zze();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzh);
                return true;
            case 18:
                zzh = zzg();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzh);
                return true;
            case 19:
                zzk = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            default:
                return false;
        }
    }
}
