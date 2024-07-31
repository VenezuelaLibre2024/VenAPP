package io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p082eb.C7159o;

/* renamed from: io.grpc.internal.e2 */
/* loaded from: classes3.dex */
public final class C8844e2 {

    /* renamed from: d */
    private static final C8844e2 f20387d = new C8844e2(new a());

    /* renamed from: a */
    private final IdentityHashMap<d<?>, c> f20388a = new IdentityHashMap<>();

    /* renamed from: b */
    private final e f20389b;

    /* renamed from: c */
    private ScheduledExecutorService f20390c;

    /* renamed from: io.grpc.internal.e2$a */
    /* loaded from: classes3.dex */
    class a implements e {
        a() {
        }

        @Override // io.grpc.internal.C8844e2.e
        /* renamed from: a */
        public ScheduledExecutorService mo25431a() {
            return Executors.newSingleThreadScheduledExecutor(C8890q0.m25752i("grpc-shared-destroyer-%d", true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.e2$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ c f20391a;

        /* renamed from: b */
        final /* synthetic */ d f20392b;

        /* renamed from: c */
        final /* synthetic */ Object f20393c;

        b(c cVar, d dVar, Object obj) {
            this.f20391a = cVar;
            this.f20392b = dVar;
            this.f20393c = obj;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (C8844e2.this) {
                if (this.f20391a.f20396b == 0) {
                    try {
                        this.f20392b.mo25433b(this.f20393c);
                        C8844e2.this.f20388a.remove(this.f20392b);
                        if (C8844e2.this.f20388a.isEmpty()) {
                            C8844e2.this.f20390c.shutdown();
                            C8844e2.this.f20390c = null;
                        }
                    } catch (Throwable th2) {
                        C8844e2.this.f20388a.remove(this.f20392b);
                        if (C8844e2.this.f20388a.isEmpty()) {
                            C8844e2.this.f20390c.shutdown();
                            C8844e2.this.f20390c = null;
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.e2$c */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        final Object f20395a;

        /* renamed from: b */
        int f20396b;

        /* renamed from: c */
        ScheduledFuture<?> f20397c;

        c(Object obj) {
            this.f20395a = obj;
        }
    }

    /* renamed from: io.grpc.internal.e2$d */
    /* loaded from: classes3.dex */
    public interface d<T> {
        /* renamed from: a */
        T mo25432a();

        /* renamed from: b */
        void mo25433b(T t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.e2$e */
    /* loaded from: classes3.dex */
    public interface e {
        /* renamed from: a */
        ScheduledExecutorService mo25431a();
    }

    C8844e2(e eVar) {
        this.f20389b = eVar;
    }

    /* renamed from: d */
    public static <T> T m25427d(d<T> dVar) {
        return (T) f20387d.m25429e(dVar);
    }

    /* renamed from: f */
    public static <T> T m25428f(d<T> dVar, T t10) {
        return (T) f20387d.m25430g(dVar, t10);
    }

    /* renamed from: e */
    synchronized <T> T m25429e(d<T> dVar) {
        c cVar;
        cVar = this.f20388a.get(dVar);
        if (cVar == null) {
            cVar = new c(dVar.mo25432a());
            this.f20388a.put(dVar, cVar);
        }
        ScheduledFuture<?> scheduledFuture = cVar.f20397c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            cVar.f20397c = null;
        }
        cVar.f20396b++;
        return (T) cVar.f20395a;
    }

    /* renamed from: g */
    synchronized <T> T m25430g(d<T> dVar, T t10) {
        c cVar = this.f20388a.get(dVar);
        if (cVar == null) {
            throw new IllegalArgumentException("No cached instance found for " + dVar);
        }
        C7159o.m21302e(t10 == cVar.f20395a, "Releasing the wrong instance");
        C7159o.m21319v(cVar.f20396b > 0, "Refcount has already reached zero");
        int i10 = cVar.f20396b - 1;
        cVar.f20396b = i10;
        if (i10 == 0) {
            C7159o.m21319v(cVar.f20397c == null, "Destroy task already scheduled");
            if (this.f20390c == null) {
                this.f20390c = this.f20389b.mo25431a();
            }
            cVar.f20397c = this.f20390c.schedule(new RunnableC8835c1(new b(cVar, dVar, t10)), 1L, TimeUnit.SECONDS);
        }
        return null;
    }
}
