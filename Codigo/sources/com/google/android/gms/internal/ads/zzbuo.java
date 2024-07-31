package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public abstract class zzbuo extends zzayh implements zzbup {
    public zzbuo() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            zzg();
        } else if (i10 == 3) {
            String readString = parcel.readString();
            zzayi.zzc(parcel);
            zze(readString);
        } else {
            if (i10 != 4) {
                return false;
            }
            c3 c3Var = (c3) zzayi.zza(parcel, c3.CREATOR);
            zzayi.zzc(parcel);
            zzf(c3Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
