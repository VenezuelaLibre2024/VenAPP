package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbkj;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzbkz;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzbpp;
import com.google.android.gms.internal.ads.zzbpx;
import com.google.android.gms.internal.ads.zzbpy;
import p011a9.C0063a;
import p011a9.C0069g;

/* renamed from: com.google.android.gms.ads.internal.client.p0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4883p0 extends zzayh implements InterfaceC4889q0 {
    public AbstractBinderC4883p0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC4833h0 interfaceC4833h0 = null;
        C4827g1 c4827g1 = null;
        switch (i10) {
            case 1:
                InterfaceC4871n0 zze = zze();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    interfaceC4833h0 = queryLocalInterface instanceof InterfaceC4833h0 ? (InterfaceC4833h0) queryLocalInterface : new C4819f0(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzl(interfaceC4833h0);
                break;
            case 3:
                zzbkk zzb = zzbkj.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzf(zzb);
                break;
            case 4:
                zzbkn zzb2 = zzbkm.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzg(zzb2);
                break;
            case 5:
                String readString = parcel.readString();
                zzbkt zzb3 = zzbks.zzb(parcel.readStrongBinder());
                zzbkq zzb4 = zzbkp.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                break;
            case 6:
                zzbjb zzbjbVar = (zzbjb) zzayi.zza(parcel, zzbjb.CREATOR);
                zzayi.zzc(parcel);
                zzo(zzbjbVar);
                break;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c4827g1 = queryLocalInterface2 instanceof C4827g1 ? (C4827g1) queryLocalInterface2 : new C4827g1(readStrongBinder2);
                }
                zzayi.zzc(parcel);
                zzq(c4827g1);
                break;
            case 8:
                zzbkx zzb5 = zzbkw.zzb(parcel.readStrongBinder());
                C4947z4 c4947z4 = (C4947z4) zzayi.zza(parcel, C4947z4.CREATOR);
                zzayi.zzc(parcel);
                zzj(zzb5, c4947z4);
                break;
            case 9:
                C0069g c0069g = (C0069g) zzayi.zza(parcel, C0069g.CREATOR);
                zzayi.zzc(parcel);
                zzp(c0069g);
                break;
            case 10:
                zzbla zzb6 = zzbkz.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzk(zzb6);
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbpp zzbppVar = (zzbpp) zzayi.zza(parcel, zzbpp.CREATOR);
                zzayi.zzc(parcel);
                zzn(zzbppVar);
                break;
            case 14:
                zzbpy zzb7 = zzbpx.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzi(zzb7);
                break;
            case 15:
                C0063a c0063a = (C0063a) zzayi.zza(parcel, C0063a.CREATOR);
                zzayi.zzc(parcel);
                zzm(c0063a);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
