package p490zg;

import p066dg.C6943d;

/* renamed from: zg.a */
/* loaded from: classes2.dex */
public final class C13025a {

    /* renamed from: a */
    private final C13026b f35358a = C13026b.f35359f;

    /* renamed from: b */
    private int[] m42992b(C13027c c13027c) {
        int m43009d = c13027c.m43009d();
        int[] iArr = new int[m43009d];
        int i10 = 0;
        for (int i11 = 1; i11 < this.f35358a.m43000e() && i10 < m43009d; i11++) {
            if (c13027c.m43007b(i11) == 0) {
                iArr[i10] = this.f35358a.m43002g(i11);
                i10++;
            }
        }
        if (i10 == m43009d) {
            return iArr;
        }
        throw C6943d.m20090a();
    }

    /* renamed from: c */
    private int[] m42993c(C13027c c13027c, C13027c c13027c2, int[] iArr) {
        int m43009d = c13027c2.m43009d();
        if (m43009d < 1) {
            return new int[0];
        }
        int[] iArr2 = new int[m43009d];
        for (int i10 = 1; i10 <= m43009d; i10++) {
            iArr2[m43009d - i10] = this.f35358a.m43004i(i10, c13027c2.m43008c(i10));
        }
        C13027c c13027c3 = new C13027c(this.f35358a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            int m43002g = this.f35358a.m43002g(iArr[i11]);
            iArr3[i11] = this.f35358a.m43004i(this.f35358a.m43005j(0, c13027c.m43007b(m43002g)), this.f35358a.m43002g(c13027c3.m43007b(m43002g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    private C13027c[] m42994d(C13027c c13027c, C13027c c13027c2, int i10) {
        if (c13027c.m43009d() < c13027c2.m43009d()) {
            c13027c2 = c13027c;
            c13027c = c13027c2;
        }
        C13027c m43001f = this.f35358a.m43001f();
        C13027c m42999d = this.f35358a.m42999d();
        while (true) {
            C13027c c13027c3 = c13027c2;
            c13027c2 = c13027c;
            c13027c = c13027c3;
            C13027c c13027c4 = m42999d;
            C13027c c13027c5 = m43001f;
            m43001f = c13027c4;
            if (c13027c.m43009d() < i10 / 2) {
                int m43008c = m43001f.m43008c(0);
                if (m43008c == 0) {
                    throw C6943d.m20090a();
                }
                int m43002g = this.f35358a.m43002g(m43008c);
                return new C13027c[]{m43001f.m43011f(m43002g), c13027c.m43011f(m43002g)};
            }
            if (c13027c.m43010e()) {
                throw C6943d.m20090a();
            }
            C13027c m43001f2 = this.f35358a.m43001f();
            int m43002g2 = this.f35358a.m43002g(c13027c.m43008c(c13027c.m43009d()));
            while (c13027c2.m43009d() >= c13027c.m43009d() && !c13027c2.m43010e()) {
                int m43009d = c13027c2.m43009d() - c13027c.m43009d();
                int m43004i = this.f35358a.m43004i(c13027c2.m43008c(c13027c2.m43009d()), m43002g2);
                m43001f2 = m43001f2.m43006a(this.f35358a.m42997b(m43009d, m43004i));
                c13027c2 = c13027c2.m43015j(c13027c.m43013h(m43009d, m43004i));
            }
            m42999d = m43001f2.m43012g(m43001f).m43015j(c13027c5).m43014i();
        }
    }

    /* renamed from: a */
    public int m42995a(int[] iArr, int i10, int[] iArr2) {
        C13027c c13027c = new C13027c(this.f35358a, iArr);
        int[] iArr3 = new int[i10];
        boolean z10 = false;
        for (int i11 = i10; i11 > 0; i11--) {
            int m43007b = c13027c.m43007b(this.f35358a.m42998c(i11));
            iArr3[i10 - i11] = m43007b;
            if (m43007b != 0) {
                z10 = true;
            }
        }
        if (!z10) {
            return 0;
        }
        C13027c m42999d = this.f35358a.m42999d();
        if (iArr2 != null) {
            for (int i12 : iArr2) {
                int m42998c = this.f35358a.m42998c((iArr.length - 1) - i12);
                C13026b c13026b = this.f35358a;
                m42999d = m42999d.m43012g(new C13027c(c13026b, new int[]{c13026b.m43005j(0, m42998c), 1}));
            }
        }
        C13027c[] m42994d = m42994d(this.f35358a.m42997b(i10, 1), new C13027c(this.f35358a, iArr3), i10);
        C13027c c13027c2 = m42994d[0];
        C13027c c13027c3 = m42994d[1];
        int[] m42992b = m42992b(c13027c2);
        int[] m42993c = m42993c(c13027c3, c13027c2, m42992b);
        for (int i13 = 0; i13 < m42992b.length; i13++) {
            int length = (iArr.length - 1) - this.f35358a.m43003h(m42992b[i13]);
            if (length < 0) {
                throw C6943d.m20090a();
            }
            iArr[length] = this.f35358a.m43005j(iArr[length], m42993c[i13]);
        }
        return m42992b.length;
    }
}
