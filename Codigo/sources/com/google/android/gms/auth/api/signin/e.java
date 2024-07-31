package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
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
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 2:
                    arrayList = ea.b.u(parcel, E, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) ea.b.p(parcel, E, Account.CREATOR);
                    break;
                case 4:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 5:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 6:
                    z12 = ea.b.x(parcel, E);
                    break;
                case 7:
                    str = ea.b.q(parcel, E);
                    break;
                case 8:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 9:
                    arrayList2 = ea.b.u(parcel, E, z9.a.CREATOR);
                    break;
                case 10:
                    str3 = ea.b.q(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new GoogleSignInOptions(i10, arrayList, account, z10, z11, z12, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
