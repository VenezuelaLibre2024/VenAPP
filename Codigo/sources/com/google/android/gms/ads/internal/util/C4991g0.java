package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.C5270q;

/* renamed from: com.google.android.gms.ads.internal.util.g0 */
/* loaded from: classes.dex */
public final class C4991g0 {

    /* renamed from: a */
    public final String f10068a;

    /* renamed from: b */
    public final double f10069b;

    /* renamed from: c */
    public final double f10070c;

    /* renamed from: d */
    public final double f10071d;

    /* renamed from: e */
    public final int f10072e;

    public C4991g0(String str, double d10, double d11, double d12, int i10) {
        this.f10068a = str;
        this.f10070c = d10;
        this.f10069b = d11;
        this.f10071d = d12;
        this.f10072e = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4991g0)) {
            return false;
        }
        C4991g0 c4991g0 = (C4991g0) obj;
        return C5270q.m13304b(this.f10068a, c4991g0.f10068a) && this.f10069b == c4991g0.f10069b && this.f10070c == c4991g0.f10070c && this.f10072e == c4991g0.f10072e && Double.compare(this.f10071d, c4991g0.f10071d) == 0;
    }

    public final int hashCode() {
        return C5270q.m13305c(this.f10068a, Double.valueOf(this.f10069b), Double.valueOf(this.f10070c), Double.valueOf(this.f10071d), Integer.valueOf(this.f10072e));
    }

    public final String toString() {
        return C5270q.m13306d(this).m13307a("name", this.f10068a).m13307a("minBound", Double.valueOf(this.f10070c)).m13307a("maxBound", Double.valueOf(this.f10069b)).m13307a("percent", Double.valueOf(this.f10071d)).m13307a("count", Integer.valueOf(this.f10072e)).toString();
    }
}
