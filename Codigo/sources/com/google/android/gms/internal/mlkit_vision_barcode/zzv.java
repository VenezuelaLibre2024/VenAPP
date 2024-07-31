package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        double d10 = 0.0d;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        zzn zznVar = null;
        zzq zzqVar = null;
        zzr zzrVar = null;
        zzt zztVar = null;
        zzs zzsVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzl zzlVar = null;
        zzm zzmVar = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 2:
                    i10 = b.G(parcel, E);
                    break;
                case 3:
                    str = b.q(parcel, E);
                    break;
                case 4:
                    str2 = b.q(parcel, E);
                    break;
                case 5:
                    i11 = b.G(parcel, E);
                    break;
                case 6:
                    pointArr = (Point[]) b.t(parcel, E, Point.CREATOR);
                    break;
                case 7:
                    zznVar = (zzn) b.p(parcel, E, zzn.CREATOR);
                    break;
                case 8:
                    zzqVar = (zzq) b.p(parcel, E, zzq.CREATOR);
                    break;
                case 9:
                    zzrVar = (zzr) b.p(parcel, E, zzr.CREATOR);
                    break;
                case 10:
                    zztVar = (zzt) b.p(parcel, E, zzt.CREATOR);
                    break;
                case 11:
                    zzsVar = (zzs) b.p(parcel, E, zzs.CREATOR);
                    break;
                case 12:
                    zzoVar = (zzo) b.p(parcel, E, zzo.CREATOR);
                    break;
                case 13:
                    zzkVar = (zzk) b.p(parcel, E, zzk.CREATOR);
                    break;
                case 14:
                    zzlVar = (zzl) b.p(parcel, E, zzl.CREATOR);
                    break;
                case 15:
                    zzmVar = (zzm) b.p(parcel, E, zzm.CREATOR);
                    break;
                case 16:
                    bArr = b.g(parcel, E);
                    break;
                case 17:
                    z10 = b.x(parcel, E);
                    break;
                case 18:
                    d10 = b.A(parcel, E);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzu(i10, str, str2, i11, pointArr, zznVar, zzqVar, zzrVar, zztVar, zzsVar, zzoVar, zzkVar, zzlVar, zzmVar, bArr, z10, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzu[i10];
    }
}
