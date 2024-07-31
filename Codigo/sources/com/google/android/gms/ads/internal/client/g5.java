package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            if (ea.b.w(E) != 2) {
                ea.b.N(parcel, E);
            } else {
                i10 = ea.b.G(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new f5(i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f5[i10];
    }
}
