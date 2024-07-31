package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.common.server.response.k */
/* loaded from: classes.dex */
public final class C5310k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        Parcel parcel2 = null;
        C5307h c5307h = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                parcel2 = C7139b.m21181n(parcel, m21155E);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                c5307h = (C5307h) C7139b.m21183p(parcel, m21155E, C5307h.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5302c(i10, parcel2, c5307h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5302c[i10];
    }
}
