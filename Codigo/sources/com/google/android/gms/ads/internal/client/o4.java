package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 == 3) {
                z11 = ea.b.x(parcel, E);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                z12 = ea.b.x(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new n4(z10, z11, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n4[i10];
    }
}
