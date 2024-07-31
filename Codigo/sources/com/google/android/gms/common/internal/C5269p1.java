package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ca.C1898d;
import com.google.android.gms.common.api.Scope;
import p081ea.C7139b;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.internal.p1 */
/* loaded from: classes.dex */
public final class C5269p1 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13302a(C5240g c5240g, Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, c5240g.f10676a);
        C7140c.m21229u(parcel, 2, c5240g.f10677b);
        C7140c.m21229u(parcel, 3, c5240g.f10678c);
        C7140c.m21200G(parcel, 4, c5240g.f10679d, false);
        C7140c.m21228t(parcel, 5, c5240g.f10680e, false);
        C7140c.m21203J(parcel, 6, c5240g.f10681f, i10, false);
        C7140c.m21218j(parcel, 7, c5240g.f10682r, false);
        C7140c.m21198E(parcel, 8, c5240g.f10683s, i10, false);
        C7140c.m21203J(parcel, 10, c5240g.f10684t, i10, false);
        C7140c.m21203J(parcel, 11, c5240g.f10685u, i10, false);
        C7140c.m21215g(parcel, 12, c5240g.f10686v);
        C7140c.m21229u(parcel, 13, c5240g.f10687w);
        C7140c.m21215g(parcel, 14, c5240g.f10688x);
        C7140c.m21200G(parcel, 15, c5240g.zza(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        Scope[] scopeArr = C5240g.f10675z;
        Bundle bundle = new Bundle();
        C1898d[] c1898dArr = C5240g.f10674A;
        C1898d[] c1898dArr2 = c1898dArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 2:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 3:
                    i12 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 4:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    iBinder = C7139b.m21156F(parcel, m21155E);
                    break;
                case 6:
                    scopeArr = (Scope[]) C7139b.m21187t(parcel, m21155E, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C7139b.m21173f(parcel, m21155E);
                    break;
                case 8:
                    account = (Account) C7139b.m21183p(parcel, m21155E, Account.CREATOR);
                    break;
                case 9:
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
                case 10:
                    c1898dArr = (C1898d[]) C7139b.m21187t(parcel, m21155E, C1898d.CREATOR);
                    break;
                case 11:
                    c1898dArr2 = (C1898d[]) C7139b.m21187t(parcel, m21155E, C1898d.CREATOR);
                    break;
                case 12:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 13:
                    i13 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 14:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 15:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5240g(i10, i11, i12, str, iBinder, scopeArr, bundle, account, c1898dArr, c1898dArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5240g[i10];
    }
}
