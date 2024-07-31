package io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: d, reason: collision with root package name */
    private static final e2 f18691d = new e2(new a());

    /* renamed from: a, reason: collision with root package name */
    private final IdentityHashMap<d<?>, c> f18692a = new IdentityHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final e f18693b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f18694c;

    /* loaded from: classes3.dex */
    class a implements e {
        a() {
        }

        @Override // io.grpc.internal.e2.e
        public ScheduledExecutorService a() {
            return Executors.newSingleThreadScheduledExecutor(q0.i("grpc-shared-destroyer-%d", true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f18695a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f18696b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f18697c;

        b(c cVar, d dVar, Object obj) {
            this.f18695a = cVar;
            this.f18696b = dVar;
            this.f18697c = obj;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (e2.this) {
                if (this.f18695a.f18700b == 0) {
                    try {
                        this.f18696b.b(this.f18697c);
                        e2.this.f18692a.remove(this.f18696b);
                        if (e2.this.f18692a.isEmpty()) {
                            e2.this.f18694c.shutdown();
                            e2.this.f18694c = null;
                        }
                    } catch (Throwable th2) {
                        e2.this.f18692a.remove(this.f18696b);
                        if (e2.this.f18692a.isEmpty()) {
                            e2.this.f18694c.shutdown();
                            e2.this.f18694c = null;
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final Object f18699a;

        /* renamed from: b, reason: collision with root package name */
        int f18700b;

        /* renamed from: c, reason: collision with root package name */
        ScheduledFuture<?> f18701c;

        c(Object obj) {
            this.f18699a = obj;
        }
    }

    /* loaded from: classes3.dex */
    public interface d<T> {
        T a();

        void b(T t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface e {
        ScheduledExecutorService a();
    }

    e2(e eVar) {
        this.f18693b = eVar;
    }

    public static <T> T d(d<T> dVar) {
        return (T) f18691d.e(dVar);
    }

    public static <T> T f(d<T> dVar, T t10) {
        return (T) f18691d.g(dVar, t10);
    }

    synchronized <T> T e(d<T> dVar) {
        c cVar;
        cVar = this.f18692a.get(dVar);
        if (cVar == null) {
            cVar = new c(dVar.a());
            this.f18692a.put(dVar, cVar);
        }
        ScheduledFuture<?> scheduledFuture = cVar.f18701c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            cVar.f18701c = null;
        }
        cVar.f18700b++;
        return (T) cVar.f18699a;
    }

    synchronized <T> T g(d<T> dVar, T t10) {
        c cVar = this.f18692a.get(dVar);
        if (cVar == null) {
            throw new IllegalArgumentException("No cached instance found for " + dVar);
        }
        eb.o.e(t10 == cVar.f18699a, "Releasing the wrong instance");
        eb.o.v(cVar.f18700b > 0, "Refcount has already reached zero");
        int i10 = cVar.f18700b - 1;
        cVar.f18700b = i10;
        if (i10 == 0) {
            eb.o.v(cVar.f18701c == null, "Destroy task already scheduled");
            if (this.f18694c == null) {
                this.f18694c = this.f18693b.a();
            }
            cVar.f18701c = this.f18694c.schedule(new c1(new b(cVar, dVar, t10)), 1L, TimeUnit.SECONDS);
        }
        return null;
    }
}
