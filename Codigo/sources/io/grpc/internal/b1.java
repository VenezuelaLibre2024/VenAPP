package io.grpc.internal;

import io.grpc.internal.s;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class b1 {

    /* renamed from: l, reason: collision with root package name */
    private static final long f18608l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: m, reason: collision with root package name */
    private static final long f18609m = TimeUnit.MILLISECONDS.toNanos(10);

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f18610a;

    /* renamed from: b, reason: collision with root package name */
    private final eb.t f18611b;

    /* renamed from: c, reason: collision with root package name */
    private final d f18612c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18613d;

    /* renamed from: e, reason: collision with root package name */
    private e f18614e;

    /* renamed from: f, reason: collision with root package name */
    private ScheduledFuture<?> f18615f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledFuture<?> f18616g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f18617h;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f18618i;

    /* renamed from: j, reason: collision with root package name */
    private final long f18619j;

    /* renamed from: k, reason: collision with root package name */
    private final long f18620k;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            synchronized (b1.this) {
                e eVar = b1.this.f18614e;
                e eVar2 = e.DISCONNECTED;
                if (eVar != eVar2) {
                    b1.this.f18614e = eVar2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                b1.this.f18612c.b();
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            synchronized (b1.this) {
                b1.this.f18616g = null;
                e eVar = b1.this.f18614e;
                e eVar2 = e.PING_SCHEDULED;
                if (eVar == eVar2) {
                    b1.this.f18614e = e.PING_SENT;
                    b1 b1Var = b1.this;
                    b1Var.f18615f = b1Var.f18610a.schedule(b1.this.f18617h, b1.this.f18620k, TimeUnit.NANOSECONDS);
                    z10 = true;
                } else {
                    if (b1.this.f18614e == e.PING_DELAYED) {
                        b1 b1Var2 = b1.this;
                        ScheduledExecutorService scheduledExecutorService = b1Var2.f18610a;
                        Runnable runnable = b1.this.f18618i;
                        long j10 = b1.this.f18619j;
                        eb.t tVar = b1.this.f18611b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        b1Var2.f18616g = scheduledExecutorService.schedule(runnable, j10 - tVar.d(timeUnit), timeUnit);
                        b1.this.f18614e = eVar2;
                    }
                    z10 = false;
                }
            }
            if (z10) {
                b1.this.f18612c.a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final v f18623a;

        /* loaded from: classes3.dex */
        class a implements s.a {
            a() {
            }

            @Override // io.grpc.internal.s.a
            public void a(Throwable th2) {
                c.this.f18623a.b(vi.g1.f29115u.r("Keepalive failed. The connection is likely gone"));
            }

            @Override // io.grpc.internal.s.a
            public void b(long j10) {
            }
        }

        public c(v vVar) {
            this.f18623a = vVar;
        }

        @Override // io.grpc.internal.b1.d
        public void a() {
            this.f18623a.f(new a(), com.google.common.util.concurrent.g.a());
        }

        @Override // io.grpc.internal.b1.d
        public void b() {
            this.f18623a.b(vi.g1.f29115u.r("Keepalive failed. The connection is likely gone"));
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public b1(d dVar, ScheduledExecutorService scheduledExecutorService, long j10, long j11, boolean z10) {
        this(dVar, scheduledExecutorService, eb.t.c(), j10, j11, z10);
    }

    b1(d dVar, ScheduledExecutorService scheduledExecutorService, eb.t tVar, long j10, long j11, boolean z10) {
        this.f18614e = e.IDLE;
        this.f18617h = new c1(new a());
        this.f18618i = new c1(new b());
        this.f18612c = (d) eb.o.p(dVar, "keepAlivePinger");
        this.f18610a = (ScheduledExecutorService) eb.o.p(scheduledExecutorService, "scheduler");
        this.f18611b = (eb.t) eb.o.p(tVar, "stopwatch");
        this.f18619j = j10;
        this.f18620k = j11;
        this.f18613d = z10;
        tVar.f().g();
    }

    public synchronized void l() {
        this.f18611b.f().g();
        e eVar = this.f18614e;
        e eVar2 = e.PING_SCHEDULED;
        if (eVar == eVar2) {
            this.f18614e = e.PING_DELAYED;
        } else if (eVar == e.PING_SENT || eVar == e.IDLE_AND_PING_SENT) {
            ScheduledFuture<?> scheduledFuture = this.f18615f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.f18614e == e.IDLE_AND_PING_SENT) {
                this.f18614e = e.IDLE;
            } else {
                this.f18614e = eVar2;
                eb.o.v(this.f18616g == null, "There should be no outstanding pingFuture");
                this.f18616g = this.f18610a.schedule(this.f18618i, this.f18619j, TimeUnit.NANOSECONDS);
            }
        }
    }

    public synchronized void m() {
        e eVar = this.f18614e;
        if (eVar == e.IDLE) {
            this.f18614e = e.PING_SCHEDULED;
            if (this.f18616g == null) {
                ScheduledExecutorService scheduledExecutorService = this.f18610a;
                Runnable runnable = this.f18618i;
                long j10 = this.f18619j;
                eb.t tVar = this.f18611b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f18616g = scheduledExecutorService.schedule(runnable, j10 - tVar.d(timeUnit), timeUnit);
            }
        } else if (eVar == e.IDLE_AND_PING_SENT) {
            this.f18614e = e.PING_SENT;
        }
    }

    public synchronized void n() {
        if (this.f18613d) {
            return;
        }
        e eVar = this.f18614e;
        if (eVar == e.PING_SCHEDULED || eVar == e.PING_DELAYED) {
            this.f18614e = e.IDLE;
        }
        if (this.f18614e == e.PING_SENT) {
            this.f18614e = e.IDLE_AND_PING_SENT;
        }
    }

    public synchronized void o() {
        if (this.f18613d) {
            m();
        }
    }

    public synchronized void p() {
        e eVar = this.f18614e;
        e eVar2 = e.DISCONNECTED;
        if (eVar != eVar2) {
            this.f18614e = eVar2;
            ScheduledFuture<?> scheduledFuture = this.f18615f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture<?> scheduledFuture2 = this.f18616g;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f18616g = null;
            }
        }
    }
}
