package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbsv;

/* renamed from: com.google.android.gms.ads.internal.client.e1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4813e1 extends zzayh implements InterfaceC4820f1 {
    public AbstractBinderC4813e1() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface mo12352j1;
        switch (i10) {
            case 1:
                InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                C4947z4 c4947z4 = (C4947z4) zzayi.zza(parcel, C4947z4.CREATOR);
                String readString = parcel.readString();
                zzbsv zzf = zzbsu.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzayi.zzc(parcel);
                mo12352j1 = mo12352j1(m13410f2, c4947z4, readString, zzf, readInt);
                break;
            case 2:
                InterfaceC5312b m13410f22 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                C4947z4 c4947z42 = (C4947z4) zzayi.zza(parcel, C4947z4.CREATOR);
                String readString2 = parcel.readString();
                zzbsv zzf2 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzayi.zzc(parcel);
                mo12352j1 = mo12357x0(m13410f22, c4947z42, readString2, zzf2, readInt2);
                break;
            case 3:
                InterfaceC5312b m13410f23 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbsv zzf3 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzayi.zzc(parcel);
                mo12352j1 = mo12356v1(m13410f23, readString3, zzf3, readInt3);
                break;
            case 4:
            case 7:
                InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                zzayi.zzf(parcel2, null);
                return true;
            case 5:
                InterfaceC5312b m13410f24 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                InterfaceC5312b m13410f25 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                mo12352j1 = mo12347R(m13410f24, m13410f25);
                break;
            case 6:
                InterfaceC5312b m13410f26 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                zzbsv zzf4 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzayi.zzc(parcel);
                mo12352j1 = mo12354t1(m13410f26, zzf4, readInt4);
                break;
            case 8:
                InterfaceC5312b m13410f27 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                mo12352j1 = zzm(m13410f27);
                break;
            case 9:
                InterfaceC5312b m13410f28 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzayi.zzc(parcel);
                mo12352j1 = zzg(m13410f28, readInt5);
                break;
            case 10:
                InterfaceC5312b m13410f29 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                C4947z4 c4947z43 = (C4947z4) zzayi.zza(parcel, C4947z4.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzayi.zzc(parcel);
                mo12352j1 = mo12353o1(m13410f29, c4947z43, readString4, readInt6);
                break;
            case 11:
                InterfaceC5312b m13410f210 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                InterfaceC5312b m13410f211 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                InterfaceC5312b m13410f212 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                mo12352j1 = mo12355u1(m13410f210, m13410f211, m13410f212);
                break;
            case 12:
                InterfaceC5312b m13410f213 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbsv zzf5 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzayi.zzc(parcel);
                mo12352j1 = mo12351g(m13410f213, readString5, zzf5, readInt7);
                break;
            case 13:
                InterfaceC5312b m13410f214 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                C4947z4 c4947z44 = (C4947z4) zzayi.zza(parcel, C4947z4.CREATOR);
                String readString6 = parcel.readString();
                zzbsv zzf6 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzayi.zzc(parcel);
                mo12352j1 = mo12349W0(m13410f214, c4947z44, readString6, zzf6, readInt8);
                break;
            case 14:
                InterfaceC5312b m13410f215 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                zzbsv zzf7 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzayi.zzc(parcel);
                mo12352j1 = mo12346P0(m13410f215, zzf7, readInt9);
                break;
            case 15:
                InterfaceC5312b m13410f216 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                zzbsv zzf8 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzayi.zzc(parcel);
                mo12352j1 = mo12348R1(m13410f216, zzf8, readInt10);
                break;
            case 16:
                InterfaceC5312b m13410f217 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                zzbsv zzf9 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzboe zzc = zzbod.zzc(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                mo12352j1 = mo12350e0(m13410f217, zzf9, readInt11, zzc);
                break;
            case 17:
                InterfaceC5312b m13410f218 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                zzbsv zzf10 = zzbsu.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzayi.zzc(parcel);
                mo12352j1 = mo12345D(m13410f218, zzf10, readInt12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        zzayi.zzf(parcel2, mo12352j1);
        return true;
    }
}
