package p459y6;

import com.google.common.collect.AbstractC5907w;
import java.util.Arrays;
import java.util.List;
import p216l7.C9400a;
import p267o7.C9817a;
import p306q7.C10286h;
import p361t6.C11005b3;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p459y6.C12630t;

/* renamed from: y6.r */
/* loaded from: classes.dex */
public final class C12628r {

    /* renamed from: y6.r$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public C12630t f34305a;

        public a(C12630t c12630t) {
            this.f34305a = c12630t;
        }
    }

    /* renamed from: a */
    public static boolean m41581a(InterfaceC12622l interfaceC12622l) {
        C11146e0 c11146e0 = new C11146e0(4);
        interfaceC12622l.mo41540q(c11146e0.m34682e(), 0, 4);
        return c11146e0.m34666J() == 1716281667;
    }

    /* renamed from: b */
    public static int m41582b(InterfaceC12622l interfaceC12622l) {
        interfaceC12622l.mo41534f();
        C11146e0 c11146e0 = new C11146e0(2);
        interfaceC12622l.mo41540q(c11146e0.m34682e(), 0, 2);
        int m34670N = c11146e0.m34670N();
        int i10 = m34670N >> 2;
        interfaceC12622l.mo41534f();
        if (i10 == 16382) {
            return m34670N;
        }
        throw C11005b3.m33715a("First frame does not start with sync code.", null);
    }

    /* renamed from: c */
    public static C9400a m41583c(InterfaceC12622l interfaceC12622l, boolean z10) {
        C9400a m41606a = new C12633w().m41606a(interfaceC12622l, z10 ? null : C10286h.f25546b);
        if (m41606a == null || m41606a.m27999e() == 0) {
            return null;
        }
        return m41606a;
    }

    /* renamed from: d */
    public static C9400a m41584d(InterfaceC12622l interfaceC12622l, boolean z10) {
        interfaceC12622l.mo41534f();
        long mo19807i = interfaceC12622l.mo19807i();
        C9400a m41583c = m41583c(interfaceC12622l, z10);
        interfaceC12622l.mo41538n((int) (interfaceC12622l.mo19807i() - mo19807i));
        return m41583c;
    }

    /* renamed from: e */
    public static boolean m41585e(InterfaceC12622l interfaceC12622l, a aVar) {
        C12630t m41594a;
        interfaceC12622l.mo41534f();
        C11144d0 c11144d0 = new C11144d0(new byte[4]);
        interfaceC12622l.mo41540q(c11144d0.f28941a, 0, 4);
        boolean m34631g = c11144d0.m34631g();
        int m34632h = c11144d0.m34632h(7);
        int m34632h2 = c11144d0.m34632h(24) + 4;
        if (m34632h == 0) {
            m41594a = m41588h(interfaceC12622l);
        } else {
            C12630t c12630t = aVar.f34305a;
            if (c12630t == null) {
                throw new IllegalArgumentException();
            }
            if (m34632h == 3) {
                m41594a = c12630t.m41595b(m41587g(interfaceC12622l, m34632h2));
            } else if (m34632h == 4) {
                m41594a = c12630t.m41596c(m41590j(interfaceC12622l, m34632h2));
            } else {
                if (m34632h != 6) {
                    interfaceC12622l.mo41538n(m34632h2);
                    return m34631g;
                }
                C11146e0 c11146e0 = new C11146e0(m34632h2);
                interfaceC12622l.readFully(c11146e0.m34682e(), 0, m34632h2);
                c11146e0.m34678V(4);
                m41594a = c12630t.m41594a(AbstractC5907w.m15082w(C9817a.m29486a(c11146e0)));
            }
        }
        aVar.f34305a = m41594a;
        return m34631g;
    }

    /* renamed from: f */
    public static C12630t.a m41586f(C11146e0 c11146e0) {
        c11146e0.m34678V(1);
        int m34667K = c11146e0.m34667K();
        long m34683f = c11146e0.m34683f() + m34667K;
        int i10 = m34667K / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long m34657A = c11146e0.m34657A();
            if (m34657A == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = m34657A;
            jArr2[i11] = c11146e0.m34657A();
            c11146e0.m34678V(2);
            i11++;
        }
        c11146e0.m34678V((int) (m34683f - c11146e0.m34683f()));
        return new C12630t.a(jArr, jArr2);
    }

    /* renamed from: g */
    private static C12630t.a m41587g(InterfaceC12622l interfaceC12622l, int i10) {
        C11146e0 c11146e0 = new C11146e0(i10);
        interfaceC12622l.readFully(c11146e0.m34682e(), 0, i10);
        return m41586f(c11146e0);
    }

    /* renamed from: h */
    private static C12630t m41588h(InterfaceC12622l interfaceC12622l) {
        byte[] bArr = new byte[38];
        interfaceC12622l.readFully(bArr, 0, 38);
        return new C12630t(bArr, 4);
    }

    /* renamed from: i */
    public static void m41589i(InterfaceC12622l interfaceC12622l) {
        C11146e0 c11146e0 = new C11146e0(4);
        interfaceC12622l.readFully(c11146e0.m34682e(), 0, 4);
        if (c11146e0.m34666J() != 1716281667) {
            throw C11005b3.m33715a("Failed to read FLAC stream marker.", null);
        }
    }

    /* renamed from: j */
    private static List<String> m41590j(InterfaceC12622l interfaceC12622l, int i10) {
        C11146e0 c11146e0 = new C11146e0(i10);
        interfaceC12622l.readFully(c11146e0.m34682e(), 0, i10);
        c11146e0.m34678V(4);
        return Arrays.asList(C12615e0.m41551j(c11146e0, false, false).f34266b);
    }
}
