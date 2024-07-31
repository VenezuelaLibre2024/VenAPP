package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ca.b bVar = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i11 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 3) {
                pendingIntent = (PendingIntent) ea.b.p(parcel, E, PendingIntent.CREATOR);
            } else if (w10 == 4) {
                bVar = (ca.b) ea.b.p(parcel, E, ca.b.CREATOR);
            } else if (w10 != 1000) {
                ea.b.N(parcel, E);
            } else {
                i10 = ea.b.G(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new Status(i10, i11, str, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
