package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzbg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        zzav zzavVar = null;
        String str = null;
        String str2 = null;
        zzaw[] zzawVarArr = null;
        zzat[] zzatVarArr = null;
        String[] strArr = null;
        zzao[] zzaoVarArr = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 1:
                    zzavVar = (zzav) b.p(parcel, E, zzav.CREATOR);
                    break;
                case 2:
                    str = b.q(parcel, E);
                    break;
                case 3:
                    str2 = b.q(parcel, E);
                    break;
                case 4:
                    zzawVarArr = (zzaw[]) b.t(parcel, E, zzaw.CREATOR);
                    break;
                case 5:
                    zzatVarArr = (zzat[]) b.t(parcel, E, zzat.CREATOR);
                    break;
                case 6:
                    strArr = b.r(parcel, E);
                    break;
                case 7:
                    zzaoVarArr = (zzao[]) b.t(parcel, E, zzao.CREATOR);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzar(zzavVar, str, str2, zzawVarArr, zzatVarArr, strArr, zzaoVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzar[i10];
    }
}
