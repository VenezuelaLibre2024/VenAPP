package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzbjp extends zzayh implements zzbjq {
    public zzbjp() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbjq zzbJ(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof zzbjq ? (zzbjq) queryLocalInterface : new zzbjo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbjj zzbjhVar;
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzbE(readString, f22);
                break;
            case 2:
                String readString2 = parcel.readString();
                zzayi.zzc(parcel);
                com.google.android.gms.dynamic.b zzb = zzb(readString2);
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzb);
                return true;
            case 3:
                com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzbI(f23);
                break;
            case 4:
                zzc();
                break;
            case 5:
                b.a.f2(parcel.readStrongBinder());
                parcel.readInt();
                zzayi.zzc(parcel);
                break;
            case 6:
                com.google.android.gms.dynamic.b f24 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzbF(f24);
                break;
            case 7:
                com.google.android.gms.dynamic.b f25 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzd(f25);
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbjhVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbjhVar = queryLocalInterface instanceof zzbjj ? (zzbjj) queryLocalInterface : new zzbjh(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzbG(zzbjhVar);
                break;
            case 9:
                com.google.android.gms.dynamic.b f26 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzbH(f26);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
