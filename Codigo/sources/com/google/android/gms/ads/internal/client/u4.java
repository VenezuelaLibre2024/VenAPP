package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzced;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u4 extends ea.a {
    public static final Parcelable.Creator<u4> CREATOR = new w4();
    public final String A;
    public final String B;

    @Deprecated
    public final boolean C;
    public final a1 D;
    public final int E;
    public final String F;
    public final List G;
    public final int H;
    public final String I;
    public final int J;

    /* renamed from: a */
    public final int f8749a;

    /* renamed from: b */
    @Deprecated
    public final long f8750b;

    /* renamed from: c */
    public final Bundle f8751c;

    /* renamed from: d */
    @Deprecated
    public final int f8752d;

    /* renamed from: e */
    public final List f8753e;

    /* renamed from: f */
    public final boolean f8754f;

    /* renamed from: r */
    public final int f8755r;

    /* renamed from: s */
    public final boolean f8756s;

    /* renamed from: t */
    public final String f8757t;

    /* renamed from: u */
    public final k4 f8758u;

    /* renamed from: v */
    public final Location f8759v;

    /* renamed from: w */
    public final String f8760w;

    /* renamed from: x */
    public final Bundle f8761x;

    /* renamed from: y */
    public final Bundle f8762y;

    /* renamed from: z */
    public final List f8763z;

    public u4(int i10, long j10, Bundle bundle, int i11, List list, boolean z10, int i12, boolean z11, String str, k4 k4Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z12, a1 a1Var, int i13, String str5, List list3, int i14, String str6, int i15) {
        this.f8749a = i10;
        this.f8750b = j10;
        this.f8751c = bundle == null ? new Bundle() : bundle;
        this.f8752d = i11;
        this.f8753e = list;
        this.f8754f = z10;
        this.f8755r = i12;
        this.f8756s = z11;
        this.f8757t = str;
        this.f8758u = k4Var;
        this.f8759v = location;
        this.f8760w = str2;
        this.f8761x = bundle2 == null ? new Bundle() : bundle2;
        this.f8762y = bundle3;
        this.f8763z = list2;
        this.A = str3;
        this.B = str4;
        this.C = z12;
        this.D = a1Var;
        this.E = i13;
        this.F = str5;
        this.G = list3 == null ? new ArrayList() : list3;
        this.H = i14;
        this.I = str6;
        this.J = i15;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return this.f8749a == u4Var.f8749a && this.f8750b == u4Var.f8750b && zzced.zza(this.f8751c, u4Var.f8751c) && this.f8752d == u4Var.f8752d && com.google.android.gms.common.internal.q.b(this.f8753e, u4Var.f8753e) && this.f8754f == u4Var.f8754f && this.f8755r == u4Var.f8755r && this.f8756s == u4Var.f8756s && com.google.android.gms.common.internal.q.b(this.f8757t, u4Var.f8757t) && com.google.android.gms.common.internal.q.b(this.f8758u, u4Var.f8758u) && com.google.android.gms.common.internal.q.b(this.f8759v, u4Var.f8759v) && com.google.android.gms.common.internal.q.b(this.f8760w, u4Var.f8760w) && zzced.zza(this.f8761x, u4Var.f8761x) && zzced.zza(this.f8762y, u4Var.f8762y) && com.google.android.gms.common.internal.q.b(this.f8763z, u4Var.f8763z) && com.google.android.gms.common.internal.q.b(this.A, u4Var.A) && com.google.android.gms.common.internal.q.b(this.B, u4Var.B) && this.C == u4Var.C && this.E == u4Var.E && com.google.android.gms.common.internal.q.b(this.F, u4Var.F) && com.google.android.gms.common.internal.q.b(this.G, u4Var.G) && this.H == u4Var.H && com.google.android.gms.common.internal.q.b(this.I, u4Var.I) && this.J == u4Var.J;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.f8749a), Long.valueOf(this.f8750b), this.f8751c, Integer.valueOf(this.f8752d), this.f8753e, Boolean.valueOf(this.f8754f), Integer.valueOf(this.f8755r), Boolean.valueOf(this.f8756s), this.f8757t, this.f8758u, this.f8759v, this.f8760w, this.f8761x, this.f8762y, this.f8763z, this.A, this.B, Boolean.valueOf(this.C), Integer.valueOf(this.E), this.F, this.G, Integer.valueOf(this.H), this.I, Integer.valueOf(this.J));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8749a;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        ea.c.z(parcel, 2, this.f8750b);
        ea.c.j(parcel, 3, this.f8751c, false);
        ea.c.u(parcel, 4, this.f8752d);
        ea.c.I(parcel, 5, this.f8753e, false);
        ea.c.g(parcel, 6, this.f8754f);
        ea.c.u(parcel, 7, this.f8755r);
        ea.c.g(parcel, 8, this.f8756s);
        ea.c.G(parcel, 9, this.f8757t, false);
        ea.c.E(parcel, 10, this.f8758u, i10, false);
        ea.c.E(parcel, 11, this.f8759v, i10, false);
        ea.c.G(parcel, 12, this.f8760w, false);
        ea.c.j(parcel, 13, this.f8761x, false);
        ea.c.j(parcel, 14, this.f8762y, false);
        ea.c.I(parcel, 15, this.f8763z, false);
        ea.c.G(parcel, 16, this.A, false);
        ea.c.G(parcel, 17, this.B, false);
        ea.c.g(parcel, 18, this.C);
        ea.c.E(parcel, 19, this.D, i10, false);
        ea.c.u(parcel, 20, this.E);
        ea.c.G(parcel, 21, this.F, false);
        ea.c.I(parcel, 22, this.G, false);
        ea.c.u(parcel, 23, this.H);
        ea.c.G(parcel, 24, this.I, false);
        ea.c.u(parcel, 25, this.J);
        ea.c.b(parcel, a10);
    }
}
