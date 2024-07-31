package com.google.android.gms.location;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private long f9885a = Long.MIN_VALUE;

    public final w a(long j10) {
        com.google.android.gms.common.internal.s.b(j10 >= 0, "intervalMillis can't be negative.");
        this.f9885a = j10;
        return this;
    }

    public final g0 b() {
        com.google.android.gms.common.internal.s.o(this.f9885a != Long.MIN_VALUE, "Must set intervalMillis.");
        return new g0(this.f9885a, true, null, null, null, false, null, 0L, null);
    }
}
