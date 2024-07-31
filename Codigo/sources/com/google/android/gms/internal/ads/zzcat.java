package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public abstract class zzcat extends zzayh implements zzcau {
    public zzcat() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzg();
        } else if (i10 == 2) {
            int readInt = parcel.readInt();
            zzayi.zzc(parcel);
            zze(readInt);
        } else {
            if (i10 != 3) {
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
