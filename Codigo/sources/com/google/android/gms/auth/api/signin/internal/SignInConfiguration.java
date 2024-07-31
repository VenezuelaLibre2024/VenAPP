package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import ea.c;
import z9.b;
import z9.y;

/* loaded from: classes.dex */
public final class SignInConfiguration extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    private final String f9278a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f9279b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f9278a = s.f(str);
        this.f9279b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f9278a.equals(signInConfiguration.f9278a)) {
            GoogleSignInOptions googleSignInOptions = this.f9279b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f9279b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f9278a).a(this.f9279b).b();
    }

    public final GoogleSignInOptions u1() {
        return this.f9279b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.G(parcel, 2, this.f9278a, false);
        c.E(parcel, 5, this.f9279b, i10, false);
        c.b(parcel, a10);
    }
}
