package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public class f0 extends h {
    public static final Parcelable.Creator<f0> CREATOR = new o1();

    /* renamed from: a, reason: collision with root package name */
    private final String f11678a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11679b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f11678a = str;
        this.f11679b = str2;
    }

    public static zzagt x1(f0 f0Var, String str) {
        com.google.android.gms.common.internal.s.j(f0Var);
        return new zzagt(f0Var.f11678a, f0Var.f11679b, f0Var.u1(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String u1() {
        return Constants.SIGN_IN_METHOD_GOOGLE;
    }

    @Override // com.google.firebase.auth.h
    public String v1() {
        return Constants.SIGN_IN_METHOD_GOOGLE;
    }

    @Override // com.google.firebase.auth.h
    public final h w1() {
        return new f0(this.f11678a, this.f11679b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f11678a, false);
        ea.c.G(parcel, 2, this.f11679b, false);
        ea.c.b(parcel, a10);
    }
}
