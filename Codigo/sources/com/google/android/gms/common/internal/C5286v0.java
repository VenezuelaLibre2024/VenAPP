package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ca.C1894b;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.common.internal.v0 */
/* loaded from: classes.dex */
public final class C5286v0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        IBinder iBinder = null;
        C1894b c1894b = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                iBinder = C7139b.m21156F(parcel, m21155E);
            } else if (m21190w == 3) {
                c1894b = (C1894b) C7139b.m21183p(parcel, m21155E, C1894b.CREATOR);
            } else if (m21190w == 4) {
                z10 = C7139b.m21191x(parcel, m21155E);
            } else if (m21190w != 5) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                z11 = C7139b.m21191x(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5283u0(i10, iBinder, c1894b, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5283u0[i10];
    }
}
