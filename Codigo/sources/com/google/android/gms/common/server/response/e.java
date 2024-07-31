package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        String str = null;
        a.C0150a c0150a = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                str = ea.b.q(parcel, E);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                c0150a = (a.C0150a) ea.b.p(parcel, E, a.C0150a.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new g(i10, str, c0150a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
