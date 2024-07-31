package p494zk;

import androidx.concurrent.futures.C0741b;
import ck.C2020e;
import ck.C2037v;
import hk.C7752d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.InterfaceC9299e;
import kotlin.jvm.internal.C9322n;
import p089el.AbstractC7217e0;
import p089el.C7223h0;
import p089el.C7226j;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC9998l;
import p494zk.InterfaceC13125w1;

/* renamed from: zk.n */
/* loaded from: classes3.dex */
public class C13087n<T> extends AbstractC13128x0<T> implements InterfaceC13083m<T>, InterfaceC9299e, InterfaceC13041b3 {

    /* renamed from: f */
    private static final AtomicIntegerFieldUpdater f35462f = AtomicIntegerFieldUpdater.newUpdater(C13087n.class, "_decisionAndIndex");

    /* renamed from: r */
    private static final AtomicReferenceFieldUpdater f35463r = AtomicReferenceFieldUpdater.newUpdater(C13087n.class, Object.class, "_state");

    /* renamed from: s */
    private static final AtomicReferenceFieldUpdater f35464s = AtomicReferenceFieldUpdater.newUpdater(C13087n.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d */
    private final Continuation<T> f35465d;

    /* renamed from: e */
    private final InterfaceC7587f f35466e;

    /* JADX WARN: Multi-variable type inference failed */
    public C13087n(Continuation<? super T> continuation, int i10) {
        super(i10);
        this.f35465d = continuation;
        this.f35466e = continuation.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C13047d.f35400a;
    }

    /* renamed from: A */
    private final InterfaceC13044c1 m43240A() {
        InterfaceC13125w1 interfaceC13125w1 = (InterfaceC13125w1) getContext().mo20647b(InterfaceC13125w1.f35491q);
        if (interfaceC13125w1 == null) {
            return null;
        }
        InterfaceC13044c1 m43315d = InterfaceC13125w1.a.m43315d(interfaceC13125w1, true, false, new C13103r(this), 2, null);
        C0741b.m3751a(f35464s, this, null, m43315d);
        return m43315d;
    }

    /* renamed from: B */
    private final void m43241B(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35463r;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C13047d)) {
                if (obj2 instanceof AbstractC13075k ? true : obj2 instanceof AbstractC7217e0) {
                    m43244F(obj, obj2);
                } else {
                    boolean z10 = obj2 instanceof C13033a0;
                    if (z10) {
                        C13033a0 c13033a0 = (C13033a0) obj2;
                        if (!c13033a0.m43038b()) {
                            m43244F(obj, obj2);
                        }
                        if (obj2 instanceof C13099q) {
                            if (!z10) {
                                c13033a0 = null;
                            }
                            Throwable th2 = c13033a0 != null ? c13033a0.f35388a : null;
                            if (obj instanceof AbstractC13075k) {
                                m43264m((AbstractC13075k) obj, th2);
                                return;
                            } else {
                                C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                m43252p((AbstractC7217e0) obj, th2);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C13135z) {
                        C13135z c13135z = (C13135z) obj2;
                        if (c13135z.f35498b != null) {
                            m43244F(obj, obj2);
                        }
                        if (obj instanceof AbstractC7217e0) {
                            return;
                        }
                        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC13075k abstractC13075k = (AbstractC13075k) obj;
                        if (c13135z.m43332c()) {
                            m43264m(abstractC13075k, c13135z.f35501e);
                            return;
                        } else {
                            if (C0741b.m3751a(f35463r, this, obj2, C13135z.m43330b(c13135z, null, abstractC13075k, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof AbstractC7217e0) {
                            return;
                        }
                        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (C0741b.m3751a(f35463r, this, obj2, new C13135z(obj2, (AbstractC13075k) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (C0741b.m3751a(f35463r, this, obj2, obj)) {
                return;
            }
        }
    }

    /* renamed from: D */
    private final boolean m43242D() {
        if (C13132y0.m43327c(this.f35494c)) {
            Continuation<T> continuation = this.f35465d;
            C9322n.m27779c(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C7226j) continuation).m21589p()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    private final AbstractC13075k m43243E(InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        return interfaceC9998l instanceof AbstractC13075k ? (AbstractC13075k) interfaceC9998l : new C13113t1(interfaceC9998l);
    }

    /* renamed from: F */
    private final void m43244F(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: K */
    private final void m43245K(Object obj, int i10, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35463r;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC13078k2)) {
                if (obj2 instanceof C13099q) {
                    C13099q c13099q = (C13099q) obj2;
                    if (c13099q.m43286c()) {
                        if (interfaceC9998l != null) {
                            m43265n(interfaceC9998l, c13099q.f35388a);
                            return;
                        }
                        return;
                    }
                }
                m43251j(obj);
                throw new C2020e();
            }
        } while (!C0741b.m3751a(f35463r, this, obj2, m43247M((InterfaceC13078k2) obj2, obj, i10, interfaceC9998l, null)));
        m43254s();
        m43255t(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    static /* synthetic */ void m43246L(C13087n c13087n, Object obj, int i10, InterfaceC9998l interfaceC9998l, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            interfaceC9998l = null;
        }
        c13087n.m43245K(obj, i10, interfaceC9998l);
    }

    /* renamed from: M */
    private final Object m43247M(InterfaceC13078k2 interfaceC13078k2, Object obj, int i10, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l, Object obj2) {
        if (obj instanceof C13033a0) {
            return obj;
        }
        if (!C13132y0.m43326b(i10) && obj2 == null) {
            return obj;
        }
        if (interfaceC9998l == null && !(interfaceC13078k2 instanceof AbstractC13075k) && obj2 == null) {
            return obj;
        }
        return new C13135z(obj, interfaceC13078k2 instanceof AbstractC13075k ? (AbstractC13075k) interfaceC13078k2 : null, interfaceC9998l, obj2, null, 16, null);
    }

    /* renamed from: N */
    private final boolean m43248N() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f35462f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f35462f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    /* renamed from: O */
    private final C7223h0 m43249O(Object obj, Object obj2, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35463r;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC13078k2)) {
                if ((obj3 instanceof C13135z) && obj2 != null && ((C13135z) obj3).f35500d == obj2) {
                    return C13091o.f35469a;
                }
                return null;
            }
        } while (!C0741b.m3751a(f35463r, this, obj3, m43247M((InterfaceC13078k2) obj3, obj, this.f35494c, interfaceC9998l, obj2)));
        m43254s();
        return C13091o.f35469a;
    }

    /* renamed from: P */
    private final boolean m43250P() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f35462f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f35462f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    /* renamed from: j */
    private final Void m43251j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: p */
    private final void m43252p(AbstractC7217e0<?> abstractC7217e0, Throwable th2) {
        int i10 = f35462f.get(this) & 536870911;
        if (!(i10 != 536870911)) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            abstractC7217e0.mo9810o(i10, th2, getContext());
        } catch (Throwable th3) {
            C13072j0.m43220a(getContext(), new C13048d0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    /* renamed from: q */
    private final boolean m43253q(Throwable th2) {
        if (!m43242D()) {
            return false;
        }
        Continuation<T> continuation = this.f35465d;
        C9322n.m27779c(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C7226j) continuation).m21590q(th2);
    }

    /* renamed from: s */
    private final void m43254s() {
        if (m43242D()) {
            return;
        }
        m43266r();
    }

    /* renamed from: t */
    private final void m43255t(int i10) {
        if (m43248N()) {
            return;
        }
        C13132y0.m43325a(this, i10);
    }

    /* renamed from: v */
    private final InterfaceC13044c1 m43256v() {
        return (InterfaceC13044c1) f35464s.get(this);
    }

    /* renamed from: y */
    private final String m43257y() {
        Object m43268x = m43268x();
        return m43268x instanceof InterfaceC13078k2 ? "Active" : m43268x instanceof C13099q ? "Cancelled" : "Completed";
    }

    /* renamed from: C */
    public boolean m43258C() {
        return !(m43268x() instanceof InterfaceC13078k2);
    }

    /* renamed from: G */
    protected String mo43131G() {
        return "CancellableContinuation";
    }

    /* renamed from: H */
    public final void m43259H(Throwable th2) {
        if (m43253q(th2)) {
            return;
        }
        mo24600d(th2);
        m43254s();
    }

    /* renamed from: I */
    public final void m43260I() {
        Throwable m21592s;
        Continuation<T> continuation = this.f35465d;
        C7226j c7226j = continuation instanceof C7226j ? (C7226j) continuation : null;
        if (c7226j == null || (m21592s = c7226j.m21592s(this)) == null) {
            return;
        }
        m43266r();
        mo24600d(m21592s);
    }

    /* renamed from: J */
    public final boolean m43261J() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35463r;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C13135z) && ((C13135z) obj).f35500d != null) {
            m43266r();
            return false;
        }
        f35462f.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C13047d.f35400a);
        return true;
    }

    @Override // p494zk.AbstractC13128x0
    /* renamed from: a */
    public void mo21584a(Object obj, Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35463r;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC13078k2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C13033a0) {
                return;
            }
            if (obj2 instanceof C13135z) {
                C13135z c13135z = (C13135z) obj2;
                if (!(!c13135z.m43332c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (C0741b.m3751a(f35463r, this, obj2, C13135z.m43330b(c13135z, null, null, null, null, th2, 15, null))) {
                    c13135z.m43333d(this, th2);
                    return;
                }
            } else if (C0741b.m3751a(f35463r, this, obj2, new C13135z(obj2, null, null, null, th2, 14, null))) {
                return;
            }
        }
    }

    @Override // p494zk.AbstractC13128x0
    /* renamed from: b */
    public final Continuation<T> mo21585b() {
        return this.f35465d;
    }

    @Override // p494zk.InterfaceC13083m
    /* renamed from: c */
    public void mo24599c(T t10, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        m43245K(t10, this.f35494c, interfaceC9998l);
    }

    @Override // p494zk.InterfaceC13083m
    /* renamed from: d */
    public boolean mo24600d(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35463r;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC13078k2)) {
                return false;
            }
        } while (!C0741b.m3751a(f35463r, this, obj, new C13099q(this, th2, (obj instanceof AbstractC13075k) || (obj instanceof AbstractC7217e0))));
        InterfaceC13078k2 interfaceC13078k2 = (InterfaceC13078k2) obj;
        if (interfaceC13078k2 instanceof AbstractC13075k) {
            m43264m((AbstractC13075k) obj, th2);
        } else if (interfaceC13078k2 instanceof AbstractC7217e0) {
            m43252p((AbstractC7217e0) obj, th2);
        }
        m43254s();
        m43255t(this.f35494c);
        return true;
    }

