package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbko extends zzayg implements zzbkq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbko(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbkq
    public final void zze(zzbkg zzbkgVar, String str) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbkgVar);
        zza.writeString(str);
        zzbm(1, zza);
    }
}
