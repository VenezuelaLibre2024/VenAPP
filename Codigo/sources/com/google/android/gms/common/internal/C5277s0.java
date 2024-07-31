package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.internal.s0 */
/* loaded from: classes.dex */
public final class C5277s0 extends AbstractC7138a {
    public static final Parcelable.Creator<C5277s0> CREATOR = new C5280t0();

    /* renamed from: a */
    final int f10747a;

    /* renamed from: b */
    private final Account f10748b;

    /* renamed from: c */
    private final int f10749c;

    /* renamed from: d */
    private final GoogleSignInAccount f10750d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5277s0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f10747a = i10;
        this.f10748b = account;
        this.f10749c = i11;
        this.f10750d = googleSignInAccount;
    }

    public C5277s0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f10747a);
        C7140c.m21198E(parcel, 2, this.f10748b, i10, false);
        C7140c.m21229u(parcel, 3, this.f10749c);
        C7140c.m21198E(parcel, 4, this.f10750d, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
