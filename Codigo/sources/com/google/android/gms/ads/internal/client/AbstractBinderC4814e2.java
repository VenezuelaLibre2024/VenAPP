package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;

/* renamed from: com.google.android.gms.ads.internal.client.e2 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4814e2 extends zzayh implements InterfaceC4821f2 {
    public AbstractBinderC4814e2() {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    /* renamed from: f2 */
    public static InterfaceC4821f2 m12400f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return queryLocalInterface instanceof InterfaceC4821f2 ? (InterfaceC4821f2) queryLocalInterface : new C4807d2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zze();
        parcel2.writeNoException();
        return true;
    }
}
