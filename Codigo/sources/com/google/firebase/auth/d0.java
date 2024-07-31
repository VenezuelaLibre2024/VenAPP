package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public class d0 extends h {
    public static final Parcelable.Creator<d0> CREATOR = new n1();

    /* renamed from: a, reason: collision with root package name */
    private String f11637a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(String str) {
        this.f11637a = com.google.android.gms.common.internal.s.f(str);
    }

    public static zzagt x1(d0 d0Var, String str) {
        com.google.android.gms.common.internal.s.j(d0Var);
        return new zzagt(null, d0Var.f11637a, d0Var.u1(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String u1() {
        return Constants.SIGN_IN_METHOD_GITHUB;
    }

    @Override // com.google.firebase.auth.h
    public String v1() {
        return Constants.SIGN_IN_METHOD_GITHUB;
    }

    @Override // com.google.firebase.auth.h
    public final h w1() {
        return new d0(this.f11637a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f11637a, false);
        ea.c.b(parcel, a10);
    }
}
