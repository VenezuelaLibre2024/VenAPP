package p361t6;

import com.google.common.collect.AbstractC5907w;
import p307q8.AbstractC10294a0;
import p307q8.C10296b0;
import p351s8.InterfaceC10811b;
import p361t6.AbstractC11018d4;
import p363t8.C11137a;
import p363t8.InterfaceC11165o;
import p376u6.InterfaceC11327a;
import p397v7.InterfaceC11684a0;
import p397v7.InterfaceC11739y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t6.l2 */
/* loaded from: classes.dex */
public final class C11064l2 {

    /* renamed from: a */
    private final AbstractC11018d4.b f28524a = new AbstractC11018d4.b();

    /* renamed from: b */
    private final AbstractC11018d4.d f28525b = new AbstractC11018d4.d();

    /* renamed from: c */
    private final InterfaceC11327a f28526c;

    /* renamed from: d */
    private final InterfaceC11165o f28527d;

    /* renamed from: e */
    private long f28528e;

    /* renamed from: f */
    private int f28529f;

    /* renamed from: g */
    private boolean f28530g;

    /* renamed from: h */
    private C11046i2 f28531h;

    /* renamed from: i */
    private C11046i2 f28532i;

    /* renamed from: j */
    private C11046i2 f28533j;

    /* renamed from: k */
    private int f28534k;

    /* renamed from: l */
    private Object f28535l;

    /* renamed from: m */
    private long f28536m;

    public C11064l2(InterfaceC11327a interfaceC11327a, InterfaceC11165o interfaceC11165o) {
        this.f28526c = interfaceC11327a;
        this.f28527d = interfaceC11165o;
    }

    /* renamed from: A */
    private static InterfaceC11684a0.b m34253A(AbstractC11018d4 abstractC11018d4, Object obj, long j10, long j11, AbstractC11018d4.d dVar, AbstractC11018d4.b bVar) {
        abstractC11018d4.mo33628m(obj, bVar);
        abstractC11018d4.m34004s(bVar.f28227c, dVar);
        int mo11856g = abstractC11018d4.mo11856g(obj);
        Object obj2 = obj;
        while (bVar.f28228d == 0 && bVar.m34012g() > 0 && bVar.m34026u(bVar.m34024s()) && bVar.m34014i(0L) == -1) {
            int i10 = mo11856g + 1;
            if (mo11856g >= dVar.f28253A) {
                break;
            }
            abstractC11018d4.mo11857l(i10, bVar, true);
            obj2 = C11137a.m34603e(bVar.f28226b);
            mo11856g = i10;
        }
        abstractC11018d4.mo33628m(obj2, bVar);
        int m34014i = bVar.m34014i(j10);
        return m34014i == -1 ? new InterfaceC11684a0.b(obj2, j11, bVar.m34013h(j10)) : new InterfaceC11684a0.b(obj2, m34014i, bVar.m34020o(m34014i), j11);
    }

    /* renamed from: C */
    private long m34254C(AbstractC11018d4 abstractC11018d4, Object obj) {
        int mo11856g;
        int i10 = abstractC11018d4.mo33628m(obj, this.f28524a).f28227c;
        Object obj2 = this.f28535l;
        if (obj2 != null && (mo11856g = abstractC11018d4.mo11856g(obj2)) != -1 && abstractC11018d4.m34001k(mo11856g, this.f28524a).f28227c == i10) {
            return this.f28536m;
        }
        C11046i2 c11046i2 = this.f28531h;
        while (true) {
            if (c11046i2 == null) {
                c11046i2 = this.f28531h;
                while (c11046i2 != null) {
                    int mo11856g2 = abstractC11018d4.mo11856g(c11046i2.f28410b);
                    if (mo11856g2 == -1 || abstractC11018d4.m34001k(mo11856g2, this.f28524a).f28227c != i10) {
                        c11046i2 = c11046i2.m34144j();
                    }
                }
                long j10 = this.f28528e;
                this.f28528e = 1 + j10;
                if (this.f28531h == null) {
                    this.f28535l = obj;
                    this.f28536m = j10;
                }
                return j10;
            }
            if (c11046i2.f28410b.equals(obj)) {
                break;
            }
            c11046i2 = c11046i2.m34144j();
        }
        return c11046i2.f28414f.f28461a.f30977d;
    }

