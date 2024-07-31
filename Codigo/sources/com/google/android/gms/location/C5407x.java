package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.location.x */
/* loaded from: classes2.dex */
public final class C5407x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        Status status = null;
        C5397s c5397s = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                status = (Status) C7139b.m21183p(parcel, m21155E, Status.CREATOR);
            } else if (m21190w != 2) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                c5397s = (C5397s) C7139b.m21183p(parcel, m21155E, C5397s.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5395r(status, c5397s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5395r[i10];
    }
}
