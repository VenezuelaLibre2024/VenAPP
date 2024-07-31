package ug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kg.C9263a;
import p066dg.C6952m;
import p066dg.C6956q;
import p066dg.C6958s;
import p066dg.EnumC6940a;
import p066dg.EnumC6944e;
import p066dg.EnumC6957r;
import p066dg.InterfaceC6959t;
import p222lg.C9506a;
import tg.AbstractC11274r;

/* renamed from: ug.e */
/* loaded from: classes2.dex */
public final class C11558e extends AbstractC11554a {

    /* renamed from: i */
    private static final int[] f30009i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    private static final int[] f30010j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f30011k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f30012l = {0, 336, 1036, 1516};

    /* renamed from: m */
    private static final int[] f30013m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f30014n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f30015o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List<C11557d> f30016g = new ArrayList();

    /* renamed from: h */
    private final List<C11557d> f30017h = new ArrayList();

    /* renamed from: r */
    private static void m36225r(Collection<C11557d> collection, C11557d c11557d) {
        boolean z10;
        if (c11557d == null) {
            return;
        }
        Iterator<C11557d> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            C11557d next = it.next();
            if (next.m36218b() == c11557d.m36218b()) {
                next.m36224e();
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        collection.add(c11557d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0041, code lost:
    
        r2 = true;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x003f, code lost:
    
        if (r1 < 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 < 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m36226s(boolean r10, int r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C11558e.m36226s(boolean, int):void");
    }

    /* renamed from: t */
    private static boolean m36227t(C11557d c11557d, C11557d c11557d2) {
        int m36217a = (c11557d.m36217a() + (c11557d2.m36217a() * 16)) % 79;
        int m36221c = (c11557d.m36223d().m36221c() * 9) + c11557d2.m36223d().m36221c();
        if (m36221c > 72) {
            m36221c--;
        }
        if (m36221c > 8) {
            m36221c--;
        }
        return m36217a == m36221c;
    }

    /* renamed from: u */
    private static C6956q m36228u(C11557d c11557d, C11557d c11557d2) {
        String valueOf = String.valueOf((c11557d.m36218b() * 4537077) + c11557d2.m36218b());
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int charAt = sb2.charAt(i11) - '0';
            if ((i11 & 1) == 0) {
                charAt *= 3;
            }
            i10 += charAt;
        }
        int i12 = 10 - (i10 % 10);
        if (i12 == 10) {
            i12 = 0;
        }
        sb2.append(i12);
        C6958s[] m36219a = c11557d.m36223d().m36219a();
        C6958s[] m36219a2 = c11557d2.m36223d().m36219a();
        C6956q c6956q = new C6956q(sb2.toString(), null, new C6958s[]{m36219a[0], m36219a[1], m36219a2[0], m36219a2[1]}, EnumC6940a.RSS_14);
        c6956q.m20115h(EnumC6957r.SYMBOLOGY_IDENTIFIER, "]e0");
        return c6956q;
    }

    /* renamed from: v */
    private C11555b m36229v(C9263a c9263a, C11556c c11556c, boolean z10) {
        int[] m36211i = m36211i();
        Arrays.fill(m36211i, 0);
        int[] m36220b = c11556c.m36220b();
        if (z10) {
            AbstractC11274r.m35227g(c9263a, m36220b[0], m36211i);
        } else {
            AbstractC11274r.m35226f(c9263a, m36220b[1], m36211i);
            int i10 = 0;
            for (int length = m36211i.length - 1; i10 < length; length--) {
                int i11 = m36211i[i10];
                m36211i[i10] = m36211i[length];
                m36211i[length] = i11;
                i10++;
            }
        }
        int i12 = z10 ? 16 : 15;
        float m28274d = C9506a.m28274d(m36211i) / i12;
        int[] m36215m = m36215m();
        int[] m36213k = m36213k();
        float[] m36216n = m36216n();
        float[] m36214l = m36214l();
        for (int i13 = 0; i13 < m36211i.length; i13++) {
            float f10 = m36211i[i13] / m28274d;
            int i14 = (int) (0.5f + f10);
            if (i14 < 1) {
                i14 = 1;
            } else if (i14 > 8) {
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                m36215m[i15] = i14;
                m36216n[i15] = f10 - i14;
            } else {
                m36213k[i15] = i14;
                m36214l[i15] = f10 - i14;
            }
        }
        m36226s(z10, i12);
        int i16 = 0;
        int i17 = 0;
        for (int length2 = m36215m.length - 1; length2 >= 0; length2--) {
            int i18 = m36215m[length2];
            i16 = (i16 * 9) + i18;
            i17 += i18;
        }
        int i19 = 0;
        int i20 = 0;
        for (int length3 = m36213k.length - 1; length3 >= 0; length3--) {
            int i21 = m36213k[length3];
            i19 = (i19 * 9) + i21;
            i20 += i21;
        }
        int i22 = i16 + (i19 * 3);
        if (!z10) {
            if ((i20 & 1) != 0 || i20 > 10 || i20 < 4) {
                throw C6952m.m20106a();
            }
            int i23 = (10 - i20) / 2;
            int i24 = f30014n[i23];
            return new C11555b((C11559f.m36234b(m36213k, 9 - i24, false) * f30010j[i23]) + C11559f.m36234b(m36215m, i24, true) + f30012l[i23], i22);
        }
        if ((i17 & 1) != 0 || i17 > 12 || i17 < 4) {
            throw C6952m.m20106a();
        }
        int i25 = (12 - i17) / 2;
        int i26 = f30013m[i25];
        return new C11555b((C11559f.m36234b(m36215m, i26, false) * f30009i[i25]) + C11559f.m36234b(m36213k, 9 - i26, true) + f30011k[i25], i22);
    }

    /* renamed from: w */
    private C11557d m36230w(C9263a c9263a, boolean z10, int i10, Map<EnumC6944e, ?> map) {
        try {
            C11556c m36232y = m36232y(c9263a, i10, z10, m36231x(c9263a, z10));
            InterfaceC6959t interfaceC6959t = map == null ? null : (InterfaceC6959t) map.get(EnumC6944e.NEED_RESULT_POINT_CALLBACK);
            if (interfaceC6959t != null) {
                int[] m36220b = m36232y.m36220b();
                float f10 = ((m36220b[0] + m36220b[1]) - 1) / 2.0f;
                if (z10) {
                    f10 = (c9263a.m27590l() - 1) - f10;
                }
                interfaceC6959t.mo20121a(new C6958s(f10, i10));
            }
            C11555b m36229v = m36229v(c9263a, m36232y, true);
            C11555b m36229v2 = m36229v(c9263a, m36232y, false);
            return new C11557d((m36229v.m36218b() * 1597) + m36229v2.m36218b(), m36229v.m36217a() + (m36229v2.m36217a() * 4), m36232y);
        } catch (C6952m unused) {
            return null;
        }
    }

    /* renamed from: x */
    private int[] m36231x(C9263a c9263a, boolean z10) {
        int[] m36212j = m36212j();
        m36212j[0] = 0;
        m36212j[1] = 0;
        m36212j[2] = 0;
        m36212j[3] = 0;
        int m27590l = c9263a.m27590l();
        int i10 = 0;
        boolean z11 = false;
        while (i10 < m27590l) {
            z11 = !c9263a.m27586h(i10);
            if (z10 == z11) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        int i12 = i10;
        while (i10 < m27590l) {
            if (c9263a.m27586h(i10) != z11) {
                m36212j[i11] = m36212j[i11] + 1;
            } else {
                if (i11 != 3) {
                    i11++;
                } else {
                    if (AbstractC11554a.m36209p(m36212j)) {
                        return new int[]{i12, i10};
                    }
                    i12 += m36212j[0] + m36212j[1];
                    m36212j[0] = m36212j[2];
                    m36212j[1] = m36212j[3];
                    m36212j[2] = 0;
                    m36212j[3] = 0;
                    i11--;
                }
                m36212j[i11] = 1;
                z11 = !z11;
            }
            i10++;
        }
        throw C6952m.m20106a();
    }

    /* renamed from: y */
    private C11556c m36232y(C9263a c9263a, int i10, boolean z10, int[] iArr) {
        int i11;
        int i12;
        boolean m27586h = c9263a.m27586h(iArr[0]);
        int i13 = iArr[0] - 1;
        while (i13 >= 0 && m27586h != c9263a.m27586h(i13)) {
            i13--;
        }
        int i14 = i13 + 1;
        int i15 = iArr[0] - i14;
        int[] m36212j = m36212j();
        System.arraycopy(m36212j, 0, m36212j, 1, m36212j.length - 1);
        m36212j[0] = i15;
        int m36210q = AbstractC11554a.m36210q(m36212j, f30015o);
        int i16 = iArr[1];
        if (z10) {
            int m27590l = (c9263a.m27590l() - 1) - i14;
            i11 = (c9263a.m27590l() - 1) - i16;
            i12 = m27590l;
        } else {
            i11 = i16;
            i12 = i14;
        }
        return new C11556c(m36210q, new int[]{i14, iArr[1]}, i12, i11, i10);
    }

    @Override // tg.AbstractC11274r
    /* renamed from: c */
    public C6956q mo35175c(int i10, C9263a c9263a, Map<EnumC6944e, ?> map) {
        m36225r(this.f30016g, m36230w(c9263a, false, i10, map));
        c9263a.m27593r();
        m36225r(this.f30017h, m36230w(c9263a, true, i10, map));
        c9263a.m27593r();
        for (C11557d c11557d : this.f30016g) {
            if (c11557d.m36222c() > 1) {
                for (C11557d c11557d2 : this.f30017h) {
                    if (c11557d2.m36222c() > 1 && m36227t(c11557d, c11557d2)) {
                        return m36228u(c11557d, c11557d2);
                    }
                }
            }
        }
        throw C6952m.m20106a();
    }

    @Override // tg.AbstractC11274r, p066dg.InterfaceC6954o
    public void reset() {
        this.f30016g.clear();
        this.f30017h.clear();
    }
}
