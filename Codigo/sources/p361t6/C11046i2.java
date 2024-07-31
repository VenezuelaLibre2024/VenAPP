package p361t6;

import p307q8.AbstractC10294a0;
import p307q8.C10296b0;
import p307q8.InterfaceC10312r;
import p351s8.InterfaceC10811b;
import p363t8.C11137a;
import p363t8.C11173s;
import p397v7.C11692d;
import p397v7.C11700f1;
import p397v7.C11725r;
import p397v7.InterfaceC11684a0;
import p397v7.InterfaceC11734v0;
import p397v7.InterfaceC11739y;

/* renamed from: t6.i2 */
/* loaded from: classes.dex */
final class C11046i2 {

    /* renamed from: a */
    public final InterfaceC11739y f28409a;

    /* renamed from: b */
    public final Object f28410b;

    /* renamed from: c */
    public final InterfaceC11734v0[] f28411c;

    /* renamed from: d */
    public boolean f28412d;

    /* renamed from: e */
    public boolean f28413e;

    /* renamed from: f */
    public C11052j2 f28414f;

    /* renamed from: g */
    public boolean f28415g;

    /* renamed from: h */
    private final boolean[] f28416h;

    /* renamed from: i */
    private final InterfaceC11095r3[] f28417i;

    /* renamed from: j */
    private final AbstractC10294a0 f28418j;

    /* renamed from: k */
    private final C10999a3 f28419k;

    /* renamed from: l */
    private C11046i2 f28420l;

    /* renamed from: m */
    private C11700f1 f28421m;

    /* renamed from: n */
    private C10296b0 f28422n;

    /* renamed from: o */
    private long f28423o;

    public C11046i2(InterfaceC11095r3[] interfaceC11095r3Arr, long j10, AbstractC10294a0 abstractC10294a0, InterfaceC10811b interfaceC10811b, C10999a3 c10999a3, C11052j2 c11052j2, C10296b0 c10296b0) {
        this.f28417i = interfaceC11095r3Arr;
        this.f28423o = j10;
        this.f28418j = abstractC10294a0;
        this.f28419k = c10999a3;
        InterfaceC11684a0.b bVar = c11052j2.f28461a;
        this.f28410b = bVar.f30974a;
        this.f28414f = c11052j2;
        this.f28421m = C11700f1.f30689d;
        this.f28422n = c10296b0;
        this.f28411c = new InterfaceC11734v0[interfaceC11095r3Arr.length];
        this.f28416h = new boolean[interfaceC11095r3Arr.length];
        this.f28409a = m34133e(bVar, c10999a3, interfaceC10811b, c11052j2.f28462b, c11052j2.f28464d);
    }

    /* renamed from: c */
    private void m34132c(InterfaceC11734v0[] interfaceC11734v0Arr) {
        int i10 = 0;
        while (true) {
            InterfaceC11095r3[] interfaceC11095r3Arr = this.f28417i;
            if (i10 >= interfaceC11095r3Arr.length) {
                return;
            }
            if (interfaceC11095r3Arr[i10].mo34245g() == -2 && this.f28422n.m30878c(i10)) {
                interfaceC11734v0Arr[i10] = new C11725r();
            }
            i10++;
        }
    }

    /* renamed from: e */
    private static InterfaceC11739y m34133e(InterfaceC11684a0.b bVar, C10999a3 c10999a3, InterfaceC10811b interfaceC10811b, long j10, long j11) {
        InterfaceC11739y m33663h = c10999a3.m33663h(bVar, interfaceC10811b, j10);
        return j11 != -9223372036854775807L ? new C11692d(m33663h, true, 0L, j11) : m33663h;
    }

    /* renamed from: f */
    private void m34134f() {
        if (!m34137r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            C10296b0 c10296b0 = this.f28422n;
            if (i10 >= c10296b0.f25594a) {
                return;
            }
            boolean m30878c = c10296b0.m30878c(i10);
            InterfaceC10312r interfaceC10312r = this.f28422n.f25596c[i10];
            if (m30878c && interfaceC10312r != null) {
                interfaceC10312r.mo30860f();
            }
            i10++;
        }
    }

    /* renamed from: g */
    private void m34135g(InterfaceC11734v0[] interfaceC11734v0Arr) {
        int i10 = 0;
        while (true) {
            InterfaceC11095r3[] interfaceC11095r3Arr = this.f28417i;
            if (i10 >= interfaceC11095r3Arr.length) {
                return;
            }
            if (interfaceC11095r3Arr[i10].mo34245g() == -2) {
                interfaceC11734v0Arr[i10] = null;
            }
            i10++;
        }
    }

    /* renamed from: h */
    private void m34136h() {
        if (!m34137r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            C10296b0 c10296b0 = this.f28422n;
            if (i10 >= c10296b0.f25594a) {
                return;
            }
            boolean m30878c = c10296b0.m30878c(i10);
            InterfaceC10312r interfaceC10312r = this.f28422n.f25596c[i10];
            if (m30878c && interfaceC10312r != null) {
                interfaceC10312r.mo30862p();
            }
            i10++;
        }
    }

    /* renamed from: r */
    private boolean m34137r() {
        return this.f28420l == null;
    }

