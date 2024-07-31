package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o2 extends zzayh implements p2 {
    public o2() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static p2 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof p2 ? (p2) queryLocalInterface : new n2(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String zzg;
        Parcelable zzf;
        switch (i10) {
            case 1:
                zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 2:
                zzg = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 3:
                List zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzj);
                return true;
            case 4:
                zzf = zzf();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zzf);
                return true;
            case 5:
                zzf = zze();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zzf);
                return true;
            case 6:
                zzg = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            default:
                return false;
        }
    }
}
