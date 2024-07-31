package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.firebase.auth.f2 */
/* loaded from: classes.dex */
public final class C6067f2 implements Parcelable.Creator<C6091l> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6091l createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            if (C7139b.m21190w(m21155E) != 1) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                str = C7139b.m21184q(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C6091l(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6091l[] newArray(int i10) {
        return new C6091l[i10];
    }
}
