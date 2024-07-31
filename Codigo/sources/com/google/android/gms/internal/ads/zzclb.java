package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzclb extends zzayh implements zzclc {
    public zzclb() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String zzf;
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzp(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                Bundle zzd = zzd(bundle2);
                parcel2.writeNoException();
                zzayi.zze(parcel2, zzd);
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle3 = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzo(readString, readString2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzt(readString3, readString4, f22);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean zzg = zzayi.zzg(parcel);
                zzayi.zzc(parcel);
                Map zzk = zzk(readString5, readString6, zzg);
                parcel2.writeNoException();
                parcel2.writeMap(zzk);
                return true;
            case 6:
                String readString7 = parcel.readString();
                zzayi.zzc(parcel);
                int zzb = zzb(readString7);
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzq(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                Bundle bundle5 = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzm(readString8, readString9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                zzayi.zzc(parcel);
                List zzj = zzj(readString10, readString11);
                parcel2.writeNoException();
                parcel2.writeList(zzj);
                return true;
            case 10:
                zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 11:
                zzf = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 12:
                long zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(zzc);
                return true;
            case 13:
                String readString12 = parcel.readString();
                zzayi.zzc(parcel);
                zzl(readString12);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString13 = parcel.readString();
                zzayi.zzc(parcel);
                zzn(readString13);
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                zzayi.zzc(parcel);
                zzs(f23, readString14, readString15);
                parcel2.writeNoException();
                return true;
            case 16:
                zzf = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 17:
                zzf = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 18:
                zzf = zze();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzr(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
