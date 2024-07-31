package p376u6;

import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.AbstractC5911y;
import com.google.common.collect.C5867e0;
import java.io.IOException;
import java.util.List;
import p120g8.C7484b;
import p120g8.C7488f;
import p216l7.C9400a;
import p361t6.AbstractC11018d4;
import p361t6.C11010c2;
import p361t6.C11029f3;
import p361t6.C11040h2;
import p361t6.C11047i3;
import p361t6.C11048i4;
import p361t6.C11108u1;
import p361t6.C11111v;
import p361t6.C11121x;
import p361t6.InterfaceC11053j3;
import p363t8.C11137a;
import p363t8.C11159l;
import p363t8.C11171r;
import p363t8.C11172r0;
import p363t8.InterfaceC11143d;
import p363t8.InterfaceC11165o;
import p376u6.InterfaceC11332b;
import p378u8.C11448a0;
import p396v6.C11639e;
import p397v7.C11731u;
import p397v7.C11737x;
import p397v7.C11741z;
import p397v7.InterfaceC11684a0;
import p414w6.C12080e;
import p414w6.C12084i;

/* renamed from: u6.n1 */
/* loaded from: classes.dex */
public class C11394n1 implements InterfaceC11327a {

    /* renamed from: a */
    private final InterfaceC11143d f29545a;

    /* renamed from: b */
    private final AbstractC11018d4.b f29546b;

    /* renamed from: c */
    private final AbstractC11018d4.d f29547c;

    /* renamed from: d */
    private final a f29548d;

    /* renamed from: e */
    private final SparseArray<InterfaceC11332b.a> f29549e;

    /* renamed from: f */
    private C11171r<InterfaceC11332b> f29550f;

    /* renamed from: r */
    private InterfaceC11053j3 f29551r;

    /* renamed from: s */
    private InterfaceC11165o f29552s;

    /* renamed from: t */
    private boolean f29553t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u6.n1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final AbstractC11018d4.b f29554a;

        /* renamed from: b */
        private AbstractC5907w<InterfaceC11684a0.b> f29555b = AbstractC5907w.m15081v();

        /* renamed from: c */
        private AbstractC5911y<InterfaceC11684a0.b, AbstractC11018d4> f29556c = AbstractC5911y.m15111k();

        /* renamed from: d */
        private InterfaceC11684a0.b f29557d;

        /* renamed from: e */
        private InterfaceC11684a0.b f29558e;

        /* renamed from: f */
        private InterfaceC11684a0.b f29559f;

        public a(AbstractC11018d4.b bVar) {
            this.f29554a = bVar;
        }

        /* renamed from: b */
        private void m35710b(AbstractC5911y.a<InterfaceC11684a0.b, AbstractC11018d4> aVar, InterfaceC11684a0.b bVar, AbstractC11018d4 abstractC11018d4) {
            if (bVar == null) {
                return;
            }
            if (abstractC11018d4.mo11856g(bVar.f30974a) == -1 && (abstractC11018d4 = this.f29556c.get(bVar)) == null) {
                return;
            }
            aVar.m15122f(bVar, abstractC11018d4);
        }

        /* renamed from: c */
        private static InterfaceC11684a0.b m35711c(InterfaceC11053j3 interfaceC11053j3, AbstractC5907w<InterfaceC11684a0.b> abstractC5907w, InterfaceC11684a0.b bVar, AbstractC11018d4.b bVar2) {
            AbstractC11018d4 mo33941r = interfaceC11053j3.mo33941r();
            int mo33945w = interfaceC11053j3.mo33945w();
            Object mo11859r = mo33941r.m34005v() ? null : mo33941r.mo11859r(mo33945w);
            int m34013h = (interfaceC11053j3.mo33931g() || mo33941r.m34005v()) ? -1 : mo33941r.m34001k(mo33945w, bVar2).m34013h(C11172r0.m34861C0(interfaceC11053j3.mo33927e()) - bVar2.m34023r());
            for (int i10 = 0; i10 < abstractC5907w.size(); i10++) {
                InterfaceC11684a0.b bVar3 = abstractC5907w.get(i10);
                if (m35712i(bVar3, mo11859r, interfaceC11053j3.mo33931g(), interfaceC11053j3.mo33939o(), interfaceC11053j3.mo33946y(), m34013h)) {
                    return bVar3;
                }
            }
            if (abstractC5907w.isEmpty() && bVar != null) {
                if (m35712i(bVar, mo11859r, interfaceC11053j3.mo33931g(), interfaceC11053j3.mo33939o(), interfaceC11053j3.mo33946y(), m34013h)) {
                    return bVar;
                }
            }
            return null;
        }

