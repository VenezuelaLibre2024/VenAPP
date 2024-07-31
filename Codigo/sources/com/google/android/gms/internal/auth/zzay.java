package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzay implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            int w10 = b.w(E);
            if (w10 == 1) {
                i10 = b.G(parcel, E);
            } else if (w10 != 2) {
                b.N(parcel, E);
            } else {
                str = b.q(parcel, E);
            }
        }
        b.v(parcel, O);
        return new zzax(i10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzax[i10];
    }
}
