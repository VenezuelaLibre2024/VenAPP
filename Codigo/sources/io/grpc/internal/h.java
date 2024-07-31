package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f18882c = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final String f18883a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f18884b;

    /* loaded from: classes3.dex */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f18885a;

        private b(long j10) {
            this.f18885a = j10;
        }

        public void a() {
            long j10 = this.f18885a;
            long max = Math.max(2 * j10, j10);
            if (h.this.f18884b.compareAndSet(this.f18885a, max)) {
                h.f18882c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{h.this.f18883a, Long.valueOf(max)});
            }
        }

        public long b() {
            return this.f18885a;
        }
    }

    public h(String str, long j10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f18884b = atomicLong;
        eb.o.e(j10 > 0, "value must be positive");
        this.f18883a = str;
        atomicLong.set(j10);
    }

    public b d() {
        return new b(this.f18884b.get());
    }
}
