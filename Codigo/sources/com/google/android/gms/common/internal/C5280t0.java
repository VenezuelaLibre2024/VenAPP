package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.common.internal.t0 */
/* loaded from: classes.dex */
public final class C5280t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i11 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                account = (Account) C7139b.m21183p(parcel, m21155E, Account.CREATOR);
            } else if (m21190w == 3) {
                i11 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C7139b.m21183p(parcel, m21155E, GoogleSignInAccount.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5277s0(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5277s0[i10];
    }
}
