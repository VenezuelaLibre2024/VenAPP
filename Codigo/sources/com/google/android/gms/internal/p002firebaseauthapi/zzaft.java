package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzaft implements Parcelable.Creator<zzafq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafq createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            int w10 = b.w(E);
            if (w10 == 1) {
                str = b.q(parcel, E);
            } else if (w10 == 2) {
                str2 = b.q(parcel, E);
            } else if (w10 != 3) {
                b.N(parcel, E);
            } else {
                str3 = b.q(parcel, E);
            }
        }
        b.v(parcel, O);
        return new zzafq(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafq[] newArray(int i10) {
        return new zzafq[i10];
    }
}
