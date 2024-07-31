package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private long f12375a;

    /* renamed from: b, reason: collision with root package name */
    private long f12376b;

    /* renamed from: c, reason: collision with root package name */
    private TimeUnit f12377c;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12378a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f12378a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12378a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12378a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(long j10, long j11, TimeUnit timeUnit) {
        this.f12375a = j10;
        this.f12376b = j11;
        this.f12377c = timeUnit;
    }

    public double a() {
        int i10 = a.f12378a[this.f12377c.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f12375a / this.f12377c.toSeconds(this.f12376b) : (this.f12375a / this.f12376b) * TimeUnit.SECONDS.toMillis(1L) : (this.f12375a / this.f12376b) * TimeUnit.SECONDS.toMicros(1L) : (this.f12375a / this.f12376b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
