package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.measurement.internal.b0 */
/* loaded from: classes2.dex */
public final class C5435b0 implements Parcelable.Creator<C5742z> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5742z createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            if (C7139b.m21190w(m21155E) != 2) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                bundle = C7139b.m21173f(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5742z(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5742z[] newArray(int i10) {
        return new C5742z[i10];
    }
}
