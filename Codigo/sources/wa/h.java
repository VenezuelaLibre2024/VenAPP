package wa;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.measurement.internal.hb;
import com.google.android.gms.measurement.internal.lb;
import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class h extends zzbx implements i {
    public h() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Collection l02;
        switch (i10) {
            case 1:
                com.google.android.gms.measurement.internal.d0 d0Var = (com.google.android.gms.measurement.internal.d0) zzbw.zza(parcel, com.google.android.gms.measurement.internal.d0.CREATOR);
                lb lbVar = (lb) zzbw.zza(parcel, lb.CREATOR);
                zzbw.zzb(parcel);
                V0(d0Var, lbVar);
                parcel2.writeNoException();
                return true;
            case 2:
                hb hbVar = (hb) zzbw.zza(parcel, hb.CREATOR);
                lb lbVar2 = (lb) zzbw.zza(parcel, lb.CREATOR);
                zzbw.zzb(parcel);
                c2(hbVar, lbVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                lb lbVar3 = (lb) zzbw.zza(parcel, lb.CREATOR);
                zzbw.zzb(parcel);
                d1(lbVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.d0 d0Var2 = (com.google.android.gms.measurement.internal.d0) zzbw.zza(parcel, com.google.android.gms.measurement.internal.d0.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbw.zzb(parcel);
                P1(d0Var2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                lb lbVar4 = (lb) zzbw.zza(parcel, lb.CREATOR);
                zzbw.zzb(parcel);
                D0(lbVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                lb lbVar5 = (lb) zzbw.zza(parcel, lb.CREATOR);
                boolean zzc = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                l02 = l0(lbVar5, zzc);
                parcel2.writeNoException();
                parcel2.writeTypedList(l02);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.d0 d0Var3 = (com.google.android.gms.measurement.internal.d0) zzbw.zza(parcel, com.google.android.gms.measurement.internal.d0.CREATOR);
                String readString3 = parcel.readString();
                zzbw.zzb(parcel);
                byte[] a12 = a1(d0Var3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(a12);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                zzbw.zzb(parcel);
                J(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                lb lbVar6 = (lb) zzbw.zza(parcel, lb.CREATOR);
                zzbw.zzb(parcel);
                String N0 = N0(lbVar6);
                parcel2.writeNoException();
                parcel2.writeString(N0);
                return true;
            case 12:
                com.google.android.gms.measurement.internal.d dVar = (com.google.android.gms.measurement.internal.d) zzbw.zza(parcel, com.google.android.gms.measurement.internal.d.CREATOR);
                lb lbVar7 = (lb) zzbw.zza(parcel, lb.CREATOR);
                zzbw.zzb(parcel);
                b2(dVar, lbVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.measurement.internal.d dVar2 = (com.google.android.gms.measurement.internal.d) zzbw.zza(parcel, com.google.android.gms.measurement.internal.d.CREATOR);
                zzbw.zzb(parcel);
                T(dVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean zzc2 = zzbw.zzc(parcel);
                lb lbVar8 = (lb) zzbw.zza(parcel, lb.CREATOR);
                zzbw.zzb(parcel);
                l02 = I1(readString7, readString8, zzc2, lbVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(l02);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean zzc3 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                l02 = p(readString9, readString10, readString11, zzc3);
                parcel2.writeNoException();
                parcel2.writeTypedList(l02);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                lb lbVar9 = (lb) zzbw.zza(parcel, lb.CREATOR);
                zzbw.zzb(parcel);
                l02 = d(readString12, readString13, lbVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(l02);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                zzbw.zzb(parcel);
                l02 = K(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(l02);
                return true;
            case 18:
                lb lbVar10 = (lb) zzbw.zza(parcel, lb.CREATOR);
                zzbw.zzb(parcel);
                t0(lbVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                lb lbVar11 = (lb) zzbw.zza(parcel, lb.CREATOR);
                zzbw.zzb(parcel);
                C0(bundle, lbVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                lb lbVar12 = (lb) zzbw.zza(parcel, lb.CREATOR);
                zzbw.zzb(parcel);
                A0(lbVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                lb lbVar13 = (lb) zzbw.zza(parcel, lb.CREATOR);
                zzbw.zzb(parcel);
                c X = X(lbVar13);
                parcel2.writeNoException();
                zzbw.zzb(parcel2, X);
                return true;
            case 24:
                lb lbVar14 = (lb) zzbw.zza(parcel, lb.CREATOR);
                Bundle bundle2 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                l02 = j0(lbVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(l02);
                return true;
        }
    }
}
