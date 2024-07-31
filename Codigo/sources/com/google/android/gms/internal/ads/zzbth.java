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
public final class zzbth extends zzayg {
    public zzbth(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() {
        Parcel zzbl = zzbl(13, zza());
        Bundle bundle = (Bundle) zzayi.zza(zzbl, Bundle.CREATOR);
        zzbl.recycle();
        return bundle;
    }

    public final s2 zzf() {
        Parcel zzbl = zzbl(16, zza());
        s2 zzb = r2.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    public final zzbjf zzg() {
        Parcel zzbl = zzbl(19, zza());
        zzbjf zzj = zzbje.zzj(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzj;
    }

    public final zzbjm zzh() {
        Parcel zzbl = zzbl(5, zza());
        zzbjm zzg = zzbjl.zzg(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzg;
    }

    public final com.google.android.gms.dynamic.b zzi() {
        Parcel zzbl = zzbl(15, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    public final com.google.android.gms.dynamic.b zzj() {
        Parcel zzbl = zzbl(20, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    public final com.google.android.gms.dynamic.b zzk() {
        Parcel zzbl = zzbl(21, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    public final String zzl() {
        Parcel zzbl = zzbl(7, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
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

    public final List zzp() {
        Parcel zzbl = zzbl(3, zza());
        ArrayList zzb = zzayi.zzb(zzbl);
        zzbl.recycle();
        return zzb;
    }

    public final void zzq(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(9, zza);
    }

    public final void zzr() {
        zzbm(8, zza());
    }

    public final void zzs(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(10, zza);
    }

    public final void zzt(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, bVar2);
        zzayi.zzf(zza, bVar3);
        zzbm(22, zza);
    }

    public final void zzu(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(14, zza);
    }

    public final boolean zzv() {
        Parcel zzbl = zzbl(12, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    public final boolean zzw() {
        Parcel zzbl = zzbl(11, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }
}
