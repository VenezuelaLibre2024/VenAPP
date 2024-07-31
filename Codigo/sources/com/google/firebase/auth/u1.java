package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class u1 implements Parcelable.Creator<t0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t0 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 2) {
                str2 = ea.b.q(parcel, E);
            } else if (w10 == 3) {
                j10 = ea.b.J(parcel, E);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                str3 = ea.b.q(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new t0(str, str2, j10, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t0[] newArray(int i10) {
        return new t0[i10];
    }
}
