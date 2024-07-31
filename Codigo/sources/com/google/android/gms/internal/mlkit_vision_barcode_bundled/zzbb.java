package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzbb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzat zzatVar = null;
        zzaw zzawVar = null;
        zzax zzaxVar = null;
        zzaz zzazVar = null;
        zzay zzayVar = null;
        zzau zzauVar = null;
        zzaq zzaqVar = null;
        zzar zzarVar = null;
        zzas zzasVar = null;
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
                    zzatVar = (zzat) b.p(parcel, E, zzat.CREATOR);
                    break;
                case 8:
                    zzawVar = (zzaw) b.p(parcel, E, zzaw.CREATOR);
                    break;
                case 9:
                    zzaxVar = (zzax) b.p(parcel, E, zzax.CREATOR);
                    break;
                case 10:
                    zzazVar = (zzaz) b.p(parcel, E, zzaz.CREATOR);
                    break;
                case 11:
                    zzayVar = (zzay) b.p(parcel, E, zzay.CREATOR);
                    break;
                case 12:
                    zzauVar = (zzau) b.p(parcel, E, zzau.CREATOR);
                    break;
                case 13:
                    zzaqVar = (zzaq) b.p(parcel, E, zzaq.CREATOR);
                    break;
                case 14:
                    zzarVar = (zzar) b.p(parcel, E, zzar.CREATOR);
                    break;
                case 15:
                    zzasVar = (zzas) b.p(parcel, E, zzas.CREATOR);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzba(i10, str, str2, bArr, pointArr, i11, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzba[i10];
    }
}
