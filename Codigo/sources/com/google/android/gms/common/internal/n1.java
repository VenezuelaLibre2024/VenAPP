package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        Bundle bundle = null;
        f fVar = null;
        int i10 = 0;
        ca.d[] dVarArr = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                bundle = ea.b.f(parcel, E);
            } else if (w10 == 2) {
                dVarArr = (ca.d[]) ea.b.t(parcel, E, ca.d.CREATOR);
            } else if (w10 == 3) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                fVar = (f) ea.b.p(parcel, E, f.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new m1(bundle, dVarArr, i10, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new m1[i10];
    }
}
