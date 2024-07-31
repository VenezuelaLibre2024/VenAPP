package p175j7;

import android.util.Pair;
import p361t6.C11005b3;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p459y6.InterfaceC12622l;

/* renamed from: j7.d */
/* loaded from: classes.dex */
final class C8995d {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j7.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f21580a;

        /* renamed from: b */
        public final long f21581b;

        private a(int i10, long j10) {
            this.f21580a = i10;
            this.f21581b = j10;
        }

        /* renamed from: a */
        public static a m26409a(InterfaceC12622l interfaceC12622l, C11146e0 c11146e0) {
            interfaceC12622l.mo41540q(c11146e0.m34682e(), 0, 8);
            c11146e0.m34677U(0);
            return new a(c11146e0.m34692q(), c11146e0.m34699x());
        }
    }

    /* renamed from: a */
    public static boolean m26404a(InterfaceC12622l interfaceC12622l) {
        C11146e0 c11146e0 = new C11146e0(8);
        int i10 = a.m26409a(interfaceC12622l, c11146e0).f21580a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        interfaceC12622l.mo41540q(c11146e0.m34682e(), 0, 4);
        c11146e0.m34677U(0);
        int m34692q = c11146e0.m34692q();
        if (m34692q == 1463899717) {
            return true;
        }
        C11173s.m34964c("WavHeaderReader", "Unsupported form type: " + m34692q);
        return false;
    }

    /* renamed from: b */
    public static C8994c m26405b(InterfaceC12622l interfaceC12622l) {
        byte[] bArr;
        C11146e0 c11146e0 = new C11146e0(16);
        a m26407d = m26407d(1718449184, interfaceC12622l, c11146e0);
        C11137a.m34605g(m26407d.f21581b >= 16);
        interfaceC12622l.mo41540q(c11146e0.m34682e(), 0, 16);
        c11146e0.m34677U(0);
        int m34701z = c11146e0.m34701z();
        int m34701z2 = c11146e0.m34701z();
        int m34700y = c11146e0.m34700y();
        int m34700y2 = c11146e0.m34700y();
        int m34701z3 = c11146e0.m34701z();
        int m34701z4 = c11146e0.m34701z();
        int i10 = ((int) m26407d.f21581b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            interfaceC12622l.mo41540q(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = C11172r0.f29045f;
        }
        interfaceC12622l.mo41538n((int) (interfaceC12622l.mo19807i() - interfaceC12622l.getPosition()));
        return new C8994c(m34701z, m34701z2, m34700y, m34700y2, m34701z3, m34701z4, bArr);
    }

    /* renamed from: c */
    public static long m26406c(InterfaceC12622l interfaceC12622l) {
        C11146e0 c11146e0 = new C11146e0(8);
        a m26409a = a.m26409a(interfaceC12622l, c11146e0);
        if (m26409a.f21580a != 1685272116) {
            interfaceC12622l.mo41534f();
            return -1L;
        }
        interfaceC12622l.mo41536k(8);
        c11146e0.m34677U(0);
        interfaceC12622l.mo41540q(c11146e0.m34682e(), 0, 8);
        long m34697v = c11146e0.m34697v();
        interfaceC12622l.mo41538n(((int) m26409a.f21581b) + 8);
        return m34697v;
    }

    /* renamed from: d */
    private static a m26407d(int i10, InterfaceC12622l interfaceC12622l, C11146e0 c11146e0) {
        while (true) {
            a m26409a = a.m26409a(interfaceC12622l, c11146e0);
            if (m26409a.f21580a == i10) {
                return m26409a;
            }
            C11173s.m34970i("WavHeaderReader", "Ignoring unknown WAV chunk: " + m26409a.f21580a);
            long j10 = m26409a.f21581b + 8;
            if (j10 > 2147483647L) {
                throw C11005b3.m33719e("Chunk is too large (~2GB+) to skip; id: " + m26409a.f21580a);
            }
            interfaceC12622l.mo41538n((int) j10);
        }
    }

    /* renamed from: e */
    public static Pair<Long, Long> m26408e(InterfaceC12622l interfaceC12622l) {
        interfaceC12622l.mo41534f();
        a m26407d = m26407d(1684108385, interfaceC12622l, new C11146e0(8));
        interfaceC12622l.mo41538n(8);
        return Pair.create(Long.valueOf(interfaceC12622l.getPosition()), Long.valueOf(m26407d.f21581b));
    }
}
