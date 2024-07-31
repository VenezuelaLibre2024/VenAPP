package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ca.C1894b;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.common.api.z */
/* loaded from: classes.dex */
public final class C5216z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C1894b c1894b = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i11 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 3) {
                pendingIntent = (PendingIntent) C7139b.m21183p(parcel, m21155E, PendingIntent.CREATOR);
            } else if (m21190w == 4) {
                c1894b = (C1894b) C7139b.m21183p(parcel, m21155E, C1894b.CREATOR);
            } else if (m21190w != 1000) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                i10 = C7139b.m21157G(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new Status(i10, i11, str, pendingIntent, c1894b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
