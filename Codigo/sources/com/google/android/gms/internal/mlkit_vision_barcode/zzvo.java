package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzvo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        zzuy zzuyVar = null;
        zzuy zzuyVar2 = null;
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
                    zzuyVar = (zzuy) b.p(parcel, E, zzuy.CREATOR);
                    break;
                case 7:
                    zzuyVar2 = (zzuy) b.p(parcel, E, zzuy.CREATOR);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzuz(str, str2, str3, str4, str5, zzuyVar, zzuyVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzuz[i10];
    }
}
