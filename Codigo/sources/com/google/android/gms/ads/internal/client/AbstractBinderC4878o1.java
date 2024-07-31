package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbsv;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.client.o1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4878o1 extends zzayh implements InterfaceC4884p1 {
    public AbstractBinderC4878o1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC4800c2 c4944z1;
        switch (i10) {
            case 1:
                zzk();
                break;
            case 2:
                float readFloat = parcel.readFloat();
                zzayi.zzc(parcel);
                zzq(readFloat);
                break;
            case 3:
                String readString = parcel.readString();
                zzayi.zzc(parcel);
                zzr(readString);
                break;
            case 4:
                boolean zzg = zzayi.zzg(parcel);
                zzayi.zzc(parcel);
                zzp(zzg);
                break;
            case 5:
                InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                zzayi.zzc(parcel);
                zzn(m13410f2, readString2);
                break;
            case 6:
                String readString3 = parcel.readString();
                InterfaceC5312b m13410f22 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzl(readString3, m13410f22);
                break;
            case 7:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 8:
                boolean zzv = zzv();
                parcel2.writeNoException();
                int i12 = zzayi.zza;
                parcel2.writeInt(zzv ? 1 : 0);
                return true;
            case 9:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 10:
                String readString4 = parcel.readString();
                zzayi.zzc(parcel);
                zzh(readString4);
                break;
            case 11:
                zzbsv zzf2 = zzbsu.zzf(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzo(zzf2);
                break;
            case 12:
                zzbpk zzc = zzbpj.zzc(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzs(zzc);
                break;
            case 13:
                List zzg2 = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg2);
                return true;
            case 14:
                C4844i4 c4844i4 = (C4844i4) zzayi.zza(parcel, C4844i4.CREATOR);
                zzayi.zzc(parcel);
                zzu(c4844i4);
                break;
            case 15:
                zzi();
                break;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c4944z1 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    c4944z1 = queryLocalInterface instanceof InterfaceC4800c2 ? (InterfaceC4800c2) queryLocalInterface : new C4944z1(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzm(c4944z1);
                break;
            case 17:
                boolean zzg3 = zzayi.zzg(parcel);
                zzayi.zzc(parcel);
                zzj(zzg3);
                break;
            case 18:
                String readString5 = parcel.readString();
                zzayi.zzc(parcel);
                zzt(readString5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
