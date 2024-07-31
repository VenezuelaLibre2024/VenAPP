package p459y6;

import p363t8.C11146e0;
import p363t8.C11173s;

/* renamed from: y6.b */
/* loaded from: classes.dex */
public final class C12608b {
    /* renamed from: a */
    public static void m41508a(long j10, C11146e0 c11146e0, InterfaceC12609b0[] interfaceC12609b0Arr) {
        while (true) {
            if (c11146e0.m34679a() <= 1) {
                return;
            }
            int m41510c = m41510c(c11146e0);
            int m41510c2 = m41510c(c11146e0);
            int m34683f = c11146e0.m34683f() + m41510c2;
            if (m41510c2 == -1 || m41510c2 > c11146e0.m34679a()) {
                C11173s.m34970i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                m34683f = c11146e0.m34684g();
            } else if (m41510c == 4 && m41510c2 >= 8) {
                int m34664H = c11146e0.m34664H();
                int m34670N = c11146e0.m34670N();
                int m34692q = m34670N == 49 ? c11146e0.m34692q() : 0;
                int m34664H2 = c11146e0.m34664H();
                if (m34670N == 47) {
                    c11146e0.m34678V(1);
                }
                boolean z10 = m34664H == 181 && (m34670N == 49 || m34670N == 47) && m34664H2 == 3;
                if (m34670N == 49) {
                    z10 &= m34692q == 1195456820;
                }
                if (z10) {
                    m41509b(j10, c11146e0, interfaceC12609b0Arr);
                }
            }
            c11146e0.m34677U(m34683f);
        }
    }

    /* renamed from: b */
    public static void m41509b(long j10, C11146e0 c11146e0, InterfaceC12609b0[] interfaceC12609b0Arr) {
        int m34664H = c11146e0.m34664H();
        if ((m34664H & 64) != 0) {
            c11146e0.m34678V(1);
            int i10 = (m34664H & 31) * 3;
            int m34683f = c11146e0.m34683f();
            for (InterfaceC12609b0 interfaceC12609b0 : interfaceC12609b0Arr) {
                c11146e0.m34677U(m34683f);
                interfaceC12609b0.m41511a(c11146e0, i10);
                if (j10 != -9223372036854775807L) {
                    interfaceC12609b0.mo331b(j10, 1, i10, 0, null);
                }
            }
        }
    }

    /* renamed from: c */
    private static int m41510c(C11146e0 c11146e0) {
        int i10 = 0;
        while (c11146e0.m34679a() != 0) {
            int m34664H = c11146e0.m34664H();
            i10 += m34664H;
            if (m34664H != 255) {
                return i10;
            }
        }
        return -1;
    }
}
