package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public abstract class zzfsv extends zzayh implements zzfsw {
    public zzfsv() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                b.a.f2(parcel.readStrongBinder());
                parcel.readString();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.createIntArray();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.createByteArray();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
            case 7:
                parcel.readInt();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                b.a.f2(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
