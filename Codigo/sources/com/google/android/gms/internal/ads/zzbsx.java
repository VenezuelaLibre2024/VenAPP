package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class zzbsx extends zzayh implements zzbsy {
    public zzbsx() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface zzn;
        Parcelable zze;
        zzbtb zzbtbVar = null;
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                z4 z4Var = (z4) zzayi.zza(parcel, z4.CREATOR);
                u4 u4Var = (u4) zzayi.zza(parcel, u4.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtbVar = queryLocalInterface instanceof zzbtb ? (zzbtb) queryLocalInterface : new zzbsz(readStrongBinder);
                }
                zzbtb zzbtbVar2 = zzbtbVar;
                zzayi.zzc(parcel);
                zzu(f22, z4Var, u4Var, readString, zzbtbVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                zzn = zzn();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzn);
                return true;
            case 3:
                com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                u4 u4Var2 = (u4) zzayi.zza(parcel, u4.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtbVar = queryLocalInterface2 instanceof zzbtb ? (zzbtb) queryLocalInterface2 : new zzbsz(readStrongBinder2);
                }
                zzayi.zzc(parcel);
                zzx(f23, u4Var2, readString2, zzbtbVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.b f24 = b.a.f2(parcel.readStrongBinder());
                z4 z4Var2 = (z4) zzayi.zza(parcel, z4.CREATOR);
                u4 u4Var3 = (u4) zzayi.zza(parcel, u4.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtbVar = queryLocalInterface3 instanceof zzbtb ? (zzbtb) queryLocalInterface3 : new zzbsz(readStrongBinder3);
                }
                zzbtb zzbtbVar3 = zzbtbVar;
                zzayi.zzc(parcel);
                zzv(f24, z4Var2, u4Var3, readString3, readString4, zzbtbVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.dynamic.b f25 = b.a.f2(parcel.readStrongBinder());
                u4 u4Var4 = (u4) zzayi.zza(parcel, u4.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtbVar = queryLocalInterface4 instanceof zzbtb ? (zzbtb) queryLocalInterface4 : new zzbsz(readStrongBinder4);
                }
                zzbtb zzbtbVar4 = zzbtbVar;
                zzayi.zzc(parcel);
                zzy(f25, u4Var4, readString5, readString6, zzbtbVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.gms.dynamic.b f26 = b.a.f2(parcel.readStrongBinder());
                u4 u4Var5 = (u4) zzayi.zza(parcel, u4.CREATOR);
                String readString7 = parcel.readString();
                zzcaf zzb = zzcae.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzayi.zzc(parcel);
                zzp(f26, u4Var5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                u4 u4Var6 = (u4) zzayi.zza(parcel, u4.CREATOR);
                String readString9 = parcel.readString();
                zzayi.zzc(parcel);
                zzs(u4Var6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                int i12 = zzayi.zza;
                parcel2.writeInt(zzN ? 1 : 0);
                return true;
            case 14:
                com.google.android.gms.dynamic.b f27 = b.a.f2(parcel.readStrongBinder());
                u4 u4Var7 = (u4) zzayi.zza(parcel, u4.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtbVar = queryLocalInterface5 instanceof zzbtb ? (zzbtb) queryLocalInterface5 : new zzbsz(readStrongBinder5);
                }
                zzbtb zzbtbVar5 = zzbtbVar;
                zzbjb zzbjbVar = (zzbjb) zzayi.zza(parcel, zzbjb.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzayi.zzc(parcel);
                zzz(f27, u4Var7, readString10, readString11, zzbtbVar5, zzbjbVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
            case 16:
                parcel2.writeNoException();
                zzayi.zzf(parcel2, null);
                return true;
            case 17:
                zze = zze();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zze);
                return true;
            case 18:
                zze = zzf();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zze);
                return true;
            case 19:
                zze = zzg();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zze);
                return true;
            case 20:
                u4 u4Var8 = (u4) zzayi.zza(parcel, u4.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzayi.zzc(parcel);
                zzB(u4Var8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.dynamic.b f28 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzD(f28);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i13 = zzayi.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                com.google.android.gms.dynamic.b f29 = b.a.f2(parcel.readStrongBinder());
                zzcaf zzb2 = zzcae.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzayi.zzc(parcel);
                zzr(f29, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzn = zzi();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzn);
                return true;
            case 25:
                boolean zzg = zzayi.zzg(parcel);
                zzayi.zzc(parcel);
                zzG(zzg);
                parcel2.writeNoException();
                return true;
            case 26:
                zzn = zzh();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzn);
                return true;
            case 27:
                zzn = zzk();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzn);
                return true;
            case 28:
                com.google.android.gms.dynamic.b f210 = b.a.f2(parcel.readStrongBinder());
                u4 u4Var9 = (u4) zzayi.zza(parcel, u4.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtbVar = queryLocalInterface6 instanceof zzbtb ? (zzbtb) queryLocalInterface6 : new zzbsz(readStrongBinder6);
                }
                zzayi.zzc(parcel);
                zzA(f210, u4Var9, readString14, zzbtbVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                com.google.android.gms.dynamic.b f211 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzK(f211);
                parcel2.writeNoException();
                return true;
            case 31:
                com.google.android.gms.dynamic.b f212 = b.a.f2(parcel.readStrongBinder());
                zzbph zzb3 = zzbpg.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbpn.CREATOR);
                zzayi.zzc(parcel);
                zzq(f212, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                com.google.android.gms.dynamic.b f213 = b.a.f2(parcel.readStrongBinder());
                u4 u4Var10 = (u4) zzayi.zza(parcel, u4.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtbVar = queryLocalInterface7 instanceof zzbtb ? (zzbtb) queryLocalInterface7 : new zzbsz(readStrongBinder7);
                }
                zzayi.zzc(parcel);
                zzC(f213, u4Var10, readString15, zzbtbVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zze = zzl();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zze);
                return true;
            case 34:
                zze = zzm();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zze);
                return true;
            case 35:
                com.google.android.gms.dynamic.b f214 = b.a.f2(parcel.readStrongBinder());
                z4 z4Var3 = (z4) zzayi.zza(parcel, z4.CREATOR);
                u4 u4Var11 = (u4) zzayi.zza(parcel, u4.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtbVar = queryLocalInterface8 instanceof zzbtb ? (zzbtb) queryLocalInterface8 : new zzbsz(readStrongBinder8);
                }
                zzbtb zzbtbVar6 = zzbtbVar;
                zzayi.zzc(parcel);
                zzw(f214, z4Var3, u4Var11, readString16, readString17, zzbtbVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzn = zzj();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzn);
                return true;
            case 37:
                com.google.android.gms.dynamic.b f215 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzJ(f215);
                parcel2.writeNoException();
                return true;
            case 38:
                com.google.android.gms.dynamic.b f216 = b.a.f2(parcel.readStrongBinder());
                u4 u4Var12 = (u4) zzayi.zza(parcel, u4.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtbVar = queryLocalInterface9 instanceof zzbtb ? (zzbtb) queryLocalInterface9 : new zzbsz(readStrongBinder9);
                }
                zzayi.zzc(parcel);
                zzt(f216, u4Var12, readString18, zzbtbVar);
                parcel2.writeNoException();
                return true;
            case 39:
                com.google.android.gms.dynamic.b f217 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzH(f217);
                parcel2.writeNoException();
                return true;
        }
    }
}
