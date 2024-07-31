package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.ads.internal.k */
/* loaded from: classes.dex */
public final class C4955k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        float f10 = 0.0f;
        String str = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 3:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 4:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    z12 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 6:
                    f10 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 7:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 8:
                    z13 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 9:
                    z14 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 10:
                    z15 = C7139b.m21191x(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C4954j(z10, z11, str, z12, f10, i10, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4954j[i10];
    }
}
