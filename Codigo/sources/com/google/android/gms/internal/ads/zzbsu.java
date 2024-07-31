package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class zzbsu extends zzayh implements zzbsv {
    public zzbsu() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbsv zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbsv ? (zzbsv) queryLocalInterface : new zzbst(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface zzb;
        int i12;
        if (i10 != 1) {
            if (i10 == 2) {
                String readString = parcel.readString();
                zzayi.zzc(parcel);
                i12 = zze(readString);
            } else if (i10 == 3) {
                String readString2 = parcel.readString();
                zzayi.zzc(parcel);
                zzb = zzc(readString2);
            } else {
                if (i10 != 4) {
                    return false;
                }
                String readString3 = parcel.readString();
                zzayi.zzc(parcel);
                i12 = zzd(readString3);
            }
            parcel2.writeNoException();
            parcel2.writeInt(i12);
            return true;
        }
        String readString4 = parcel.readString();
        zzayi.zzc(parcel);
        zzb = zzb(readString4);
        parcel2.writeNoException();
        zzayi.zzf(parcel2, zzb);
        return true;
    }
}