    /* renamed from: u */
    private static void m34138u(C10999a3 c10999a3, InterfaceC11739y interfaceC11739y) {
        try {
            if (interfaceC11739y instanceof C11692d) {
                interfaceC11739y = ((C11692d) interfaceC11739y).f30639a;
            }
            c10999a3.m33670z(interfaceC11739y);
        } catch (RuntimeException e10) {
            C11173s.m34965d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    /* renamed from: A */
    public void m34139A() {
        InterfaceC11739y interfaceC11739y = this.f28409a;
        if (interfaceC11739y instanceof C11692d) {
            long j10 = this.f28414f.f28464d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((C11692d) interfaceC11739y).m36840u(0L, j10);
        }
    }

    /* renamed from: a */
    public long m34140a(C10296b0 c10296b0, long j10, boolean z10) {
        return m34141b(c10296b0, j10, z10, new boolean[this.f28417i.length]);
    }

    /* renamed from: b */
    public long m34141b(C10296b0 c10296b0, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= c10296b0.f25594a) {
                break;
            }
            boolean[] zArr2 = this.f28416h;
            if (z10 || !c10296b0.m30877b(this.f28422n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        m34135g(this.f28411c);
        m34134f();
        this.f28422n = c10296b0;
        m34136h();
        long mo257t = this.f28409a.mo257t(c10296b0.f25596c, this.f28416h, this.f28411c, zArr, j10);
        m34132c(this.f28411c);
        this.f28413e = false;
        int i11 = 0;
        while (true) {
            InterfaceC11734v0[] interfaceC11734v0Arr = this.f28411c;
            if (i11 >= interfaceC11734v0Arr.length) {
                return mo257t;
            }
            if (interfaceC11734v0Arr[i11] != null) {
                C11137a.m34605g(c10296b0.m30878c(i11));
                if (this.f28417i[i11].mo34245g() != -2) {
                    this.f28413e = true;
                }
            } else {
                C11137a.m34605g(c10296b0.f25596c[i11] == null);
            }
            i11++;
        }
    }

    /* renamed from: d */
    public void m34142d(long j10) {
        C11137a.m34605g(m34137r());
        this.f28409a.mo248e(m34157y(j10));
    }

    /* renamed from: i */
    public long m34143i() {
        if (!this.f28412d) {
            return this.f28414f.f28462b;
        }
        long mo249f = this.f28413e ? this.f28409a.mo249f() : Long.MIN_VALUE;
        return mo249f == Long.MIN_VALUE ? this.f28414f.f28465e : mo249f;
    }

    /* renamed from: j */
    public C11046i2 m34144j() {
        return this.f28420l;
    }

    /* renamed from: k */
    public long m34145k() {
        if (this.f28412d) {
            return this.f28409a.mo245b();
        }
        return 0L;
    }

    /* renamed from: l */
    public long m34146l() {
        return this.f28423o;
    }

    /* renamed from: m */
    public long m34147m() {
        return this.f28414f.f28462b + this.f28423o;
    }

    /* renamed from: n */
    public C11700f1 m34148n() {
        return this.f28421m;
    }

    /* renamed from: o */
    public C10296b0 m34149o() {
        return this.f28422n;
    }

    /* renamed from: p */
    public void m34150p(float f10, AbstractC11018d4 abstractC11018d4) {
        this.f28412d = true;
        this.f28421m = this.f28409a.mo255r();
        C10296b0 m34154v = m34154v(f10, abstractC11018d4);
        C11052j2 c11052j2 = this.f28414f;
        long j10 = c11052j2.f28462b;
        long j11 = c11052j2.f28465e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long m34140a = m34140a(m34154v, j10, false);
        long j12 = this.f28423o;
        C11052j2 c11052j22 = this.f28414f;
        this.f28423o = j12 + (c11052j22.f28462b - m34140a);
        this.f28414f = c11052j22.m34193b(m34140a);
    }

    /* renamed from: q */
    public boolean m34151q() {
        return this.f28412d && (!this.f28413e || this.f28409a.mo249f() == Long.MIN_VALUE);
    }

    /* renamed from: s */
    public void m34152s(long j10) {
        C11137a.m34605g(m34137r());
        if (this.f28412d) {
            this.f28409a.mo250g(m34157y(j10));
        }
    }

    /* renamed from: t */
    public void m34153t() {
        m34134f();
        m34138u(this.f28419k, this.f28409a);
    }

    /* renamed from: v */
    public C10296b0 m34154v(float f10, AbstractC11018d4 abstractC11018d4) {
        C10296b0 mo30873g = this.f28418j.mo30873g(this.f28417i, m34148n(), this.f28414f.f28461a, abstractC11018d4);
        for (InterfaceC10312r interfaceC10312r : mo30873g.f25596c) {
            if (interfaceC10312r != null) {
                interfaceC10312r.mo30861l(f10);
            }
        }
        return mo30873g;
    }

    /* renamed from: w */
    public void m34155w(C11046i2 c11046i2) {
        if (c11046i2 == this.f28420l) {
            return;
        }
        m34134f();
        this.f28420l = c11046i2;
        m34136h();
    }

    /* renamed from: x */
    public void m34156x(long j10) {
        this.f28423o = j10;
    }

    /* renamed from: y */
    public long m34157y(long j10) {
        return j10 - m34146l();
    }

    /* renamed from: z */
    public long m34158z(long j10) {
        return j10 + m34146l();
    }
}
