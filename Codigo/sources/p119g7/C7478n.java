package p119g7;

import p363t8.C11146e0;
import p459y6.InterfaceC12622l;

/* renamed from: g7.n */
/* loaded from: classes.dex */
final class C7478n {

    /* renamed from: a */
    private static final int[] f17592a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    private static boolean m22744a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f17592a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m22745b(InterfaceC12622l interfaceC12622l) {
        return m22746c(interfaceC12622l, true, false);
    }

    /* renamed from: c */
    private static boolean m22746c(InterfaceC12622l interfaceC12622l, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean z15;
        boolean z16;
        long length = interfaceC12622l.getLength();
        long j10 = -1;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = 4096;
        if (i11 != 0 && length <= 4096) {
            j11 = length;
        }
        int i12 = (int) j11;
        C11146e0 c11146e0 = new C11146e0(64);
        boolean z17 = false;
        int i13 = 0;
        boolean z18 = false;
        while (i13 < i12) {
            c11146e0.m34673Q(8);
            if (!interfaceC12622l.mo41533d(c11146e0.m34682e(), z17 ? 1 : 0, 8, true)) {
                break;
            }
            long m34666J = c11146e0.m34666J();
            int m34692q = c11146e0.m34692q();
            if (m34666J == 1) {
                interfaceC12622l.mo41540q(c11146e0.m34682e(), 8, 8);
                c11146e0.m34676T(16);
                i10 = 16;
                m34666J = c11146e0.m34657A();
            } else {
                if (m34666J == 0) {
                    long length2 = interfaceC12622l.getLength();
                    if (length2 != j10) {
                        m34666J = (length2 - interfaceC12622l.mo19807i()) + 8;
                    }
                }
                i10 = 8;
            }
            long j12 = i10;
            if (m34666J < j12) {
                return z17;
            }
            i13 += i10;
            if (m34692q == 1836019574) {
                i12 += (int) m34666J;
                if (i11 != 0 && i12 > length) {
                    i12 = (int) length;
                }
            } else {
                if (m34692q == 1836019558 || m34692q == 1836475768) {
                    z12 = z17 ? 1 : 0;
                    z13 = true;
                    z14 = true;
                    break;
                }
                int i14 = i11;
                if ((i13 + m34666J) - j12 >= i12) {
                    z12 = false;
                    z13 = true;
                    break;
                }
                int i15 = (int) (m34666J - j12);
                i13 += i15;
                if (m34692q != 1718909296) {
                    z15 = false;
                    z18 = z18;
                    if (i15 != 0) {
                        interfaceC12622l.mo41536k(i15);
                        z18 = z18;
                    }
                } else {
                    if (i15 < 8) {
                        return false;
                    }
                    c11146e0.m34673Q(i15);
                    interfaceC12622l.mo41540q(c11146e0.m34682e(), 0, i15);
                    int i16 = i15 / 4;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= i16) {
                            z16 = z18;
                            break;
                        }
                        if (i17 == 1) {
                            c11146e0.m34678V(4);
                        } else if (m22744a(c11146e0.m34692q(), z11)) {
                            z16 = true;
                            break;
                        }
                        i17++;
                    }
                    z15 = false;
                    z18 = z16;
                    if (!z16) {
                        return false;
                    }
                }
                z17 = z15;
                i11 = i14;
            }
            j10 = -1;
            z18 = z18;
        }
        z12 = z17 ? 1 : 0;
        z13 = true;
        z14 = z12;
        return (z18 && z10 == z14) ? z13 : z12;
    }

    /* renamed from: d */
    public static boolean m22747d(InterfaceC12622l interfaceC12622l, boolean z10) {
        return m22746c(interfaceC12622l, false, z10);
    }
}
