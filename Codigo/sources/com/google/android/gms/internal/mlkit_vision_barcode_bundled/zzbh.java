package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzbh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
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
                    str6 = b.q(parcel, E);
                    break;
                case 7:
                    str7 = b.q(parcel, E);
                    break;
                case 8:
                    str8 = b.q(parcel, E);
                    break;
                case 9:
                    str9 = b.q(parcel, E);
                    break;
                case 10:
                    str10 = b.q(parcel, E);
                    break;
                case 11:
                    str11 = b.q(parcel, E);
                    break;
                case 12:
                    str12 = b.q(parcel, E);
                    break;
                case 13:
                    str13 = b.q(parcel, E);
                    break;
                case 14:
                    str14 = b.q(parcel, E);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzas(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzas[i10];
    }
}
