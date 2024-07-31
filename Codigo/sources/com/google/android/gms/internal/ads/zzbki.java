package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbki extends zzayg implements zzbkk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbki(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbkk
    public final void zze(zzbkb zzbkbVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbkbVar);
        zzbm(1, zza);
    }
}
