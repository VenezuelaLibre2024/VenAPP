package com.google.android.gms.internal.p498firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* loaded from: classes2.dex */
public final class zzafm implements Parcelable.Creator<zzafn> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafn createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 3) {
                str2 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 4) {
                l10 = C7139b.m21161K(parcel, m21155E);
            } else if (m21190w == 5) {
                str3 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 6) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                l11 = C7139b.m21161K(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new zzafn(str, str2, l10, str3, l11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafn[] newArray(int i10) {
        return new zzafn[i10];
    }
}
