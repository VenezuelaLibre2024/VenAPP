package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class p extends ea.a {
    public static final Parcelable.Creator<p> CREATOR = new m0();

    /* renamed from: a, reason: collision with root package name */
    private final int f9613a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9614b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9615c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9616d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9617e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9618f;

    /* renamed from: r, reason: collision with root package name */
    private final String f9619r;

    /* renamed from: s, reason: collision with root package name */
    private final int f9620s;

    /* renamed from: t, reason: collision with root package name */
    private final int f9621t;

    @Deprecated
    public p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13) {
        this(i10, i11, i12, j10, j11, str, str2, i13, -1);
    }

    public p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f9613a = i10;
        this.f9614b = i11;
        this.f9615c = i12;
        this.f9616d = j10;
        this.f9617e = j11;
        this.f9618f = str;
        this.f9619r = str2;
        this.f9620s = i13;
        this.f9621t = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9613a);
        ea.c.u(parcel, 2, this.f9614b);
        ea.c.u(parcel, 3, this.f9615c);
        ea.c.z(parcel, 4, this.f9616d);
        ea.c.z(parcel, 5, this.f9617e);
        ea.c.G(parcel, 6, this.f9618f, false);
        ea.c.G(parcel, 7, this.f9619r, false);
        ea.c.u(parcel, 8, this.f9620s);
        ea.c.u(parcel, 9, this.f9621t);
        ea.c.b(parcel, a10);
    }
}