    /* renamed from: E */
    private boolean m34255E(AbstractC11018d4 abstractC11018d4) {
        C11046i2 c11046i2 = this.f28531h;
        if (c11046i2 == null) {
            return true;
        }
        int mo11856g = abstractC11018d4.mo11856g(c11046i2.f28410b);
        while (true) {
            mo11856g = abstractC11018d4.m34000i(mo11856g, this.f28524a, this.f28525b, this.f28529f, this.f28530g);
            while (c11046i2.m34144j() != null && !c11046i2.f28414f.f28467g) {
                c11046i2 = c11046i2.m34144j();
            }
            C11046i2 m34144j = c11046i2.m34144j();
            if (mo11856g == -1 || m34144j == null || abstractC11018d4.mo11856g(m34144j.f28410b) != mo11856g) {
                break;
            }
            c11046i2 = m34144j;
        }
        boolean m34286z = m34286z(c11046i2);
        c11046i2.f28414f = m34283r(abstractC11018d4, c11046i2.f28414f);
        return !m34286z;
    }

    /* renamed from: d */
    private boolean m34257d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    /* renamed from: e */
    private boolean m34258e(C11052j2 c11052j2, C11052j2 c11052j22) {
        return c11052j2.f28462b == c11052j22.f28462b && c11052j2.f28461a.equals(c11052j22.f28461a);
    }

