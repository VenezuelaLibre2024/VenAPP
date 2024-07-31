package pc;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
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
import pc.n;

/* loaded from: classes.dex */
public class n implements d, hd.a {

    /* renamed from: i */
    private static final ee.b<Set<Object>> f23000i = new ee.b() { // from class: pc.k
        @Override // ee.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    private final Map<c<?>, ee.b<?>> f23001a;

    /* renamed from: b */
    private final Map<e0<?>, ee.b<?>> f23002b;

    /* renamed from: c */
    private final Map<e0<?>, x<?>> f23003c;

    /* renamed from: d */
    private final List<ee.b<ComponentRegistrar>> f23004d;

    /* renamed from: e */
    private Set<String> f23005e;

    /* renamed from: f */
    private final u f23006f;

    /* renamed from: g */
    private final AtomicReference<Boolean> f23007g;

    /* renamed from: h */
    private final i f23008h;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final Executor f23009a;

        /* renamed from: b */
        private final List<ee.b<ComponentRegistrar>> f23010b = new ArrayList();

        /* renamed from: c */
        private final List<c<?>> f23011c = new ArrayList();

        /* renamed from: d */
        private i f23012d = i.f22993a;

        b(Executor executor) {
            this.f23009a = executor;
        }

        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> cVar) {
            this.f23011c.add(cVar);
            return this;
        }

        public b c(ComponentRegistrar componentRegistrar) {
            this.f23010b.add(new ee.b() { // from class: pc.o
                public /* synthetic */ o() {
                }

                @Override // ee.b
                public final Object get() {
                    ComponentRegistrar f10;
                    f10 = n.b.f(ComponentRegistrar.this);
                    return f10;
                }
            });
            return this;
        }

