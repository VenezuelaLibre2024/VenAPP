package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j extends ea.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8868a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8869b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8870c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8871d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8872e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8873f;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8874r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f8875s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8876t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(boolean z10, boolean z11, String str, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this.f8868a = z10;
        this.f8869b = z11;
        this.f8870c = str;
        this.f8871d = z12;
        this.f8872e = f10;
        this.f8873f = i10;
        this.f8874r = z13;
        this.f8875s = z14;
        this.f8876t = z15;
    }

    public j(boolean z10, boolean z11, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this(z10, z11, null, z12, f10, -1, z13, z14, z15);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f8868a;
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 2, z10);
        ea.c.g(parcel, 3, this.f8869b);
        ea.c.G(parcel, 4, this.f8870c, false);
        ea.c.g(parcel, 5, this.f8871d);
        ea.c.q(parcel, 6, this.f8872e);
        ea.c.u(parcel, 7, this.f8873f);
        ea.c.g(parcel, 8, this.f8874r);
        ea.c.g(parcel, 9, this.f8875s);
        ea.c.g(parcel, 10, this.f8876t);
        ea.c.b(parcel, a10);
    }
}
