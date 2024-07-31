package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.location.h0 */
/* loaded from: classes2.dex */
public final class C5376h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        WorkSource workSource = null;
        String str = null;
        int[] iArr = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 2:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 3:
                    workSource = (WorkSource) C7139b.m21183p(parcel, m21155E, WorkSource.CREATOR);
                    break;
                case 4:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    iArr = C7139b.m21178k(parcel, m21155E);
                    break;
                case 6:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 7:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 8:
                    j11 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 9:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5374g0(j10, z10, workSource, str, iArr, z11, str2, j11, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5374g0[i10];
    }
}
