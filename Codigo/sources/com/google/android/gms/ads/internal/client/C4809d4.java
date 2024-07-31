package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.ads.internal.client.d4 */
/* loaded from: classes.dex */
public final class C4809d4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        C4801c3 c4801c3 = null;
        IBinder iBinder = null;
        int i10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 3) {
                str2 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 4) {
                c4801c3 = (C4801c3) C7139b.m21183p(parcel, m21155E, C4801c3.CREATOR);
            } else if (m21190w != 5) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                iBinder = C7139b.m21156F(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C4801c3(i10, str, str2, c4801c3, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4801c3[i10];
    }
}
