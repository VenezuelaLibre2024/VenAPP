package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public abstract class zzbul extends zzayh implements zzbum {
    public zzbul() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzbtk zzb = zzbtj.zzb(parcel.readStrongBinder());
            zzayi.zzc(parcel);
            zzg(zzb);
        } else if (i10 == 2) {
            String readString = parcel.readString();
            zzayi.zzc(parcel);
            zze(readString);
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
