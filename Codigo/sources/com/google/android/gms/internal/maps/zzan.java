package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import ua.a0;

/* loaded from: classes2.dex */
public final class zzan extends zza implements zzap {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final a0 zzb(int i10, int i11, int i12) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeInt(i11);
        zza.writeInt(i12);
        Parcel zzJ = zzJ(1, zza);
        a0 a0Var = (a0) zzc.zza(zzJ, a0.CREATOR);
        zzJ.recycle();
        return a0Var;
    }
}
