package p418wa;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.measurement.internal.C5460d;
import com.google.android.gms.measurement.internal.C5461d0;
import com.google.android.gms.measurement.internal.C5524hb;
import com.google.android.gms.measurement.internal.C5576lb;
import java.util.Collection;

/* renamed from: wa.h */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC12107h extends zzbx implements InterfaceC12109i {
    public AbstractBinderC12107h() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Collection mo13619l0;
        switch (i10) {
            case 1:
                C5461d0 c5461d0 = (C5461d0) zzbw.zza(parcel, C5461d0.CREATOR);
                C5576lb c5576lb = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                zzbw.zzb(parcel);
                mo13609V0(c5461d0, c5576lb);
                parcel2.writeNoException();
                return true;
            case 2:
                C5524hb c5524hb = (C5524hb) zzbw.zza(parcel, C5524hb.CREATOR);
                C5576lb c5576lb2 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                zzbw.zzb(parcel);
                mo13613c2(c5524hb, c5576lb2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                C5576lb c5576lb3 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                zzbw.zzb(parcel);
                mo13615d1(c5576lb3);
                parcel2.writeNoException();
                return true;
            case 5:
                C5461d0 c5461d02 = (C5461d0) zzbw.zza(parcel, C5461d0.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbw.zzb(parcel);
                mo13607P1(c5461d02, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                C5576lb c5576lb4 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                zzbw.zzb(parcel);
                mo13602D0(c5576lb4);
                parcel2.writeNoException();
                return true;
            case 7:
                C5576lb c5576lb5 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                boolean zzc = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                mo13619l0 = mo13619l0(c5576lb5, zzc);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo13619l0);
                return true;
            case 9:
                C5461d0 c5461d03 = (C5461d0) zzbw.zza(parcel, C5461d0.CREATOR);
                String readString3 = parcel.readString();
                zzbw.zzb(parcel);
                byte[] mo13611a1 = mo13611a1(c5461d03, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(mo13611a1);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                zzbw.zzb(parcel);
                mo13604J(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                C5576lb c5576lb6 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                zzbw.zzb(parcel);
                String mo13606N0 = mo13606N0(c5576lb6);
                parcel2.writeNoException();
                parcel2.writeString(mo13606N0);
                return true;
            case 12:
                C5460d c5460d = (C5460d) zzbw.zza(parcel, C5460d.CREATOR);
                C5576lb c5576lb7 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                zzbw.zzb(parcel);
                mo13612b2(c5460d, c5576lb7);
                parcel2.writeNoException();
                return true;
            case 13:
                C5460d c5460d2 = (C5460d) zzbw.zza(parcel, C5460d.CREATOR);
                zzbw.zzb(parcel);
                mo13608T(c5460d2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean zzc2 = zzbw.zzc(parcel);
                C5576lb c5576lb8 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                zzbw.zzb(parcel);
                mo13619l0 = mo13603I1(readString7, readString8, zzc2, c5576lb8);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo13619l0);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean zzc3 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                mo13619l0 = mo13621p(readString9, readString10, readString11, zzc3);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo13619l0);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                C5576lb c5576lb9 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                zzbw.zzb(parcel);
                mo13619l0 = mo13614d(readString12, readString13, c5576lb9);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo13619l0);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                zzbw.zzb(parcel);
                mo13619l0 = mo13605K(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo13619l0);
                return true;
            case 18:
                C5576lb c5576lb10 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                zzbw.zzb(parcel);
                mo13622t0(c5576lb10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                C5576lb c5576lb11 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                zzbw.zzb(parcel);
                mo13601C0(bundle, c5576lb11);
                parcel2.writeNoException();
                return true;
            case 20:
                C5576lb c5576lb12 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                zzbw.zzb(parcel);
                mo13600A0(c5576lb12);
                parcel2.writeNoException();
                return true;
            case 21:
                C5576lb c5576lb13 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                zzbw.zzb(parcel);
                C12097c mo13610X = mo13610X(c5576lb13);
                parcel2.writeNoException();
                zzbw.zzb(parcel2, mo13610X);
                return true;
            case 24:
                C5576lb c5576lb14 = (C5576lb) zzbw.zza(parcel, C5576lb.CREATOR);
                Bundle bundle2 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                mo13619l0 = mo13617j0(c5576lb14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo13619l0);
                return true;
        }
    }
}
