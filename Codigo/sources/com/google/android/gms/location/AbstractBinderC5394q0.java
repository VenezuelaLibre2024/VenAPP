package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

/* renamed from: com.google.android.gms.location.q0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5394q0 extends zzb implements InterfaceC5396r0 {
    public AbstractBinderC5394q0() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static InterfaceC5396r0 zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof InterfaceC5396r0 ? (InterfaceC5396r0) queryLocalInterface : new C5392p0(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) zzc.zza(parcel, LocationResult.CREATOR);
            zzc.zzb(parcel);
            zze(locationResult);
        } else if (i10 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) zzc.zza(parcel, LocationAvailability.CREATOR);
            zzc.zzb(parcel);
            zzd(locationAvailability);
        } else {
            if (i10 != 3) {
                return false;
            }
            zzf();
        }
        return true;
    }
}
