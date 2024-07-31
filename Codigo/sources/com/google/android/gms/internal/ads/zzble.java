package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzble extends zzayg implements zzblg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzble(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zze() {
        zzbm(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(1, zza);
    }
}
