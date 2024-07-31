package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.location.y */
/* loaded from: classes2.dex */
public final class C5409y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 2:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 3:
                    z12 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 4:
                    z13 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 5:
                    z14 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 6:
                    z15 = C7139b.m21191x(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5397s(z10, z11, z12, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5397s[i10];
    }
}
