package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class zzbkp extends zzayh implements zzbkq {
    public zzbkp() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbkq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof zzbkq ? (zzbkq) queryLocalInterface : new zzbko(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbkg zzbkeVar;
        if (i10 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbkeVar = queryLocalInterface instanceof zzbkg ? (zzbkg) queryLocalInterface : new zzbke(readStrongBinder);
        }
        String readString = parcel.readString();
        zzayi.zzc(parcel);
        zze(zzbkeVar, readString);
        parcel2.writeNoException();
        return true;
    }
}