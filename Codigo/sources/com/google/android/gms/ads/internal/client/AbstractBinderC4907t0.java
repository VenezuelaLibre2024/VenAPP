package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.InterfaceC5312b;
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

/* renamed from: com.google.android.gms.ads.internal.client.t0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4907t0 extends zzayh implements InterfaceC4913u0 {
    public AbstractBinderC4907t0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static InterfaceC4913u0 zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof InterfaceC4913u0 ? (InterfaceC4913u0) queryLocalInterface : new C4901s0(iBinder);
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
        InterfaceC4833h0 interfaceC4833h0 = null;
        InterfaceC4848j1 interfaceC4848j1 = null;
        InterfaceC4853k0 interfaceC4853k0 = null;
        InterfaceC4842i2 interfaceC4842i2 = null;
        InterfaceC4937y0 interfaceC4937y0 = null;
        C4827g1 c4827g1 = null;
        InterfaceC4812e0 interfaceC4812e0 = null;
        InterfaceC4799c1 interfaceC4799c1 = null;
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
                C4917u4 c4917u4 = (C4917u4) zzayi.zza(parcel, C4917u4.CREATOR);
                zzayi.zzc(parcel);
                boolean zzaa = zzaa(c4917u4);
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
                    interfaceC4833h0 = queryLocalInterface instanceof InterfaceC4833h0 ? (InterfaceC4833h0) queryLocalInterface : new C4819f0(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzD(interfaceC4833h0);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    interfaceC4799c1 = queryLocalInterface2 instanceof InterfaceC4799c1 ? (InterfaceC4799c1) queryLocalInterface2 : new C4943z0(readStrongBinder2);
                }
                zzayi.zzc(parcel);
                zzG(interfaceC4799c1);
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
                C4947z4 c4947z4 = (C4947z4) zzayi.zza(parcel, C4947z4.CREATOR);
                zzayi.zzc(parcel);
                zzF(c4947z4);
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
                    interfaceC4812e0 = queryLocalInterface3 instanceof InterfaceC4812e0 ? (InterfaceC4812e0) queryLocalInterface3 : new C4798c0(readStrongBinder3);
                }
                zzayi.zzc(parcel);
                zzC(interfaceC4812e0);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c4827g1 = queryLocalInterface4 instanceof C4827g1 ? (C4827g1) queryLocalInterface4 : new C4827g1(readStrongBinder4);
                }
                zzayi.zzc(parcel);
                zzab(c4827g1);
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
                C4875n4 c4875n4 = (C4875n4) zzayi.zza(parcel, C4875n4.CREATOR);
                zzayi.zzc(parcel);
                zzU(c4875n4);
                parcel2.writeNoException();
                return true;
            case 30:
                C4927w2 c4927w2 = (C4927w2) zzayi.zza(parcel, C4927w2.CREATOR);
                zzayi.zzc(parcel);
                zzK(c4927w2);
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
                    interfaceC4937y0 = queryLocalInterface5 instanceof InterfaceC4937y0 ? (InterfaceC4937y0) queryLocalInterface5 : new C4925w0(readStrongBinder5);
                }
                zzayi.zzc(parcel);
                zzE(interfaceC4937y0);
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
                C4824f5 c4824f5 = (C4824f5) zzayi.zza(parcel, C4824f5.CREATOR);
                zzayi.zzc(parcel);
                zzI(c4824f5);
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
                    interfaceC4842i2 = queryLocalInterface6 instanceof InterfaceC4842i2 ? (InterfaceC4842i2) queryLocalInterface6 : new C4828g2(readStrongBinder6);
                }
                zzayi.zzc(parcel);
                zzP(interfaceC4842i2);
                parcel2.writeNoException();
                return true;
            case 43:
                C4917u4 c4917u42 = (C4917u4) zzayi.zza(parcel, C4917u4.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    interfaceC4853k0 = queryLocalInterface7 instanceof InterfaceC4853k0 ? (InterfaceC4853k0) queryLocalInterface7 : new C4840i0(readStrongBinder7);
                }
                zzayi.zzc(parcel);
                zzy(c4917u42, interfaceC4853k0);
                parcel2.writeNoException();
                return true;
            case 44:
                InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzW(m13410f2);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    interfaceC4848j1 = queryLocalInterface8 instanceof InterfaceC4848j1 ? (InterfaceC4848j1) queryLocalInterface8 : new C4834h1(readStrongBinder8);
                }
                zzayi.zzc(parcel);
                zzJ(interfaceC4848j1);
                parcel2.writeNoException();
                return true;
        }
    }
}
