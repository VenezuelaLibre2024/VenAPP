package p398v8;

import java.util.ArrayList;
import java.util.zip.Inflater;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p398v8.C11747e;

/* renamed from: v8.f */
/* loaded from: classes.dex */
final class C11748f {
    /* renamed from: a */
    public static C11747e m37134a(byte[] bArr, int i10) {
        ArrayList<C11747e.a> arrayList;
        C11146e0 c11146e0 = new C11146e0(bArr);
        try {
            arrayList = m37136c(c11146e0) ? m37139f(c11146e0) : m37138e(c11146e0);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new C11747e(arrayList.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new C11747e(arrayList.get(0), arrayList.get(1), i10);
    }

    /* renamed from: b */
    private static int m37135b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    /* renamed from: c */
    private static boolean m37136c(C11146e0 c11146e0) {
        c11146e0.m34678V(4);
        int m34692q = c11146e0.m34692q();
        c11146e0.m34677U(0);
        return m34692q == 1886547818;
    }

    /* renamed from: d */
    private static C11747e.a m37137d(C11146e0 c11146e0) {
        int m34692q = c11146e0.m34692q();
        if (m34692q > 10000) {
            return null;
        }
        float[] fArr = new float[m34692q];
        for (int i10 = 0; i10 < m34692q; i10++) {
            fArr[i10] = c11146e0.m34691p();
        }
        int m34692q2 = c11146e0.m34692q();
        if (m34692q2 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(m34692q * 2.0d) / log);
        C11144d0 c11144d0 = new C11144d0(c11146e0.m34682e());
        int i11 = 8;
        c11144d0.m34640p(c11146e0.m34683f() * 8);
        float[] fArr2 = new float[m34692q2 * 5];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < m34692q2) {
            int i15 = 0;
            while (i15 < i12) {
                int m37135b = iArr[i15] + m37135b(c11144d0.m34632h(ceil));
                if (m37135b >= m34692q || m37135b < 0) {
                    return null;
                }
                fArr2[i14] = fArr[m37135b];
                iArr[i15] = m37135b;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        c11144d0.m34640p((c11144d0.m34629e() + 7) & (-8));
        int i16 = 32;
        int m34632h = c11144d0.m34632h(32);
        C11747e.b[] bVarArr = new C11747e.b[m34632h];
        int i17 = 0;
        while (i17 < m34632h) {
            int m34632h2 = c11144d0.m34632h(i11);
            int m34632h3 = c11144d0.m34632h(i11);
            int m34632h4 = c11144d0.m34632h(i16);
            if (m34632h4 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(m34692q2 * d10) / log);
            float[] fArr3 = new float[m34632h4 * 3];
            float[] fArr4 = new float[m34632h4 * 2];
            int i18 = 0;
            for (int i19 = 0; i19 < m34632h4; i19++) {
                i18 += m37135b(c11144d0.m34632h(ceil2));
                if (i18 < 0 || i18 >= m34692q2) {
                    return null;
                }
                int i20 = i19 * 3;
                int i21 = i18 * 5;
                fArr3[i20] = fArr2[i21];
                fArr3[i20 + 1] = fArr2[i21 + 1];
                fArr3[i20 + 2] = fArr2[i21 + 2];
                int i22 = i19 * 2;
                fArr4[i22] = fArr2[i21 + 3];
                fArr4[i22 + 1] = fArr2[i21 + 4];
            }
            bVarArr[i17] = new C11747e.b(m34632h2, fArr3, fArr4, m34632h3);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new C11747e.a(bVarArr);
    }

    /* renamed from: e */
    private static ArrayList<C11747e.a> m37138e(C11146e0 c11146e0) {
        if (c11146e0.m34664H() != 0) {
            return null;
        }
        c11146e0.m34678V(7);
        int m34692q = c11146e0.m34692q();
        if (m34692q == 1684433976) {
            C11146e0 c11146e02 = new C11146e0();
            Inflater inflater = new Inflater(true);
            try {
                if (!C11172r0.m34943q0(c11146e0, c11146e02, inflater)) {
                    return null;
                }
                c11146e0 = c11146e02;
            } finally {
                inflater.end();
            }
        } else if (m34692q != 1918990112) {
            return null;
        }
        return m37140g(c11146e0);
    }

    /* renamed from: f */
    private static ArrayList<C11747e.a> m37139f(C11146e0 c11146e0) {
        int m34692q;
        c11146e0.m34678V(8);
        int m34683f = c11146e0.m34683f();
        int m34684g = c11146e0.m34684g();
        while (m34683f < m34684g && (m34692q = c11146e0.m34692q() + m34683f) > m34683f && m34692q <= m34684g) {
            int m34692q2 = c11146e0.m34692q();
            if (m34692q2 == 2037673328 || m34692q2 == 1836279920) {
                c11146e0.m34676T(m34692q);
                return m37138e(c11146e0);
            }
            c11146e0.m34677U(m34692q);
            m34683f = m34692q;
        }
        return null;
    }

    /* renamed from: g */
    private static ArrayList<C11747e.a> m37140g(C11146e0 c11146e0) {
        ArrayList<C11747e.a> arrayList = new ArrayList<>();
        int m34683f = c11146e0.m34683f();
        int m34684g = c11146e0.m34684g();
        while (m34683f < m34684g) {
            int m34692q = c11146e0.m34692q() + m34683f;
            if (m34692q <= m34683f || m34692q > m34684g) {
                return null;
            }
            if (c11146e0.m34692q() == 1835365224) {
                C11747e.a m37137d = m37137d(c11146e0);
                if (m37137d == null) {
                    return null;
                }
                arrayList.add(m37137d);
            }
            c11146e0.m34677U(m34692q);
            m34683f = m34692q;
        }
        return arrayList;
    }
}
