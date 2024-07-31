package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbgw extends zzayh implements zzbgx {
    public zzbgw() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String zzb;
        if (i10 == 1) {
            zzb = zzb();
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                    zzayi.zzc(parcel);
                    zzd(f22);
                } else if (i10 == 4) {
                    zze();
                } else {
                    if (i10 != 5) {
                        return false;
                    }
                    zzf();
                }
                parcel2.writeNoException();
                return true;
            }
            zzb = zzc();
        }
        parcel2.writeNoException();
        parcel2.writeString(zzb);
        return true;
    }
}
