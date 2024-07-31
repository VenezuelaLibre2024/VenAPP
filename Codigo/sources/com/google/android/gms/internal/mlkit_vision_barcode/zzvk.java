package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzvk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzvc zzvcVar = null;
        zzvf zzvfVar = null;
        zzvg zzvgVar = null;
        zzvi zzviVar = null;
        zzvh zzvhVar = null;
        zzvd zzvdVar = null;
        zzuz zzuzVar = null;
        zzva zzvaVar = null;
        zzvb zzvbVar = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 1:
                    i10 = b.G(parcel, E);
                    break;
                case 2:
                    str = b.q(parcel, E);
                    break;
                case 3:
                    str2 = b.q(parcel, E);
                    break;
                case 4:
                    bArr = b.g(parcel, E);
                    break;
                case 5:
                    pointArr = (Point[]) b.t(parcel, E, Point.CREATOR);
                    break;
                case 6:
                    i11 = b.G(parcel, E);
                    break;
                case 7:
                    zzvcVar = (zzvc) b.p(parcel, E, zzvc.CREATOR);
                    break;
                case 8:
                    zzvfVar = (zzvf) b.p(parcel, E, zzvf.CREATOR);
                    break;
                case 9:
                    zzvgVar = (zzvg) b.p(parcel, E, zzvg.CREATOR);
                    break;
                case 10:
                    zzviVar = (zzvi) b.p(parcel, E, zzvi.CREATOR);
                    break;
                case 11:
                    zzvhVar = (zzvh) b.p(parcel, E, zzvh.CREATOR);
                    break;
                case 12:
                    zzvdVar = (zzvd) b.p(parcel, E, zzvd.CREATOR);
                    break;
                case 13:
                    zzuzVar = (zzuz) b.p(parcel, E, zzuz.CREATOR);
                    break;
                case 14:
                    zzvaVar = (zzva) b.p(parcel, E, zzva.CREATOR);
                    break;
                case 15:
                    zzvbVar = (zzvb) b.p(parcel, E, zzvb.CREATOR);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzvj(i10, str, str2, bArr, pointArr, i11, zzvcVar, zzvfVar, zzvgVar, zzviVar, zzvhVar, zzvdVar, zzuzVar, zzvaVar, zzvbVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvj[i10];
    }
}
