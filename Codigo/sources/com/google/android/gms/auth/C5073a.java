package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.auth.a */
/* loaded from: classes.dex */
public final class C5073a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        Long l10 = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 2:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    l10 = C7139b.m21161K(parcel, m21155E);
                    break;
                case 4:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 5:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 6:
                    arrayList = C7139b.m21186s(parcel, m21155E);
                    break;
                case 7:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new TokenData(i10, str, l10, z10, z11, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new TokenData[i10];
    }
}
