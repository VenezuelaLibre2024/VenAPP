package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.m0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4865m0 extends zzayh implements InterfaceC4871n0 {
    public AbstractBinderC4865m0() {
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
                    C4917u4 c4917u4 = (C4917u4) zzayi.zza(parcel, C4917u4.CREATOR);
                    int readInt = parcel.readInt();
                    zzayi.zzc(parcel);
                    zzh(c4917u4, readInt);
                }
            }
            parcel2.writeNoException();
            parcel2.writeString(zze);
            return true;
        }
        C4917u4 c4917u42 = (C4917u4) zzayi.zza(parcel, C4917u4.CREATOR);
        zzayi.zzc(parcel);
        zzg(c4917u42);
        parcel2.writeNoException();
        return true;
    }
}
