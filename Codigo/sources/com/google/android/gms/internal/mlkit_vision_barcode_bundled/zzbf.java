package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzbf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        zzap zzapVar = null;
        zzap zzapVar2 = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 1:
                    str = b.q(parcel, E);
                    break;
                case 2:
                    str2 = b.q(parcel, E);
                    break;
                case 3:
                    str3 = b.q(parcel, E);
                    break;
                case 4:
                    str4 = b.q(parcel, E);
                    break;
                case 5:
                    str5 = b.q(parcel, E);
                    break;
                case 6:
                    zzapVar = (zzap) b.p(parcel, E, zzap.CREATOR);
                    break;
                case 7:
                    zzapVar2 = (zzap) b.p(parcel, E, zzap.CREATOR);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzaq(str, str2, str3, str4, str5, zzapVar, zzapVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaq[i10];
    }
}