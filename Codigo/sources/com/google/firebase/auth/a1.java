package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public class a1 extends h {
    public static final Parcelable.Creator<a1> CREATOR = new x1();

    /* renamed from: a, reason: collision with root package name */
    private String f11632a;

    /* renamed from: b, reason: collision with root package name */
    private String f11633b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(String str, String str2) {
        this.f11632a = com.google.android.gms.common.internal.s.f(str);
        this.f11633b = com.google.android.gms.common.internal.s.f(str2);
    }

    public static zzagt x1(a1 a1Var, String str) {
        com.google.android.gms.common.internal.s.j(a1Var);
        return new zzagt(null, a1Var.f11632a, a1Var.u1(), null, a1Var.f11633b, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String u1() {
        return Constants.SIGN_IN_METHOD_TWITTER;
    }

    @Override // com.google.firebase.auth.h
    public String v1() {
        return Constants.SIGN_IN_METHOD_TWITTER;
    }

    @Override // com.google.firebase.auth.h
    public final h w1() {
        return new a1(this.f11632a, this.f11633b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f11632a, false);
        ea.c.G(parcel, 2, this.f11633b, false);
        ea.c.b(parcel, a10);
    }
}
