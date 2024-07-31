package p009a7;

import com.google.common.collect.AbstractC5877h1;
import java.util.ArrayList;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11173s;
import p363t8.C11178w;
import p459y6.C12619i;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12636z;

/* renamed from: a7.b */
/* loaded from: classes.dex */
public final class C0036b implements InterfaceC12621k {

    /* renamed from: c */
    private int f71c;

    /* renamed from: e */
    private C0037c f73e;

    /* renamed from: h */
    private long f76h;

    /* renamed from: i */
    private C0039e f77i;

    /* renamed from: m */
    private int f81m;

    /* renamed from: n */
    private boolean f82n;

    /* renamed from: a */
    private final C11146e0 f69a = new C11146e0(12);

    /* renamed from: b */
    private final c f70b = new c();

    /* renamed from: d */
    private InterfaceC12623m f72d = new C12619i();

    /* renamed from: g */
    private C0039e[] f75g = new C0039e[0];

    /* renamed from: k */
    private long f79k = -1;

    /* renamed from: l */
    private long f80l = -1;

    /* renamed from: j */
    private int f78j = -1;

    /* renamed from: f */
    private long f74f = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a7.b$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC12636z {

        /* renamed from: a */
        private final long f83a;

        public b(long j10) {
            this.f83a = j10;
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: d */
        public InterfaceC12636z.a mo125d(long j10) {
            InterfaceC12636z.a m143i = C0036b.this.f75g[0].m143i(j10);
            for (int i10 = 1; i10 < C0036b.this.f75g.length; i10++) {
                InterfaceC12636z.a m143i2 = C0036b.this.f75g[i10].m143i(j10);
                if (m143i2.f34332a.f34224b < m143i.f34332a.f34224b) {
                    m143i = m143i2;
                }
            }
            return m143i;
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: h */
        public boolean mo126h() {
            return true;
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: i */
        public long mo127i() {
            return this.f83a;
        }
    }

    /* renamed from: a7.b$c */
    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a */
        public int f85a;

        /* renamed from: b */
        public int f86b;

        /* renamed from: c */
        public int f87c;

        private c() {
        }

        /* renamed from: a */
        public void m128a(C11146e0 c11146e0) {
            this.f85a = c11146e0.m34696u();
            this.f86b = c11146e0.m34696u();
            this.f87c = 0;
        }

        /* renamed from: b */
        public void m129b(C11146e0 c11146e0) {
            m128a(c11146e0);
            if (this.f85a == 1414744396) {
                this.f87c = c11146e0.m34696u();
                return;
            }
            throw C11005b3.m33715a("LIST expected, found: " + this.f85a, null);
        }
    }

    /* renamed from: d */
    private static void m113d(InterfaceC12622l interfaceC12622l) {
        if ((interfaceC12622l.getPosition() & 1) == 1) {
            interfaceC12622l.mo41538n(1);
        }
    }

    /* renamed from: g */
    private C0039e m114g(int i10) {
        for (C0039e c0039e : this.f75g) {
            if (c0039e.m144j(i10)) {
                return c0039e;
            }
        }
        return null;
    }

    /* renamed from: h */
    private void m115h(C11146e0 c11146e0) {
        C0040f m151c = C0040f.m151c(1819436136, c11146e0);
        if (m151c.getType() != 1819436136) {
            throw C11005b3.m33715a("Unexpected header list type " + m151c.getType(), null);
        }
        C0037c c0037c = (C0037c) m151c.m152b(C0037c.class);
        if (c0037c == null) {
            throw C11005b3.m33715a("AviHeader not found", null);
        }
        this.f73e = c0037c;
        this.f74f = c0037c.f90c * c0037c.f88a;
        ArrayList arrayList = new ArrayList();
        AbstractC5877h1<InterfaceC0035a> it = m151c.f110a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            InterfaceC0035a next = it.next();
            if (next.getType() == 1819440243) {
                int i11 = i10 + 1;
                C0039e m118k = m118k((C0040f) next, i10);
                if (m118k != null) {
                    arrayList.add(m118k);
                }
                i10 = i11;
            }
        }
        this.f75g = (C0039e[]) arrayList.toArray(new C0039e[0]);
        this.f72d.mo324q();
    }

    /* renamed from: i */
    private void m116i(C11146e0 c11146e0) {
        long m117j = m117j(c11146e0);
        while (c11146e0.m34679a() >= 16) {
            int m34696u = c11146e0.m34696u();
            int m34696u2 = c11146e0.m34696u();
            long m34696u3 = c11146e0.m34696u() + m117j;
            c11146e0.m34696u();
            C0039e m114g = m114g(m34696u);
            if (m114g != null) {
                if ((m34696u2 & 16) == 16) {
                    m114g.m139b(m34696u3);
                }
                m114g.m145k();
            }
        }
        for (C0039e c0039e : this.f75g) {
            c0039e.m140c();
        }
        this.f82n = true;
        this.f72d.mo323p(new b(this.f74f));
    }

    /* renamed from: j */
    private long m117j(C11146e0 c11146e0) {
        if (c11146e0.m34679a() < 16) {
            return 0L;
        }
        int m34683f = c11146e0.m34683f();
        c11146e0.m34678V(8);
        long m34696u = c11146e0.m34696u();
        long j10 = this.f79k;
        long j11 = m34696u <= j10 ? j10 + 8 : 0L;
        c11146e0.m34677U(m34683f);
        return j11;
    }

    /* renamed from: k */
    private C0039e m118k(C0040f c0040f, int i10) {
        String str;
        C0038d c0038d = (C0038d) c0040f.m152b(C0038d.class);
        C0041g c0041g = (C0041g) c0040f.m152b(C0041g.class);
        if (c0038d == null) {
            str = "Missing Stream Header";
        } else {
            if (c0041g != null) {
                long m133a = c0038d.m133a();
                C11108u1 c11108u1 = c0041g.f112a;
                C11108u1.b m34488c = c11108u1.m34488c();
                m34488c.m34539T(i10);
                int i11 = c0038d.f97f;
                if (i11 != 0) {
                    m34488c.m34544Y(i11);
                }
                C0042h c0042h = (C0042h) c0040f.m152b(C0042h.class);
                if (c0042h != null) {
                    m34488c.m34542W(c0042h.f113a);
                }
                int m35003k = C11178w.m35003k(c11108u1.f28797w);
                if (m35003k != 1 && m35003k != 2) {
                    return null;
                }
                InterfaceC12609b0 mo308d = this.f72d.mo308d(i10, m35003k);
                mo308d.mo332c(m34488c.m34526G());
                C0039e c0039e = new C0039e(i10, m35003k, m133a, c0038d.f96e, mo308d);
                this.f74f = m133a;
                return c0039e;
            }
            str = "Missing Stream Format";
        }
        C11173s.m34970i("AviExtractor", str);
        return null;
    }

    /* renamed from: l */
    private int m119l(InterfaceC12622l interfaceC12622l) {
        if (interfaceC12622l.getPosition() >= this.f80l) {
            return -1;
        }
        C0039e c0039e = this.f77i;
        if (c0039e == null) {
            m113d(interfaceC12622l);
            interfaceC12622l.mo41540q(this.f69a.m34682e(), 0, 12);
            this.f69a.m34677U(0);
            int m34696u = this.f69a.m34696u();
            if (m34696u == 1414744396) {
                this.f69a.m34677U(8);
                interfaceC12622l.mo41538n(this.f69a.m34696u() != 1769369453 ? 8 : 12);
                interfaceC12622l.mo41534f();
                return 0;
            }
            int m34696u2 = this.f69a.m34696u();
            if (m34696u == 1263424842) {
                this.f76h = interfaceC12622l.getPosition() + m34696u2 + 8;
                return 0;
            }
            interfaceC12622l.mo41538n(8);
            interfaceC12622l.mo41534f();
            C0039e m114g = m114g(m34696u);
            if (m114g == null) {
                this.f76h = interfaceC12622l.getPosition() + m34696u2;
                return 0;
            }
            m114g.m148n(m34696u2);
            this.f77i = m114g;
        } else if (c0039e.m147m(interfaceC12622l)) {
            this.f77i = null;
        }
        return 0;
    }

    /* renamed from: m */
    private boolean m120m(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        boolean z10;
        if (this.f76h != -1) {
            long position = interfaceC12622l.getPosition();
            long j10 = this.f76h;
            if (j10 < position || j10 > 262144 + position) {
                c12635y.f34331a = j10;
                z10 = true;
                this.f76h = -1L;
                return z10;
            }
            interfaceC12622l.mo41538n((int) (j10 - position));
        }
        z10 = false;
        this.f76h = -1L;
        return z10;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        this.f76h = -1L;
        this.f77i = null;
        for (C0039e c0039e : this.f75g) {
            c0039e.m149o(j10);
        }
        if (j10 != 0) {
            this.f71c = 6;
        } else if (this.f75g.length == 0) {
            this.f71c = 0;
        } else {
            this.f71c = 3;
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f71c = 0;
        this.f72d = interfaceC12623m;
        this.f76h = -1L;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        interfaceC12622l.mo41540q(this.f69a.m34682e(), 0, 12);
        this.f69a.m34677U(0);
        if (this.f69a.m34696u() != 1179011410) {
            return false;
        }
        this.f69a.m34678V(4);
        return this.f69a.m34696u() == 541677121;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        if (m120m(interfaceC12622l, c12635y)) {
            return 1;
        }
        switch (this.f71c) {
            case 0:
                if (!mo123e(interfaceC12622l)) {
                    throw C11005b3.m33715a("AVI Header List not found", null);
                }
                interfaceC12622l.mo41538n(12);
                this.f71c = 1;
                return 0;
            case 1:
                interfaceC12622l.readFully(this.f69a.m34682e(), 0, 12);
                this.f69a.m34677U(0);
                this.f70b.m129b(this.f69a);
                c cVar = this.f70b;
                if (cVar.f87c == 1819436136) {
                    this.f78j = cVar.f86b;
                    this.f71c = 2;
                    return 0;
                }
                throw C11005b3.m33715a("hdrl expected, found: " + this.f70b.f87c, null);
            case 2:
                int i10 = this.f78j - 4;
                C11146e0 c11146e0 = new C11146e0(i10);
                interfaceC12622l.readFully(c11146e0.m34682e(), 0, i10);
                m115h(c11146e0);
                this.f71c = 3;
                return 0;
            case 3:
                if (this.f79k != -1) {
                    long position = interfaceC12622l.getPosition();
                    long j10 = this.f79k;
                    if (position != j10) {
                        this.f76h = j10;
                        return 0;
                    }
                }
                interfaceC12622l.mo41540q(this.f69a.m34682e(), 0, 12);
                interfaceC12622l.mo41534f();
                this.f69a.m34677U(0);
                this.f70b.m128a(this.f69a);
                int m34696u = this.f69a.m34696u();
                int i11 = this.f70b.f85a;
                if (i11 == 1179011410) {
                    interfaceC12622l.mo41538n(12);
                    return 0;
                }
                if (i11 != 1414744396 || m34696u != 1769369453) {
                    this.f76h = interfaceC12622l.getPosition() + this.f70b.f86b + 8;
                    return 0;
                }
                long position2 = interfaceC12622l.getPosition();
                this.f79k = position2;
                this.f80l = position2 + this.f70b.f86b + 8;
                if (!this.f82n) {
                    if (((C0037c) C11137a.m34603e(this.f73e)).m131a()) {
                        this.f71c = 4;
                        this.f76h = this.f80l;
                        return 0;
                    }
                    this.f72d.mo323p(new InterfaceC12636z.b(this.f74f));
                    this.f82n = true;
                }
                this.f76h = interfaceC12622l.getPosition() + 12;
                this.f71c = 6;
                return 0;
            case 4:
                interfaceC12622l.readFully(this.f69a.m34682e(), 0, 8);
                this.f69a.m34677U(0);
                int m34696u2 = this.f69a.m34696u();
                int m34696u3 = this.f69a.m34696u();
                if (m34696u2 == 829973609) {
                    this.f71c = 5;
                    this.f81m = m34696u3;
                } else {
                    this.f76h = interfaceC12622l.getPosition() + m34696u3;
                }
                return 0;
            case 5:
                C11146e0 c11146e02 = new C11146e0(this.f81m);
                interfaceC12622l.readFully(c11146e02.m34682e(), 0, this.f81m);
                m116i(c11146e02);
                this.f71c = 6;
                this.f76h = this.f79k;
                return 0;
            case 6:
                return m119l(interfaceC12622l);
            default:
                throw new AssertionError();
        }
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
