package f2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import zk.w1;

/* loaded from: classes.dex */
public final class i<R> implements com.google.common.util.concurrent.f<R> {

    /* renamed from: a, reason: collision with root package name */
    private final w1 f14883a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<R> f14884b;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.o implements ok.l<Throwable, ck.v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i<R> f14885a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i<R> iVar) {
            super(1);
            this.f14885a = iVar;
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                if (!((i) this.f14885a).f14884b.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                if (th2 instanceof CancellationException) {
                    ((i) this.f14885a).f14884b.cancel(true);
                    return;
                }
                androidx.work.impl.utils.futures.c cVar = ((i) this.f14885a).f14884b;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                cVar.p(th2);
            }
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(Throwable th2) {
            a(th2);
            return ck.v.f7137a;
        }
    }

    public i(w1 job, androidx.work.impl.utils.futures.c<R> underlying) {
        kotlin.jvm.internal.n.e(job, "job");
        kotlin.jvm.internal.n.e(underlying, "underlying");
        this.f14883a = job;
        this.f14884b = underlying;
        job.R(new a(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ i(zk.w1 r1, androidx.work.impl.utils.futures.c r2, int r3, kotlin.jvm.internal.g r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            androidx.work.impl.utils.futures.c r2 = androidx.work.impl.utils.futures.c.s()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.n.d(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.i.<init>(zk.w1, androidx.work.impl.utils.futures.c, int, kotlin.jvm.internal.g):void");
    }

    @Override // com.google.common.util.concurrent.f
    public void addListener(Runnable runnable, Executor executor) {
        this.f14884b.addListener(runnable, executor);
    }

    public final void b(R r10) {
        this.f14884b.o(r10);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f14884b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.f14884b.get();
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, TimeUnit timeUnit) {
        return this.f14884b.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f14884b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f14884b.isDone();
    }
}
