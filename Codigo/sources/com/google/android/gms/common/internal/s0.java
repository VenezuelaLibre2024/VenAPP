package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class s0 extends ea.a {
    public static final Parcelable.Creator<s0> CREATOR = new t0();

    /* renamed from: a */
    final int f9632a;

    /* renamed from: b */
    private final Account f9633b;

    /* renamed from: c */
    private final int f9634c;

    /* renamed from: d */
    private final GoogleSignInAccount f9635d;

    public s0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f9632a = i10;
        this.f9633b = account;
        this.f9634c = i11;
        this.f9635d = googleSignInAccount;
    }

    public s0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9632a);
        ea.c.E(parcel, 2, this.f9633b, i10, false);
        ea.c.u(parcel, 3, this.f9634c);
        ea.c.E(parcel, 4, this.f9635d, i10, false);
        ea.c.b(parcel, a10);
    }
}
