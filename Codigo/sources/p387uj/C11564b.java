package p387uj;

import dj.AbstractC6993r;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p123gj.C7577a;
import p123gj.InterfaceC7578b;
import p205kj.C9286d;
import p205kj.EnumC9285c;

/* renamed from: uj.b */
/* loaded from: classes3.dex */
public final class C11564b extends AbstractC6993r {

    /* renamed from: d */
    static final b f30029d;

    /* renamed from: e */
    static final ThreadFactoryC11568f f30030e;

    /* renamed from: f */
    static final int f30031f = m36239d(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    static final c f30032g;

    /* renamed from: b */
    final ThreadFactory f30033b;

    /* renamed from: c */
    final AtomicReference<b> f30034c;

    /* renamed from: uj.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC6993r.b {

        /* renamed from: a */
        private final C9286d f30035a;

        /* renamed from: b */
        private final C7577a f30036b;

        /* renamed from: c */
        private final C9286d f30037c;

        /* renamed from: d */
        private final c f30038d;

        /* renamed from: e */
        volatile boolean f30039e;

        a(c cVar) {
            this.f30038d = cVar;
            C9286d c9286d = new C9286d();
            this.f30035a = c9286d;
            C7577a c7577a = new C7577a();
            this.f30036b = c7577a;
            C9286d c9286d2 = new C9286d();
            this.f30037c = c9286d2;
            c9286d2.mo23021b(c9286d);
            c9286d2.mo23021b(c7577a);
        }

        @Override // dj.AbstractC6993r.b
        /* renamed from: b */
        public InterfaceC7578b mo20302b(Runnable runnable) {
            return this.f30039e ? EnumC9285c.INSTANCE : this.f30038d.m36251d(runnable, 0L, TimeUnit.MILLISECONDS, this.f30035a);
        }

        @Override // dj.AbstractC6993r.b
        /* renamed from: c */
        public InterfaceC7578b mo20303c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f30039e ? EnumC9285c.INSTANCE : this.f30038d.m36251d(runnable, j10, timeUnit, this.f30036b);
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            if (this.f30039e) {
                return;
            }
            this.f30039e = true;
            this.f30037c.dispose();
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f30039e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uj.b$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        final int f30040a;

        /* renamed from: b */
        final c[] f30041b;

        /* renamed from: c */
        long f30042c;

        b(int i10, ThreadFactory threadFactory) {
            this.f30040a = i10;
            this.f30041b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f30041b[i11] = new c(threadFactory);
            }
        }

        /* renamed from: a */
        public c m36241a() {
            int i10 = this.f30040a;
            if (i10 == 0) {
                return C11564b.f30032g;
            }
            c[] cVarArr = this.f30041b;
            long j10 = this.f30042c;
            this.f30042c = 1 + j10;
            return cVarArr[(int) (j10 % i10)];
        }

        /* renamed from: b */
        public void m36242b() {
            for (c cVar : this.f30041b) {
                cVar.dispose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uj.b$c */
    /* loaded from: classes3.dex */
    public static final class c extends C11567e {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new ThreadFactoryC11568f("RxComputationShutdown"));
        f30032g = cVar;
        cVar.dispose();
        ThreadFactoryC11568f threadFactoryC11568f = new ThreadFactoryC11568f("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f30030e = threadFactoryC11568f;
        b bVar = new b(0, threadFactoryC11568f);
        f30029d = bVar;
        bVar.m36242b();
    }

    public C11564b() {
        this(f30030e);
    }

    public C11564b(ThreadFactory threadFactory) {
        this.f30033b = threadFactory;
        this.f30034c = new AtomicReference<>(f30029d);
        m36240e();
    }

    /* renamed from: d */
    static int m36239d(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    @Override // dj.AbstractC6993r
    /* renamed from: a */
    public AbstractC6993r.b mo20298a() {
        return new a(this.f30034c.get().m36241a());
    }

    @Override // dj.AbstractC6993r
    /* renamed from: c */
    public InterfaceC7578b mo20300c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f30034c.get().m36241a().m36252e(runnable, j10, timeUnit);
    }

    /* renamed from: e */
    public void m36240e() {
        b bVar = new b(f30031f, this.f30033b);
        if (C7099c.m20926a(this.f30034c, f30029d, bVar)) {
            return;
        }
        bVar.m36242b();
    }
}
