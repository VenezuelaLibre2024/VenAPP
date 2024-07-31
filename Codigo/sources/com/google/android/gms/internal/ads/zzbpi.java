package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbpi extends zzayg implements zzbpk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzb(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbm(1, zza);
    }
}
