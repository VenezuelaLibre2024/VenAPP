package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public abstract class i1 extends zzayh implements j1 {
    public i1() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            c3 c3Var = (c3) zzayi.zza(parcel, c3.CREATOR);
            zzayi.zzc(parcel);
            zzd(c3Var);
        } else if (i10 == 2) {
            zzf();
        } else if (i10 == 3) {
            zzc();
        } else if (i10 == 4) {
            zze();
        } else {
            if (i10 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
