package androidx.lifecycle;

import androidx.lifecycle.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class l extends f {

    /* renamed from: j, reason: collision with root package name */
    public static final a f4950j = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4951b;

    /* renamed from: c, reason: collision with root package name */
    private l.a<j, b> f4952c;

    /* renamed from: d, reason: collision with root package name */
    private f.b f4953d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference<k> f4954e;

    /* renamed from: f, reason: collision with root package name */
    private int f4955f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4956g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4957h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<f.b> f4958i;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final f.b a(f.b state1, f.b bVar) {
            kotlin.jvm.internal.n.e(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private f.b f4959a;

        /* renamed from: b, reason: collision with root package name */
        private i f4960b;

        public b(j jVar, f.b initialState) {
            kotlin.jvm.internal.n.e(initialState, "initialState");
            kotlin.jvm.internal.n.b(jVar);
            this.f4960b = o.f(jVar);
            this.f4959a = initialState;
        }

        public final void a(k kVar, f.a event) {
            kotlin.jvm.internal.n.e(event, "event");
            f.b i10 = event.i();
            this.f4959a = l.f4950j.a(this.f4959a, i10);
            i iVar = this.f4960b;
            kotlin.jvm.internal.n.b(kVar);
            iVar.onStateChanged(kVar, event);
            this.f4959a = i10;
        }

        public final f.b b() {
            return this.f4959a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(k provider) {
        this(provider, true);
        kotlin.jvm.internal.n.e(provider, "provider");
    }

    private l(k kVar, boolean z10) {
        this.f4951b = z10;
        this.f4952c = new l.a<>();
        this.f4953d = f.b.INITIALIZED;
        this.f4958i = new ArrayList<>();
        this.f4954e = new WeakReference<>(kVar);
    }

    private final void d(k kVar) {
        Iterator<Map.Entry<j, b>> descendingIterator = this.f4952c.descendingIterator();
        kotlin.jvm.internal.n.d(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f4957h) {
            Map.Entry<j, b> next = descendingIterator.next();
            kotlin.jvm.internal.n.d(next, "next()");
            j key = next.getKey();
            b value = next.getValue();
            while (value.b().compareTo(this.f4953d) > 0 && !this.f4957h && this.f4952c.contains(key)) {
                f.a a10 = f.a.Companion.a(value.b());
                if (a10 == null) {
                    throw new IllegalStateException("no event down from " + value.b());
                }
                m(a10.i());
                value.a(kVar, a10);
                l();
            }
        }
    }

    private final f.b e(j jVar) {
        b value;
        Map.Entry<j, b> n10 = this.f4952c.n(jVar);
        f.b bVar = null;
        f.b b10 = (n10 == null || (value = n10.getValue()) == null) ? null : value.b();
        if (!this.f4958i.isEmpty()) {
            bVar = this.f4958i.get(r0.size() - 1);
        }
        a aVar = f4950j;
        return aVar.a(aVar.a(this.f4953d, b10), bVar);
    }

    private final void f(String str) {
        if (!this.f4951b || k.c.h().c()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void g(k kVar) {
        l.b<j, b>.d f10 = this.f4952c.f();
        kotlin.jvm.internal.n.d(f10, "observerMap.iteratorWithAdditions()");
        while (f10.hasNext() && !this.f4957h) {
            Map.Entry next = f10.next();
            j jVar = (j) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.f4953d) < 0 && !this.f4957h && this.f4952c.contains(jVar)) {
                m(bVar.b());
                f.a b10 = f.a.Companion.b(bVar.b());
                if (b10 == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(kVar, b10);
                l();
            }
        }
    }

    private final boolean i() {
        if (this.f4952c.size() == 0) {
            return true;
        }
        Map.Entry<j, b> c10 = this.f4952c.c();
        kotlin.jvm.internal.n.b(c10);
        f.b b10 = c10.getValue().b();
        Map.Entry<j, b> h10 = this.f4952c.h();
        kotlin.jvm.internal.n.b(h10);
        f.b b11 = h10.getValue().b();
        return b10 == b11 && this.f4953d == b11;
    }

    private final void k(f.b bVar) {
        f.b bVar2 = this.f4953d;
        if (bVar2 == bVar) {
            return;
        }
        if (!((bVar2 == f.b.INITIALIZED && bVar == f.b.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f4953d + " in component " + this.f4954e.get()).toString());
        }
        this.f4953d = bVar;
        if (this.f4956g || this.f4955f != 0) {
            this.f4957h = true;
            return;
        }
        this.f4956g = true;
        o();
        this.f4956g = false;
        if (this.f4953d == f.b.DESTROYED) {
            this.f4952c = new l.a<>();
        }
    }

    private final void l() {
        this.f4958i.remove(r0.size() - 1);
    }

    private final void m(f.b bVar) {
        this.f4958i.add(bVar);
    }

    private final void o() {
        k kVar = this.f4954e.get();
        if (kVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean i10 = i();
            this.f4957h = false;
            if (i10) {
                return;
            }
            f.b bVar = this.f4953d;
            Map.Entry<j, b> c10 = this.f4952c.c();
            kotlin.jvm.internal.n.b(c10);
            if (bVar.compareTo(c10.getValue().b()) < 0) {
                d(kVar);
            }
            Map.Entry<j, b> h10 = this.f4952c.h();
            if (!this.f4957h && h10 != null && this.f4953d.compareTo(h10.getValue().b()) > 0) {
                g(kVar);
            }
        }
    }

    @Override // androidx.lifecycle.f
    public void a(j observer) {
        k kVar;
        kotlin.jvm.internal.n.e(observer, "observer");
        f("addObserver");
        f.b bVar = this.f4953d;
        f.b bVar2 = f.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = f.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.f4952c.l(observer, bVar3) == null && (kVar = this.f4954e.get()) != null) {
            boolean z10 = this.f4955f != 0 || this.f4956g;
            f.b e10 = e(observer);
            this.f4955f++;
            while (bVar3.b().compareTo(e10) < 0 && this.f4952c.contains(observer)) {
                m(bVar3.b());
                f.a b10 = f.a.Companion.b(bVar3.b());
                if (b10 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(kVar, b10);
                l();
                e10 = e(observer);
            }
            if (!z10) {
                o();
            }
            this.f4955f--;
        }
    }

    @Override // androidx.lifecycle.f
    public f.b b() {
        return this.f4953d;
    }

    @Override // androidx.lifecycle.f
    public void c(j observer) {
        kotlin.jvm.internal.n.e(observer, "observer");
        f("removeObserver");
        this.f4952c.m(observer);
    }

    public void h(f.a event) {
        kotlin.jvm.internal.n.e(event, "event");
        f("handleLifecycleEvent");
        k(event.i());
    }

    public void j(f.b state) {
        kotlin.jvm.internal.n.e(state, "state");
        f("markState");
        n(state);
    }

    public void n(f.b state) {
        kotlin.jvm.internal.n.e(state, "state");
        f("setCurrentState");
        k(state);
    }
}
