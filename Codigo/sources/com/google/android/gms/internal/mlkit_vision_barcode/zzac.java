package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzac implements Parcelable.Creator {
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
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 2:
                    str = b.q(parcel, E);
                    break;
                case 3:
                    str2 = b.q(parcel, E);
                    break;
                case 4:
                    str3 = b.q(parcel, E);
                    break;
                case 5:
                    str4 = b.q(parcel, E);
                    break;
                case 6:
                    str5 = b.q(parcel, E);
                    break;
                case 7:
                    str6 = b.q(parcel, E);
                    break;
                case 8:
                    str7 = b.q(parcel, E);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzp(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzp[i10];
    }
}