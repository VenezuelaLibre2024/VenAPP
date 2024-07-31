package io.grpc.internal;

import io.grpc.internal.InterfaceC8865k;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p082eb.C7159o;

/* renamed from: io.grpc.internal.e0 */
/* loaded from: classes3.dex */
public final class C8842e0 implements InterfaceC8865k {

    /* renamed from: a */
    private Random f20381a = new Random();

    /* renamed from: b */
    private long f20382b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c */
    private long f20383c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d */
    private double f20384d = 1.6d;

    /* renamed from: e */
    private double f20385e = 0.2d;

    /* renamed from: f */
    private long f20386f = this.f20382b;

    /* renamed from: io.grpc.internal.e0$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8865k.a {
        @Override // io.grpc.internal.InterfaceC8865k.a
        public InterfaceC8865k get() {
            return new C8842e0();
        }
    }

    /* renamed from: b */
    private long m25421b(double d10, double d11) {
        C7159o.m21301d(d11 >= d10);
        return (long) ((this.f20381a.nextDouble() * (d11 - d10)) + d10);
    }

    @Override // io.grpc.internal.InterfaceC8865k
    /* renamed from: a */
    public long mo25422a() {
        long j10 = this.f20386f;
        double d10 = j10;
        this.f20386f = Math.min((long) (this.f20384d * d10), this.f20383c);
        double d11 = this.f20385e;
        return j10 + m25421b((-d11) * d10, d11 * d10);
    }
}
