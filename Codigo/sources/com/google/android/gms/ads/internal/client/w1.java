package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;

/* loaded from: classes.dex */
public abstract class w1 extends zzayh implements x1 {
    public w1() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static x1 f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof x1 ? (x1) queryLocalInterface : new v1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String zze;
        if (i10 == 1) {
            zze = zze();
        } else {
            if (i10 != 2) {
                return false;
            }
            zze = zzf();
        }
        parcel2.writeNoException();
        parcel2.writeString(zze);
        return true;
    }
}
