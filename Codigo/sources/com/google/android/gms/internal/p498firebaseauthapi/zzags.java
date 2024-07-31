package com.google.android.gms.internal.p498firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* loaded from: classes2.dex */
public final class zzags implements Parcelable.Creator<zzagt> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagt createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    str4 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 6:
                    str5 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 7:
                    str6 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 8:
                    str7 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 9:
                    str8 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 10:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 11:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 12:
                    str9 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 13:
                    str10 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 14:
                    str11 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 15:
                    str12 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 16:
                    z12 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 17:
                    str13 = C7139b.m21184q(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new zzagt(str, str2, str3, str4, str5, str6, str7, str8, z10, z11, str9, str10, str11, str12, z12, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagt[] newArray(int i10) {
        return new zzagt[i10];
    }
}
