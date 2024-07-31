package com.google.android.gms.internal.appset;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import q9.f;

/* loaded from: classes2.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzb((Status) zzc.zza(parcel, Status.CREATOR), (f) zzc.zza(parcel, f.CREATOR));
        return true;
    }
}
