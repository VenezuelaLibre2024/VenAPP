package androidx.lifecycle;

import androidx.lifecycle.AbstractC1300f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p189k.C9095c;
import p208l.C9335a;
import p208l.C9336b;

/* renamed from: androidx.lifecycle.l */
/* loaded from: classes.dex */
public class C1312l extends AbstractC1300f {

    /* renamed from: j */
    public static final a f5704j = new a(null);

    /* renamed from: b */
    private final boolean f5705b;

    /* renamed from: c */
    private C9335a<InterfaceC1308j, b> f5706c;

    /* renamed from: d */
    private AbstractC1300f.b f5707d;

    /* renamed from: e */
    private final WeakReference<InterfaceC1310k> f5708e;

    /* renamed from: f */
    private int f5709f;

    /* renamed from: g */
    private boolean f5710g;

    /* renamed from: h */
    private boolean f5711h;

    /* renamed from: i */
    private ArrayList<AbstractC1300f.b> f5712i;

    /* renamed from: androidx.lifecycle.l$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC1300f.b m7363a(AbstractC1300f.b state1, AbstractC1300f.b bVar) {
            C9322n.m27781e(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }
    }

    /* renamed from: androidx.lifecycle.l$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private AbstractC1300f.b f5713a;

        /* renamed from: b */
        private InterfaceC1306i f5714b;

        public b(InterfaceC1308j interfaceC1308j, AbstractC1300f.b initialState) {
            C9322n.m27781e(initialState, "initialState");
            C9322n.m27778b(interfaceC1308j);
            this.f5714b = C1317o.m7373f(interfaceC1308j);
            this.f5713a = initialState;
        }

        /* renamed from: a */
        public final void m7364a(InterfaceC1310k interfaceC1310k, AbstractC1300f.a event) {
            C9322n.m27781e(event, "event");
            AbstractC1300f.b m7320i = event.m7320i();
            this.f5713a = C1312l.f5704j.m7363a(this.f5713a, m7320i);
            InterfaceC1306i interfaceC1306i = this.f5714b;
            C9322n.m27778b(interfaceC1310k);
            interfaceC1306i.onStateChanged(interfaceC1310k, event);
            this.f5713a = m7320i;
        }

