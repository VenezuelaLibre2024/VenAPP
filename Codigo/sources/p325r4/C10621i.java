package p325r4;

import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;

/* renamed from: r4.i */
/* loaded from: classes.dex */
public final class C10621i {

    /* renamed from: a */
    public static final C10621i f26849a = new C10621i();

    private C10621i() {
    }

    /* renamed from: a */
    public static final void m32362a(C10613a x10, C10613a b10) {
        if (C0033a.m107d(C10621i.class)) {
            return;
        }
        try {
            C9322n.m27781e(x10, "x");
            C9322n.m27781e(b10, "b");
            int m32312b = x10.m32312b(0);
            int m32312b2 = x10.m32312b(1);
            int m32312b3 = x10.m32312b(2);
            float[] m32311a = x10.m32311a();
            float[] m32311a2 = b10.m32311a();
            if (m32312b <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (m32312b2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        if (m32312b3 > 0) {
                            int i14 = 0;
                            while (true) {
                                int i15 = i14 + 1;
                                int i16 = (i10 * m32312b2 * m32312b3) + (i12 * m32312b3) + i14;
                                m32311a[i16] = m32311a[i16] + m32311a2[i14];
                                if (i15 >= m32312b3) {
                                    break;
                                } else {
                                    i14 = i15;
                                }
                            }
                        }
                        if (i13 >= m32312b2) {
                            break;
                        } else {
                            i12 = i13;
                        }
                    }
                }
                if (i11 >= m32312b) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10621i.class);
        }
    }

    /* renamed from: b */
    public static final C10613a m32363b(C10613a[] tensors) {
        int i10;
        if (C0033a.m107d(C10621i.class)) {
            return null;
        }
        try {
            C9322n.m27781e(tensors, "tensors");
            int i11 = 0;
            int m32312b = tensors[0].m32312b(0);
            int length = tensors.length - 1;
            if (length >= 0) {
                int i12 = 0;
                i10 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    i10 += tensors[i12].m32312b(1);
                    if (i13 > length) {
                        break;
                    }
                    i12 = i13;
                }
            } else {
                i10 = 0;
            }
            C10613a c10613a = new C10613a(new int[]{m32312b, i10});
            float[] m32311a = c10613a.m32311a();
            if (m32312b > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    int i16 = i14 * i10;
                    int length2 = tensors.length - 1;
                    if (length2 >= 0) {
                        int i17 = i11;
                        while (true) {
                            int i18 = i17 + 1;
                            float[] m32311a2 = tensors[i17].m32311a();
                            int m32312b2 = tensors[i17].m32312b(1);
                            System.arraycopy(m32311a2, i14 * m32312b2, m32311a, i16, m32312b2);
                            i16 += m32312b2;
                            if (i18 > length2) {
                                break;
                            }
                            i17 = i18;
                        }
                    }
                    if (i15 >= m32312b) {
                        break;
                    }
                    i14 = i15;
                    i11 = 0;
                }
            }
            return c10613a;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10621i.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final C10613a m32364c(C10613a x10, C10613a w10) {
        Class<C10621i> cls;
        Class<C10621i> cls2;
        C10613a c10613a;
        Class<C10621i> cls3 = C10621i.class;
        if (C0033a.m107d(cls3)) {
            return null;
        }
        try {
            C9322n.m27781e(x10, "x");
            C9322n.m27781e(w10, "w");
            int i10 = 0;
            int m32312b = x10.m32312b(0);
            int m32312b2 = x10.m32312b(1);
            int m32312b3 = x10.m32312b(2);
            int m32312b4 = w10.m32312b(0);
            int i11 = (m32312b2 - m32312b4) + 1;
            int m32312b5 = w10.m32312b(2);
            C10613a c10613a2 = new C10613a(new int[]{m32312b, i11, m32312b5});
            float[] m32311a = x10.m32311a();
            float[] m32311a2 = c10613a2.m32311a();
            float[] m32311a3 = w10.m32311a();
            if (m32312b <= 0) {
                return c10613a2;
            }
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (m32312b5 > 0) {
                    int i14 = i10;
                    while (true) {
                        int i15 = i14 + 1;
                        if (i11 > 0) {
                            int i16 = 0;
                            while (true) {
                                int i17 = i16 + 1;
                                float f10 = 0.0f;
                                if (m32312b4 > 0) {
                                    int i18 = 0;
                                    while (true) {
                                        cls2 = cls3;
                                        int i19 = i18 + 1;
                                        if (m32312b3 > 0) {
                                            int i20 = 0;
                                            while (true) {
                                                c10613a = c10613a2;
                                                int i21 = i20 + 1;
                                                try {
                                                    f10 += m32311a[(m32312b2 * m32312b3 * i12) + ((i18 + i16) * m32312b3) + i20] * m32311a3[(((i18 * m32312b3) + i20) * m32312b5) + i14];
                                                    if (i21 >= m32312b3) {
                                                        break;
                                                    }
                                                    i20 = i21;
                                                    c10613a2 = c10613a;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    cls = cls2;
                                                    C0033a.m105b(th, cls);
                                                    return null;
                                                }
                                            }
                                        } else {
                                            c10613a = c10613a2;
                                        }
                                        if (i19 >= m32312b4) {
                                            break;
                                        }
                                        i18 = i19;
                                        cls3 = cls2;
                                        c10613a2 = c10613a;
                                    }
                                } else {
                                    cls2 = cls3;
                                    c10613a = c10613a2;
                                }
                                m32311a2[(i11 * m32312b5 * i12) + (i16 * m32312b5) + i14] = f10;
                                if (i17 >= i11) {
                                    break;
                                }
                                i16 = i17;
                                cls3 = cls2;
                                c10613a2 = c10613a;
                            }
                        } else {
                            cls2 = cls3;
                            c10613a = c10613a2;
                        }
                        if (i15 >= m32312b5) {
                            break;
                        }
                        i14 = i15;
                        cls3 = cls2;
                        c10613a2 = c10613a;
                    }
                } else {
                    cls2 = cls3;
                    c10613a = c10613a2;
                }
                if (i13 >= m32312b) {
                    return c10613a;
                }
                i12 = i13;
                cls3 = cls2;
                c10613a2 = c10613a;
                i10 = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            cls = cls3;
        }
    }

    /* renamed from: d */
    public static final C10613a m32365d(C10613a x10, C10613a w10, C10613a b10) {
        if (C0033a.m107d(C10621i.class)) {
            return null;
        }
        try {
            C9322n.m27781e(x10, "x");
            C9322n.m27781e(w10, "w");
            C9322n.m27781e(b10, "b");
            int m32312b = x10.m32312b(0);
            int m32312b2 = b10.m32312b(0);
            C10613a m32369h = m32369h(x10, w10);
            float[] m32311a = b10.m32311a();
            float[] m32311a2 = m32369h.m32311a();
            if (m32312b > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (m32312b2 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            int i14 = (i10 * m32312b2) + i12;
                            m32311a2[i14] = m32311a2[i14] + m32311a[i12];
                            if (i13 >= m32312b2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= m32312b) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return m32369h;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10621i.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final C10613a m32366e(String[] texts, int i10, C10613a w10) {
        if (C0033a.m107d(C10621i.class)) {
            return null;
        }
        try {
            C9322n.m27781e(texts, "texts");
            C9322n.m27781e(w10, "w");
            int length = texts.length;
            int m32312b = w10.m32312b(1);
            C10613a c10613a = new C10613a(new int[]{length, i10, m32312b});
            float[] m32311a = c10613a.m32311a();
            float[] m32311a2 = w10.m32311a();
            if (length > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    int[] m32377d = C10622j.f26850a.m32377d(texts[i11], i10);
                    if (i10 > 0) {
                        int i13 = 0;
                        while (true) {
                            int i14 = i13 + 1;
                            System.arraycopy(m32311a2, m32377d[i13] * m32312b, m32311a, (m32312b * i10 * i11) + (i13 * m32312b), m32312b);
                            if (i14 >= i10) {
                                break;
                            }
                            i13 = i14;
                        }
                    }
                    if (i12 >= length) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return c10613a;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10621i.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final void m32367f(C10613a x10, int i10) {
        if (C0033a.m107d(C10621i.class)) {
            return;
        }
        try {
            C9322n.m27781e(x10, "x");
            if (i10 >= x10.m32313c()) {
                return;
            }
            int m32313c = x10.m32313c();
            int i11 = 1;
            if (i10 < m32313c) {
                int i12 = i10;
                while (true) {
                    int i13 = i12 + 1;
                    i11 *= x10.m32312b(i12);
                    if (i13 >= m32313c) {
                        break;
                    } else {
                        i12 = i13;
                    }
                }
            }
            int[] iArr = new int[i10 + 1];
            if (i10 > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    iArr[i14] = x10.m32312b(i14);
                    if (i15 >= i10) {
                        break;
                    } else {
                        i14 = i15;
                    }
                }
            }
            iArr[i10] = i11;
            x10.m32314d(iArr);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10621i.class);
        }
    }

    /* renamed from: g */
    public static final C10613a m32368g(C10613a x10, int i10) {
        int i11;
        if (C0033a.m107d(C10621i.class)) {
            return null;
        }
        try {
            C9322n.m27781e(x10, "x");
            int i12 = 0;
            int m32312b = x10.m32312b(0);
            int m32312b2 = x10.m32312b(1);
            int m32312b3 = x10.m32312b(2);
            int i13 = (m32312b2 - i10) + 1;
            C10613a c10613a = new C10613a(new int[]{m32312b, i13, m32312b3});
            float[] m32311a = x10.m32311a();
            float[] m32311a2 = c10613a.m32311a();
            if (m32312b > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    if (m32312b3 > 0) {
                        int i16 = i12;
                        while (true) {
                            int i17 = i16 + 1;
                            if (i13 > 0) {
                                int i18 = i12;
                                while (true) {
                                    int i19 = i18 + 1;
                                    int i20 = i18 * m32312b3;
                                    int i21 = (i14 * i13 * m32312b3) + i20 + i16;
                                    int i22 = (i14 * m32312b2 * m32312b3) + i20 + i16;
                                    m32311a2[i21] = Float.MIN_VALUE;
                                    if (i10 > 0) {
                                        int i23 = 0;
                                        while (true) {
                                            int i24 = i23 + 1;
                                            i11 = m32312b2;
                                            m32311a2[i21] = Math.max(m32311a2[i21], m32311a[i22 + (i23 * m32312b3)]);
                                            if (i24 >= i10) {
                                                break;
                                            }
                                            i23 = i24;
                                            m32312b2 = i11;
                                        }
                                    } else {
                                        i11 = m32312b2;
                                    }
                                    if (i19 >= i13) {
                                        break;
                                    }
                                    i18 = i19;
                                    m32312b2 = i11;
                                }
                            } else {
                                i11 = m32312b2;
                            }
                            if (i17 >= m32312b3) {
                                break;
                            }
                            i16 = i17;
                            m32312b2 = i11;
                            i12 = 0;
                        }
                    } else {
                        i11 = m32312b2;
                    }
                    if (i15 >= m32312b) {
                        break;
                    }
                    i14 = i15;
                    m32312b2 = i11;
                    i12 = 0;
                }
            }
            return c10613a;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10621i.class);
            return null;
        }
    }

    /* renamed from: h */
    public static final C10613a m32369h(C10613a x10, C10613a w10) {
        if (C0033a.m107d(C10621i.class)) {
            return null;
        }
        try {
            C9322n.m27781e(x10, "x");
            C9322n.m27781e(w10, "w");
            int i10 = 0;
            int m32312b = x10.m32312b(0);
            int m32312b2 = w10.m32312b(0);
            int m32312b3 = w10.m32312b(1);
            C10613a c10613a = new C10613a(new int[]{m32312b, m32312b3});
            float[] m32311a = x10.m32311a();
            float[] m32311a2 = w10.m32311a();
            float[] m32311a3 = c10613a.m32311a();
            if (m32312b > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    if (m32312b3 > 0) {
                        int i13 = i10;
                        while (true) {
                            int i14 = i13 + 1;
                            int i15 = (i11 * m32312b3) + i13;
                            m32311a3[i15] = 0.0f;
                            if (m32312b2 > 0) {
                                int i16 = i10;
                                while (true) {
                                    int i17 = i16 + 1;
                                    m32311a3[i15] = m32311a3[i15] + (m32311a[(i11 * m32312b2) + i16] * m32311a2[(i16 * m32312b3) + i13]);
                                    if (i17 >= m32312b2) {
                                        break;
                                    }
                                    i16 = i17;
                                }
                            }
                            if (i14 >= m32312b3) {
                                break;
                            }
                            i13 = i14;
                            i10 = 0;
                        }
                    }
                    if (i12 >= m32312b) {
                        break;
                    }
                    i11 = i12;
                    i10 = 0;
                }
            }
            return c10613a;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10621i.class);
            return null;
        }
    }

    /* renamed from: i */
    public static final void m32370i(C10613a x10) {
        if (C0033a.m107d(C10621i.class)) {
            return;
        }
        try {
            C9322n.m27781e(x10, "x");
            float[] m32311a = x10.m32311a();
            int length = m32311a.length - 1;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (m32311a[i10] < 0.0f) {
                    m32311a[i10] = 0.0f;
                }
                if (i11 > length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10621i.class);
        }
    }

    /* renamed from: j */
    public static final void m32371j(C10613a x10) {
        if (C0033a.m107d(C10621i.class)) {
            return;
        }
        try {
            C9322n.m27781e(x10, "x");
            int i10 = 0;
            int m32312b = x10.m32312b(0);
            int m32312b2 = x10.m32312b(1);
            float[] m32311a = x10.m32311a();
            if (m32312b <= 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                int i12 = i10 * m32312b2;
                int i13 = i12 + m32312b2;
                float f10 = Float.MIN_VALUE;
                if (i12 < i13) {
                    int i14 = i12;
                    while (true) {
                        int i15 = i14 + 1;
                        float f11 = m32311a[i14];
                        if (f11 > f10) {
                            f10 = f11;
                        }
                        if (i15 >= i13) {
                            break;
                        } else {
                            i14 = i15;
                        }
                    }
                }
                float f12 = 0.0f;
                if (i12 < i13) {
                    int i16 = i12;
                    while (true) {
                        int i17 = i16 + 1;
                        float exp = (float) Math.exp(m32311a[i16] - f10);
                        m32311a[i16] = exp;
                        f12 += exp;
                        if (i17 >= i13) {
                            break;
                        } else {
                            i16 = i17;
                        }
                    }
                }
                if (i12 < i13) {
                    while (true) {
                        int i18 = i12 + 1;
                        m32311a[i12] = m32311a[i12] / f12;
                        if (i18 >= i13) {
                            break;
                        } else {
                            i12 = i18;
                        }
                    }
                }
                if (i11 >= m32312b) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10621i.class);
        }
    }

    /* renamed from: k */
    public static final C10613a m32372k(C10613a x10) {
        if (C0033a.m107d(C10621i.class)) {
            return null;
        }
        try {
            C9322n.m27781e(x10, "x");
            int m32312b = x10.m32312b(0);
            int m32312b2 = x10.m32312b(1);
            C10613a c10613a = new C10613a(new int[]{m32312b2, m32312b});
            float[] m32311a = x10.m32311a();
            float[] m32311a2 = c10613a.m32311a();
            if (m32312b > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (m32312b2 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            m32311a2[(i12 * m32312b) + i10] = m32311a[(i10 * m32312b2) + i12];
                            if (i13 >= m32312b2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= m32312b) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return c10613a;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10621i.class);
            return null;
        }
    }

    /* renamed from: l */
    public static final C10613a m32373l(C10613a x10) {
        if (C0033a.m107d(C10621i.class)) {
            return null;
        }
        try {
            C9322n.m27781e(x10, "x");
            int m32312b = x10.m32312b(0);
            int m32312b2 = x10.m32312b(1);
            int m32312b3 = x10.m32312b(2);
            C10613a c10613a = new C10613a(new int[]{m32312b3, m32312b2, m32312b});
            float[] m32311a = x10.m32311a();
            float[] m32311a2 = c10613a.m32311a();
            if (m32312b > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (m32312b2 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            if (m32312b3 > 0) {
                                int i14 = 0;
                                while (true) {
                                    int i15 = i14 + 1;
                                    m32311a2[(i14 * m32312b * m32312b2) + (i12 * m32312b) + i10] = m32311a[(i10 * m32312b2 * m32312b3) + (i12 * m32312b3) + i14];
                                    if (i15 >= m32312b3) {
                                        break;
                                    }
                                    i14 = i15;
                                }
                            }
                            if (i13 >= m32312b2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= m32312b) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return c10613a;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10621i.class);
            return null;
        }
    }
}
