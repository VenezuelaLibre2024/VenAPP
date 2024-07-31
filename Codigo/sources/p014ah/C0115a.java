package p014ah;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kg.C9264b;
import p066dg.C6942c;
import p066dg.C6958s;
import p066dg.EnumC6944e;

/* renamed from: ah.a */
/* loaded from: classes2.dex */
public final class C0115a {

    /* renamed from: a */
    private static final int[] f500a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f501b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f502c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f503d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    private static void m546a(C6958s[] c6958sArr, C6958s[] c6958sArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            c6958sArr[iArr[i10]] = c6958sArr2[i10];
        }
    }

    /* renamed from: b */
    public static C0116b m547b(C6942c c6942c, Map<EnumC6944e, ?> map, boolean z10) {
        C9264b m20084a = c6942c.m20084a();
        List<C6958s[]> m548c = m548c(z10, m20084a);
        for (int i10 = 0; m548c.isEmpty() && i10 < 3; i10++) {
            m20084a = m20084a.clone();
            if (i10 != 1) {
                m20084a.m27610p();
            } else {
                m20084a.m27611q();
            }
            m548c = m548c(z10, m20084a);
        }
        return new C0116b(m20084a, m548c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r3.hasNext() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r4 = (p066dg.C6958s[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r7 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r2 = (int) java.lang.Math.max(r2, r7.m20120d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r2 = java.lang.Math.max(r2, (int) r4.m20120d());
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<p066dg.C6958s[]> m548c(boolean r8, kg.C9264b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            r4 = r3
        L9:
            int r5 = r9.m27606j()
            if (r2 >= r5) goto L75
            dg.s[] r3 = m551f(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L50
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L50
            if (r4 != 0) goto L20
            goto L75
        L20:
            java.util.Iterator r3 = r0.iterator()
        L24:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            dg.s[] r4 = (p066dg.C6958s[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L3e
            float r2 = (float) r2
            float r7 = r7.m20120d()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L3e:
            r4 = r4[r5]
            if (r4 == 0) goto L24
            float r4 = r4.m20120d()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L24
        L4c:
            int r2 = r2 + 5
            r3 = r1
            goto L8
        L50:
            r0.add(r3)
            if (r8 != 0) goto L56
            goto L75
        L56:
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L63
            float r4 = r4.m20119c()
            int r4 = (int) r4
            r2 = r3[r2]
            goto L6d
        L63:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.m20119c()
            int r4 = (int) r4
            r2 = r3[r2]
        L6d:
            float r2 = r2.m20120d()
            int r2 = (int) r2
            r3 = r4
            r4 = r6
            goto L9
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p014ah.C0115a.m548c(boolean, kg.b):java.util.List");
    }

    /* renamed from: d */
    private static int[] m549d(C9264b c9264b, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (c9264b.m27603g(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        int i15 = i10;
        int i16 = 0;
        boolean z10 = false;
        while (i10 < i12) {
            if (c9264b.m27603g(i10, i11) != z10) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else {
                    if (m552g(iArr2, iArr) < 0.42f) {
                        return new int[]{i15, i10};
                    }
                    i15 += iArr2[0] + iArr2[1];
                    int i17 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i16 != length - 1 || m552g(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i15, i10 - 1};
    }

    /* renamed from: e */
    private static C6958s[] m550e(C9264b c9264b, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z10;
        int i14;
        int i15;
        C6958s[] c6958sArr = new C6958s[4];
        int[] iArr2 = new int[iArr.length];
        int i16 = i12;
        while (true) {
            if (i16 >= i10) {
                z10 = false;
                break;
            }
            int[] m549d = m549d(c9264b, i13, i16, i11, iArr, iArr2);
            if (m549d != null) {
                int i17 = i16;
                int[] iArr3 = m549d;
                int i18 = i17;
                while (true) {
                    if (i18 <= 0) {
                        i15 = i18;
                        break;
                    }
                    int i19 = i18 - 1;
                    int[] m549d2 = m549d(c9264b, i13, i19, i11, iArr, iArr2);
                    if (m549d2 == null) {
                        i15 = i19 + 1;
                        break;
                    }
                    iArr3 = m549d2;
                    i18 = i19;
                }
                float f10 = i15;
                c6958sArr[0] = new C6958s(iArr3[0], f10);
                c6958sArr[1] = new C6958s(iArr3[1], f10);
                z10 = true;
                i16 = i15;
            } else {
                i16 += 5;
            }
        }
        int i20 = i16 + 1;
        if (z10) {
            int[] iArr4 = {(int) c6958sArr[0].m20119c(), (int) c6958sArr[1].m20119c()};
            int i21 = i20;
            int i22 = 0;
            while (true) {
                if (i21 >= i10) {
                    i14 = i22;
                    break;
                }
                i14 = i22;
                int[] m549d3 = m549d(c9264b, iArr4[0], i21, i11, iArr, iArr2);
                if (m549d3 != null && Math.abs(iArr4[0] - m549d3[0]) < 5 && Math.abs(iArr4[1] - m549d3[1]) < 5) {
                    iArr4 = m549d3;
                    i22 = 0;
                } else {
                    if (i14 > 25) {
                        break;
                    }
                    i22 = i14 + 1;
                }
                i21++;
            }
            i20 = i21 - (i14 + 1);
            float f11 = i20;
            c6958sArr[2] = new C6958s(iArr4[0], f11);
            c6958sArr[3] = new C6958s(iArr4[1], f11);
        }
        if (i20 - i16 < 10) {
            Arrays.fill(c6958sArr, (Object) null);
        }
        return c6958sArr;
    }

    /* renamed from: f */
    private static C6958s[] m551f(C9264b c9264b, int i10, int i11) {
        int m27606j = c9264b.m27606j();
        int m27609m = c9264b.m27609m();
        C6958s[] c6958sArr = new C6958s[8];
        m546a(c6958sArr, m550e(c9264b, m27606j, m27609m, i10, i11, f502c), f500a);
        C6958s c6958s = c6958sArr[4];
        if (c6958s != null) {
            i11 = (int) c6958s.m20119c();
            i10 = (int) c6958sArr[4].m20120d();
        }
        m546a(c6958sArr, m550e(c9264b, m27606j, m27609m, i10, i11, f503d), f501b);
        return c6958sArr;
    }

    /* renamed from: g */
    private static float m552g(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i10;
        float f11 = f10 / i11;
        float f12 = 0.8f * f11;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f14 = iArr2[i13] * f11;
            float f15 = iArr[i13];
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }
}
