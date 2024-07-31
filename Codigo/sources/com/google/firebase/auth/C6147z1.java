package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.firebase.auth.z1 */
/* loaded from: classes.dex */
public final class C6147z1 implements Parcelable.Creator<C6060e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6060e createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 2:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    str4 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 6:
                    str5 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 7:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 8:
                    str6 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 9:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 10:
                    str7 = C7139b.m21184q(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C6060e(str, str2, str3, str4, z10, str5, z11, str6, i10, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6060e[] newArray(int i10) {
        return new C6060e[i10];
    }
}
