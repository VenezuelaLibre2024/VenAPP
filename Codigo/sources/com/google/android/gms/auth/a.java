package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        Long l10 = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
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
                    l10 = b.K(parcel, E);
                    break;
                case 4:
                    z10 = b.x(parcel, E);
                    break;
                case 5:
                    z11 = b.x(parcel, E);
                    break;
                case 6:
                    arrayList = b.s(parcel, E);
                    break;
                case 7:
                    str2 = b.q(parcel, E);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new TokenData(i10, str, l10, z10, z11, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new TokenData[i10];
    }
}
