package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.location.r;

/* loaded from: classes2.dex */
public abstract class zzr extends zzb implements zzs {
    public zzr() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        r rVar = (r) zzc.zza(parcel, r.CREATOR);
        zzc.zzb(parcel);
        zzb(rVar);
        return true;
    }
}
