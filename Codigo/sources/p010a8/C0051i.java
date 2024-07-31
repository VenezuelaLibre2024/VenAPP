package p010a8;

import android.net.Uri;
import com.google.common.collect.AbstractC5907w;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p010a8.C0048f;
import p026b8.C1677g;
import p082eb.C7147c;
import p216l7.C9400a;
import p306q7.C10286h;
import p306q7.C10290l;
import p351s8.C10833m;
import p351s8.C10835n;
import p351s8.InterfaceC10827j;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11164n0;
import p363t8.C11168p0;
import p376u6.C11391m3;
import p436x6.C12318m;
import p437x7.AbstractC12348n;
import p459y6.C12614e;
import p459y6.InterfaceC12622l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a8.i */
/* loaded from: classes.dex */
public final class C0051i extends AbstractC12348n {

    /* renamed from: M */
    private static final AtomicInteger f160M = new AtomicInteger();

    /* renamed from: A */
    private final boolean f161A;

    /* renamed from: B */
    private final boolean f162B;

    /* renamed from: C */
    private final C11391m3 f163C;

    /* renamed from: D */
    private InterfaceC0052j f164D;

    /* renamed from: E */
    private C0058p f165E;

    /* renamed from: F */
    private int f166F;

    /* renamed from: G */
    private boolean f167G;

    /* renamed from: H */
    private volatile boolean f168H;

    /* renamed from: I */
    private boolean f169I;

    /* renamed from: J */
    private AbstractC5907w<Integer> f170J;

    /* renamed from: K */
    private boolean f171K;

    /* renamed from: L */
    private boolean f172L;

    /* renamed from: k */
    public final int f173k;

    /* renamed from: l */
    public final int f174l;

    /* renamed from: m */
    public final Uri f175m;

    /* renamed from: n */
    public final boolean f176n;

    /* renamed from: o */
    public final int f177o;

    /* renamed from: p */
    private final InterfaceC10827j f178p;

    /* renamed from: q */
    private final C10835n f179q;

    /* renamed from: r */
    private final InterfaceC0052j f180r;

    /* renamed from: s */
    private final boolean f181s;

    /* renamed from: t */
    private final boolean f182t;

    /* renamed from: u */
    private final C11164n0 f183u;

    /* renamed from: v */
    private final InterfaceC0050h f184v;

    /* renamed from: w */
    private final List<C11108u1> f185w;

    /* renamed from: x */
    private final C12318m f186x;

    /* renamed from: y */
    private final C10286h f187y;

    /* renamed from: z */
    private final C11146e0 f188z;

    private C0051i(InterfaceC0050h interfaceC0050h, InterfaceC10827j interfaceC10827j, C10835n c10835n, C11108u1 c11108u1, boolean z10, InterfaceC10827j interfaceC10827j2, C10835n c10835n2, boolean z11, Uri uri, List<C11108u1> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, C11164n0 c11164n0, C12318m c12318m, InterfaceC0052j interfaceC0052j, C10286h c10286h, C11146e0 c11146e0, boolean z15, C11391m3 c11391m3) {
        super(interfaceC10827j, c10835n, c11108u1, i10, obj, j10, j11, j12);
        this.f161A = z10;
        this.f177o = i11;
        this.f172L = z12;
        this.f174l = i12;
        this.f179q = c10835n2;
        this.f178p = interfaceC10827j2;
        this.f167G = c10835n2 != null;
        this.f162B = z11;
        this.f175m = uri;
        this.f181s = z14;
        this.f183u = c11164n0;
        this.f182t = z13;
        this.f184v = interfaceC0050h;
        this.f185w = list;
        this.f186x = c12318m;
        this.f180r = interfaceC0052j;
        this.f187y = c10286h;
        this.f188z = c11146e0;
        this.f176n = z15;
        this.f163C = c11391m3;
        this.f170J = AbstractC5907w.m15081v();
        this.f173k = f160M.getAndIncrement();
    }

