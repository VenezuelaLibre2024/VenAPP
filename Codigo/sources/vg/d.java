package vg;

import com.google.android.libraries.barhopper.RecognitionOptions;
import dg.e;
import dg.m;
import dg.q;
import dg.r;
import dg.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ug.f;
import wg.j;

/* loaded from: classes2.dex */
public final class d extends ug.a {

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f29012k = {7, 5, 4, 3, 1};

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f29013l = {4, 20, 52, 104, 204};

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f29014m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n, reason: collision with root package name */
    private static final int[][] f29015n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o, reason: collision with root package name */
    private static final int[][] f29016o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, RecognitionOptions.ITF, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p, reason: collision with root package name */
    private static final int[][] f29017p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g, reason: collision with root package name */
    private final List<b> f29018g = new ArrayList(11);

    /* renamed from: h, reason: collision with root package name */
    private final List<c> f29019h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final int[] f29020i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    private boolean f29021j;

    private static boolean A(ug.c cVar, boolean z10, boolean z11) {
        return (cVar.c() == 0 && z10 && z11) ? false : true;
    }

    private static boolean B(Iterable<b> iterable, Iterable<c> iterable2) {
        boolean z10;
        boolean z11;
        Iterator<c> it = iterable2.iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            c next = it.next();
            Iterator<b> it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = true;
                    break;
                }
                b next2 = it2.next();
                Iterator<b> it3 = next.a().iterator();
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

