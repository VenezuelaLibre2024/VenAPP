package vg;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import p222lg.C9506a;
import p423wg.AbstractC12189j;
import tg.AbstractC11274r;
import ug.AbstractC11554a;
import ug.C11555b;
import ug.C11556c;
import ug.C11559f;

/* renamed from: vg.d */
/* loaded from: classes2.dex */
public final class C11893d extends AbstractC11554a {

    /* renamed from: k */
    private static final int[] f31446k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f31447l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    private static final int[] f31448m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f31449n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f31450o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, RecognitionOptions.ITF, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    private static final int[][] f31451p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List<C11891b> f31452g = new ArrayList(11);

    /* renamed from: h */
    private final List<C11892c> f31453h = new ArrayList();

    /* renamed from: i */
    private final int[] f31454i = new int[2];

    /* renamed from: j */
    private boolean f31455j;

    /* renamed from: A */
    private static boolean m38028A(C11556c c11556c, boolean z10, boolean z11) {
        return (c11556c.m36221c() == 0 && z10 && z11) ? false : true;
    }

    /* renamed from: B */
    private static boolean m38029B(Iterable<C11891b> iterable, Iterable<C11892c> iterable2) {
        boolean z10;
        boolean z11;
        Iterator<C11892c> it = iterable2.iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            C11892c next = it.next();
            Iterator<C11891b> it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = true;
                    break;
                }
                C11891b next2 = it2.next();
                Iterator<C11891b> it3 = next.m38025a().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z11 = false;
                        break;
                    }
                    if (next2.equals(it3.next())) {
                        z11 = true;
                        break;
                    }
                }
                if (!z11) {
                    break;
                }
            }
        } while (!z10);
        return true;
    }

    /* renamed from: C */
    private static boolean m38030C(List<C11891b> list) {
        boolean z10;
        for (int[] iArr : f31451p) {
            if (list.size() <= iArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        z10 = true;
                        break;
                    }
                    if (list.get(i10).m38021a().m36221c() != iArr[i10]) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    private C11556c m38031D(C9263a c9263a, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (z10) {
            int i14 = this.f31454i[0] - 1;
            while (i14 >= 0 && !c9263a.m27586h(i14)) {
                i14--;
            }
            int i15 = i14 + 1;
            int[] iArr = this.f31454i;
            i13 = iArr[0] - i15;
            i11 = iArr[1];
            i12 = i15;
        } else {
            int[] iArr2 = this.f31454i;
            int i16 = iArr2[0];
            int m27589k = c9263a.m27589k(iArr2[1] + 1);
            i11 = m27589k;
            i12 = i16;
            i13 = m27589k - this.f31454i[1];
        }
        int[] m36212j = m36212j();
        System.arraycopy(m36212j, 0, m36212j, 1, m36212j.length - 1);
        m36212j[0] = i13;
        try {
            return new C11556c(AbstractC11554a.m36210q(m36212j, f31449n), new int[]{i12, i11}, i12, i11, i10);
        } catch (C6952m unused) {
            return null;
        }
    }

    /* renamed from: E */
    private static void m38032E(Collection<C11891b> collection, Collection<C11892c> collection2) {
        boolean z10;
        Iterator<C11892c> it = collection2.iterator();
        while (it.hasNext()) {
            C11892c next = it.next();
            if (next.m38025a().size() != collection.size()) {
                Iterator<C11891b> it2 = next.m38025a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z10 = true;
                        break;
                    } else if (!collection.contains(it2.next())) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: G */
    private static void m38033G(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = iArr[i10];
            int i12 = (length - i10) - 1;
            iArr[i10] = iArr[i12];
            iArr[i12] = i11;
        }
    }

    /* renamed from: H */
    private void m38034H(int i10) {
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            if (i11 >= this.f31453h.size()) {
                break;
            }
            C11892c c11892c = this.f31453h.get(i11);
            if (c11892c.m38026b() > i10) {
                z10 = c11892c.m38027c(this.f31452g);
                break;
            } else {
                z11 = c11892c.m38027c(this.f31452g);
                i11++;
            }
        }
        if (z10 || z11 || m38029B(this.f31452g, this.f31453h)) {
            return;
        }
        this.f31453h.add(i11, new C11892c(this.f31452g, i10));
        m38032E(this.f31452g, this.f31453h);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m38035r(int r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.C11893d.m38035r(int):void");
    }

    /* renamed from: s */
    private boolean m38036s() {
        C11891b c11891b = this.f31452g.get(0);
        C11555b m38022b = c11891b.m38022b();
        C11555b m38023c = c11891b.m38023c();
        if (m38023c == null) {
            return false;
        }
        int m36217a = m38023c.m36217a();
        int i10 = 2;
        for (int i11 = 1; i11 < this.f31452g.size(); i11++) {
            C11891b c11891b2 = this.f31452g.get(i11);
            m36217a += c11891b2.m38022b().m36217a();
            i10++;
            C11555b m38023c2 = c11891b2.m38023c();
            if (m38023c2 != null) {
                m36217a += m38023c2.m36217a();
                i10++;
            }
        }
        return ((i10 + (-4)) * 211) + (m36217a % 211) == m38022b.m36218b();
    }

    /* renamed from: t */
    private List<C11891b> m38037t(List<C11892c> list, int i10) {
        while (i10 < this.f31453h.size()) {
            C11892c c11892c = this.f31453h.get(i10);
            this.f31452g.clear();
            Iterator<C11892c> it = list.iterator();
            while (it.hasNext()) {
                this.f31452g.addAll(it.next().m38025a());
            }
            this.f31452g.addAll(c11892c.m38025a());
            if (m38030C(this.f31452g)) {
                if (m38036s()) {
                    return this.f31452g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(c11892c);
                try {
                    return m38037t(arrayList, i10 + 1);
                } catch (C6952m unused) {
                    continue;
                }
            }
            i10++;
        }
        throw C6952m.m20106a();
    }

    /* renamed from: u */
    private List<C11891b> m38038u(boolean z10) {
        List<C11891b> list = null;
        if (this.f31453h.size() > 25) {
            this.f31453h.clear();
            return null;
        }
        this.f31452g.clear();
        if (z10) {
            Collections.reverse(this.f31453h);
        }
        try {
            list = m38037t(new ArrayList(), 0);
        } catch (C6952m unused) {
        }
        if (z10) {
            Collections.reverse(this.f31453h);
        }
        return list;
    }

    /* renamed from: v */
    static C6956q m38039v(List<C11891b> list) {
        String mo39100d = AbstractC12189j.m39106a(C11890a.m38020a(list)).mo39100d();
        C6958s[] m36219a = list.get(0).m38021a().m36219a();
        C6958s[] m36219a2 = list.get(list.size() - 1).m38021a().m36219a();
        C6956q c6956q = new C6956q(mo39100d, null, new C6958s[]{m36219a[0], m36219a[1], m36219a2[0], m36219a2[1]}, EnumC6940a.RSS_EXPANDED);
        c6956q.m20115h(EnumC6957r.SYMBOLOGY_IDENTIFIER, "]e0");
        return c6956q;
    }

    /* renamed from: y */
    private void m38040y(C9263a c9263a, List<C11891b> list, int i10) {
        int[] m36212j = m36212j();
        m36212j[0] = 0;
        m36212j[1] = 0;
        m36212j[2] = 0;
        m36212j[3] = 0;
        int m27590l = c9263a.m27590l();
        if (i10 < 0) {
            i10 = list.isEmpty() ? 0 : list.get(list.size() - 1).m38021a().m36220b()[1];
        }
        boolean z10 = list.size() % 2 != 0;
        if (this.f31455j) {
            z10 = !z10;
        }
        boolean z11 = false;
        while (i10 < m27590l) {
            z11 = !c9263a.m27586h(i10);
            if (!z11) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = 0;
        boolean z12 = z11;
        int i12 = i10;
        while (i10 < m27590l) {
            if (c9263a.m27586h(i10) != z12) {
                m36212j[i11] = m36212j[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (z10) {
                        m38033G(m36212j);
                    }
                    if (AbstractC11554a.m36209p(m36212j)) {
                        int[] iArr = this.f31454i;
                        iArr[0] = i12;
                        iArr[1] = i10;
                        return;
                    }
                    if (z10) {
                        m38033G(m36212j);
                    }
                    i12 += m36212j[0] + m36212j[1];
                    m36212j[0] = m36212j[2];
                    m36212j[1] = m36212j[3];
                    m36212j[2] = 0;
                    m36212j[3] = 0;
                    i11--;
                } else {
                    i11++;
                }
                m36212j[i11] = 1;
                z12 = !z12;
            }
            i10++;
        }
        throw C6952m.m20106a();
    }

    /* renamed from: z */
    private static int m38041z(C9263a c9263a, int i10) {
        return c9263a.m27586h(i10) ? c9263a.m27588j(c9263a.m27589k(i10)) : c9263a.m27589k(c9263a.m27588j(i10));
    }

    /* renamed from: F */
    C11891b m38042F(C9263a c9263a, List<C11891b> list, int i10) {
        C11556c m38031D;
        C11555b c11555b;
        boolean z10 = list.size() % 2 == 0;
        if (this.f31455j) {
            z10 = !z10;
        }
        int i11 = -1;
        boolean z11 = true;
        do {
            m38040y(c9263a, list, i11);
            m38031D = m38031D(c9263a, i10, z10);
            if (m38031D == null) {
                i11 = m38041z(c9263a, this.f31454i[0]);
            } else {
                z11 = false;
            }
        } while (z11);
        C11555b m38043w = m38043w(c9263a, m38031D, z10, true);
        if (!list.isEmpty() && list.get(list.size() - 1).m38024d()) {
            throw C6952m.m20106a();
        }
        try {
            c11555b = m38043w(c9263a, m38031D, z10, false);
        } catch (C6952m unused) {
            c11555b = null;
        }
        return new C11891b(m38043w, c11555b, m38031D);
    }

    @Override // tg.AbstractC11274r
    /* renamed from: c */
    public C6956q mo35175c(int i10, C9263a c9263a, Map<EnumC6944e, ?> map) {
        this.f31452g.clear();
        this.f31455j = false;
        try {
            return m38039v(m38044x(i10, c9263a));
        } catch (C6952m unused) {
            this.f31452g.clear();
            this.f31455j = true;
            return m38039v(m38044x(i10, c9263a));
        }
    }

    @Override // tg.AbstractC11274r, p066dg.InterfaceC6954o
    public void reset() {
        this.f31452g.clear();
        this.f31453h.clear();
    }

    /* renamed from: w */
    C11555b m38043w(C9263a c9263a, C11556c c11556c, boolean z10, boolean z11) {
        int[] m36211i = m36211i();
        Arrays.fill(m36211i, 0);
        int[] m36220b = c11556c.m36220b();
        if (z11) {
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
        float m28274d = C9506a.m28274d(m36211i) / 17;
        float f10 = (c11556c.m36220b()[1] - c11556c.m36220b()[0]) / 15.0f;
        if (Math.abs(m28274d - f10) / f10 > 0.3f) {
            throw C6952m.m20106a();
        }
        int[] m36215m = m36215m();
        int[] m36213k = m36213k();
        float[] m36216n = m36216n();
        float[] m36214l = m36214l();
        for (int i12 = 0; i12 < m36211i.length; i12++) {
            float f11 = (m36211i[i12] * 1.0f) / m28274d;
            int i13 = (int) (0.5f + f11);
            if (i13 < 1) {
                if (f11 < 0.3f) {
                    throw C6952m.m20106a();
                }
                i13 = 1;
            } else if (i13 > 8) {
                if (f11 > 8.7f) {
                    throw C6952m.m20106a();
                }
                i13 = 8;
            }
            int i14 = i12 / 2;
            if ((i12 & 1) == 0) {
                m36215m[i14] = i13;
                m36216n[i14] = f11 - i13;
            } else {
                m36213k[i14] = i13;
                m36214l[i14] = f11 - i13;
            }
        }
        m38035r(17);
        int m36221c = (((c11556c.m36221c() * 4) + (z10 ? 0 : 2)) + (!z11 ? 1 : 0)) - 1;
        int i15 = 0;
        int i16 = 0;
        for (int length2 = m36215m.length - 1; length2 >= 0; length2--) {
            if (m38028A(c11556c, z10, z11)) {
                i15 += m36215m[length2] * f31450o[m36221c][length2 * 2];
            }
            i16 += m36215m[length2];
        }
        int i17 = 0;
        for (int length3 = m36213k.length - 1; length3 >= 0; length3--) {
            if (m38028A(c11556c, z10, z11)) {
                i17 += m36213k[length3] * f31450o[m36221c][(length3 * 2) + 1];
            }
        }
        int i18 = i15 + i17;
        if ((i16 & 1) != 0 || i16 > 13 || i16 < 4) {
            throw C6952m.m20106a();
        }
        int i19 = (13 - i16) / 2;
        int i20 = f31446k[i19];
        return new C11555b((C11559f.m36234b(m36215m, i20, true) * f31447l[i19]) + C11559f.m36234b(m36213k, 9 - i20, false) + f31448m[i19], i18);
    }

    /* renamed from: x */
    List<C11891b> m38044x(int i10, C9263a c9263a) {
        boolean z10 = false;
        while (!z10) {
            try {
                List<C11891b> list = this.f31452g;
                list.add(m38042F(c9263a, list, i10));
            } catch (C6952m e10) {
                if (this.f31452g.isEmpty()) {
                    throw e10;
                }
                z10 = true;
            }
        }
        if (m38036s()) {
            return this.f31452g;
        }
        boolean z11 = !this.f31453h.isEmpty();
        m38034H(i10);
        if (z11) {
            List<C11891b> m38038u = m38038u(false);
            if (m38038u != null) {
                return m38038u;
            }
            List<C11891b> m38038u2 = m38038u(true);
            if (m38038u2 != null) {
                return m38038u2;
            }
        }
        throw C6952m.m20106a();
    }
}