    /* renamed from: h */
    private C11052j2 m34259h(C11035g3 c11035g3) {
        return m34261k(c11035g3.f28284a, c11035g3.f28285b, c11035g3.f28286c, c11035g3.f28301r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cc, code lost:
    
        if (r0.m34026u(r0.m34024s()) != false) goto L30;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p361t6.C11052j2 m34260i(p361t6.AbstractC11018d4 r20, p361t6.C11046i2 r21, long r22) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p361t6.C11064l2.m34260i(t6.d4, t6.i2, long):t6.j2");
    }

    /* renamed from: k */
    private C11052j2 m34261k(AbstractC11018d4 abstractC11018d4, InterfaceC11684a0.b bVar, long j10, long j11) {
        abstractC11018d4.mo33628m(bVar.f30974a, this.f28524a);
        boolean m37106b = bVar.m37106b();
        Object obj = bVar.f30974a;
        return m37106b ? m34262l(abstractC11018d4, obj, bVar.f30975b, bVar.f30976c, j10, bVar.f30977d) : m34263m(abstractC11018d4, obj, j11, j10, bVar.f30977d);
    }

    /* renamed from: l */
    private C11052j2 m34262l(AbstractC11018d4 abstractC11018d4, Object obj, int i10, int i11, long j10, long j11) {
        InterfaceC11684a0.b bVar = new InterfaceC11684a0.b(obj, i10, i11, j11);
        long m34011f = abstractC11018d4.mo33628m(bVar.f30974a, this.f28524a).m34011f(bVar.f30975b, bVar.f30976c);
        long m34016k = i11 == this.f28524a.m34020o(i10) ? this.f28524a.m34016k() : 0L;
        return new C11052j2(bVar, (m34011f == -9223372036854775807L || m34016k < m34011f) ? m34016k : Math.max(0L, m34011f - 1), j10, -9223372036854775807L, m34011f, this.f28524a.m34026u(bVar.f30975b), false, false, false);
    }

    /* renamed from: m */
    private C11052j2 m34263m(AbstractC11018d4 abstractC11018d4, Object obj, long j10, long j11, long j12) {
        boolean z10;
        long j13;
        long j14;
        long j15;
        long j16 = j10;
        abstractC11018d4.mo33628m(obj, this.f28524a);
        int m34013h = this.f28524a.m34013h(j16);
        int i10 = 1;
        AbstractC11018d4.b bVar = this.f28524a;
        if (m34013h == -1) {
            if (bVar.m34012g() > 0) {
                AbstractC11018d4.b bVar2 = this.f28524a;
                if (bVar2.m34026u(bVar2.m34024s())) {
                    z10 = true;
                }
            }
            z10 = false;
        } else {
            if (bVar.m34026u(m34013h)) {
                long m34015j = this.f28524a.m34015j(m34013h);
                AbstractC11018d4.b bVar3 = this.f28524a;
                if (m34015j == bVar3.f28228d && bVar3.m34025t(m34013h)) {
                    z10 = true;
                    m34013h = -1;
                }
            }
            z10 = false;
        }
        InterfaceC11684a0.b bVar4 = new InterfaceC11684a0.b(obj, j12, m34013h);
        boolean m34265s = m34265s(bVar4);
        boolean m34267u = m34267u(abstractC11018d4, bVar4);
        boolean m34266t = m34266t(abstractC11018d4, bVar4, m34265s);
        boolean z11 = m34013h != -1 && this.f28524a.m34026u(m34013h);
        if (m34013h != -1) {
            j14 = this.f28524a.m34015j(m34013h);
        } else {
            if (!z10) {
                j13 = -9223372036854775807L;
                j15 = (j13 != -9223372036854775807L || j13 == Long.MIN_VALUE) ? this.f28524a.f28228d : j13;
                if (j15 != -9223372036854775807L && j16 >= j15) {
                    if (!m34266t && z10) {
                        i10 = 0;
                    }
                    j16 = Math.max(0L, j15 - i10);
                }
                return new C11052j2(bVar4, j16, j11, j13, j15, z11, m34265s, m34267u, m34266t);
            }
            j14 = this.f28524a.f28228d;
        }
        j13 = j14;
        if (j13 != -9223372036854775807L) {
        }
        if (j15 != -9223372036854775807L) {
            if (!m34266t) {
                i10 = 0;
            }
            j16 = Math.max(0L, j15 - i10);
        }
        return new C11052j2(bVar4, j16, j11, j13, j15, z11, m34265s, m34267u, m34266t);
    }

    /* renamed from: n */
    private long m34264n(AbstractC11018d4 abstractC11018d4, Object obj, int i10) {
        abstractC11018d4.mo33628m(obj, this.f28524a);
        long m34015j = this.f28524a.m34015j(i10);
        return m34015j == Long.MIN_VALUE ? this.f28524a.f28228d : m34015j + this.f28524a.m34018m(i10);
    }

    /* renamed from: s */
    private boolean m34265s(InterfaceC11684a0.b bVar) {
        return !bVar.m37106b() && bVar.f30978e == -1;
    }

    /* renamed from: t */
    private boolean m34266t(AbstractC11018d4 abstractC11018d4, InterfaceC11684a0.b bVar, boolean z10) {
        int mo11856g = abstractC11018d4.mo11856g(bVar.f30974a);
        return !abstractC11018d4.m34004s(abstractC11018d4.m34001k(mo11856g, this.f28524a).f28227c, this.f28525b).f28263t && abstractC11018d4.m34006w(mo11856g, this.f28524a, this.f28525b, this.f28529f, this.f28530g) && z10;
    }

    /* renamed from: u */
    private boolean m34267u(AbstractC11018d4 abstractC11018d4, InterfaceC11684a0.b bVar) {
        if (m34265s(bVar)) {
            return abstractC11018d4.m34004s(abstractC11018d4.mo33628m(bVar.f30974a, this.f28524a).f28227c, this.f28525b).f28253A == abstractC11018d4.mo11856g(bVar.f30974a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m34268w(AbstractC5907w.a aVar, InterfaceC11684a0.b bVar) {
        this.f28526c.mo35417H(aVar.m15094k(), bVar);
    }

    /* renamed from: x */
    private void m34269x() {
        final AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
        for (C11046i2 c11046i2 = this.f28531h; c11046i2 != null; c11046i2 = c11046i2.m34144j()) {
            m15077p.mo14724a(c11046i2.f28414f.f28461a);
        }
        C11046i2 c11046i22 = this.f28532i;
        final InterfaceC11684a0.b bVar = c11046i22 == null ? null : c11046i22.f28414f.f28461a;
        this.f28527d.mo34778h(new Runnable() { // from class: t6.k2
            @Override // java.lang.Runnable
            public final void run() {
                C11064l2.this.m34268w(m15077p, bVar);
            }
        });
    }

    /* renamed from: B */
    public InterfaceC11684a0.b m34270B(AbstractC11018d4 abstractC11018d4, Object obj, long j10) {
        long m34254C = m34254C(abstractC11018d4, obj);
        abstractC11018d4.mo33628m(obj, this.f28524a);
        abstractC11018d4.m34004s(this.f28524a.f28227c, this.f28525b);
        boolean z10 = false;
        for (int mo11856g = abstractC11018d4.mo11856g(obj); mo11856g >= this.f28525b.f28269z; mo11856g--) {
            abstractC11018d4.mo11857l(mo11856g, this.f28524a, true);
            boolean z11 = this.f28524a.m34012g() > 0;
            z10 |= z11;
            AbstractC11018d4.b bVar = this.f28524a;
            if (bVar.m34014i(bVar.f28228d) != -1) {
                obj = C11137a.m34603e(this.f28524a.f28226b);
            }
            if (z10 && (!z11 || this.f28524a.f28228d != 0)) {
                break;
            }
        }
        return m34253A(abstractC11018d4, obj, j10, m34254C, this.f28525b, this.f28524a);
    }

    /* renamed from: D */
    public boolean m34271D() {
        C11046i2 c11046i2 = this.f28533j;
        return c11046i2 == null || (!c11046i2.f28414f.f28469i && c11046i2.m34151q() && this.f28533j.f28414f.f28465e != -9223372036854775807L && this.f28534k < 100);
    }

    /* renamed from: F */
    public boolean m34272F(AbstractC11018d4 abstractC11018d4, long j10, long j11) {
        C11052j2 c11052j2;
        C11046i2 c11046i2 = this.f28531h;
        C11046i2 c11046i22 = null;
        while (c11046i2 != null) {
            C11052j2 c11052j22 = c11046i2.f28414f;
            if (c11046i22 != null) {
                C11052j2 m34260i = m34260i(abstractC11018d4, c11046i22, j10);
                if (m34260i != null && m34258e(c11052j22, m34260i)) {
                    c11052j2 = m34260i;
                }
                return !m34286z(c11046i22);
            }
            c11052j2 = m34283r(abstractC11018d4, c11052j22);
            c11046i2.f28414f = c11052j2.m34192a(c11052j22.f28463c);
            if (!m34257d(c11052j22.f28465e, c11052j2.f28465e)) {
                c11046i2.m34139A();
                long j12 = c11052j2.f28465e;
                return (m34286z(c11046i2) || (c11046i2 == this.f28532i && !c11046i2.f28414f.f28466f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c11046i2.m34158z(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c11046i2.m34158z(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            c11046i22 = c11046i2;
            c11046i2 = c11046i2.m34144j();
        }
        return true;
    }

    /* renamed from: G */
    public boolean m34273G(AbstractC11018d4 abstractC11018d4, int i10) {
        this.f28529f = i10;
        return m34255E(abstractC11018d4);
    }

    /* renamed from: H */
    public boolean m34274H(AbstractC11018d4 abstractC11018d4, boolean z10) {
        this.f28530g = z10;
        return m34255E(abstractC11018d4);
    }

    /* renamed from: b */
    public C11046i2 m34275b() {
        C11046i2 c11046i2 = this.f28531h;
        if (c11046i2 == null) {
            return null;
        }
        if (c11046i2 == this.f28532i) {
            this.f28532i = c11046i2.m34144j();
        }
        this.f28531h.m34153t();
        int i10 = this.f28534k - 1;
        this.f28534k = i10;
        if (i10 == 0) {
            this.f28533j = null;
            C11046i2 c11046i22 = this.f28531h;
            this.f28535l = c11046i22.f28410b;
            this.f28536m = c11046i22.f28414f.f28461a.f30977d;
        }
        this.f28531h = this.f28531h.m34144j();
        m34269x();
        return this.f28531h;
    }

    /* renamed from: c */
    public C11046i2 m34276c() {
        C11046i2 c11046i2 = this.f28532i;
        C11137a.m34605g((c11046i2 == null || c11046i2.m34144j() == null) ? false : true);
        this.f28532i = this.f28532i.m34144j();
        m34269x();
        return this.f28532i;
    }

    /* renamed from: f */
    public void m34277f() {
        if (this.f28534k == 0) {
            return;
        }
        C11046i2 c11046i2 = (C11046i2) C11137a.m34607i(this.f28531h);
        this.f28535l = c11046i2.f28410b;
        this.f28536m = c11046i2.f28414f.f28461a.f30977d;
        while (c11046i2 != null) {
            c11046i2.m34153t();
            c11046i2 = c11046i2.m34144j();
        }
        this.f28531h = null;
        this.f28533j = null;
        this.f28532i = null;
        this.f28534k = 0;
        m34269x();
    }

    /* renamed from: g */
    public C11046i2 m34278g(InterfaceC11095r3[] interfaceC11095r3Arr, AbstractC10294a0 abstractC10294a0, InterfaceC10811b interfaceC10811b, C10999a3 c10999a3, C11052j2 c11052j2, C10296b0 c10296b0) {
        C11046i2 c11046i2 = this.f28533j;
        C11046i2 c11046i22 = new C11046i2(interfaceC11095r3Arr, c11046i2 == null ? 1000000000000L : (c11046i2.m34146l() + this.f28533j.f28414f.f28465e) - c11052j2.f28462b, abstractC10294a0, interfaceC10811b, c10999a3, c11052j2, c10296b0);
        C11046i2 c11046i23 = this.f28533j;
        if (c11046i23 != null) {
            c11046i23.m34155w(c11046i22);
        } else {
            this.f28531h = c11046i22;
            this.f28532i = c11046i22;
        }
        this.f28535l = null;
        this.f28533j = c11046i22;
        this.f28534k++;
        m34269x();
        return c11046i22;
    }

    /* renamed from: j */
    public C11046i2 m34279j() {
        return this.f28533j;
    }

    /* renamed from: o */
    public C11052j2 m34280o(long j10, C11035g3 c11035g3) {
        C11046i2 c11046i2 = this.f28533j;
        return c11046i2 == null ? m34259h(c11035g3) : m34260i(c11035g3.f28284a, c11046i2, j10);
    }

    /* renamed from: p */
    public C11046i2 m34281p() {
        return this.f28531h;
    }

    /* renamed from: q */
    public C11046i2 m34282q() {
        return this.f28532i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p361t6.C11052j2 m34283r(p361t6.AbstractC11018d4 r19, p361t6.C11052j2 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            v7.a0$b r3 = r2.f28461a
            boolean r12 = r0.m34265s(r3)
            boolean r13 = r0.m34267u(r1, r3)
            boolean r14 = r0.m34266t(r1, r3, r12)
            v7.a0$b r4 = r2.f28461a
            java.lang.Object r4 = r4.f30974a
            t6.d4$b r5 = r0.f28524a
            r1.mo33628m(r4, r5)
            boolean r1 = r3.m37106b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f30978e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            t6.d4$b r7 = r0.f28524a
            long r7 = r7.m34015j(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.m37106b()
            if (r1 == 0) goto L48
            t6.d4$b r1 = r0.f28524a
            int r5 = r3.f30975b
            int r6 = r3.f30976c
            long r5 = r1.m34011f(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            t6.d4$b r1 = r0.f28524a
            long r5 = r1.m34019n()
            goto L46
        L5c:
            boolean r1 = r3.m37106b()
            if (r1 == 0) goto L6c
            t6.d4$b r1 = r0.f28524a
            int r4 = r3.f30975b
            boolean r1 = r1.m34026u(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f30978e
            if (r1 == r4) goto L7a
            t6.d4$b r4 = r0.f28524a
            boolean r1 = r4.m34026u(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            t6.j2 r15 = new t6.j2
            long r4 = r2.f28462b
            long r1 = r2.f28463c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p361t6.C11064l2.m34283r(t6.d4, t6.j2):t6.j2");
    }

    /* renamed from: v */
    public boolean m34284v(InterfaceC11739y interfaceC11739y) {
        C11046i2 c11046i2 = this.f28533j;
        return c11046i2 != null && c11046i2.f28409a == interfaceC11739y;
    }

    /* renamed from: y */
    public void m34285y(long j10) {
        C11046i2 c11046i2 = this.f28533j;
        if (c11046i2 != null) {
            c11046i2.m34152s(j10);
        }
    }

    /* renamed from: z */
    public boolean m34286z(C11046i2 c11046i2) {
        boolean z10 = false;
        C11137a.m34605g(c11046i2 != null);
        if (c11046i2.equals(this.f28533j)) {
            return false;
        }
        this.f28533j = c11046i2;
        while (c11046i2.m34144j() != null) {
            c11046i2 = c11046i2.m34144j();
            if (c11046i2 == this.f28532i) {
                this.f28532i = this.f28531h;
                z10 = true;
            }
            c11046i2.m34153t();
            this.f28534k--;
        }
        this.f28533j.m34155w(null);
        m34269x();
        return z10;
    }
}
