package p468yg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import kg.C9264b;
import kg.C9267e;
import p066dg.C6943d;
import p066dg.C6947h;
import p066dg.C6952m;
import p066dg.C6958s;
import p222lg.C9506a;
import p446xg.C12483a;
import p490zg.C13025a;

/* renamed from: yg.j */
/* loaded from: classes2.dex */
public final class C12694j {

    /* renamed from: a */
    private static final C13025a f34409a = new C13025a();

    /* renamed from: a */
    private static C12687c m41812a(C12692h c12692h) {
        int[] m41805j;
        if (c12692h == null || (m41805j = c12692h.m41805j()) == null) {
            return null;
        }
        int m41827p = m41827p(m41805j);
        int i10 = 0;
        int i11 = 0;
        for (int i12 : m41805j) {
            i11 += m41827p - i12;
            if (i12 > 0) {
                break;
            }
        }
        C12688d[] m41797d = c12692h.m41797d();
        for (int i13 = 0; i11 > 0 && m41797d[i13] == null; i13++) {
            i11--;
        }
        for (int length = m41805j.length - 1; length >= 0; length--) {
            int i14 = m41805j[length];
            i10 += m41827p - i14;
            if (i14 > 0) {
                break;
            }
        }
        for (int length2 = m41797d.length - 1; i10 > 0 && m41797d[length2] == null; length2--) {
            i10--;
        }
        return c12692h.m41794a().m41751a(i11, i10, c12692h.m41806k());
    }

