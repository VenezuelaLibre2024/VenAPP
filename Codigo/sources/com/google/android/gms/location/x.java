package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        Status status = null;
        s sVar = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                status = (Status) ea.b.p(parcel, E, Status.CREATOR);
            } else if (w10 != 2) {
                ea.b.N(parcel, E);
            } else {
                sVar = (s) ea.b.p(parcel, E, s.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new r(status, sVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
