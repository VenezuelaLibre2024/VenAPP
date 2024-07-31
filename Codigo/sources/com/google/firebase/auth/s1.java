package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s1 implements Parcelable.Creator<o0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o0 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 2) {
                str2 = ea.b.q(parcel, E);
            } else if (w10 == 4) {
                str3 = ea.b.q(parcel, E);
            } else if (w10 == 5) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 != 6) {
                ea.b.N(parcel, E);
            } else {
                str4 = ea.b.q(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new o0(str, str2, str3, z10, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o0[] newArray(int i10) {
        return new o0[i10];
    }
}
