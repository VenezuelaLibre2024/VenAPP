package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbkc extends zzayh implements zzbkd {
    public zzbkc() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface zzg;
        String zzk;
        switch (i10) {
            case 2:
                zzg = zzg();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzg);
                return true;
            case 3:
                zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(zzm);
                return true;
            case 5:
                zzk = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 6:
                zzg = zze();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzg);
                return true;
            case 7:
                zzk = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 8:
                zzk = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                zzg = zzc();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzg);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzo(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                boolean zzq = zzq(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzp(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                zzg = zzd();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzg);
                return true;
            case 16:
                zzg = zzf();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzg);
                return true;
            case 17:
                zzk = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            default:
                return false;
        }
    }
}
