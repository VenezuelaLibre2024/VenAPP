package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p498firebaseauthapi.zzagr;
import p081ea.C7139b;

/* renamed from: com.google.firebase.auth.w1 */
/* loaded from: classes.dex */
public final class C6137w1 implements Parcelable.Creator<C6143y0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6143y0 createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        zzagr zzagrVar = null;
        long j10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 2) {
                str2 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 3) {
                j10 = C7139b.m21160J(parcel, m21155E);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                zzagrVar = (zzagr) C7139b.m21183p(parcel, m21155E, zzagr.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C6143y0(str, str2, j10, zzagrVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6143y0[] newArray(int i10) {
        return new C6143y0[i10];
    }
}
