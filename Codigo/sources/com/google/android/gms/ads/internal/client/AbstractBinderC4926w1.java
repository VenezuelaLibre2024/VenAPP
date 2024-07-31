package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;

/* renamed from: com.google.android.gms.ads.internal.client.w1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4926w1 extends zzayh implements InterfaceC4932x1 {
    public AbstractBinderC4926w1() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: f2 */
    public static InterfaceC4932x1 m12472f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof InterfaceC4932x1 ? (InterfaceC4932x1) queryLocalInterface : new C4920v1(iBinder);
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
