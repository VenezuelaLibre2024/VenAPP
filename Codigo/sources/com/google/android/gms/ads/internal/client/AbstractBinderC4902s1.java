package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;

/* renamed from: com.google.android.gms.ads.internal.client.s1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4902s1 extends zzayh implements InterfaceC4908t1 {
    public AbstractBinderC4902s1() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    /* renamed from: f2 */
    public static InterfaceC4908t1 m12437f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof InterfaceC4908t1 ? (InterfaceC4908t1) queryLocalInterface : new C4896r1(iBinder);
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
