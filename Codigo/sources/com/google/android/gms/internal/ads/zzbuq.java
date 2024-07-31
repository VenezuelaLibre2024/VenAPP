package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;

/* loaded from: classes2.dex */
public final class zzbuq extends zzayg implements zzbus {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final s2 zze() {
        Parcel zzbl = zzbl(5, zza());
        s2 zzb = r2.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final zzbvg zzf() {
        Parcel zzbl = zzbl(2, zza());
        zzbvg zzbvgVar = (zzbvg) zzayi.zza(zzbl, zzbvg.CREATOR);
        zzbl.recycle();
        return zzbvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final zzbvg zzg() {
        Parcel zzbl = zzbl(3, zza());
        zzbvg zzbvgVar = (zzbvg) zzayi.zza(zzbl, zzbvg.CREATOR);
        zzbl.recycle();
        return zzbvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzh(com.google.android.gms.dynamic.b bVar, String str, Bundle bundle, Bundle bundle2, z4 z4Var, zzbuv zzbuvVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zza.writeString(str);
        zzayi.zzd(zza, bundle);
        zzayi.zzd(zza, bundle2);
        zzayi.zzd(zza, z4Var);
        zzayi.zzf(zza, zzbuvVar);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzi(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbud zzbudVar, zzbtb zzbtbVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzd(zza, u4Var);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbudVar);
        zzayi.zzf(zza, zzbtbVar);
        zzbm(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzj(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbug zzbugVar, zzbtb zzbtbVar, z4 z4Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzd(zza, u4Var);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbugVar);
        zzayi.zzf(zza, zzbtbVar);
        zzayi.zzd(zza, z4Var);
        zzbm(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzk(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbug zzbugVar, zzbtb zzbtbVar, z4 z4Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzd(zza, u4Var);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbugVar);
        zzayi.zzf(zza, zzbtbVar);
        zzayi.zzd(zza, z4Var);
        zzbm(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzl(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbuj zzbujVar, zzbtb zzbtbVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzd(zza, u4Var);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbujVar);
        zzayi.zzf(zza, zzbtbVar);
        zzbm(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzm(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbum zzbumVar, zzbtb zzbtbVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzd(zza, u4Var);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbumVar);
        zzayi.zzf(zza, zzbtbVar);
        zzbm(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzn(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbum zzbumVar, zzbtb zzbtbVar, zzbjb zzbjbVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzd(zza, u4Var);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbumVar);
        zzayi.zzf(zza, zzbtbVar);
        zzayi.zzd(zza, zzbjbVar);
        zzbm(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzo(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbup zzbupVar, zzbtb zzbtbVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzd(zza, u4Var);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbupVar);
        zzayi.zzf(zza, zzbtbVar);
        zzbm(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzp(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbup zzbupVar, zzbtb zzbtbVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzd(zza, u4Var);
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbupVar);
        zzayi.zzf(zza, zzbtbVar);
        zzbm(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzq(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final boolean zzr(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        Parcel zzbl = zzbl(24, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final boolean zzs(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        Parcel zzbl = zzbl(15, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final boolean zzt(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        Parcel zzbl = zzbl(17, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }
}