        /* renamed from: i */
        private static boolean m35712i(InterfaceC11684a0.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (bVar.f30974a.equals(obj)) {
                return (z10 && bVar.f30975b == i10 && bVar.f30976c == i11) || (!z10 && bVar.f30975b == -1 && bVar.f30978e == i12);
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
        
            m35710b(r0, r3.f29557d, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        
            if (r3.f29555b.contains(r3.f29557d) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        
            if (p082eb.C7155k.m21289a(r3.f29557d, r3.f29559f) == false) goto L18;
         */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m35713m(p361t6.AbstractC11018d4 r4) {
            /*
                r3 = this;
                com.google.common.collect.y$a r0 = com.google.common.collect.AbstractC5911y.m15108a()
                com.google.common.collect.w<v7.a0$b> r1 = r3.f29555b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L35
                v7.a0$b r1 = r3.f29558e
                r3.m35710b(r0, r1, r4)
                v7.a0$b r1 = r3.f29559f
                v7.a0$b r2 = r3.f29558e
                boolean r1 = p082eb.C7155k.m21289a(r1, r2)
                if (r1 != 0) goto L20
                v7.a0$b r1 = r3.f29559f
                r3.m35710b(r0, r1, r4)
            L20:
                v7.a0$b r1 = r3.f29557d
                v7.a0$b r2 = r3.f29558e
                boolean r1 = p082eb.C7155k.m21289a(r1, r2)
                if (r1 != 0) goto L5b
                v7.a0$b r1 = r3.f29557d
                v7.a0$b r2 = r3.f29559f
                boolean r1 = p082eb.C7155k.m21289a(r1, r2)
                if (r1 != 0) goto L5b
                goto L56
            L35:
                r1 = 0
            L36:
                com.google.common.collect.w<v7.a0$b> r2 = r3.f29555b
                int r2 = r2.size()
                if (r1 >= r2) goto L4c
                com.google.common.collect.w<v7.a0$b> r2 = r3.f29555b
                java.lang.Object r2 = r2.get(r1)
                v7.a0$b r2 = (p397v7.InterfaceC11684a0.b) r2
                r3.m35710b(r0, r2, r4)
                int r1 = r1 + 1
                goto L36
            L4c:
                com.google.common.collect.w<v7.a0$b> r1 = r3.f29555b
                v7.a0$b r2 = r3.f29557d
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L5b
            L56:
                v7.a0$b r1 = r3.f29557d
                r3.m35710b(r0, r1, r4)
            L5b:
                com.google.common.collect.y r4 = r0.m15121c()
                r3.f29556c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p376u6.C11394n1.a.m35713m(t6.d4):void");
        }

        /* renamed from: d */
        public InterfaceC11684a0.b m35714d() {
            return this.f29557d;
        }

        /* renamed from: e */
        public InterfaceC11684a0.b m35715e() {
            if (this.f29555b.isEmpty()) {
                return null;
            }
            return (InterfaceC11684a0.b) C5867e0.m14838d(this.f29555b);
        }

        /* renamed from: f */
        public AbstractC11018d4 m35716f(InterfaceC11684a0.b bVar) {
            return this.f29556c.get(bVar);
        }

        /* renamed from: g */
        public InterfaceC11684a0.b m35717g() {
            return this.f29558e;
        }

        /* renamed from: h */
        public InterfaceC11684a0.b m35718h() {
            return this.f29559f;
        }

        /* renamed from: j */
        public void m35719j(InterfaceC11053j3 interfaceC11053j3) {
            this.f29557d = m35711c(interfaceC11053j3, this.f29555b, this.f29558e, this.f29554a);
        }

        /* renamed from: k */
        public void m35720k(List<InterfaceC11684a0.b> list, InterfaceC11684a0.b bVar, InterfaceC11053j3 interfaceC11053j3) {
            this.f29555b = AbstractC5907w.m15079r(list);
            if (!list.isEmpty()) {
                this.f29558e = list.get(0);
                this.f29559f = (InterfaceC11684a0.b) C11137a.m34603e(bVar);
            }
            if (this.f29557d == null) {
                this.f29557d = m35711c(interfaceC11053j3, this.f29555b, this.f29558e, this.f29554a);
            }
            m35713m(interfaceC11053j3.mo33941r());
        }

        /* renamed from: l */
        public void m35721l(InterfaceC11053j3 interfaceC11053j3) {
            this.f29557d = m35711c(interfaceC11053j3, this.f29555b, this.f29558e, this.f29554a);
            m35713m(interfaceC11053j3.mo33941r());
        }
    }

    public C11394n1(InterfaceC11143d interfaceC11143d) {
        this.f29545a = (InterfaceC11143d) C11137a.m34603e(interfaceC11143d);
        this.f29550f = new C11171r<>(C11172r0.m34888Q(), interfaceC11143d, new C11171r.b() { // from class: u6.k0
            @Override // p363t8.C11171r.b
            /* renamed from: a */
            public final void mo34318a(Object obj, C11159l c11159l) {
                C11394n1.m35650d1((InterfaceC11332b) obj, c11159l);
            }
        });
        AbstractC11018d4.b bVar = new AbstractC11018d4.b();
        this.f29546b = bVar;
        this.f29547c = new AbstractC11018d4.d();
        this.f29548d = new a(bVar);
        this.f29549e = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public static /* synthetic */ void m35581D1(InterfaceC11332b.a aVar, boolean z10, InterfaceC11332b interfaceC11332b) {
        interfaceC11332b.m35469d(aVar, z10);
        interfaceC11332b.m35443E(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T1 */
    public static /* synthetic */ void m35623T1(InterfaceC11332b.a aVar, int i10, InterfaceC11053j3.e eVar, InterfaceC11053j3.e eVar2, InterfaceC11332b interfaceC11332b) {
        interfaceC11332b.m35457S(aVar, i10);
        interfaceC11332b.mo35446H(aVar, eVar, eVar2, i10);
    }

    /* renamed from: X0 */
    private InterfaceC11332b.a m35632X0(InterfaceC11684a0.b bVar) {
        C11137a.m34603e(this.f29551r);
        AbstractC11018d4 m35716f = bVar == null ? null : this.f29548d.m35716f(bVar);
        if (bVar != null && m35716f != null) {
            return m35707W0(m35716f, m35716f.mo33628m(bVar.f30974a, this.f29546b).f28227c, bVar);
        }
        int mo33911G = this.f29551r.mo33911G();
        AbstractC11018d4 mo33941r = this.f29551r.mo33941r();
        if (!(mo33911G < mo33941r.mo11861u())) {
            mo33941r = AbstractC11018d4.f28214a;
        }
        return m35707W0(mo33941r, mo33911G, null);
    }

    /* renamed from: Y0 */
    private InterfaceC11332b.a m35635Y0() {
        return m35632X0(this.f29548d.m35715e());
    }

    /* renamed from: Z0 */
    private InterfaceC11332b.a m35638Z0(int i10, InterfaceC11684a0.b bVar) {
        C11137a.m34603e(this.f29551r);
        if (bVar != null) {
            return this.f29548d.m35716f(bVar) != null ? m35632X0(bVar) : m35707W0(AbstractC11018d4.f28214a, i10, bVar);
        }
        AbstractC11018d4 mo33941r = this.f29551r.mo33941r();
        if (!(i10 < mo33941r.mo11861u())) {
            mo33941r = AbstractC11018d4.f28214a;
        }
        return m35707W0(mo33941r, i10, null);
    }

    /* renamed from: a1 */
    private InterfaceC11332b.a m35641a1() {
        return m35632X0(this.f29548d.m35717g());
    }

    /* renamed from: b1 */
    private InterfaceC11332b.a m35644b1() {
        return m35632X0(this.f29548d.m35718h());
    }

    /* renamed from: c1 */
    private InterfaceC11332b.a m35647c1(C11029f3 c11029f3) {
        C11741z c11741z;
        return (!(c11029f3 instanceof C11121x) || (c11741z = ((C11121x) c11029f3).f28877y) == null) ? m35706V0() : m35632X0(new InterfaceC11684a0.b(c11741z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public static /* synthetic */ void m35650d1(InterfaceC11332b interfaceC11332b, C11159l c11159l) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d2 */
    public static /* synthetic */ void m35651d2(InterfaceC11332b.a aVar, String str, long j10, long j11, InterfaceC11332b interfaceC11332b) {
        interfaceC11332b.m35490o(aVar, str, j10);
        interfaceC11332b.m35442D(aVar, str, j11, j10);
        interfaceC11332b.m35451M(aVar, 2, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f2 */
    public static /* synthetic */ void m35657f2(InterfaceC11332b.a aVar, C12080e c12080e, InterfaceC11332b interfaceC11332b) {
        interfaceC11332b.mo35494q(aVar, c12080e);
        interfaceC11332b.m35452N(aVar, 2, c12080e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g2 */
    public static /* synthetic */ void m35660g2(InterfaceC11332b.a aVar, C12080e c12080e, InterfaceC11332b interfaceC11332b) {
        interfaceC11332b.m35511y0(aVar, c12080e);
        interfaceC11332b.m35508x(aVar, 2, c12080e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public static /* synthetic */ void m35662h1(InterfaceC11332b.a aVar, String str, long j10, long j11, InterfaceC11332b interfaceC11332b) {
        interfaceC11332b.m35475g(aVar, str, j10);
        interfaceC11332b.m35460V(aVar, str, j11, j10);
        interfaceC11332b.m35451M(aVar, 1, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i2 */
    public static /* synthetic */ void m35666i2(InterfaceC11332b.a aVar, C11108u1 c11108u1, C12084i c12084i, InterfaceC11332b interfaceC11332b) {
        interfaceC11332b.m35484l(aVar, c11108u1);
        interfaceC11332b.m35472e0(aVar, c11108u1, c12084i);
        interfaceC11332b.m35465a0(aVar, 2, c11108u1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public static /* synthetic */ void m35668j1(InterfaceC11332b.a aVar, C12080e c12080e, InterfaceC11332b interfaceC11332b) {
        interfaceC11332b.m35491o0(aVar, c12080e);
        interfaceC11332b.m35452N(aVar, 1, c12080e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j2 */
    public static /* synthetic */ void m35669j2(InterfaceC11332b.a aVar, C11448a0 c11448a0, InterfaceC11332b interfaceC11332b) {
        interfaceC11332b.mo35497r0(aVar, c11448a0);
        interfaceC11332b.m35456R(aVar, c11448a0.f29649a, c11448a0.f29650b, c11448a0.f29651c, c11448a0.f29652d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1 */
    public static /* synthetic */ void m35671k1(InterfaceC11332b.a aVar, C12080e c12080e, InterfaceC11332b interfaceC11332b) {
        interfaceC11332b.m35495q0(aVar, c12080e);
        interfaceC11332b.m35508x(aVar, 1, c12080e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1 */
    public static /* synthetic */ void m35674l1(InterfaceC11332b.a aVar, C11108u1 c11108u1, C12084i c12084i, InterfaceC11332b interfaceC11332b) {
        interfaceC11332b.m35496r(aVar, c11108u1);
        interfaceC11332b.m35463Z(aVar, c11108u1, c12084i);
        interfaceC11332b.m35465a0(aVar, 1, c11108u1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m2 */
    public /* synthetic */ void m35678m2(InterfaceC11053j3 interfaceC11053j3, InterfaceC11332b interfaceC11332b, C11159l c11159l) {
        interfaceC11332b.mo35483k0(interfaceC11053j3, new InterfaceC11332b.b(c11159l, this.f29549e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n2 */
    public void m35681n2() {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 1028, new C11171r.a() { // from class: u6.d1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35489n0(InterfaceC11332b.a.this);
            }
        });
        this.f29550f.m34850j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public static /* synthetic */ void m35705z1(InterfaceC11332b.a aVar, int i10, InterfaceC11332b interfaceC11332b) {
        interfaceC11332b.m35462X(aVar);
        interfaceC11332b.m35502u(aVar, i10);
    }

    @Override // p436x6.InterfaceC12329u
    /* renamed from: B */
    public final void mo33696B(int i10, InterfaceC11684a0.b bVar) {
        final InterfaceC11332b.a m35638Z0 = m35638Z0(i10, bVar);
        m35708o2(m35638Z0, 1026, new C11171r.a() { // from class: u6.e1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35468c0(InterfaceC11332b.a.this);
            }
        });
    }

    @Override // p436x6.InterfaceC12329u
    /* renamed from: C */
    public final void mo33697C(int i10, InterfaceC11684a0.b bVar) {
        final InterfaceC11332b.a m35638Z0 = m35638Z0(i10, bVar);
        m35708o2(m35638Z0, 1025, new C11171r.a() { // from class: u6.g1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35447I(InterfaceC11332b.a.this);
            }
        });
    }

    @Override // p397v7.InterfaceC11705h0
    /* renamed from: D */
    public final void mo33698D(int i10, InterfaceC11684a0.b bVar, final C11731u c11731u, final C11737x c11737x) {
        final InterfaceC11332b.a m35638Z0 = m35638Z0(i10, bVar);
        m35708o2(m35638Z0, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new C11171r.a() { // from class: u6.k
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35445G(InterfaceC11332b.a.this, c11731u, c11737x);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: E */
    public void mo35416E(InterfaceC11332b interfaceC11332b) {
        C11137a.m34603e(interfaceC11332b);
        this.f29550f.m34845c(interfaceC11332b);
    }

    @Override // p397v7.InterfaceC11705h0
    /* renamed from: F */
    public final void mo33699F(int i10, InterfaceC11684a0.b bVar, final C11731u c11731u, final C11737x c11737x, final IOException iOException, final boolean z10) {
        final InterfaceC11332b.a m35638Z0 = m35638Z0(i10, bVar);
        m35708o2(m35638Z0, 1003, new C11171r.a() { // from class: u6.i0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).mo35504v(InterfaceC11332b.a.this, c11731u, c11737x, iOException, z10);
            }
        });
    }

    @Override // p397v7.InterfaceC11705h0
    /* renamed from: G */
    public final void mo33700G(int i10, InterfaceC11684a0.b bVar, final C11731u c11731u, final C11737x c11737x) {
        final InterfaceC11332b.a m35638Z0 = m35638Z0(i10, bVar);
        m35708o2(m35638Z0, AdError.NETWORK_ERROR_CODE, new C11171r.a() { // from class: u6.r0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35466b(InterfaceC11332b.a.this, c11731u, c11737x);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: H */
    public final void mo35417H(List<InterfaceC11684a0.b> list, InterfaceC11684a0.b bVar) {
        this.f29548d.m35720k(list, bVar, (InterfaceC11053j3) C11137a.m34603e(this.f29551r));
    }

    @Override // p436x6.InterfaceC12329u
    /* renamed from: I */
    public final void mo33701I(int i10, InterfaceC11684a0.b bVar, final Exception exc) {
        final InterfaceC11332b.a m35638Z0 = m35638Z0(i10, bVar);
        m35708o2(m35638Z0, RecognitionOptions.UPC_E, new C11171r.a() { // from class: u6.s0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35486m(InterfaceC11332b.a.this, exc);
            }
        });
    }

    @Override // p436x6.InterfaceC12329u
    /* renamed from: J */
    public final void mo33702J(int i10, InterfaceC11684a0.b bVar, final int i11) {
        final InterfaceC11332b.a m35638Z0 = m35638Z0(i10, bVar);
        m35708o2(m35638Z0, 1022, new C11171r.a() { // from class: u6.o0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11394n1.m35705z1(InterfaceC11332b.a.this, i11, (InterfaceC11332b) obj);
            }
        });
    }

    /* renamed from: V0 */
    protected final InterfaceC11332b.a m35706V0() {
        return m35632X0(this.f29548d.m35714d());
    }

    /* renamed from: W0 */
    protected final InterfaceC11332b.a m35707W0(AbstractC11018d4 abstractC11018d4, int i10, InterfaceC11684a0.b bVar) {
        long mo33907B;
        InterfaceC11684a0.b bVar2 = abstractC11018d4.m34005v() ? null : bVar;
        long mo34622b = this.f29545a.mo34622b();
        boolean z10 = abstractC11018d4.equals(this.f29551r.mo33941r()) && i10 == this.f29551r.mo33911G();
        long j10 = 0;
        if (bVar2 != null && bVar2.m37106b()) {
            if (z10 && this.f29551r.mo33939o() == bVar2.f30975b && this.f29551r.mo33946y() == bVar2.f30976c) {
                j10 = this.f29551r.mo33927e();
            }
        } else {
            if (z10) {
                mo33907B = this.f29551r.mo33907B();
                return new InterfaceC11332b.a(mo34622b, abstractC11018d4, i10, bVar2, mo33907B, this.f29551r.mo33941r(), this.f29551r.mo33911G(), this.f29548d.m35714d(), this.f29551r.mo33927e(), this.f29551r.mo33933h());
            }
            if (!abstractC11018d4.m34005v()) {
                j10 = abstractC11018d4.m34004s(i10, this.f29547c).m34032e();
            }
        }
        mo33907B = j10;
        return new InterfaceC11332b.a(mo34622b, abstractC11018d4, i10, bVar2, mo33907B, this.f29551r.mo33941r(), this.f29551r.mo33911G(), this.f29548d.m35714d(), this.f29551r.mo33927e(), this.f29551r.mo33933h());
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: a */
    public final void mo35418a(final Exception exc) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1014, new C11171r.a() { // from class: u6.t
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35474f0(InterfaceC11332b.a.this, exc);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: b */
    public final void mo35419b(final String str) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1019, new C11171r.a() { // from class: u6.e
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35481j(InterfaceC11332b.a.this, str);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: c */
    public final void mo35420c(final C12080e c12080e) {
        final InterfaceC11332b.a m35641a1 = m35641a1();
        m35708o2(m35641a1, 1020, new C11171r.a() { // from class: u6.z
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11394n1.m35657f2(InterfaceC11332b.a.this, c12080e, (InterfaceC11332b) obj);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: d */
    public final void mo35421d(final String str, final long j10, final long j11) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1016, new C11171r.a() { // from class: u6.m1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11394n1.m35651d2(InterfaceC11332b.a.this, str, j11, j10, (InterfaceC11332b) obj);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: e */
    public final void mo35422e(final C12080e c12080e) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1015, new C11171r.a() { // from class: u6.g
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11394n1.m35660g2(InterfaceC11332b.a.this, c12080e, (InterfaceC11332b) obj);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: f */
    public final void mo35423f(final C11108u1 c11108u1, final C12084i c12084i) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1009, new C11171r.a() { // from class: u6.a0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11394n1.m35674l1(InterfaceC11332b.a.this, c11108u1, c12084i, (InterfaceC11332b) obj);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: g */
    public final void mo35424g(final C11108u1 c11108u1, final C12084i c12084i) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1017, new C11171r.a() { // from class: u6.n0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11394n1.m35666i2(InterfaceC11332b.a.this, c11108u1, c12084i, (InterfaceC11332b) obj);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: h */
    public final void mo35425h(final C12080e c12080e) {
        final InterfaceC11332b.a m35641a1 = m35641a1();
        m35708o2(m35641a1, 1013, new C11171r.a() { // from class: u6.m0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11394n1.m35668j1(InterfaceC11332b.a.this, c12080e, (InterfaceC11332b) obj);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: i */
    public final void mo35426i(final String str) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1012, new C11171r.a() { // from class: u6.m
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35498s(InterfaceC11332b.a.this, str);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: j */
    public final void mo35427j(final String str, final long j10, final long j11) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1008, new C11171r.a() { // from class: u6.j
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11394n1.m35662h1(InterfaceC11332b.a.this, str, j11, j10, (InterfaceC11332b) obj);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: k */
    public final void mo35428k(final long j10) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1010, new C11171r.a() { // from class: u6.o
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35479i(InterfaceC11332b.a.this, j10);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: l */
    public final void mo35429l(final Exception exc) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1030, new C11171r.a() { // from class: u6.j1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35499s0(InterfaceC11332b.a.this, exc);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: m */
    public final void mo35430m(final C12080e c12080e) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1007, new C11171r.a() { // from class: u6.c0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11394n1.m35671k1(InterfaceC11332b.a.this, c12080e, (InterfaceC11332b) obj);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: n */
    public final void mo35431n(final int i10, final long j10) {
        final InterfaceC11332b.a m35641a1 = m35641a1();
        m35708o2(m35641a1, 1018, new C11171r.a() { // from class: u6.x
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35470d0(InterfaceC11332b.a.this, i10, j10);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: o */
    public final void mo35432o(final Object obj, final long j10) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 26, new C11171r.a() { // from class: u6.a1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj2) {
                ((InterfaceC11332b) obj2).m35501t0(InterfaceC11332b.a.this, obj, j10);
            }
        });
    }

    /* renamed from: o2 */
    protected final void m35708o2(InterfaceC11332b.a aVar, int i10, C11171r.a<InterfaceC11332b> aVar2) {
        this.f29549e.put(i10, aVar);
        this.f29550f.m34852l(i10, aVar2);
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onAudioAttributesChanged(final C11639e c11639e) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 20, new C11171r.a() { // from class: u6.s
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35482k(InterfaceC11332b.a.this, c11639e);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onAvailableCommandsChanged(final InterfaceC11053j3.b bVar) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 13, new C11171r.a() { // from class: u6.e0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35505v0(InterfaceC11332b.a.this, bVar);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onCues(final C7488f c7488f) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 27, new C11171r.a() { // from class: u6.h0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35503u0(InterfaceC11332b.a.this, c7488f);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onCues(final List<C7484b> list) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 27, new C11171r.a() { // from class: u6.w0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35478h0(InterfaceC11332b.a.this, list);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onDeviceInfoChanged(final C11111v c11111v) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 29, new C11171r.a() { // from class: u6.n
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35444F(InterfaceC11332b.a.this, c11111v);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onDeviceVolumeChanged(final int i10, final boolean z10) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 30, new C11171r.a() { // from class: u6.f
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35459U(InterfaceC11332b.a.this, i10, z10);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onEvents(InterfaceC11053j3 interfaceC11053j3, InterfaceC11053j3.c cVar) {
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onIsLoadingChanged(final boolean z10) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 3, new C11171r.a() { // from class: u6.p0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11394n1.m35581D1(InterfaceC11332b.a.this, z10, (InterfaceC11332b) obj);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onIsPlayingChanged(final boolean z10) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 7, new C11171r.a() { // from class: u6.r
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35510y(InterfaceC11332b.a.this, z10);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onLoadingChanged(boolean z10) {
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onMediaItemTransition(final C11010c2 c11010c2, final int i10) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 1, new C11171r.a() { // from class: u6.y
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35487m0(InterfaceC11332b.a.this, c11010c2, i10);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onMediaMetadataChanged(final C11040h2 c11040h2) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 14, new C11171r.a() { // from class: u6.f1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35464a(InterfaceC11332b.a.this, c11040h2);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onMetadata(final C9400a c9400a) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 28, new C11171r.a() { // from class: u6.c
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35480i0(InterfaceC11332b.a.this, c9400a);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onPlayWhenReadyChanged(final boolean z10, final int i10) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 5, new C11171r.a() { // from class: u6.g0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35492p(InterfaceC11332b.a.this, z10, i10);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onPlaybackParametersChanged(final C11047i3 c11047i3) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 12, new C11171r.a() { // from class: u6.q0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35458T(InterfaceC11332b.a.this, c11047i3);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onPlaybackStateChanged(final int i10) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 4, new C11171r.a() { // from class: u6.u0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35485l0(InterfaceC11332b.a.this, i10);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onPlaybackSuppressionReasonChanged(final int i10) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 6, new C11171r.a() { // from class: u6.v
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35477h(InterfaceC11332b.a.this, i10);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onPlayerError(final C11029f3 c11029f3) {
        final InterfaceC11332b.a m35647c1 = m35647c1(c11029f3);
        m35708o2(m35647c1, 10, new C11171r.a() { // from class: u6.i
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).mo35467c(InterfaceC11332b.a.this, c11029f3);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onPlayerErrorChanged(final C11029f3 c11029f3) {
        final InterfaceC11332b.a m35647c1 = m35647c1(c11029f3);
        m35708o2(m35647c1, 10, new C11171r.a() { // from class: u6.d
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35453O(InterfaceC11332b.a.this, c11029f3);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onPlayerStateChanged(final boolean z10, final int i10) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, -1, new C11171r.a() { // from class: u6.w
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35488n(InterfaceC11332b.a.this, z10, i10);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onPositionDiscontinuity(final InterfaceC11053j3.e eVar, final InterfaceC11053j3.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f29553t = false;
        }
        this.f29548d.m35719j((InterfaceC11053j3) C11137a.m34603e(this.f29551r));
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 11, new C11171r.a() { // from class: u6.x0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11394n1.m35623T1(InterfaceC11332b.a.this, i10, eVar, eVar2, (InterfaceC11332b) obj);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onRenderedFirstFrame() {
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onRepeatModeChanged(final int i10) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 8, new C11171r.a() { // from class: u6.d0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35461W(InterfaceC11332b.a.this, i10);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onSeekProcessed() {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, -1, new C11171r.a() { // from class: u6.v0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35448J(InterfaceC11332b.a.this);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 23, new C11171r.a() { // from class: u6.h1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35476g0(InterfaceC11332b.a.this, z10);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onSurfaceSizeChanged(final int i10, final int i11) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 24, new C11171r.a() { // from class: u6.f0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35440A(InterfaceC11332b.a.this, i10, i11);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onTimelineChanged(AbstractC11018d4 abstractC11018d4, final int i10) {
        this.f29548d.m35721l((InterfaceC11053j3) C11137a.m34603e(this.f29551r));
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 0, new C11171r.a() { // from class: u6.t0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35509x0(InterfaceC11332b.a.this, i10);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onTracksChanged(final C11048i4 c11048i4) {
        final InterfaceC11332b.a m35706V0 = m35706V0();
        m35708o2(m35706V0, 2, new C11171r.a() { // from class: u6.q
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35507w0(InterfaceC11332b.a.this, c11048i4);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onVideoSizeChanged(final C11448a0 c11448a0) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 25, new C11171r.a() { // from class: u6.c1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11394n1.m35669j2(InterfaceC11332b.a.this, c11448a0, (InterfaceC11332b) obj);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3.d
    public final void onVolumeChanged(final float f10) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 22, new C11171r.a() { // from class: u6.j0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35450L(InterfaceC11332b.a.this, f10);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: p */
    public final void mo35433p(final Exception exc) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1029, new C11171r.a() { // from class: u6.l0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35506w(InterfaceC11332b.a.this, exc);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: q */
    public final void mo35434q(final int i10, final long j10, final long j11) {
        final InterfaceC11332b.a m35644b1 = m35644b1();
        m35708o2(m35644b1, 1011, new C11171r.a() { // from class: u6.z0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35455Q(InterfaceC11332b.a.this, i10, j10, j11);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: r */
    public final void mo35435r(final long j10, final int i10) {
        final InterfaceC11332b.a m35641a1 = m35641a1();
        m35708o2(m35641a1, 1021, new C11171r.a() { // from class: u6.k1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35473f(InterfaceC11332b.a.this, j10, i10);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    public void release() {
        ((InterfaceC11165o) C11137a.m34607i(this.f29552s)).mo34778h(new Runnable() { // from class: u6.h
            @Override // java.lang.Runnable
            public final void run() {
                C11394n1.this.m35681n2();
            }
        });
    }

    @Override // p351s8.InterfaceC10817e.a
    /* renamed from: s */
    public final void mo32962s(final int i10, final long j10, final long j11) {
        final InterfaceC11332b.a m35635Y0 = m35635Y0();
        m35708o2(m35635Y0, 1006, new C11171r.a() { // from class: u6.i1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).mo35454P(InterfaceC11332b.a.this, i10, j10, j11);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: t */
    public final void mo35436t() {
        if (this.f29553t) {
            return;
        }
        final InterfaceC11332b.a m35706V0 = m35706V0();
        this.f29553t = true;
        m35708o2(m35706V0, -1, new C11171r.a() { // from class: u6.l1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35493p0(InterfaceC11332b.a.this);
            }
        });
    }

    @Override // p436x6.InterfaceC12329u
    /* renamed from: u */
    public final void mo33703u(int i10, InterfaceC11684a0.b bVar) {
        final InterfaceC11332b.a m35638Z0 = m35638Z0(i10, bVar);
        m35708o2(m35638Z0, 1023, new C11171r.a() { // from class: u6.b1
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35512z(InterfaceC11332b.a.this);
            }
        });
    }

    @Override // p397v7.InterfaceC11705h0
    /* renamed from: v */
    public final void mo33704v(int i10, InterfaceC11684a0.b bVar, final C11737x c11737x) {
        final InterfaceC11332b.a m35638Z0 = m35638Z0(i10, bVar);
        m35708o2(m35638Z0, 1004, new C11171r.a() { // from class: u6.u
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).mo35449K(InterfaceC11332b.a.this, c11737x);
            }
        });
    }

    @Override // p397v7.InterfaceC11705h0
    /* renamed from: w */
    public final void mo33705w(int i10, InterfaceC11684a0.b bVar, final C11737x c11737x) {
        final InterfaceC11332b.a m35638Z0 = m35638Z0(i10, bVar);
        m35708o2(m35638Z0, 1005, new C11171r.a() { // from class: u6.b0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35500t(InterfaceC11332b.a.this, c11737x);
            }
        });
    }

    @Override // p397v7.InterfaceC11705h0
    /* renamed from: x */
    public final void mo33706x(int i10, InterfaceC11684a0.b bVar, final C11731u c11731u, final C11737x c11737x) {
        final InterfaceC11332b.a m35638Z0 = m35638Z0(i10, bVar);
        m35708o2(m35638Z0, AdError.NO_FILL_ERROR_CODE, new C11171r.a() { // from class: u6.y0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35441B(InterfaceC11332b.a.this, c11731u, c11737x);
            }
        });
    }

    @Override // p436x6.InterfaceC12329u
    /* renamed from: y */
    public final void mo33707y(int i10, InterfaceC11684a0.b bVar) {
        final InterfaceC11332b.a m35638Z0 = m35638Z0(i10, bVar);
        m35708o2(m35638Z0, 1027, new C11171r.a() { // from class: u6.p
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11332b) obj).m35471e(InterfaceC11332b.a.this);
            }
        });
    }

    @Override // p376u6.InterfaceC11327a
    /* renamed from: z */
    public void mo35437z(final InterfaceC11053j3 interfaceC11053j3, Looper looper) {
        C11137a.m34605g(this.f29551r == null || this.f29548d.f29555b.isEmpty());
        this.f29551r = (InterfaceC11053j3) C11137a.m34603e(interfaceC11053j3);
        this.f29552s = this.f29545a.mo34623c(looper, null);
        this.f29550f = this.f29550f.m34847e(looper, new C11171r.b() { // from class: u6.l
            @Override // p363t8.C11171r.b
            /* renamed from: a */
            public final void mo34318a(Object obj, C11159l c11159l) {
                C11394n1.this.m35678m2(interfaceC11053j3, (InterfaceC11332b) obj, c11159l);
            }
        });
    }
}
