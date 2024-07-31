package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import x9.b;

/* loaded from: classes2.dex */
public final class zzbh extends zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbgVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzbgVar);
        zzc(3, zza);
    }

    public final void zze(zzbg zzbgVar, b bVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzbgVar);
        zzc.zzd(zza, bVar);
        zzc(1, zza);
    }
}
