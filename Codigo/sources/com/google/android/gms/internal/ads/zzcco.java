package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzcco extends zzayg implements zzccq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcco(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzc(String str, String str2, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzd(zza, bundle);
        zzbm(3, zza);
    }
}
