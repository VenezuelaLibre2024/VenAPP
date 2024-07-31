package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        zzp zzpVar = null;
        String str = null;
        String str2 = null;
        zzq[] zzqVarArr = null;
        zzn[] zznVarArr = null;
        String[] strArr = null;
        zzi[] zziVarArr = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 2:
                    zzpVar = (zzp) b.p(parcel, E, zzp.CREATOR);
                    break;
                case 3:
                    str = b.q(parcel, E);
                    break;
                case 4:
                    str2 = b.q(parcel, E);
                    break;
                case 5:
                    zzqVarArr = (zzq[]) b.t(parcel, E, zzq.CREATOR);
                    break;
                case 6:
                    zznVarArr = (zzn[]) b.t(parcel, E, zzn.CREATOR);
                    break;
                case 7:
                    strArr = b.r(parcel, E);
                    break;
                case 8:
                    zziVarArr = (zzi[]) b.t(parcel, E, zzi.CREATOR);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzl(zzpVar, str, str2, zzqVarArr, zznVarArr, strArr, zziVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
