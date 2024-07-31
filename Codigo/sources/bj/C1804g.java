package bj;

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
import p082eb.C7153i;
import p082eb.C7155k;
import p082eb.C7159o;
import vi.AbstractC11939p0;
import vi.C11895a;
import vi.C11915g1;
import vi.C11940q;
import vi.C11954x;
import vi.EnumC11938p;

/* renamed from: bj.g */
/* loaded from: classes3.dex */
final class C1804g extends AbstractC11939p0 {

    /* renamed from: h */
    static final C11895a.c<d<C11940q>> f7653h = C11895a.c.m38054a("state-info");

    /* renamed from: i */
    private static final C11915g1 f7654i = C11915g1.f31534f.m38147r("no subchannels ready");

    /* renamed from: c */
    private final AbstractC11939p0.d f7655c;

    /* renamed from: f */
    private EnumC11938p f7658f;

    /* renamed from: d */
    private final Map<C11954x, AbstractC11939p0.h> f7656d = new HashMap();

    /* renamed from: g */
    private e f7659g = new b(f7654i);

    /* renamed from: e */
    private final Random f7657e = new Random();

    /* renamed from: bj.g$a */
    /* loaded from: classes3.dex */
    class a implements AbstractC11939p0.j {

        /* renamed from: a */
        final /* synthetic */ AbstractC11939p0.h f7660a;

        a(AbstractC11939p0.h hVar) {
            this.f7660a = hVar;
        }

