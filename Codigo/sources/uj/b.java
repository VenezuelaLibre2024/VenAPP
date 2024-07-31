package uj;

import dj.r;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b extends r {

    /* renamed from: d, reason: collision with root package name */
    static final C0448b f27706d;

    /* renamed from: e, reason: collision with root package name */
    static final f f27707e;

    /* renamed from: f, reason: collision with root package name */
    static final int f27708f = d(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g, reason: collision with root package name */
    static final c f27709g;

    /* renamed from: b, reason: collision with root package name */
    final ThreadFactory f27710b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<C0448b> f27711c;

    /* loaded from: classes3.dex */
    static final class a extends r.b {

        /* renamed from: a, reason: collision with root package name */
        private final kj.d f27712a;

        /* renamed from: b, reason: collision with root package name */
        private final gj.a f27713b;

        /* renamed from: c, reason: collision with root package name */
        private final kj.d f27714c;

        /* renamed from: d, reason: collision with root package name */
        private final c f27715d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f27716e;

        a(c cVar) {
            this.f27715d = cVar;
            kj.d dVar = new kj.d();
            this.f27712a = dVar;
            gj.a aVar = new gj.a();
            this.f27713b = aVar;
            kj.d dVar2 = new kj.d();
            this.f27714c = dVar2;
            dVar2.b(dVar);
            dVar2.b(aVar);
        }

        @Override // dj.r.b
        public gj.b b(Runnable runnable) {
            return this.f27716e ? kj.c.INSTANCE : this.f27715d.d(runnable, 0L, TimeUnit.MILLISECONDS, this.f27712a);
        }

        @Override // dj.r.b
        public gj.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f27716e ? kj.c.INSTANCE : this.f27715d.d(runnable, j10, timeUnit, this.f27713b);
        }

        @Override // gj.b
        public void dispose() {
            if (this.f27716e) {
                return;
            }
            this.f27716e = true;
            this.f27714c.dispose();
        }

        @Override // gj.b
        public boolean h() {
            return this.f27716e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uj.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0448b {

        /* renamed from: a, reason: collision with root package name */
        final int f27717a;

        /* renamed from: b, reason: collision with root package name */
        final c[] f27718b;

        /* renamed from: c, reason: collision with root package name */
        long f27719c;

        C0448b(int i10, ThreadFactory threadFactory) {
            this.f27717a = i10;
            this.f27718b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f27718b[i11] = new c(threadFactory);
            }
        }

        public c a() {
            int i10 = this.f27717a;
            if (i10 == 0) {
                return b.f27709g;
            }
            c[] cVarArr = this.f27718b;
            long j10 = this.f27719c;
            this.f27719c = 1 + j10;
            return cVarArr[(int) (j10 % i10)];
        }

        public void b() {
            for (c cVar : this.f27718b) {
                cVar.dispose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends e {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new f("RxComputationShutdown"));
        f27709g = cVar;
        cVar.dispose();
        f fVar = new f("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f27707e = fVar;
        C0448b c0448b = new C0448b(0, fVar);
        f27706d = c0448b;
        c0448b.b();
    }

    public b() {
        this(f27707e);
    }

    public b(ThreadFactory threadFactory) {
        this.f27710b = threadFactory;
        this.f27711c = new AtomicReference<>(f27706d);
        e();
    }

    static int d(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    @Override // dj.r
    public r.b a() {
        return new a(this.f27711c.get().a());
    }

    @Override // dj.r
    public gj.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f27711c.get().a().e(runnable, j10, timeUnit);
    }

    public void e() {
        C0448b c0448b = new C0448b(f27708f, this.f27710b);
        if (e2.c.a(this.f27711c, f27706d, c0448b)) {
            return;
        }
        c0448b.b();
    }
}
