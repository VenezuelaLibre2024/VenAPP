package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.AbstractC5300a;
import p081ea.C7139b;
import p178ja.C9004b;

/* renamed from: com.google.android.gms.common.server.response.d */
/* loaded from: classes.dex */
public final class C5303d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        String str = null;
        String str2 = null;
        C9004b c9004b = null;
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
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 4:
                    i12 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 5:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 6:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 7:
                    i13 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 8:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 9:
                    c9004b = (C9004b) C7139b.m21183p(parcel, m21155E, C9004b.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new AbstractC5300a.a(i10, i11, z10, i12, z11, str, i13, str2, c9004b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AbstractC5300a.a[i10];
    }
}
