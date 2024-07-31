package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public abstract class zzbta extends zzayh implements zzbtb {
    public zzbta() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbtb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbtb ? (zzbtb) queryLocalInterface : new zzbsz(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                int readInt = parcel.readInt();
                zzayi.zzc(parcel);
                zzg(readInt);
                parcel2.writeNoException();
                return true;
            case 4:
                zzn();
                parcel2.writeNoException();
                return true;
            case 5:
                zzp();
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzbtf) {
                    }
                }
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                zzm();
                parcel2.writeNoException();
                return true;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzayi.zzc(parcel);
                zzq(readString, readString2);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbkf.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 11:
                zzv();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.readString();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                zzy();
                parcel2.writeNoException();
                return true;
            case 14:
                zzcag zzcagVar = (zzcag) zzayi.zza(parcel, zzcag.CREATOR);
                zzayi.zzc(parcel);
                zzs(zzcagVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzw();
                parcel2.writeNoException();
                return true;
            case 16:
                zzcak zzb = zzcaj.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzt(zzb);
                parcel2.writeNoException();
                return true;
            case 17:
                int readInt2 = parcel.readInt();
                zzayi.zzc(parcel);
                zzj(readInt2);
                parcel2.writeNoException();
                return true;
            case 18:
                zzu();
                parcel2.writeNoException();
                return true;
            case 19:
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                zzx();
                parcel2.writeNoException();
                return true;
            case 21:
                String readString3 = parcel.readString();
                zzayi.zzc(parcel);
                zzl(readString3);
                parcel2.writeNoException();
                return true;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzayi.zzc(parcel);
                zzi(readInt3, readString4);
                parcel2.writeNoException();
                return true;
            case 23:
                c3 c3Var = (c3) zzayi.zza(parcel, c3.CREATOR);
                zzayi.zzc(parcel);
                zzh(c3Var);
                parcel2.writeNoException();
                return true;
            case 24:
                c3 c3Var2 = (c3) zzayi.zza(parcel, c3.CREATOR);
                zzayi.zzc(parcel);
                zzk(c3Var2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
