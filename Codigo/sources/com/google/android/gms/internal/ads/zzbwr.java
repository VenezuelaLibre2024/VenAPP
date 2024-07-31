package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzbwr extends zzayg implements zzbwt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final boolean zzH() {
        Parcel zzbl = zzbl(11, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzh(int i10, int i11, Intent intent) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeInt(i11);
        zzayi.zzd(zza, intent);
        zzbm(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzi() {
        zzbm(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzk(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzl(Bundle bundle) {
        Parcel zza = zza();
        zzayi.zzd(zza, bundle);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzm() {
        zzbm(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzo() {
        zzbm(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzbm(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzq() {
        zzbm(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzr() {
        zzbm(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzs(Bundle bundle) {
        Parcel zza = zza();
        zzayi.zzd(zza, bundle);
        Parcel zzbl = zzbl(6, zza);
        if (zzbl.readInt() != 0) {
            bundle.readFromParcel(zzbl);
        }
        zzbl.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzt() {
        zzbm(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzu() {
        zzbm(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzv() {
        zzbm(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzx() {
        zzbm(9, zza());
    }
}
