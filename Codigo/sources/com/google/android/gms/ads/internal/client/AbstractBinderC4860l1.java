package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbsv;

/* renamed from: com.google.android.gms.ads.internal.client.l1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4860l1 extends zzayh implements InterfaceC4866m1 {
    public AbstractBinderC4860l1() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static InterfaceC4866m1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof InterfaceC4866m1 ? (InterfaceC4866m1) queryLocalInterface : new C4854k1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            C4892q3 liteSdkVersion = getLiteSdkVersion();
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
