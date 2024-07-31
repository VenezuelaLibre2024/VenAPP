package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.u0;

/* loaded from: classes2.dex */
public final class zzbkv extends zzayg implements zzbkx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final void zze(u0 u0Var, com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, u0Var);
        zzayi.zzf(zza, bVar);
        zzbm(1, zza);
    }
}