        @Override // vi.AbstractC11939p0.j
        /* renamed from: a */
        public void mo9644a(C11940q c11940q) {
            C1804g.this.m9657k(this.f7660a, c11940q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bj.g$b */
    /* loaded from: classes3.dex */
    public static final class b extends e {

        /* renamed from: a */
        private final C11915g1 f7662a;

        b(C11915g1 c11915g1) {
            super(null);
            this.f7662a = (C11915g1) C7159o.m21313p(c11915g1, "status");
        }

        @Override // vi.AbstractC11939p0.i
        /* renamed from: a */
        public AbstractC11939p0.e mo9576a(AbstractC11939p0.f fVar) {
            return this.f7662a.m38145p() ? AbstractC11939p0.e.m38220g() : AbstractC11939p0.e.m38219f(this.f7662a);
        }

        @Override // bj.C1804g.e
        /* renamed from: b */
        boolean mo9665b(e eVar) {
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                if (C7155k.m21289a(this.f7662a, bVar.f7662a) || (this.f7662a.m38145p() && bVar.f7662a.m38145p())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return C7153i.m21273b(b.class).m21284d("status", this.f7662a).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bj.g$c */
    /* loaded from: classes3.dex */
    public static final class c extends e {

        /* renamed from: c */
        private static final AtomicIntegerFieldUpdater<c> f7663c = AtomicIntegerFieldUpdater.newUpdater(c.class, "b");

        /* renamed from: a */
        private final List<AbstractC11939p0.h> f7664a;

        /* renamed from: b */
        private volatile int f7665b;

        c(List<AbstractC11939p0.h> list, int i10) {
            super(null);
            C7159o.m21302e(!list.isEmpty(), "empty list");
            this.f7664a = list;
            this.f7665b = i10 - 1;
        }

        /* renamed from: c */
        private AbstractC11939p0.h m9666c() {
            int size = this.f7664a.size();
            AtomicIntegerFieldUpdater<c> atomicIntegerFieldUpdater = f7663c;
            int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int i10 = incrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i10);
                incrementAndGet = i10;
            }
            return this.f7664a.get(incrementAndGet);
        }

        @Override // vi.AbstractC11939p0.i
        /* renamed from: a */
        public AbstractC11939p0.e mo9576a(AbstractC11939p0.f fVar) {
            return AbstractC11939p0.e.m38221h(m9666c());
        }

        @Override // bj.C1804g.e
        /* renamed from: b */
        boolean mo9665b(e eVar) {
            if (!(eVar instanceof c)) {
                return false;
            }
            c cVar = (c) eVar;
            return cVar == this || (this.f7664a.size() == cVar.f7664a.size() && new HashSet(this.f7664a).containsAll(cVar.f7664a));
        }

        public String toString() {
            return C7153i.m21273b(c.class).m21284d("list", this.f7664a).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bj.g$d */
    /* loaded from: classes3.dex */
    public static final class d<T> {

        /* renamed from: a */
        T f7666a;

        d(T t10) {
            this.f7666a = t10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bj.g$e */
    /* loaded from: classes3.dex */
    public static abstract class e extends AbstractC11939p0.i {
        private e() {
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        /* renamed from: b */
        abstract boolean mo9665b(e eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1804g(AbstractC11939p0.d dVar) {
        this.f7655c = (AbstractC11939p0.d) C7159o.m21313p(dVar, "helper");
    }

    /* renamed from: g */
    private static List<AbstractC11939p0.h> m9654g(Collection<AbstractC11939p0.h> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (AbstractC11939p0.h hVar : collection) {
            if (m9656j(hVar)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static d<C11940q> m9655h(AbstractC11939p0.h hVar) {
        return (d) C7159o.m21313p((d) hVar.mo9637c().m38048b(f7653h), "STATE_INFO");
    }

    /* renamed from: j */
    static boolean m9656j(AbstractC11939p0.h hVar) {
        return m9655h(hVar).f7666a.m38239c() == EnumC11938p.READY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public void m9657k(AbstractC11939p0.h hVar, C11940q c11940q) {
        if (this.f7656d.get(m9661o(hVar.m38236a())) != hVar) {
            return;
        }
        EnumC11938p m38239c = c11940q.m38239c();
        EnumC11938p enumC11938p = EnumC11938p.TRANSIENT_FAILURE;
        if (m38239c == enumC11938p || c11940q.m38239c() == EnumC11938p.IDLE) {
            this.f7655c.mo9556e();
        }
        EnumC11938p m38239c2 = c11940q.m38239c();
        EnumC11938p enumC11938p2 = EnumC11938p.IDLE;
        if (m38239c2 == enumC11938p2) {
            hVar.mo9560e();
        }
        d<C11940q> m9655h = m9655h(hVar);
        if (m9655h.f7666a.m38239c().equals(enumC11938p) && (c11940q.m38239c().equals(EnumC11938p.CONNECTING) || c11940q.m38239c().equals(enumC11938p2))) {
            return;
        }
        m9655h.f7666a = c11940q;
        m9662p();
    }

    /* renamed from: l */
    private static <T> Set<T> m9658l(Set<T> set, Set<T> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [vi.q, T] */
    /* renamed from: m */
    private void m9659m(AbstractC11939p0.h hVar) {
        hVar.mo9561f();
        m9655h(hVar).f7666a = C11940q.m38237a(EnumC11938p.SHUTDOWN);
    }

    /* renamed from: n */
    private static Map<C11954x, C11954x> m9660n(List<C11954x> list) {
        HashMap hashMap = new HashMap(list.size() * 2);
        for (C11954x c11954x : list) {
            hashMap.put(m9661o(c11954x), c11954x);
        }
        return hashMap;
    }

    /* renamed from: o */
    private static C11954x m9661o(C11954x c11954x) {
        return new C11954x(c11954x.m38335a());
    }

    /* renamed from: p */
    private void m9662p() {
        List<AbstractC11939p0.h> m9654g = m9654g(m9664i());
        if (!m9654g.isEmpty()) {
            m9663q(EnumC11938p.READY, new c(m9654g, this.f7657e.nextInt(m9654g.size())));
            return;
        }
        C11915g1 c11915g1 = f7654i;
        Iterator<AbstractC11939p0.h> it = m9664i().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            C11940q c11940q = m9655h(it.next()).f7666a;
            if (c11940q.m38239c() == EnumC11938p.CONNECTING || c11940q.m38239c() == EnumC11938p.IDLE) {
                z10 = true;
            }
            if (c11915g1 == f7654i || !c11915g1.m38145p()) {
                c11915g1 = c11940q.m38240d();
            }
        }
        m9663q(z10 ? EnumC11938p.CONNECTING : EnumC11938p.TRANSIENT_FAILURE, new b(c11915g1));
    }

    /* renamed from: q */
    private void m9663q(EnumC11938p enumC11938p, e eVar) {
        if (enumC11938p == this.f7658f && eVar.mo9665b(this.f7659g)) {
            return;
        }
        this.f7655c.mo9577f(enumC11938p, eVar);
        this.f7658f = enumC11938p;
        this.f7659g = eVar;
    }

    @Override // vi.AbstractC11939p0
    /* renamed from: a */
    public boolean mo9586a(AbstractC11939p0.g gVar) {
        if (gVar.m38228a().isEmpty()) {
            mo9549c(C11915g1.f31549u.m38147r("NameResolver returned no usable address. addrs=" + gVar.m38228a() + ", attrs=" + gVar.m38229b()));
            return false;
        }
        List<C11954x> m38228a = gVar.m38228a();
        Set<C11954x> keySet = this.f7656d.keySet();
        Map<C11954x, C11954x> m9660n = m9660n(m38228a);
        Set m9658l = m9658l(keySet, m9660n.keySet());
        for (Map.Entry<C11954x, C11954x> entry : m9660n.entrySet()) {
            C11954x key = entry.getKey();
            C11954x value = entry.getValue();
            AbstractC11939p0.h hVar = this.f7656d.get(key);
            if (hVar != null) {
                hVar.mo9638h(Collections.singletonList(value));
            } else {
                AbstractC11939p0.h hVar2 = (AbstractC11939p0.h) C7159o.m21313p(this.f7655c.mo9552a(AbstractC11939p0.b.m38208c().m38216e(value).m38217f(C11895a.m38047c().m38053d(f7653h, new d(C11940q.m38237a(EnumC11938p.IDLE))).m38051a()).m38214b()), "subchannel");
                hVar2.mo9562g(new a(hVar2));
                this.f7656d.put(key, hVar2);
                hVar2.mo9560e();
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = m9658l.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f7656d.remove((C11954x) it.next()));
        }
        m9662p();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m9659m((AbstractC11939p0.h) it2.next());
        }
        return true;
    }

    @Override // vi.AbstractC11939p0
    /* renamed from: c */
    public void mo9549c(C11915g1 c11915g1) {
        if (this.f7658f != EnumC11938p.READY) {
            m9663q(EnumC11938p.TRANSIENT_FAILURE, new b(c11915g1));
        }
    }

    @Override // vi.AbstractC11939p0
    /* renamed from: e */
    public void mo9574e() {
        Iterator<AbstractC11939p0.h> it = m9664i().iterator();
        while (it.hasNext()) {
            m9659m(it.next());
        }
        this.f7656d.clear();
    }

    /* renamed from: i */
    Collection<AbstractC11939p0.h> m9664i() {
        return this.f7656d.values();
    }
}
