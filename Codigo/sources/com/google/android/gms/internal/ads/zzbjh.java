package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public final class zzbjh extends zzayg implements zzbjj {
    public zzbjh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final float zze() {
        Parcel zzbl = zzbl(2, zza());
        float readFloat = zzbl.readFloat();
        zzbl.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final float zzf() {
        Parcel zzbl = zzbl(6, zza());
        float readFloat = zzbl.readFloat();
        zzbl.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final float zzg() {
        Parcel zzbl = zzbl(5, zza());
        float readFloat = zzbl.readFloat();
        zzbl.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final s2 zzh() {
        Parcel zzbl = zzbl(7, zza());
        s2 zzb = r2.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final com.google.android.gms.dynamic.b zzi() {
        Parcel zzbl = zzbl(4, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zzj(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final boolean zzk() {
        Parcel zzbl = zzbl(10, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final boolean zzl() {
        Parcel zzbl = zzbl(8, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zzm(zzbku zzbkuVar) {
        throw null;
    }
}
