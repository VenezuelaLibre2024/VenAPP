package p099f7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.EOFException;
import p099f7.InterfaceC7311g;
import p216l7.C9400a;
import p306q7.C10286h;
import p306q7.C10289k;
import p306q7.C10291m;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p396v6.C11668s0;
import p459y6.C12620j;
import p459y6.C12632v;
import p459y6.C12633w;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;

/* renamed from: f7.f */
/* loaded from: classes.dex */
public final class C7310f implements InterfaceC12621k {

    /* renamed from: u */
    public static final InterfaceC12626p f16388u = new InterfaceC12626p() { // from class: f7.d
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m21904o;
            m21904o = C7310f.m21904o();
            return m21904o;
        }
    };

    /* renamed from: v */
    private static final C10286h.a f16389v = new C10286h.a() { // from class: f7.e
        @Override // p306q7.C10286h.a
        /* renamed from: a */
        public final boolean mo21894a(int i10, int i11, int i12, int i13, int i14) {
            boolean m21905p;
            m21905p = C7310f.m21905p(i10, i11, i12, i13, i14);
            return m21905p;
        }
    };

    /* renamed from: a */
    private final int f16390a;

    /* renamed from: b */
    private final long f16391b;

    /* renamed from: c */
    private final C11146e0 f16392c;

    /* renamed from: d */
    private final C11668s0.a f16393d;

    /* renamed from: e */
    private final C12632v f16394e;

    /* renamed from: f */
    private final C12633w f16395f;

    /* renamed from: g */
    private final InterfaceC12609b0 f16396g;

    /* renamed from: h */
    private InterfaceC12623m f16397h;

    /* renamed from: i */
    private InterfaceC12609b0 f16398i;

    /* renamed from: j */
    private InterfaceC12609b0 f16399j;

    /* renamed from: k */
    private int f16400k;

    /* renamed from: l */
    private C9400a f16401l;

    /* renamed from: m */
    private long f16402m;

    /* renamed from: n */
    private long f16403n;

    /* renamed from: o */
    private long f16404o;

    /* renamed from: p */
    private int f16405p;

    /* renamed from: q */
    private InterfaceC7311g f16406q;

    /* renamed from: r */
    private boolean f16407r;

    /* renamed from: s */
    private boolean f16408s;

    /* renamed from: t */
    private long f16409t;

    public C7310f() {
        this(0);
    }

    public C7310f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public C7310f(int i10, long j10) {
        this.f16390a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f16391b = j10;
        this.f16392c = new C11146e0(10);
        this.f16393d = new C11668s0.a();
        this.f16394e = new C12632v();
        this.f16402m = -9223372036854775807L;
        this.f16395f = new C12633w();
        C12620j c12620j = new C12620j();
        this.f16396g = c12620j;
        this.f16399j = c12620j;
    }

    /* renamed from: g */
    private void m21897g() {
        C11137a.m34607i(this.f16398i);
        C11172r0.m34928j(this.f16397h);
    }

    /* renamed from: h */
    private InterfaceC7311g m21898h(InterfaceC12622l interfaceC12622l) {
        long m21901l;
        long j10;
        InterfaceC7311g m21907r = m21907r(interfaceC12622l);
        C7307c m21906q = m21906q(this.f16401l, interfaceC12622l.getPosition());
        if (this.f16407r) {
            return new InterfaceC7311g.a();
        }
        if ((this.f16390a & 4) != 0) {
            if (m21906q != null) {
                m21901l = m21906q.mo127i();
                j10 = m21906q.mo21888g();
            } else if (m21907r != null) {
                m21901l = m21907r.mo127i();
                j10 = m21907r.mo21888g();
            } else {
                m21901l = m21901l(this.f16401l);
                j10 = -1;
            }
            m21907r = new C7306b(m21901l, interfaceC12622l.getPosition(), j10);
        } else if (m21906q != null) {
            m21907r = m21906q;
        } else if (m21907r == null) {
            m21907r = null;
        }
        if (m21907r == null || !(m21907r.mo126h() || (this.f16390a & 1) == 0)) {
            return m21900k(interfaceC12622l, (this.f16390a & 2) != 0);
        }
        return m21907r;
    }

    /* renamed from: i */
    private long m21899i(long j10) {
        return this.f16402m + ((j10 * 1000000) / this.f16393d.f30477d);
    }

    /* renamed from: k */
    private InterfaceC7311g m21900k(InterfaceC12622l interfaceC12622l, boolean z10) {
        interfaceC12622l.mo41540q(this.f16392c.m34682e(), 0, 4);
        this.f16392c.m34677U(0);
        this.f16393d.m36682a(this.f16392c.m34692q());
        return new C7305a(interfaceC12622l.getLength(), interfaceC12622l.getPosition(), this.f16393d, z10);
    }

    /* renamed from: l */
    private static long m21901l(C9400a c9400a) {
        if (c9400a == null) {
            return -9223372036854775807L;
        }
        int m27999e = c9400a.m27999e();
        for (int i10 = 0; i10 < m27999e; i10++) {
            C9400a.b m27998d = c9400a.m27998d(i10);
            if (m27998d instanceof C10291m) {
                C10291m c10291m = (C10291m) m27998d;
                if (c10291m.f25551a.equals("TLEN")) {
                    return C11172r0.m34861C0(Long.parseLong(c10291m.f25564d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: m */
    private static int m21902m(C11146e0 c11146e0, int i10) {
        if (c11146e0.m34684g() >= i10 + 4) {
            c11146e0.m34677U(i10);
            int m34692q = c11146e0.m34692q();
            if (m34692q == 1483304551 || m34692q == 1231971951) {
                return m34692q;
            }
        }
        if (c11146e0.m34684g() < 40) {
            return 0;
        }
        c11146e0.m34677U(36);
        return c11146e0.m34692q() == 1447187017 ? 1447187017 : 0;
    }

    /* renamed from: n */
    private static boolean m21903n(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ InterfaceC12621k[] m21904o() {
        return new InterfaceC12621k[]{new C7310f()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ boolean m21905p(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    /* renamed from: q */
    private static C7307c m21906q(C9400a c9400a, long j10) {
        if (c9400a == null) {
            return null;
        }
        int m27999e = c9400a.m27999e();
        for (int i10 = 0; i10 < m27999e; i10++) {
            C9400a.b m27998d = c9400a.m27998d(i10);
            if (m27998d instanceof C10289k) {
                return C7307c.m21892a(j10, (C10289k) m27998d, m21901l(c9400a));
            }
        }
        return null;
    }

    /* renamed from: r */
    private InterfaceC7311g m21907r(InterfaceC12622l interfaceC12622l) {
        C11146e0 c11146e0 = new C11146e0(this.f16393d.f30476c);
        interfaceC12622l.mo41540q(c11146e0.m34682e(), 0, this.f16393d.f30476c);
        C11668s0.a aVar = this.f16393d;
        int i10 = aVar.f30474a & 1;
        int i11 = 21;
        int i12 = aVar.f30478e;
        if (i10 != 0) {
            if (i12 != 1) {
                i11 = 36;
            }
        } else if (i12 == 1) {
            i11 = 13;
        }
        int i13 = i11;
        int m21902m = m21902m(c11146e0, i13);
        if (m21902m != 1483304551 && m21902m != 1231971951) {
            if (m21902m != 1447187017) {
                interfaceC12622l.mo41534f();
                return null;
            }
            C7312h m21913a = C7312h.m21913a(interfaceC12622l.getLength(), interfaceC12622l.getPosition(), this.f16393d, c11146e0);
            interfaceC12622l.mo41538n(this.f16393d.f30476c);
            return m21913a;
        }
        C7313i m21914a = C7313i.m21914a(interfaceC12622l.getLength(), interfaceC12622l.getPosition(), this.f16393d, c11146e0);
        if (m21914a != null && !this.f16394e.m41603a()) {
            interfaceC12622l.mo41534f();
            interfaceC12622l.mo41536k(i13 + 141);
            interfaceC12622l.mo41540q(this.f16392c.m34682e(), 0, 3);
            this.f16392c.m34677U(0);
            this.f16394e.m41605d(this.f16392c.m34667K());
        }
        interfaceC12622l.mo41538n(this.f16393d.f30476c);
        return (m21914a == null || m21914a.mo126h() || m21902m != 1231971951) ? m21914a : m21900k(interfaceC12622l, false);
    }

    /* renamed from: s */
    private boolean m21908s(InterfaceC12622l interfaceC12622l) {
        InterfaceC7311g interfaceC7311g = this.f16406q;
        if (interfaceC7311g != null) {
            long mo21888g = interfaceC7311g.mo21888g();
            if (mo21888g != -1 && interfaceC12622l.mo19807i() > mo21888g - 4) {
                return true;
            }
        }
        try {
            return !interfaceC12622l.mo41533d(this.f16392c.m34682e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: t */
    private int m21909t(InterfaceC12622l interfaceC12622l) {
        if (this.f16400k == 0) {
            try {
                m21911v(interfaceC12622l, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f16406q == null) {
            InterfaceC7311g m21898h = m21898h(interfaceC12622l);
            this.f16406q = m21898h;
            this.f16397h.mo323p(m21898h);
            this.f16399j.mo332c(new C11108u1.b().m34552g0(this.f16393d.f30475b).m34544Y(RecognitionOptions.AZTEC).m34529J(this.f16393d.f30478e).m34553h0(this.f16393d.f30477d).m34535P(this.f16394e.f34324a).m34536Q(this.f16394e.f34325b).m34545Z((this.f16390a & 8) != 0 ? null : this.f16401l).m34526G());
            this.f16404o = interfaceC12622l.getPosition();
        } else if (this.f16404o != 0) {
            long position = interfaceC12622l.getPosition();
            long j10 = this.f16404o;
            if (position < j10) {
                interfaceC12622l.mo41538n((int) (j10 - position));
            }
        }
        return m21910u(interfaceC12622l);
    }

    /* renamed from: u */
    private int m21910u(InterfaceC12622l interfaceC12622l) {
        if (this.f16405p == 0) {
            interfaceC12622l.mo41534f();
            if (m21908s(interfaceC12622l)) {
                return -1;
            }
            this.f16392c.m34677U(0);
            int m34692q = this.f16392c.m34692q();
            if (!m21903n(m34692q, this.f16400k) || C11668s0.m36678j(m34692q) == -1) {
                interfaceC12622l.mo41538n(1);
                this.f16400k = 0;
                return 0;
            }
            this.f16393d.m36682a(m34692q);
            if (this.f16402m == -9223372036854775807L) {
                this.f16402m = this.f16406q.mo21887c(interfaceC12622l.getPosition());
                if (this.f16391b != -9223372036854775807L) {
                    this.f16402m += this.f16391b - this.f16406q.mo21887c(0L);
                }
            }
            this.f16405p = this.f16393d.f30476c;
            InterfaceC7311g interfaceC7311g = this.f16406q;
            if (interfaceC7311g instanceof C7306b) {
                C7306b c7306b = (C7306b) interfaceC7311g;
                c7306b.m21890b(m21899i(this.f16403n + r0.f30480g), interfaceC12622l.getPosition() + this.f16393d.f30476c);
                if (this.f16408s && c7306b.m21889a(this.f16409t)) {
                    this.f16408s = false;
                    this.f16399j = this.f16398i;
                }
            }
        }
        int m41512f = this.f16399j.m41512f(interfaceC12622l, this.f16405p, true);
        if (m41512f == -1) {
            return -1;
        }
        int i10 = this.f16405p - m41512f;
        this.f16405p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f16399j.mo331b(m21899i(this.f16403n), 1, this.f16393d.f30476c, 0, null);
        this.f16403n += this.f16393d.f30480g;
        this.f16405p = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        if (r13 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
    
        r12.mo41538n(r1 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        r11.f16400k = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        r12.mo41534f();
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m21911v(p459y6.InterfaceC12622l r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.mo41534f()
            long r1 = r12.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L42
            int r1 = r11.f16390a
            r1 = r1 & 8
            if (r1 != 0) goto L20
            r1 = r3
            goto L21
        L20:
            r1 = r4
        L21:
            if (r1 == 0) goto L25
            r1 = r2
            goto L27
        L25:
            q7.h$a r1 = p099f7.C7310f.f16389v
        L27:
            y6.w r5 = r11.f16395f
            l7.a r1 = r5.m41606a(r12, r1)
            r11.f16401l = r1
            if (r1 == 0) goto L36
            y6.v r5 = r11.f16394e
            r5.m41604c(r1)
        L36:
            long r5 = r12.mo19807i()
            int r1 = (int) r5
            if (r13 != 0) goto L40
            r12.mo41538n(r1)
        L40:
            r5 = r4
            goto L44
        L42:
            r1 = r4
            r5 = r1
        L44:
            r6 = r5
            r7 = r6
        L46:
            boolean r8 = r11.m21908s(r12)
            if (r8 == 0) goto L55
            if (r6 <= 0) goto L4f
            goto L9e
        L4f:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L55:
            t8.e0 r8 = r11.f16392c
            r8.m34677U(r4)
            t8.e0 r8 = r11.f16392c
            int r8 = r8.m34692q()
            if (r5 == 0) goto L69
            long r9 = (long) r5
            boolean r9 = m21903n(r8, r9)
            if (r9 == 0) goto L70
        L69:
            int r9 = p396v6.C11668s0.m36678j(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L70:
            int r5 = r7 + 1
            if (r7 != r0) goto L7e
            if (r13 == 0) goto L77
            return r4
        L77:
            java.lang.String r12 = "Searched too many bytes."
            t6.b3 r12 = p361t6.C11005b3.m33715a(r12, r2)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.mo41534f()
            int r6 = r1 + r5
            r12.mo41536k(r6)
            goto L8c
        L89:
            r12.mo41538n(r3)
        L8c:
            r6 = r4
            r7 = r5
            r5 = r6
            goto L46
        L90:
            int r6 = r6 + 1
            if (r6 != r3) goto L9b
            v6.s0$a r5 = r11.f16393d
            r5.m36682a(r8)
            r5 = r8
            goto Lab
        L9b:
            r8 = 4
            if (r6 != r8) goto Lab
        L9e:
            if (r13 == 0) goto La5
            int r1 = r1 + r7
            r12.mo41538n(r1)
            goto La8
        La5:
            r12.mo41534f()
        La8:
            r11.f16400k = r5
            return r3
        Lab:
            int r9 = r9 + (-4)
            r12.mo41536k(r9)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: p099f7.C7310f.m21911v(y6.l, boolean):boolean");
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        this.f16400k = 0;
        this.f16402m = -9223372036854775807L;
        this.f16403n = 0L;
        this.f16405p = 0;
        this.f16409t = j11;
        InterfaceC7311g interfaceC7311g = this.f16406q;
        if (!(interfaceC7311g instanceof C7306b) || ((C7306b) interfaceC7311g).m21889a(j11)) {
            return;
        }
        this.f16408s = true;
        this.f16399j = this.f16396g;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f16397h = interfaceC12623m;
        InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(0, 1);
        this.f16398i = mo308d;
        this.f16399j = mo308d;
        this.f16397h.mo324q();
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        return m21911v(interfaceC12622l, true);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        m21897g();
        int m21909t = m21909t(interfaceC12622l);
        if (m21909t == -1 && (this.f16406q instanceof C7306b)) {
            long m21899i = m21899i(this.f16403n);
            if (this.f16406q.mo127i() != m21899i) {
                ((C7306b) this.f16406q).m21891e(m21899i);
                this.f16397h.mo323p(this.f16406q);
            }
        }
        return m21909t;
    }

    /* renamed from: j */
    public void m21912j() {
        this.f16407r = true;
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
