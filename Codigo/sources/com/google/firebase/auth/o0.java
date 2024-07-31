package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public class o0 extends h implements Cloneable {
    public static final Parcelable.Creator<o0> CREATOR = new s1();

    /* renamed from: a, reason: collision with root package name */
    private String f11747a;

    /* renamed from: b, reason: collision with root package name */
    private String f11748b;

    /* renamed from: c, reason: collision with root package name */
    private String f11749c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11750d;

    /* renamed from: e, reason: collision with root package name */
    private String f11751e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(String str, String str2, String str3, boolean z10, String str4) {
        com.google.android.gms.common.internal.s.b(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f11747a = str;
        this.f11748b = str2;
        this.f11749c = str3;
        this.f11750d = z10;
        this.f11751e = str4;
    }

    public static o0 A1(String str, String str2) {
        return new o0(null, null, str, true, str2);
    }

    public static o0 y1(String str, String str2) {
        return new o0(str, str2, null, true, null);
    }

    public /* synthetic */ Object clone() {
        return new o0(this.f11747a, x1(), this.f11749c, this.f11750d, this.f11751e);
    }

    @Override // com.google.firebase.auth.h
    public String u1() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // com.google.firebase.auth.h
    public String v1() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // com.google.firebase.auth.h
    public final h w1() {
        return (o0) clone();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f11747a, false);
        ea.c.G(parcel, 2, x1(), false);
        ea.c.G(parcel, 4, this.f11749c, false);
        ea.c.g(parcel, 5, this.f11750d);
        ea.c.G(parcel, 6, this.f11751e, false);
        ea.c.b(parcel, a10);
    }

    public String x1() {
        return this.f11748b;
    }

    public final o0 z1(boolean z10) {
        this.f11750d = false;
        return this;
    }

    public final String zzb() {
        return this.f11749c;
    }

    public final String zzc() {
        return this.f11747a;
    }

    public final String zzd() {
        return this.f11751e;
    }

    public final boolean zze() {
        return this.f11750d;
    }
}
