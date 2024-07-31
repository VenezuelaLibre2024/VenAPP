package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ca.C1898d;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.common.internal.n1 */
/* loaded from: classes.dex */
public final class C5263n1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        Bundle bundle = null;
        C5237f c5237f = null;
        int i10 = 0;
        C1898d[] c1898dArr = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                bundle = C7139b.m21173f(parcel, m21155E);
            } else if (m21190w == 2) {
                c1898dArr = (C1898d[]) C7139b.m21187t(parcel, m21155E, C1898d.CREATOR);
            } else if (m21190w == 3) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                c5237f = (C5237f) C7139b.m21183p(parcel, m21155E, C5237f.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5260m1(bundle, c1898dArr, i10, c5237f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5260m1[i10];
    }
}
