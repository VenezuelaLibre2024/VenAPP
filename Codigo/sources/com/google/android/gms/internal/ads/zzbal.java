package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public abstract class zzbal extends zzayh implements zzbam {
    public zzbal() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbam zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof zzbam ? (zzbam) queryLocalInterface : new zzbak(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbaj zzbahVar;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbahVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbahVar = queryLocalInterface instanceof zzbaj ? (zzbaj) queryLocalInterface : new zzbah(readStrongBinder);
            }
            zzayi.zzc(parcel);
            zzd(zzbahVar);
        } else if (i10 == 2) {
            parcel.readInt();
            zzayi.zzc(parcel);
        } else {
            if (i10 != 3) {
                return false;
            }
            c3 c3Var = (c3) zzayi.zza(parcel, c3.CREATOR);
            zzayi.zzc(parcel);
            zzc(c3Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