    /* renamed from: b */
    private static void m41813b(C12690f c12690f, C12686b[][] c12686bArr) {
        C12686b c12686b = c12686bArr[0][1];
        int[] m41748a = c12686b.m41748a();
        int m41786j = (c12690f.m41786j() * c12690f.m41788l()) - m41829r(c12690f.m41787k());
        if (m41748a.length == 0) {
            if (m41786j < 1 || m41786j > 928) {
                throw C6952m.m20106a();
            }
        } else if (m41748a[0] == m41786j || m41786j < 1 || m41786j > 928) {
            return;
        }
        c12686b.m41749b(m41786j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m41814c(kg.C9264b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.m27603g(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p468yg.C12694j.m41814c(kg.b, int, int, boolean, int, int):int");
    }

    /* renamed from: d */
    private static boolean m41815d(int i10, int i11, int i12) {
        return i11 + (-2) <= i10 && i10 <= i12 + 2;
    }

    /* renamed from: e */
    private static int m41816e(int[] iArr, int[] iArr2, int i10) {
        if ((iArr2 == null || iArr2.length <= (i10 / 2) + 3) && i10 >= 0 && i10 <= 512) {
            return f34409a.m42995a(iArr, i10, iArr2);
        }
        throw C6943d.m20090a();
    }

    /* renamed from: f */
    private static C12686b[][] m41817f(C12690f c12690f) {
        int m41762c;
        C12686b[][] c12686bArr = (C12686b[][]) Array.newInstance((Class<?>) C12686b.class, c12690f.m41788l(), c12690f.m41786j() + 2);
        for (C12686b[] c12686bArr2 : c12686bArr) {
            int i10 = 0;
            while (true) {
                if (i10 < c12686bArr2.length) {
                    c12686bArr2[i10] = new C12686b();
                    i10++;
                }
            }
        }
        int i11 = 0;
        for (C12691g c12691g : c12690f.m41791o()) {
            if (c12691g != null) {
                for (C12688d c12688d : c12691g.m41797d()) {
                    if (c12688d != null && (m41762c = c12688d.m41762c()) >= 0 && m41762c < c12686bArr.length) {
                        c12686bArr[m41762c][i11].m41749b(c12688d.m41764e());
                    }
                }
            }
            i11++;
        }
        return c12686bArr;
    }

    /* renamed from: g */
    private static C9267e m41818g(C12690f c12690f) {
        C12686b[][] m41817f = m41817f(c12690f);
        m41813b(c12690f, m41817f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[c12690f.m41788l() * c12690f.m41786j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < c12690f.m41788l(); i10++) {
            int i11 = 0;
            while (i11 < c12690f.m41786j()) {
                int i12 = i11 + 1;
                int[] m41748a = m41817f[i10][i12].m41748a();
                int m41786j = (c12690f.m41786j() * i10) + i11;
                if (m41748a.length == 0) {
                    arrayList.add(Integer.valueOf(m41786j));
                } else if (m41748a.length == 1) {
                    iArr[m41786j] = m41748a[0];
                } else {
                    arrayList3.add(Integer.valueOf(m41786j));
                    arrayList2.add(m41748a);
                }
                i11 = i12;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr2[i13] = (int[]) arrayList2.get(i13);
        }
        return m41819h(c12690f.m41787k(), iArr, C12483a.m40819b(arrayList), C12483a.m40819b(arrayList3), iArr2);
    }

    /* renamed from: h */
    private static C9267e m41819h(int i10, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i11 = 100;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                throw C6943d.m20090a();
            }
            for (int i13 = 0; i13 < length; i13++) {
                iArr[iArr3[i13]] = iArr4[i13][iArr5[i13]];
            }
            try {
                return m41821j(iArr, i10, iArr2);
            } catch (C6943d unused) {
                if (length == 0) {
                    throw C6943d.m20090a();
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        break;
                    }
                    int i15 = iArr5[i14];
                    if (i15 < iArr4[i14].length - 1) {
                        iArr5[i14] = i15 + 1;
                        break;
                    }
                    iArr5[i14] = 0;
                    if (i14 == length - 1) {
                        throw C6943d.m20090a();
                    }
                    i14++;
                }
                i11 = i12;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        r2 = r26;
        r6 = r27;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r7 > r5) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r0 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r3.m41790n(r8) == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (r8 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r8 != r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r10 = new p468yg.C12691g(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        r15 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        r3.m41793q(r8, r15);
        r14 = -1;
        r13 = r9.m41757g();
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r13 > r9.m41755e()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        r10 = m41831t(r3, r8, r13, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        if (r10 < 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (r10 <= r9.m41754d()) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        r19 = r12;
        r22 = r13;
        r20 = r14;
        r1 = r15;
        r10 = m41822k(r21, r9.m41756f(), r9.m41754d(), r0, r18, r22, r2, r6);
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
    
        if (r10 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e8, code lost:
    
        r1.m41799f(r11, r10);
        r2 = java.lang.Math.min(r2, r10.m41765f());
        r6 = java.lang.Math.max(r6, r10.m41765f());
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0100, code lost:
    
        r13 = r11 + 1;
        r15 = r1;
        r14 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fe, code lost:
    
        r12 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r12 != r14) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
    
        r19 = r12;
        r11 = r13;
        r20 = r14;
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        r18 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0107, code lost:
    
        r7 = r7 + 1;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0090, code lost:
    
        if (r8 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0092, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        r10 = new p468yg.C12692h(r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0078, code lost:
    
        r8 = r5 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
    
        return m41818g(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x006c, code lost:
    
        r0 = false;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kg.C9267e m41820i(kg.C9264b r21, p066dg.C6958s r22, p066dg.C6958s r23, p066dg.C6958s r24, p066dg.C6958s r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p468yg.C12694j.m41820i(kg.b, dg.s, dg.s, dg.s, dg.s, int, int):kg.e");
    }

    /* renamed from: j */
    private static C9267e m41821j(int[] iArr, int i10, int[] iArr2) {
        if (iArr.length == 0) {
            throw C6947h.m20094a();
        }
        int i11 = 1 << (i10 + 1);
        int m41816e = m41816e(iArr, iArr2, i11);
        m41834w(iArr, i11);
        C9267e m41771b = C12689e.m41771b(iArr, String.valueOf(i10));
        m41771b.m27636l(Integer.valueOf(m41816e));
        m41771b.m27635k(Integer.valueOf(iArr2.length));
        return m41771b;
    }

    /* renamed from: k */
    private static C12688d m41822k(C9264b c9264b, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        int i16;
        int m41810d;
        int m40818a;
        int m41814c = m41814c(c9264b, i10, i11, z10, i12, i13);
        int[] m41828q = m41828q(c9264b, i10, i11, z10, m41814c, i13);
        if (m41828q == null) {
            return null;
        }
        int m28274d = C9506a.m28274d(m41828q);
        if (z10) {
            i16 = m41814c + m28274d;
        } else {
            for (int i17 = 0; i17 < m41828q.length / 2; i17++) {
                int i18 = m41828q[i17];
                m41828q[i17] = m41828q[(m41828q.length - 1) - i17];
                m41828q[(m41828q.length - 1) - i17] = i18;
            }
            m41814c -= m28274d;
            i16 = m41814c;
        }
        if (m41815d(m28274d, i14, i15) && (m40818a = C12483a.m40818a((m41810d = C12693i.m41810d(m41828q)))) != -1) {
            return new C12688d(m41814c, i16, m41825n(m41810d), m40818a);
        }
        return null;
    }

    /* renamed from: l */
    private static C12685a m41823l(C12692h c12692h, C12692h c12692h2) {
        C12685a m41804i;
        C12685a m41804i2;
        if (c12692h == null || (m41804i = c12692h.m41804i()) == null) {
            if (c12692h2 == null) {
                return null;
            }
            return c12692h2.m41804i();
        }
        if (c12692h2 == null || (m41804i2 = c12692h2.m41804i()) == null || m41804i.m41743a() == m41804i2.m41743a() || m41804i.m41744b() == m41804i2.m41744b() || m41804i.m41745c() == m41804i2.m41745c()) {
            return m41804i;
        }
        return null;
    }

    /* renamed from: m */
    private static int[] m41824m(int i10) {
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i10 & 1;
            if (i13 != i11) {
                i12--;
                if (i12 < 0) {
                    return iArr;
                }
                i11 = i13;
            }
            iArr[i12] = iArr[i12] + 1;
            i10 >>= 1;
        }
    }

    /* renamed from: n */
    private static int m41825n(int i10) {
        return m41826o(m41824m(i10));
    }

    /* renamed from: o */
    private static int m41826o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    private static int m41827p(int[] iArr) {
        int i10 = -1;
        for (int i11 : iArr) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[EDGE_INSN: B:17:0x0027->B:18:0x0027 BREAK  A[LOOP:0: B:5:0x000c->B:13:0x000c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] m41828q(kg.C9264b r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = r2
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.m27603g(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p468yg.C12694j.m41828q(kg.b, int, int, boolean, int, int):int[]");
    }

    /* renamed from: r */
    private static int m41829r(int i10) {
        return 2 << i10;
    }

    /* renamed from: s */
    private static C12692h m41830s(C9264b c9264b, C12687c c12687c, C6958s c6958s, boolean z10, int i10, int i11) {
        C12692h c12692h = new C12692h(c12687c, z10);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 == 0 ? 1 : -1;
            int m20119c = (int) c6958s.m20119c();
            for (int m20120d = (int) c6958s.m20120d(); m20120d <= c12687c.m41755e() && m20120d >= c12687c.m41757g(); m20120d += i13) {
                C12688d m41822k = m41822k(c9264b, 0, c9264b.m27609m(), z10, m20119c, m20120d, i10, i11);
                if (m41822k != null) {
                    c12692h.m41799f(m20120d, m41822k);
                    m20119c = z10 ? m41822k.m41763d() : m41822k.m41761b();
                }
            }
            i12++;
        }
        return c12692h;
    }

    /* renamed from: t */
    private static int m41831t(C12690f c12690f, int i10, int i11, boolean z10) {
        int i12 = z10 ? 1 : -1;
        int i13 = i10 - i12;
        C12688d m41795b = m41832u(c12690f, i13) ? c12690f.m41790n(i13).m41795b(i11) : null;
        if (m41795b != null) {
            return z10 ? m41795b.m41761b() : m41795b.m41763d();
        }
        C12688d m41796c = c12690f.m41790n(i10).m41796c(i11);
        if (m41796c != null) {
            return z10 ? m41796c.m41763d() : m41796c.m41761b();
        }
        if (m41832u(c12690f, i13)) {
            m41796c = c12690f.m41790n(i13).m41796c(i11);
        }
        if (m41796c != null) {
            return z10 ? m41796c.m41761b() : m41796c.m41763d();
        }
        int i14 = 0;
        while (true) {
            i10 -= i12;
            if (!m41832u(c12690f, i10)) {
                C12687c m41789m = c12690f.m41789m();
                return z10 ? m41789m.m41756f() : m41789m.m41754d();
            }
            for (C12688d c12688d : c12690f.m41790n(i10).m41797d()) {
                if (c12688d != null) {
                    return (z10 ? c12688d.m41761b() : c12688d.m41763d()) + (i12 * i14 * (c12688d.m41761b() - c12688d.m41763d()));
                }
            }
            i14++;
        }
    }

    /* renamed from: u */
    private static boolean m41832u(C12690f c12690f, int i10) {
        return i10 >= 0 && i10 <= c12690f.m41786j() + 1;
    }

    /* renamed from: v */
    private static C12690f m41833v(C12692h c12692h, C12692h c12692h2) {
        C12685a m41823l;
        if ((c12692h == null && c12692h2 == null) || (m41823l = m41823l(c12692h, c12692h2)) == null) {
            return null;
        }
        return new C12690f(m41823l, C12687c.m41750j(m41812a(c12692h), m41812a(c12692h2)));
    }

    /* renamed from: w */
    private static void m41834w(int[] iArr, int i10) {
        if (iArr.length < 4) {
            throw C6947h.m20094a();
        }
        int i11 = iArr[0];
        if (i11 > iArr.length) {
            throw C6947h.m20094a();
        }
        if (i11 == 0) {
            if (i10 >= iArr.length) {
                throw C6947h.m20094a();
            }
            iArr[0] = iArr.length - i10;
        }
    }
}
