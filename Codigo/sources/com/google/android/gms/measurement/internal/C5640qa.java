package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.measurement.internal.qa */
/* loaded from: classes2.dex */
public final class C5640qa implements Parcelable.Creator<C5601na> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5601na createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 2) {
                j10 = C7139b.m21160J(parcel, m21155E);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                i10 = C7139b.m21157G(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5601na(str, j10, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5601na[] newArray(int i10) {
        return new C5601na[i10];
    }
}