        public b d(Collection<ee.b<ComponentRegistrar>> collection) {
            this.f23010b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f23009a, this.f23010b, this.f23011c, this.f23012d);
        }

        public b g(i iVar) {
            this.f23012d = iVar;
            return this;
        }
    }

    private n(Executor executor, Iterable<ee.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, i iVar) {
        this.f23001a = new HashMap();
        this.f23002b = new HashMap();
        this.f23003c = new HashMap();
        this.f23005e = new HashSet();
        this.f23007g = new AtomicReference<>();
        u uVar = new u(executor);
        this.f23006f = uVar;
        this.f23008h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(uVar, u.class, nd.d.class, nd.c.class));
        arrayList.add(c.s(this, hd.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f23004d = p(iterable);
        m(arrayList);
    }

    /* synthetic */ n(Executor executor, Iterable iterable, Collection collection, i iVar, a aVar) {
        this(executor, iterable, collection, iVar);
    }

    public static b l(Executor executor) {
        return new b(executor);
    }

    private void m(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<ee.b<ComponentRegistrar>> it = this.f23004d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f23008h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f23005e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f23005e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f23001a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f23001a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (c<?> cVar : list) {
                this.f23001a.put(cVar, new w(new ee.b() { // from class: pc.j

                    /* renamed from: b */
                    public final /* synthetic */ c f22995b;

                    public /* synthetic */ j(c cVar2) {
                        r2 = cVar2;
                    }

                    @Override // ee.b
                    public final Object get() {
                        Object q10;
                        q10 = n.this.q(r2);
                        return q10;
                    }
                }));
            }
            arrayList.addAll(v(list));
            arrayList.addAll(w());
            u();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        t();
    }

    private void n(Map<c<?>, ee.b<?>> map, boolean z10) {
        for (Map.Entry<c<?>, ee.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            ee.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z10)) {
                value.get();
            }
        }
        this.f23006f.f();
    }

    private static <T> List<T> p(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public /* synthetic */ Object q(c cVar) {
        return cVar.h().a(new f0(cVar, this));
    }

    private void t() {
        Boolean bool = this.f23007g.get();
        if (bool != null) {
            n(this.f23001a, bool.booleanValue());
        }
    }

    private void u() {
        Map map;
        e0<?> c10;
        Object e10;
        for (c<?> cVar : this.f23001a.keySet()) {
            for (q qVar : cVar.g()) {
                if (qVar.g() && !this.f23003c.containsKey(qVar.c())) {
                    map = this.f23003c;
                    c10 = qVar.c();
                    e10 = x.b(Collections.emptySet());
                } else if (this.f23002b.containsKey(qVar.c())) {
                    continue;
                } else {
                    if (qVar.f()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", cVar, qVar.c()));
                    }
                    if (!qVar.g()) {
                        map = this.f23002b;
                        c10 = qVar.c();
                        e10 = c0.e();
                    }
                }
                map.put(c10, e10);
            }
        }
    }

    private List<Runnable> v(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.p()) {
                ee.b<?> bVar = this.f23001a.get(cVar);
                for (e0<? super Object> e0Var : cVar.j()) {
                    if (this.f23002b.containsKey(e0Var)) {
                        arrayList.add(new Runnable() { // from class: pc.l

                            /* renamed from: b */
                            public final /* synthetic */ ee.b f22997b;

                            public /* synthetic */ l(ee.b bVar2) {
                                r2 = bVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                c0.this.j(r2);
                            }
                        });
                    } else {
                        this.f23002b.put(e0Var, bVar2);
                    }
                }
            }
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: pc.m.<init>(pc.x, ee.b):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private java.util.List<java.lang.Runnable> w() {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map<pc.c<?>, ee.b<?>> r2 = r7.f23001a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            pc.c r4 = (pc.c) r4
            boolean r5 = r4.p()
            if (r5 == 0) goto L2d
            goto L14
        L2d:
            java.lang.Object r3 = r3.getValue()
            ee.b r3 = (ee.b) r3
            java.util.Set r4 = r4.j()
            java.util.Iterator r4 = r4.iterator()
        L3b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L14
            java.lang.Object r5 = r4.next()
            pc.e0 r5 = (pc.e0) r5
            boolean r6 = r1.containsKey(r5)
            if (r6 != 0) goto L55
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r1.put(r5, r6)
        L55:
            java.lang.Object r5 = r1.get(r5)
            java.util.Set r5 = (java.util.Set) r5
            r5.add(r3)
            goto L3b
        L5f:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc0
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map<pc.e0<?>, pc.x<?>> r3 = r7.f23003c
            java.lang.Object r4 = r2.getKey()
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L95
            java.util.Map<pc.e0<?>, pc.x<?>> r3 = r7.f23003c
            java.lang.Object r4 = r2.getKey()
            pc.e0 r4 = (pc.e0) r4
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            pc.x r2 = pc.x.b(r2)
            r3.put(r4, r2)
            goto L67
        L95:
            java.util.Map<pc.e0<?>, pc.x<?>> r3 = r7.f23003c
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r3 = r3.get(r4)
            pc.x r3 = (pc.x) r3
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        Lab:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r2.next()
            ee.b r4 = (ee.b) r4
            pc.m r5 = new pc.m
            r5.<init>()
            r0.add(r5)
            goto Lab
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.n.w():java.util.List");
    }

    @Override // pc.d
    public <T> ee.a<T> a(e0<T> e0Var) {
        ee.b<T> b10 = b(e0Var);
        return b10 == null ? c0.e() : b10 instanceof c0 ? (c0) b10 : c0.i(b10);
    }

    @Override // pc.d
    public synchronized <T> ee.b<T> b(e0<T> e0Var) {
        d0.c(e0Var, "Null interface requested.");
        return (ee.b) this.f23002b.get(e0Var);
    }

    @Override // pc.d
    public synchronized <T> ee.b<Set<T>> d(e0<T> e0Var) {
        x<?> xVar = this.f23003c.get(e0Var);
        if (xVar != null) {
            return xVar;
        }
        return (ee.b<Set<T>>) f23000i;
    }

    public void o(boolean z10) {
        HashMap hashMap;
        if (e2.c.a(this.f23007g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f23001a);
            }
            n(hashMap, z10);
        }
    }
}
