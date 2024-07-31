package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.auth.api.signin.c */
/* loaded from: classes.dex */
public final class C5095c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
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
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    str4 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 6:
                    uri = (Uri) C7139b.m21183p(parcel, m21155E, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 8:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 9:
                    str6 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 10:
                    arrayList = C7139b.m21188u(parcel, m21155E, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 12:
                    str8 = C7139b.m21184q(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
