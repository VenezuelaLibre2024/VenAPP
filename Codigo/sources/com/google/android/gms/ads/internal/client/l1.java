package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbsv;

/* loaded from: classes.dex */
public abstract class l1 extends zzayh implements m1 {
    public l1() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static m1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof m1 ? (m1) queryLocalInterface : new k1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            q3 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzayi.zze(parcel2, liteSdkVersion);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzbsv adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzayi.zzf(parcel2, adapterCreator);
        }
        return true;
    }
}
