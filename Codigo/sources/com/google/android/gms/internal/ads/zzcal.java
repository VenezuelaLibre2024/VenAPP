package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.f2;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.o2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.u4;

/* loaded from: classes2.dex */
public final class zzcal extends zzayg implements zzcan {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final Bundle zzb() {
        Parcel zzbl = zzbl(9, zza());
        Bundle bundle = (Bundle) zzayi.zza(zzbl, Bundle.CREATOR);
        zzbl.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final p2 zzc() {
        Parcel zzbl = zzbl(12, zza());
        p2 zzb = o2.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final zzcak zzd() {
        zzcak zzcaiVar;
        Parcel zzbl = zzbl(11, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzcaiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcaiVar = queryLocalInterface instanceof zzcak ? (zzcak) queryLocalInterface : new zzcai(readStrongBinder);
        }
        zzbl.recycle();
        return zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzf(u4 u4Var, zzcau zzcauVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, u4Var);
        zzayi.zzf(zza, zzcauVar);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzg(u4 u4Var, zzcau zzcauVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, u4Var);
        zzayi.zzf(zza, zzcauVar);
        zzbm(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzh(boolean z10) {
        Parcel zza = zza();
        int i10 = zzayi.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbm(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzi(f2 f2Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, f2Var);
        zzbm(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzj(i2 i2Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, i2Var);
        zzbm(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzk(zzcaq zzcaqVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzcaqVar);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzl(zzcbb zzcbbVar) {
        Parcel zza = zza();
        zzayi.zzd(zza, zzcbbVar);
        zzbm(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzm(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzn(com.google.android.gms.dynamic.b bVar, boolean z10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final boolean zzo() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzp(zzcav zzcavVar) {
        throw null;
    }
}
