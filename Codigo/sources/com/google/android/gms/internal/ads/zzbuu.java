package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public abstract class zzbuu extends zzayh implements zzbuv {
    public zzbuu() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String readString = parcel.readString();
            zzayi.zzc(parcel);
            zze(readString);
        } else if (i10 == 2) {
            String readString2 = parcel.readString();
            zzayi.zzc(parcel);
            zzf(readString2);
        } else {
            if (i10 != 3) {
                return false;
            }
            c3 c3Var = (c3) zzayi.zza(parcel, c3.CREATOR);
            zzayi.zzc(parcel);
            zzg(c3Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
