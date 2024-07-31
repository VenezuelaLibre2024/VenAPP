package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzafm implements Parcelable.Creator<zzafn> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafn createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            int w10 = b.w(E);
            if (w10 == 2) {
                str = b.q(parcel, E);
            } else if (w10 == 3) {
                str2 = b.q(parcel, E);
            } else if (w10 == 4) {
                l10 = b.K(parcel, E);
            } else if (w10 == 5) {
                str3 = b.q(parcel, E);
            } else if (w10 != 6) {
                b.N(parcel, E);
            } else {
                l11 = b.K(parcel, E);
            }
        }
        b.v(parcel, O);
        return new zzafn(str, str2, l10, str3, l11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafn[] newArray(int i10) {
        return new zzafn[i10];
    }
}
