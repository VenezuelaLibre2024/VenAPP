package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public class SignInAccount extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    final String f9273a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f9274b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    final String f9275c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f9274b = googleSignInAccount;
        this.f9273a = s.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f9275c = s.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount u1() {
        return this.f9274b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 4, this.f9273a, false);
        ea.c.E(parcel, 7, this.f9274b, i10, false);
        ea.c.G(parcel, 8, this.f9275c, false);
        ea.c.b(parcel, a10);
    }
}
