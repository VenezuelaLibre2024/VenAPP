package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.auth.api.identity.b */
/* loaded from: classes.dex */
public final class C5091b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        String str3 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    pendingIntent = (PendingIntent) C7139b.m21183p(parcel, m21155E, PendingIntent.CREATOR);
                    break;
                case 2:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    arrayList = C7139b.m21186s(parcel, m21155E);
                    break;
                case 5:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 6:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new SaveAccountLinkingTokenRequest(pendingIntent, str, str2, arrayList, str3, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SaveAccountLinkingTokenRequest[i10];
    }
}
