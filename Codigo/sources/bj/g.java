package bj;

import eb.i;
import eb.k;
import eb.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import vi.a;
import vi.g1;
import vi.p;
import vi.p0;
import vi.q;
import vi.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g extends p0 {

    /* renamed from: h */
    static final a.c<d<q>> f6704h = a.c.a("state-info");

    /* renamed from: i */
    private static final g1 f6705i = g1.f29100f.r("no subchannels ready");

    /* renamed from: c */
    private final p0.d f6706c;

    /* renamed from: f */
    private p f6709f;

    /* renamed from: d */
    private final Map<x, p0.h> f6707d = new HashMap();

    /* renamed from: g */
    private e f6710g = new b(f6705i);

    /* renamed from: e */
    private final Random f6708e = new Random();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements p0.j {

        /* renamed from: a */
        final /* synthetic */ p0.h f6711a;

        a(p0.h hVar) {
            this.f6711a = hVar;
        }

        @Override // vi.p0.j
        public void a(q qVar) {
            g.this.k(this.f6711a, qVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends e {

        /* renamed from: a */
        private final g1 f6713a;

        b(g1 g1Var) {
            super(null);
            this.f6713a = (g1) o.p(g1Var, "status");
        }

        @Override // vi.p0.i
        public p0.e a(p0.f fVar) {
            return this.f6713a.p() ? p0.e.g() : p0.e.f(this.f6713a);
        }

        @Override // bj.g.e
        boolean b(e eVar) {
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                if (k.a(this.f6713a, bVar.f6713a) || (this.f6713a.p() && bVar.f6713a.p())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return i.b(b.class).d("status", this.f6713a).toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends e {

        /* renamed from: c */
        private static final AtomicIntegerFieldUpdater<c> f6714c = AtomicIntegerFieldUpdater.newUpdater(c.class, "b");

        /* renamed from: a */
        private final List<p0.h> f6715a;

        /* renamed from: b */
        private volatile int f6716b;

        c(List<p0.h> list, int i10) {
            super(null);
            o.e(!list.isEmpty(), "empty list");
            this.f6715a = list;
            this.f6716b = i10 - 1;
        }

        private p0.h c() {
            int size = this.f6715a.size();
            AtomicIntegerFieldUpdater<c> atomicIntegerFieldUpdater = f6714c;
            int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int i10 = incrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i10);
                incrementAndGet = i10;
            }
            return this.f6715a.get(incrementAndGet);
        }

        @Override // vi.p0.i
        public p0.e a(p0.f fVar) {
            return p0.e.h(c());
        }

        @Override // bj.g.e
        boolean b(e eVar) {
            if (!(eVar instanceof c)) {
                return false;
            }
            c cVar = (c) eVar;
            return cVar == this || (this.f6715a.size() == cVar.f6715a.size() && new HashSet(this.f6715a).containsAll(cVar.f6715a));
        }

        public String toString() {
            return i.b(c.class).d("list", this.f6715a).toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d<T> {

        /* renamed from: a */
        T f6717a;

        d(T t10) {
            this.f6717a = t10;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class e extends p0.i {
        private e() {
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        abstract boolean b(e eVar);
    }

    public g(p0.d dVar) {
        this.f6706c = (p0.d) o.p(dVar, "helper");
    }

    private static List<p0.h> g(Collection<p0.h> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (p0.h hVar : collection) {
            if (j(hVar)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    private static d<q> h(p0.h hVar) {
        return (d) o.p((d) hVar.c().b(f6704h), "STATE_INFO");
    }

    static boolean j(p0.h hVar) {
        return h(hVar).f6717a.c() == p.READY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(p0.h hVar, q qVar) {
        if (this.f6707d.get(o(hVar.a())) != hVar) {
            return;
        }
        p c10 = qVar.c();
        p pVar = p.TRANSIENT_FAILURE;
        if (c10 == pVar || qVar.c() == p.IDLE) {
            this.f6706c.e();
        }
        p c11 = qVar.c();
        p pVar2 = p.IDLE;
        if (c11 == pVar2) {
            hVar.e();
        }
        d<q> h10 = h(hVar);
        if (h10.f6717a.c().equals(pVar) && (qVar.c().equals(p.CONNECTING) || qVar.c().equals(pVar2))) {
            return;
        }
        h10.f6717a = qVar;
        p();
    }

    private static <T> Set<T> l(Set<T> set, Set<T> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [vi.q, T] */
    private void m(p0.h hVar) {
        hVar.f();
        h(hVar).f6717a = q.a(p.SHUTDOWN);
    }

    private static Map<x, x> n(List<x> list) {
        HashMap hashMap = new HashMap(list.size() * 2);
        for (x xVar : list) {
            hashMap.put(o(xVar), xVar);
        }
        return hashMap;
    }

    private static x o(x xVar) {
        return new x(xVar.a());
    }

    private void p() {
        List<p0.h> g10 = g(i());
        if (!g10.isEmpty()) {
            q(p.READY, new c(g10, this.f6708e.nextInt(g10.size())));
            return;
        }
        g1 g1Var = f6705i;
        Iterator<p0.h> it = i().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            q qVar = h(it.next()).f6717a;
            if (qVar.c() == p.CONNECTING || qVar.c() == p.IDLE) {
                z10 = true;
            }
            if (g1Var == f6705i || !g1Var.p()) {
                g1Var = qVar.d();
            }
        }
        q(z10 ? p.CONNECTING : p.TRANSIENT_FAILURE, new b(g1Var));
    }

    private void q(p pVar, e eVar) {
        if (pVar == this.f6709f && eVar.b(this.f6710g)) {
            return;
        }
        this.f6706c.f(pVar, eVar);
        this.f6709f = pVar;
        this.f6710g = eVar;
    }

    @Override // vi.p0
    public boolean a(p0.g gVar) {
        if (gVar.a().isEmpty()) {
            c(g1.f29115u.r("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
            return false;
        }
        List<x> a10 = gVar.a();
        Set<x> keySet = this.f6707d.keySet();
        Map<x, x> n10 = n(a10);
        Set l10 = l(keySet, n10.keySet());
        for (Map.Entry<x, x> entry : n10.entrySet()) {
            x key = entry.getKey();
            x value = entry.getValue();
            p0.h hVar = this.f6707d.get(key);
            if (hVar != null) {
                hVar.h(Collections.singletonList(value));
            } else {
                p0.h hVar2 = (p0.h) o.p(this.f6706c.a(p0.b.c().e(value).f(vi.a.c().d(f6704h, new d(q.a(p.IDLE))).a()).b()), "subchannel");
                hVar2.g(new a(hVar2));
                this.f6707d.put(key, hVar2);
                hVar2.e();
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = l10.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f6707d.remove((x) it.next()));
        }
        p();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m((p0.h) it2.next());
        }
        return true;
    }

    @Override // vi.p0
    public void c(g1 g1Var) {
        if (this.f6709f != p.READY) {
            q(p.TRANSIENT_FAILURE, new b(g1Var));
        }
    }

    @Override // vi.p0
    public void e() {
        Iterator<p0.h> it = i().iterator();
        while (it.hasNext()) {
            m(it.next());
        }
        this.f6707d.clear();
    }

    Collection<p0.h> i() {
        return this.f6707d.values();
    }
}
