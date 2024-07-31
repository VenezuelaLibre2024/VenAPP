package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.dynamic.b;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbsw extends zzayg implements zzbsy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzA(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, zzbtb zzbtbVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, u4Var);
        zza.writeString(str);
        zzayi.zzf(zza, zzbtbVar);
        zzbm(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzB(u4 u4Var, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzC(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, zzbtb zzbtbVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, u4Var);
        zza.writeString(str);
        zzayi.zzf(zza, zzbtbVar);
        zzbm(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzD(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzE() {
        zzbm(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzF() {
        zzbm(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzG(boolean z10) {
        Parcel zza = zza();
        int i10 = zzayi.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbm(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzH(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzI() {
        zzbm(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzJ(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzK(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzL() {
        zzbm(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final boolean zzM() {
        Parcel zzbl = zzbl(22, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final boolean zzN() {
        Parcel zzbl = zzbl(13, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbtg zzO() {
        zzbtg zzbtgVar;
        Parcel zzbl = zzbl(15, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbtgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbtgVar = queryLocalInterface instanceof zzbtg ? (zzbtg) queryLocalInterface : new zzbtg(readStrongBinder);
        }
        zzbl.recycle();
        return zzbtgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbth zzP() {
        zzbth zzbthVar;
        Parcel zzbl = zzbl(16, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbthVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbthVar = queryLocalInterface instanceof zzbth ? (zzbth) queryLocalInterface : new zzbth(readStrongBinder);
        }
        zzbl.recycle();
        return zzbthVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final Bundle zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final Bundle zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final Bundle zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final s2 zzh() {
        Parcel zzbl = zzbl(26, zza());
        s2 zzb = r2.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbkg zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbte zzj() {
        zzbte zzbtcVar;
        Parcel zzbl = zzbl(36, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbtcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbtcVar = queryLocalInterface instanceof zzbte ? (zzbte) queryLocalInterface : new zzbtc(readStrongBinder);
        }
        zzbl.recycle();
        return zzbtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbtk zzk() {
        zzbtk zzbtiVar;
        Parcel zzbl = zzbl(27, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbtiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbtiVar = queryLocalInterface instanceof zzbtk ? (zzbtk) queryLocalInterface : new zzbti(readStrongBinder);
        }
        zzbl.recycle();
        return zzbtiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbvg zzl() {
        Parcel zzbl = zzbl(33, zza());
        zzbvg zzbvgVar = (zzbvg) zzayi.zza(zzbl, zzbvg.CREATOR);
        zzbl.recycle();
        return zzbvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbvg zzm() {
        Parcel zzbl = zzbl(34, zza());
        zzbvg zzbvgVar = (zzbvg) zzayi.zza(zzbl, zzbvg.CREATOR);
        zzbl.recycle();
        return zzbvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final com.google.android.gms.dynamic.b zzn() {
        Parcel zzbl = zzbl(2, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzo() {
        zzbm(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzp(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, zzcaf zzcafVar, String str2) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, u4Var);
        zza.writeString(null);
        zzayi.zzf(zza, zzcafVar);
        zza.writeString(str2);
        zzbm(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzq(com.google.android.gms.dynamic.b bVar, zzbph zzbphVar, List list) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbphVar);
        zza.writeTypedList(list);
        zzbm(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzr(com.google.android.gms.dynamic.b bVar, zzcaf zzcafVar, List list) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzcafVar);
        zza.writeStringList(list);
        zzbm(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzs(u4 u4Var, String str) {
        Parcel zza = zza();
        zzayi.zzd(zza, u4Var);
        zza.writeString(str);
        zzbm(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzt(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, zzbtb zzbtbVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, u4Var);
        zza.writeString(str);
        zzayi.zzf(zza, zzbtbVar);
        zzbm(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzu(com.google.android.gms.dynamic.b bVar, z4 z4Var, u4 u4Var, String str, zzbtb zzbtbVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzv(com.google.android.gms.dynamic.b bVar, z4 z4Var, u4 u4Var, String str, String str2, zzbtb zzbtbVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, z4Var);
        zzayi.zzd(zza, u4Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzf(zza, zzbtbVar);
        zzbm(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzw(com.google.android.gms.dynamic.b bVar, z4 z4Var, u4 u4Var, String str, String str2, zzbtb zzbtbVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, z4Var);
        zzayi.zzd(zza, u4Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzf(zza, zzbtbVar);
        zzbm(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzx(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, zzbtb zzbtbVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzy(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, String str2, zzbtb zzbtbVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, u4Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzf(zza, zzbtbVar);
        zzbm(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzz(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, String str2, zzbtb zzbtbVar, zzbjb zzbjbVar, List list) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, u4Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzayi.zzf(zza, zzbtbVar);
        zzayi.zzd(zza, zzbjbVar);
        zza.writeStringList(list);
        zzbm(14, zza);
    }
}
