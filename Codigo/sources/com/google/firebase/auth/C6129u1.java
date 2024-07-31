package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.firebase.auth.u1 */
/* loaded from: classes.dex */
public final class C6129u1 implements Parcelable.Creator<C6124t0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6124t0 createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 2) {
                str2 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 3) {
                j10 = C7139b.m21160J(parcel, m21155E);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                str3 = C7139b.m21184q(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C6124t0(str, str2, j10, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6124t0[] newArray(int i10) {
        return new C6124t0[i10];
    }
}
