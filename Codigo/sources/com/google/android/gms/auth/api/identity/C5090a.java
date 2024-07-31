package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.auth.api.identity.a */
/* loaded from: classes.dex */
public final class C5090a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = null;
        String str = null;
        Account account = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    arrayList = C7139b.m21188u(parcel, m21155E, Scope.CREATOR);
                    break;
                case 2:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 4:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 5:
                    account = (Account) C7139b.m21183p(parcel, m21155E, Account.CREATOR);
                    break;
                case 6:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 7:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 8:
                    z12 = C7139b.m21191x(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new AuthorizationRequest(arrayList, str, z10, z11, account, str2, str3, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthorizationRequest[i10];
    }
}
