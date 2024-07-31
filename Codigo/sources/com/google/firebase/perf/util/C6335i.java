package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.perf.util.i */
/* loaded from: classes.dex */
public class C6335i {

    /* renamed from: a */
    private long f13607a;

    /* renamed from: b */
    private long f13608b;

    /* renamed from: c */
    private TimeUnit f13609c;

    /* renamed from: com.google.firebase.perf.util.i$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13610a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f13610a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13610a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13610a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C6335i(long j10, long j11, TimeUnit timeUnit) {
        this.f13607a = j10;
        this.f13608b = j11;
        this.f13609c = timeUnit;
    }

    /* renamed from: a */
    public double m17525a() {
        int i10 = a.f13610a[this.f13609c.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f13607a / this.f13609c.toSeconds(this.f13608b) : (this.f13607a / this.f13608b) * TimeUnit.SECONDS.toMillis(1L) : (this.f13607a / this.f13608b) * TimeUnit.SECONDS.toMicros(1L) : (this.f13607a / this.f13608b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
