package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbji extends zzayh implements zzbjj {
    public zzbji() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        float zze;
        IInterface zzi;
        zzbku zzbkuVar;
        int i12;
        switch (i10) {
            case 2:
                zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzj(f22);
                parcel2.writeNoException();
                return true;
            case 4:
                zzi = zzi();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzi);
                return true;
            case 5:
                zze = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 6:
                zze = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 7:
                zzi = zzh();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzi);
                return true;
            case 8:
                i12 = zzl();
                parcel2.writeNoException();
                int i13 = zzayi.zza;
                parcel2.writeInt(i12);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbkuVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbkuVar = queryLocalInterface instanceof zzbku ? (zzbku) queryLocalInterface : new zzbku(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzm(zzbkuVar);
                parcel2.writeNoException();
                return true;
            case 10:
                i12 = zzk();
                parcel2.writeNoException();
                int i132 = zzayi.zza;
                parcel2.writeInt(i12);
                return true;
            default:
                return false;
        }
    }
}
