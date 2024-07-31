package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbwk extends zzayg implements zzbwm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze(Intent intent) {
        Parcel zza = zza();
        zzayi.zzd(zza, intent);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzf(String[] strArr, int[] iArr, com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzayi.zzf(zza, bVar);
        zzbm(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzg(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzh() {
        zzbm(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzi(com.google.android.gms.dynamic.b bVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzj(com.google.android.gms.dynamic.b bVar, f9.a aVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, aVar);
        zzbm(6, zza);
    }
}
