package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = null;
        String str = null;
        Account account = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    arrayList = ea.b.u(parcel, E, Scope.CREATOR);
                    break;
                case 2:
                    str = ea.b.q(parcel, E);
                    break;
                case 3:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 4:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 5:
                    account = (Account) ea.b.p(parcel, E, Account.CREATOR);
                    break;
                case 6:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 7:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 8:
                    z12 = ea.b.x(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new AuthorizationRequest(arrayList, str, z10, z11, account, str2, str3, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthorizationRequest[i10];
    }
}
