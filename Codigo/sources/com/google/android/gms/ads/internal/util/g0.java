package com.google.android.gms.ads.internal.util;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8969a;

    /* renamed from: b, reason: collision with root package name */
    public final double f8970b;

    /* renamed from: c, reason: collision with root package name */
    public final double f8971c;

    /* renamed from: d, reason: collision with root package name */
    public final double f8972d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8973e;

    public g0(String str, double d10, double d11, double d12, int i10) {
        this.f8969a = str;
        this.f8971c = d10;
        this.f8970b = d11;
        this.f8972d = d12;
        this.f8973e = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return com.google.android.gms.common.internal.q.b(this.f8969a, g0Var.f8969a) && this.f8970b == g0Var.f8970b && this.f8971c == g0Var.f8971c && this.f8973e == g0Var.f8973e && Double.compare(this.f8972d, g0Var.f8972d) == 0;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f8969a, Double.valueOf(this.f8970b), Double.valueOf(this.f8971c), Double.valueOf(this.f8972d), Integer.valueOf(this.f8973e));
    }

    public final String toString() {
        return com.google.android.gms.common.internal.q.d(this).a("name", this.f8969a).a("minBound", Double.valueOf(this.f8971c)).a("maxBound", Double.valueOf(this.f8970b)).a("percent", Double.valueOf(this.f8972d)).a("count", Integer.valueOf(this.f8973e)).toString();
    }
}
