package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes2.dex */
public final class lb extends ea.a {
    public static final Parcelable.Creator<lb> CREATOR = new mb();
    public final boolean A;
    public final String B;
    public final Boolean C;
    public final long D;
    public final List<String> E;
    private final String F;
    public final String G;
    public final String H;
    public final String I;
    public final boolean J;
    public final long K;
    public final int L;
    public final String M;
    public final int N;
    public final long O;

    /* renamed from: a, reason: collision with root package name */
    public final String f10366a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10367b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10368c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10369d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10370e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10371f;

    /* renamed from: r, reason: collision with root package name */
    public final String f10372r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f10373s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f10374t;

    /* renamed from: u, reason: collision with root package name */
    public final long f10375u;

    /* renamed from: v, reason: collision with root package name */
    public final String f10376v;

    /* renamed from: w, reason: collision with root package name */
    @Deprecated
    private final long f10377w;

    /* renamed from: x, reason: collision with root package name */
    public final long f10378x;

    /* renamed from: y, reason: collision with root package name */
    public final int f10379y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f10380z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lb(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9, String str10, String str11, boolean z14, long j16, int i11, String str12, int i12, long j17) {
        com.google.android.gms.common.internal.s.f(str);
        this.f10366a = str;
        this.f10367b = TextUtils.isEmpty(str2) ? null : str2;
        this.f10368c = str3;
        this.f10375u = j10;
        this.f10369d = str4;
        this.f10370e = j11;
        this.f10371f = j12;
        this.f10372r = str5;
        this.f10373s = z10;
        this.f10374t = z11;
        this.f10376v = str6;
        this.f10377w = j13;
        this.f10378x = j14;
        this.f10379y = i10;
        this.f10380z = z12;
        this.A = z13;
        this.B = str7;
        this.C = bool;
        this.D = j15;
        this.E = list;
        this.F = null;
        this.G = str9;
        this.H = str10;
        this.I = str11;
        this.J = z14;
        this.K = j16;
        this.L = i11;
        this.M = str12;
        this.N = i12;
        this.O = j17;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public lb(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9, String str10, String str11, boolean z14, long j16, int i11, String str12, int i12, long j17) {
        this.f10366a = str;
        this.f10367b = str2;
        this.f10368c = str3;
        this.f10375u = j12;
        this.f10369d = str4;
        this.f10370e = j10;
        this.f10371f = j11;
        this.f10372r = str5;
        this.f10373s = z10;
        this.f10374t = z11;
        this.f10376v = str6;
        this.f10377w = j13;
        this.f10378x = j14;
        this.f10379y = i10;
        this.f10380z = z12;
        this.A = z13;
        this.B = str7;
        this.C = bool;
        this.D = j15;
        this.E = list;
        this.F = str8;
        this.G = str9;
        this.H = str10;
        this.I = str11;
        this.J = z14;
        this.K = j16;
        this.L = i11;
        this.M = str12;
        this.N = i12;
        this.O = j17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, this.f10366a, false);
        ea.c.G(parcel, 3, this.f10367b, false);
        ea.c.G(parcel, 4, this.f10368c, false);
        ea.c.G(parcel, 5, this.f10369d, false);
        ea.c.z(parcel, 6, this.f10370e);
        ea.c.z(parcel, 7, this.f10371f);
        ea.c.G(parcel, 8, this.f10372r, false);
        ea.c.g(parcel, 9, this.f10373s);
        ea.c.g(parcel, 10, this.f10374t);
        ea.c.z(parcel, 11, this.f10375u);
        ea.c.G(parcel, 12, this.f10376v, false);
        ea.c.z(parcel, 13, this.f10377w);
        ea.c.z(parcel, 14, this.f10378x);
        ea.c.u(parcel, 15, this.f10379y);
        ea.c.g(parcel, 16, this.f10380z);
        ea.c.g(parcel, 18, this.A);
        ea.c.G(parcel, 19, this.B, false);
        ea.c.i(parcel, 21, this.C, false);
        ea.c.z(parcel, 22, this.D);
        ea.c.I(parcel, 23, this.E, false);
        ea.c.G(parcel, 24, this.F, false);
        ea.c.G(parcel, 25, this.G, false);
        ea.c.G(parcel, 26, this.H, false);
        ea.c.G(parcel, 27, this.I, false);
        ea.c.g(parcel, 28, this.J);
        ea.c.z(parcel, 29, this.K);
        ea.c.u(parcel, 30, this.L);
        ea.c.G(parcel, 31, this.M, false);
        ea.c.u(parcel, 32, this.N);
        ea.c.z(parcel, 34, this.O);
        ea.c.b(parcel, a10);
    }
}
