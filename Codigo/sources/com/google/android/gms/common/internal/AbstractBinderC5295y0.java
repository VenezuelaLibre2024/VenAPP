package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* renamed from: com.google.android.gms.common.internal.y0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5295y0 extends zzb implements InterfaceC5258m {
    public AbstractBinderC5295y0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            mo13280O(readInt, readStrongBinder, bundle);
        } else if (i10 == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            mo13281S0(readInt2, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            C5260m1 c5260m1 = (C5260m1) zzc.zza(parcel, C5260m1.CREATOR);
            zzc.zzb(parcel);
            mo13282W1(readInt3, readStrongBinder2, c5260m1);
        }
        parcel2.writeNoException();
        return true;
    }
}
