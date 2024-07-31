package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d5 extends ea.a {
    public static final Parcelable.Creator<d5> CREATOR = new e5();

    /* renamed from: a, reason: collision with root package name */
    public final String f8649a;

    /* renamed from: b, reason: collision with root package name */
    public long f8650b;

    /* renamed from: c, reason: collision with root package name */
    public c3 f8651c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f8652d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8653e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8654f;

    /* renamed from: r, reason: collision with root package name */
    public final String f8655r;

    /* renamed from: s, reason: collision with root package name */
    public final String f8656s;

    public d5(String str, long j10, c3 c3Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f8649a = str;
        this.f8650b = j10;
        this.f8651c = c3Var;
        this.f8652d = bundle;
        this.f8653e = str2;
        this.f8654f = str3;
        this.f8655r = str4;
        this.f8656s = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f8649a;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, str, false);
        ea.c.z(parcel, 2, this.f8650b);
        ea.c.E(parcel, 3, this.f8651c, i10, false);
        ea.c.j(parcel, 4, this.f8652d, false);
        ea.c.G(parcel, 5, this.f8653e, false);
        ea.c.G(parcel, 6, this.f8654f, false);
        ea.c.G(parcel, 7, this.f8655r, false);
        ea.c.G(parcel, 8, this.f8656s, false);
        ea.c.b(parcel, a10);
    }
}
