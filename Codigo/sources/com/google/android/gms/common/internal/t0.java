package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i11 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                account = (Account) ea.b.p(parcel, E, Account.CREATOR);
            } else if (w10 == 3) {
                i11 = ea.b.G(parcel, E);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                googleSignInAccount = (GoogleSignInAccount) ea.b.p(parcel, E, GoogleSignInAccount.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new s0(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new s0[i10];
    }
}
