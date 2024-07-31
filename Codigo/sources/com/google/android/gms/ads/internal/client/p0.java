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

/* loaded from: classes.dex */
public abstract class p0 extends zzayh implements q0 {
    public p0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        h0 h0Var = null;
        g1 g1Var = null;
        switch (i10) {
            case 1:
                n0 zze = zze();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    h0Var = queryLocalInterface instanceof h0 ? (h0) queryLocalInterface : new f0(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzl(h0Var);
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
                    g1Var = queryLocalInterface2 instanceof g1 ? (g1) queryLocalInterface2 : new g1(readStrongBinder2);
                }
                zzayi.zzc(parcel);
                zzq(g1Var);
                break;
            case 8:
                zzbkx zzb5 = zzbkw.zzb(parcel.readStrongBinder());
                z4 z4Var = (z4) zzayi.zza(parcel, z4.CREATOR);
                zzayi.zzc(parcel);
                zzj(zzb5, z4Var);
                break;
            case 9:
                a9.g gVar = (a9.g) zzayi.zza(parcel, a9.g.CREATOR);
                zzayi.zzc(parcel);
                zzp(gVar);
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
                a9.a aVar = (a9.a) zzayi.zza(parcel, a9.a.CREATOR);
                zzayi.zzc(parcel);
                zzm(aVar);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
