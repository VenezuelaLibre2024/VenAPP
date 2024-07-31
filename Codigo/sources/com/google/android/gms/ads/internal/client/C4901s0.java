package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbam;

/* renamed from: com.google.android.gms.ads.internal.client.s0 */
/* loaded from: classes.dex */
public final class C4901s0 extends zzayg implements InterfaceC4913u0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4901s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzB() {
        zzbm(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzC(InterfaceC4812e0 interfaceC4812e0) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC4812e0);
        zzbm(20, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzD(InterfaceC4833h0 interfaceC4833h0) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC4833h0);
        zzbm(7, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzF(C4947z4 c4947z4) {
        Parcel zza = zza();
        zzayi.zzd(zza, c4947z4);
        zzbm(13, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzG(InterfaceC4799c1 interfaceC4799c1) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC4799c1);
        zzbm(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzH(zzbam zzbamVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbamVar);
        zzbm(40, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzI(C4824f5 c4824f5) {
        Parcel zza = zza();
        zzayi.zzd(zza, c4824f5);
        zzbm(39, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzJ(InterfaceC4848j1 interfaceC4848j1) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC4848j1);
        zzbm(45, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzL(boolean z10) {
        Parcel zza = zza();
        int i10 = zzayi.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbm(34, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzN(boolean z10) {
        Parcel zza = zza();
        int i10 = zzayi.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbm(22, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzP(InterfaceC4842i2 interfaceC4842i2) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC4842i2);
        zzbm(42, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzU(C4875n4 c4875n4) {
        Parcel zza = zza();
        zzayi.zzd(zza, c4875n4);
        zzbm(29, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzW(InterfaceC5312b interfaceC5312b) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC5312b);
        zzbm(44, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final boolean zzaa(C4917u4 c4917u4) {
        Parcel zza = zza();
        zzayi.zzd(zza, c4917u4);
        Parcel zzbl = zzbl(4, zza);
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final C4947z4 zzg() {
        Parcel zzbl = zzbl(12, zza());
        C4947z4 c4947z4 = (C4947z4) zzayi.zza(zzbl, C4947z4.CREATOR);
        zzbl.recycle();
        return c4947z4;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final InterfaceC4833h0 zzi() {
        InterfaceC4833h0 c4819f0;
        Parcel zzbl = zzbl(33, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4819f0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            c4819f0 = queryLocalInterface instanceof InterfaceC4833h0 ? (InterfaceC4833h0) queryLocalInterface : new C4819f0(readStrongBinder);
        }
        zzbl.recycle();
        return c4819f0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final InterfaceC4799c1 zzj() {
        InterfaceC4799c1 c4943z0;
        Parcel zzbl = zzbl(32, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4943z0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            c4943z0 = queryLocalInterface instanceof InterfaceC4799c1 ? (InterfaceC4799c1) queryLocalInterface : new C4943z0(readStrongBinder);
        }
        zzbl.recycle();
        return c4943z0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final InterfaceC4885p2 zzk() {
        InterfaceC4885p2 c4873n2;
        Parcel zzbl = zzbl(41, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4873n2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c4873n2 = queryLocalInterface instanceof InterfaceC4885p2 ? (InterfaceC4885p2) queryLocalInterface : new C4873n2(readStrongBinder);
        }
        zzbl.recycle();
        return c4873n2;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final InterfaceC4903s2 zzl() {
        InterfaceC4903s2 c4891q2;
        Parcel zzbl = zzbl(26, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4891q2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            c4891q2 = queryLocalInterface instanceof InterfaceC4903s2 ? (InterfaceC4903s2) queryLocalInterface : new C4891q2(readStrongBinder);
        }
        zzbl.recycle();
        return c4891q2;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final InterfaceC5312b zzn() {
        Parcel zzbl = zzbl(1, zza());
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return m13410f2;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final String zzr() {
        Parcel zzbl = zzbl(31, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzx() {
        zzbm(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzy(C4917u4 c4917u4, InterfaceC4853k0 interfaceC4853k0) {
        Parcel zza = zza();
        zzayi.zzd(zza, c4917u4);
        zzayi.zzf(zza, interfaceC4853k0);
        zzbm(43, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4913u0
    public final void zzz() {
        zzbm(5, zza());
    }
}
