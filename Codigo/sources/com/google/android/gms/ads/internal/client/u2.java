package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public abstract class u2 extends zzayh implements v2 {
    public u2() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzi();
        } else if (i10 == 2) {
            zzh();
        } else if (i10 == 3) {
            zzg();
        } else if (i10 == 4) {
            zze();
        } else {
            if (i10 != 5) {
                return false;
            }
            boolean zzg = zzayi.zzg(parcel);
            zzayi.zzc(parcel);
            zzf(zzg);
        }
        parcel2.writeNoException();
        return true;
    }
}