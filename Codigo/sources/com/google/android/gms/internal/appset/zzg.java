package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.Parcel;
import q9.d;

/* loaded from: classes2.dex */
public final class zzg extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void zzc(d dVar, zzf zzfVar) {
        Parcel zza = zza();
        zzc.zzb(zza, dVar);
        zzc.zzc(zza, zzfVar);
        zzb(1, zza);
    }
}
