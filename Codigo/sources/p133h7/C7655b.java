package p133h7;

import java.util.Arrays;
import p133h7.AbstractC7662i;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p459y6.C12627q;
import p459y6.C12628r;
import p459y6.C12629s;
import p459y6.C12630t;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12636z;

/* renamed from: h7.b */
/* loaded from: classes.dex */
final class C7655b extends AbstractC7662i {

    /* renamed from: n */
    private C12630t f18120n;

    /* renamed from: o */
    private a f18121o;

    /* renamed from: h7.b$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC7660g {

        /* renamed from: a */
        private C12630t f18122a;

        /* renamed from: b */
        private C12630t.a f18123b;

        /* renamed from: c */
        private long f18124c = -1;

        /* renamed from: d */
        private long f18125d = -1;

        public a(C12630t c12630t, C12630t.a aVar) {
            this.f18122a = c12630t;
            this.f18123b = aVar;
        }

        @Override // p133h7.InterfaceC7660g
        /* renamed from: a */
        public long mo23247a(InterfaceC12622l interfaceC12622l) {
            long j10 = this.f18125d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f18125d = -1L;
            return j11;
        }

        @Override // p133h7.InterfaceC7660g
        /* renamed from: b */
        public InterfaceC12636z mo23248b() {
            C11137a.m34605g(this.f18124c != -1);
            return new C12629s(this.f18122a, this.f18124c);
        }

        @Override // p133h7.InterfaceC7660g
        /* renamed from: c */
        public void mo23249c(long j10) {
            long[] jArr = this.f18123b.f34320a;
            this.f18125d = jArr[C11172r0.m34926i(jArr, j10, true, true)];
        }

        /* renamed from: d */
        public void m23258d(long j10) {
            this.f18124c = j10;
        }
    }

    /* renamed from: n */
    private int m23252n(C11146e0 c11146e0) {
        int i10 = (c11146e0.m34682e()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            c11146e0.m34678V(4);
            c11146e0.m34671O();
        }
        int m41580j = C12627q.m41580j(c11146e0, i10);
        c11146e0.m34677U(0);
        return m41580j;
    }

    /* renamed from: o */
    private static boolean m23253o(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: p */
    public static boolean m23254p(C11146e0 c11146e0) {
        return c11146e0.m34679a() >= 5 && c11146e0.m34664H() == 127 && c11146e0.m34666J() == 1179402563;
    }

    @Override // p133h7.AbstractC7662i
    /* renamed from: f */
    protected long mo23255f(C11146e0 c11146e0) {
        if (m23253o(c11146e0.m34682e())) {
            return m23252n(c11146e0);
        }
        return -1L;
    }

    @Override // p133h7.AbstractC7662i
    /* renamed from: h */
    protected boolean mo23256h(C11146e0 c11146e0, long j10, AbstractC7662i.b bVar) {
        byte[] m34682e = c11146e0.m34682e();
        C12630t c12630t = this.f18120n;
        if (c12630t == null) {
            C12630t c12630t2 = new C12630t(m34682e, 17);
            this.f18120n = c12630t2;
            bVar.f18162a = c12630t2.m41599g(Arrays.copyOfRange(m34682e, 9, c11146e0.m34684g()), null);
            return true;
        }
        if ((m34682e[0] & Byte.MAX_VALUE) == 3) {
            C12630t.a m41586f = C12628r.m41586f(c11146e0);
            C12630t m41595b = c12630t.m41595b(m41586f);
            this.f18120n = m41595b;
            this.f18121o = new a(m41595b, m41586f);
            return true;
        }
        if (!m23253o(m34682e)) {
            return true;
        }
        a aVar = this.f18121o;
        if (aVar != null) {
            aVar.m23258d(j10);
            bVar.f18163b = this.f18121o;
        }
        C11137a.m34603e(bVar.f18162a);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p133h7.AbstractC7662i
    /* renamed from: l */
    public void mo23257l(boolean z10) {
        super.mo23257l(z10);
        if (z10) {
            this.f18120n = null;
            this.f18121o = null;
        }
    }
}
