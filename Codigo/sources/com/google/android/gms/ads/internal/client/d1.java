package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjq;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbwl;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzccs;
import com.google.android.gms.internal.ads.zzcct;

/* loaded from: classes.dex */
public final class d1 extends zzayg implements f1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final l2 D(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10) {
        l2 j2Var;
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(17, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            j2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            j2Var = queryLocalInterface instanceof l2 ? (l2) queryLocalInterface : new j2(readStrongBinder);
        }
        zzbl.recycle();
        return j2Var;
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzcct P0(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(14, zza);
        zzcct zzb = zzccs.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzbjq R(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, bVar2);
        Parcel zzbl = zzbl(5, zza);
        zzbjq zzbJ = zzbjp.zzbJ(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzbJ;
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzbwm R1(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(15, zza);
        zzbwm zzb = zzbwl.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final u0 W0(com.google.android.gms.dynamic.b bVar, z4 z4Var, String str, zzbsv zzbsvVar, int i10) {
        u0 s0Var;
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, z4Var);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(13, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            s0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            s0Var = queryLocalInterface instanceof u0 ? (u0) queryLocalInterface : new s0(readStrongBinder);
        }
        zzbl.recycle();
        return s0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzboh e0(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10, zzboe zzboeVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        zzayi.zzf(zza, zzboeVar);
        Parcel zzbl = zzbl(16, zza);
        zzboh zzb = zzbog.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzcan g(com.google.android.gms.dynamic.b bVar, String str, zzbsv zzbsvVar, int i10) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(12, zza);
        zzcan zzq = zzcam.zzq(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final u0 j1(com.google.android.gms.dynamic.b bVar, z4 z4Var, String str, zzbsv zzbsvVar, int i10) {
        u0 s0Var;
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, z4Var);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            s0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            s0Var = queryLocalInterface instanceof u0 ? (u0) queryLocalInterface : new s0(readStrongBinder);
        }
        zzbl.recycle();
        return s0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final u0 o1(com.google.android.gms.dynamic.b bVar, z4 z4Var, String str, int i10) {
        u0 s0Var;
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, z4Var);
        zza.writeString(str);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(10, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            s0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            s0Var = queryLocalInterface instanceof u0 ? (u0) queryLocalInterface : new s0(readStrongBinder);
        }
        zzbl.recycle();
        return s0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final q0 v1(com.google.android.gms.dynamic.b bVar, String str, zzbsv zzbsvVar, int i10) {
        q0 o0Var;
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(3, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            o0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            o0Var = queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new o0(readStrongBinder);
        }
        zzbl.recycle();
        return o0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final u0 x0(com.google.android.gms.dynamic.b bVar, z4 z4Var, String str, zzbsv zzbsvVar, int i10) {
        u0 s0Var;
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zzayi.zzd(zza, z4Var);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(2, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            s0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            s0Var = queryLocalInterface instanceof u0 ? (u0) queryLocalInterface : new s0(readStrongBinder);
        }
        zzbl.recycle();
        return s0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final p1 zzg(com.google.android.gms.dynamic.b bVar, int i10) {
        p1 n1Var;
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(9, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            n1Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            n1Var = queryLocalInterface instanceof p1 ? (p1) queryLocalInterface : new n1(readStrongBinder);
        }
        zzbl.recycle();
        return n1Var;
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzbwt zzm(com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        Parcel zzbl = zzbl(8, zza);
        zzbwt zzI = zzbws.zzI(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzI;
    }
}
