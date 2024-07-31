package p494zk;

import androidx.concurrent.futures.C0741b;
import ck.C2017b;
import ck.C2037v;
import hk.C7751c;
import hk.C7752d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.AbstractC9305k;
import kotlin.coroutines.jvm.internal.C9302h;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9332x;
import p089el.AbstractC7209a0;
import p089el.C7223h0;
import p089el.C7242r;
import p089el.C7243s;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC9998l;
import p427wk.AbstractC12230f;
import p427wk.C12232h;
import p427wk.InterfaceC12228d;
import p494zk.InterfaceC13125w1;

/* renamed from: zk.d2 */
/* loaded from: classes3.dex */
public class C13050d2 implements InterfaceC13125w1, InterfaceC13115u, InterfaceC13082l2 {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f35402a = AtomicReferenceFieldUpdater.newUpdater(C13050d2.class, Object.class, "_state");

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f35403b = AtomicReferenceFieldUpdater.newUpdater(C13050d2.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zk.d2$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends C13087n<T> {

        /* renamed from: t */
        private final C13050d2 f35404t;

        public a(Continuation<? super T> continuation, C13050d2 c13050d2) {
            super(continuation, 1);
            this.f35404t = c13050d2;
        }

        @Override // p494zk.C13087n
        /* renamed from: G */
        protected String mo43131G() {
            return "AwaitContinuation";
        }

        @Override // p494zk.C13087n
        /* renamed from: u */
        public Throwable mo43132u(InterfaceC13125w1 interfaceC13125w1) {
            Throwable m43137f;
            Object m43113Y = this.f35404t.m43113Y();
            return (!(m43113Y instanceof c) || (m43137f = ((c) m43113Y).m43137f()) == null) ? m43113Y instanceof C13033a0 ? ((C13033a0) m43113Y).f35388a : interfaceC13125w1.mo43123n() : m43137f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zk.d2$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC13045c2 {

        /* renamed from: e */
        private final C13050d2 f35405e;

        /* renamed from: f */
        private final c f35406f;

        /* renamed from: r */
        private final C13111t f35407r;

        /* renamed from: s */
        private final Object f35408s;

        public b(C13050d2 c13050d2, c cVar, C13111t c13111t, Object obj) {
            this.f35405e = c13050d2;
            this.f35406f = cVar;
            this.f35407r = c13111t;
            this.f35408s = obj;
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
            mo43063v(th2);
            return C2037v.f8089a;
        }

        @Override // p494zk.AbstractC13043c0
        /* renamed from: v */
        public void mo43063v(Throwable th2) {
            this.f35405e.m43074H(this.f35406f, this.f35407r, this.f35408s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zk.d2$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC13105r1 {

        /* renamed from: b */
        private static final AtomicIntegerFieldUpdater f35409b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: c */
        private static final AtomicReferenceFieldUpdater f35410c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: d */
        private static final AtomicReferenceFieldUpdater f35411d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: a */
        private final C13070i2 f35412a;

        public c(C13070i2 c13070i2, boolean z10, Throwable th2) {
            this.f35412a = c13070i2;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th2;
        }

        /* renamed from: d */
        private final ArrayList<Throwable> m43133d() {
            return new ArrayList<>(4);
        }

        /* renamed from: e */
        private final Object m43134e() {
            return f35411d.get(this);
        }

        /* renamed from: l */
        private final void m43135l(Object obj) {
            f35411d.set(this, obj);
        }

        @Override // p494zk.InterfaceC13105r1
        /* renamed from: a */
        public boolean mo43064a() {
            return m43137f() == null;
        }

        /* renamed from: b */
        public final void m43136b(Throwable th2) {
            Throwable m43137f = m43137f();
            if (m43137f == null) {
                m43143m(th2);
                return;
            }
            if (th2 == m43137f) {
                return;
            }
            Object m43134e = m43134e();
            if (m43134e == null) {
                m43135l(th2);
                return;
            }
            if (m43134e instanceof Throwable) {
                if (th2 == m43134e) {
                    return;
                }
                ArrayList<Throwable> m43133d = m43133d();
                m43133d.add(m43134e);
                m43133d.add(th2);
                m43135l(m43133d);
                return;
            }
            if (m43134e instanceof ArrayList) {
                ((ArrayList) m43134e).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + m43134e).toString());
        }

        @Override // p494zk.InterfaceC13105r1
        /* renamed from: c */
        public C13070i2 mo43065c() {
            return this.f35412a;
        }

        /* renamed from: f */
        public final Throwable m43137f() {
            return (Throwable) f35410c.get(this);
        }

        /* renamed from: g */
        public final boolean m43138g() {
            return m43137f() != null;
        }

        /* renamed from: h */
        public final boolean m43139h() {
            return f35409b.get(this) != 0;
        }

        /* renamed from: i */
        public final boolean m43140i() {
            C7223h0 c7223h0;
            Object m43134e = m43134e();
            c7223h0 = C13054e2.f35428e;
            return m43134e == c7223h0;
        }

        /* renamed from: j */
        public final List<Throwable> m43141j(Throwable th2) {
            ArrayList<Throwable> arrayList;
            C7223h0 c7223h0;
            Object m43134e = m43134e();
            if (m43134e == null) {
                arrayList = m43133d();
            } else if (m43134e instanceof Throwable) {
                ArrayList<Throwable> m43133d = m43133d();
                m43133d.add(m43134e);
                arrayList = m43133d;
            } else {
                if (!(m43134e instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + m43134e).toString());
                }
                arrayList = (ArrayList) m43134e;
            }
            Throwable m43137f = m43137f();
            if (m43137f != null) {
                arrayList.add(0, m43137f);
            }
            if (th2 != null && !C9322n.m27777a(th2, m43137f)) {
                arrayList.add(th2);
            }
            c7223h0 = C13054e2.f35428e;
            m43135l(c7223h0);
            return arrayList;
        }

        /* renamed from: k */
        public final void m43142k(boolean z10) {
            f35409b.set(this, z10 ? 1 : 0);
        }

        /* renamed from: m */
        public final void m43143m(Throwable th2) {
            f35410c.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + m43138g() + ", completing=" + m43139h() + ", rootCause=" + m43137f() + ", exceptions=" + m43134e() + ", list=" + mo43065c() + ']';
        }
    }

    /* renamed from: zk.d2$d */
    /* loaded from: classes3.dex */
    public static final class d extends C7243s.a {

        /* renamed from: d */
        final /* synthetic */ C13050d2 f35413d;

        /* renamed from: e */
        final /* synthetic */ Object f35414e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C7243s c7243s, C13050d2 c13050d2, Object obj) {
            super(c7243s);
            this.f35413d = c13050d2;
            this.f35414e = obj;
        }

        @Override // p089el.AbstractC7210b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object mo21542d(C7243s c7243s) {
            if (this.f35413d.m43113Y() == this.f35414e) {
                return null;
            }
            return C7242r.m21644a();
        }
    }

    @InterfaceC9300f(m27742c = "kotlinx.coroutines.JobSupport$children$1", m27743f = "JobSupport.kt", m27744l = {955, 957}, m27745m = "invokeSuspend")
    /* renamed from: zk.d2$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC9305k implements InterfaceC10002p<AbstractC12230f<? super InterfaceC13125w1>, Continuation<? super C2037v>, Object> {

        /* renamed from: b */
        Object f35415b;

        /* renamed from: c */
        Object f35416c;

        /* renamed from: d */
        int f35417d;

        /* renamed from: e */
        private /* synthetic */ Object f35418e;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC12230f<? super InterfaceC13125w1> abstractC12230f, Continuation<? super C2037v> continuation) {
            return ((e) create(abstractC12230f, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(continuation);
            eVar.f35418e = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006d -> B:6:0x0083). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0080 -> B:6:0x0083). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = hk.C7750b.m23652c()
                int r1 = r7.f35417d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f35416c
                el.s r1 = (p089el.C7243s) r1
                java.lang.Object r3 = r7.f35415b
                el.q r3 = (p089el.C7240q) r3
                java.lang.Object r4 = r7.f35418e
                wk.f r4 = (p427wk.AbstractC12230f) r4
                ck.C2030o.m10349b(r8)
                r8 = r7
                goto L83
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                ck.C2030o.m10349b(r8)
                goto L88
            L2b:
                ck.C2030o.m10349b(r8)
                java.lang.Object r8 = r7.f35418e
                wk.f r8 = (p427wk.AbstractC12230f) r8
                zk.d2 r1 = p494zk.C13050d2.this
                java.lang.Object r1 = r1.m43113Y()
                boolean r4 = r1 instanceof p494zk.C13111t
                if (r4 == 0) goto L49
                zk.t r1 = (p494zk.C13111t) r1
                zk.u r1 = r1.f35481e
                r7.f35417d = r3
                java.lang.Object r8 = r8.mo39367a(r1, r7)
                if (r8 != r0) goto L88
                return r0
            L49:
                boolean r3 = r1 instanceof p494zk.InterfaceC13105r1
                if (r3 == 0) goto L88
                zk.r1 r1 = (p494zk.InterfaceC13105r1) r1
                zk.i2 r1 = r1.mo43065c()
                if (r1 == 0) goto L88
                java.lang.Object r3 = r1.m21653l()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.C9322n.m27779c(r3, r4)
                el.s r3 = (p089el.C7243s) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L65:
                boolean r5 = kotlin.jvm.internal.C9322n.m27777a(r1, r3)
                if (r5 != 0) goto L88
                boolean r5 = r1 instanceof p494zk.C13111t
                if (r5 == 0) goto L83
                r5 = r1
                zk.t r5 = (p494zk.C13111t) r5
                zk.u r5 = r5.f35481e
                r8.f35418e = r4
                r8.f35415b = r3
                r8.f35416c = r1
                r8.f35417d = r2
                java.lang.Object r5 = r4.mo39367a(r5, r8)
                if (r5 != r0) goto L83
                return r0
            L83:
                el.s r1 = r1.m21654o()
                goto L65
            L88:
                ck.v r8 = ck.C2037v.f8089a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p494zk.C13050d2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C13050d2(boolean z10) {
        this._state = z10 ? C13054e2.f35430g : C13054e2.f35429f;
    }

    /* renamed from: A */
    private final Object m43068A(Object obj) {
        C7223h0 c7223h0;
        Object m43079K0;
        C7223h0 c7223h02;
        do {
            Object m43113Y = m43113Y();
            if (!(m43113Y instanceof InterfaceC13105r1) || ((m43113Y instanceof c) && ((c) m43113Y).m43139h())) {
                c7223h0 = C13054e2.f35424a;
                return c7223h0;
            }
            m43079K0 = m43079K0(m43113Y, new C13033a0(m43076J(obj), false, 2, null));
            c7223h02 = C13054e2.f35426c;
        } while (m43079K0 == c7223h02);
        return m43079K0;
    }

    /* renamed from: C */
    private final boolean m43069C(Throwable th2) {
        if (mo21551e0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        InterfaceC13107s m43112X = m43112X();
        return (m43112X == null || m43112X == C13074j2.f35455a) ? z10 : m43112X.mo43223h(th2) || z10;
    }

    /* renamed from: D0 */
    private final int m43070D0(Object obj) {
        C13057f1 c13057f1;
        if (!(obj instanceof C13057f1)) {
            if (!(obj instanceof C13101q1)) {
                return 0;
            }
            if (!C0741b.m3751a(f35402a, this, obj, ((C13101q1) obj).mo43065c())) {
                return -1;
            }
            mo43128w0();
            return 1;
        }
        if (((C13057f1) obj).mo43064a()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35402a;
        c13057f1 = C13054e2.f35430g;
        if (!C0741b.m3751a(atomicReferenceFieldUpdater, this, obj, c13057f1)) {
            return -1;
        }
        mo43128w0();
        return 1;
    }

    /* renamed from: E0 */
    private final String m43071E0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC13105r1 ? ((InterfaceC13105r1) obj).mo43064a() ? "Active" : "New" : obj instanceof C13033a0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.m43138g() ? "Cancelling" : cVar.m43139h() ? "Completing" : "Active";
    }

    /* renamed from: G */
    private final void m43072G(InterfaceC13105r1 interfaceC13105r1, Object obj) {
        InterfaceC13107s m43112X = m43112X();
        if (m43112X != null) {
            m43112X.dispose();
            m43102C0(C13074j2.f35455a);
        }
        C13033a0 c13033a0 = obj instanceof C13033a0 ? (C13033a0) obj : null;
        Throwable th2 = c13033a0 != null ? c13033a0.f35388a : null;
        if (!(interfaceC13105r1 instanceof AbstractC13045c2)) {
            C13070i2 mo43065c = interfaceC13105r1.mo43065c();
            if (mo43065c != null) {
                m43096s0(mo43065c, th2);
                return;
            }
            return;
        }
        try {
            ((AbstractC13045c2) interfaceC13105r1).mo43063v(th2);
        } catch (Throwable th3) {
            mo43034a0(new C13048d0("Exception in completion handler " + interfaceC13105r1 + " for " + this, th3));
        }
    }

    /* renamed from: G0 */
    public static /* synthetic */ CancellationException m43073G0(C13050d2 c13050d2, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return c13050d2.m43104F0(th2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final void m43074H(c cVar, C13111t c13111t, Object obj) {
        C13111t m43092q0 = m43092q0(c13111t);
        if (m43092q0 == null || !m43082M0(cVar, m43092q0, obj)) {
            mo21552t(m43078K(cVar, obj));
        }
    }

    /* renamed from: I0 */
    private final boolean m43075I0(InterfaceC13105r1 interfaceC13105r1, Object obj) {
        if (!C0741b.m3751a(f35402a, this, interfaceC13105r1, C13054e2.m43157g(obj))) {
            return false;
        }
        m43125t0(null);
        mo43036u0(obj);
        m43072G(interfaceC13105r1, obj);
        return true;
    }

    /* renamed from: J */
    private final Throwable m43076J(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new C13129x1(mo43029D(), null, this) : th2;
        }
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC13082l2) obj).mo43106I();
    }

    /* renamed from: J0 */
    private final boolean m43077J0(InterfaceC13105r1 interfaceC13105r1, Throwable th2) {
        C13070i2 m43085W = m43085W(interfaceC13105r1);
        if (m43085W == null) {
            return false;
        }
        if (!C0741b.m3751a(f35402a, this, interfaceC13105r1, new c(m43085W, false, th2))) {
            return false;
        }
        m43094r0(m43085W, th2);
        return true;
    }

    /* renamed from: K */
    private final Object m43078K(c cVar, Object obj) {
        boolean m43138g;
        Throwable m43084P;
        C13033a0 c13033a0 = obj instanceof C13033a0 ? (C13033a0) obj : null;
        Throwable th2 = c13033a0 != null ? c13033a0.f35388a : null;
        synchronized (cVar) {
            m43138g = cVar.m43138g();
            List<Throwable> m43141j = cVar.m43141j(th2);
            m43084P = m43084P(cVar, m43141j);
            if (m43084P != null) {
                m43095s(m43084P, m43141j);
            }
        }
        if (m43084P != null && m43084P != th2) {
            obj = new C13033a0(m43084P, false, 2, null);
        }
        if (m43084P != null) {
            if (m43069C(m43084P) || mo43114Z(m43084P)) {
                C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((C13033a0) obj).m43038b();
            }
        }
        if (!m43138g) {
            m43125t0(m43084P);
        }
        mo43036u0(obj);
        C0741b.m3751a(f35402a, this, cVar, C13054e2.m43157g(obj));
        m43072G(cVar, obj);
        return obj;
    }

    /* renamed from: K0 */
    private final Object m43079K0(Object obj, Object obj2) {
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        if (!(obj instanceof InterfaceC13105r1)) {
            c7223h02 = C13054e2.f35424a;
            return c7223h02;
        }
        if ((!(obj instanceof C13057f1) && !(obj instanceof AbstractC13045c2)) || (obj instanceof C13111t) || (obj2 instanceof C13033a0)) {
            return m43081L0((InterfaceC13105r1) obj, obj2);
        }
        if (m43075I0((InterfaceC13105r1) obj, obj2)) {
            return obj2;
        }
        c7223h0 = C13054e2.f35426c;
        return c7223h0;
    }

    /* renamed from: L */
    private final C13111t m43080L(InterfaceC13105r1 interfaceC13105r1) {
        C13111t c13111t = interfaceC13105r1 instanceof C13111t ? (C13111t) interfaceC13105r1 : null;
        if (c13111t != null) {
            return c13111t;
        }
        C13070i2 mo43065c = interfaceC13105r1.mo43065c();
        if (mo43065c != null) {
            return m43092q0(mo43065c);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* renamed from: L0 */
    private final Object m43081L0(InterfaceC13105r1 interfaceC13105r1, Object obj) {
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        C13070i2 m43085W = m43085W(interfaceC13105r1);
        if (m43085W == null) {
            c7223h03 = C13054e2.f35426c;
            return c7223h03;
        }
        c cVar = interfaceC13105r1 instanceof c ? (c) interfaceC13105r1 : null;
        if (cVar == null) {
            cVar = new c(m43085W, false, null);
        }
        C9332x c9332x = new C9332x();
        synchronized (cVar) {
            if (cVar.m43139h()) {
                c7223h02 = C13054e2.f35424a;
                return c7223h02;
            }
            cVar.m43142k(true);
            if (cVar != interfaceC13105r1 && !C0741b.m3751a(f35402a, this, interfaceC13105r1, cVar)) {
                c7223h0 = C13054e2.f35426c;
                return c7223h0;
            }
            boolean m43138g = cVar.m43138g();
            C13033a0 c13033a0 = obj instanceof C13033a0 ? (C13033a0) obj : null;
            if (c13033a0 != null) {
                cVar.m43136b(c13033a0.f35388a);
            }
            ?? m43137f = Boolean.valueOf(m43138g ? false : true).booleanValue() ? cVar.m43137f() : 0;
            c9332x.f22581a = m43137f;
            C2037v c2037v = C2037v.f8089a;
            if (m43137f != 0) {
                m43094r0(m43085W, m43137f);
            }
            C13111t m43080L = m43080L(interfaceC13105r1);
            return (m43080L == null || !m43082M0(cVar, m43080L, obj)) ? m43078K(cVar, obj) : C13054e2.f35425b;
        }
    }

    /* renamed from: M0 */
    private final boolean m43082M0(c cVar, C13111t c13111t, Object obj) {
        while (InterfaceC13125w1.a.m43315d(c13111t.f35481e, false, false, new b(this, cVar, c13111t, obj), 1, null) == C13074j2.f35455a) {
            c13111t = m43092q0(c13111t);
            if (c13111t == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    private final Throwable m43083N(Object obj) {
        C13033a0 c13033a0 = obj instanceof C13033a0 ? (C13033a0) obj : null;
        if (c13033a0 != null) {
            return c13033a0.f35388a;
        }
        return null;
    }

    /* renamed from: P */
    private final Throwable m43084P(c cVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.m43138g()) {
                return new C13129x1(mo43029D(), null, this);
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
        if (th3 instanceof C13122v2) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof C13122v2)) {
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

    /* renamed from: W */
    private final C13070i2 m43085W(InterfaceC13105r1 interfaceC13105r1) {
        C13070i2 mo43065c = interfaceC13105r1.mo43065c();
        if (mo43065c != null) {
            return mo43065c;
        }
        if (interfaceC13105r1 instanceof C13057f1) {
            return new C13070i2();
        }
        if (interfaceC13105r1 instanceof AbstractC13045c2) {
            m43099y0((AbstractC13045c2) interfaceC13105r1);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC13105r1).toString());
    }

    /* renamed from: f0 */
    private final boolean m43086f0() {
        Object m43113Y;
        do {
            m43113Y = m43113Y();
            if (!(m43113Y instanceof InterfaceC13105r1)) {
                return false;
            }
        } while (m43070D0(m43113Y) < 0);
        return true;
    }

    /* renamed from: g0 */
    private final Object m43087g0(Continuation<? super C2037v> continuation) {
        Continuation m23654b;
        Object m23655c;
        Object m23655c2;
        m23654b = C7751c.m23654b(continuation);
        C13087n c13087n = new C13087n(m23654b, 1);
        c13087n.m43269z();
        C13095p.m43278a(c13087n, mo43109R(new C13090n2(c13087n)));
        Object m43267w = c13087n.m43267w();
        m23655c = C7752d.m23655c();
        if (m43267w == m23655c) {
            C9302h.m27753c(continuation);
        }
        m23655c2 = C7752d.m23655c();
        return m43267w == m23655c2 ? m43267w : C2037v.f8089a;
    }

    /* renamed from: k0 */
    private final Object m43088k0(Object obj) {
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        C7223h0 c7223h04;
        C7223h0 c7223h05;
        C7223h0 c7223h06;
        Throwable th2 = null;
        while (true) {
            Object m43113Y = m43113Y();
            if (m43113Y instanceof c) {
                synchronized (m43113Y) {
                    if (((c) m43113Y).m43140i()) {
                        c7223h02 = C13054e2.f35427d;
                        return c7223h02;
                    }
                    boolean m43138g = ((c) m43113Y).m43138g();
                    if (obj != null || !m43138g) {
                        if (th2 == null) {
                            th2 = m43076J(obj);
                        }
                        ((c) m43113Y).m43136b(th2);
                    }
                    Throwable m43137f = m43138g ^ true ? ((c) m43113Y).m43137f() : null;
                    if (m43137f != null) {
                        m43094r0(((c) m43113Y).mo43065c(), m43137f);
                    }
                    c7223h0 = C13054e2.f35424a;
                    return c7223h0;
                }
            }
            if (!(m43113Y instanceof InterfaceC13105r1)) {
                c7223h03 = C13054e2.f35427d;
                return c7223h03;
            }
            if (th2 == null) {
                th2 = m43076J(obj);
            }
            InterfaceC13105r1 interfaceC13105r1 = (InterfaceC13105r1) m43113Y;
            if (!interfaceC13105r1.mo43064a()) {
                Object m43079K0 = m43079K0(m43113Y, new C13033a0(th2, false, 2, null));
                c7223h05 = C13054e2.f35424a;
                if (m43079K0 == c7223h05) {
                    throw new IllegalStateException(("Cannot happen in " + m43113Y).toString());
                }
                c7223h06 = C13054e2.f35426c;
                if (m43079K0 != c7223h06) {
                    return m43079K0;
                }
            } else if (m43077J0(interfaceC13105r1, th2)) {
                c7223h04 = C13054e2.f35424a;
                return c7223h04;
            }
        }
    }

    /* renamed from: o0 */
    private final AbstractC13045c2 m43090o0(InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l, boolean z10) {
        AbstractC13045c2 abstractC13045c2;
        if (z10) {
            abstractC13045c2 = interfaceC9998l instanceof AbstractC13133y1 ? (AbstractC13133y1) interfaceC9998l : null;
            if (abstractC13045c2 == null) {
                abstractC13045c2 = new C13117u1(interfaceC9998l);
            }
        } else {
            abstractC13045c2 = interfaceC9998l instanceof AbstractC13045c2 ? (AbstractC13045c2) interfaceC9998l : null;
            if (abstractC13045c2 == null) {
                abstractC13045c2 = new C13121v1(interfaceC9998l);
            }
        }
        abstractC13045c2.m43067x(this);
        return abstractC13045c2;
    }

    /* renamed from: q0 */
    private final C13111t m43092q0(C7243s c7243s) {
        while (c7243s.mo21643q()) {
            c7243s = c7243s.m21655p();
        }
        while (true) {
            c7243s = c7243s.m21654o();
            if (!c7243s.mo21643q()) {
                if (c7243s instanceof C13111t) {
                    return (C13111t) c7243s;
                }
                if (c7243s instanceof C13070i2) {
                    return null;
                }
            }
        }
    }

    /* renamed from: r */
    private final boolean m43093r(Object obj, C13070i2 c13070i2, AbstractC13045c2 abstractC13045c2) {
        int m21658u;
        d dVar = new d(abstractC13045c2, this, obj);
        do {
            m21658u = c13070i2.m21655p().m21658u(abstractC13045c2, c13070i2, dVar);
            if (m21658u == 1) {
                return true;
            }
        } while (m21658u != 2);
        return false;
    }

    /* renamed from: r0 */
    private final void m43094r0(C13070i2 c13070i2, Throwable th2) {
        m43125t0(th2);
        Object m21653l = c13070i2.m21653l();
        C9322n.m27779c(m21653l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C13048d0 c13048d0 = null;
        for (C7243s c7243s = (C7243s) m21653l; !C9322n.m27777a(c7243s, c13070i2); c7243s = c7243s.m21654o()) {
            if (c7243s instanceof AbstractC13133y1) {
                AbstractC13045c2 abstractC13045c2 = (AbstractC13045c2) c7243s;
                try {
                    abstractC13045c2.mo43063v(th2);
                } catch (Throwable th3) {
                    if (c13048d0 != null) {
                        C2017b.m10328a(c13048d0, th3);
                    } else {
                        c13048d0 = new C13048d0("Exception in completion handler " + abstractC13045c2 + " for " + this, th3);
                        C2037v c2037v = C2037v.f8089a;
                    }
                }
            }
        }
        if (c13048d0 != null) {
            mo43034a0(c13048d0);
        }
        m43069C(th2);
    }

    /* renamed from: s */
    private final void m43095s(Throwable th2, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th3 : list) {
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                C2017b.m10328a(th2, th3);
            }
        }
    }

    /* renamed from: s0 */
    private final void m43096s0(C13070i2 c13070i2, Throwable th2) {
        Object m21653l = c13070i2.m21653l();
        C9322n.m27779c(m21653l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C13048d0 c13048d0 = null;
        for (C7243s c7243s = (C7243s) m21653l; !C9322n.m27777a(c7243s, c13070i2); c7243s = c7243s.m21654o()) {
            if (c7243s instanceof AbstractC13045c2) {
                AbstractC13045c2 abstractC13045c2 = (AbstractC13045c2) c7243s;
                try {
                    abstractC13045c2.mo43063v(th2);
                } catch (Throwable th3) {
                    if (c13048d0 != null) {
                        C2017b.m10328a(c13048d0, th3);
                    } else {
                        c13048d0 = new C13048d0("Exception in completion handler " + abstractC13045c2 + " for " + this, th3);
                        C2037v c2037v = C2037v.f8089a;
                    }
                }
            }
        }
        if (c13048d0 != null) {
            mo43034a0(c13048d0);
        }
    }

    /* renamed from: v */
    private final Object m43097v(Continuation<Object> continuation) {
        Continuation m23654b;
        Object m23655c;
        m23654b = C7751c.m23654b(continuation);
        a aVar = new a(m23654b, this);
        aVar.m43269z();
        C13095p.m43278a(aVar, mo43109R(new C13086m2(aVar)));
        Object m43267w = aVar.m43267w();
        m23655c = C7752d.m23655c();
        if (m43267w == m23655c) {
            C9302h.m27753c(continuation);
        }
        return m43267w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [zk.q1] */
    /* renamed from: x0 */
    private final void m43098x0(C13057f1 c13057f1) {
        C13070i2 c13070i2 = new C13070i2();
        if (!c13057f1.mo43064a()) {
            c13070i2 = new C13101q1(c13070i2);
        }
        C0741b.m3751a(f35402a, this, c13057f1, c13070i2);
    }

    /* renamed from: y0 */
    private final void m43099y0(AbstractC13045c2 abstractC13045c2) {
        abstractC13045c2.m21652g(new C13070i2());
        C0741b.m3751a(f35402a, this, abstractC13045c2, abstractC13045c2.m21654o());
    }

    /* renamed from: A0 */
    public final void m43100A0(AbstractC13045c2 abstractC13045c2) {
        Object m43113Y;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C13057f1 c13057f1;
        do {
            m43113Y = m43113Y();
            if (!(m43113Y instanceof AbstractC13045c2)) {
                if (!(m43113Y instanceof InterfaceC13105r1) || ((InterfaceC13105r1) m43113Y).mo43065c() == null) {
                    return;
                }
                abstractC13045c2.m21656r();
                return;
            }
            if (m43113Y != abstractC13045c2) {
                return;
            }
            atomicReferenceFieldUpdater = f35402a;
            c13057f1 = C13054e2.f35430g;
        } while (!C0741b.m3751a(atomicReferenceFieldUpdater, this, m43113Y, c13057f1));
    }

    @Override // p494zk.InterfaceC13125w1
    /* renamed from: B0 */
    public final Object mo43101B0(Continuation<? super C2037v> continuation) {
        Object m23655c;
        if (!m43086f0()) {
            C13035a2.m43049h(continuation.getContext());
            return C2037v.f8089a;
        }
        Object m43087g0 = m43087g0(continuation);
        m23655c = C7752d.m23655c();
        return m43087g0 == m23655c ? m43087g0 : C2037v.f8089a;
    }

    /* renamed from: C0 */
    public final void m43102C0(InterfaceC13107s interfaceC13107s) {
        f35403b.set(this, interfaceC13107s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public String mo43029D() {
        return "Job was cancelled";
    }

    /* renamed from: F */
    public boolean mo43103F(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return m43129x(th2) && mo43110T();
    }

    /* renamed from: F0 */
    protected final CancellationException m43104F0(Throwable th2, String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo43029D();
            }
            cancellationException = new C13129x1(str, th2, this);
        }
        return cancellationException;
    }

    /* renamed from: H0 */
    public final String m43105H0() {
        return mo43035p0() + '{' + m43071E0(m43113Y()) + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // p494zk.InterfaceC13082l2
    /* renamed from: I */
    public CancellationException mo43106I() {
        CancellationException cancellationException;
        Object m43113Y = m43113Y();
        if (m43113Y instanceof c) {
            cancellationException = ((c) m43113Y).m43137f();
        } else if (m43113Y instanceof C13033a0) {
            cancellationException = ((C13033a0) m43113Y).f35388a;
        } else {
            if (m43113Y instanceof InterfaceC13105r1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + m43113Y).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new C13129x1("Parent job is " + m43071E0(m43113Y), cancellationException, this);
    }

    /* renamed from: M */
    public final Object m43107M() {
        Object m43113Y = m43113Y();
        if (!(!(m43113Y instanceof InterfaceC13105r1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (m43113Y instanceof C13033a0) {
            throw ((C13033a0) m43113Y).f35388a;
        }
        return C13054e2.m43158h(m43113Y);
    }

    @Override // p494zk.InterfaceC13125w1
    /* renamed from: O */
    public void mo43108O(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C13129x1(mo43029D(), null, this);
        }
        m43130z(cancellationException);
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: Q */
    public InterfaceC7587f mo20645Q(InterfaceC7587f.c<?> cVar) {
        return InterfaceC13125w1.a.m43316e(this, cVar);
    }

    @Override // p494zk.InterfaceC13125w1
    /* renamed from: R */
    public final InterfaceC13044c1 mo43109R(InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        return mo43122m0(false, true, interfaceC9998l);
    }

    /* renamed from: T */
    public boolean mo43110T() {
        return true;
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: U */
    public InterfaceC7587f mo20646U(InterfaceC7587f interfaceC7587f) {
        return InterfaceC13125w1.a.m43317f(this, interfaceC7587f);
    }

    /* renamed from: V */
    public boolean mo43111V() {
        return false;
    }

    /* renamed from: X */
    public final InterfaceC13107s m43112X() {
        return (InterfaceC13107s) f35403b.get(this);
    }

    /* renamed from: Y */
    public final Object m43113Y() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35402a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC7209a0)) {
                return obj;
            }
            ((AbstractC7209a0) obj).mo21539a(this);
        }
    }

    /* renamed from: Z */
    protected boolean mo43114Z(Throwable th2) {
        return false;
    }

    @Override // p494zk.InterfaceC13125w1
    /* renamed from: a */
    public boolean mo43033a() {
        Object m43113Y = m43113Y();
        return (m43113Y instanceof InterfaceC13105r1) && ((InterfaceC13105r1) m43113Y).mo43064a();
    }

    /* renamed from: a0 */
    public void mo43034a0(Throwable th2) {
        throw th2;
    }

    @Override // p124gk.InterfaceC7587f.b, p124gk.InterfaceC7587f
    /* renamed from: b */
    public <E extends InterfaceC7587f.b> E mo20647b(InterfaceC7587f.c<E> cVar) {
        return (E) InterfaceC13125w1.a.m43314c(this, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b0 */
    public final void m43115b0(InterfaceC13125w1 interfaceC13125w1) {
        if (interfaceC13125w1 == null) {
            m43102C0(C13074j2.f35455a);
            return;
        }
        interfaceC13125w1.start();
        InterfaceC13107s mo43120j0 = interfaceC13125w1.mo43120j0(this);
        m43102C0(mo43120j0);
        if (m43117d0()) {
            mo43120j0.dispose();
            m43102C0(C13074j2.f35455a);
        }
    }

    @Override // p494zk.InterfaceC13115u
    /* renamed from: c0 */
    public final void mo43116c0(InterfaceC13082l2 interfaceC13082l2) {
        m43129x(interfaceC13082l2);
    }

    /* renamed from: d0 */
    public final boolean m43117d0() {
        return !(m43113Y() instanceof InterfaceC13105r1);
    }

    /* renamed from: e0 */
    protected boolean mo21551e0() {
        return false;
    }

    @Override // p124gk.InterfaceC7587f.b
    public final InterfaceC7587f.c<?> getKey() {
        return InterfaceC13125w1.f35491q;
    }

    @Override // p494zk.InterfaceC13125w1
    public InterfaceC13125w1 getParent() {
        InterfaceC13107s m43112X = m43112X();
        if (m43112X != null) {
            return m43112X.getParent();
        }
        return null;
    }

    @Override // p494zk.InterfaceC13125w1
    /* renamed from: i */
    public final InterfaceC12228d<InterfaceC13125w1> mo43118i() {
        InterfaceC12228d<InterfaceC13125w1> m39378b;
        m39378b = C12232h.m39378b(new e(null));
        return m39378b;
    }

    @Override // p494zk.InterfaceC13125w1
    public final boolean isCancelled() {
        Object m43113Y = m43113Y();
        return (m43113Y instanceof C13033a0) || ((m43113Y instanceof c) && ((c) m43113Y).m43138g());
    }

    /* renamed from: j */
    public final Throwable m43119j() {
        Object m43113Y = m43113Y();
        if (!(m43113Y instanceof InterfaceC13105r1)) {
            return m43083N(m43113Y);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // p494zk.InterfaceC13125w1
    /* renamed from: j0 */
    public final InterfaceC13107s mo43120j0(InterfaceC13115u interfaceC13115u) {
        InterfaceC13044c1 m43315d = InterfaceC13125w1.a.m43315d(this, true, false, new C13111t(interfaceC13115u), 2, null);
        C9322n.m27779c(m43315d, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC13107s) m43315d;
    }

    /* renamed from: l0 */
    public final boolean m43121l0(Object obj) {
        Object m43079K0;
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        do {
            m43079K0 = m43079K0(m43113Y(), obj);
            c7223h0 = C13054e2.f35424a;
            if (m43079K0 == c7223h0) {
                return false;
            }
            if (m43079K0 == C13054e2.f35425b) {
                return true;
            }
            c7223h02 = C13054e2.f35426c;
        } while (m43079K0 == c7223h02);
        mo21552t(m43079K0);
        return true;
    }

    @Override // p494zk.InterfaceC13125w1
    /* renamed from: m0 */
    public final InterfaceC13044c1 mo43122m0(boolean z10, boolean z11, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        AbstractC13045c2 m43090o0 = m43090o0(interfaceC9998l, z10);
        while (true) {
            Object m43113Y = m43113Y();
            if (m43113Y instanceof C13057f1) {
                C13057f1 c13057f1 = (C13057f1) m43113Y;
                if (!c13057f1.mo43064a()) {
                    m43098x0(c13057f1);
                } else if (C0741b.m3751a(f35402a, this, m43113Y, m43090o0)) {
                    return m43090o0;
                }
            } else {
                if (!(m43113Y instanceof InterfaceC13105r1)) {
                    if (z11) {
                        C13033a0 c13033a0 = m43113Y instanceof C13033a0 ? (C13033a0) m43113Y : null;
                        interfaceC9998l.invoke(c13033a0 != null ? c13033a0.f35388a : null);
                    }
                    return C13074j2.f35455a;
                }
                C13070i2 mo43065c = ((InterfaceC13105r1) m43113Y).mo43065c();
                if (mo43065c == null) {
                    C9322n.m27779c(m43113Y, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m43099y0((AbstractC13045c2) m43113Y);
                } else {
                    InterfaceC13044c1 interfaceC13044c1 = C13074j2.f35455a;
                    if (z10 && (m43113Y instanceof c)) {
                        synchronized (m43113Y) {
                            r3 = ((c) m43113Y).m43137f();
                            if (r3 == null || ((interfaceC9998l instanceof C13111t) && !((c) m43113Y).m43139h())) {
                                if (m43093r(m43113Y, mo43065c, m43090o0)) {
                                    if (r3 == null) {
                                        return m43090o0;
                                    }
                                    interfaceC13044c1 = m43090o0;
                                }
                            }
                            C2037v c2037v = C2037v.f8089a;
                        }
                    }
                    if (r3 != null) {
                        if (z11) {
                            interfaceC9998l.invoke(r3);
                        }
                        return interfaceC13044c1;
                    }
                    if (m43093r(m43113Y, mo43065c, m43090o0)) {
                        return m43090o0;
                    }
                }
            }
        }
    }

    @Override // p494zk.InterfaceC13125w1
    /* renamed from: n */
    public final CancellationException mo43123n() {
        Object m43113Y = m43113Y();
        if (!(m43113Y instanceof c)) {
            if (m43113Y instanceof InterfaceC13105r1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (m43113Y instanceof C13033a0) {
                return m43073G0(this, ((C13033a0) m43113Y).f35388a, null, 1, null);
            }
            return new C13129x1(C13092o0.m43273a(this) + " has completed normally", null, this);
        }
        Throwable m43137f = ((c) m43113Y).m43137f();
        if (m43137f != null) {
            CancellationException m43104F0 = m43104F0(m43137f, C13092o0.m43273a(this) + " is cancelling");
            if (m43104F0 != null) {
                return m43104F0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* renamed from: n0 */
    public final Object m43124n0(Object obj) {
        Object m43079K0;
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        do {
            m43079K0 = m43079K0(m43113Y(), obj);
            c7223h0 = C13054e2.f35424a;
            if (m43079K0 == c7223h0) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m43083N(obj));
            }
            c7223h02 = C13054e2.f35426c;
        } while (m43079K0 == c7223h02);
        return m43079K0;
    }

    /* renamed from: p0 */
    public String mo43035p0() {
        return C13092o0.m43273a(this);
    }

    @Override // p494zk.InterfaceC13125w1
    public final boolean start() {
        int m43070D0;
        do {
            m43070D0 = m43070D0(m43113Y());
            if (m43070D0 == 0) {
                return false;
            }
        } while (m43070D0 != 1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public void mo21552t(Object obj) {
    }

    /* renamed from: t0 */
    protected void m43125t0(Throwable th2) {
    }

    public String toString() {
        return m43105H0() + '@' + C13092o0.m43274b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final Object m43126u(Continuation<Object> continuation) {
        Object m43113Y;
        do {
            m43113Y = m43113Y();
            if (!(m43113Y instanceof InterfaceC13105r1)) {
                if (m43113Y instanceof C13033a0) {
                    throw ((C13033a0) m43113Y).f35388a;
                }
                return C13054e2.m43158h(m43113Y);
            }
        } while (m43070D0(m43113Y) < 0);
        return m43097v(continuation);
    }

    /* renamed from: u0 */
    protected void mo43036u0(Object obj) {
    }

    /* renamed from: w */
    public final boolean m43127w(Throwable th2) {
        return m43129x(th2);
    }

    /* renamed from: w0 */
    protected void mo43128w0() {
    }

    /* renamed from: x */
    public final boolean m43129x(Object obj) {
        Object obj2;
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        obj2 = C13054e2.f35424a;
        if (mo43111V() && (obj2 = m43068A(obj)) == C13054e2.f35425b) {
            return true;
        }
        c7223h0 = C13054e2.f35424a;
        if (obj2 == c7223h0) {
            obj2 = m43088k0(obj);
        }
        c7223h02 = C13054e2.f35424a;
        if (obj2 == c7223h02 || obj2 == C13054e2.f35425b) {
            return true;
        }
        c7223h03 = C13054e2.f35427d;
        if (obj2 == c7223h03) {
            return false;
        }
        mo21552t(obj2);
        return true;
    }

    /* renamed from: z */
    public void m43130z(Throwable th2) {
        m43129x(th2);
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: z0 */
    public <R> R mo20648z0(R r10, InterfaceC10002p<? super R, ? super InterfaceC7587f.b, ? extends R> interfaceC10002p) {
        return (R) InterfaceC13125w1.a.m43313b(this, r10, interfaceC10002p);
    }
}
