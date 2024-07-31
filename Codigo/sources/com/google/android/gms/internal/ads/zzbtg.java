package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbtg extends zzayg {
    public zzbtg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() {
        Parcel zzbl = zzbl(7, zza());
        double readDouble = zzbl.readDouble();
        zzbl.recycle();
        return readDouble;
    }

    public final Bundle zzf() {
        Parcel zzbl = zzbl(15, zza());
        Bundle bundle = (Bundle) zzayi.zza(zzbl, Bundle.CREATOR);
        zzbl.recycle();
        return bundle;
    }

    public final s2 zzg() {
        Parcel zzbl = zzbl(17, zza());
        s2 zzb = r2.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    public final zzbjf zzh() {
        Parcel zzbl = zzbl(19, zza());
        zzbjf zzj = zzbje.zzj(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzj;
    }

    public final zzbjm zzi() {
        Parcel zzbl = zzbl(5, zza());
        zzbjm zzg = zzbjl.zzg(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzg;
    }

    public final com.google.android.gms.dynamic.b zzj() {
        Parcel zzbl = zzbl(18, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    public final com.google.android.gms.dynamic.b zzk() {
        Parcel zzbl = zzbl(20, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    public final com.google.android.gms.dynamic.b zzl() {
        Parcel zzbl = zzbl(21, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    public final String zzm() {
        Parcel zzbl = zzbl(4, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    public final String zzn() {
        Parcel zzbl = zzbl(6, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    public final String zzo() {
        Parcel zzbl = zzbl(2, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    public final String zzp() {
        Parcel zzbl = zzbl(9, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    public final String zzq() {
        Parcel zzbl = zzbl(8, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    public final List zzr() {
        Parcel zzbl = zzbl(3, zza());
        ArrayList zzb = zzayi.zzb(zzbl);
        zzbl.recycle();
        return zzb;
    }

    public final void zzs(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(11, zza);
    }

    public final void zzt() {
        zzbm(10, zza());
    }

    public final void zzu(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(12, zza);
    }

    public final void zzv(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, bVar2);
        zzayi.zzf(zza, bVar3);
        zzbm(22, zza);
    }

    public final void zzw(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(16, zza);
    }

    public final boolean zzx() {
        Parcel zzbl = zzbl(14, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    public final boolean zzy() {
        Parcel zzbl = zzbl(13, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }
}