        /* renamed from: b */
        public final AbstractC1300f.b m7365b() {
            return this.f5713a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1312l(InterfaceC1310k provider) {
        this(provider, true);
        C9322n.m27781e(provider, "provider");
    }

    private C1312l(InterfaceC1310k interfaceC1310k, boolean z10) {
        this.f5705b = z10;
        this.f5706c = new C9335a<>();
        this.f5707d = AbstractC1300f.b.INITIALIZED;
        this.f5712i = new ArrayList<>();
        this.f5708e = new WeakReference<>(interfaceC1310k);
    }

    /* renamed from: d */
    private final void m7351d(InterfaceC1310k interfaceC1310k) {
        Iterator<Map.Entry<InterfaceC1308j, b>> descendingIterator = this.f5706c.descendingIterator();
        C9322n.m27780d(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f5711h) {
            Map.Entry<InterfaceC1308j, b> next = descendingIterator.next();
            C9322n.m27780d(next, "next()");
            InterfaceC1308j key = next.getKey();
            b value = next.getValue();
            while (value.m7365b().compareTo(this.f5707d) > 0 && !this.f5711h && this.f5706c.contains(key)) {
                AbstractC1300f.a m7321a = AbstractC1300f.a.Companion.m7321a(value.m7365b());
                if (m7321a == null) {
                    throw new IllegalStateException("no event down from " + value.m7365b());
                }
                m7358m(m7321a.m7320i());
                value.m7364a(interfaceC1310k, m7321a);
                m7357l();
            }
        }
    }

    /* renamed from: e */
    private final AbstractC1300f.b m7352e(InterfaceC1308j interfaceC1308j) {
        b value;
        Map.Entry<InterfaceC1308j, b> m27813n = this.f5706c.m27813n(interfaceC1308j);
        AbstractC1300f.b bVar = null;
        AbstractC1300f.b m7365b = (m27813n == null || (value = m27813n.getValue()) == null) ? null : value.m7365b();
        if (!this.f5712i.isEmpty()) {
            bVar = this.f5712i.get(r0.size() - 1);
        }
        a aVar = f5704j;
        return aVar.m7363a(aVar.m7363a(this.f5707d, m7365b), bVar);
    }

    /* renamed from: f */
    private final void m7353f(String str) {
        if (!this.f5705b || C9095c.m26717h().mo26721c()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    /* renamed from: g */
    private final void m7354g(InterfaceC1310k interfaceC1310k) {
        C9336b<InterfaceC1308j, b>.d m27815f = this.f5706c.m27815f();
        C9322n.m27780d(m27815f, "observerMap.iteratorWithAdditions()");
        while (m27815f.hasNext() && !this.f5711h) {
            Map.Entry next = m27815f.next();
            InterfaceC1308j interfaceC1308j = (InterfaceC1308j) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.m7365b().compareTo(this.f5707d) < 0 && !this.f5711h && this.f5706c.contains(interfaceC1308j)) {
                m7358m(bVar.m7365b());
                AbstractC1300f.a m7322b = AbstractC1300f.a.Companion.m7322b(bVar.m7365b());
                if (m7322b == null) {
                    throw new IllegalStateException("no event up from " + bVar.m7365b());
                }
                bVar.m7364a(interfaceC1310k, m7322b);
                m7357l();
            }
        }
    }

    /* renamed from: i */
    private final boolean m7355i() {
        if (this.f5706c.size() == 0) {
            return true;
        }
        Map.Entry<InterfaceC1308j, b> m27814c = this.f5706c.m27814c();
        C9322n.m27778b(m27814c);
        AbstractC1300f.b m7365b = m27814c.getValue().m7365b();
        Map.Entry<InterfaceC1308j, b> m27816h = this.f5706c.m27816h();
        C9322n.m27778b(m27816h);
        AbstractC1300f.b m7365b2 = m27816h.getValue().m7365b();
        return m7365b == m7365b2 && this.f5707d == m7365b2;
    }

    /* renamed from: k */
    private final void m7356k(AbstractC1300f.b bVar) {
        AbstractC1300f.b bVar2 = this.f5707d;
        if (bVar2 == bVar) {
            return;
        }
        if (!((bVar2 == AbstractC1300f.b.INITIALIZED && bVar == AbstractC1300f.b.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f5707d + " in component " + this.f5708e.get()).toString());
        }
        this.f5707d = bVar;
        if (this.f5710g || this.f5709f != 0) {
            this.f5711h = true;
            return;
        }
        this.f5710g = true;
        m7359o();
        this.f5710g = false;
        if (this.f5707d == AbstractC1300f.b.DESTROYED) {
            this.f5706c = new C9335a<>();
        }
    }

    /* renamed from: l */
    private final void m7357l() {
        this.f5712i.remove(r0.size() - 1);
    }

    /* renamed from: m */
    private final void m7358m(AbstractC1300f.b bVar) {
        this.f5712i.add(bVar);
    }

    /* renamed from: o */
    private final void m7359o() {
        InterfaceC1310k interfaceC1310k = this.f5708e.get();
        if (interfaceC1310k == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean m7355i = m7355i();
            this.f5711h = false;
            if (m7355i) {
                return;
            }
            AbstractC1300f.b bVar = this.f5707d;
            Map.Entry<InterfaceC1308j, b> m27814c = this.f5706c.m27814c();
            C9322n.m27778b(m27814c);
            if (bVar.compareTo(m27814c.getValue().m7365b()) < 0) {
                m7351d(interfaceC1310k);
            }
            Map.Entry<InterfaceC1308j, b> m27816h = this.f5706c.m27816h();
            if (!this.f5711h && m27816h != null && this.f5707d.compareTo(m27816h.getValue().m7365b()) > 0) {
                m7354g(interfaceC1310k);
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC1300f
    /* renamed from: a */
    public void mo7314a(InterfaceC1308j observer) {
        InterfaceC1310k interfaceC1310k;
        C9322n.m27781e(observer, "observer");
        m7353f("addObserver");
        AbstractC1300f.b bVar = this.f5707d;
        AbstractC1300f.b bVar2 = AbstractC1300f.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1300f.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.f5706c.mo27811l(observer, bVar3) == null && (interfaceC1310k = this.f5708e.get()) != null) {
            boolean z10 = this.f5709f != 0 || this.f5710g;
            AbstractC1300f.b m7352e = m7352e(observer);
            this.f5709f++;
            while (bVar3.m7365b().compareTo(m7352e) < 0 && this.f5706c.contains(observer)) {
                m7358m(bVar3.m7365b());
                AbstractC1300f.a m7322b = AbstractC1300f.a.Companion.m7322b(bVar3.m7365b());
                if (m7322b == null) {
                    throw new IllegalStateException("no event up from " + bVar3.m7365b());
                }
                bVar3.m7364a(interfaceC1310k, m7322b);
                m7357l();
                m7352e = m7352e(observer);
            }
            if (!z10) {
                m7359o();
            }
            this.f5709f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1300f
    /* renamed from: b */
    public AbstractC1300f.b mo7315b() {
        return this.f5707d;
    }

    @Override // androidx.lifecycle.AbstractC1300f
    /* renamed from: c */
    public void mo7316c(InterfaceC1308j observer) {
        C9322n.m27781e(observer, "observer");
        m7353f("removeObserver");
        this.f5706c.mo27812m(observer);
    }

    /* renamed from: h */
    public void m7360h(AbstractC1300f.a event) {
        C9322n.m27781e(event, "event");
        m7353f("handleLifecycleEvent");
        m7356k(event.m7320i());
    }

    /* renamed from: j */
    public void m7361j(AbstractC1300f.b state) {
        C9322n.m27781e(state, "state");
        m7353f("markState");
        m7362n(state);
    }

    /* renamed from: n */
    public void m7362n(AbstractC1300f.b state) {
        C9322n.m27781e(state, "state");
        m7353f("setCurrentState");
        m7356k(state);
    }
}
