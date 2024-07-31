package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        c3 c3Var = null;
        IBinder iBinder = null;
        int i10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 3) {
                str2 = ea.b.q(parcel, E);
            } else if (w10 == 4) {
                c3Var = (c3) ea.b.p(parcel, E, c3.CREATOR);
            } else if (w10 != 5) {
                ea.b.N(parcel, E);
            } else {
                iBinder = ea.b.F(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new c3(i10, str, str2, c3Var, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c3[i10];
    }
}
