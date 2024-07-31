package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 == 3) {
                z11 = ea.b.x(parcel, E);
            } else if (w10 == 4) {
                i11 = ea.b.G(parcel, E);
            } else if (w10 != 5) {
                ea.b.N(parcel, E);
            } else {
                i12 = ea.b.G(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new u(i10, z10, z11, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new u[i10];
    }
}
