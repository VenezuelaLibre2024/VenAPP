package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.r2 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4897r2 extends zzayh implements InterfaceC4903s2 {
    public AbstractBinderC4897r2() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static InterfaceC4903s2 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof InterfaceC4903s2 ? (InterfaceC4903s2) queryLocalInterface : new C4891q2(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        float zzg;
        InterfaceC4921v2 c4909t2;
        int i12;
        boolean z10;
        switch (i10) {
            case 1:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzg2 = zzayi.zzg(parcel);
                zzayi.zzc(parcel);
                zzj(zzg2);
                parcel2.writeNoException();
                return true;
            case 4:
                z10 = zzq();
                parcel2.writeNoException();
                int i13 = zzayi.zza;
                i12 = z10;
                parcel2.writeInt(i12);
                return true;
            case 5:
                int zzh = zzh();
                parcel2.writeNoException();
                i12 = zzh;
                parcel2.writeInt(i12);
                return true;
            case 6:
                zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 7:
                zzg = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c4909t2 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    c4909t2 = queryLocalInterface instanceof InterfaceC4921v2 ? (InterfaceC4921v2) queryLocalInterface : new C4909t2(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzm(c4909t2);
                parcel2.writeNoException();
                return true;
            case 9:
                zzg = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 10:
                z10 = zzp();
                parcel2.writeNoException();
                int i132 = zzayi.zza;
                i12 = z10;
                parcel2.writeInt(i12);
                return true;
            case 11:
                InterfaceC4921v2 zzi = zzi();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzi);
                return true;
            case 12:
                z10 = zzo();
                parcel2.writeNoException();
                int i1322 = zzayi.zza;
                i12 = z10;
                parcel2.writeInt(i12);
                return true;
            case 13:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
