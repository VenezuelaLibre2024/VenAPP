package p030bl;

import androidx.concurrent.futures.C0741b;
import ck.C2029n;
import ck.C2030o;
import ck.C2037v;
import hk.C7751c;
import hk.C7752d;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C9296b;
import kotlin.coroutines.jvm.internal.C9302h;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p089el.AbstractC7216e;
import p089el.AbstractC7217e0;
import p089el.C7214d;
import p089el.C7219f0;
import p089el.C7221g0;
import p089el.C7223h0;
import p089el.C7241q0;
import p089el.C7250z;
import p124gk.Continuation;
import p146hl.C7753a;
import p146hl.EnumC7756d;
import p146hl.InterfaceC7754b;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC10003q;
import p280ok.InterfaceC9998l;
import p494zk.C13087n;
import p494zk.C13095p;
import p494zk.InterfaceC13041b3;
import p494zk.InterfaceC13083m;

/* renamed from: bl.b */
/* loaded from: classes3.dex */
public class C1808b<E> implements InterfaceC1810d<E> {

    /* renamed from: e */
    private static final AtomicLongFieldUpdater f7668e = AtomicLongFieldUpdater.newUpdater(C1808b.class, "sendersAndCloseStatus");

    /* renamed from: f */
    private static final AtomicLongFieldUpdater f7669f = AtomicLongFieldUpdater.newUpdater(C1808b.class, "receivers");

    /* renamed from: g */
    private static final AtomicLongFieldUpdater f7670g = AtomicLongFieldUpdater.newUpdater(C1808b.class, "bufferEnd");