    /* renamed from: i */
    private static InterfaceC10827j m213i(InterfaceC10827j interfaceC10827j, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return interfaceC10827j;
        }
        C11137a.m34603e(bArr2);
        return new C0043a(interfaceC10827j, bArr, bArr2);
    }

    /* renamed from: j */
    public static C0051i m214j(InterfaceC0050h interfaceC0050h, InterfaceC10827j interfaceC10827j, C11108u1 c11108u1, long j10, C1677g c1677g, C0048f.e eVar, Uri uri, List<C11108u1> list, int i10, Object obj, boolean z10, C0061s c0061s, C0051i c0051i, byte[] bArr, byte[] bArr2, boolean z11, C11391m3 c11391m3) {
        boolean z12;
        InterfaceC10827j interfaceC10827j2;
        C10835n c10835n;
        boolean z13;
        C10286h c10286h;
        C11146e0 c11146e0;
        InterfaceC0052j interfaceC0052j;
        C1677g.e eVar2 = eVar.f155a;
        C10835n m33030a = new C10835n.b().m33038i(C11168p0.m34839e(c1677g.f7175a, eVar2.f7138a)).m33037h(eVar2.f7146t).m33036g(eVar2.f7147u).m33031b(eVar.f158d ? 8 : 0).m33030a();
        boolean z14 = bArr != null;
        InterfaceC10827j m213i = m213i(interfaceC10827j, bArr, z14 ? m216l((String) C11137a.m34603e(eVar2.f7145s)) : null);
        C1677g.d dVar = eVar2.f7139b;
        if (dVar != null) {
            boolean z15 = bArr2 != null;
            byte[] m216l = z15 ? m216l((String) C11137a.m34603e(dVar.f7145s)) : null;
            z12 = z14;
            c10835n = new C10835n(C11168p0.m34839e(c1677g.f7175a, dVar.f7138a), dVar.f7146t, dVar.f7147u);
            interfaceC10827j2 = m213i(interfaceC10827j, bArr2, m216l);
            z13 = z15;
        } else {
            z12 = z14;
            interfaceC10827j2 = null;
            c10835n = null;
            z13 = false;
        }
        long j11 = j10 + eVar2.f7142e;
        long j12 = j11 + eVar2.f7140c;
        int i11 = c1677g.f7118j + eVar2.f7141d;
        if (c0051i != null) {
            C10835n c10835n2 = c0051i.f179q;
            boolean z16 = c10835n == c10835n2 || (c10835n != null && c10835n2 != null && c10835n.f27407a.equals(c10835n2.f27407a) && c10835n.f27413g == c0051i.f179q.f27413g);
            boolean z17 = uri.equals(c0051i.f175m) && c0051i.f169I;
            c10286h = c0051i.f187y;
            c11146e0 = c0051i.f188z;
            interfaceC0052j = (z16 && z17 && !c0051i.f171K && c0051i.f174l == i11) ? c0051i.f164D : null;
        } else {
            c10286h = new C10286h();
            c11146e0 = new C11146e0(10);
            interfaceC0052j = null;
        }
        return new C0051i(interfaceC0050h, m213i, m33030a, c11108u1, z12, interfaceC10827j2, c10835n, z13, uri, list, i10, obj, j11, j12, eVar.f156b, eVar.f157c, !eVar.f158d, i11, eVar2.f7148v, z10, c0061s.m343a(i11), eVar2.f7143f, interfaceC0052j, c10286h, c11146e0, z11, c11391m3);
    }

    /* renamed from: k */
    private void m215k(InterfaceC10827j interfaceC10827j, C10835n c10835n, boolean z10, boolean z11) {
        C10835n m33028e;
        long position;
        long j10;
        if (z10) {
            r0 = this.f166F != 0;
            m33028e = c10835n;
        } else {
            m33028e = c10835n.m33028e(this.f166F);
        }
        try {
            C12614e m221u = m221u(interfaceC10827j, m33028e, z11);
            if (r0) {
                m221u.mo41538n(this.f166F);
            }
            do {
                try {
                    try {
                        if (this.f168H) {
                            break;
                        }
                    } catch (EOFException e10) {
                        if ((this.f33116d.f28790e & 16384) == 0) {
                            throw e10;
                        }
                        this.f164D.mo165c();
                        position = m221u.getPosition();
                        j10 = c10835n.f27413g;
                    }
                } catch (Throwable th2) {
                    this.f166F = (int) (m221u.getPosition() - c10835n.f27413g);
                    throw th2;
                }
            } while (this.f164D.mo163a(m221u));
            position = m221u.getPosition();
            j10 = c10835n.f27413g;
            this.f166F = (int) (position - j10);
        } finally {
            C10833m.m33019a(interfaceC10827j);
        }
    }

    /* renamed from: l */
    private static byte[] m216l(String str) {
        if (C7147c.m21253e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* renamed from: p */
    private static boolean m217p(C0048f.e eVar, C1677g c1677g) {
        C1677g.e eVar2 = eVar.f155a;
        return eVar2 instanceof C1677g.b ? ((C1677g.b) eVar2).f7131w || (eVar.f157c == 0 && c1677g.f7177c) : c1677g.f7177c;
    }

    /* renamed from: r */
    private void m218r() {
        m215k(this.f33121i, this.f33114b, this.f161A, true);
    }

    /* renamed from: s */
    private void m219s() {
        if (this.f167G) {
            C11137a.m34603e(this.f178p);
            C11137a.m34603e(this.f179q);
            m215k(this.f178p, this.f179q, this.f162B, false);
            this.f166F = 0;
            this.f167G = false;
        }
    }

    /* renamed from: t */
    private long m220t(InterfaceC12622l interfaceC12622l) {
        interfaceC12622l.mo41534f();
        try {
            this.f188z.m34673Q(10);
            interfaceC12622l.mo41540q(this.f188z.m34682e(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f188z.m34667K() != 4801587) {
            return -9223372036854775807L;
        }
        this.f188z.m34678V(3);
        int m34663G = this.f188z.m34663G();
        int i10 = m34663G + 10;
        if (i10 > this.f188z.m34680b()) {
            byte[] m34682e = this.f188z.m34682e();
            this.f188z.m34673Q(i10);
            System.arraycopy(m34682e, 0, this.f188z.m34682e(), 0, 10);
        }
        interfaceC12622l.mo41540q(this.f188z.m34682e(), 10, m34663G);
        C9400a m30832e = this.f187y.m30832e(this.f188z.m34682e(), m34663G);
        if (m30832e == null) {
            return -9223372036854775807L;
        }
        int m27999e = m30832e.m27999e();
        for (int i11 = 0; i11 < m27999e; i11++) {
            C9400a.b m27998d = m30832e.m27998d(i11);
            if (m27998d instanceof C10290l) {
                C10290l c10290l = (C10290l) m27998d;
                if ("com.apple.streaming.transportStreamTimestamp".equals(c10290l.f25560b)) {
                    System.arraycopy(c10290l.f25561c, 0, this.f188z.m34682e(), 0, 8);
                    this.f188z.m34677U(0);
                    this.f188z.m34676T(8);
                    return this.f188z.m34657A() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: u */
    private C12614e m221u(InterfaceC10827j interfaceC10827j, C10835n c10835n, boolean z10) {
        C0058p c0058p;
        long j10;
        long mo162o = interfaceC10827j.mo162o(c10835n);
        if (z10) {
            try {
                this.f183u.m34830h(this.f181s, this.f33119g);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        C12614e c12614e = new C12614e(interfaceC10827j, c10835n.f27413g, mo162o);
        if (this.f164D == null) {
            long m220t = m220t(c12614e);
            c12614e.mo41534f();
            InterfaceC0052j interfaceC0052j = this.f180r;
            InterfaceC0052j mo168f = interfaceC0052j != null ? interfaceC0052j.mo168f() : this.f184v.mo176a(c10835n.f27407a, this.f33116d, this.f185w, this.f183u, interfaceC10827j.mo159e(), c12614e, this.f163C);
            this.f164D = mo168f;
            if (mo168f.mo167e()) {
                c0058p = this.f165E;
                j10 = m220t != -9223372036854775807L ? this.f183u.m34825b(m220t) : this.f33119g;
            } else {
                c0058p = this.f165E;
                j10 = 0;
            }
            c0058p.m318m0(j10);
            this.f165E.m302Y();
            this.f164D.mo164b(this.f165E);
        }
        this.f165E.m315j0(this.f186x);
        return c12614e;
    }

    /* renamed from: w */
    public static boolean m222w(C0051i c0051i, Uri uri, C1677g c1677g, C0048f.e eVar, long j10) {
        if (c0051i == null) {
            return false;
        }
        if (uri.equals(c0051i.f175m) && c0051i.f169I) {
            return false;
        }
        return !m217p(eVar, c1677g) || j10 + eVar.f155a.f7142e < c0051i.f33120h;
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: b */
    public void mo223b() {
        InterfaceC0052j interfaceC0052j;
        C11137a.m34603e(this.f165E);
        if (this.f164D == null && (interfaceC0052j = this.f180r) != null && interfaceC0052j.mo166d()) {
            this.f164D = this.f180r;
            this.f167G = false;
        }
        m219s();
        if (this.f168H) {
            return;
        }
        if (!this.f182t) {
            m218r();
        }
        this.f169I = !this.f168H;
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: c */
    public void mo224c() {
        this.f168H = true;
    }

    @Override // p437x7.AbstractC12348n
    /* renamed from: h */
    public boolean mo225h() {
        return this.f169I;
    }

    /* renamed from: m */
    public int m226m(int i10) {
        C11137a.m34605g(!this.f176n);
        if (i10 >= this.f170J.size()) {
            return 0;
        }
        return this.f170J.get(i10).intValue();
    }

    /* renamed from: n */
    public void m227n(C0058p c0058p, AbstractC5907w<Integer> abstractC5907w) {
        this.f165E = c0058p;
        this.f170J = abstractC5907w;
    }

    /* renamed from: o */
    public void m228o() {
        this.f171K = true;
    }

    /* renamed from: q */
    public boolean m229q() {
        return this.f172L;
    }

    /* renamed from: v */
    public void m230v() {
        this.f172L = true;
    }
}
