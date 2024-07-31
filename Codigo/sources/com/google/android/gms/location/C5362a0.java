package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.location.a0 */
/* loaded from: classes2.dex */
public final class C5362a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 1;
        int i11 = 1;
        long j10 = -1;
        long j11 = -1;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                i11 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 3) {
                j10 = C7139b.m21160J(parcel, m21155E);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                j11 = C7139b.m21160J(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5411z(i10, i11, j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5411z[i10];
    }
}
