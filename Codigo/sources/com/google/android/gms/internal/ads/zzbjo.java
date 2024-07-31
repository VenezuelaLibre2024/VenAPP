package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public final class zzbjo extends zzayg implements zzbjq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbjo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final com.google.android.gms.dynamic.b zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbl = zzbl(2, zza);
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzbE(String str, com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzayi.zzf(zza, bVar);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzbF(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzbG(zzbjj zzbjjVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbjjVar);
        zzbm(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzbH(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzbI(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzc() {
        zzbm(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzd(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zze(com.google.android.gms.dynamic.b bVar, int i10) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zza.writeInt(i10);
        zzbm(5, zza);
    }
}
