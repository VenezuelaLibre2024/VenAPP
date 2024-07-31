package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public abstract class m0 extends zzayh implements n0 {
    public m0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String zze;
        if (i10 != 1) {
            if (i10 == 2) {
                zze = zze();
            } else {
                if (i10 == 3) {
                    boolean zzi = zzi();
                    parcel2.writeNoException();
                    int i12 = zzayi.zza;
                    parcel2.writeInt(zzi ? 1 : 0);
                    return true;
                }
                if (i10 == 4) {
                    zze = zzf();
                } else {
                    if (i10 != 5) {
                        return false;
                    }
                    u4 u4Var = (u4) zzayi.zza(parcel, u4.CREATOR);
                    int readInt = parcel.readInt();
                    zzayi.zzc(parcel);
                    zzh(u4Var, readInt);
                }
            }
            parcel2.writeNoException();
            parcel2.writeString(zze);
            return true;
        }
        u4 u4Var2 = (u4) zzayi.zza(parcel, u4.CREATOR);
        zzayi.zzc(parcel);
        zzg(u4Var2);
        parcel2.writeNoException();
        return true;
    }
}
