package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.location.w0 */
/* loaded from: classes2.dex */
public final class C5406w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 1000;
        int i11 = 1;
        int i12 = 1;
        long j10 = 0;
        C5411z[] c5411zArr = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 2:
                    i12 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 3:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 4:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 5:
                    c5411zArr = (C5411z[]) C7139b.m21187t(parcel, m21155E, C5411z.CREATOR);
                    break;
                case 6:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new LocationAvailability(i10, i11, i12, j10, c5411zArr, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
