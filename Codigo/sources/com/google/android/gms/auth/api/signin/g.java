package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 4) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 7) {
                googleSignInAccount = (GoogleSignInAccount) ea.b.p(parcel, E, GoogleSignInAccount.CREATOR);
            } else if (w10 != 8) {
                ea.b.N(parcel, E);
            } else {
                str2 = ea.b.q(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
