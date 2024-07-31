package dj;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    static final long f14201a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a implements gj.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f14202a;

        /* renamed from: b, reason: collision with root package name */
        final b f14203b;

        /* renamed from: c, reason: collision with root package name */
        Thread f14204c;

        a(Runnable runnable, b bVar) {
            this.f14202a = runnable;
            this.f14203b = bVar;
        }

        @Override // gj.b
        public void dispose() {
            if (this.f14204c == Thread.currentThread()) {
                b bVar = this.f14203b;
                if (bVar instanceof uj.e) {
                    ((uj.e) bVar).f();
                    return;
                }
            }
            this.f14203b.dispose();
        }

        @Override // gj.b
        public boolean h() {
            return this.f14203b.h();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14204c = Thread.currentThread();
            try {
                this.f14202a.run();
            } finally {
                dispose();
                this.f14204c = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b implements gj.b {
        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public gj.b b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract gj.b c(Runnable runnable, long j10, TimeUnit timeUnit);
    }

    public abstract b a();

    public gj.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public gj.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        b a10 = a();
        a aVar = new a(yj.a.s(runnable), a10);
        a10.c(aVar, j10, timeUnit);
        return aVar;
    }
}
