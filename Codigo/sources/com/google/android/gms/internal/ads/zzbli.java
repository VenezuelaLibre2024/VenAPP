package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.h2;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.s1;
import com.google.android.gms.ads.internal.client.t1;
import com.google.android.gms.ads.internal.client.w1;
import com.google.android.gms.ads.internal.client.x1;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbli extends zzayh implements zzblj {
    public zzbli() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String zzq;
        List zzu;
        IInterface zzk;
        zzblg zzbleVar;
        int i12;
        boolean z10;
        switch (i10) {
            case 2:
                zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 3:
                zzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(zzu);
                return true;
            case 4:
                zzq = zzo();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 5:
                zzk = zzk();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzk);
                return true;
            case 6:
                zzq = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 7:
                zzq = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                zzq = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 10:
                zzq = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 11:
                zzk = zzh();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzk);
                return true;
            case 12:
                zzq = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                zzk = zzi();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzk);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzz(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                boolean zzI = zzI(bundle2);
                parcel2.writeNoException();
                i12 = zzI;
                parcel2.writeInt(i12);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
                zzayi.zzc(parcel);
                zzB(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                zzk = zzm();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzk);
                return true;
            case 19:
                zzk = zzl();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzk);
                return true;
            case 20:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zzf);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbleVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbleVar = queryLocalInterface instanceof zzblg ? (zzblg) queryLocalInterface : new zzble(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzF(zzbleVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzw();
                parcel2.writeNoException();
                return true;
            case 23:
                zzu = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzu);
                return true;
            case 24:
                z10 = zzH();
                parcel2.writeNoException();
                int i13 = zzayi.zza;
                i12 = z10;
                parcel2.writeInt(i12);
                return true;
            case 25:
                x1 f22 = w1.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzy(f22);
                parcel2.writeNoException();
                return true;
            case 26:
                t1 f23 = s1.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzD(f23);
                parcel2.writeNoException();
                return true;
            case 27:
                zzC();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                zzk = zzj();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzk);
                return true;
            case 30:
                z10 = zzG();
                parcel2.writeNoException();
                int i132 = zzayi.zza;
                i12 = z10;
                parcel2.writeInt(i12);
                return true;
            case 31:
                zzk = zzg();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzk);
                return true;
            case 32:
                i2 f24 = h2.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzE(f24);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
