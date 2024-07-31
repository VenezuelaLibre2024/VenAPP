package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.ads.internal.client.w4 */
/* loaded from: classes.dex */
public final class C4929w4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        C4857k4 c4857k4 = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        C4785a1 c4785a1 = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 2:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 3:
                    bundle = C7139b.m21173f(parcel, m21155E);
                    break;
                case 4:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 5:
                    arrayList = C7139b.m21186s(parcel, m21155E);
                    break;
                case 6:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 7:
                    i12 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 8:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 9:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 10:
                    c4857k4 = (C4857k4) C7139b.m21183p(parcel, m21155E, C4857k4.CREATOR);
                    break;
                case 11:
                    location = (Location) C7139b.m21183p(parcel, m21155E, Location.CREATOR);
                    break;
                case 12:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 13:
                    bundle2 = C7139b.m21173f(parcel, m21155E);
                    break;
                case 14:
                    bundle3 = C7139b.m21173f(parcel, m21155E);
                    break;
                case 15:
                    arrayList2 = C7139b.m21186s(parcel, m21155E);
                    break;
                case 16:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 17:
                    str4 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 18:
                    z12 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 19:
                    c4785a1 = (C4785a1) C7139b.m21183p(parcel, m21155E, C4785a1.CREATOR);
                    break;
                case 20:
                    i13 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 21:
                    str5 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 22:
                    arrayList3 = C7139b.m21186s(parcel, m21155E);
                    break;
                case 23:
                    i14 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 24:
                    str6 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 25:
                    i15 = C7139b.m21157G(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C4917u4(i10, j10, bundle, i11, arrayList, z10, i12, z11, str, c4857k4, location, str2, bundle2, bundle3, arrayList2, str3, str4, z12, c4785a1, i13, str5, arrayList3, i14, str6, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4917u4[i10];
    }
}
