package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public final class t0 extends zzayg implements v0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.v0
    public final void zze(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.util.v0
    public final boolean zzf(com.google.android.gms.dynamic.b bVar, String str, String str2) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zza.writeString(str);
        zza.writeString(str2);
        Parcel zzbl = zzbl(1, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.util.v0
    public final boolean zzg(com.google.android.gms.dynamic.b bVar, f9.a aVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, aVar);
        Parcel zzbl = zzbl(3, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }
}
