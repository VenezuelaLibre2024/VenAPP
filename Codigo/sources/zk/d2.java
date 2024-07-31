package zk;

import el.s;
import gk.Continuation;
import gk.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zk.w1;

/* loaded from: classes3.dex */
public class d2 implements w1, u, l2 {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f32851a = AtomicReferenceFieldUpdater.newUpdater(d2.class, Object.class, "_state");

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f32852b = AtomicReferenceFieldUpdater.newUpdater(d2.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* loaded from: classes3.dex */
    public static final class a<T> extends n<T> {

        /* renamed from: t */
        private final d2 f32853t;

        public a(Continuation<? super T> continuation, d2 d2Var) {
            super(continuation, 1);
            this.f32853t = d2Var;
        }

        @Override // zk.n
        protected String G() {
            return "AwaitContinuation";
        }

        @Override // zk.n
        public Throwable u(w1 w1Var) {
            Throwable f10;
            Object Y = this.f32853t.Y();
            return (!(Y instanceof c) || (f10 = ((c) Y).f()) == null) ? Y instanceof a0 ? ((a0) Y).f32837a : w1Var.n() : f10;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends c2 {

        /* renamed from: e */
        private final d2 f32854e;

        /* renamed from: f */
        private final c f32855f;

        /* renamed from: r */
        private final t f32856r;

        /* renamed from: s */
        private final Object f32857s;

        public b(d2 d2Var, c cVar, t tVar, Object obj) {
            this.f32854e = d2Var;
            this.f32855f = cVar;
            this.f32856r = tVar;
            this.f32857s = obj;
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(Throwable th2) {
            v(th2);
            return ck.v.f7137a;
        }

        @Override // zk.c0
        public void v(Throwable th2) {
            this.f32854e.H(this.f32855f, this.f32856r, this.f32857s);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements r1 {

        /* renamed from: b */
        private static final AtomicIntegerFieldUpdater f32858b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: c */
        private static final AtomicReferenceFieldUpdater f32859c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: d */
        private static final AtomicReferenceFieldUpdater f32860d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: a */
        private final i2 f32861a;

        public c(i2 i2Var, boolean z10, Throwable th2) {
            this.f32861a = i2Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th2;
        }

        private final ArrayList<Throwable> d() {
            return new ArrayList<>(4);
        }

        private final Object e() {
            return f32860d.get(this);
        }

        private final void l(Object obj) {
            f32860d.set(this, obj);
        }

        @Override // zk.r1
        public boolean a() {
            return f() == null;
        }

        public final void b(Throwable th2) {
            Throwable f10 = f();
            if (f10 == null) {
                m(th2);
                return;
            }
            if (th2 == f10) {
                return;
            }
            Object e10 = e();
            if (e10 == null) {
                l(th2);
                return;
            }
            if (e10 instanceof Throwable) {
                if (th2 == e10) {
                    return;
                }
                ArrayList<Throwable> d10 = d();
                d10.add(e10);
                d10.add(th2);
                l(d10);
                return;
            }
            if (e10 instanceof ArrayList) {
                ((ArrayList) e10).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + e10).toString());
        }

        @Override // zk.r1
        public i2 c() {
            return this.f32861a;
        }

        public final Throwable f() {
            return (Throwable) f32859c.get(this);
        }

        public final boolean g() {
            return f() != null;
        }

        public final boolean h() {
            return f32858b.get(this) != 0;
        }

        public final boolean i() {
            el.h0 h0Var;
            Object e10 = e();
            h0Var = e2.f32877e;
            return e10 == h0Var;
        }

        public final List<Throwable> j(Throwable th2) {
            ArrayList<Throwable> arrayList;
            el.h0 h0Var;
            Object e10 = e();
            if (e10 == null) {
                arrayList = d();
            } else if (e10 instanceof Throwable) {
                ArrayList<Throwable> d10 = d();
                d10.add(e10);
                arrayList = d10;
            } else {
                if (!(e10 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + e10).toString());
                }
                arrayList = (ArrayList) e10;
            }
            Throwable f10 = f();
            if (f10 != null) {
                arrayList.add(0, f10);
            }
            if (th2 != null && !kotlin.jvm.internal.n.a(th2, f10)) {
                arrayList.add(th2);
            }
            h0Var = e2.f32877e;
            l(h0Var);
            return arrayList;
        }

        public final void k(boolean z10) {
            f32858b.set(this, z10 ? 1 : 0);
        }

        public final void m(Throwable th2) {
            f32859c.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + c() + ']';
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends s.a {

        /* renamed from: d */
        final /* synthetic */ d2 f32862d;

        /* renamed from: e */
        final /* synthetic */ Object f32863e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(el.s sVar, d2 d2Var, Object obj) {
            super(sVar);
            this.f32862d = d2Var;
            this.f32863e = obj;
        }

        @Override // el.b
        /* renamed from: f */
        public Object d(el.s sVar) {
            if (this.f32862d.Y() == this.f32863e) {
                return null;
            }
            return el.r.a();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {955, 957}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class e extends kotlin.coroutines.jvm.internal.k implements ok.p<wk.f<? super w1>, Continuation<? super ck.v>, Object> {

        /* renamed from: b */
        Object f32864b;

        /* renamed from: c */
        Object f32865c;

        /* renamed from: d */
        int f32866d;

        /* renamed from: e */
        private /* synthetic */ Object f32867e;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // ok.p
        /* renamed from: a */
        public final Object invoke(wk.f<? super w1> fVar, Continuation<? super ck.v> continuation) {
            return ((e) create(fVar, continuation)).invokeSuspend(ck.v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<ck.v> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(continuation);
            eVar.f32867e = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006d -> B:6:0x0083). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0080 -> B:6:0x0083). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = hk.b.c()
                int r1 = r7.f32866d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f32865c
                el.s r1 = (el.s) r1
                java.lang.Object r3 = r7.f32864b
                el.q r3 = (el.q) r3
                java.lang.Object r4 = r7.f32867e
                wk.f r4 = (wk.f) r4
                ck.o.b(r8)
                r8 = r7
                goto L83
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                ck.o.b(r8)
                goto L88
            L2b:
                ck.o.b(r8)
                java.lang.Object r8 = r7.f32867e
                wk.f r8 = (wk.f) r8
                zk.d2 r1 = zk.d2.this
                java.lang.Object r1 = r1.Y()
                boolean r4 = r1 instanceof zk.t
                if (r4 == 0) goto L49
                zk.t r1 = (zk.t) r1
                zk.u r1 = r1.f32930e
                r7.f32866d = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L88
                return r0
            L49:
                boolean r3 = r1 instanceof zk.r1
                if (r3 == 0) goto L88
                zk.r1 r1 = (zk.r1) r1
                zk.i2 r1 = r1.c()
                if (r1 == 0) goto L88
                java.lang.Object r3 = r1.l()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.n.c(r3, r4)
                el.s r3 = (el.s) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L65:
                boolean r5 = kotlin.jvm.internal.n.a(r1, r3)
                if (r5 != 0) goto L88
                boolean r5 = r1 instanceof zk.t
                if (r5 == 0) goto L83
                r5 = r1
                zk.t r5 = (zk.t) r5
                zk.u r5 = r5.f32930e
                r8.f32867e = r4
                r8.f32864b = r3
                r8.f32865c = r1
                r8.f32866d = r2
                java.lang.Object r5 = r4.a(r5, r8)
                if (r5 != r0) goto L83
                return r0
            L83:
                el.s r1 = r1.o()
                goto L65
            L88:
                ck.v r8 = ck.v.f7137a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: zk.d2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d2(boolean z10) {
        this._state = z10 ? e2.f32879g : e2.f32878f;
    }

    private final Object A(Object obj) {
        el.h0 h0Var;
        Object K0;
        el.h0 h0Var2;
        do {
            Object Y = Y();
            if (!(Y instanceof r1) || ((Y instanceof c) && ((c) Y).h())) {
                h0Var = e2.f32873a;
                return h0Var;
            }
            K0 = K0(Y, new a0(J(obj), false, 2, null));
            h0Var2 = e2.f32875c;
        } while (K0 == h0Var2);
        return K0;
    }

    private final boolean C(Throwable th2) {
        if (e0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        s X = X();
        return (X == null || X == j2.f32904a) ? z10 : X.h(th2) || z10;
    }

    private final int D0(Object obj) {
        f1 f1Var;
        if (!(obj instanceof f1)) {
            if (!(obj instanceof q1)) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f32851a, this, obj, ((q1) obj).c())) {
                return -1;
            }
            w0();
            return 1;
        }
        if (((f1) obj).a()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32851a;
        f1Var = e2.f32879g;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, f1Var)) {
            return -1;
        }
        w0();
        return 1;
    }

    private final String E0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof r1 ? ((r1) obj).a() ? "Active" : "New" : obj instanceof a0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.g() ? "Cancelling" : cVar.h() ? "Completing" : "Active";
    }

    private final void G(r1 r1Var, Object obj) {
        s X = X();
        if (X != null) {
            X.dispose();
            C0(j2.f32904a);
        }
        a0 a0Var = obj instanceof a0 ? (a0) obj : null;
        Throwable th2 = a0Var != null ? a0Var.f32837a : null;
        if (!(r1Var instanceof c2)) {
            i2 c10 = r1Var.c();
            if (c10 != null) {
                s0(c10, th2);
                return;
            }
            return;
        }
        try {
            ((c2) r1Var).v(th2);
        } catch (Throwable th3) {
            a0(new d0("Exception in completion handler " + r1Var + " for " + this, th3));
        }
    }

    public static /* synthetic */ CancellationException G0(d2 d2Var, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return d2Var.F0(th2, str);
    }

    public final void H(c cVar, t tVar, Object obj) {
        t q02 = q0(tVar);
        if (q02 == null || !M0(cVar, q02, obj)) {
            t(K(cVar, obj));
        }
    }

    private final boolean I0(r1 r1Var, Object obj) {
        if (!androidx.concurrent.futures.b.a(f32851a, this, r1Var, e2.g(obj))) {
            return false;
        }
        t0(null);
        u0(obj);
        G(r1Var, obj);
        return true;
    }

    private final Throwable J(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new x1(D(), null, this) : th2;
        }
        kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((l2) obj).I();
    }

    private final boolean J0(r1 r1Var, Throwable th2) {
        i2 W = W(r1Var);
        if (W == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f32851a, this, r1Var, new c(W, false, th2))) {
            return false;
        }
        r0(W, th2);
        return true;
    }

    private final Object K(c cVar, Object obj) {
        boolean g10;
        Throwable P;
        a0 a0Var = obj instanceof a0 ? (a0) obj : null;
        Throwable th2 = a0Var != null ? a0Var.f32837a : null;
        synchronized (cVar) {
            g10 = cVar.g();
            List<Throwable> j10 = cVar.j(th2);
            P = P(cVar, j10);
            if (P != null) {
                s(P, j10);
            }
        }
        if (P != null && P != th2) {
            obj = new a0(P, false, 2, null);
        }
        if (P != null) {
            if (C(P) || Z(P)) {
                kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((a0) obj).b();
            }
        }
        if (!g10) {
            t0(P);
        }
        u0(obj);
        androidx.concurrent.futures.b.a(f32851a, this, cVar, e2.g(obj));
        G(cVar, obj);
        return obj;
    }

    private final Object K0(Object obj, Object obj2) {
        el.h0 h0Var;
        el.h0 h0Var2;
        if (!(obj instanceof r1)) {
            h0Var2 = e2.f32873a;
            return h0Var2;
        }
        if ((!(obj instanceof f1) && !(obj instanceof c2)) || (obj instanceof t) || (obj2 instanceof a0)) {
            return L0((r1) obj, obj2);
        }
        if (I0((r1) obj, obj2)) {
            return obj2;
        }
        h0Var = e2.f32875c;
        return h0Var;
    }

    private final t L(r1 r1Var) {
        t tVar = r1Var instanceof t ? (t) r1Var : null;
        if (tVar != null) {
            return tVar;
        }
        i2 c10 = r1Var.c();
        if (c10 != null) {
            return q0(c10);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object L0(r1 r1Var, Object obj) {
        el.h0 h0Var;
        el.h0 h0Var2;
        el.h0 h0Var3;
        i2 W = W(r1Var);
        if (W == null) {
            h0Var3 = e2.f32875c;
            return h0Var3;
        }
        c cVar = r1Var instanceof c ? (c) r1Var : null;
        if (cVar == null) {
            cVar = new c(W, false, null);
        }
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        synchronized (cVar) {
            if (cVar.h()) {
                h0Var2 = e2.f32873a;
                return h0Var2;
            }
            cVar.k(true);
            if (cVar != r1Var && !androidx.concurrent.futures.b.a(f32851a, this, r1Var, cVar)) {
                h0Var = e2.f32875c;
                return h0Var;
            }
            boolean g10 = cVar.g();
            a0 a0Var = obj instanceof a0 ? (a0) obj : null;
            if (a0Var != null) {
                cVar.b(a0Var.f32837a);
            }
            ?? f10 = Boolean.valueOf(g10 ? false : true).booleanValue() ? cVar.f() : 0;
            xVar.f20759a = f10;
            ck.v vVar = ck.v.f7137a;
            if (f10 != 0) {
                r0(W, f10);
            }
            t L = L(r1Var);
            return (L == null || !M0(cVar, L, obj)) ? K(cVar, obj) : e2.f32874b;
        }
    }

    private final boolean M0(c cVar, t tVar, Object obj) {
        while (w1.a.d(tVar.f32930e, false, false, new b(this, cVar, tVar, obj), 1, null) == j2.f32904a) {
            tVar = q0(tVar);
            if (tVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable N(Object obj) {
        a0 a0Var = obj instanceof a0 ? (a0) obj : null;
        if (a0Var != null) {
            return a0Var.f32837a;
        }
        return null;
    }

    private final Throwable P(c cVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.g()) {
                return new x1(D(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = list.get(0);
        if (th3 instanceof v2) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof v2)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    private final i2 W(r1 r1Var) {
        i2 c10 = r1Var.c();
        if (c10 != null) {
            return c10;
        }
        if (r1Var instanceof f1) {
            return new i2();
        }
        if (r1Var instanceof c2) {
            y0((c2) r1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + r1Var).toString());
    }

    private final boolean f0() {
        Object Y;
        do {
            Y = Y();
            if (!(Y instanceof r1)) {
                return false;
            }
        } while (D0(Y) < 0);
        return true;
    }

    private final Object g0(Continuation<? super ck.v> continuation) {
        Continuation b10;
        Object c10;
        Object c11;
        b10 = hk.c.b(continuation);
        n nVar = new n(b10, 1);
        nVar.z();
        p.a(nVar, R(new n2(nVar)));
        Object w10 = nVar.w();
        c10 = hk.d.c();
        if (w10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        c11 = hk.d.c();
        return w10 == c11 ? w10 : ck.v.f7137a;
    }

    private final Object k0(Object obj) {
        el.h0 h0Var;
        el.h0 h0Var2;
        el.h0 h0Var3;
        el.h0 h0Var4;
        el.h0 h0Var5;
        el.h0 h0Var6;
        Throwable th2 = null;
        while (true) {
            Object Y = Y();
            if (Y instanceof c) {
                synchronized (Y) {
                    if (((c) Y).i()) {
                        h0Var2 = e2.f32876d;
                        return h0Var2;
                    }
                    boolean g10 = ((c) Y).g();
                    if (obj != null || !g10) {
                        if (th2 == null) {
                            th2 = J(obj);
                        }
                        ((c) Y).b(th2);
                    }
                    Throwable f10 = g10 ^ true ? ((c) Y).f() : null;
                    if (f10 != null) {
                        r0(((c) Y).c(), f10);
                    }
                    h0Var = e2.f32873a;
                    return h0Var;
                }
            }
            if (!(Y instanceof r1)) {
                h0Var3 = e2.f32876d;
                return h0Var3;
            }
            if (th2 == null) {
                th2 = J(obj);
            }
            r1 r1Var = (r1) Y;
            if (!r1Var.a()) {
                Object K0 = K0(Y, new a0(th2, false, 2, null));
                h0Var5 = e2.f32873a;
                if (K0 == h0Var5) {
                    throw new IllegalStateException(("Cannot happen in " + Y).toString());
                }
                h0Var6 = e2.f32875c;
                if (K0 != h0Var6) {
                    return K0;
                }
            } else if (J0(r1Var, th2)) {
                h0Var4 = e2.f32873a;
                return h0Var4;
            }
        }
    }

    private final c2 o0(ok.l<? super Throwable, ck.v> lVar, boolean z10) {
        c2 c2Var;
        if (z10) {
            c2Var = lVar instanceof y1 ? (y1) lVar : null;
            if (c2Var == null) {
                c2Var = new u1(lVar);
            }
        } else {
            c2Var = lVar instanceof c2 ? (c2) lVar : null;
            if (c2Var == null) {
                c2Var = new v1(lVar);
            }
        }
        c2Var.x(this);
        return c2Var;
    }

    private final t q0(el.s sVar) {
        while (sVar.q()) {
            sVar = sVar.p();
        }
        while (true) {
            sVar = sVar.o();
            if (!sVar.q()) {
                if (sVar instanceof t) {
                    return (t) sVar;
                }
                if (sVar instanceof i2) {
                    return null;
                }
            }
        }
    }

    private final boolean r(Object obj, i2 i2Var, c2 c2Var) {
        int u10;
        d dVar = new d(c2Var, this, obj);
        do {
            u10 = i2Var.p().u(c2Var, i2Var, dVar);
            if (u10 == 1) {
                return true;
            }
        } while (u10 != 2);
        return false;
    }

    private final void r0(i2 i2Var, Throwable th2) {
        t0(th2);
        Object l10 = i2Var.l();
        kotlin.jvm.internal.n.c(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        d0 d0Var = null;
        for (el.s sVar = (el.s) l10; !kotlin.jvm.internal.n.a(sVar, i2Var); sVar = sVar.o()) {
            if (sVar instanceof y1) {
                c2 c2Var = (c2) sVar;
                try {
                    c2Var.v(th2);
                } catch (Throwable th3) {
                    if (d0Var != null) {
                        ck.b.a(d0Var, th3);
                    } else {
                        d0Var = new d0("Exception in completion handler " + c2Var + " for " + this, th3);
                        ck.v vVar = ck.v.f7137a;
                    }
                }
            }
        }
        if (d0Var != null) {
            a0(d0Var);
        }
        C(th2);
    }

    private final void s(Throwable th2, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th3 : list) {
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                ck.b.a(th2, th3);
            }
        }
    }

    private final void s0(i2 i2Var, Throwable th2) {
        Object l10 = i2Var.l();
        kotlin.jvm.internal.n.c(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        d0 d0Var = null;
        for (el.s sVar = (el.s) l10; !kotlin.jvm.internal.n.a(sVar, i2Var); sVar = sVar.o()) {
            if (sVar instanceof c2) {
                c2 c2Var = (c2) sVar;
                try {
                    c2Var.v(th2);
                } catch (Throwable th3) {
                    if (d0Var != null) {
                        ck.b.a(d0Var, th3);
                    } else {
                        d0Var = new d0("Exception in completion handler " + c2Var + " for " + this, th3);
                        ck.v vVar = ck.v.f7137a;
                    }
                }
            }
        }
        if (d0Var != null) {
            a0(d0Var);
        }
    }

    private final Object v(Continuation<Object> continuation) {
        Continuation b10;
        Object c10;
        b10 = hk.c.b(continuation);
        a aVar = new a(b10, this);
        aVar.z();
        p.a(aVar, R(new m2(aVar)));
        Object w10 = aVar.w();
        c10 = hk.d.c();
        if (w10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return w10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [zk.q1] */
    private final void x0(f1 f1Var) {
        i2 i2Var = new i2();
        if (!f1Var.a()) {
            i2Var = new q1(i2Var);
        }
        androidx.concurrent.futures.b.a(f32851a, this, f1Var, i2Var);
    }

    private final void y0(c2 c2Var) {
        c2Var.g(new i2());
        androidx.concurrent.futures.b.a(f32851a, this, c2Var, c2Var.o());
    }

    public final void A0(c2 c2Var) {
        Object Y;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f1 f1Var;
        do {
            Y = Y();
            if (!(Y instanceof c2)) {
                if (!(Y instanceof r1) || ((r1) Y).c() == null) {
                    return;
                }
                c2Var.r();
                return;
            }
            if (Y != c2Var) {
                return;
            }
            atomicReferenceFieldUpdater = f32851a;
            f1Var = e2.f32879g;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, Y, f1Var));
    }

    @Override // zk.w1
    public final Object B0(Continuation<? super ck.v> continuation) {
        Object c10;
        if (!f0()) {
            a2.h(continuation.getContext());
            return ck.v.f7137a;
        }
        Object g02 = g0(continuation);
        c10 = hk.d.c();
        return g02 == c10 ? g02 : ck.v.f7137a;
    }

    public final void C0(s sVar) {
        f32852b.set(this, sVar);
    }

    public String D() {
        return "Job was cancelled";
    }

    public boolean F(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return x(th2) && T();
    }

    protected final CancellationException F0(Throwable th2, String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = D();
            }
            cancellationException = new x1(str, th2, this);
        }
        return cancellationException;
    }

    public final String H0() {
        return p0() + '{' + E0(Y()) + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // zk.l2
    public CancellationException I() {
        CancellationException cancellationException;
        Object Y = Y();
        if (Y instanceof c) {
            cancellationException = ((c) Y).f();
        } else if (Y instanceof a0) {
            cancellationException = ((a0) Y).f32837a;
        } else {
            if (Y instanceof r1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + Y).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new x1("Parent job is " + E0(Y), cancellationException, this);
    }

    public final Object M() {
        Object Y = Y();
        if (!(!(Y instanceof r1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (Y instanceof a0) {
            throw ((a0) Y).f32837a;
        }
        return e2.h(Y);
    }

    @Override // zk.w1
    public void O(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new x1(D(), null, this);
        }
        z(cancellationException);
    }

    @Override // gk.f
    public gk.f Q(f.c<?> cVar) {
        return w1.a.e(this, cVar);
    }

    @Override // zk.w1
    public final c1 R(ok.l<? super Throwable, ck.v> lVar) {
        return m0(false, true, lVar);
    }

    public boolean T() {
        return true;
    }

    @Override // gk.f
    public gk.f U(gk.f fVar) {
        return w1.a.f(this, fVar);
    }

    public boolean V() {
        return false;
    }

    public final s X() {
        return (s) f32852b.get(this);
    }

    public final Object Y() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32851a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof el.a0)) {
                return obj;
            }
            ((el.a0) obj).a(this);
        }
    }

    protected boolean Z(Throwable th2) {
        return false;
    }

    @Override // zk.w1
    public boolean a() {
        Object Y = Y();
        return (Y instanceof r1) && ((r1) Y).a();
    }

    public void a0(Throwable th2) {
        throw th2;
    }

    @Override // gk.f.b, gk.f
    public <E extends f.b> E b(f.c<E> cVar) {
        return (E) w1.a.c(this, cVar);
    }

    public final void b0(w1 w1Var) {
        if (w1Var == null) {
            C0(j2.f32904a);
            return;
        }
        w1Var.start();
        s j02 = w1Var.j0(this);
        C0(j02);
        if (d0()) {
            j02.dispose();
            C0(j2.f32904a);
        }
    }

    @Override // zk.u
    public final void c0(l2 l2Var) {
        x(l2Var);
    }

    public final boolean d0() {
        return !(Y() instanceof r1);
    }

    protected boolean e0() {
        return false;
    }

    @Override // gk.f.b
    public final f.c<?> getKey() {
        return w1.f32940q;
    }

    @Override // zk.w1
    public w1 getParent() {
        s X = X();
        if (X != null) {
            return X.getParent();
        }
        return null;
    }

    @Override // zk.w1
    public final wk.d<w1> i() {
        wk.d<w1> b10;
        b10 = wk.h.b(new e(null));
        return b10;
    }

    @Override // zk.w1
    public final boolean isCancelled() {
        Object Y = Y();
        return (Y instanceof a0) || ((Y instanceof c) && ((c) Y).g());
    }

    public final Throwable j() {
        Object Y = Y();
        if (!(Y instanceof r1)) {
            return N(Y);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // zk.w1
    public final s j0(u uVar) {
        c1 d10 = w1.a.d(this, true, false, new t(uVar), 2, null);
        kotlin.jvm.internal.n.c(d10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (s) d10;
    }

    public final boolean l0(Object obj) {
        Object K0;
        el.h0 h0Var;
        el.h0 h0Var2;
        do {
            K0 = K0(Y(), obj);
            h0Var = e2.f32873a;
            if (K0 == h0Var) {
                return false;
            }
            if (K0 == e2.f32874b) {
                return true;
            }
            h0Var2 = e2.f32875c;
        } while (K0 == h0Var2);
        t(K0);
        return true;
    }

    @Override // zk.w1
    public final c1 m0(boolean z10, boolean z11, ok.l<? super Throwable, ck.v> lVar) {
        c2 o02 = o0(lVar, z10);
        while (true) {
            Object Y = Y();
            if (Y instanceof f1) {
                f1 f1Var = (f1) Y;
                if (!f1Var.a()) {
                    x0(f1Var);
                } else if (androidx.concurrent.futures.b.a(f32851a, this, Y, o02)) {
                    return o02;
                }
            } else {
                if (!(Y instanceof r1)) {
                    if (z11) {
                        a0 a0Var = Y instanceof a0 ? (a0) Y : null;
                        lVar.invoke(a0Var != null ? a0Var.f32837a : null);
                    }
                    return j2.f32904a;
                }
                i2 c10 = ((r1) Y).c();
                if (c10 == null) {
                    kotlin.jvm.internal.n.c(Y, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    y0((c2) Y);
                } else {
                    c1 c1Var = j2.f32904a;
                    if (z10 && (Y instanceof c)) {
                        synchronized (Y) {
                            r3 = ((c) Y).f();
                            if (r3 == null || ((lVar instanceof t) && !((c) Y).h())) {
                                if (r(Y, c10, o02)) {
                                    if (r3 == null) {
                                        return o02;
                                    }
                                    c1Var = o02;
                                }
                            }
                            ck.v vVar = ck.v.f7137a;
                        }
                    }
                    if (r3 != null) {
                        if (z11) {
                            lVar.invoke(r3);
                        }
                        return c1Var;
                    }
                    if (r(Y, c10, o02)) {
                        return o02;
                    }
                }
            }
        }
    }

    @Override // zk.w1
    public final CancellationException n() {
        Object Y = Y();
        if (!(Y instanceof c)) {
            if (Y instanceof r1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (Y instanceof a0) {
                return G0(this, ((a0) Y).f32837a, null, 1, null);
            }
            return new x1(o0.a(this) + " has completed normally", null, this);
        }
        Throwable f10 = ((c) Y).f();
        if (f10 != null) {
            CancellationException F0 = F0(f10, o0.a(this) + " is cancelling");
            if (F0 != null) {
                return F0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final Object n0(Object obj) {
        Object K0;
        el.h0 h0Var;
        el.h0 h0Var2;
        do {
            K0 = K0(Y(), obj);
            h0Var = e2.f32873a;
            if (K0 == h0Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, N(obj));
            }
            h0Var2 = e2.f32875c;
        } while (K0 == h0Var2);
        return K0;
    }

    public String p0() {
        return o0.a(this);
    }

    @Override // zk.w1
    public final boolean start() {
        int D0;
        do {
            D0 = D0(Y());
            if (D0 == 0) {
                return false;
            }
        } while (D0 != 1);
        return true;
    }

    public void t(Object obj) {
    }

    protected void t0(Throwable th2) {
    }

    public String toString() {
        return H0() + '@' + o0.b(this);
    }

    public final Object u(Continuation<Object> continuation) {
        Object Y;
        do {
            Y = Y();
            if (!(Y instanceof r1)) {
                if (Y instanceof a0) {
                    throw ((a0) Y).f32837a;
                }
                return e2.h(Y);
            }
        } while (D0(Y) < 0);
        return v(continuation);
    }

    protected void u0(Object obj) {
    }

    public final boolean w(Throwable th2) {
        return x(th2);
    }

    protected void w0() {
    }

    public final boolean x(Object obj) {
        Object obj2;
        el.h0 h0Var;
        el.h0 h0Var2;
        el.h0 h0Var3;
        obj2 = e2.f32873a;
        if (V() && (obj2 = A(obj)) == e2.f32874b) {
            return true;
        }
        h0Var = e2.f32873a;
        if (obj2 == h0Var) {
            obj2 = k0(obj);
        }
        h0Var2 = e2.f32873a;
        if (obj2 == h0Var2 || obj2 == e2.f32874b) {
            return true;
        }
        h0Var3 = e2.f32876d;
        if (obj2 == h0Var3) {
            return false;
        }
        t(obj2);
        return true;
    }

    public void z(Throwable th2) {
        x(th2);
    }

    @Override // gk.f
    public <R> R z0(R r10, ok.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) w1.a.b(this, r10, pVar);
    }
}
