package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class zzbkz extends zzayh implements zzbla {
    public zzbkz() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzbla zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return queryLocalInterface instanceof zzbla ? (zzbla) queryLocalInterface : new zzbky(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzblj zzblhVar;
        if (i10 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzblhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            zzblhVar = queryLocalInterface instanceof zzblj ? (zzblj) queryLocalInterface : new zzblh(readStrongBinder);
        }
        zzayi.zzc(parcel);
        zze(zzblhVar);
        parcel2.writeNoException();
        return true;
    }
}
