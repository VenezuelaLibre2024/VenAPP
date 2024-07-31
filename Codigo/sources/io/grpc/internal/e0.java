package io.grpc.internal;

import io.grpc.internal.k;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class e0 implements k {

    /* renamed from: a, reason: collision with root package name */
    private Random f18685a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private long f18686b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c, reason: collision with root package name */
    private long f18687c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d, reason: collision with root package name */
    private double f18688d = 1.6d;

    /* renamed from: e, reason: collision with root package name */
    private double f18689e = 0.2d;

    /* renamed from: f, reason: collision with root package name */
    private long f18690f = this.f18686b;

    /* loaded from: classes3.dex */
    public static final class a implements k.a {
        @Override // io.grpc.internal.k.a
        public k get() {
            return new e0();
        }
    }

    private long b(double d10, double d11) {
        eb.o.d(d11 >= d10);
        return (long) ((this.f18685a.nextDouble() * (d11 - d10)) + d10);
    }

    @Override // io.grpc.internal.k
    public long a() {
        long j10 = this.f18690f;
        double d10 = j10;
        this.f18690f = Math.min((long) (this.f18688d * d10), this.f18687c);
        double d11 = this.f18689e;
        return j10 + b((-d11) * d10, d11 * d10);
    }
}
