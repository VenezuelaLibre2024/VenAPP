package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y1 implements Parcelable.Creator<d1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d1 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 3) {
                str2 = ea.b.q(parcel, E);
            } else if (w10 == 4) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 != 5) {
                ea.b.N(parcel, E);
            } else {
                z11 = ea.b.x(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new d1(str, str2, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d1[] newArray(int i10) {
        return new d1[i10];
    }
}
