package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbsv;

/* loaded from: classes.dex */
public abstract class e1 extends zzayh implements f1 {
    public e1() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface j12;
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                z4 z4Var = (z4) zzayi.zza(parcel, z4.CREATOR);
                String readString = parcel.readString();
                zzbsv zzf = zzbsu.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzayi.zzc(parcel);
                j12 = j1(f22, z4Var, readString, zzf, readInt);
                break;
            case 2:
                com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                z4 z4Var2 = (z4) zzayi.zza(parcel, z4.CREATOR);
                String readString2 = parcel.readString();
                zzbsv zzf2 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzayi.zzc(parcel);
                j12 = x0(f23, z4Var2, readString2, zzf2, readInt2);
                break;
            case 3:
                com.google.android.gms.dynamic.b f24 = b.a.f2(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbsv zzf3 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzayi.zzc(parcel);
                j12 = v1(f24, readString3, zzf3, readInt3);
                break;
            case 4:
            case 7:
                b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                zzayi.zzf(parcel2, null);
                return true;
            case 5:
                com.google.android.gms.dynamic.b f25 = b.a.f2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b f26 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                j12 = R(f25, f26);
                break;
            case 6:
                com.google.android.gms.dynamic.b f27 = b.a.f2(parcel.readStrongBinder());
                zzbsv zzf4 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzayi.zzc(parcel);
                j12 = t1(f27, zzf4, readInt4);
                break;
            case 8:
                com.google.android.gms.dynamic.b f28 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                j12 = zzm(f28);
                break;
            case 9:
                com.google.android.gms.dynamic.b f29 = b.a.f2(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzayi.zzc(parcel);
                j12 = zzg(f29, readInt5);
                break;
            case 10:
                com.google.android.gms.dynamic.b f210 = b.a.f2(parcel.readStrongBinder());
                z4 z4Var3 = (z4) zzayi.zza(parcel, z4.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzayi.zzc(parcel);
                j12 = o1(f210, z4Var3, readString4, readInt6);
                break;
            case 11:
                com.google.android.gms.dynamic.b f211 = b.a.f2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b f212 = b.a.f2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b f213 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                j12 = u1(f211, f212, f213);
                break;
            case 12:
                com.google.android.gms.dynamic.b f214 = b.a.f2(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbsv zzf5 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzayi.zzc(parcel);
                j12 = g(f214, readString5, zzf5, readInt7);
                break;
            case 13:
                com.google.android.gms.dynamic.b f215 = b.a.f2(parcel.readStrongBinder());
                z4 z4Var4 = (z4) zzayi.zza(parcel, z4.CREATOR);
                String readString6 = parcel.readString();
                zzbsv zzf6 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzayi.zzc(parcel);
                j12 = W0(f215, z4Var4, readString6, zzf6, readInt8);
                break;
            case 14:
                com.google.android.gms.dynamic.b f216 = b.a.f2(parcel.readStrongBinder());
                zzbsv zzf7 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzayi.zzc(parcel);
                j12 = P0(f216, zzf7, readInt9);
                break;
            case 15:
                com.google.android.gms.dynamic.b f217 = b.a.f2(parcel.readStrongBinder());
                zzbsv zzf8 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzayi.zzc(parcel);
                j12 = R1(f217, zzf8, readInt10);
                break;
            case 16:
                com.google.android.gms.dynamic.b f218 = b.a.f2(parcel.readStrongBinder());
                zzbsv zzf9 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzboe zzc = zzbod.zzc(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                j12 = e0(f218, zzf9, readInt11, zzc);
                break;
            case 17:
                com.google.android.gms.dynamic.b f219 = b.a.f2(parcel.readStrongBinder());
                zzbsv zzf10 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzayi.zzc(parcel);
                j12 = D(f219, zzf10, readInt12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        zzayi.zzf(parcel2, j12);
        return true;
    }
}
