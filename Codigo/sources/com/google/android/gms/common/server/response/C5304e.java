package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.AbstractC5300a;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.common.server.response.e */
/* loaded from: classes.dex */
public final class C5304e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        String str = null;
        AbstractC5300a.a aVar = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                aVar = (AbstractC5300a.a) C7139b.m21183p(parcel, m21155E, AbstractC5300a.a.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5306g(i10, str, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5306g[i10];
    }
}
