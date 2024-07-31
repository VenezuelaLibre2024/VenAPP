package com.google.android.gms.location;

import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.location.w */
/* loaded from: classes2.dex */
public final class C5405w {

    /* renamed from: a */
    private long f11000a = Long.MIN_VALUE;

    /* renamed from: a */
    public final C5405w m13545a(long j10) {
        C5276s.m13316b(j10 >= 0, "intervalMillis can't be negative.");
        this.f11000a = j10;
        return this;
    }

    /* renamed from: b */
    public final C5374g0 m13546b() {
        C5276s.m13329o(this.f11000a != Long.MIN_VALUE, "Must set intervalMillis.");
        return new C5374g0(this.f11000a, true, null, null, null, false, null, 0L, null);
    }
}
