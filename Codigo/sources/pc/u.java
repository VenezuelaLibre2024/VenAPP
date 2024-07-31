package pc;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class u implements nd.d, nd.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<nd.b<Object>, Executor>> f23025a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue<nd.a<?>> f23026b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f23027c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(Executor executor) {
        this.f23027c = executor;
    }

    private synchronized Set<Map.Entry<nd.b<Object>, Executor>> g(nd.a<?> aVar) {
        ConcurrentHashMap<nd.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f23025a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Map.Entry entry, nd.a aVar) {
        ((nd.b) entry.getKey()).a(aVar);
    }

    @Override // nd.c
    public void a(final nd.a<?> aVar) {
        d0.b(aVar);
        synchronized (this) {
            Queue<nd.a<?>> queue = this.f23026b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<nd.b<Object>, Executor> entry : g(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: pc.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.h(entry, aVar);
                    }
                });
            }
        }
    }

    @Override // nd.d
    public <T> void b(Class<T> cls, nd.b<? super T> bVar) {
        d(cls, this.f23027c, bVar);
    }

    @Override // nd.d
    public synchronized <T> void c(Class<T> cls, nd.b<? super T> bVar) {
        d0.b(cls);
        d0.b(bVar);
        if (this.f23025a.containsKey(cls)) {
            ConcurrentHashMap<nd.b<Object>, Executor> concurrentHashMap = this.f23025a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f23025a.remove(cls);
            }
        }
    }

    @Override // nd.d
    public synchronized <T> void d(Class<T> cls, Executor executor, nd.b<? super T> bVar) {
        d0.b(cls);
        d0.b(bVar);
        d0.b(executor);
        if (!this.f23025a.containsKey(cls)) {
            this.f23025a.put(cls, new ConcurrentHashMap<>());
        }
        this.f23025a.get(cls).put(bVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        Queue<nd.a<?>> queue;
        synchronized (this) {
            queue = this.f23026b;
            if (queue != null) {
                this.f23026b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<nd.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }
}
