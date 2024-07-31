package g7;

import t8.e0;

/* loaded from: classes.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f15999a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f15999a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(y6.l lVar) {
        return c(lVar, true, false);
    }

    private static boolean c(y6.l lVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean z15;
        boolean z16;
        long length = lVar.getLength();
        long j10 = -1;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = 4096;
        if (i11 != 0 && length <= 4096) {
            j11 = length;
        }
        int i12 = (int) j11;
        e0 e0Var = new e0(64);
        boolean z17 = false;
        int i13 = 0;
        boolean z18 = false;
        while (i13 < i12) {
            e0Var.Q(8);
            if (!lVar.d(e0Var.e(), z17 ? 1 : 0, 8, true)) {
                break;
            }
            long J = e0Var.J();
            int q10 = e0Var.q();
            if (J == 1) {
                lVar.q(e0Var.e(), 8, 8);
                e0Var.T(16);
                i10 = 16;
                J = e0Var.A();
            } else {
                if (J == 0) {
                    long length2 = lVar.getLength();
                    if (length2 != j10) {
                        J = (length2 - lVar.i()) + 8;
                    }
                }
                i10 = 8;
            }
            long j12 = i10;
            if (J < j12) {
                return z17;
            }
            i13 += i10;
            if (q10 == 1836019574) {
                i12 += (int) J;
                if (i11 != 0 && i12 > length) {
                    i12 = (int) length;
                }
            } else {
                if (q10 == 1836019558 || q10 == 1836475768) {
                    z12 = z17 ? 1 : 0;
                    z13 = true;
                    z14 = true;
                    break;
                }
                int i14 = i11;
                if ((i13 + J) - j12 >= i12) {
                    z12 = false;
                    z13 = true;
                    break;
                }
                int i15 = (int) (J - j12);
                i13 += i15;
                if (q10 != 1718909296) {
                    z15 = false;
                    z18 = z18;
                    if (i15 != 0) {
                        lVar.k(i15);
                        z18 = z18;
                    }
                } else {
                    if (i15 < 8) {
                        return false;
                    }
                    e0Var.Q(i15);
                    lVar.q(e0Var.e(), 0, i15);
                    int i16 = i15 / 4;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= i16) {
                            z16 = z18;
                            break;
                        }
                        if (i17 == 1) {
                            e0Var.V(4);
                        } else if (a(e0Var.q(), z11)) {
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

    public static boolean d(y6.l lVar, boolean z10) {
        return c(lVar, false, z10);
    }
}
