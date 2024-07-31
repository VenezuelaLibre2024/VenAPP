package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzccr extends zzayg implements zzcct {
    public zzccr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final com.google.android.gms.dynamic.b zze(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, String str, com.google.android.gms.dynamic.b bVar3) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, bVar2);
        zza.writeString(str);
        zzayi.zzf(zza, bVar3);
        Parcel zzbl = zzbl(11, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzf(com.google.android.gms.dynamic.b bVar, zzccx zzccxVar, zzccq zzccqVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, zzccxVar);
        zzayi.zzf(zza, zzccqVar);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzg(zzbxr zzbxrVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, zzbxrVar);
        zzbm(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzh(List list, com.google.android.gms.dynamic.b bVar, zzbxi zzbxiVar) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbxiVar);
        zzbm(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzi(List list, com.google.android.gms.dynamic.b bVar, zzbxi zzbxiVar) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbxiVar);
        zzbm(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzj(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzk(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzl(List list, com.google.android.gms.dynamic.b bVar, zzbxi zzbxiVar) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbxiVar);
        zzbm(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcct
    public final void zzm(List list, com.google.android.gms.dynamic.b bVar, zzbxi zzbxiVar) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbxiVar);
        zzbm(5, zza);
    }
}
