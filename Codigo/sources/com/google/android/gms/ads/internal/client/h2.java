package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public abstract class h2 extends zzayh implements i2 {
    public h2() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static i2 f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof i2 ? (i2) queryLocalInterface : new g2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            b5 b5Var = (b5) zzayi.zza(parcel, b5.CREATOR);
            zzayi.zzc(parcel);
            x1(b5Var);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i12 = zzayi.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
