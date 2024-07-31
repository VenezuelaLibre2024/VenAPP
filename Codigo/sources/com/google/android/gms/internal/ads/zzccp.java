package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class zzccp extends zzayh implements zzccq {
    public zzccp() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            parcel.readString();
            parcel.readString();
            zzayi.zzc(parcel);
        } else if (i10 == 2) {
            String readString = parcel.readString();
            zzayi.zzc(parcel);
            zzb(readString);
        } else {
            if (i10 != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
            zzayi.zzc(parcel);
            zzc(readString2, readString3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
