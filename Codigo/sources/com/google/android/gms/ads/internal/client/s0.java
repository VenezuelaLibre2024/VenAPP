package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbam;

/* loaded from: classes.dex */
public final class s0 extends zzayg implements u0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzB() {
        zzbm(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzC(e0 e0Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, e0Var);
        zzbm(20, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzD(h0 h0Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, h0Var);
        zzbm(7, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzF(z4 z4Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, z4Var);
        zzbm(13, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzG(c1 c1Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, c1Var);
        zzbm(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzH(zzbam zzbamVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbamVar);
        zzbm(40, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzI(f5 f5Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, f5Var);
        zzbm(39, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzJ(j1 j1Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, j1Var);
        zzbm(45, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzL(boolean z10) {
        Parcel zza = zza();
        int i10 = zzayi.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbm(34, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzN(boolean z10) {
        Parcel zza = zza();
        int i10 = zzayi.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbm(22, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzP(i2 i2Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, i2Var);
        zzbm(42, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzU(n4 n4Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, n4Var);
        zzbm(29, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzW(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzbm(44, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final boolean zzaa(u4 u4Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, u4Var);
        Parcel zzbl = zzbl(4, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final z4 zzg() {
        Parcel zzbl = zzbl(12, zza());
        z4 z4Var = (z4) zzayi.zza(zzbl, z4.CREATOR);
        zzbl.recycle();
        return z4Var;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final h0 zzi() {
        h0 f0Var;
        Parcel zzbl = zzbl(33, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            f0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            f0Var = queryLocalInterface instanceof h0 ? (h0) queryLocalInterface : new f0(readStrongBinder);
        }
        zzbl.recycle();
        return f0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final c1 zzj() {
        c1 z0Var;
        Parcel zzbl = zzbl(32, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            z0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            z0Var = queryLocalInterface instanceof c1 ? (c1) queryLocalInterface : new z0(readStrongBinder);
        }
        zzbl.recycle();
        return z0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final p2 zzk() {
        p2 n2Var;
        Parcel zzbl = zzbl(41, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            n2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            n2Var = queryLocalInterface instanceof p2 ? (p2) queryLocalInterface : new n2(readStrongBinder);
        }
        zzbl.recycle();
        return n2Var;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final s2 zzl() {
        s2 q2Var;
        Parcel zzbl = zzbl(26, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            q2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            q2Var = queryLocalInterface instanceof s2 ? (s2) queryLocalInterface : new q2(readStrongBinder);
        }
        zzbl.recycle();
        return q2Var;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final com.google.android.gms.dynamic.b zzn() {
        Parcel zzbl = zzbl(1, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final String zzr() {
        Parcel zzbl = zzbl(31, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzx() {
        zzbm(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzy(u4 u4Var, k0 k0Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, u4Var);
        zzayi.zzf(zza, k0Var);
        zzbm(43, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzz() {
        zzbm(5, zza());
    }
}
