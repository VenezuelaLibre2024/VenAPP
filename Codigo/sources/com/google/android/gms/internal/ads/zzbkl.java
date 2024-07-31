package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbkl extends zzayg implements zzbkn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zze(zzbkd zzbkdVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbkdVar);
        zzbm(1, zza);
    }
}
