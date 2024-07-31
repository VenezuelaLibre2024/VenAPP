package p039c7;

import p039c7.AbstractC1883e;
import p361t6.C11108u1;
import p363t8.C11146e0;
import p363t8.C11179x;
import p378u8.C11447a;
import p459y6.InterfaceC12609b0;

/* renamed from: c7.f */
/* loaded from: classes.dex */
final class C1884f extends AbstractC1883e {

    /* renamed from: b */
    private final C11146e0 f7845b;

    /* renamed from: c */
    private final C11146e0 f7846c;

    /* renamed from: d */
    private int f7847d;

    /* renamed from: e */
    private boolean f7848e;

    /* renamed from: f */
    private boolean f7849f;

    /* renamed from: g */
    private int f7850g;

    public C1884f(InterfaceC12609b0 interfaceC12609b0) {
        super(interfaceC12609b0);
        this.f7845b = new C11146e0(C11179x.f29069a);
        this.f7846c = new C11146e0(4);
    }

    @Override // p039c7.AbstractC1883e
    /* renamed from: b */
    protected boolean mo9985b(C11146e0 c11146e0) {
        int m34664H = c11146e0.m34664H();
        int i10 = (m34664H >> 4) & 15;
        int i11 = m34664H & 15;
        if (i11 == 7) {
            this.f7850g = i10;
            return i10 != 5;
        }
        throw new AbstractC1883e.a("Video format not supported: " + i11);
    }

    @Override // p039c7.AbstractC1883e
    /* renamed from: c */
    protected boolean mo9986c(C11146e0 c11146e0, long j10) {
        int m34664H = c11146e0.m34664H();
        long m34693r = j10 + (c11146e0.m34693r() * 1000);
        if (m34664H == 0 && !this.f7848e) {
            C11146e0 c11146e02 = new C11146e0(new byte[c11146e0.m34679a()]);
            c11146e0.m34688l(c11146e02.m34682e(), 0, c11146e0.m34679a());
            C11447a m35769b = C11447a.m35769b(c11146e02);
            this.f7847d = m35769b.f29638b;
            this.f7844a.mo332c(new C11108u1.b().m34552g0("video/avc").m34530K(m35769b.f29642f).m34559n0(m35769b.f29639c).m34538S(m35769b.f29640d).m34548c0(m35769b.f29641e).m34541V(m35769b.f29637a).m34526G());
            this.f7848e = true;
            return false;
        }
        if (m34664H != 1 || !this.f7848e) {
            return false;
        }
        int i10 = this.f7850g == 1 ? 1 : 0;
        if (!this.f7849f && i10 == 0) {
            return false;
        }
        byte[] m34682e = this.f7846c.m34682e();
        m34682e[0] = 0;
        m34682e[1] = 0;
        m34682e[2] = 0;
        int i11 = 4 - this.f7847d;
        int i12 = 0;
        while (c11146e0.m34679a() > 0) {
            c11146e0.m34688l(this.f7846c.m34682e(), i11, this.f7847d);
            this.f7846c.m34677U(0);
            int m34668L = this.f7846c.m34668L();
            this.f7845b.m34677U(0);
            this.f7844a.m41511a(this.f7845b, 4);
            this.f7844a.m41511a(c11146e0, m34668L);
            i12 = i12 + 4 + m34668L;
        }
        this.f7844a.mo331b(m34693r, i10, i12, 0, null);
        this.f7849f = true;
        return true;
    }
}
