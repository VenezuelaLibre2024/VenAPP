package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.ads.internal.client.b2 */
/* loaded from: classes.dex */
public final class C4793b2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 2) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                str2 = C7139b.m21184q(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C4785a1(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4785a1[i10];
    }
}