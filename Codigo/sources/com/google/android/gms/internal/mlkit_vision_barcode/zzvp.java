package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzvp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        zzve zzveVar = null;
        String str = null;
        String str2 = null;
        zzvf[] zzvfVarArr = null;
        zzvc[] zzvcVarArr = null;
        String[] strArr = null;
        zzux[] zzuxVarArr = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 1:
                    zzveVar = (zzve) b.p(parcel, E, zzve.CREATOR);
                    break;
                case 2:
                    str = b.q(parcel, E);
                    break;
                case 3:
                    str2 = b.q(parcel, E);
                    break;
                case 4:
                    zzvfVarArr = (zzvf[]) b.t(parcel, E, zzvf.CREATOR);
                    break;
                case 5:
                    zzvcVarArr = (zzvc[]) b.t(parcel, E, zzvc.CREATOR);
                    break;
                case 6:
                    strArr = b.r(parcel, E);
                    break;
                case 7:
                    zzuxVarArr = (zzux[]) b.t(parcel, E, zzux.CREATOR);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzva(zzveVar, str, str2, zzvfVarArr, zzvcVarArr, strArr, zzuxVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzva[i10];
    }
}
