package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x1 implements Parcelable.Creator<a1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a1 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                str = ea.b.q(parcel, E);
            } else if (w10 != 2) {
                ea.b.N(parcel, E);
            } else {
                str2 = ea.b.q(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new a1(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a1[] newArray(int i10) {
        return new a1[i10];
    }
}