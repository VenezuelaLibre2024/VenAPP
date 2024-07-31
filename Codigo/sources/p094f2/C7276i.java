package p094f2;

import androidx.work.impl.utils.futures.C1583c;
import ck.C2037v;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;
import p494zk.InterfaceC13125w1;

/* renamed from: f2.i */
/* loaded from: classes.dex */
public final class C7276i<R> implements InterfaceFutureC5920f<R> {

    /* renamed from: a */
    private final InterfaceC13125w1 f16306a;

    /* renamed from: b */
    private final C1583c<R> f16307b;

    /* renamed from: f2.i$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9323o implements InterfaceC9998l<Throwable, C2037v> {

        /* renamed from: a */
        final /* synthetic */ C7276i<R> f16308a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7276i<R> c7276i) {
            super(1);
            this.f16308a = c7276i;
        }

        /* renamed from: a */
        public final void m21766a(Throwable th2) {
            if (th2 == null) {
                if (!((C7276i) this.f16308a).f16307b.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                if (th2 instanceof CancellationException) {
                    ((C7276i) this.f16308a).f16307b.cancel(true);
                    return;
                }
                C1583c c1583c = ((C7276i) this.f16308a).f16307b;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                c1583c.mo8791p(th2);
            }
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
            m21766a(th2);
            return C2037v.f8089a;
        }
    }

    public C7276i(InterfaceC13125w1 job, C1583c<R> underlying) {
        C9322n.m27781e(job, "job");
        C9322n.m27781e(underlying, "underlying");
        this.f16306a = job;
        this.f16307b = underlying;
        job.mo43109R(new a(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C7276i(p494zk.InterfaceC13125w1 r1, androidx.work.impl.utils.futures.C1583c r2, int r3, kotlin.jvm.internal.C9315g r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            androidx.work.impl.utils.futures.c r2 = androidx.work.impl.utils.futures.C1583c.m8801s()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.C9322n.m27780d(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f2.C7276i.<init>(zk.w1, androidx.work.impl.utils.futures.c, int, kotlin.jvm.internal.g):void");
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC5920f
    public void addListener(Runnable runnable, Executor executor) {
        this.f16307b.addListener(runnable, executor);
    }

    /* renamed from: b */
    public final void m21765b(R r10) {
        this.f16307b.mo8790o(r10);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f16307b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.f16307b.get();
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, TimeUnit timeUnit) {
        return this.f16307b.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f16307b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f16307b.isDone();
    }
}
