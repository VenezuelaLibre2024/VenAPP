package p387uj;

import dj.AbstractC6993r;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9285c;
import p205kj.InterfaceC9283a;
import p471yj.C12727a;

/* renamed from: uj.e */
/* loaded from: classes3.dex */
public class C11567e extends AbstractC6993r.b {

    /* renamed from: a */
    private final ScheduledExecutorService f30063a;

    /* renamed from: b */
    volatile boolean f30064b;

    public C11567e(ThreadFactory threadFactory) {
        this.f30063a = C11571i.m36256a(threadFactory);
    }

    @Override // dj.AbstractC6993r.b
    /* renamed from: b */
    public InterfaceC7578b mo20302b(Runnable runnable) {
        return mo20303c(runnable, 0L, null);
    }

    @Override // dj.AbstractC6993r.b
    /* renamed from: c */
    public InterfaceC7578b mo20303c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f30064b ? EnumC9285c.INSTANCE : m36251d(runnable, j10, timeUnit, null);
    }

    /* renamed from: d */
    public RunnableC11570h m36251d(Runnable runnable, long j10, TimeUnit timeUnit, InterfaceC9283a interfaceC9283a) {
        RunnableC11570h runnableC11570h = new RunnableC11570h(C12727a.m41997s(runnable), interfaceC9283a);
        if (interfaceC9283a != null && !interfaceC9283a.mo23021b(runnableC11570h)) {
            return runnableC11570h;
        }
        try {
            runnableC11570h.m36255a(j10 <= 0 ? this.f30063a.submit((Callable) runnableC11570h) : this.f30063a.schedule((Callable) runnableC11570h, j10, timeUnit));
        } catch (RejectedExecutionException e10) {
            if (interfaceC9283a != null) {
                interfaceC9283a.mo23020a(runnableC11570h);
            }
            C12727a.m41995q(e10);
        }
        return runnableC11570h;
    }

    @Override // p123gj.InterfaceC7578b
    public void dispose() {
        if (this.f30064b) {
            return;
        }
        this.f30064b = true;
        this.f30063a.shutdownNow();
    }

    /* renamed from: e */
    public InterfaceC7578b m36252e(Runnable runnable, long j10, TimeUnit timeUnit) {
        CallableC11569g callableC11569g = new CallableC11569g(C12727a.m41997s(runnable));
        try {
            callableC11569g.m36238a(j10 <= 0 ? this.f30063a.submit(callableC11569g) : this.f30063a.schedule(callableC11569g, j10, timeUnit));
            return callableC11569g;
        } catch (RejectedExecutionException e10) {
            C12727a.m41995q(e10);
            return EnumC9285c.INSTANCE;
        }
    }

    /* renamed from: f */
    public void m36253f() {
        if (this.f30064b) {
            return;
        }
        this.f30064b = true;
        this.f30063a.shutdown();
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public boolean mo616h() {
        return this.f30064b;
    }
}
