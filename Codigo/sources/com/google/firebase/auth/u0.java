package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;

/* loaded from: classes.dex */
public class u0 extends h {
    public static final Parcelable.Creator<u0> CREATOR = new v1();

    /* renamed from: a, reason: collision with root package name */
    private final String f11791a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(String str) {
        this.f11791a = com.google.android.gms.common.internal.s.f(str);
    }

    public static zzagt x1(u0 u0Var, String str) {
        com.google.android.gms.common.internal.s.j(u0Var);
        return new zzagt(null, null, u0Var.u1(), null, null, u0Var.f11791a, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String u1() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.h
    public String v1() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.h
    public final h w1() {
        return new u0(this.f11791a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f11791a, false);
        ea.c.b(parcel, a10);
    }
}
