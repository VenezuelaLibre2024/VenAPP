package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbuf extends zzayh implements zzbug {
    public zzbuf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
            zzayi.zzc(parcel);
            zzg(f22);
        } else if (i10 == 2) {
            String readString = parcel.readString();
            zzayi.zzc(parcel);
            zze(readString);
        } else if (i10 == 3) {
            c3 c3Var = (c3) zzayi.zza(parcel, c3.CREATOR);
            zzayi.zzc(parcel);
            zzf(c3Var);
        } else {
            if (i10 != 4) {
                return false;
            }
            zzbte zzb = zzbtd.zzb(parcel.readStrongBinder());
            zzayi.zzc(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
