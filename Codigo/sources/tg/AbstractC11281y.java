package tg;

import java.util.Arrays;
import java.util.Map;
import kg.C9263a;
import p066dg.AbstractC6955p;
import p066dg.C6943d;
import p066dg.C6947h;
import p066dg.C6952m;
import p066dg.C6956q;
import p066dg.C6958s;
import p066dg.EnumC6940a;
import p066dg.EnumC6944e;
import p066dg.EnumC6957r;
import p066dg.InterfaceC6959t;

/* renamed from: tg.y */
/* loaded from: classes2.dex */
public abstract class AbstractC11281y extends AbstractC11274r {

    /* renamed from: d */
    static final int[] f29251d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f29252e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[] f29253f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    static final int[][] f29254g;

    /* renamed from: h */
    static final int[][] f29255h;

    /* renamed from: a */
    private final StringBuilder f29256a = new StringBuilder(20);

    /* renamed from: b */
    private final C11280x f29257b = new C11280x();

    /* renamed from: c */
    private final C11269m f29258c = new C11269m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f29254g = iArr;
        int[][] iArr2 = new int[20];
        f29255h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f29254g[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f29255h[i10] = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m35244i(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return m35249r(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m35245j(C9263a c9263a, int[] iArr, int i10, int[][] iArr2) {
        AbstractC11274r.m35226f(c9263a, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float m35225e = AbstractC11274r.m35225e(iArr, iArr2[i12], 0.7f);
            if (m35225e < f10) {
                i11 = i12;
                f10 = m35225e;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw C6952m.m20106a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int[] m35246n(C9263a c9263a, int i10, boolean z10, int[] iArr) {
        return m35247o(c9263a, i10, z10, iArr, new int[iArr.length]);
    }

    /* renamed from: o */
    private static int[] m35247o(C9263a c9263a, int i10, boolean z10, int[] iArr, int[] iArr2) {
        int m27590l = c9263a.m27590l();
        int m27589k = z10 ? c9263a.m27589k(i10) : c9263a.m27588j(i10);
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = m27589k;
        while (m27589k < m27590l) {
            if (c9263a.m27586h(m27589k) != z11) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (AbstractC11274r.m35225e(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i12, m27589k};
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
            m27589k++;
        }
        throw C6952m.m20106a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static int[] m35248p(C9263a c9263a) {
        int[] iArr = new int[f29251d.length];
        int[] iArr2 = null;
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            int[] iArr3 = f29251d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m35247o(c9263a, i10, false, iArr3, iArr);
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                z10 = c9263a.m27592p(i13, i11, false);
            }
            i10 = i12;
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static int m35249r(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int charAt = charSequence.charAt(i11) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C6947h.m20094a();
            }
            i10 += charAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int charAt2 = charSequence.charAt(i13) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C6947h.m20094a();
            }
            i12 += charAt2;
        }
        return (1000 - i12) % 10;
    }

    @Override // tg.AbstractC11274r
    /* renamed from: c */
    public C6956q mo35175c(int i10, C9263a c9263a, Map<EnumC6944e, ?> map) {
        return mo35233m(i10, c9263a, m35248p(c9263a), map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo35178h(String str) {
        return m35244i(str);
    }

    /* renamed from: k */
    int[] mo35179k(C9263a c9263a, int i10) {
        return m35246n(c9263a, i10, false, f29251d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo35180l(C9263a c9263a, int[] iArr, StringBuilder sb2);

    /* renamed from: m */
    public C6956q mo35233m(int i10, C9263a c9263a, int[] iArr, Map<EnumC6944e, ?> map) {
        int i11;
        String m35216c;
        InterfaceC6959t interfaceC6959t = map == null ? null : (InterfaceC6959t) map.get(EnumC6944e.NEED_RESULT_POINT_CALLBACK);
        boolean z10 = true;
        if (interfaceC6959t != null) {
            interfaceC6959t.mo20121a(new C6958s((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb2 = this.f29256a;
        sb2.setLength(0);
        int mo35180l = mo35180l(c9263a, iArr, sb2);
        if (interfaceC6959t != null) {
            interfaceC6959t.mo20121a(new C6958s(mo35180l, i10));
        }
        int[] mo35179k = mo35179k(c9263a, mo35180l);
        if (interfaceC6959t != null) {
            interfaceC6959t.mo20121a(new C6958s((mo35179k[0] + mo35179k[1]) / 2.0f, i10));
        }
        int i12 = mo35179k[1];
        int i13 = (i12 - mo35179k[0]) + i12;
        if (i13 >= c9263a.m27590l() || !c9263a.m27592p(i12, i13, false)) {
            throw C6952m.m20106a();
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 8) {
            throw C6947h.m20094a();
        }
        if (!mo35178h(sb3)) {
            throw C6943d.m20090a();
        }
        EnumC6940a mo35181q = mo35181q();
        float f10 = i10;
        C6956q c6956q = new C6956q(sb3, null, new C6958s[]{new C6958s((iArr[1] + iArr[0]) / 2.0f, f10), new C6958s((mo35179k[1] + mo35179k[0]) / 2.0f, f10)}, mo35181q);
        try {
            C6956q m35243a = this.f29257b.m35243a(i10, c9263a, mo35179k[1]);
            c6956q.m20115h(EnumC6957r.UPC_EAN_EXTENSION, m35243a.m20113f());
            c6956q.m20114g(m35243a.m20111d());
            c6956q.m20108a(m35243a.m20112e());
            i11 = m35243a.m20113f().length();
        } catch (AbstractC6955p unused) {
            i11 = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(EnumC6944e.ALLOWED_EAN_EXTENSIONS) : null;
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
                throw C6952m.m20106a();
            }
        }
        if ((mo35181q == EnumC6940a.EAN_13 || mo35181q == EnumC6940a.UPC_A) && (m35216c = this.f29258c.m35216c(sb3)) != null) {
            c6956q.m20115h(EnumC6957r.POSSIBLE_COUNTRY, m35216c);
        }
        int i15 = mo35181q == EnumC6940a.EAN_8 ? 4 : 0;
        c6956q.m20115h(EnumC6957r.SYMBOLOGY_IDENTIFIER, "]E" + i15);
        return c6956q;
    }

    /* renamed from: q */
    abstract EnumC6940a mo35181q();
}
