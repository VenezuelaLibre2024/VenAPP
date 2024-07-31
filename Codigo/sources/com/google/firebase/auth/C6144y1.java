package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.firebase.auth.y1 */
/* loaded from: classes.dex */
public final class C6144y1 implements Parcelable.Creator<C6058d1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6058d1 createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        String str2 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 3) {
                str2 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 4) {
                z10 = C7139b.m21191x(parcel, m21155E);
            } else if (m21190w != 5) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                z11 = C7139b.m21191x(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C6058d1(str, str2, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6058d1[] newArray(int i10) {
        return new C6058d1[i10];
    }
}
