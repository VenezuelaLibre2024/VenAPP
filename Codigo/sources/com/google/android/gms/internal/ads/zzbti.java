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
public final class zzbti extends zzayg implements zzbtk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbti(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final boolean zzA() {
        Parcel zzbl = zzbl(18, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final boolean zzB() {
        Parcel zzbl = zzbl(17, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final double zze() {
        Parcel zzbl = zzbl(8, zza());
        double readDouble = zzbl.readDouble();
        zzbl.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final float zzf() {
        Parcel zzbl = zzbl(23, zza());
        float readFloat = zzbl.readFloat();
        zzbl.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final float zzg() {
        Parcel zzbl = zzbl(25, zza());
        float readFloat = zzbl.readFloat();
        zzbl.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final float zzh() {
        Parcel zzbl = zzbl(24, zza());
        float readFloat = zzbl.readFloat();
        zzbl.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final Bundle zzi() {
        Parcel zzbl = zzbl(16, zza());
        Bundle bundle = (Bundle) zzayi.zza(zzbl, Bundle.CREATOR);
        zzbl.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final s2 zzj() {
        Parcel zzbl = zzbl(11, zza());
        s2 zzb = r2.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final zzbjf zzk() {
        Parcel zzbl = zzbl(12, zza());
        zzbjf zzj = zzbje.zzj(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final zzbjm zzl() {
        Parcel zzbl = zzbl(5, zza());
        zzbjm zzg = zzbjl.zzg(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final com.google.android.gms.dynamic.b zzm() {
        Parcel zzbl = zzbl(13, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final com.google.android.gms.dynamic.b zzn() {
        Parcel zzbl = zzbl(14, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final com.google.android.gms.dynamic.b zzo() {
        Parcel zzbl = zzbl(15, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final String zzp() {
        Parcel zzbl = zzbl(7, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final String zzq() {
        Parcel zzbl = zzbl(4, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final String zzr() {
        Parcel zzbl = zzbl(6, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final String zzs() {
        Parcel zzbl = zzbl(2, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final String zzt() {
        Parcel zzbl = zzbl(10, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final String zzu() {
        Parcel zzbl = zzbl(9, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final List zzv() {
        Parcel zzbl = zzbl(3, zza());
        ArrayList zzb = zzayi.zzb(zzbl);
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zzw(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zzx() {
        zzbm(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zzy(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, bVar2);
        zzayi.zzf(zza, bVar3);
        zzbm(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zzz(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(22, zza);
    }
}
