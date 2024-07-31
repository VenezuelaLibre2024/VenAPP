package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.o2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.t1;
import com.google.android.gms.ads.internal.client.x1;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzblh extends zzayg implements zzblj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzA() {
        zzbm(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzB(Bundle bundle) {
        Parcel zza = zza();
        zzayi.zzd(zza, bundle);
        zzbm(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzC() {
        zzbm(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzD(t1 t1Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, t1Var);
        zzbm(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzE(i2 i2Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, i2Var);
        zzbm(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzF(zzblg zzblgVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzblgVar);
        zzbm(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final boolean zzG() {
        Parcel zzbl = zzbl(30, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final boolean zzH() {
        Parcel zzbl = zzbl(24, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final boolean zzI(Bundle bundle) {
        Parcel zza = zza();
        zzayi.zzd(zza, bundle);
        Parcel zzbl = zzbl(16, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final double zze() {
        Parcel zzbl = zzbl(8, zza());
        double readDouble = zzbl.readDouble();
        zzbl.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final Bundle zzf() {
        Parcel zzbl = zzbl(20, zza());
        Bundle bundle = (Bundle) zzayi.zza(zzbl, Bundle.CREATOR);
        zzbl.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final p2 zzg() {
        Parcel zzbl = zzbl(31, zza());
        p2 zzb = o2.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final s2 zzh() {
        Parcel zzbl = zzbl(11, zza());
        s2 zzb = r2.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final zzbjf zzi() {
        zzbjf zzbjdVar;
        Parcel zzbl = zzbl(14, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbjdVar = queryLocalInterface instanceof zzbjf ? (zzbjf) queryLocalInterface : new zzbjd(readStrongBinder);
        }
        zzbl.recycle();
        return zzbjdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final zzbjj zzj() {
        zzbjj zzbjhVar;
        Parcel zzbl = zzbl(29, zza());
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

    @Override // com.google.android.gms.internal.ads.zzblj
    public final zzbjm zzk() {
        zzbjm zzbjkVar;
        Parcel zzbl = zzbl(5, zza());
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

    @Override // com.google.android.gms.internal.ads.zzblj
    public final com.google.android.gms.dynamic.b zzl() {
        Parcel zzbl = zzbl(19, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final com.google.android.gms.dynamic.b zzm() {
        Parcel zzbl = zzbl(18, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzn() {
        Parcel zzbl = zzbl(7, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzo() {
        Parcel zzbl = zzbl(4, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzp() {
        Parcel zzbl = zzbl(6, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzq() {
        Parcel zzbl = zzbl(2, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzr() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzs() {
        Parcel zzbl = zzbl(10, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzt() {
        Parcel zzbl = zzbl(9, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final List zzu() {
        Parcel zzbl = zzbl(3, zza());
        ArrayList zzb = zzayi.zzb(zzbl);
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final List zzv() {
        Parcel zzbl = zzbl(23, zza());
        ArrayList zzb = zzayi.zzb(zzbl);
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzw() {
        zzbm(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzx() {
        zzbm(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzy(x1 x1Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, x1Var);
        zzbm(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzz(Bundle bundle) {
        Parcel zza = zza();
        zzayi.zzd(zza, bundle);
        zzbm(15, zza);
    }
}
