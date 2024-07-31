package p294pc;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import ee.InterfaceC7182a;
import ee.InterfaceC7183b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p139hd.InterfaceC7713a;
import p254nd.InterfaceC9707c;
import p254nd.InterfaceC9708d;
import p294pc.C10147n;

/* renamed from: pc.n */
/* loaded from: classes.dex */
public class C10147n implements InterfaceC10134d, InterfaceC7713a {

    /* renamed from: i */
    private static final InterfaceC7183b<Set<Object>> f24933i = new InterfaceC7183b() { // from class: pc.k
        @Override // ee.InterfaceC7183b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    private final Map<C10132c<?>, InterfaceC7183b<?>> f24934a;

    /* renamed from: b */
    private final Map<C10137e0<?>, InterfaceC7183b<?>> f24935b;

    /* renamed from: c */
    private final Map<C10137e0<?>, C10157x<?>> f24936c;

    /* renamed from: d */
    private final List<InterfaceC7183b<ComponentRegistrar>> f24937d;

    /* renamed from: e */
    private Set<String> f24938e;

    /* renamed from: f */
    private final C10154u f24939f;

    /* renamed from: g */
    private final AtomicReference<Boolean> f24940g;

    /* renamed from: h */
    private final InterfaceC10142i f24941h;

    /* renamed from: pc.n$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final Executor f24942a;

        /* renamed from: b */
        private final List<InterfaceC7183b<ComponentRegistrar>> f24943b = new ArrayList();

        /* renamed from: c */
        private final List<C10132c<?>> f24944c = new ArrayList();

        /* renamed from: d */
        private InterfaceC10142i f24945d = InterfaceC10142i.f24926a;

        b(Executor executor) {
            this.f24942a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ ComponentRegistrar m30332f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* renamed from: b */
        public b m30333b(C10132c<?> c10132c) {
            this.f24944c.add(c10132c);
            return this;
        }

        /* renamed from: c */
        public b m30334c(final ComponentRegistrar componentRegistrar) {
            this.f24943b.add(new InterfaceC7183b() { // from class: pc.o
                @Override // ee.InterfaceC7183b
                public final Object get() {
                    ComponentRegistrar m30332f;
                    m30332f = C10147n.b.m30332f(ComponentRegistrar.this);
                    return m30332f;
                }
            });
            return this;
        }

        /* renamed from: d */
        public b m30335d(Collection<InterfaceC7183b<ComponentRegistrar>> collection) {
            this.f24943b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C10147n m30336e() {
            return new C10147n(this.f24942a, this.f24943b, this.f24944c, this.f24945d);
        }

        /* renamed from: g */
        public b m30337g(InterfaceC10142i interfaceC10142i) {
            this.f24945d = interfaceC10142i;
            return this;
        }
    }

    private C10147n(Executor executor, Iterable<InterfaceC7183b<ComponentRegistrar>> iterable, Collection<C10132c<?>> collection, InterfaceC10142i interfaceC10142i) {
        this.f24934a = new HashMap();
        this.f24935b = new HashMap();
        this.f24936c = new HashMap();
        this.f24938e = new HashSet();
        this.f24940g = new AtomicReference<>();
        C10154u c10154u = new C10154u(executor);
        this.f24939f = c10154u;
        this.f24941h = interfaceC10142i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C10132c.m30265s(c10154u, C10154u.class, InterfaceC9708d.class, InterfaceC9707c.class));
        arrayList.add(C10132c.m30265s(this, InterfaceC7713a.class, new Class[0]));
        for (C10132c<?> c10132c : collection) {
            if (c10132c != null) {
                arrayList.add(c10132c);
            }
        }
        this.f24937d = m30322p(iterable);
        m30320m(arrayList);
    }

    /* renamed from: l */
    public static b m30319l(Executor executor) {
        return new b(executor);
    }

    /* renamed from: m */
    private void m30320m(List<C10132c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<InterfaceC7183b<ComponentRegistrar>> it = this.f24937d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f24941h.mo26557a(componentRegistrar));
                        it.remove();
                    }
                } catch (C10155v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<C10132c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().m30269j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f24938e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f24938e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f24934a.isEmpty()) {
                C10149p.m30338a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f24934a.keySet());
                arrayList2.addAll(list);
                C10149p.m30338a(arrayList2);
            }
            for (final C10132c<?> c10132c : list) {
                this.f24934a.put(c10132c, new C10156w(new InterfaceC7183b() { // from class: pc.j
                    @Override // ee.InterfaceC7183b
                    public final Object get() {
                        Object m30323q;
                        m30323q = C10147n.this.m30323q(c10132c);
                        return m30323q;
                    }
                }));
            }
            arrayList.addAll(m30328v(list));
            arrayList.addAll(m30329w());
            m30327u();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        m30326t();
    }

    /* renamed from: n */
    private void m30321n(Map<C10132c<?>, InterfaceC7183b<?>> map, boolean z10) {
        for (Map.Entry<C10132c<?>, InterfaceC7183b<?>> entry : map.entrySet()) {
            C10132c<?> key = entry.getKey();
            InterfaceC7183b<?> value = entry.getValue();
            if (key.m30271n() || (key.m30272o() && z10)) {
                value.get();
            }
        }
        this.f24939f.m30366f();
    }

    /* renamed from: p */
    private static <T> List<T> m30322p(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m30323q(C10132c c10132c) {
        return c10132c.m30267h().mo9329a(new C10139f0(c10132c, this));
    }

    /* renamed from: t */
    private void m30326t() {
        Boolean bool = this.f24940g.get();
        if (bool != null) {
            m30321n(this.f24934a, bool.booleanValue());
        }
    }

    /* renamed from: u */
    private void m30327u() {
        Map map;
        C10137e0<?> m30358c;
        Object m30288e;
        for (C10132c<?> c10132c : this.f24934a.keySet()) {
            for (C10150q c10150q : c10132c.m30266g()) {
                if (c10150q.m30362g() && !this.f24936c.containsKey(c10150q.m30358c())) {
                    map = this.f24936c;
                    m30358c = c10150q.m30358c();
                    m30288e = C10157x.m30367b(Collections.emptySet());
                } else if (this.f24935b.containsKey(c10150q.m30358c())) {
                    continue;
                } else {
                    if (c10150q.m30361f()) {
                        throw new C10158y(String.format("Unsatisfied dependency for component %s: %s", c10132c, c10150q.m30358c()));
                    }
                    if (!c10150q.m30362g()) {
                        map = this.f24935b;
                        m30358c = c10150q.m30358c();
                        m30288e = C10133c0.m30288e();
                    }
                }
                map.put(m30358c, m30288e);
            }
        }
    }

    /* renamed from: v */
    private List<Runnable> m30328v(List<C10132c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C10132c<?> c10132c : list) {
            if (c10132c.m30273p()) {
                final InterfaceC7183b<?> interfaceC7183b = this.f24934a.get(c10132c);
                for (C10137e0<? super Object> c10137e0 : c10132c.m30269j()) {
                    if (this.f24935b.containsKey(c10137e0)) {
                        final C10133c0 c10133c0 = (C10133c0) this.f24935b.get(c10137e0);
                        arrayList.add(new Runnable() { // from class: pc.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                C10133c0.this.m30293j(interfaceC7183b);
                            }
                        });
                    } else {
                        this.f24935b.put(c10137e0, interfaceC7183b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    private List<Runnable> m30329w() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C10132c<?>, InterfaceC7183b<?>> entry : this.f24934a.entrySet()) {
            C10132c<?> key = entry.getKey();
            if (!key.m30273p()) {
                InterfaceC7183b<?> value = entry.getValue();
                for (C10137e0<? super Object> c10137e0 : key.m30269j()) {
                    if (!hashMap.containsKey(c10137e0)) {
                        hashMap.put(c10137e0, new HashSet());
                    }
                    ((Set) hashMap.get(c10137e0)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f24936c.containsKey(entry2.getKey())) {
                final C10157x<?> c10157x = this.f24936c.get(entry2.getKey());
                for (final InterfaceC7183b interfaceC7183b : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: pc.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C10157x.this.m30369a(interfaceC7183b);
                        }
                    });
                }
            } else {
                this.f24936c.put((C10137e0) entry2.getKey(), C10157x.m30367b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // p294pc.InterfaceC10134d
    /* renamed from: a */
    public <T> InterfaceC7182a<T> mo30294a(C10137e0<T> c10137e0) {
        InterfaceC7183b<T> mo30295b = mo30295b(c10137e0);
        return mo30295b == null ? C10133c0.m30288e() : mo30295b instanceof C10133c0 ? (C10133c0) mo30295b : C10133c0.m30292i(mo30295b);
    }

    @Override // p294pc.InterfaceC10134d
    /* renamed from: b */
    public synchronized <T> InterfaceC7183b<T> mo30295b(C10137e0<T> c10137e0) {
        C10135d0.m30304c(c10137e0, "Null interface requested.");
        return (InterfaceC7183b) this.f24935b.get(c10137e0);
    }

    @Override // p294pc.InterfaceC10134d
    /* renamed from: d */
    public synchronized <T> InterfaceC7183b<Set<T>> mo30297d(C10137e0<T> c10137e0) {
        C10157x<?> c10157x = this.f24936c.get(c10137e0);
        if (c10157x != null) {
            return c10157x;
        }
        return (InterfaceC7183b<Set<T>>) f24933i;
    }

    /* renamed from: o */
    public void m30330o(boolean z10) {
        HashMap hashMap;
        if (C7099c.m20926a(this.f24940g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f24934a);
            }
            m30321n(hashMap, z10);
        }
    }
}
