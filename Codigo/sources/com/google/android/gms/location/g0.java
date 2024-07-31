package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;

/* loaded from: classes2.dex */
public final class g0 extends ea.a {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* renamed from: a, reason: collision with root package name */
    private final long f9827a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9828b;

    /* renamed from: c, reason: collision with root package name */
    private final WorkSource f9829c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9830d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f9831e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9832f;

    /* renamed from: r, reason: collision with root package name */
    private final String f9833r;

    /* renamed from: s, reason: collision with root package name */
    private final long f9834s;

    /* renamed from: t, reason: collision with root package name */
    private String f9835t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(long j10, boolean z10, WorkSource workSource, String str, int[] iArr, boolean z11, String str2, long j11, String str3) {
        this.f9827a = j10;
        this.f9828b = z10;
        this.f9829c = workSource;
        this.f9830d = str;
        this.f9831e = iArr;
        this.f9832f = z11;
        this.f9833r = str2;
        this.f9834s = j11;
        this.f9835t = str3;
    }

    public final g0 u1(String str) {
        this.f9835t = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.common.internal.s.j(parcel);
        int a10 = ea.c.a(parcel);
        ea.c.z(parcel, 1, this.f9827a);
        ea.c.g(parcel, 2, this.f9828b);
        ea.c.E(parcel, 3, this.f9829c, i10, false);
        ea.c.G(parcel, 4, this.f9830d, false);
        ea.c.v(parcel, 5, this.f9831e, false);
        ea.c.g(parcel, 6, this.f9832f);
        ea.c.G(parcel, 7, this.f9833r, false);
        ea.c.z(parcel, 8, this.f9834s);
        ea.c.G(parcel, 9, this.f9835t, false);
        ea.c.b(parcel, a10);
    }
}
