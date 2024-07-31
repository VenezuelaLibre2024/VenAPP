package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n1 implements Parcelable.Creator<d0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d0 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            if (ea.b.w(E) != 1) {
                ea.b.N(parcel, E);
            } else {
                str = ea.b.q(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new d0(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d0[] newArray(int i10) {
        return new d0[i10];
    }
}
