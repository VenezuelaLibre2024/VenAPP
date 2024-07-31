package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        long j10 = 0;
        String str = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                i11 = ea.b.G(parcel, E);
            } else if (w10 == 3) {
                str = ea.b.q(parcel, E);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                j10 = ea.b.J(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new b5(i10, i11, str, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b5[i10];
    }
}
