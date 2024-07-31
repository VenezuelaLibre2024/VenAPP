package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.q0;

/* loaded from: classes.dex */
public final class b2 implements Parcelable.Creator<q0.a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q0.a createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            ea.b.w(E);
            ea.b.N(parcel, E);
        }
        ea.b.v(parcel, O);
        return new q0.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q0.a[] newArray(int i10) {
        return new q0.a[i10];
    }
}
