package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.h2 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4835h2 extends zzayh implements InterfaceC4842i2 {
    public AbstractBinderC4835h2() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* renamed from: f2 */
    public static InterfaceC4842i2 m12403f2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof InterfaceC4842i2 ? (InterfaceC4842i2) queryLocalInterface : new C4828g2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            C4796b5 c4796b5 = (C4796b5) zzayi.zza(parcel, C4796b5.CREATOR);
            zzayi.zzc(parcel);
            mo12402x1(c4796b5);
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
