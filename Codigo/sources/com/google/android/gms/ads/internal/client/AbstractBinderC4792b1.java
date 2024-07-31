package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.b1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4792b1 extends zzayh implements InterfaceC4799c1 {
    public AbstractBinderC4792b1() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static InterfaceC4799c1 zzd(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof InterfaceC4799c1 ? (InterfaceC4799c1) queryLocalInterface : new C4943z0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        zzayi.zzc(parcel);
        zzc(readString, readString2);
        parcel2.writeNoException();
        return true;
    }
}