package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p498firebaseauthapi.zzagt;
import p081ea.C7139b;

/* renamed from: com.google.firebase.auth.c2 */
/* loaded from: classes.dex */
public final class C6055c2 implements Parcelable.Creator<C6059d2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6059d2 createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzagt zzagtVar = null;
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
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    zzagtVar = (zzagt) C7139b.m21183p(parcel, m21155E, zzagt.CREATOR);
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
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C6059d2(str, str2, str3, zzagtVar, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6059d2[] newArray(int i10) {
        return new C6059d2[i10];
    }
}
