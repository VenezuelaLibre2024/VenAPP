package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new e2();

    /* renamed from: a, reason: collision with root package name */
    private String f11708a;

    /* renamed from: b, reason: collision with root package name */
    private String f11709b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11710c;

    /* renamed from: d, reason: collision with root package name */
    private String f11711d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11712e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, String str2) {
        this(str, str2, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, String str2, String str3, String str4, boolean z10) {
        this.f11708a = com.google.android.gms.common.internal.s.f(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f11709b = str2;
        this.f11710c = str3;
        this.f11711d = str4;
        this.f11712e = z10;
    }

    public static boolean y1(String str) {
        f c10;
        return (TextUtils.isEmpty(str) || (c10 = f.c(str)) == null || c10.b() != 4) ? false : true;
    }

    @Override // com.google.firebase.auth.h
    public String u1() {
        return "password";
    }

    @Override // com.google.firebase.auth.h
    public String v1() {
        return !TextUtils.isEmpty(this.f11709b) ? "password" : "emailLink";
    }

    @Override // com.google.firebase.auth.h
    public final h w1() {
        return new j(this.f11708a, this.f11709b, this.f11710c, this.f11711d, this.f11712e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f11708a, false);
        ea.c.G(parcel, 2, this.f11709b, false);
        ea.c.G(parcel, 3, this.f11710c, false);
        ea.c.G(parcel, 4, this.f11711d, false);
        ea.c.g(parcel, 5, this.f11712e);
        ea.c.b(parcel, a10);
    }

    public final j x1(a0 a0Var) {
        this.f11711d = a0Var.zze();
        this.f11712e = true;
        return this;
    }

    public final String zzb() {
        return this.f11711d;
    }

    public final String zzc() {
        return this.f11708a;
    }

    public final String zzd() {
        return this.f11709b;
    }

    public final String zze() {
        return this.f11710c;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.f11710c);
    }

    public final boolean zzg() {
        return this.f11712e;
    }
}
