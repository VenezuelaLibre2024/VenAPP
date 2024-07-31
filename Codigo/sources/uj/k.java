package uj;

import dj.r;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class k extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final k f27763b = new k();

    /* loaded from: classes3.dex */
    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f27764a;

        /* renamed from: b, reason: collision with root package name */
        private final c f27765b;

        /* renamed from: c, reason: collision with root package name */
        private final long f27766c;

        a(Runnable runnable, c cVar, long j10) {
            this.f27764a = runnable;
            this.f27765b = cVar;
            this.f27766c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f27765b.f27774d) {
                return;
            }
            long a10 = this.f27765b.a(TimeUnit.MILLISECONDS);
            long j10 = this.f27766c;
            if (j10 > a10) {
                try {
                    Thread.sleep(j10 - a10);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    yj.a.q(e10);
                    return;
                }
            }
            if (this.f27765b.f27774d) {
                return;
            }
            this.f27764a.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f27767a;

        /* renamed from: b, reason: collision with root package name */
        final long f27768b;

        /* renamed from: c, reason: collision with root package name */
        final int f27769c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f27770d;

        b(Runnable runnable, Long l10, int i10) {
            this.f27767a = runnable;
            this.f27768b = l10.longValue();
            this.f27769c = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int b10 = lj.b.b(this.f27768b, bVar.f27768b);
            return b10 == 0 ? lj.b.a(this.f27769c, bVar.f27769c) : b10;
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends r.b {

        /* renamed from: a, reason: collision with root package name */
        final PriorityBlockingQueue<b> f27771a = new PriorityBlockingQueue<>();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f27772b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f27773c = new AtomicInteger();

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f27774d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final b f27775a;

            a(b bVar) {
                this.f27775a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27775a.f27770d = true;
                c.this.f27771a.remove(this.f27775a);
            }
        }

        c() {
        }

        @Override // dj.r.b
        public gj.b b(Runnable runnable) {
            return d(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // dj.r.b
        public gj.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            long a10 = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return d(new a(runnable, this, a10), a10);
        }

        gj.b d(Runnable runnable, long j10) {
            if (this.f27774d) {
                return kj.c.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f27773c.incrementAndGet());
            this.f27771a.add(bVar);
            if (this.f27772b.getAndIncrement() != 0) {
                return gj.c.c(new a(bVar));
            }
            int i10 = 1;
            while (!this.f27774d) {
                b poll = this.f27771a.poll();
                if (poll == null) {
                    i10 = this.f27772b.addAndGet(-i10);
                    if (i10 == 0) {
                        return kj.c.INSTANCE;
                    }
                } else if (!poll.f27770d) {
                    poll.f27767a.run();
                }
            }
            this.f27771a.clear();
            return kj.c.INSTANCE;
        }

        @Override // gj.b
        public void dispose() {
            this.f27774d = true;
        }

        @Override // gj.b
        public boolean h() {
            return this.f27774d;
        }
    }

    k() {
    }

    public static k d() {
        return f27763b;
    }

    @Override // dj.r
    public r.b a() {
        return new c();
    }

    @Override // dj.r
    public gj.b b(Runnable runnable) {
        yj.a.s(runnable).run();
        return kj.c.INSTANCE;
    }

    @Override // dj.r
    public gj.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            yj.a.s(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            yj.a.q(e10);
        }
        return kj.c.INSTANCE;
    }
}
