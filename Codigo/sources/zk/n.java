package zk;

import gk.Continuation;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zk.w1;

/* loaded from: classes3.dex */
public class n<T> extends x0<T> implements m<T>, kotlin.coroutines.jvm.internal.e, b3 {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f32911f = AtomicIntegerFieldUpdater.newUpdater(n.class, "_decisionAndIndex");

    /* renamed from: r, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f32912r = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");

    /* renamed from: s, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f32913s = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    private final Continuation<T> f32914d;

    /* renamed from: e, reason: collision with root package name */
    private final gk.f f32915e;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Continuation<? super T> continuation, int i10) {
        super(i10);
        this.f32914d = continuation;
        this.f32915e = continuation.getContext();
        this._decisionAndIndex = 536870911;
        this._state = d.f32849a;
    }

    private final c1 A() {
        w1 w1Var = (w1) getContext().b(w1.f32940q);
        if (w1Var == null) {
            return null;
        }
        c1 d10 = w1.a.d(w1Var, true, false, new r(this), 2, null);
        androidx.concurrent.futures.b.a(f32913s, this, null, d10);
        return d10;
    }

    private final void B(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32912r;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof d)) {
                if (obj2 instanceof k ? true : obj2 instanceof el.e0) {
                    F(obj, obj2);
                } else {
                    boolean z10 = obj2 instanceof a0;
                    if (z10) {
                        a0 a0Var = (a0) obj2;
                        if (!a0Var.b()) {
                            F(obj, obj2);
                        }
                        if (obj2 instanceof q) {
                            if (!z10) {
                                a0Var = null;
                            }
                            Throwable th2 = a0Var != null ? a0Var.f32837a : null;
                            if (obj instanceof k) {
                                m((k) obj, th2);
                                return;
                            } else {
                                kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                p((el.e0) obj, th2);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof z) {
                        z zVar = (z) obj2;
                        if (zVar.f32947b != null) {
                            F(obj, obj2);
                        }
                        if (obj instanceof el.e0) {
                            return;
                        }
                        kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        k kVar = (k) obj;
                        if (zVar.c()) {
                            m(kVar, zVar.f32950e);
                            return;
                        } else {
                            if (androidx.concurrent.futures.b.a(f32912r, this, obj2, z.b(zVar, null, kVar, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof el.e0) {
                            return;
                        }
                        kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.b.a(f32912r, this, obj2, new z(obj2, (k) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (androidx.concurrent.futures.b.a(f32912r, this, obj2, obj)) {
                return;
            }
        }
    }

    private final boolean D() {
        if (y0.c(this.f32943c)) {
            Continuation<T> continuation = this.f32914d;
            kotlin.jvm.internal.n.c(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((el.j) continuation).p()) {
                return true;
            }
        }
        return false;
    }

    private final k E(ok.l<? super Throwable, ck.v> lVar) {
        return lVar instanceof k ? (k) lVar : new t1(lVar);
    }

    private final void F(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void K(Object obj, int i10, ok.l<? super Throwable, ck.v> lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32912r;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof k2)) {
                if (obj2 instanceof q) {
                    q qVar = (q) obj2;
                    if (qVar.c()) {
                        if (lVar != null) {
                            n(lVar, qVar.f32837a);
                            return;
                        }
                        return;
                    }
                }
                j(obj);
                throw new ck.e();
            }
        } while (!androidx.concurrent.futures.b.a(f32912r, this, obj2, M((k2) obj2, obj, i10, lVar, null)));
        s();
        t(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void L(n nVar, Object obj, int i10, ok.l lVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        nVar.K(obj, i10, lVar);
    }

    private final Object M(k2 k2Var, Object obj, int i10, ok.l<? super Throwable, ck.v> lVar, Object obj2) {
        if (obj instanceof a0) {
            return obj;
        }
        if (!y0.b(i10) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(k2Var instanceof k) && obj2 == null) {
            return obj;
        }
        return new z(obj, k2Var instanceof k ? (k) k2Var : null, lVar, obj2, null, 16, null);
    }

    private final boolean N() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32911f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f32911f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final el.h0 O(Object obj, Object obj2, ok.l<? super Throwable, ck.v> lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32912r;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof k2)) {
                if ((obj3 instanceof z) && obj2 != null && ((z) obj3).f32949d == obj2) {
                    return o.f32918a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f32912r, this, obj3, M((k2) obj3, obj, this.f32943c, lVar, obj2)));
        s();
        return o.f32918a;
    }

    private final boolean P() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32911f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f32911f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void p(el.e0<?> e0Var, Throwable th2) {
        int i10 = f32911f.get(this) & 536870911;
        if (!(i10 != 536870911)) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            e0Var.o(i10, th2, getContext());
        } catch (Throwable th3) {
            j0.a(getContext(), new d0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    private final boolean q(Throwable th2) {
        if (!D()) {
            return false;
        }
        Continuation<T> continuation = this.f32914d;
        kotlin.jvm.internal.n.c(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((el.j) continuation).q(th2);
    }

    private final void s() {
        if (D()) {
            return;
        }
        r();
    }

    private final void t(int i10) {
        if (N()) {
            return;
        }
        y0.a(this, i10);
    }

    private final c1 v() {
        return (c1) f32913s.get(this);
    }

    private final String y() {
        Object x10 = x();
        return x10 instanceof k2 ? "Active" : x10 instanceof q ? "Cancelled" : "Completed";
    }

    public boolean C() {
        return !(x() instanceof k2);
    }

    protected String G() {
        return "CancellableContinuation";
    }

    public final void H(Throwable th2) {
        if (q(th2)) {
            return;
        }
        d(th2);
        s();
    }

    public final void I() {
        Throwable s10;
        Continuation<T> continuation = this.f32914d;
        el.j jVar = continuation instanceof el.j ? (el.j) continuation : null;
        if (jVar == null || (s10 = jVar.s(this)) == null) {
            return;
        }
        r();
        d(s10);
    }

    public final boolean J() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32912r;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof z) && ((z) obj).f32949d != null) {
            r();
            return false;
        }
        f32911f.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, d.f32849a);
        return true;
    }

    @Override // zk.x0
    public void a(Object obj, Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32912r;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof k2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof a0) {
                return;
            }
            if (obj2 instanceof z) {
                z zVar = (z) obj2;
                if (!(!zVar.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.b.a(f32912r, this, obj2, z.b(zVar, null, null, null, null, th2, 15, null))) {
                    zVar.d(this, th2);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f32912r, this, obj2, new z(obj2, null, null, null, th2, 14, null))) {
                return;
            }
        }
    }

    @Override // zk.x0
    public final Continuation<T> b() {
        return this.f32914d;
    }

    @Override // zk.m
    public void c(T t10, ok.l<? super Throwable, ck.v> lVar) {
        K(t10, this.f32943c, lVar);
    }

    @Override // zk.m
    public boolean d(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32912r;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof k2)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f32912r, this, obj, new q(this, th2, (obj instanceof k) || (obj instanceof el.e0))));
        k2 k2Var = (k2) obj;
        if (k2Var instanceof k) {
            m((k) obj, th2);
        } else if (k2Var instanceof el.e0) {
            p((el.e0) obj, th2);
        }
        s();
        t(this.f32943c);
        return true;
    }

    @Override // zk.x0
    public Throwable e(Object obj) {
        Throwable e10 = super.e(obj);
        if (e10 != null) {
            return e10;
        }
        return null;
    }

    @Override // zk.b3
    public void f(el.e0<?> e0Var, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32911f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (!((i11 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        B(e0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zk.x0
    public <T> T g(Object obj) {
        return obj instanceof z ? (T) ((z) obj).f32946a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Continuation<T> continuation = this.f32914d;
        if (continuation instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) continuation;
        }
        return null;
    }

    @Override // gk.Continuation
    public gk.f getContext() {
        return this.f32915e;
    }

    @Override // zk.x0
    public Object i() {
        return x();
    }

    @Override // zk.m
    public void k(ok.l<? super Throwable, ck.v> lVar) {
        B(E(lVar));
    }

    @Override // zk.m
    public Object l(T t10, Object obj, ok.l<? super Throwable, ck.v> lVar) {
        return O(t10, obj, lVar);
    }

    public final void m(k kVar, Throwable th2) {
        try {
            kVar.d(th2);
        } catch (Throwable th3) {
            j0.a(getContext(), new d0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void n(ok.l<? super Throwable, ck.v> lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            j0.a(getContext(), new d0("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // zk.m
    public void o(Object obj) {
        t(this.f32943c);
    }

    public final void r() {
        c1 v10 = v();
        if (v10 == null) {
            return;
        }
        v10.dispose();
        f32913s.set(this, j2.f32904a);
    }

    @Override // gk.Continuation
    public void resumeWith(Object obj) {
        L(this, e0.c(obj, this), this.f32943c, null, 4, null);
    }

    public String toString() {
        return G() + '(' + o0.c(this.f32914d) + "){" + y() + "}@" + o0.b(this);
    }

    public Throwable u(w1 w1Var) {
        return w1Var.n();
    }

    public final Object w() {
        w1 w1Var;
        Object c10;
        boolean D = D();
        if (P()) {
            if (v() == null) {
                A();
            }
            if (D) {
                I();
            }
            c10 = hk.d.c();
            return c10;
        }
        if (D) {
            I();
        }
        Object x10 = x();
        if (x10 instanceof a0) {
            throw ((a0) x10).f32837a;
        }
        if (!y0.b(this.f32943c) || (w1Var = (w1) getContext().b(w1.f32940q)) == null || w1Var.a()) {
            return g(x10);
        }
        CancellationException n10 = w1Var.n();
        a(x10, n10);
        throw n10;
    }

    public final Object x() {
        return f32912r.get(this);
    }

    public void z() {
        c1 A = A();
        if (A != null && C()) {
            A.dispose();
            f32913s.set(this, j2.f32904a);
        }
    }
}
