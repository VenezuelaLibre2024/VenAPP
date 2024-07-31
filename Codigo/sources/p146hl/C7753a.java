package p146hl;

import androidx.concurrent.futures.C0741b;
import ck.C2037v;
import dk.C7029q;
import dk.C7042z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C9322n;
import p089el.AbstractC7217e0;
import p089el.C7223h0;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10003q;
import p280ok.InterfaceC9998l;
import p494zk.AbstractC13075k;
import p494zk.InterfaceC13041b3;
import p494zk.InterfaceC13044c1;
import p494zk.InterfaceC13083m;

/* renamed from: hl.a */
/* loaded from: classes3.dex */
public class C7753a<R> extends AbstractC13075k implements InterfaceC7754b, InterfaceC13041b3 {

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f18474f = AtomicReferenceFieldUpdater.newUpdater(C7753a.class, Object.class, "state");

    /* renamed from: a */
    private final InterfaceC7587f f18475a;

    /* renamed from: b */
    private List<C7753a<R>.a> f18476b;

    /* renamed from: c */
    private Object f18477c;

    /* renamed from: d */
    private int f18478d;

    /* renamed from: e */
    private Object f18479e;
    private volatile Object state;

    /* renamed from: hl.a$a */
    /* loaded from: classes3.dex */
    public final class a {

        /* renamed from: a */
        public final Object f18480a;

        /* renamed from: b */
        private final Object f18481b;

        /* renamed from: c */
        public final InterfaceC10003q<InterfaceC7754b<?>, Object, Object, InterfaceC9998l<Throwable, C2037v>> f18482c;

        /* renamed from: d */
        public Object f18483d;

        /* renamed from: e */
        public int f18484e;

        /* renamed from: f */
        final /* synthetic */ C7753a<R> f18485f;

        /* renamed from: a */
        public final InterfaceC9998l<Throwable, C2037v> m23662a(InterfaceC7754b<?> interfaceC7754b, Object obj) {
            InterfaceC10003q<InterfaceC7754b<?>, Object, Object, InterfaceC9998l<Throwable, C2037v>> interfaceC10003q = this.f18482c;
            if (interfaceC10003q != null) {
                return interfaceC10003q.mo9756m(interfaceC7754b, this.f18481b, obj);
            }
            return null;
        }

        /* renamed from: b */
        public final void m23663b() {
            Object obj = this.f18483d;
            C7753a<R> c7753a = this.f18485f;
            if (obj instanceof AbstractC7217e0) {
                ((AbstractC7217e0) obj).mo9810o(this.f18484e, null, c7753a.getContext());
                return;
            }
            InterfaceC13044c1 interfaceC13044c1 = obj instanceof InterfaceC13044c1 ? (InterfaceC13044c1) obj : null;
            if (interfaceC13044c1 != null) {
                interfaceC13044c1.dispose();
            }
        }
    }

    /* renamed from: g */
    private final C7753a<R>.a m23656g(Object obj) {
        List<C7753a<R>.a> list = this.f18476b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f18480a == obj) {
                obj2 = next;
                break;
            }
        }
        C7753a<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* renamed from: i */
    private final int m23657i(Object obj, Object obj2) {
        boolean m23671h;
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        List m20572e;
        List m20617S;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18474f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof InterfaceC13083m) {
                C7753a<R>.a m23656g = m23656g(obj);
                if (m23656g == null) {
                    continue;
                } else {
                    InterfaceC9998l<Throwable, C2037v> m23662a = m23656g.m23662a(this, obj2);
                    if (C0741b.m3751a(atomicReferenceFieldUpdater, this, obj3, m23656g)) {
                        this.f18479e = obj2;
                        m23671h = C7755c.m23671h((InterfaceC13083m) obj3, m23662a);
                        if (m23671h) {
                            return 0;
                        }
                        this.f18479e = null;
                        return 2;
                    }
                }
            } else {
                c7223h0 = C7755c.f18488c;
                if (C9322n.m27777a(obj3, c7223h0) ? true : obj3 instanceof a) {
                    return 3;
                }
                c7223h02 = C7755c.f18489d;
                if (C9322n.m27777a(obj3, c7223h02)) {
                    return 2;
                }
                c7223h03 = C7755c.f18487b;
                if (C9322n.m27777a(obj3, c7223h03)) {
                    m20572e = C7029q.m20572e(obj);
                    if (C0741b.m3751a(atomicReferenceFieldUpdater, this, obj3, m20572e)) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    m20617S = C7042z.m20617S((Collection) obj3, obj);
                    if (C0741b.m3751a(atomicReferenceFieldUpdater, this, obj3, m20617S)) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // p146hl.InterfaceC7754b
    /* renamed from: a */
    public void mo23658a(Object obj) {
        this.f18479e = obj;
    }

    @Override // p146hl.InterfaceC7754b
    /* renamed from: c */
    public boolean mo23659c(Object obj, Object obj2) {
        return m23657i(obj, obj2) == 0;
    }

    @Override // p494zk.AbstractC13079l
    /* renamed from: d */
    public void mo23660d(Throwable th2) {
        Object obj;
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18474f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            c7223h0 = C7755c.f18488c;
            if (obj == c7223h0) {
                return;
            } else {
                c7223h02 = C7755c.f18489d;
            }
        } while (!C0741b.m3751a(atomicReferenceFieldUpdater, this, obj, c7223h02));
        List<C7753a<R>.a> list = this.f18476b;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).m23663b();
        }
        c7223h03 = C7755c.f18490e;
        this.f18479e = c7223h03;
        this.f18476b = null;
    }

    @Override // p494zk.InterfaceC13041b3
    /* renamed from: f */
    public void mo9751f(AbstractC7217e0<?> abstractC7217e0, int i10) {
        this.f18477c = abstractC7217e0;
        this.f18478d = i10;
    }

    @Override // p146hl.InterfaceC7754b
    public InterfaceC7587f getContext() {
        return this.f18475a;
    }

    /* renamed from: h */
    public final EnumC7756d m23661h(Object obj, Object obj2) {
        EnumC7756d m23664a;
        m23664a = C7755c.m23664a(m23657i(obj, obj2));
        return m23664a;
    }

    @Override // p280ok.InterfaceC9998l
    public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
        mo23660d(th2);
        return C2037v.f8089a;
    }
}
