package tg;

import java.util.Map;
import kg.C9263a;
import p066dg.C6947h;
import p066dg.C6952m;
import p066dg.C6956q;
import p066dg.C6958s;
import p066dg.EnumC6940a;
import p066dg.EnumC6944e;
import p066dg.EnumC6957r;

/* renamed from: tg.n */
/* loaded from: classes2.dex */
public final class C11270n extends AbstractC11274r {

    /* renamed from: b */
    private static final int[] f29228b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f29229c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[][] f29230d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    private static final int[][] f29231e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f29232a = -1;

    /* renamed from: h */
    private static int m35217h(int[] iArr) {
        int length = f29231e.length;
        float f10 = 0.38f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float m35225e = AbstractC11274r.m35225e(iArr, f29231e[i11], 0.5f);
            if (m35225e < f10) {
                i10 = i11;
                f10 = m35225e;
            } else if (m35225e == f10) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw C6952m.m20106a();
    }

    /* renamed from: i */
    private int[] m35218i(C9263a c9263a) {
        int[] m35221l;
        c9263a.m27593r();
        try {
            int m35222m = m35222m(c9263a);
            try {
                m35221l = m35221l(c9263a, m35222m, f29230d[0]);
            } catch (C6952m unused) {
                m35221l = m35221l(c9263a, m35222m, f29230d[1]);
            }
            m35223n(c9263a, m35221l[0]);
            int i10 = m35221l[0];
            m35221l[0] = c9263a.m27590l() - m35221l[1];
            m35221l[1] = c9263a.m27590l() - i10;
            return m35221l;
        } finally {
            c9263a.m27593r();
        }
    }

    /* renamed from: j */
    private static void m35219j(C9263a c9263a, int i10, int i11, StringBuilder sb2) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i10 < i11) {
            AbstractC11274r.m35226f(c9263a, i10, iArr);
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = i12 * 2;
                iArr2[i12] = iArr[i13];
                iArr3[i12] = iArr[i13 + 1];
            }
            sb2.append((char) (m35217h(iArr2) + 48));
            sb2.append((char) (m35217h(iArr3) + 48));
            for (int i14 = 0; i14 < 10; i14++) {
                i10 += iArr[i14];
            }
        }
    }

    /* renamed from: k */
    private int[] m35220k(C9263a c9263a) {
        int[] m35221l = m35221l(c9263a, m35222m(c9263a), f29229c);
        int i10 = m35221l[1];
        int i11 = m35221l[0];
        this.f29232a = (i10 - i11) / 4;
        m35223n(c9263a, i11);
        return m35221l;
    }

    /* renamed from: l */
    private static int[] m35221l(C9263a c9263a, int i10, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int m27590l = c9263a.m27590l();
        int i11 = i10;
        boolean z10 = false;
        int i12 = 0;
        while (i10 < m27590l) {
            if (c9263a.m27586h(i10) != z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (AbstractC11274r.m35225e(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i11, i10};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw C6952m.m20106a();
    }

    /* renamed from: m */
    private static int m35222m(C9263a c9263a) {
        int m27590l = c9263a.m27590l();
        int m27588j = c9263a.m27588j(0);
        if (m27588j != m27590l) {
            return m27588j;
        }
        throw C6952m.m20106a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m35223n(kg.C9263a r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f29232a
            int r0 = r0 * 10
            int r0 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L1a
            if (r4 < 0) goto L1a
            boolean r1 = r3.m27586h(r4)
            if (r1 == 0) goto L15
            goto L1a
        L15:
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L1a:
            if (r0 != 0) goto L1d
            return
        L1d:
            dg.m r3 = p066dg.C6952m.m20106a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C11270n.m35223n(kg.a, int):void");
    }

    @Override // tg.AbstractC11274r
    /* renamed from: c */
    public C6956q mo35175c(int i10, C9263a c9263a, Map<EnumC6944e, ?> map) {
        boolean z10;
        int[] m35220k = m35220k(c9263a);
        int[] m35218i = m35218i(c9263a);
        StringBuilder sb2 = new StringBuilder(20);
        m35219j(c9263a, m35220k[1], m35218i[0], sb2);
        String sb3 = sb2.toString();
        int[] iArr = map != null ? (int[]) map.get(EnumC6944e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f29228b;
        }
        int length = sb3.length();
        int length2 = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= length2) {
                z10 = false;
                break;
            }
            int i13 = iArr[i11];
            if (length == i13) {
                z10 = true;
                break;
            }
            if (i13 > i12) {
                i12 = i13;
            }
            i11++;
        }
        if (!z10 && length > i12) {
            z10 = true;
        }
        if (!z10) {
            throw C6947h.m20094a();
        }
        float f10 = i10;
        C6956q c6956q = new C6956q(sb3, null, new C6958s[]{new C6958s(m35220k[1], f10), new C6958s(m35218i[0], f10)}, EnumC6940a.ITF);
        c6956q.m20115h(EnumC6957r.SYMBOLOGY_IDENTIFIER, "]I0");
        return c6956q;
    }
}
