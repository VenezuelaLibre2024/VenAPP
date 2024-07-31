package p294pc;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p254nd.C9705a;
import p254nd.InterfaceC9706b;
import p254nd.InterfaceC9707c;
import p254nd.InterfaceC9708d;

/* renamed from: pc.u */
/* loaded from: classes.dex */
class C10154u implements InterfaceC9708d, InterfaceC9707c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<InterfaceC9706b<Object>, Executor>> f24958a = new HashMap();

    /* renamed from: b */
    private Queue<C9705a<?>> f24959b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f24960c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10154u(Executor executor) {
        this.f24960c = executor;
    }

    /* renamed from: g */
    private synchronized Set<Map.Entry<InterfaceC9706b<Object>, Executor>> m30364g(C9705a<?> c9705a) {
        ConcurrentHashMap<InterfaceC9706b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f24958a.get(c9705a.m29096b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m30365h(Map.Entry entry, C9705a c9705a) {
        ((InterfaceC9706b) entry.getKey()).mo10159a(c9705a);
    }

    @Override // p254nd.InterfaceC9707c
    /* renamed from: a */
    public void mo29097a(final C9705a<?> c9705a) {
        C10135d0.m30303b(c9705a);
        synchronized (this) {
            Queue<C9705a<?>> queue = this.f24959b;
            if (queue != null) {
                queue.add(c9705a);
                return;
            }
            for (final Map.Entry<InterfaceC9706b<Object>, Executor> entry : m30364g(c9705a)) {
                entry.getValue().execute(new Runnable() { // from class: pc.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10154u.m30365h(entry, c9705a);
                    }
                });
            }
        }
    }

    @Override // p254nd.InterfaceC9708d
    /* renamed from: b */
    public <T> void mo29098b(Class<T> cls, InterfaceC9706b<? super T> interfaceC9706b) {
        mo29100d(cls, this.f24960c, interfaceC9706b);
    }

    @Override // p254nd.InterfaceC9708d
    /* renamed from: c */
    public synchronized <T> void mo29099c(Class<T> cls, InterfaceC9706b<? super T> interfaceC9706b) {
        C10135d0.m30303b(cls);
        C10135d0.m30303b(interfaceC9706b);
        if (this.f24958a.containsKey(cls)) {
            ConcurrentHashMap<InterfaceC9706b<Object>, Executor> concurrentHashMap = this.f24958a.get(cls);
            concurrentHashMap.remove(interfaceC9706b);
            if (concurrentHashMap.isEmpty()) {
                this.f24958a.remove(cls);
            }
        }
    }

    @Override // p254nd.InterfaceC9708d
    /* renamed from: d */
    public synchronized <T> void mo29100d(Class<T> cls, Executor executor, InterfaceC9706b<? super T> interfaceC9706b) {
        C10135d0.m30303b(cls);
        C10135d0.m30303b(interfaceC9706b);
        C10135d0.m30303b(executor);
        if (!this.f24958a.containsKey(cls)) {
            this.f24958a.put(cls, new ConcurrentHashMap<>());
        }
        this.f24958a.get(cls).put(interfaceC9706b, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m30366f() {
        Queue<C9705a<?>> queue;
        synchronized (this) {
            queue = this.f24959b;
            if (queue != null) {
                this.f24959b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<C9705a<?>> it = queue.iterator();
            while (it.hasNext()) {
                mo29097a(it.next());
            }
        }
    }
}
