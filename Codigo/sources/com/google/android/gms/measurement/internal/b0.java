package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class b0 implements Parcelable.Creator<z> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            if (ea.b.w(E) != 2) {
                ea.b.N(parcel, E);
            } else {
                bundle = ea.b.f(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new z(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z[] newArray(int i10) {
        return new z[i10];
    }
}
