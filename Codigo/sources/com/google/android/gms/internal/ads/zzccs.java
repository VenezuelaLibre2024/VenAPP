package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class zzccs extends zzayh implements zzcct {
    public zzccs() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcct zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzcct ? (zzcct) queryLocalInterface : new zzccr(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzccq zzccqVar = null;
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                zzccx zzccxVar = (zzccx) zzayi.zza(parcel, zzccx.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzccqVar = queryLocalInterface instanceof zzccq ? (zzccq) queryLocalInterface : new zzcco(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzf(f22, zzccxVar, zzccqVar);
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzk(f23);
                parcel2.writeNoException();
                return true;
            case 3:
                b.a.f2(parcel.readStrongBinder());
            case 4:
                b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                zzayi.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.b f24 = b.a.f2(parcel.readStrongBinder());
                zzbxi zzb = zzbxh.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzm(createTypedArrayList, f24, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.b f25 = b.a.f2(parcel.readStrongBinder());
                zzbxi zzb2 = zzbxh.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzl(createTypedArrayList2, f25, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxr zzbxrVar = (zzbxr) zzayi.zza(parcel, zzbxr.CREATOR);
                zzayi.zzc(parcel);
                zzg(zzbxrVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.dynamic.b f26 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzj(f26);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.b f27 = b.a.f2(parcel.readStrongBinder());
                zzbxi zzb3 = zzbxh.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzi(createTypedArrayList3, f27, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.b f28 = b.a.f2(parcel.readStrongBinder());
                zzbxi zzb4 = zzbxh.zzb(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzh(createTypedArrayList4, f28, zzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.dynamic.b f29 = b.a.f2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b f210 = b.a.f2(parcel.readStrongBinder());
                String readString = parcel.readString();
                com.google.android.gms.dynamic.b f211 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                com.google.android.gms.dynamic.b zze = zze(f29, f210, readString, f211);
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zze);
                return true;
            default:
                return false;
        }
    }
}
