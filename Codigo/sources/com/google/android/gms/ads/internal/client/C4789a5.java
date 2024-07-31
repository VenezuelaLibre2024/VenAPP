package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.ads.internal.client.a5 */
/* loaded from: classes.dex */
public final class C4789a5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        String str = null;
        C4947z4[] c4947z4Arr = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 4:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 5:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 6:
                    i12 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 7:
                    i13 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 8:
                    c4947z4Arr = (C4947z4[]) C7139b.m21187t(parcel, m21155E, C4947z4.CREATOR);
                    break;
                case 9:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 10:
                    z12 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 11:
                    z13 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 12:
                    z14 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 13:
                    z15 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 14:
                    z16 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 15:
                    z17 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 16:
                    z18 = C7139b.m21191x(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C4947z4(str, i10, i11, z10, i12, i13, c4947z4Arr, z11, z12, z13, z14, z15, z16, z17, z18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4947z4[i10];
    }
}
