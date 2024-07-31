package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class qa implements Parcelable.Creator<na> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ na createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 2) {
                j10 = ea.b.J(parcel, E);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                i10 = ea.b.G(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new na(str, j10, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ na[] newArray(int i10) {
        return new na[i10];
    }
}
