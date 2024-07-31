package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
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

/* renamed from: com.google.android.gms.ads.internal.client.d1 */
/* loaded from: classes.dex */
public final class C4806d1 extends zzayg implements InterfaceC4820f1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4806d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    /* renamed from: D */
    public final InterfaceC4861l2 mo12345D(InterfaceC5312b interfaceC5312b, zzbsv zzbsvVar, int i10) {
        InterfaceC4861l2 c4849j2;
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(17, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4849j2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c4849j2 = queryLocalInterface instanceof InterfaceC4861l2 ? (InterfaceC4861l2) queryLocalInterface : new C4849j2(readStrongBinder);
        }
        zzbl.recycle();
        return c4849j2;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    /* renamed from: P0 */
    public final zzcct mo12346P0(InterfaceC5312b interfaceC5312b, zzbsv zzbsvVar, int i10) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(14, zza);
        zzcct zzb = zzccs.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    /* renamed from: R */
    public final zzbjq mo12347R(InterfaceC5312b interfaceC5312b, InterfaceC5312b interfaceC5312b2) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzf(zza, interfaceC5312b2);
        Parcel zzbl = zzbl(5, zza);
        zzbjq zzbJ = zzbjp.zzbJ(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzbJ;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    /* renamed from: R1 */
    public final zzbwm mo12348R1(InterfaceC5312b interfaceC5312b, zzbsv zzbsvVar, int i10) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(15, zza);
        zzbwm zzb = zzbwl.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    /* renamed from: W0 */
    public final InterfaceC4913u0 mo12349W0(InterfaceC5312b interfaceC5312b, C4947z4 c4947z4, String str, zzbsv zzbsvVar, int i10) {
        InterfaceC4913u0 c4901s0;
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzd(zza, c4947z4);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(13, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4901s0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c4901s0 = queryLocalInterface instanceof InterfaceC4913u0 ? (InterfaceC4913u0) queryLocalInterface : new C4901s0(readStrongBinder);
        }
        zzbl.recycle();
        return c4901s0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    /* renamed from: e0 */
    public final zzboh mo12350e0(InterfaceC5312b interfaceC5312b, zzbsv zzbsvVar, int i10, zzboe zzboeVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        zzayi.zzf(zza, zzboeVar);
        Parcel zzbl = zzbl(16, zza);
        zzboh zzb = zzbog.zzb(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    /* renamed from: g */
    public final zzcan mo12351g(InterfaceC5312b interfaceC5312b, String str, zzbsv zzbsvVar, int i10) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(12, zza);
        zzcan zzq = zzcam.zzq(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    /* renamed from: j1 */
    public final InterfaceC4913u0 mo12352j1(InterfaceC5312b interfaceC5312b, C4947z4 c4947z4, String str, zzbsv zzbsvVar, int i10) {
        InterfaceC4913u0 c4901s0;
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzd(zza, c4947z4);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4901s0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c4901s0 = queryLocalInterface instanceof InterfaceC4913u0 ? (InterfaceC4913u0) queryLocalInterface : new C4901s0(readStrongBinder);
        }
        zzbl.recycle();
        return c4901s0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    /* renamed from: o1 */
    public final InterfaceC4913u0 mo12353o1(InterfaceC5312b interfaceC5312b, C4947z4 c4947z4, String str, int i10) {
        InterfaceC4913u0 c4901s0;
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzd(zza, c4947z4);
        zza.writeString(str);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(10, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4901s0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c4901s0 = queryLocalInterface instanceof InterfaceC4913u0 ? (InterfaceC4913u0) queryLocalInterface : new C4901s0(readStrongBinder);
        }
        zzbl.recycle();
        return c4901s0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    /* renamed from: v1 */
    public final InterfaceC4889q0 mo12356v1(InterfaceC5312b interfaceC5312b, String str, zzbsv zzbsvVar, int i10) {
        InterfaceC4889q0 c4877o0;
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(3, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4877o0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            c4877o0 = queryLocalInterface instanceof InterfaceC4889q0 ? (InterfaceC4889q0) queryLocalInterface : new C4877o0(readStrongBinder);
        }
        zzbl.recycle();
        return c4877o0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    /* renamed from: x0 */
    public final InterfaceC4913u0 mo12357x0(InterfaceC5312b interfaceC5312b, C4947z4 c4947z4, String str, zzbsv zzbsvVar, int i10) {
        InterfaceC4913u0 c4901s0;
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzayi.zzd(zza, c4947z4);
        zza.writeString(str);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(2, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4901s0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c4901s0 = queryLocalInterface instanceof InterfaceC4913u0 ? (InterfaceC4913u0) queryLocalInterface : new C4901s0(readStrongBinder);
        }
        zzbl.recycle();
        return c4901s0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    public final InterfaceC4884p1 zzg(InterfaceC5312b interfaceC5312b, int i10) {
        InterfaceC4884p1 c4872n1;
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(9, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4872n1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c4872n1 = queryLocalInterface instanceof InterfaceC4884p1 ? (InterfaceC4884p1) queryLocalInterface : new C4872n1(readStrongBinder);
        }
        zzbl.recycle();
        return c4872n1;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4820f1
    public final zzbwt zzm(InterfaceC5312b interfaceC5312b) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        Parcel zzbl = zzbl(8, zza);
        zzbwt zzI = zzbws.zzI(zzbl.readStrongBinder());
        zzbl.recycle();
        return zzI;
    }
}
