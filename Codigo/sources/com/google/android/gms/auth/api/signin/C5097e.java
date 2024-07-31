package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p081ea.C7139b;
import p484z9.C12828a;

/* renamed from: com.google.android.gms.auth.api.signin.e */
/* loaded from: classes.dex */
public final class C5097e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 2:
                    arrayList = C7139b.m21188u(parcel, m21155E, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C7139b.m21183p(parcel, m21155E, Account.CREATOR);
                    break;
                case 4:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 5:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 6:
                    z12 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 7:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 8:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 9:
                    arrayList2 = C7139b.m21188u(parcel, m21155E, C12828a.CREATOR);
                    break;
                case 10:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new GoogleSignInOptions(i10, arrayList, account, z10, z11, z12, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
