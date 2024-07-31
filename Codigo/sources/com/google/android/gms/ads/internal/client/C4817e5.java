package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.ads.internal.client.e5 */
/* loaded from: classes.dex */
public final class C4817e5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        C4801c3 c4801c3 = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 2:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 3:
                    c4801c3 = (C4801c3) C7139b.m21183p(parcel, m21155E, C4801c3.CREATOR);
                    break;
                case 4:
                    bundle = C7139b.m21173f(parcel, m21155E);
                    break;
                case 5:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 6:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 7:
                    str4 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 8:
                    str5 = C7139b.m21184q(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C4810d5(str, j10, c4801c3, bundle, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4810d5[i10];
    }
}
