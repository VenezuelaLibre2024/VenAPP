package p387uj;

import dj.AbstractC6993r;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p123gj.C7579c;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9285c;
import p224lj.C9513b;
import p471yj.C12727a;

/* renamed from: uj.k */
/* loaded from: classes3.dex */
public final class C11573k extends AbstractC6993r {

    /* renamed from: b */
    private static final C11573k f30086b = new C11573k();

    /* renamed from: uj.k$a */
    /* loaded from: classes3.dex */
    static final class a implements Runnable {

        /* renamed from: a */
        private final Runnable f30087a;

        /* renamed from: b */
        private final c f30088b;

        /* renamed from: c */
        private final long f30089c;

        a(Runnable runnable, c cVar, long j10) {
            this.f30087a = runnable;
            this.f30088b = cVar;
            this.f30089c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f30088b.f30097d) {
                return;
            }
            long m20301a = this.f30088b.m20301a(TimeUnit.MILLISECONDS);
            long j10 = this.f30089c;
            if (j10 > m20301a) {
                try {
                    Thread.sleep(j10 - m20301a);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    C12727a.m41995q(e10);
                    return;
                }
            }
            if (this.f30088b.f30097d) {
                return;
            }
            this.f30087a.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uj.k$b */
    /* loaded from: classes3.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a */
        final Runnable f30090a;

        /* renamed from: b */
        final long f30091b;

        /* renamed from: c */
        final int f30092c;

        /* renamed from: d */
        volatile boolean f30093d;

        b(Runnable runnable, Long l10, int i10) {
            this.f30090a = runnable;
            this.f30091b = l10.longValue();
            this.f30092c = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int m28322b = C9513b.m28322b(this.f30091b, bVar.f30091b);
            return m28322b == 0 ? C9513b.m28321a(this.f30092c, bVar.f30092c) : m28322b;
        }
    }

    /* renamed from: uj.k$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC6993r.b {

        /* renamed from: a */
        final PriorityBlockingQueue<b> f30094a = new PriorityBlockingQueue<>();

        /* renamed from: b */
        private final AtomicInteger f30095b = new AtomicInteger();

        /* renamed from: c */
        final AtomicInteger f30096c = new AtomicInteger();

        /* renamed from: d */
        volatile boolean f30097d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: uj.k$c$a */
        /* loaded from: classes3.dex */
        public final class a implements Runnable {

            /* renamed from: a */
            final b f30098a;

            a(b bVar) {
                this.f30098a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f30098a.f30093d = true;
                c.this.f30094a.remove(this.f30098a);
            }
        }

        c() {
        }

        @Override // dj.AbstractC6993r.b
        /* renamed from: b */
        public InterfaceC7578b mo20302b(Runnable runnable) {
            return m36264d(runnable, m20301a(TimeUnit.MILLISECONDS));
        }

        @Override // dj.AbstractC6993r.b
        /* renamed from: c */
        public InterfaceC7578b mo20303c(Runnable runnable, long j10, TimeUnit timeUnit) {
            long m20301a = m20301a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return m36264d(new a(runnable, this, m20301a), m20301a);
        }

        /* renamed from: d */
        InterfaceC7578b m36264d(Runnable runnable, long j10) {
            if (this.f30097d) {
                return EnumC9285c.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f30096c.incrementAndGet());
            this.f30094a.add(bVar);
            if (this.f30095b.getAndIncrement() != 0) {
                return C7579c.m23026c(new a(bVar));
            }
            int i10 = 1;
            while (!this.f30097d) {
                b poll = this.f30094a.poll();
                if (poll == null) {
                    i10 = this.f30095b.addAndGet(-i10);
                    if (i10 == 0) {
                        return EnumC9285c.INSTANCE;
                    }
                } else if (!poll.f30093d) {
                    poll.f30090a.run();
                }
            }
            this.f30094a.clear();
            return EnumC9285c.INSTANCE;
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            this.f30097d = true;
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f30097d;
        }
    }

    C11573k() {
    }

    /* renamed from: d */
    public static C11573k m36262d() {
        return f30086b;
    }

    @Override // dj.AbstractC6993r
    /* renamed from: a */
    public AbstractC6993r.b mo20298a() {
        return new c();
    }

    @Override // dj.AbstractC6993r
    /* renamed from: b */
    public InterfaceC7578b mo20299b(Runnable runnable) {
        C12727a.m41997s(runnable).run();
        return EnumC9285c.INSTANCE;
    }

    @Override // dj.AbstractC6993r
    /* renamed from: c */
    public InterfaceC7578b mo20300c(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            C12727a.m41997s(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            C12727a.m41995q(e10);
        }
        return EnumC9285c.INSTANCE;
    }
}
