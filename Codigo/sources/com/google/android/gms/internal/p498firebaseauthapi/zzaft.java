package com.google.android.gms.internal.p498firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* loaded from: classes2.dex */
public final class zzaft implements Parcelable.Creator<zzafq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafq createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 2) {
                str2 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                str3 = C7139b.m21184q(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new zzafq(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafq[] newArray(int i10) {
        return new zzafq[i10];
    }
}