    /* renamed from: h */
    private static final AtomicLongFieldUpdater f7671h = AtomicLongFieldUpdater.newUpdater(C1808b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f7672i = AtomicReferenceFieldUpdater.newUpdater(C1808b.class, Object.class, "sendSegment");

    /* renamed from: j */
    private static final AtomicReferenceFieldUpdater f7673j = AtomicReferenceFieldUpdater.newUpdater(C1808b.class, Object.class, "receiveSegment");

    /* renamed from: k */
    private static final AtomicReferenceFieldUpdater f7674k = AtomicReferenceFieldUpdater.newUpdater(C1808b.class, Object.class, "bufferEndSegment");

    /* renamed from: l */
    private static final AtomicReferenceFieldUpdater f7675l = AtomicReferenceFieldUpdater.newUpdater(C1808b.class, Object.class, "_closeCause");

    /* renamed from: m */
    private static final AtomicReferenceFieldUpdater f7676m = AtomicReferenceFieldUpdater.newUpdater(C1808b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: b */
    private final int f7677b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c */
    public final InterfaceC9998l<E, C2037v> f7678c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: d */
    private final InterfaceC10003q<InterfaceC7754b<?>, Object, Object, InterfaceC9998l<Throwable, C2037v>> f7679d;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bl.b$a */
    /* loaded from: classes3.dex */
    public final class a implements InterfaceC1811e<E>, InterfaceC13041b3 {

        /* renamed from: a */
        private Object f7680a;

        /* renamed from: b */
        private C13087n<? super Boolean> f7681b;

        public a() {
            C7223h0 c7223h0;
            c7223h0 = C1809c.f7704p;
            this.f7680a = c7223h0;
        }

        /* renamed from: e */
        private final Object m9747e(C1815i<E> c1815i, int i10, long j10, Continuation<? super Boolean> continuation) {
            Continuation m23654b;
            C7223h0 c7223h0;
            C7223h0 c7223h02;
            Boolean m27739a;
            C7223h0 c7223h03;
            C7223h0 c7223h04;
            C7223h0 c7223h05;
            Object m23655c;
            C1808b<E> c1808b = C1808b.this;
            m23654b = C7751c.m23654b(continuation);
            C13087n m43279b = C13095p.m43279b(m23654b);
            try {
                this.f7681b = m43279b;
                Object m9714r0 = c1808b.m9714r0(c1815i, i10, j10, this);
                c7223h0 = C1809c.f7701m;
                if (m9714r0 == c7223h0) {
                    c1808b.m9688e0(this, c1815i, i10);
                } else {
                    c7223h02 = C1809c.f7703o;
                    InterfaceC9998l<Throwable, C2037v> interfaceC9998l = null;
                    if (m9714r0 == c7223h02) {
                        if (j10 < c1808b.m9729I()) {
                            c1815i.m21557b();
                        }
                        C1815i c1815i2 = (C1815i) C1808b.f7673j.get(c1808b);
                        while (true) {
                            if (c1808b.m9731P()) {
                                m9749h();
                                break;
                            }
                            long andIncrement = C1808b.f7669f.getAndIncrement(c1808b);
                            int i11 = C1809c.f7690b;
                            long j11 = andIncrement / i11;
                            int i12 = (int) (andIncrement % i11);
                            if (c1815i2.f16188c != j11) {
                                C1815i m9669B = c1808b.m9669B(j11, c1815i2);
                                if (m9669B != null) {
                                    c1815i2 = m9669B;
                                }
                            }
                            Object m9714r02 = c1808b.m9714r0(c1815i2, i12, andIncrement, this);
                            c7223h03 = C1809c.f7701m;
                            if (m9714r02 == c7223h03) {
                                c1808b.m9688e0(this, c1815i2, i12);
                                break;
                            }
                            c7223h04 = C1809c.f7703o;
                            if (m9714r02 != c7223h04) {
                                c7223h05 = C1809c.f7702n;
                                if (m9714r02 == c7223h05) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                c1815i2.m21557b();
                                this.f7680a = m9714r02;
                                this.f7681b = null;
                                m27739a = C9296b.m27739a(true);
                                InterfaceC9998l<E, C2037v> interfaceC9998l2 = c1808b.f7678c;
                                if (interfaceC9998l2 != null) {
                                    interfaceC9998l = C7250z.m21687a(interfaceC9998l2, m9714r02, m43279b.getContext());
                                }
                            } else if (andIncrement < c1808b.m9729I()) {
                                c1815i2.m21557b();
                            }
                        }
                    } else {
                        c1815i.m21557b();
                        this.f7680a = m9714r0;
                        this.f7681b = null;
                        m27739a = C9296b.m27739a(true);
                        InterfaceC9998l<E, C2037v> interfaceC9998l3 = c1808b.f7678c;
                        if (interfaceC9998l3 != null) {
                            interfaceC9998l = C7250z.m21687a(interfaceC9998l3, m9714r0, m43279b.getContext());
                        }
                    }
                    m43279b.mo24599c(m27739a, interfaceC9998l);
                }
                Object m43267w = m43279b.m43267w();
                m23655c = C7752d.m23655c();
                if (m43267w == m23655c) {
                    C9302h.m27753c(continuation);
                }
                return m43267w;
            } catch (Throwable th2) {
                m43279b.m43260I();
                throw th2;
            }
        }

        /* renamed from: g */
        private final boolean m9748g() {
            this.f7680a = C1809c.m9786z();
            Throwable m9726E = C1808b.this.m9726E();
            if (m9726E == null) {
                return false;
            }
            throw C7221g0.m21573a(m9726E);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public final void m9749h() {
            Object m10348a;
            C13087n<? super Boolean> c13087n = this.f7681b;
            C9322n.m27778b(c13087n);
            this.f7681b = null;
            this.f7680a = C1809c.m9786z();
            Throwable m9726E = C1808b.this.m9726E();
            if (m9726E == null) {
                C2029n.a aVar = C2029n.f8078b;
                m10348a = Boolean.FALSE;
            } else {
                C2029n.a aVar2 = C2029n.f8078b;
                m10348a = C2030o.m10348a(m9726E);
            }
            c13087n.resumeWith(C2029n.m10340b(m10348a));
        }

        @Override // p030bl.InterfaceC1811e
        /* renamed from: a */
        public Object mo9750a(Continuation<? super Boolean> continuation) {
            boolean m9748g;
            C1815i<E> c1815i;
            C7223h0 c7223h0;
            C7223h0 c7223h02;
            C7223h0 c7223h03;
            C1808b<E> c1808b = C1808b.this;
            C1815i<E> c1815i2 = (C1815i) C1808b.f7673j.get(c1808b);
            while (true) {
                if (c1808b.m9731P()) {
                    m9748g = m9748g();
                    break;
                }
                long andIncrement = C1808b.f7669f.getAndIncrement(c1808b);
                int i10 = C1809c.f7690b;
                long j10 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (c1815i2.f16188c != j10) {
                    C1815i<E> m9669B = c1808b.m9669B(j10, c1815i2);
                    if (m9669B == null) {
                        continue;
                    } else {
                        c1815i = m9669B;
                    }
                } else {
                    c1815i = c1815i2;
                }
                Object m9714r0 = c1808b.m9714r0(c1815i, i11, andIncrement, null);
                c7223h0 = C1809c.f7701m;
                if (m9714r0 == c7223h0) {
                    throw new IllegalStateException("unreachable".toString());
                }
                c7223h02 = C1809c.f7703o;
                if (m9714r0 == c7223h02) {
                    if (andIncrement < c1808b.m9729I()) {
                        c1815i.m21557b();
                    }
                    c1815i2 = c1815i;
                } else {
                    c7223h03 = C1809c.f7702n;
                    if (m9714r0 == c7223h03) {
                        return m9747e(c1815i, i11, andIncrement, continuation);
                    }
                    c1815i.m21557b();
                    this.f7680a = m9714r0;
                    m9748g = true;
                }
            }
            return C9296b.m27739a(m9748g);
        }

        @Override // p494zk.InterfaceC13041b3
        /* renamed from: f */
        public void mo9751f(AbstractC7217e0<?> abstractC7217e0, int i10) {
            C13087n<? super Boolean> c13087n = this.f7681b;
            if (c13087n != null) {
                c13087n.mo9751f(abstractC7217e0, i10);
            }
        }

        /* renamed from: i */
        public final boolean m9752i(E e10) {
            boolean m9759B;
            C13087n<? super Boolean> c13087n = this.f7681b;
            C9322n.m27778b(c13087n);
            this.f7681b = null;
            this.f7680a = e10;
            Boolean bool = Boolean.TRUE;
            InterfaceC9998l<E, C2037v> interfaceC9998l = C1808b.this.f7678c;
            m9759B = C1809c.m9759B(c13087n, bool, interfaceC9998l != null ? C7250z.m21687a(interfaceC9998l, e10, c13087n.getContext()) : null);
            return m9759B;
        }

        /* renamed from: j */
        public final void m9753j() {
            Object m10348a;
            C13087n<? super Boolean> c13087n = this.f7681b;
            C9322n.m27778b(c13087n);
            this.f7681b = null;
            this.f7680a = C1809c.m9786z();
            Throwable m9726E = C1808b.this.m9726E();
            if (m9726E == null) {
                C2029n.a aVar = C2029n.f8078b;
                m10348a = Boolean.FALSE;
            } else {
                C2029n.a aVar2 = C2029n.f8078b;
                m10348a = C2030o.m10348a(m9726E);
            }
            c13087n.resumeWith(C2029n.m10340b(m10348a));
        }

        @Override // p030bl.InterfaceC1811e
        public E next() {
            C7223h0 c7223h0;
            C7223h0 c7223h02;
            E e10 = (E) this.f7680a;
            c7223h0 = C1809c.f7704p;
            if (!(e10 != c7223h0)) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            c7223h02 = C1809c.f7704p;
            this.f7680a = c7223h02;
            if (e10 != C1809c.m9786z()) {
                return e10;
            }
            throw C7221g0.m21573a(C1808b.this.m9672F());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bl.b$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC13041b3 {

        /* renamed from: a */
        private final InterfaceC13083m<Boolean> f7683a;

        /* renamed from: b */
        private final /* synthetic */ C13087n<Boolean> f7684b;

        /* renamed from: a */
        public final InterfaceC13083m<Boolean> m9754a() {
            return this.f7683a;
        }

        @Override // p494zk.InterfaceC13041b3
        /* renamed from: f */
        public void mo9751f(AbstractC7217e0<?> abstractC7217e0, int i10) {
            this.f7684b.mo9751f(abstractC7217e0, i10);
        }
    }

    /* renamed from: bl.b$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC9323o implements InterfaceC10003q<InterfaceC7754b<?>, Object, Object, InterfaceC9998l<? super Throwable, ? extends C2037v>> {

        /* renamed from: a */
        final /* synthetic */ C1808b<E> f7685a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bl.b$c$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC9323o implements InterfaceC9998l<Throwable, C2037v> {

            /* renamed from: a */
            final /* synthetic */ Object f7686a;

            /* renamed from: b */
            final /* synthetic */ C1808b<E> f7687b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC7754b<?> f7688c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, C1808b<E> c1808b, InterfaceC7754b<?> interfaceC7754b) {
                super(1);
                this.f7686a = obj;
                this.f7687b = c1808b;
                this.f7688c = interfaceC7754b;
            }

            /* renamed from: a */
            public final void m9757a(Throwable th2) {
                if (this.f7686a != C1809c.m9786z()) {
                    C7250z.m21688b(this.f7687b.f7678c, this.f7686a, this.f7688c.getContext());
                }
            }

            @Override // p280ok.InterfaceC9998l
            public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
                m9757a(th2);
                return C2037v.f8089a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1808b<E> c1808b) {
            super(3);
            this.f7685a = c1808b;
        }

        @Override // p280ok.InterfaceC10003q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC9998l<Throwable, C2037v> mo9756m(InterfaceC7754b<?> interfaceC7754b, Object obj, Object obj2) {
            return new a(obj2, this.f7685a, interfaceC7754b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1808b(int i10, InterfaceC9998l<? super E, C2037v> interfaceC9998l) {
        long m9758A;
        C7223h0 c7223h0;
        this.f7677b = i10;
        this.f7678c = interfaceC9998l;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        m9758A = C1809c.m9758A(i10);
        this.bufferEnd = m9758A;
        this.completedExpandBuffersAndPauseFlag = m9671D();
        C1815i c1815i = new C1815i(0L, null, this, 3);
        this.sendSegment = c1815i;
        this.receiveSegment = c1815i;
        if (m9680U()) {
            c1815i = C1809c.f7689a;
            C9322n.m27779c(c1815i, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = c1815i;
        this.f7679d = interfaceC9998l != 0 ? new c(this) : null;
        c7223h0 = C1809c.f7707s;
        this._closeCause = c7223h0;
    }

    /* renamed from: A */
    private final C1815i<E> m9668A(long j10, C1815i<E> c1815i, long j11) {
        Object m21549c;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7674k;
        InterfaceC10002p interfaceC10002p = (InterfaceC10002p) C1809c.m9785y();
        do {
            m21549c = C7214d.m21549c(c1815i, j10, interfaceC10002p);
            if (C7219f0.m21570c(m21549c)) {
                break;
            }
            AbstractC7217e0 m21569b = C7219f0.m21569b(m21549c);
            while (true) {
                AbstractC7217e0 abstractC7217e0 = (AbstractC7217e0) atomicReferenceFieldUpdater.get(this);
                if (abstractC7217e0.f16188c >= m21569b.f16188c) {
                    break;
                }
                if (!m21569b.m21567q()) {
                    z10 = false;
                    break;
                }
                if (C0741b.m3751a(atomicReferenceFieldUpdater, this, abstractC7217e0, m21569b)) {
                    if (abstractC7217e0.m21565m()) {
                        abstractC7217e0.m21563k();
                    }
                } else if (m21569b.m21565m()) {
                    m21569b.m21563k();
                }
            }
            z10 = true;
        } while (!z10);
        if (C7219f0.m21570c(m21549c)) {
            m9724x();
            m9685Z(j10, c1815i);
        } else {
            C1815i<E> c1815i2 = (C1815i) C7219f0.m21569b(m21549c);
            long j12 = c1815i2.f16188c;
            if (j12 <= j10) {
                return c1815i2;
            }
            int i10 = C1809c.f7690b;
            if (f7670g.compareAndSet(this, j11 + 1, i10 * j12)) {
                m9673K((c1815i2.f16188c * i10) - j11);
                return null;
            }
        }
        m9674L(this, 0L, 1, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final C1815i<E> m9669B(long j10, C1815i<E> c1815i) {
        Object m21549c;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7673j;
        InterfaceC10002p interfaceC10002p = (InterfaceC10002p) C1809c.m9785y();
        do {
            m21549c = C7214d.m21549c(c1815i, j10, interfaceC10002p);
            if (!C7219f0.m21570c(m21549c)) {
                AbstractC7217e0 m21569b = C7219f0.m21569b(m21549c);
                while (true) {
                    AbstractC7217e0 abstractC7217e0 = (AbstractC7217e0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (abstractC7217e0.f16188c >= m21569b.f16188c) {
                        break;
                    }
                    if (!m21569b.m21567q()) {
                        z10 = false;
                        break;
                    }
                    if (C0741b.m3751a(atomicReferenceFieldUpdater, this, abstractC7217e0, m21569b)) {
                        if (abstractC7217e0.m21565m()) {
                            abstractC7217e0.m21563k();
                        }
                    } else if (m21569b.m21565m()) {
                        m21569b.m21563k();
                    }
                }
            } else {
                break;
            }
        } while (!z10);
        if (C7219f0.m21570c(m21549c)) {
            m9724x();
            if (c1815i.f16188c * C1809c.f7690b >= m9729I()) {
                return null;
            }
        } else {
            c1815i = (C1815i) C7219f0.m21569b(m21549c);
            if (!m9680U() && j10 <= m9671D() / C1809c.f7690b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7674k;
                while (true) {
                    AbstractC7217e0 abstractC7217e02 = (AbstractC7217e0) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC7217e02.f16188c >= c1815i.f16188c || !c1815i.m21567q()) {
                        break;
                    }
                    if (C0741b.m3751a(atomicReferenceFieldUpdater2, this, abstractC7217e02, c1815i)) {
                        if (abstractC7217e02.m21565m()) {
                            abstractC7217e02.m21563k();
                        }
                    } else if (c1815i.m21565m()) {
                        c1815i.m21563k();
                    }
                }
            }
            long j11 = c1815i.f16188c;
            if (j11 <= j10) {
                return c1815i;
            }
            int i10 = C1809c.f7690b;
            m9721v0(j11 * i10);
            if (c1815i.f16188c * i10 >= m9729I()) {
                return null;
            }
        }
        c1815i.m21557b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final C1815i<E> m9670C(long j10, C1815i<E> c1815i) {
        Object m21549c;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7672i;
        InterfaceC10002p interfaceC10002p = (InterfaceC10002p) C1809c.m9785y();
        do {
            m21549c = C7214d.m21549c(c1815i, j10, interfaceC10002p);
            if (!C7219f0.m21570c(m21549c)) {
                AbstractC7217e0 m21569b = C7219f0.m21569b(m21549c);
                while (true) {
                    AbstractC7217e0 abstractC7217e0 = (AbstractC7217e0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (abstractC7217e0.f16188c >= m21569b.f16188c) {
                        break;
                    }
                    if (!m21569b.m21567q()) {
                        z10 = false;
                        break;
                    }
                    if (C0741b.m3751a(atomicReferenceFieldUpdater, this, abstractC7217e0, m21569b)) {
                        if (abstractC7217e0.m21565m()) {
                            abstractC7217e0.m21563k();
                        }
                    } else if (m21569b.m21565m()) {
                        m21569b.m21563k();
                    }
                }
            } else {
                break;
            }
        } while (!z10);
        if (C7219f0.m21570c(m21549c)) {
            m9724x();
            if (c1815i.f16188c * C1809c.f7690b >= m9727G()) {
                return null;
            }
        } else {
            c1815i = (C1815i) C7219f0.m21569b(m21549c);
            long j11 = c1815i.f16188c;
            if (j11 <= j10) {
                return c1815i;
            }
            int i10 = C1809c.f7690b;
            m9723w0(j11 * i10);
            if (c1815i.f16188c * i10 >= m9727G()) {
                return null;
            }
        }
        c1815i.m21557b();
        return null;
    }

    /* renamed from: D */
    private final long m9671D() {
        return f7670g.get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final Throwable m9672F() {
        Throwable m9726E = m9726E();
        return m9726E == null ? new C1816j("Channel was closed") : m9726E;
    }

    /* renamed from: K */
    private final void m9673K(long j10) {
        if (!((f7671h.addAndGet(this, j10) & 4611686018427387904L) != 0)) {
            return;
        }
        do {
        } while ((f7671h.get(this) & 4611686018427387904L) != 0);
    }

    /* renamed from: L */
    static /* synthetic */ void m9674L(C1808b c1808b, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        c1808b.m9673K(j10);
    }

    /* renamed from: M */
    private final void m9675M() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7676m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!C0741b.m3751a(atomicReferenceFieldUpdater, this, obj, obj == null ? C1809c.f7705q : C1809c.f7706r));
        if (obj == null) {
            return;
        }
        ((InterfaceC9998l) obj).invoke(m9726E());
    }

    /* renamed from: N */
    private final boolean m9676N(C1815i<E> c1815i, int i10, long j10) {
        Object m9816w;
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        C7223h0 c7223h04;
        C7223h0 c7223h05;
        C7223h0 c7223h06;
        C7223h0 c7223h07;
        do {
            m9816w = c1815i.m9816w(i10);
            if (m9816w != null) {
                c7223h02 = C1809c.f7693e;
                if (m9816w != c7223h02) {
                    if (m9816w == C1809c.f7692d) {
                        return true;
                    }
                    c7223h03 = C1809c.f7698j;
                    if (m9816w == c7223h03 || m9816w == C1809c.m9786z()) {
                        return false;
                    }
                    c7223h04 = C1809c.f7697i;
                    if (m9816w == c7223h04) {
                        return false;
                    }
                    c7223h05 = C1809c.f7696h;
                    if (m9816w == c7223h05) {
                        return false;
                    }
                    c7223h06 = C1809c.f7695g;
                    if (m9816w == c7223h06) {
                        return true;
                    }
                    c7223h07 = C1809c.f7694f;
                    return m9816w != c7223h07 && j10 == m9727G();
                }
            }
            c7223h0 = C1809c.f7696h;
        } while (!c1815i.m9811r(i10, m9816w, c7223h0));
        m9725z();
        return false;
    }

    /* renamed from: O */
    private final boolean m9677O(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            m9722w(j10 & 1152921504606846975L);
            if (z10 && m9730J()) {
                return false;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i10).toString());
            }
            m9720v(j10 & 1152921504606846975L);
        }
        return true;
    }

    /* renamed from: Q */
    private final boolean m9678Q(long j10) {
        return m9677O(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public final boolean m9679S(long j10) {
        return m9677O(j10, false);
    }

    /* renamed from: U */
    private final boolean m9680U() {
        long m9671D = m9671D();
        return m9671D == 0 || m9671D == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (p030bl.C1815i) r8.m21559g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m9681V(p030bl.C1815i<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = p030bl.C1809c.f7690b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f16188c
            int r5 = p030bl.C1809c.f7690b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.m9727G()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.m9816w(r0)
            if (r1 == 0) goto L2c
            el.h0 r2 = p030bl.C1809c.m9771k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            el.h0 r2 = p030bl.C1809c.f7692d
            if (r1 != r2) goto L39
            return r3
        L2c:
            el.h0 r2 = p030bl.C1809c.m9786z()
            boolean r1 = r8.m9811r(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.m21566p()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            el.e r8 = r8.m21559g()
            bl.i r8 = (p030bl.C1815i) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bl.C1808b.m9681V(bl.i):long");
    }

    /* renamed from: W */
    private final void m9682W() {
        long j10;
        long m9783w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7668e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            } else {
                m9783w = C1809c.m9783w(1152921504606846975L & j10, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, m9783w));
    }

    /* renamed from: X */
    private final void m9683X() {
        long j10;
        long m9783w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7668e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            m9783w = C1809c.m9783w(1152921504606846975L & j10, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, m9783w));
    }

    /* renamed from: Y */
    private final void m9684Y() {
        long j10;
        long j11;
        int i10;
        long m9783w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7668e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i11 = (int) (j10 >> 60);
            if (i11 == 0) {
                j11 = j10 & 1152921504606846975L;
                i10 = 2;
            } else {
                if (i11 != 1) {
                    return;
                }
                j11 = j10 & 1152921504606846975L;
                i10 = 3;
            }
            m9783w = C1809c.m9783w(j11, i10);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, m9783w));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Z */
    private final void m9685Z(long j10, C1815i<E> c1815i) {
        boolean z10;
        C1815i<E> c1815i2;
        C1815i<E> c1815i3;
        while (c1815i.f16188c < j10 && (c1815i3 = (C1815i) c1815i.m21558e()) != null) {
            c1815i = c1815i3;
        }
        while (true) {
            if (!c1815i.mo21560h() || (c1815i2 = (C1815i) c1815i.m21558e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7674k;
                while (true) {
                    AbstractC7217e0 abstractC7217e0 = (AbstractC7217e0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (abstractC7217e0.f16188c >= c1815i.f16188c) {
                        break;
                    }
                    if (!c1815i.m21567q()) {
                        z10 = false;
                        break;
                    } else if (C0741b.m3751a(atomicReferenceFieldUpdater, this, abstractC7217e0, c1815i)) {
                        if (abstractC7217e0.m21565m()) {
                            abstractC7217e0.m21563k();
                        }
                    } else if (c1815i.m21565m()) {
                        c1815i.m21563k();
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                c1815i = c1815i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public final void m9686b0(InterfaceC13083m<? super E> interfaceC13083m) {
        C2029n.a aVar = C2029n.f8078b;
        interfaceC13083m.resumeWith(C2029n.m10340b(C2030o.m10348a(m9672F())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final void m9688e0(InterfaceC13041b3 interfaceC13041b3, C1815i<E> c1815i, int i10) {
        m9740d0();
        interfaceC13041b3.mo9751f(c1815i, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public final void m9690f0(InterfaceC13041b3 interfaceC13041b3, C1815i<E> c1815i, int i10) {
        interfaceC13041b3.mo9751f(c1815i, i10 + C1809c.f7690b);
    }

    /* renamed from: g0 */
    static /* synthetic */ <E> Object m9692g0(C1808b<E> c1808b, Continuation<? super E> continuation) {
        C1815i<E> c1815i;
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        C1815i<E> c1815i2 = (C1815i) f7673j.get(c1808b);
        while (!c1808b.m9731P()) {
            long andIncrement = f7669f.getAndIncrement(c1808b);
            int i10 = C1809c.f7690b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (c1815i2.f16188c != j10) {
                C1815i<E> m9669B = c1808b.m9669B(j10, c1815i2);
                if (m9669B == null) {
                    continue;
                } else {
                    c1815i = m9669B;
                }
            } else {
                c1815i = c1815i2;
            }
            Object m9714r0 = c1808b.m9714r0(c1815i, i11, andIncrement, null);
            c7223h0 = C1809c.f7701m;
            if (m9714r0 == c7223h0) {
                throw new IllegalStateException("unexpected".toString());
            }
            c7223h02 = C1809c.f7703o;
            if (m9714r0 != c7223h02) {
                c7223h03 = C1809c.f7702n;
                if (m9714r0 == c7223h03) {
                    return c1808b.m9694h0(c1815i, i11, andIncrement, continuation);
                }
                c1815i.m21557b();
                return m9714r0;
            }
            if (andIncrement < c1808b.m9729I()) {
                c1815i.m21557b();
            }
            c1815i2 = c1815i;
        }
        throw C7221g0.m21573a(c1808b.m9672F());
    }

    /* renamed from: h0 */
    private final Object m9694h0(C1815i<E> c1815i, int i10, long j10, Continuation<? super E> continuation) {
        Continuation m23654b;
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        C7223h0 c7223h04;
        C7223h0 c7223h05;
        Object m23655c;
        m23654b = C7751c.m23654b(continuation);
        C13087n m43279b = C13095p.m43279b(m23654b);
        try {
            Object m9714r0 = m9714r0(c1815i, i10, j10, m43279b);
            c7223h0 = C1809c.f7701m;
            if (m9714r0 == c7223h0) {
                m9688e0(m43279b, c1815i, i10);
            } else {
                c7223h02 = C1809c.f7703o;
                InterfaceC9998l<Throwable, C2037v> interfaceC9998l = null;
                interfaceC9998l = null;
                if (m9714r0 == c7223h02) {
                    if (j10 < m9729I()) {
                        c1815i.m21557b();
                    }
                    C1815i c1815i2 = (C1815i) f7673j.get(this);
                    while (true) {
                        if (m9731P()) {
                            m9686b0(m43279b);
                            break;
                        }
                        long andIncrement = f7669f.getAndIncrement(this);
                        int i11 = C1809c.f7690b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (c1815i2.f16188c != j11) {
                            C1815i m9669B = m9669B(j11, c1815i2);
                            if (m9669B != null) {
                                c1815i2 = m9669B;
                            }
                        }
                        m9714r0 = m9714r0(c1815i2, i12, andIncrement, m43279b);
                        c7223h03 = C1809c.f7701m;
                        if (m9714r0 == c7223h03) {
                            C13087n c13087n = m43279b instanceof InterfaceC13041b3 ? m43279b : null;
                            if (c13087n != null) {
                                m9688e0(c13087n, c1815i2, i12);
                            }
                        } else {
                            c7223h04 = C1809c.f7703o;
                            if (m9714r0 != c7223h04) {
                                c7223h05 = C1809c.f7702n;
                                if (m9714r0 == c7223h05) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                c1815i2.m21557b();
                                InterfaceC9998l<E, C2037v> interfaceC9998l2 = this.f7678c;
                                if (interfaceC9998l2 != null) {
                                    interfaceC9998l = C7250z.m21687a(interfaceC9998l2, m9714r0, m43279b.getContext());
                                }
                            } else if (andIncrement < m9729I()) {
                                c1815i2.m21557b();
                            }
                        }
                    }
                } else {
                    c1815i.m21557b();
                    InterfaceC9998l<E, C2037v> interfaceC9998l3 = this.f7678c;
                    if (interfaceC9998l3 != null) {
                        interfaceC9998l = C7250z.m21687a(interfaceC9998l3, m9714r0, m43279b.getContext());
                    }
                }
                m43279b.mo24599c(m9714r0, interfaceC9998l);
            }
            Object m43267w = m43279b.m43267w();
            m23655c = C7752d.m23655c();
            if (m43267w == m23655c) {
                C9302h.m27753c(continuation);
            }
            return m43267w;
        } catch (Throwable th2) {
            m43279b.m43260I();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00aa, code lost:
    
        r12 = (p030bl.C1815i) r12.m21559g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m9696i0(p030bl.C1815i<E> r12) {
        /*
            r11 = this;
            ok.l<E, ck.v> r0 = r11.f7678c
            r1 = 0
            r2 = 1
            java.lang.Object r3 = p089el.C7234n.m21619b(r1, r2, r1)
        L8:
            int r4 = p030bl.C1809c.f7690b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Laa
            long r6 = r12.f16188c
            int r8 = p030bl.C1809c.f7690b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.m9816w(r4)
            el.h0 r9 = p030bl.C1809c.m9766f()
            if (r8 == r9) goto Lb2
            el.h0 r9 = p030bl.C1809c.f7692d
            if (r8 != r9) goto L47
            long r9 = r11.m9727G()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lb2
            el.h0 r9 = p030bl.C1809c.m9786z()
            boolean r8 = r12.m9811r(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.m9815v(r4)
            el.q0 r1 = p089el.C7250z.m21689c(r0, r5, r1)
        L40:
            r12.m9812s(r4)
        L43:
            r12.m21566p()
            goto La6
        L47:
            el.h0 r9 = p030bl.C1809c.m9771k()
            if (r8 == r9) goto L9b
            if (r8 != 0) goto L50
            goto L9b
        L50:
            boolean r9 = r8 instanceof p494zk.InterfaceC13041b3
            if (r9 != 0) goto L6d
            boolean r9 = r8 instanceof p030bl.C1822p
            if (r9 == 0) goto L59
            goto L6d
        L59:
            el.h0 r9 = p030bl.C1809c.m9776p()
            if (r8 == r9) goto Lb2
            el.h0 r9 = p030bl.C1809c.m9777q()
            if (r8 != r9) goto L66
            goto Lb2
        L66:
            el.h0 r9 = p030bl.C1809c.m9776p()
            if (r8 == r9) goto L16
            goto La6
        L6d:
            long r9 = r11.m9727G()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lb2
            boolean r9 = r8 instanceof p030bl.C1822p
            if (r9 == 0) goto L7f
            r9 = r8
            bl.p r9 = (p030bl.C1822p) r9
            zk.b3 r9 = r9.f7721a
            goto L82
        L7f:
            r9 = r8
            zk.b3 r9 = (p494zk.InterfaceC13041b3) r9
        L82:
            el.h0 r10 = p030bl.C1809c.m9786z()
            boolean r8 = r12.m9811r(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L96
            java.lang.Object r5 = r12.m9815v(r4)
            el.q0 r1 = p089el.C7250z.m21689c(r0, r5, r1)
        L96:
            java.lang.Object r3 = p089el.C7234n.m21620c(r3, r9)
            goto L40
        L9b:
            el.h0 r9 = p030bl.C1809c.m9786z()
            boolean r8 = r12.m9811r(r4, r8, r9)
            if (r8 == 0) goto L16
            goto L43
        La6:
            int r4 = r4 + (-1)
            goto Lb
        Laa:
            el.e r12 = r12.m21559g()
            bl.i r12 = (p030bl.C1815i) r12
            if (r12 != 0) goto L8
        Lb2:
            if (r3 == 0) goto Ld8
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lbe
            zk.b3 r3 = (p494zk.InterfaceC13041b3) r3
            r11.m9700k0(r3)
            goto Ld8
        Lbe:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.C9322n.m27779c(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Lca:
            if (r5 >= r12) goto Ld8
            java.lang.Object r0 = r3.get(r12)
            zk.b3 r0 = (p494zk.InterfaceC13041b3) r0
            r11.m9700k0(r0)
            int r12 = r12 + (-1)
            goto Lca
        Ld8:
            if (r1 != 0) goto Ldb
            return
        Ldb:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bl.C1808b.m9696i0(bl.i):void");
    }

    /* renamed from: j0 */
    private final void m9698j0(InterfaceC13041b3 interfaceC13041b3) {
        m9702l0(interfaceC13041b3, true);
    }

    /* renamed from: k0 */
    private final void m9700k0(InterfaceC13041b3 interfaceC13041b3) {
        m9702l0(interfaceC13041b3, false);
    }

    /* renamed from: l0 */
    private final void m9702l0(InterfaceC13041b3 interfaceC13041b3, boolean z10) {
        Continuation continuation;
        Object m9792b;
        if (interfaceC13041b3 instanceof b) {
            continuation = ((b) interfaceC13041b3).m9754a();
            C2029n.a aVar = C2029n.f8078b;
            m9792b = Boolean.FALSE;
        } else if (interfaceC13041b3 instanceof InterfaceC13083m) {
            continuation = (Continuation) interfaceC13041b3;
            C2029n.a aVar2 = C2029n.f8078b;
            m9792b = C2030o.m10348a(z10 ? m9672F() : m9728H());
        } else {
            if (!(interfaceC13041b3 instanceof C1819m)) {
                if (interfaceC13041b3 instanceof a) {
                    ((a) interfaceC13041b3).m9753j();
                    return;
                } else {
                    if (interfaceC13041b3 instanceof InterfaceC7754b) {
                        ((InterfaceC7754b) interfaceC13041b3).mo23659c(this, C1809c.m9786z());
                        return;
                    }
                    throw new IllegalStateException(("Unexpected waiter: " + interfaceC13041b3).toString());
                }
            }
            continuation = ((C1819m) interfaceC13041b3).f7720a;
            C2029n.a aVar3 = C2029n.f8078b;
            m9792b = C1813g.m9792b(C1813g.f7712b.m9802a(m9726E()));
        }
        continuation.resumeWith(C2029n.m10340b(m9792b));
    }

    /* renamed from: m0 */
    private final boolean m9704m0(long j10) {
        if (m9679S(j10)) {
            return false;
        }
        return !m9713r(j10 & 1152921504606846975L);
    }

    /* renamed from: n0 */
    private final boolean m9706n0(Object obj, E e10) {
        boolean m9759B;
        boolean m9759B2;
        if (obj instanceof InterfaceC7754b) {
            return ((InterfaceC7754b) obj).mo23659c(this, e10);
        }
        if (obj instanceof C1819m) {
            C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C1819m c1819m = (C1819m) obj;
            C13087n<C1813g<? extends E>> c13087n = c1819m.f7720a;
            C1813g m9792b = C1813g.m9792b(C1813g.f7712b.m9804c(e10));
            InterfaceC9998l<E, C2037v> interfaceC9998l = this.f7678c;
            m9759B2 = C1809c.m9759B(c13087n, m9792b, interfaceC9998l != null ? C7250z.m21687a(interfaceC9998l, e10, c1819m.f7720a.getContext()) : null);
            return m9759B2;
        }
        if (obj instanceof a) {
            C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).m9752i(e10);
        }
        if (!(obj instanceof InterfaceC13083m)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        InterfaceC13083m interfaceC13083m = (InterfaceC13083m) obj;
        InterfaceC9998l<E, C2037v> interfaceC9998l2 = this.f7678c;
        m9759B = C1809c.m9759B(interfaceC13083m, e10, interfaceC9998l2 != null ? C7250z.m21687a(interfaceC9998l2, e10, interfaceC13083m.getContext()) : null);
        return m9759B;
    }

    /* renamed from: o0 */
    private final boolean m9708o0(Object obj, C1815i<E> c1815i, int i10) {
        InterfaceC13083m<Boolean> m9754a;
        Object obj2;
        if (obj instanceof InterfaceC13083m) {
            C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            m9754a = (InterfaceC13083m) obj;
            obj2 = C2037v.f8089a;
        } else {
            if (obj instanceof InterfaceC7754b) {
                C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                EnumC7756d m23661h = ((C7753a) obj).m23661h(this, C2037v.f8089a);
                if (m23661h == EnumC7756d.REREGISTER) {
                    c1815i.m9812s(i10);
                }
                return m23661h == EnumC7756d.SUCCESSFUL;
            }
            if (!(obj instanceof b)) {
                throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
            }
            m9754a = ((b) obj).m9754a();
            obj2 = Boolean.TRUE;
        }
        return C1809c.m9760C(m9754a, obj2, null, 2, null);
    }

    /* renamed from: p0 */
    private final boolean m9710p0(C1815i<E> c1815i, int i10, long j10) {
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        Object m9816w = c1815i.m9816w(i10);
        if ((m9816w instanceof InterfaceC13041b3) && j10 >= f7669f.get(this)) {
            c7223h0 = C1809c.f7695g;
            if (c1815i.m9811r(i10, m9816w, c7223h0)) {
                if (m9708o0(m9816w, c1815i, i10)) {
                    c1815i.m9807A(i10, C1809c.f7692d);
                    return true;
                }
                c7223h02 = C1809c.f7698j;
                c1815i.m9807A(i10, c7223h02);
                c1815i.m9817x(i10, false);
                return false;
            }
        }
        return m9712q0(c1815i, i10, j10);
    }

    /* renamed from: q0 */
    private final boolean m9712q0(C1815i<E> c1815i, int i10, long j10) {
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        C7223h0 c7223h04;
        C7223h0 c7223h05;
        C7223h0 c7223h06;
        C7223h0 c7223h07;
        C7223h0 c7223h08;
        while (true) {
            Object m9816w = c1815i.m9816w(i10);
            if (!(m9816w instanceof InterfaceC13041b3)) {
                c7223h03 = C1809c.f7698j;
                if (m9816w != c7223h03) {
                    if (m9816w != null) {
                        if (m9816w != C1809c.f7692d) {
                            c7223h05 = C1809c.f7696h;
                            if (m9816w == c7223h05) {
                                break;
                            }
                            c7223h06 = C1809c.f7697i;
                            if (m9816w == c7223h06) {
                                break;
                            }
                            c7223h07 = C1809c.f7699k;
                            if (m9816w == c7223h07 || m9816w == C1809c.m9786z()) {
                                return true;
                            }
                            c7223h08 = C1809c.f7694f;
                            if (m9816w != c7223h08) {
                                throw new IllegalStateException(("Unexpected cell state: " + m9816w).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        c7223h04 = C1809c.f7693e;
                        if (c1815i.m9811r(i10, m9816w, c7223h04)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j10 >= f7669f.get(this)) {
                c7223h0 = C1809c.f7695g;
                if (c1815i.m9811r(i10, m9816w, c7223h0)) {
                    if (m9708o0(m9816w, c1815i, i10)) {
                        c1815i.m9807A(i10, C1809c.f7692d);
                        return true;
                    }
                    c7223h02 = C1809c.f7698j;
                    c1815i.m9807A(i10, c7223h02);
                    c1815i.m9817x(i10, false);
                    return false;
                }
            } else if (c1815i.m9811r(i10, m9816w, new C1822p((InterfaceC13041b3) m9816w))) {
                return true;
            }
        }
    }

    /* renamed from: r */
    private final boolean m9713r(long j10) {
        return j10 < m9671D() || j10 < m9727G() + ((long) this.f7677b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public final Object m9714r0(C1815i<E> c1815i, int i10, long j10, Object obj) {
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        Object m9816w = c1815i.m9816w(i10);
        if (m9816w == null) {
            if (j10 >= (f7668e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    c7223h03 = C1809c.f7702n;
                    return c7223h03;
                }
                if (c1815i.m9811r(i10, m9816w, obj)) {
                    m9725z();
                    c7223h02 = C1809c.f7701m;
                    return c7223h02;
                }
            }
        } else if (m9816w == C1809c.f7692d) {
            c7223h0 = C1809c.f7697i;
            if (c1815i.m9811r(i10, m9816w, c7223h0)) {
                m9725z();
                return c1815i.m9818y(i10);
            }
        }
        return m9716s0(c1815i, i10, j10, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
    
        r0 = p089el.C7234n.m21620c(r0, r4);
        r9.m9817x(r3, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m9715s(p030bl.C1815i<E> r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = p089el.C7234n.m21619b(r0, r1, r0)
        L6:
            r2 = -1
            if (r9 == 0) goto L67
            int r3 = p030bl.C1809c.f7690b
            int r3 = r3 - r1
        Lc:
            if (r2 >= r3) goto L60
            long r4 = r9.f16188c
            int r6 = p030bl.C1809c.f7690b
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = (long) r3
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L67
        L1a:
            java.lang.Object r4 = r9.m9816w(r3)
            if (r4 == 0) goto L50
            el.h0 r5 = p030bl.C1809c.m9771k()
            if (r4 != r5) goto L27
            goto L50
        L27:
            boolean r5 = r4 instanceof p030bl.C1822p
            if (r5 == 0) goto L41
            el.h0 r5 = p030bl.C1809c.m9786z()
            boolean r5 = r9.m9811r(r3, r4, r5)
            if (r5 == 0) goto L1a
            bl.p r4 = (p030bl.C1822p) r4
            zk.b3 r4 = r4.f7721a
        L39:
            java.lang.Object r0 = p089el.C7234n.m21620c(r0, r4)
            r9.m9817x(r3, r1)
            goto L5d
        L41:
            boolean r5 = r4 instanceof p494zk.InterfaceC13041b3
            if (r5 == 0) goto L5d
            el.h0 r5 = p030bl.C1809c.m9786z()
            boolean r5 = r9.m9811r(r3, r4, r5)
            if (r5 == 0) goto L1a
            goto L39
        L50:
            el.h0 r5 = p030bl.C1809c.m9786z()
            boolean r4 = r9.m9811r(r3, r4, r5)
            if (r4 == 0) goto L1a
            r9.m21566p()
        L5d:
            int r3 = r3 + (-1)
            goto Lc
        L60:
            el.e r9 = r9.m21559g()
            bl.i r9 = (p030bl.C1815i) r9
            goto L6
        L67:
            if (r0 == 0) goto L8d
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 != 0) goto L73
            zk.b3 r0 = (p494zk.InterfaceC13041b3) r0
            r8.m9698j0(r0)
            goto L8d
        L73:
            java.lang.String r9 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.C9322n.m27779c(r0, r9)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r9 = r0.size()
            int r9 = r9 - r1
        L7f:
            if (r2 >= r9) goto L8d
            java.lang.Object r10 = r0.get(r9)
            zk.b3 r10 = (p494zk.InterfaceC13041b3) r10
            r8.m9698j0(r10)
            int r9 = r9 + (-1)
            goto L7f
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bl.C1808b.m9715s(bl.i, long):void");
    }

    /* renamed from: s0 */
    private final Object m9716s0(C1815i<E> c1815i, int i10, long j10, Object obj) {
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        C7223h0 c7223h04;
        C7223h0 c7223h05;
        C7223h0 c7223h06;
        C7223h0 c7223h07;
        C7223h0 c7223h08;
        C7223h0 c7223h09;
        C7223h0 c7223h010;
        C7223h0 c7223h011;
        C7223h0 c7223h012;
        C7223h0 c7223h013;
        C7223h0 c7223h014;
        C7223h0 c7223h015;
        C7223h0 c7223h016;
        while (true) {
            Object m9816w = c1815i.m9816w(i10);
            if (m9816w != null) {
                c7223h05 = C1809c.f7693e;
                if (m9816w != c7223h05) {
                    if (m9816w == C1809c.f7692d) {
                        c7223h06 = C1809c.f7697i;
                        if (c1815i.m9811r(i10, m9816w, c7223h06)) {
                            m9725z();
                            return c1815i.m9818y(i10);
                        }
                    } else {
                        c7223h07 = C1809c.f7698j;
                        if (m9816w == c7223h07) {
                            c7223h08 = C1809c.f7703o;
                            return c7223h08;
                        }
                        c7223h09 = C1809c.f7696h;
                        if (m9816w == c7223h09) {
                            c7223h010 = C1809c.f7703o;
                            return c7223h010;
                        }
                        if (m9816w == C1809c.m9786z()) {
                            m9725z();
                            c7223h011 = C1809c.f7703o;
                            return c7223h011;
                        }
                        c7223h012 = C1809c.f7695g;
                        if (m9816w != c7223h012) {
                            c7223h013 = C1809c.f7694f;
                            if (c1815i.m9811r(i10, m9816w, c7223h013)) {
                                boolean z10 = m9816w instanceof C1822p;
                                if (z10) {
                                    m9816w = ((C1822p) m9816w).f7721a;
                                }
                                if (m9708o0(m9816w, c1815i, i10)) {
                                    c7223h016 = C1809c.f7697i;
                                    c1815i.m9807A(i10, c7223h016);
                                    m9725z();
                                    return c1815i.m9818y(i10);
                                }
                                c7223h014 = C1809c.f7698j;
                                c1815i.m9807A(i10, c7223h014);
                                c1815i.m9817x(i10, false);
                                if (z10) {
                                    m9725z();
                                }
                                c7223h015 = C1809c.f7703o;
                                return c7223h015;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j10 < (f7668e.get(this) & 1152921504606846975L)) {
                c7223h0 = C1809c.f7696h;
                if (c1815i.m9811r(i10, m9816w, c7223h0)) {
                    m9725z();
                    c7223h02 = C1809c.f7703o;
                    return c7223h02;
                }
            } else {
                if (obj == null) {
                    c7223h03 = C1809c.f7702n;
                    return c7223h03;
                }
                if (c1815i.m9811r(i10, m9816w, obj)) {
                    m9725z();
                    c7223h04 = C1809c.f7701m;
                    return c7223h04;
                }
            }
        }
    }

    /* renamed from: t */
    private final C1815i<E> m9717t() {
        Object obj = f7674k.get(this);
        C1815i c1815i = (C1815i) f7672i.get(this);
        if (c1815i.f16188c > ((C1815i) obj).f16188c) {
            obj = c1815i;
        }
        C1815i c1815i2 = (C1815i) f7673j.get(this);
        if (c1815i2.f16188c > ((C1815i) obj).f16188c) {
            obj = c1815i2;
        }
        return (C1815i) C7214d.m21548b((AbstractC7216e) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public final int m9718t0(C1815i<E> c1815i, int i10, E e10, long j10, Object obj, boolean z10) {
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        c1815i.m9808B(i10, e10);
        if (z10) {
            return m9719u0(c1815i, i10, e10, j10, obj, z10);
        }
        Object m9816w = c1815i.m9816w(i10);
        if (m9816w == null) {
            if (m9713r(j10)) {
                if (c1815i.m9811r(i10, null, C1809c.f7692d)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (c1815i.m9811r(i10, null, obj)) {
                    return 2;
                }
            }
        } else if (m9816w instanceof InterfaceC13041b3) {
            c1815i.m9812s(i10);
            if (m9706n0(m9816w, e10)) {
                c7223h03 = C1809c.f7697i;
                c1815i.m9807A(i10, c7223h03);
                m9738c0();
                return 0;
            }
            c7223h0 = C1809c.f7699k;
            Object m9813t = c1815i.m9813t(i10, c7223h0);
            c7223h02 = C1809c.f7699k;
            if (m9813t != c7223h02) {
                c1815i.m9817x(i10, true);
            }
            return 5;
        }
        return m9719u0(c1815i, i10, e10, j10, obj, z10);
    }

    /* renamed from: u0 */
    private final int m9719u0(C1815i<E> c1815i, int i10, E e10, long j10, Object obj, boolean z10) {
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        C7223h0 c7223h04;
        C7223h0 c7223h05;
        C7223h0 c7223h06;
        C7223h0 c7223h07;
        while (true) {
            Object m9816w = c1815i.m9816w(i10);
            if (m9816w != null) {
                c7223h02 = C1809c.f7693e;
                if (m9816w != c7223h02) {
                    c7223h03 = C1809c.f7699k;
                    if (m9816w == c7223h03) {
                        c1815i.m9812s(i10);
                        return 5;
                    }
                    c7223h04 = C1809c.f7696h;
                    if (m9816w == c7223h04) {
                        c1815i.m9812s(i10);
                        return 5;
                    }
                    C7223h0 m9786z = C1809c.m9786z();
                    c1815i.m9812s(i10);
                    if (m9816w == m9786z) {
                        m9724x();
                        return 4;
                    }
                    if (m9816w instanceof C1822p) {
                        m9816w = ((C1822p) m9816w).f7721a;
                    }
                    if (m9706n0(m9816w, e10)) {
                        c7223h07 = C1809c.f7697i;
                        c1815i.m9807A(i10, c7223h07);
                        m9738c0();
                        return 0;
                    }
                    c7223h05 = C1809c.f7699k;
                    Object m9813t = c1815i.m9813t(i10, c7223h05);
                    c7223h06 = C1809c.f7699k;
                    if (m9813t != c7223h06) {
                        c1815i.m9817x(i10, true);
                    }
                    return 5;
                }
                if (c1815i.m9811r(i10, m9816w, C1809c.f7692d)) {
                    return 1;
                }
            } else if (!m9713r(j10) || z10) {
                if (z10) {
                    c7223h0 = C1809c.f7698j;
                    if (c1815i.m9811r(i10, null, c7223h0)) {
                        c1815i.m9817x(i10, false);
                        return 4;
                    }
                } else {
                    if (obj == null) {
                        return 3;
                    }
                    if (c1815i.m9811r(i10, null, obj)) {
                        return 2;
                    }
                }
            } else if (c1815i.m9811r(i10, null, C1809c.f7692d)) {
                return 1;
            }
        }
    }

    /* renamed from: v */
    private final void m9720v(long j10) {
        m9696i0(m9722w(j10));
    }

    /* renamed from: v0 */
    private final void m9721v0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7669f;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
        } while (!f7669f.compareAndSet(this, j11, j10));
    }

    /* renamed from: w */
    private final C1815i<E> m9722w(long j10) {
        C1815i<E> m9717t = m9717t();
        if (mo9733T()) {
            long m9681V = m9681V(m9717t);
            if (m9681V != -1) {
                m9743y(m9681V);
            }
        }
        m9715s(m9717t, j10);
        return m9717t;
    }

    /* renamed from: w0 */
    private final void m9723w0(long j10) {
        long j11;
        long m9783w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7668e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            long j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            } else {
                m9783w = C1809c.m9783w(j12, (int) (j11 >> 60));
            }
        } while (!f7668e.compareAndSet(this, j11, m9783w));
    }

    /* renamed from: x */
    private final void m9724x() {
        m9732R();
    }

    /* renamed from: z */
    private final void m9725z() {
        if (m9680U()) {
            return;
        }
        C1815i<E> c1815i = (C1815i) f7674k.get(this);
        while (true) {
            long andIncrement = f7670g.getAndIncrement(this);
            int i10 = C1809c.f7690b;
            long j10 = andIncrement / i10;
            long m9729I = m9729I();
            long j11 = c1815i.f16188c;
            if (m9729I <= andIncrement) {
                if (j11 < j10 && c1815i.m21558e() != 0) {
                    m9685Z(j10, c1815i);
                }
                m9674L(this, 0L, 1, null);
                return;
            }
            if (j11 != j10) {
                C1815i<E> m9668A = m9668A(j10, c1815i, andIncrement);
                if (m9668A == null) {
                    continue;
                } else {
                    c1815i = m9668A;
                }
            }
            boolean m9710p0 = m9710p0(c1815i, (int) (andIncrement % i10), andIncrement);
            m9674L(this, 0L, 1, null);
            if (m9710p0) {
                return;
            }
        }
    }

    /* renamed from: E */
    protected final Throwable m9726E() {
        return (Throwable) f7675l.get(this);
    }

    /* renamed from: G */
    public final long m9727G() {
        return f7669f.get(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public final Throwable m9728H() {
        Throwable m9726E = m9726E();
        return m9726E == null ? new C1817k("Channel was closed") : m9726E;
    }

    /* renamed from: I */
    public final long m9729I() {
        return f7668e.get(this) & 1152921504606846975L;
    }

    /* renamed from: J */
    public final boolean m9730J() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7673j;
            C1815i<E> c1815i = (C1815i) atomicReferenceFieldUpdater.get(this);
            long m9727G = m9727G();
            if (m9729I() <= m9727G) {
                return false;
            }
            int i10 = C1809c.f7690b;
            long j10 = m9727G / i10;
            if (c1815i.f16188c == j10 || (c1815i = m9669B(j10, c1815i)) != null) {
                c1815i.m21557b();
                if (m9676N(c1815i, (int) (m9727G % i10), m9727G)) {
                    return true;
                }
                f7669f.compareAndSet(this, m9727G, m9727G + 1);
            } else if (((C1815i) atomicReferenceFieldUpdater.get(this)).f16188c < j10) {
                return false;
            }
        }
    }

    /* renamed from: P */
    public boolean m9731P() {
        return m9678Q(f7668e.get(this));
    }

    /* renamed from: R */
    public boolean m9732R() {
        return m9679S(f7668e.get(this));
    }

    /* renamed from: T */
    protected boolean mo9733T() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        return p030bl.C1813g.f7712b.m9804c(ck.C2037v.f8089a);
     */
    @Override // p030bl.InterfaceC1821o
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo9734a(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p030bl.C1808b.f7668e
            long r0 = r0.get(r14)
            boolean r0 = r14.m9704m0(r0)
            if (r0 == 0) goto L13
            bl.g$b r15 = p030bl.C1813g.f7712b
            java.lang.Object r15 = r15.m9803b()
            return r15
        L13:
            el.h0 r8 = p030bl.C1809c.m9770j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = m9697j()
            java.lang.Object r0 = r0.get(r14)
            bl.i r0 = (p030bl.C1815i) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m9699k()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = m9701l(r14, r1)
            int r1 = p030bl.C1809c.f7690b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f16188c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L4e
            bl.i r1 = m9689f(r14, r2, r0)
            if (r1 != 0) goto L4c
            if (r11 == 0) goto L21
            goto L8e
        L4c:
            r13 = r1
            goto L4f
        L4e:
            r13 = r0
        L4f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = m9711q(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb0
            r1 = 1
            if (r0 == r1) goto Lb3
            r1 = 2
            if (r0 == r1) goto L89
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 4
            if (r0 == r1) goto L71
            r1 = 5
            if (r0 == r1) goto L6c
            goto L6f
        L6c:
            r13.m21557b()
        L6f:
            r0 = r13
            goto L21
        L71:
            long r0 = r14.m9727G()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L8e
            r13.m21557b()
            goto L8e
        L7d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L89:
            if (r11 == 0) goto L99
            r13.m21566p()
        L8e:
            bl.g$b r15 = p030bl.C1813g.f7712b
            java.lang.Throwable r0 = r14.m9728H()
            java.lang.Object r15 = r15.m9802a(r0)
            goto Lbb
        L99:
            boolean r15 = r8 instanceof p494zk.InterfaceC13041b3
            if (r15 == 0) goto La0
            zk.b3 r8 = (p494zk.InterfaceC13041b3) r8
            goto La1
        La0:
            r8 = 0
        La1:
            if (r8 == 0) goto La6
            m9707o(r14, r8, r13, r12)
        La6:
            r13.m21566p()
            bl.g$b r15 = p030bl.C1813g.f7712b
            java.lang.Object r15 = r15.m9803b()
            goto Lbb
        Lb0:
            r13.m21557b()
        Lb3:
            bl.g$b r15 = p030bl.C1813g.f7712b
            ck.v r0 = ck.C2037v.f8089a
            java.lang.Object r15 = r15.m9804c(r0)
        Lbb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bl.C1808b.mo9734a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: a0 */
    protected void m9735a0() {
    }

    @Override // p030bl.InterfaceC1820n
    /* renamed from: b */
    public Object mo9736b(Continuation<? super E> continuation) {
        return m9692g0(this, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p030bl.InterfaceC1820n
    /* renamed from: c */
    public Object mo9737c() {
        Object obj;
        C1815i c1815i;
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        C7223h0 c7223h03;
        long j10 = f7669f.get(this);
        long j11 = f7668e.get(this);
        if (m9678Q(j11)) {
            return C1813g.f7712b.m9802a(m9726E());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return C1813g.f7712b.m9803b();
        }
        obj = C1809c.f7699k;
        C1815i c1815i2 = (C1815i) f7673j.get(this);
        while (!m9731P()) {
            long andIncrement = f7669f.getAndIncrement(this);
            int i10 = C1809c.f7690b;
            long j12 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (c1815i2.f16188c != j12) {
                C1815i m9669B = m9669B(j12, c1815i2);
                if (m9669B == null) {
                    continue;
                } else {
                    c1815i = m9669B;
                }
            } else {
                c1815i = c1815i2;
            }
            Object m9714r0 = m9714r0(c1815i, i11, andIncrement, obj);
            c7223h0 = C1809c.f7701m;
            if (m9714r0 == c7223h0) {
                InterfaceC13041b3 interfaceC13041b3 = obj instanceof InterfaceC13041b3 ? (InterfaceC13041b3) obj : null;
                if (interfaceC13041b3 != null) {
                    m9688e0(interfaceC13041b3, c1815i, i11);
                }
                m9742x0(andIncrement);
                c1815i.m21566p();
                return C1813g.f7712b.m9803b();
            }
            c7223h02 = C1809c.f7703o;
            if (m9714r0 != c7223h02) {
                c7223h03 = C1809c.f7702n;
                if (m9714r0 == c7223h03) {
                    throw new IllegalStateException("unexpected".toString());
                }
                c1815i.m21557b();
                return C1813g.f7712b.m9804c(m9714r0);
            }
            if (andIncrement < m9729I()) {
                c1815i.m21557b();
            }
            c1815i2 = c1815i;
        }
        return C1813g.f7712b.m9802a(m9726E());
    }

    /* renamed from: c0 */
    protected void m9738c0() {
    }

    @Override // p030bl.InterfaceC1821o
    /* renamed from: d */
    public boolean mo9739d(Throwable th2) {
        return m9741u(th2, false);
    }

    /* renamed from: d0 */
    protected void m9740d0() {
    }

    @Override // p030bl.InterfaceC1820n
    public InterfaceC1811e<E> iterator() {
        return new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01db, code lost:
    
        r3 = (p030bl.C1815i) r3.m21558e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e2, code lost:
    
        if (r3 != null) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bl.C1808b.toString():java.lang.String");
    }

    /* renamed from: u */
    protected boolean m9741u(Throwable th2, boolean z10) {
        C7223h0 c7223h0;
        if (z10) {
            m9682W();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7675l;
        c7223h0 = C1809c.f7707s;
        boolean m3751a = C0741b.m3751a(atomicReferenceFieldUpdater, this, c7223h0, th2);
        if (z10) {
            m9683X();
        } else {
            m9684Y();
        }
        m9724x();
        m9735a0();
        if (m3751a) {
            m9675M();
        }
        return m3751a;
    }

    /* renamed from: x0 */
    public final void m9742x0(long j10) {
        int i10;
        long j11;
        long m9782v;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long m9782v2;
        long j12;
        long m9782v3;
        if (m9680U()) {
            return;
        }
        do {
        } while (m9671D() <= j10);
        i10 = C1809c.f7691c;
        for (int i11 = 0; i11 < i10; i11++) {
            long m9671D = m9671D();
            if (m9671D == (4611686018427387903L & f7671h.get(this)) && m9671D == m9671D()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7671h;
        do {
            j11 = atomicLongFieldUpdater2.get(this);
            m9782v = C1809c.m9782v(j11 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, m9782v));
        while (true) {
            long m9671D2 = m9671D();
            atomicLongFieldUpdater = f7671h;
            long j13 = atomicLongFieldUpdater.get(this);
            long j14 = j13 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j13) != 0;
            if (m9671D2 == j14 && m9671D2 == m9671D()) {
                break;
            } else if (!z10) {
                m9782v2 = C1809c.m9782v(j14, true);
                atomicLongFieldUpdater.compareAndSet(this, j13, m9782v2);
            }
        }
        do {
            j12 = atomicLongFieldUpdater.get(this);
            m9782v3 = C1809c.m9782v(j12 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j12, m9782v3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final void m9743y(long j10) {
        C7223h0 c7223h0;
        C7241q0 m21690d;
        C1815i<E> c1815i = (C1815i) f7673j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7669f;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.f7677b + j11, m9671D())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                int i10 = C1809c.f7690b;
                long j12 = j11 / i10;
                int i11 = (int) (j11 % i10);
                if (c1815i.f16188c != j12) {
                    C1815i<E> m9669B = m9669B(j12, c1815i);
                    if (m9669B == null) {
                        continue;
                    } else {
                        c1815i = m9669B;
                    }
                }
                Object m9714r0 = m9714r0(c1815i, i11, j11, null);
                c7223h0 = C1809c.f7703o;
                if (m9714r0 != c7223h0) {
                    c1815i.m21557b();
                    InterfaceC9998l<E, C2037v> interfaceC9998l = this.f7678c;
                    if (interfaceC9998l != null && (m21690d = C7250z.m21690d(interfaceC9998l, m9714r0, null, 2, null)) != null) {
                        throw m21690d;
                    }
                } else if (j11 < m9729I()) {
                    c1815i.m21557b();
                }
            }
        }
    }
}
