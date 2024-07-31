package tg;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class y extends r {

    /* renamed from: d, reason: collision with root package name */
    static final int[] f26949d = {1, 1, 1};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f26950e = {1, 1, 1, 1, 1};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f26951f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g, reason: collision with root package name */
    static final int[][] f26952g;

    /* renamed from: h, reason: collision with root package name */
    static final int[][] f26953h;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f26954a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private final x f26955b = new x();

    /* renamed from: c, reason: collision with root package name */
    private final m f26956c = new m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f26952g = iArr;
        int[][] iArr2 = new int[20];
        f26953h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f26952g[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f26953h[i10] = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return r(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(kg.a aVar, int[] iArr, int i10, int[][] iArr2) {
        r.f(aVar, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float e10 = r.e(iArr, iArr2[i12], 0.7f);
            if (e10 < f10) {
                i11 = i12;
                f10 = e10;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw dg.m.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] n(kg.a aVar, int i10, boolean z10, int[] iArr) {
        return o(aVar, i10, z10, iArr, new int[iArr.length]);
    }

    private static int[] o(kg.a aVar, int i10, boolean z10, int[] iArr, int[] iArr2) {
        int l10 = aVar.l();
        int k10 = z10 ? aVar.k(i10) : aVar.j(i10);
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = k10;
        while (k10 < l10) {
            if (aVar.h(k10) != z11) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (r.e(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i12, k10};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            }
            k10++;
        }
        throw dg.m.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] p(kg.a aVar) {
        int[] iArr = new int[f26949d.length];
        int[] iArr2 = null;
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            int[] iArr3 = f26949d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = o(aVar, i10, false, iArr3, iArr);
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                z10 = aVar.p(i13, i11, false);
            }
            i10 = i12;
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int charAt = charSequence.charAt(i11) - '0';
            if (charAt < 0 || charAt > 9) {
                throw dg.h.a();
            }
            i10 += charAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int charAt2 = charSequence.charAt(i13) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw dg.h.a();
            }
            i12 += charAt2;
        }
        return (1000 - i12) % 10;
    }

    @Override // tg.r
    public dg.q c(int i10, kg.a aVar, Map<dg.e, ?> map) {
        return m(i10, aVar, p(aVar), map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(String str) {
        return i(str);
    }

    int[] k(kg.a aVar, int i10) {
        return n(aVar, i10, false, f26949d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int l(kg.a aVar, int[] iArr, StringBuilder sb2);

    public dg.q m(int i10, kg.a aVar, int[] iArr, Map<dg.e, ?> map) {
        int i11;
        String c10;
        dg.t tVar = map == null ? null : (dg.t) map.get(dg.e.NEED_RESULT_POINT_CALLBACK);
        boolean z10 = true;
        if (tVar != null) {
            tVar.a(new dg.s((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb2 = this.f26954a;
        sb2.setLength(0);
        int l10 = l(aVar, iArr, sb2);
        if (tVar != null) {
            tVar.a(new dg.s(l10, i10));
        }
        int[] k10 = k(aVar, l10);
        if (tVar != null) {
            tVar.a(new dg.s((k10[0] + k10[1]) / 2.0f, i10));
        }
        int i12 = k10[1];
        int i13 = (i12 - k10[0]) + i12;
        if (i13 >= aVar.l() || !aVar.p(i12, i13, false)) {
            throw dg.m.a();
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 8) {
            throw dg.h.a();
        }
        if (!h(sb3)) {
            throw dg.d.a();
        }
        dg.a q10 = q();
        float f10 = i10;
        dg.q qVar = new dg.q(sb3, null, new dg.s[]{new dg.s((iArr[1] + iArr[0]) / 2.0f, f10), new dg.s((k10[1] + k10[0]) / 2.0f, f10)}, q10);
        try {
            dg.q a10 = this.f26955b.a(i10, aVar, k10[1]);
            qVar.h(dg.r.UPC_EAN_EXTENSION, a10.f());
            qVar.g(a10.d());
            qVar.a(a10.e());
            i11 = a10.f().length();
        } catch (dg.p unused) {
            i11 = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(dg.e.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length = iArr2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    z10 = false;
                    break;
                }
                if (i11 == iArr2[i14]) {
                    break;
                }
                i14++;
            }
            if (!z10) {
                throw dg.m.a();
            }
        }
        if ((q10 == dg.a.EAN_13 || q10 == dg.a.UPC_A) && (c10 = this.f26956c.c(sb3)) != null) {
            qVar.h(dg.r.POSSIBLE_COUNTRY, c10);
        }
        int i15 = q10 == dg.a.EAN_8 ? 4 : 0;
        qVar.h(dg.r.SYMBOLOGY_IDENTIFIER, "]E" + i15);
        return qVar;
    }

    abstract dg.a q();
}
