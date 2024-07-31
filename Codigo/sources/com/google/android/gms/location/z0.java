package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        ArrayList arrayList = null;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                arrayList = ea.b.u(parcel, E, LocationRequest.CREATOR);
            } else if (w10 == 2) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                z11 = ea.b.x(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new p(arrayList, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }
}
