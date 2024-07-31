package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.location.z0 */
/* loaded from: classes2.dex */
public final class C5412z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        ArrayList arrayList = null;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                arrayList = C7139b.m21188u(parcel, m21155E, LocationRequest.CREATOR);
            } else if (m21190w == 2) {
                z10 = C7139b.m21191x(parcel, m21155E);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                z11 = C7139b.m21191x(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5391p(arrayList, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5391p[i10];
    }
}
