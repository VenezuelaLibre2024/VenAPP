package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.common.internal.m0 */
/* loaded from: classes.dex */
public final class C5259m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        int i14 = -1;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 2:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 3:
                    i12 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 4:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 5:
                    j11 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 6:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 7:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 8:
                    i13 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 9:
                    i14 = C7139b.m21157G(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5267p(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5267p[i10];
    }
}
