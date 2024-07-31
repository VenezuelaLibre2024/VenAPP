package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbke extends zzayg implements zzbkg {
    public zzbke(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final s2 zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final zzbjj zzf() {
        zzbjj zzbjhVar;
        Parcel zzbl = zzbl(16, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbjhVar = queryLocalInterface instanceof zzbjj ? (zzbjj) queryLocalInterface : new zzbjh(readStrongBinder);
        }
        zzbl.recycle();
        return zzbjhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final zzbjm zzg(String str) {
        zzbjm zzbjkVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbl = zzbl(2, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbjkVar = queryLocalInterface instanceof zzbjm ? (zzbjm) queryLocalInterface : new zzbjk(readStrongBinder);
        }
        zzbl.recycle();
        return zzbjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final com.google.android.gms.dynamic.b zzh() {
        Parcel zzbl = zzbl(9, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final String zzi() {
        Parcel zzbl = zzbl(4, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final String zzj(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbl = zzbl(1, zza);
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final List zzk() {
        Parcel zzbl = zzbl(3, zza());
        ArrayList<String> createStringArrayList = zzbl.createStringArrayList();
        zzbl.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzl() {
        zzbm(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzm() {
        zzbm(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzn(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzo() {
        zzbm(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzp(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final boolean zzq() {
        Parcel zzbl = zzbl(12, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final boolean zzr(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        Parcel zzbl = zzbl(17, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final boolean zzs(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        Parcel zzbl = zzbl(10, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final boolean zzt() {
        Parcel zzbl = zzbl(13, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }
}
