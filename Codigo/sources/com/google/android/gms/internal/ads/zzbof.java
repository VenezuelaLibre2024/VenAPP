package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbof extends zzayg implements zzboh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbof(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zze() {
        zzbm(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(1, zza);
    }
}