    @Override // p494zk.AbstractC13128x0
    /* renamed from: e */
    public Throwable mo43262e(Object obj) {
        Throwable mo43262e = super.mo43262e(obj);
        if (mo43262e != null) {
            return mo43262e;
        }
        return null;
    }

    @Override // p494zk.InterfaceC13041b3
    /* renamed from: f */
    public void mo9751f(AbstractC7217e0<?> abstractC7217e0, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f35462f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (!((i11 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        m43241B(abstractC7217e0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p494zk.AbstractC13128x0
    /* renamed from: g */
    public <T> T mo43263g(Object obj) {
        return obj instanceof C13135z ? (T) ((C13135z) obj).f35497a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC9299e
    public InterfaceC9299e getCallerFrame() {
        Continuation<T> continuation = this.f35465d;
        if (continuation instanceof InterfaceC9299e) {
            return (InterfaceC9299e) continuation;
        }
        return null;
    }

    @Override // p124gk.Continuation
    public InterfaceC7587f getContext() {
        return this.f35466e;
    }

    @Override // p494zk.AbstractC13128x0
    /* renamed from: i */
    public Object mo21586i() {
        return m43268x();
    }

    @Override // p494zk.InterfaceC13083m
    /* renamed from: k */
    public void mo24601k(InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        m43241B(m43243E(interfaceC9998l));
    }

    @Override // p494zk.InterfaceC13083m
    /* renamed from: l */
    public Object mo24602l(T t10, Object obj, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        return m43249O(t10, obj, interfaceC9998l);
    }

    /* renamed from: m */
    public final void m43264m(AbstractC13075k abstractC13075k, Throwable th2) {
        try {
            abstractC13075k.mo23660d(th2);
        } catch (Throwable th3) {
            C13072j0.m43220a(getContext(), new C13048d0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    /* renamed from: n */
    public final void m43265n(InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l, Throwable th2) {
        try {
            interfaceC9998l.invoke(th2);
        } catch (Throwable th3) {
            C13072j0.m43220a(getContext(), new C13048d0("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // p494zk.InterfaceC13083m
    /* renamed from: o */
    public void mo24603o(Object obj) {
        m43255t(this.f35494c);
    }

    /* renamed from: r */
    public final void m43266r() {
        InterfaceC13044c1 m43256v = m43256v();
        if (m43256v == null) {
            return;
        }
        m43256v.dispose();
        f35464s.set(this, C13074j2.f35455a);
    }

    @Override // p124gk.Continuation
    public void resumeWith(Object obj) {
        m43246L(this, C13052e0.m43149c(obj, this), this.f35494c, null, 4, null);
    }

    public String toString() {
        return mo43131G() + '(' + C13092o0.m43275c(this.f35465d) + "){" + m43257y() + "}@" + C13092o0.m43274b(this);
    }

    /* renamed from: u */
    public Throwable mo43132u(InterfaceC13125w1 interfaceC13125w1) {
        return interfaceC13125w1.mo43123n();
    }

    /* renamed from: w */
    public final Object m43267w() {
        InterfaceC13125w1 interfaceC13125w1;
        Object m23655c;
        boolean m43242D = m43242D();
        if (m43250P()) {
            if (m43256v() == null) {
                m43240A();
            }
            if (m43242D) {
                m43260I();
            }
            m23655c = C7752d.m23655c();
            return m23655c;
        }
        if (m43242D) {
            m43260I();
        }
        Object m43268x = m43268x();
        if (m43268x instanceof C13033a0) {
            throw ((C13033a0) m43268x).f35388a;
        }
        if (!C13132y0.m43326b(this.f35494c) || (interfaceC13125w1 = (InterfaceC13125w1) getContext().mo20647b(InterfaceC13125w1.f35491q)) == null || interfaceC13125w1.mo43033a()) {
            return mo43263g(m43268x);
        }
        CancellationException mo43123n = interfaceC13125w1.mo43123n();
        mo21584a(m43268x, mo43123n);
        throw mo43123n;
    }

    /* renamed from: x */
    public final Object m43268x() {
        return f35463r.get(this);
    }

    /* renamed from: z */
    public void m43269z() {
        InterfaceC13044c1 m43240A = m43240A();
        if (m43240A != null && m43258C()) {
            m43240A.dispose();
            f35464s.set(this, C13074j2.f35455a);
        }
    }
}
