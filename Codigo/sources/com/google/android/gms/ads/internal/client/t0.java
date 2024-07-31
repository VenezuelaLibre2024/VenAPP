package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbxc;
import com.google.android.gms.internal.ads.zzbxe;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcaa;

/* loaded from: classes.dex */
public abstract class t0 extends zzayh implements u0 {
    public t0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static u0 zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof u0 ? (u0) queryLocalInterface : new s0(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface zzn;
        Parcelable zzg;
        String zzs;
        int i12;
        boolean z10;
        h0 h0Var = null;
        j1 j1Var = null;
        k0 k0Var = null;
        i2 i2Var = null;
        y0 y0Var = null;
        g1 g1Var = null;
        e0 e0Var = null;
        c1 c1Var = null;
        switch (i10) {
            case 1:
                zzn = zzn();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                z10 = zzZ();
                parcel2.writeNoException();
                int i13 = zzayi.zza;
                i12 = z10;
                parcel2.writeInt(i12);
                return true;
            case 4:
                u4 u4Var = (u4) zzayi.zza(parcel, u4.CREATOR);
                zzayi.zzc(parcel);
                boolean zzaa = zzaa(u4Var);
                parcel2.writeNoException();
                i12 = zzaa;
                parcel2.writeInt(i12);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    h0Var = queryLocalInterface instanceof h0 ? (h0) queryLocalInterface : new f0(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzD(h0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    c1Var = queryLocalInterface2 instanceof c1 ? (c1) queryLocalInterface2 : new z0(readStrongBinder2);
                }
                zzayi.zzc(parcel);
                zzG(c1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzg = zzg();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zzg);
                return true;
            case 13:
                z4 z4Var = (z4) zzayi.zza(parcel, z4.CREATOR);
                zzayi.zzc(parcel);
                zzF(z4Var);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbxc zzb = zzbxb.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzM(zzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbxf zzb2 = zzbxe.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzayi.zzc(parcel);
                zzQ(zzb2, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                zzbha zzb3 = zzbgz.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzO(zzb3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    e0Var = queryLocalInterface3 instanceof e0 ? (e0) queryLocalInterface3 : new c0(readStrongBinder3);
                }
                zzayi.zzc(parcel);
                zzC(e0Var);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    g1Var = queryLocalInterface4 instanceof g1 ? (g1) queryLocalInterface4 : new g1(readStrongBinder4);
                }
                zzayi.zzc(parcel);
                zzab(g1Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzg2 = zzayi.zzg(parcel);
                zzayi.zzc(parcel);
                zzN(zzg2);
                parcel2.writeNoException();
                return true;
            case 23:
                z10 = zzY();
                parcel2.writeNoException();
                int i132 = zzayi.zza;
                i12 = z10;
                parcel2.writeInt(i12);
                return true;
            case 24:
                zzcaa zzb4 = zzbzz.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzS(zzb4);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzayi.zzc(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzn = zzl();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzn);
                return true;
            case 29:
                n4 n4Var = (n4) zzayi.zza(parcel, n4.CREATOR);
                zzayi.zzc(parcel);
                zzU(n4Var);
                parcel2.writeNoException();
                return true;
            case 30:
                w2 w2Var = (w2) zzayi.zza(parcel, w2.CREATOR);
                zzayi.zzc(parcel);
                zzK(w2Var);
                parcel2.writeNoException();
                return true;
            case 31:
                zzs = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 32:
                zzn = zzj();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzn);
                return true;
            case 33:
                zzn = zzi();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzn);
                return true;
            case 34:
                boolean zzg3 = zzayi.zzg(parcel);
                zzayi.zzc(parcel);
                zzL(zzg3);
                parcel2.writeNoException();
                return true;
            case 35:
                zzs = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    y0Var = queryLocalInterface5 instanceof y0 ? (y0) queryLocalInterface5 : new w0(readStrongBinder5);
                }
                zzayi.zzc(parcel);
                zzE(y0Var);
                parcel2.writeNoException();
                return true;
            case 37:
                zzg = zzd();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zzg);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzayi.zzc(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                f5 f5Var = (f5) zzayi.zza(parcel, f5.CREATOR);
                zzayi.zzc(parcel);
                zzI(f5Var);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbam zze = zzbal.zze(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzH(zze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzn = zzk();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzn);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    i2Var = queryLocalInterface6 instanceof i2 ? (i2) queryLocalInterface6 : new g2(readStrongBinder6);
                }
                zzayi.zzc(parcel);
                zzP(i2Var);
                parcel2.writeNoException();
                return true;
            case 43:
                u4 u4Var2 = (u4) zzayi.zza(parcel, u4.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    k0Var = queryLocalInterface7 instanceof k0 ? (k0) queryLocalInterface7 : new i0(readStrongBinder7);
                }
                zzayi.zzc(parcel);
                zzy(u4Var2, k0Var);
                parcel2.writeNoException();
                return true;
            case 44:
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzW(f22);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    j1Var = queryLocalInterface8 instanceof j1 ? (j1) queryLocalInterface8 : new h1(readStrongBinder8);
                }
                zzayi.zzc(parcel);
                zzJ(j1Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
