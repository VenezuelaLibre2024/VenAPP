package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.firebase.auth.e2 */
/* loaded from: classes.dex */
public final class C6063e2 implements Parcelable.Creator<C6083j> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6083j createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 2) {
                str2 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 3) {
                str3 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 4) {
                str4 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 5) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                z10 = C7139b.m21191x(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C6083j(str, str2, str3, str4, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6083j[] newArray(int i10) {
        return new C6083j[i10];
    }
}
