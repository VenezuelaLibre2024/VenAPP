package io.grpc.internal;

import com.google.common.util.concurrent.C5921g;
import io.grpc.internal.InterfaceC8895s;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p082eb.C7159o;
import p082eb.C7164t;
import vi.C11915g1;

/* renamed from: io.grpc.internal.b1 */
/* loaded from: classes3.dex */
public class C8831b1 {

    /* renamed from: l */
    private static final long f20302l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: m */
    private static final long f20303m = TimeUnit.MILLISECONDS.toNanos(10);

    /* renamed from: a */
    private final ScheduledExecutorService f20304a;

    /* renamed from: b */
    private final C7164t f20305b;

    /* renamed from: c */
    private final d f20306c;

    /* renamed from: d */
    private final boolean f20307d;

    /* renamed from: e */
    private e f20308e;

    /* renamed from: f */
    private ScheduledFuture<?> f20309f;

    /* renamed from: g */
    private ScheduledFuture<?> f20310g;

    /* renamed from: h */
    private final Runnable f20311h;

    /* renamed from: i */
    private final Runnable f20312i;

    /* renamed from: j */
    private final long f20313j;

    /* renamed from: k */
    private final long f20314k;

    /* renamed from: io.grpc.internal.b1$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            synchronized (C8831b1.this) {
                e eVar = C8831b1.this.f20308e;
                e eVar2 = e.DISCONNECTED;
                if (eVar != eVar2) {
                    C8831b1.this.f20308e = eVar2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                C8831b1.this.f20306c.mo25313b();
            }
        }
    }

    /* renamed from: io.grpc.internal.b1$b */
    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            synchronized (C8831b1.this) {
                C8831b1.this.f20310g = null;
                e eVar = C8831b1.this.f20308e;
                e eVar2 = e.PING_SCHEDULED;
                if (eVar == eVar2) {
                    C8831b1.this.f20308e = e.PING_SENT;
                    C8831b1 c8831b1 = C8831b1.this;
                    c8831b1.f20309f = c8831b1.f20304a.schedule(C8831b1.this.f20311h, C8831b1.this.f20314k, TimeUnit.NANOSECONDS);
                    z10 = true;
                } else {
                    if (C8831b1.this.f20308e == e.PING_DELAYED) {
                        C8831b1 c8831b12 = C8831b1.this;
                        ScheduledExecutorService scheduledExecutorService = c8831b12.f20304a;
                        Runnable runnable = C8831b1.this.f20312i;
                        long j10 = C8831b1.this.f20313j;
                        C7164t c7164t = C8831b1.this.f20305b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        c8831b12.f20310g = scheduledExecutorService.schedule(runnable, j10 - c7164t.m21345d(timeUnit), timeUnit);
                        C8831b1.this.f20308e = eVar2;
                    }
                    z10 = false;
                }
            }
            if (z10) {
                C8831b1.this.f20306c.mo25312a();
            }
        }
    }

    /* renamed from: io.grpc.internal.b1$c */
    /* loaded from: classes3.dex */
    public static final class c implements d {

        /* renamed from: a */
        private final InterfaceC8904v f20317a;

        /* renamed from: io.grpc.internal.b1$c$a */
        /* loaded from: classes3.dex */
        class a implements InterfaceC8895s.a {
            a() {
            }

            @Override // io.grpc.internal.InterfaceC8895s.a
            /* renamed from: a */
            public void mo25314a(Throwable th2) {
                c.this.f20317a.mo25244b(C11915g1.f31549u.m38147r("Keepalive failed. The connection is likely gone"));
            }

            @Override // io.grpc.internal.InterfaceC8895s.a
            /* renamed from: b */
            public void mo25315b(long j10) {
            }
        }

        public c(InterfaceC8904v interfaceC8904v) {
            this.f20317a = interfaceC8904v;
        }

        @Override // io.grpc.internal.C8831b1.d
        /* renamed from: a */
        public void mo25312a() {
            this.f20317a.mo25625f(new a(), C5921g.m15178a());
        }

        @Override // io.grpc.internal.C8831b1.d
        /* renamed from: b */
        public void mo25313b() {
            this.f20317a.mo25244b(C11915g1.f31549u.m38147r("Keepalive failed. The connection is likely gone"));
        }
    }

    /* renamed from: io.grpc.internal.b1$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo25312a();

        /* renamed from: b */
        void mo25313b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.b1$e */
    /* loaded from: classes3.dex */
    public enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public C8831b1(d dVar, ScheduledExecutorService scheduledExecutorService, long j10, long j11, boolean z10) {
        this(dVar, scheduledExecutorService, C7164t.m21343c(), j10, j11, z10);
    }

    C8831b1(d dVar, ScheduledExecutorService scheduledExecutorService, C7164t c7164t, long j10, long j11, boolean z10) {
        this.f20308e = e.IDLE;
        this.f20311h = new RunnableC8835c1(new a());
        this.f20312i = new RunnableC8835c1(new b());
        this.f20306c = (d) C7159o.m21313p(dVar, "keepAlivePinger");
        this.f20304a = (ScheduledExecutorService) C7159o.m21313p(scheduledExecutorService, "scheduler");
        this.f20305b = (C7164t) C7159o.m21313p(c7164t, "stopwatch");
        this.f20313j = j10;
        this.f20314k = j11;
        this.f20307d = z10;
        c7164t.m21346f().m21347g();
    }

    /* renamed from: l */
    public synchronized void m25306l() {
        this.f20305b.m21346f().m21347g();
        e eVar = this.f20308e;
        e eVar2 = e.PING_SCHEDULED;
        if (eVar == eVar2) {
            this.f20308e = e.PING_DELAYED;
        } else if (eVar == e.PING_SENT || eVar == e.IDLE_AND_PING_SENT) {
            ScheduledFuture<?> scheduledFuture = this.f20309f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.f20308e == e.IDLE_AND_PING_SENT) {
                this.f20308e = e.IDLE;
            } else {
                this.f20308e = eVar2;
                C7159o.m21319v(this.f20310g == null, "There should be no outstanding pingFuture");
                this.f20310g = this.f20304a.schedule(this.f20312i, this.f20313j, TimeUnit.NANOSECONDS);
            }
        }
    }

    /* renamed from: m */
    public synchronized void m25307m() {
        e eVar = this.f20308e;
        if (eVar == e.IDLE) {
            this.f20308e = e.PING_SCHEDULED;
            if (this.f20310g == null) {
                ScheduledExecutorService scheduledExecutorService = this.f20304a;
                Runnable runnable = this.f20312i;
                long j10 = this.f20313j;
                C7164t c7164t = this.f20305b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f20310g = scheduledExecutorService.schedule(runnable, j10 - c7164t.m21345d(timeUnit), timeUnit);
            }
        } else if (eVar == e.IDLE_AND_PING_SENT) {
            this.f20308e = e.PING_SENT;
        }
    }

    /* renamed from: n */
    public synchronized void m25308n() {
        if (this.f20307d) {
            return;
        }
        e eVar = this.f20308e;
        if (eVar == e.PING_SCHEDULED || eVar == e.PING_DELAYED) {
            this.f20308e = e.IDLE;
        }
        if (this.f20308e == e.PING_SENT) {
            this.f20308e = e.IDLE_AND_PING_SENT;
        }
    }

    /* renamed from: o */
    public synchronized void m25309o() {
        if (this.f20307d) {
            m25307m();
        }
    }

    /* renamed from: p */
    public synchronized void m25310p() {
        e eVar = this.f20308e;
        e eVar2 = e.DISCONNECTED;
        if (eVar != eVar2) {
            this.f20308e = eVar2;
            ScheduledFuture<?> scheduledFuture = this.f20309f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture<?> scheduledFuture2 = this.f20310g;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f20310g = null;
            }
        }
    }
}
