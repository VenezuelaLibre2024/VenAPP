package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import p082eb.C7159o;

/* renamed from: io.grpc.internal.h */
/* loaded from: classes3.dex */
public final class C8853h {

    /* renamed from: c */
    private static final Logger f20625c = Logger.getLogger(C8853h.class.getName());

    /* renamed from: a */
    private final String f20626a;

    /* renamed from: b */
    private final AtomicLong f20627b;

    /* renamed from: io.grpc.internal.h$b */
    /* loaded from: classes3.dex */
    public final class b {

        /* renamed from: a */
        private final long f20628a;

        private b(long j10) {
            this.f20628a = j10;
        }

        /* renamed from: a */
        public void m25584a() {
            long j10 = this.f20628a;
            long max = Math.max(2 * j10, j10);
            if (C8853h.this.f20627b.compareAndSet(this.f20628a, max)) {
                C8853h.f20625c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{C8853h.this.f20626a, Long.valueOf(max)});
            }
        }

        /* renamed from: b */
        public long m25585b() {
            return this.f20628a;
        }
    }

    public C8853h(String str, long j10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f20627b = atomicLong;
        C7159o.m21302e(j10 > 0, "value must be positive");
        this.f20626a = str;
        atomicLong.set(j10);
    }

    /* renamed from: d */
    public b m25583d() {
        return new b(this.f20627b.get());
    }
}
