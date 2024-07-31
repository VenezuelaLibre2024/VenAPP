package dj;

import java.util.concurrent.TimeUnit;
import p123gj.InterfaceC7578b;
import p387uj.C11567e;
import p471yj.C12727a;

/* renamed from: dj.r */
/* loaded from: classes3.dex */
public abstract class AbstractC6993r {

    /* renamed from: a */
    static final long f15559a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dj.r$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC7578b, Runnable {

        /* renamed from: a */
        final Runnable f15560a;

        /* renamed from: b */
        final b f15561b;

        /* renamed from: c */
        Thread f15562c;

        a(Runnable runnable, b bVar) {
            this.f15560a = runnable;
            this.f15561b = bVar;
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            if (this.f15562c == Thread.currentThread()) {
                b bVar = this.f15561b;
                if (bVar instanceof C11567e) {
                    ((C11567e) bVar).m36253f();
                    return;
                }
            }
            this.f15561b.dispose();
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f15561b.mo616h();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15562c = Thread.currentThread();
            try {
                this.f15560a.run();
            } finally {
                dispose();
                this.f15562c = null;
            }
        }
    }

    /* renamed from: dj.r$b */
    /* loaded from: classes3.dex */
    public static abstract class b implements InterfaceC7578b {
        /* renamed from: a */
        public long m20301a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: b */
        public InterfaceC7578b mo20302b(Runnable runnable) {
            return mo20303c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        /* renamed from: c */
        public abstract InterfaceC7578b mo20303c(Runnable runnable, long j10, TimeUnit timeUnit);
    }

    /* renamed from: a */
    public abstract b mo20298a();

    /* renamed from: b */
    public InterfaceC7578b mo20299b(Runnable runnable) {
        return mo20300c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public InterfaceC7578b mo20300c(Runnable runnable, long j10, TimeUnit timeUnit) {
        b mo20298a = mo20298a();
        a aVar = new a(C12727a.m41997s(runnable), mo20298a);
        mo20298a.mo20303c(aVar, j10, timeUnit);
        return aVar;
    }
}
