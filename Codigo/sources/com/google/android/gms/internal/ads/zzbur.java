package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbur extends zzayh implements zzbus {
    public zzbur() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbus zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbus ? (zzbus) queryLocalInterface : new zzbuq(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbvg zzf;
        int i12;
        zzbuv zzbuvVar = null;
        zzbud zzbubVar = null;
        zzbum zzbukVar = null;
        zzbug zzbueVar = null;
        zzbup zzbunVar = null;
        zzbum zzbukVar2 = null;
        zzbup zzbunVar2 = null;
        zzbuj zzbuhVar = null;
        zzbug zzbueVar2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                zzf = zzf();
            } else {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 == 10) {
                            b.a.f2(parcel.readStrongBinder());
                        } else if (i10 != 11) {
                            switch (i10) {
                                case 13:
                                    String readString = parcel.readString();
                                    String readString2 = parcel.readString();
                                    u4 u4Var = (u4) zzayi.zza(parcel, u4.CREATOR);
                                    com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                                    IBinder readStrongBinder = parcel.readStrongBinder();
                                    if (readStrongBinder != null) {
                                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                        zzbueVar2 = queryLocalInterface instanceof zzbug ? (zzbug) queryLocalInterface : new zzbue(readStrongBinder);
                                    }
                                    zzbug zzbugVar = zzbueVar2;
                                    zzbtb zzb = zzbta.zzb(parcel.readStrongBinder());
                                    z4 z4Var = (z4) zzayi.zza(parcel, z4.CREATOR);
                                    zzayi.zzc(parcel);
                                    zzj(readString, readString2, u4Var, f22, zzbugVar, zzb, z4Var);
                                    break;
                                case 14:
                                    String readString3 = parcel.readString();
                                    String readString4 = parcel.readString();
                                    u4 u4Var2 = (u4) zzayi.zza(parcel, u4.CREATOR);
                                    com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                                    if (readStrongBinder2 != null) {
                                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                        zzbuhVar = queryLocalInterface2 instanceof zzbuj ? (zzbuj) queryLocalInterface2 : new zzbuh(readStrongBinder2);
                                    }
                                    zzbuj zzbujVar = zzbuhVar;
                                    zzbtb zzb2 = zzbta.zzb(parcel.readStrongBinder());
                                    zzayi.zzc(parcel);
                                    zzl(readString3, readString4, u4Var2, f23, zzbujVar, zzb2);
                                    break;
                                case 15:
                                    com.google.android.gms.dynamic.b f24 = b.a.f2(parcel.readStrongBinder());
                                    zzayi.zzc(parcel);
                                    i12 = zzs(f24);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(i12);
                                    break;
                                case 16:
                                    String readString5 = parcel.readString();
                                    String readString6 = parcel.readString();
                                    u4 u4Var3 = (u4) zzayi.zza(parcel, u4.CREATOR);
                                    com.google.android.gms.dynamic.b f25 = b.a.f2(parcel.readStrongBinder());
                                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                                    if (readStrongBinder3 != null) {
                                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                        zzbunVar2 = queryLocalInterface3 instanceof zzbup ? (zzbup) queryLocalInterface3 : new zzbun(readStrongBinder3);
                                    }
                                    zzbup zzbupVar = zzbunVar2;
                                    zzbtb zzb3 = zzbta.zzb(parcel.readStrongBinder());
                                    zzayi.zzc(parcel);
                                    zzp(readString5, readString6, u4Var3, f25, zzbupVar, zzb3);
                                    break;
                                case 17:
                                    com.google.android.gms.dynamic.b f26 = b.a.f2(parcel.readStrongBinder());
                                    zzayi.zzc(parcel);
                                    i12 = zzt(f26);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(i12);
                                    break;
                                case 18:
                                    String readString7 = parcel.readString();
                                    String readString8 = parcel.readString();
                                    u4 u4Var4 = (u4) zzayi.zza(parcel, u4.CREATOR);
                                    com.google.android.gms.dynamic.b f27 = b.a.f2(parcel.readStrongBinder());
                                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                                    if (readStrongBinder4 != null) {
                                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                        zzbukVar2 = queryLocalInterface4 instanceof zzbum ? (zzbum) queryLocalInterface4 : new zzbuk(readStrongBinder4);
                                    }
                                    zzbum zzbumVar = zzbukVar2;
                                    zzbtb zzb4 = zzbta.zzb(parcel.readStrongBinder());
                                    zzayi.zzc(parcel);
                                    zzm(readString7, readString8, u4Var4, f27, zzbumVar, zzb4);
                                    break;
                                case 19:
                                    String readString9 = parcel.readString();
                                    zzayi.zzc(parcel);
                                    zzq(readString9);
                                    break;
                                case 20:
                                    String readString10 = parcel.readString();
                                    String readString11 = parcel.readString();
                                    u4 u4Var5 = (u4) zzayi.zza(parcel, u4.CREATOR);
                                    com.google.android.gms.dynamic.b f28 = b.a.f2(parcel.readStrongBinder());
                                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                                    if (readStrongBinder5 != null) {
                                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                        zzbunVar = queryLocalInterface5 instanceof zzbup ? (zzbup) queryLocalInterface5 : new zzbun(readStrongBinder5);
                                    }
                                    zzbup zzbupVar2 = zzbunVar;
                                    zzbtb zzb5 = zzbta.zzb(parcel.readStrongBinder());
                                    zzayi.zzc(parcel);
                                    zzo(readString10, readString11, u4Var5, f28, zzbupVar2, zzb5);
                                    break;
                                case 21:
                                    String readString12 = parcel.readString();
                                    String readString13 = parcel.readString();
                                    u4 u4Var6 = (u4) zzayi.zza(parcel, u4.CREATOR);
                                    com.google.android.gms.dynamic.b f29 = b.a.f2(parcel.readStrongBinder());
                                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                                    if (readStrongBinder6 != null) {
                                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                        zzbueVar = queryLocalInterface6 instanceof zzbug ? (zzbug) queryLocalInterface6 : new zzbue(readStrongBinder6);
                                    }
                                    zzbug zzbugVar2 = zzbueVar;
                                    zzbtb zzb6 = zzbta.zzb(parcel.readStrongBinder());
                                    z4 z4Var2 = (z4) zzayi.zza(parcel, z4.CREATOR);
                                    zzayi.zzc(parcel);
                                    zzk(readString12, readString13, u4Var6, f29, zzbugVar2, zzb6, z4Var2);
                                    break;
                                case 22:
                                    String readString14 = parcel.readString();
                                    String readString15 = parcel.readString();
                                    u4 u4Var7 = (u4) zzayi.zza(parcel, u4.CREATOR);
                                    com.google.android.gms.dynamic.b f210 = b.a.f2(parcel.readStrongBinder());
                                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                                    if (readStrongBinder7 != null) {
                                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                        zzbukVar = queryLocalInterface7 instanceof zzbum ? (zzbum) queryLocalInterface7 : new zzbuk(readStrongBinder7);
                                    }
                                    zzbum zzbumVar2 = zzbukVar;
                                    zzbtb zzb7 = zzbta.zzb(parcel.readStrongBinder());
                                    zzbjb zzbjbVar = (zzbjb) zzayi.zza(parcel, zzbjb.CREATOR);
                                    zzayi.zzc(parcel);
                                    zzn(readString14, readString15, u4Var7, f210, zzbumVar2, zzb7, zzbjbVar);
                                    break;
                                case 23:
                                    String readString16 = parcel.readString();
                                    String readString17 = parcel.readString();
                                    u4 u4Var8 = (u4) zzayi.zza(parcel, u4.CREATOR);
                                    com.google.android.gms.dynamic.b f211 = b.a.f2(parcel.readStrongBinder());
                                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                                    if (readStrongBinder8 != null) {
                                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                        zzbubVar = queryLocalInterface8 instanceof zzbud ? (zzbud) queryLocalInterface8 : new zzbub(readStrongBinder8);
                                    }
                                    zzbud zzbudVar = zzbubVar;
                                    zzbtb zzb8 = zzbta.zzb(parcel.readStrongBinder());
                                    zzayi.zzc(parcel);
                                    zzi(readString16, readString17, u4Var8, f211, zzbudVar, zzb8);
                                    break;
                                case 24:
                                    com.google.android.gms.dynamic.b f212 = b.a.f2(parcel.readStrongBinder());
                                    zzayi.zzc(parcel);
                                    i12 = zzr(f212);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(i12);
                                    break;
                                default:
                                    return false;
                            }
                        } else {
                            parcel.createStringArray();
                        }
                        zzayi.zzc(parcel);
                    } else {
                        s2 zze = zze();
                        parcel2.writeNoException();
                        zzayi.zzf(parcel2, zze);
                    }
                    return true;
                }
                zzf = zzg();
            }
            parcel2.writeNoException();
            zzayi.zze(parcel2, zzf);
            return true;
        }
        com.google.android.gms.dynamic.b f213 = b.a.f2(parcel.readStrongBinder());
        String readString18 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzayi.zza(parcel, creator);
        Bundle bundle2 = (Bundle) zzayi.zza(parcel, creator);
        z4 z4Var3 = (z4) zzayi.zza(parcel, z4.CREATOR);
        IBinder readStrongBinder9 = parcel.readStrongBinder();
        if (readStrongBinder9 != null) {
            IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            zzbuvVar = queryLocalInterface9 instanceof zzbuv ? (zzbuv) queryLocalInterface9 : new zzbut(readStrongBinder9);
        }
        zzbuv zzbuvVar2 = zzbuvVar;
        zzayi.zzc(parcel);
        zzh(f213, readString18, bundle, bundle2, z4Var3, zzbuvVar2);
        parcel2.writeNoException();
        return true;
    }
}
