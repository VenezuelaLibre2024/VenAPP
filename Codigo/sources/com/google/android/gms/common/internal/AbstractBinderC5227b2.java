package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* renamed from: com.google.android.gms.common.internal.b2 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5227b2 extends zzb implements InterfaceC5292x0 {
    public AbstractBinderC5227b2() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: f2 */
    public static InterfaceC5292x0 m13228f2(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof InterfaceC5292x0 ? (InterfaceC5292x0) queryLocalInterface : new C5223a2(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            InterfaceC5312b zzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, zzd);
        } else {
            if (i10 != 2) {
                return false;
            }
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
