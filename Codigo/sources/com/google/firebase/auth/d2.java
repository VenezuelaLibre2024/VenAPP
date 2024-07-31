package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;

/* loaded from: classes.dex */
public class d2 extends m0 {
    public static final Parcelable.Creator<d2> CREATOR = new c2();

    /* renamed from: a */
    private final String f11647a;

    /* renamed from: b */
    private final String f11648b;

    /* renamed from: c */
    private final String f11649c;

    /* renamed from: d */
    private final zzagt f11650d;

    /* renamed from: e */
    private final String f11651e;

    /* renamed from: f */
    private final String f11652f;

    /* renamed from: r */
    private final String f11653r;

    public d2(String str, String str2, String str3, zzagt zzagtVar, String str4, String str5, String str6) {
        this.f11647a = zzag.zzb(str);
        this.f11648b = str2;
        this.f11649c = str3;
        this.f11650d = zzagtVar;
        this.f11651e = str4;
        this.f11652f = str5;
        this.f11653r = str6;
    }

    public static zzagt A1(d2 d2Var, String str) {
        com.google.android.gms.common.internal.s.j(d2Var);
        zzagt zzagtVar = d2Var.f11650d;
        return zzagtVar != null ? zzagtVar : new zzagt(d2Var.y1(), d2Var.x1(), d2Var.u1(), null, d2Var.z1(), null, str, d2Var.f11651e, d2Var.f11653r);
    }

    public static d2 B1(zzagt zzagtVar) {
        com.google.android.gms.common.internal.s.k(zzagtVar, "Must specify a non-null webSignInCredential");
        return new d2(null, null, null, zzagtVar, null, null, null);
    }

    public static d2 C1(String str, String str2, String str3, String str4) {
        com.google.android.gms.common.internal.s.g(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new d2(str, str2, str3, null, null, null, str4);
    }

    public static d2 D1(String str, String str2, String str3, String str4, String str5) {
        com.google.android.gms.common.internal.s.g(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new d2(str, str2, str3, null, str4, str5, null);
    }

    @Override // com.google.firebase.auth.h
    public String u1() {
        return this.f11647a;
    }

    @Override // com.google.firebase.auth.h
    public String v1() {
        return this.f11647a;
    }

    @Override // com.google.firebase.auth.h
    public final h w1() {
        return new d2(this.f11647a, this.f11648b, this.f11649c, this.f11650d, this.f11651e, this.f11652f, this.f11653r);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, u1(), false);
        ea.c.G(parcel, 2, y1(), false);
        ea.c.G(parcel, 3, x1(), false);
        ea.c.E(parcel, 4, this.f11650d, i10, false);
        ea.c.G(parcel, 5, this.f11651e, false);
        ea.c.G(parcel, 6, z1(), false);
        ea.c.G(parcel, 7, this.f11653r, false);
        ea.c.b(parcel, a10);
    }

    @Override // com.google.firebase.auth.m0
    public String x1() {
        return this.f11649c;
    }

    @Override // com.google.firebase.auth.m0
    public String y1() {
        return this.f11648b;
    }

    @Override // com.google.firebase.auth.m0
    public String z1() {
        return this.f11652f;
    }
}
