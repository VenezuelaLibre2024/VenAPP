package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzboc extends zzayg implements zzboe {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(1, zza);
    }
}
