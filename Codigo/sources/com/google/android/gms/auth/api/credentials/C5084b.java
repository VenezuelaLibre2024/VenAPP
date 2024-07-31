package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.auth.api.credentials.b */
/* loaded from: classes.dex */
public final class C5084b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    uri = (Uri) C7139b.m21183p(parcel, m21155E, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = C7139b.m21188u(parcel, m21155E, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 6:
                    str4 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 7:
                case 8:
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
                case 9:
                    str5 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 10:
                    str6 = C7139b.m21184q(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Credential[i10];
    }
}