    private static boolean C(List<b> list) {
        boolean z10;
        for (int[] iArr : f29017p) {
            if (list.size() <= iArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        z10 = true;
                        break;
                    }
                    if (list.get(i10).a().c() != iArr[i10]) {
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

    private ug.c D(kg.a aVar, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (z10) {
            int i14 = this.f29020i[0] - 1;
            while (i14 >= 0 && !aVar.h(i14)) {
                i14--;
            }
            int i15 = i14 + 1;
            int[] iArr = this.f29020i;
            i13 = iArr[0] - i15;
            i11 = iArr[1];
            i12 = i15;
        } else {
            int[] iArr2 = this.f29020i;
            int i16 = iArr2[0];
            int k10 = aVar.k(iArr2[1] + 1);
            i11 = k10;
            i12 = i16;
            i13 = k10 - this.f29020i[1];
        }
        int[] j10 = j();
        System.arraycopy(j10, 0, j10, 1, j10.length - 1);
        j10[0] = i13;
        try {
            return new ug.c(ug.a.q(j10, f29015n), new int[]{i12, i11}, i12, i11, i10);
        } catch (m unused) {
            return null;
        }
    }

    private static void E(Collection<b> collection, Collection<c> collection2) {
        boolean z10;
        Iterator<c> it = collection2.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().size() != collection.size()) {
                Iterator<b> it2 = next.a().iterator();
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

    private static void G(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = iArr[i10];
            int i12 = (length - i10) - 1;
            iArr[i10] = iArr[i12];
            iArr[i12] = i11;
        }
    }

    private void H(int i10) {
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            if (i11 >= this.f29019h.size()) {
                break;
            }
            c cVar = this.f29019h.get(i11);
            if (cVar.b() > i10) {
                z10 = cVar.c(this.f29018g);
                break;
            } else {
                z11 = cVar.c(this.f29018g);
                i11++;
            }
        }
        if (z10 || z11 || B(this.f29018g, this.f29019h)) {
            return;
        }
        this.f29019h.add(i11, new c(this.f29018g, i10));
        E(this.f29018g, this.f29019h);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void r(int r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.d.r(int):void");
    }

    private boolean s() {
        b bVar = this.f29018g.get(0);
        ug.b b10 = bVar.b();
        ug.b c10 = bVar.c();
        if (c10 == null) {
            return false;
        }
        int a10 = c10.a();
        int i10 = 2;
        for (int i11 = 1; i11 < this.f29018g.size(); i11++) {
            b bVar2 = this.f29018g.get(i11);
            a10 += bVar2.b().a();
            i10++;
            ug.b c11 = bVar2.c();
            if (c11 != null) {
                a10 += c11.a();
                i10++;
            }
        }
        return ((i10 + (-4)) * 211) + (a10 % 211) == b10.b();
    }

    private List<b> t(List<c> list, int i10) {
        while (i10 < this.f29019h.size()) {
            c cVar = this.f29019h.get(i10);
            this.f29018g.clear();
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                this.f29018g.addAll(it.next().a());
            }
            this.f29018g.addAll(cVar.a());
            if (C(this.f29018g)) {
                if (s()) {
                    return this.f29018g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return t(arrayList, i10 + 1);
                } catch (m unused) {
                    continue;
                }
            }
            i10++;
        }
        throw m.a();
    }

    private List<b> u(boolean z10) {
        List<b> list = null;
        if (this.f29019h.size() > 25) {
            this.f29019h.clear();
            return null;
        }
        this.f29018g.clear();
        if (z10) {
            Collections.reverse(this.f29019h);
        }
        try {
            list = t(new ArrayList(), 0);
        } catch (m unused) {
        }
        if (z10) {
            Collections.reverse(this.f29019h);
        }
        return list;
    }

    static q v(List<b> list) {
        String d10 = j.a(a.a(list)).d();
        s[] a10 = list.get(0).a().a();
        s[] a11 = list.get(list.size() - 1).a().a();
        q qVar = new q(d10, null, new s[]{a10[0], a10[1], a11[0], a11[1]}, dg.a.RSS_EXPANDED);
        qVar.h(r.SYMBOLOGY_IDENTIFIER, "]e0");
        return qVar;
    }

    private void y(kg.a aVar, List<b> list, int i10) {
        int[] j10 = j();
        j10[0] = 0;
        j10[1] = 0;
        j10[2] = 0;
        j10[3] = 0;
        int l10 = aVar.l();
        if (i10 < 0) {
            i10 = list.isEmpty() ? 0 : list.get(list.size() - 1).a().b()[1];
        }
        boolean z10 = list.size() % 2 != 0;
        if (this.f29021j) {
            z10 = !z10;
        }
        boolean z11 = false;
        while (i10 < l10) {
            z11 = !aVar.h(i10);
            if (!z11) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = 0;
        boolean z12 = z11;
        int i12 = i10;
        while (i10 < l10) {
            if (aVar.h(i10) != z12) {
                j10[i11] = j10[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (z10) {
                        G(j10);
                    }
                    if (ug.a.p(j10)) {
                        int[] iArr = this.f29020i;
                        iArr[0] = i12;
                        iArr[1] = i10;
                        return;
                    }
                    if (z10) {
                        G(j10);
                    }
                    i12 += j10[0] + j10[1];
                    j10[0] = j10[2];
                    j10[1] = j10[3];
                    j10[2] = 0;
                    j10[3] = 0;
                    i11--;
                } else {
                    i11++;
                }
                j10[i11] = 1;
                z12 = !z12;
            }
            i10++;
        }
        throw m.a();
    }

    private static int z(kg.a aVar, int i10) {
        return aVar.h(i10) ? aVar.j(aVar.k(i10)) : aVar.k(aVar.j(i10));
    }

    b F(kg.a aVar, List<b> list, int i10) {
        ug.c D;
        ug.b bVar;
        boolean z10 = list.size() % 2 == 0;
        if (this.f29021j) {
            z10 = !z10;
        }
        int i11 = -1;
        boolean z11 = true;
        do {
            y(aVar, list, i11);
            D = D(aVar, i10, z10);
            if (D == null) {
                i11 = z(aVar, this.f29020i[0]);
            } else {
                z11 = false;
            }
        } while (z11);
        ug.b w10 = w(aVar, D, z10, true);
        if (!list.isEmpty() && list.get(list.size() - 1).d()) {
            throw m.a();
        }
        try {
            bVar = w(aVar, D, z10, false);
        } catch (m unused) {
            bVar = null;
        }
        return new b(w10, bVar, D);
    }

    @Override // tg.r
    public q c(int i10, kg.a aVar, Map<e, ?> map) {
        this.f29018g.clear();
        this.f29021j = false;
        try {
            return v(x(i10, aVar));
        } catch (m unused) {
            this.f29018g.clear();
            this.f29021j = true;
            return v(x(i10, aVar));
        }
    }

    @Override // tg.r, dg.o
    public void reset() {
        this.f29018g.clear();
        this.f29019h.clear();
    }

    ug.b w(kg.a aVar, ug.c cVar, boolean z10, boolean z11) {
        int[] i10 = i();
        Arrays.fill(i10, 0);
        int[] b10 = cVar.b();
        if (z11) {
            tg.r.g(aVar, b10[0], i10);
        } else {
            tg.r.f(aVar, b10[1], i10);
            int i11 = 0;
            for (int length = i10.length - 1; i11 < length; length--) {
                int i12 = i10[i11];
                i10[i11] = i10[length];
                i10[length] = i12;
                i11++;
            }
        }
        float d10 = lg.a.d(i10) / 17;
        float f10 = (cVar.b()[1] - cVar.b()[0]) / 15.0f;
        if (Math.abs(d10 - f10) / f10 > 0.3f) {
            throw m.a();
        }
        int[] m10 = m();
        int[] k10 = k();
        float[] n10 = n();
        float[] l10 = l();
        for (int i13 = 0; i13 < i10.length; i13++) {
            float f11 = (i10[i13] * 1.0f) / d10;
            int i14 = (int) (0.5f + f11);
            if (i14 < 1) {
                if (f11 < 0.3f) {
                    throw m.a();
                }
                i14 = 1;
            } else if (i14 > 8) {
                if (f11 > 8.7f) {
                    throw m.a();
                }
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                m10[i15] = i14;
                n10[i15] = f11 - i14;
            } else {
                k10[i15] = i14;
                l10[i15] = f11 - i14;
            }
        }
        r(17);
        int c10 = (((cVar.c() * 4) + (z10 ? 0 : 2)) + (!z11 ? 1 : 0)) - 1;
        int i16 = 0;
        int i17 = 0;
        for (int length2 = m10.length - 1; length2 >= 0; length2--) {
            if (A(cVar, z10, z11)) {
                i16 += m10[length2] * f29016o[c10][length2 * 2];
            }
            i17 += m10[length2];
        }
        int i18 = 0;
        for (int length3 = k10.length - 1; length3 >= 0; length3--) {
            if (A(cVar, z10, z11)) {
                i18 += k10[length3] * f29016o[c10][(length3 * 2) + 1];
            }
        }
        int i19 = i16 + i18;
        if ((i17 & 1) != 0 || i17 > 13 || i17 < 4) {
            throw m.a();
        }
        int i20 = (13 - i17) / 2;
        int i21 = f29012k[i20];
        return new ug.b((f.b(m10, i21, true) * f29013l[i20]) + f.b(k10, 9 - i21, false) + f29014m[i20], i19);
    }

    List<b> x(int i10, kg.a aVar) {
        boolean z10 = false;
        while (!z10) {
            try {
                List<b> list = this.f29018g;
                list.add(F(aVar, list, i10));
            } catch (m e10) {
                if (this.f29018g.isEmpty()) {
                    throw e10;
                }
                z10 = true;
            }
        }
        if (s()) {
            return this.f29018g;
        }
        boolean z11 = !this.f29019h.isEmpty();
        H(i10);
        if (z11) {
            List<b> u10 = u(false);
            if (u10 != null) {
                return u10;
            }
            List<b> u11 = u(true);
            if (u11 != null) {
                return u11;
            }
        }
        throw m.a();
    }
}
