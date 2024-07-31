package p459y6;

import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import p361t6.C11005b3;
import p363t8.C11146e0;
import p363t8.C11172r0;

/* renamed from: y6.q */
/* loaded from: classes.dex */
public final class C12627q {

    /* renamed from: y6.q$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public long f34304a;
    }

    /* renamed from: a */
    private static boolean m41571a(C11146e0 c11146e0, C12630t c12630t, int i10) {
        int m41580j = m41580j(c11146e0, i10);
        return m41580j != -1 && m41580j <= c12630t.f34309b;
    }

    /* renamed from: b */
    private static boolean m41572b(C11146e0 c11146e0, int i10) {
        return c11146e0.m34664H() == C11172r0.m34950u(c11146e0.m34682e(), i10, c11146e0.m34683f() - 1, 0);
    }

    /* renamed from: c */
    private static boolean m41573c(C11146e0 c11146e0, C12630t c12630t, boolean z10, a aVar) {
        try {
            long m34671O = c11146e0.m34671O();
            if (!z10) {
                m34671O *= c12630t.f34309b;
            }
            aVar.f34304a = m34671O;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m41574d(C11146e0 c11146e0, C12630t c12630t, int i10, a aVar) {
        int m34683f = c11146e0.m34683f();
        long m34666J = c11146e0.m34666J();
        long j10 = m34666J >>> 16;
        if (j10 != i10) {
            return false;
        }
        return m41577g((int) ((m34666J >> 4) & 15), c12630t) && m41576f((int) ((m34666J >> 1) & 7), c12630t) && !(((m34666J & 1) > 1L ? 1 : ((m34666J & 1) == 1L ? 0 : -1)) == 0) && m41573c(c11146e0, c12630t, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && m41571a(c11146e0, c12630t, (int) ((m34666J >> 12) & 15)) && m41575e(c11146e0, c12630t, (int) ((m34666J >> 8) & 15)) && m41572b(c11146e0, m34683f);
    }

    /* renamed from: e */
    private static boolean m41575e(C11146e0 c11146e0, C12630t c12630t, int i10) {
        int i11 = c12630t.f34312e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == c12630t.f34313f;
        }
        if (i10 == 12) {
            return c11146e0.m34664H() * AdError.NETWORK_ERROR_CODE == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int m34670N = c11146e0.m34670N();
        if (i10 == 14) {
            m34670N *= 10;
        }
        return m34670N == i11;
    }

    /* renamed from: f */
    private static boolean m41576f(int i10, C12630t c12630t) {
        return i10 == 0 || i10 == c12630t.f34316i;
    }

    /* renamed from: g */
    private static boolean m41577g(int i10, C12630t c12630t) {
        return i10 <= 7 ? i10 == c12630t.f34314g - 1 : i10 <= 10 && c12630t.f34314g == 2;
    }

    /* renamed from: h */
    public static boolean m41578h(InterfaceC12622l interfaceC12622l, C12630t c12630t, int i10, a aVar) {
        long mo19807i = interfaceC12622l.mo19807i();
        byte[] bArr = new byte[2];
        interfaceC12622l.mo41540q(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            interfaceC12622l.mo41534f();
            interfaceC12622l.mo41536k((int) (mo19807i - interfaceC12622l.getPosition()));
            return false;
        }
        C11146e0 c11146e0 = new C11146e0(16);
        System.arraycopy(bArr, 0, c11146e0.m34682e(), 0, 2);
        c11146e0.m34676T(C12624n.m41566c(interfaceC12622l, c11146e0.m34682e(), 2, 14));
        interfaceC12622l.mo41534f();
        interfaceC12622l.mo41536k((int) (mo19807i - interfaceC12622l.getPosition()));
        return m41574d(c11146e0, c12630t, i10, aVar);
    }

    /* renamed from: i */
    public static long m41579i(InterfaceC12622l interfaceC12622l, C12630t c12630t) {
        interfaceC12622l.mo41534f();
        interfaceC12622l.mo41536k(1);
        byte[] bArr = new byte[1];
        interfaceC12622l.mo41540q(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        interfaceC12622l.mo41536k(2);
        int i10 = z10 ? 7 : 6;
        C11146e0 c11146e0 = new C11146e0(i10);
        c11146e0.m34676T(C12624n.m41566c(interfaceC12622l, c11146e0.m34682e(), 0, i10));
        interfaceC12622l.mo41534f();
        a aVar = new a();
        if (m41573c(c11146e0, c12630t, z10, aVar)) {
            return aVar.f34304a;
        }
        throw C11005b3.m33715a(null, null);
    }

    /* renamed from: j */
    public static int m41580j(C11146e0 c11146e0, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return c11146e0.m34664H() + 1;
            case 7:
                return c11146e0.m34670N() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return RecognitionOptions.QR_CODE << (i10 - 8);
            default:
                return -1;
        }
    }
}
