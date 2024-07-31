package com.google.android.gms.internal.safetynet;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import xa.b;
import xa.g;
import xa.j;
import xa.l;
import xa.n;

/* loaded from: classes2.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    @Override // com.google.android.gms.internal.safetynet.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzd((Status) zzc.zza(parcel, Status.CREATOR), (g) zzc.zza(parcel, g.CREATOR));
        } else if (i10 == 2) {
            zze(parcel.readString());
        } else if (i10 == 3) {
            zzj((Status) zzc.zza(parcel, Status.CREATOR), (b) zzc.zza(parcel, b.CREATOR));
        } else if (i10 == 4) {
            zzb((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzc(parcel));
        } else if (i10 == 6) {
            zzh((Status) zzc.zza(parcel, Status.CREATOR), (l) zzc.zza(parcel, l.CREATOR));
        } else if (i10 == 8) {
            zzg((Status) zzc.zza(parcel, Status.CREATOR), (j) zzc.zza(parcel, j.CREATOR));
        } else if (i10 == 10) {
            zzf((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzc(parcel));
        } else if (i10 == 11) {
            zzc((Status) zzc.zza(parcel, Status.CREATOR));
        } else if (i10 == 15) {
            zzi((Status) zzc.zza(parcel, Status.CREATOR), (n) zzc.zza(parcel, n.CREATOR));
        } else {
            if (i10 != 16) {
                return false;
            }
            zzk((Status) zzc.zza(parcel, Status.CREATOR), parcel.readString(), parcel.readInt());
        }
        return true;
    }
}