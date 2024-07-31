package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        Parcel parcel2 = null;
        h hVar = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                parcel2 = ea.b.n(parcel, E);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                hVar = (h) ea.b.p(parcel, E, h.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new c(i10, parcel2, hVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
