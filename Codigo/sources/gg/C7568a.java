package gg;

import eg.C7186a;
import kg.AbstractC9274l;
import kg.C9264b;
import mg.C9580a;
import mg.C9582c;
import mg.C9584e;
import p066dg.C6952m;
import p066dg.C6958s;
import p222lg.C9506a;
import p222lg.C9507b;

/* renamed from: gg.a */
/* loaded from: classes2.dex */
public final class C7568a {

    /* renamed from: g */
    private static final int[] f17889g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final C9264b f17890a;

    /* renamed from: b */
    private boolean f17891b;

    /* renamed from: c */
    private int f17892c;

    /* renamed from: d */
    private int f17893d;

    /* renamed from: e */
    private int f17894e;

    /* renamed from: f */
    private int f17895f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gg.a$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final int f17896a;

        /* renamed from: b */
        private final int f17897b;

        a(int i10, int i11) {
            this.f17896a = i10;
            this.f17897b = i11;
        }

        /* renamed from: a */
        int m22992a() {
            return this.f17896a;
        }

        /* renamed from: b */
        int m22993b() {
            return this.f17897b;
        }

        /* renamed from: c */
        C6958s m22994c() {
            return new C6958s(this.f17896a, this.f17897b);
        }

        public String toString() {
            return "<" + this.f17896a + ' ' + this.f17897b + '>';
        }
    }

    public C7568a(C9264b c9264b) {
        this.f17890a = c9264b;
    }

    /* renamed from: b */
    private static float m22974b(C6958s c6958s, C6958s c6958s2) {
        return C9506a.m28271a(c6958s.m20119c(), c6958s.m20120d(), c6958s2.m20119c(), c6958s2.m20120d());
    }

    /* renamed from: c */
    private static float m22975c(a aVar, a aVar2) {
        return C9506a.m28272b(aVar.m22992a(), aVar.m22993b(), aVar2.m22992a(), aVar2.m22993b());
    }

    /* renamed from: d */
    private static C6958s[] m22976d(C6958s[] c6958sArr, int i10, int i11) {
        float f10 = i11 / (i10 * 2.0f);
        float m20119c = c6958sArr[0].m20119c() - c6958sArr[2].m20119c();
        float m20120d = c6958sArr[0].m20120d() - c6958sArr[2].m20120d();
        float m20119c2 = (c6958sArr[0].m20119c() + c6958sArr[2].m20119c()) / 2.0f;
        float m20120d2 = (c6958sArr[0].m20120d() + c6958sArr[2].m20120d()) / 2.0f;
        float f11 = m20119c * f10;
        float f12 = m20120d * f10;
        C6958s c6958s = new C6958s(m20119c2 + f11, m20120d2 + f12);
        C6958s c6958s2 = new C6958s(m20119c2 - f11, m20120d2 - f12);
        float m20119c3 = c6958sArr[1].m20119c() - c6958sArr[3].m20119c();
        float m20120d3 = c6958sArr[1].m20120d() - c6958sArr[3].m20120d();
        float m20119c4 = (c6958sArr[1].m20119c() + c6958sArr[3].m20119c()) / 2.0f;
        float m20120d4 = (c6958sArr[1].m20120d() + c6958sArr[3].m20120d()) / 2.0f;
        float f13 = m20119c3 * f10;
        float f14 = f10 * m20120d3;
        return new C6958s[]{c6958s, new C6958s(m20119c4 + f13, m20120d4 + f14), c6958s2, new C6958s(m20119c4 - f13, m20120d4 - f14)};
    }

    /* renamed from: e */
    private void m22977e(C6958s[] c6958sArr) {
        int i10;
        long j10;
        long j11;
        if (!m22987o(c6958sArr[0]) || !m22987o(c6958sArr[1]) || !m22987o(c6958sArr[2]) || !m22987o(c6958sArr[3])) {
            throw C6952m.m20106a();
        }
        int i11 = this.f17894e * 2;
        int[] iArr = {m22990r(c6958sArr[0], c6958sArr[1], i11), m22990r(c6958sArr[1], c6958sArr[2], i11), m22990r(c6958sArr[2], c6958sArr[3], i11), m22990r(c6958sArr[3], c6958sArr[0], i11)};
        this.f17895f = m22985m(iArr, i11);
        long j12 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = iArr[(this.f17895f + i12) % 4];
            if (this.f17891b) {
                j10 = j12 << 7;
                j11 = (i13 >> 1) & 127;
            } else {
                j10 = j12 << 10;
                j11 = ((i13 >> 2) & 992) + ((i13 >> 1) & 31);
            }
            j12 = j10 + j11;
        }
        int m22980h = m22980h(j12, this.f17891b);
        if (this.f17891b) {
            this.f17892c = (m22980h >> 6) + 1;
            i10 = m22980h & 63;
        } else {
            this.f17892c = (m22980h >> 11) + 1;
            i10 = m22980h & 2047;
        }
        this.f17893d = i10 + 1;
    }

    /* renamed from: f */
    private C6958s[] m22978f(a aVar) {
        this.f17894e = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        boolean z10 = true;
        while (this.f17894e < 9) {
            a m22982j = m22982j(aVar, z10, 1, -1);
            a m22982j2 = m22982j(aVar2, z10, 1, 1);
            a m22982j3 = m22982j(aVar3, z10, -1, 1);
            a m22982j4 = m22982j(aVar4, z10, -1, -1);
            if (this.f17894e > 2) {
                double m22975c = (m22975c(m22982j4, m22982j) * this.f17894e) / (m22975c(aVar4, aVar) * (this.f17894e + 2));
                if (m22975c < 0.75d || m22975c > 1.25d || !m22988p(m22982j, m22982j2, m22982j3, m22982j4)) {
                    break;
                }
            }
            z10 = !z10;
            this.f17894e++;
            aVar4 = m22982j4;
            aVar = m22982j;
            aVar2 = m22982j2;
            aVar3 = m22982j3;
        }
        int i10 = this.f17894e;
        if (i10 != 5 && i10 != 7) {
            throw C6952m.m20106a();
        }
        this.f17891b = i10 == 5;
        C6958s[] c6958sArr = {new C6958s(aVar.m22992a() + 0.5f, aVar.m22993b() - 0.5f), new C6958s(aVar2.m22992a() + 0.5f, aVar2.m22993b() + 0.5f), new C6958s(aVar3.m22992a() - 0.5f, aVar3.m22993b() + 0.5f), new C6958s(aVar4.m22992a() - 0.5f, aVar4.m22993b() - 0.5f)};
        int i11 = this.f17894e;
        return m22976d(c6958sArr, (i11 * 2) - 3, i11 * 2);
    }

    /* renamed from: g */
    private int m22979g(a aVar, a aVar2) {
        float m22975c = m22975c(aVar, aVar2);
        if (m22975c == 0.0f) {
            return 0;
        }
        float m22992a = (aVar2.m22992a() - aVar.m22992a()) / m22975c;
        float m22993b = (aVar2.m22993b() - aVar.m22993b()) / m22975c;
        float m22992a2 = aVar.m22992a();
        float m22993b2 = aVar.m22993b();
        boolean m27603g = this.f17890a.m27603g(aVar.m22992a(), aVar.m22993b());
        int floor = (int) Math.floor(m22975c);
        int i10 = 0;
        for (int i11 = 0; i11 < floor; i11++) {
            if (this.f17890a.m27603g(C9506a.m28273c(m22992a2), C9506a.m28273c(m22993b2)) != m27603g) {
                i10++;
            }
            m22992a2 += m22992a;
            m22993b2 += m22993b;
        }
        float f10 = i10 / m22975c;
        if (f10 <= 0.1f || f10 >= 0.9f) {
            return (f10 <= 0.1f) == m27603g ? 1 : -1;
        }
        return 0;
    }

    /* renamed from: h */
    private static int m22980h(long j10, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new C9582c(C9580a.f23343k).m28554a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return i14;
        } catch (C9584e unused) {
            throw C6952m.m20106a();
        }
    }

    /* renamed from: i */
    private int m22981i() {
        if (this.f17891b) {
            return (this.f17892c * 4) + 11;
        }
        int i10 = this.f17892c;
        return (i10 * 4) + ((((i10 * 2) + 6) / 15) * 2) + 15;
    }

    /* renamed from: j */
    private a m22982j(a aVar, boolean z10, int i10, int i11) {
        int m22992a = aVar.m22992a() + i10;
        int m22993b = aVar.m22993b();
        while (true) {
            m22993b += i11;
            if (!m22986n(m22992a, m22993b) || this.f17890a.m27603g(m22992a, m22993b) != z10) {
                break;
            }
            m22992a += i10;
        }
        int i12 = m22992a - i10;
        int i13 = m22993b - i11;
        while (m22986n(i12, i13) && this.f17890a.m27603g(i12, i13) == z10) {
            i12 += i10;
        }
        int i14 = i12 - i10;
        while (m22986n(i14, i13) && this.f17890a.m27603g(i14, i13) == z10) {
            i13 += i11;
        }
        return new a(i14, i13 - i11);
    }

    /* renamed from: k */
    private a m22983k() {
        C6958s m22994c;
        C6958s c6958s;
        C6958s c6958s2;
        C6958s c6958s3;
        C6958s m22994c2;
        C6958s m22994c3;
        C6958s m22994c4;
        C6958s m22994c5;
        try {
            C6958s[] m28278c = new C9507b(this.f17890a).m28278c();
            c6958s2 = m28278c[0];
            c6958s3 = m28278c[1];
            c6958s = m28278c[2];
            m22994c = m28278c[3];
        } catch (C6952m unused) {
            int m27609m = this.f17890a.m27609m() / 2;
            int m27606j = this.f17890a.m27606j() / 2;
            int i10 = m27609m + 7;
            int i11 = m27606j - 7;
            C6958s m22994c6 = m22982j(new a(i10, i11), false, 1, -1).m22994c();
            int i12 = m27606j + 7;
            C6958s m22994c7 = m22982j(new a(i10, i12), false, 1, 1).m22994c();
            int i13 = m27609m - 7;
            C6958s m22994c8 = m22982j(new a(i13, i12), false, -1, 1).m22994c();
            m22994c = m22982j(new a(i13, i11), false, -1, -1).m22994c();
            c6958s = m22994c8;
            c6958s2 = m22994c6;
            c6958s3 = m22994c7;
        }
        int m28273c = C9506a.m28273c((((c6958s2.m20119c() + m22994c.m20119c()) + c6958s3.m20119c()) + c6958s.m20119c()) / 4.0f);
        int m28273c2 = C9506a.m28273c((((c6958s2.m20120d() + m22994c.m20120d()) + c6958s3.m20120d()) + c6958s.m20120d()) / 4.0f);
        try {
            C6958s[] m28278c2 = new C9507b(this.f17890a, 15, m28273c, m28273c2).m28278c();
            m22994c2 = m28278c2[0];
            m22994c3 = m28278c2[1];
            m22994c4 = m28278c2[2];
            m22994c5 = m28278c2[3];
        } catch (C6952m unused2) {
            int i14 = m28273c + 7;
            int i15 = m28273c2 - 7;
            m22994c2 = m22982j(new a(i14, i15), false, 1, -1).m22994c();
            int i16 = m28273c2 + 7;
            m22994c3 = m22982j(new a(i14, i16), false, 1, 1).m22994c();
            int i17 = m28273c - 7;
            m22994c4 = m22982j(new a(i17, i16), false, -1, 1).m22994c();
            m22994c5 = m22982j(new a(i17, i15), false, -1, -1).m22994c();
        }
        return new a(C9506a.m28273c((((m22994c2.m20119c() + m22994c5.m20119c()) + m22994c3.m20119c()) + m22994c4.m20119c()) / 4.0f), C9506a.m28273c((((m22994c2.m20120d() + m22994c5.m20120d()) + m22994c3.m20120d()) + m22994c4.m20120d()) / 4.0f));
    }

    /* renamed from: l */
    private C6958s[] m22984l(C6958s[] c6958sArr) {
        return m22976d(c6958sArr, this.f17894e * 2, m22981i());
    }

    /* renamed from: m */
    private static int m22985m(int[] iArr, int i10) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f17889g[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw C6952m.m20106a();
    }

    /* renamed from: n */
    private boolean m22986n(int i10, int i11) {
        return i10 >= 0 && i10 < this.f17890a.m27609m() && i11 >= 0 && i11 < this.f17890a.m27606j();
    }

    /* renamed from: o */
    private boolean m22987o(C6958s c6958s) {
        return m22986n(C9506a.m28273c(c6958s.m20119c()), C9506a.m28273c(c6958s.m20120d()));
    }

    /* renamed from: p */
    private boolean m22988p(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(Math.max(0, aVar.m22992a() - 3), Math.min(this.f17890a.m27606j() - 1, aVar.m22993b() + 3));
        a aVar6 = new a(Math.max(0, aVar2.m22992a() - 3), Math.max(0, aVar2.m22993b() - 3));
        a aVar7 = new a(Math.min(this.f17890a.m27609m() - 1, aVar3.m22992a() + 3), Math.max(0, Math.min(this.f17890a.m27606j() - 1, aVar3.m22993b() - 3)));
        a aVar8 = new a(Math.min(this.f17890a.m27609m() - 1, aVar4.m22992a() + 3), Math.min(this.f17890a.m27606j() - 1, aVar4.m22993b() + 3));
        int m22979g = m22979g(aVar8, aVar5);
        return m22979g != 0 && m22979g(aVar5, aVar6) == m22979g && m22979g(aVar6, aVar7) == m22979g && m22979g(aVar7, aVar8) == m22979g;
    }

    /* renamed from: q */
    private C9264b m22989q(C9264b c9264b, C6958s c6958s, C6958s c6958s2, C6958s c6958s3, C6958s c6958s4) {
        AbstractC9274l m27662b = AbstractC9274l.m27662b();
        int m22981i = m22981i();
        float f10 = m22981i / 2.0f;
        int i10 = this.f17894e;
        float f11 = f10 - i10;
        float f12 = f10 + i10;
        return m27662b.mo27639c(c9264b, m22981i, m22981i, f11, f11, f12, f11, f12, f12, f11, f12, c6958s.m20119c(), c6958s.m20120d(), c6958s2.m20119c(), c6958s2.m20120d(), c6958s3.m20119c(), c6958s3.m20120d(), c6958s4.m20119c(), c6958s4.m20120d());
    }

    /* renamed from: r */
    private int m22990r(C6958s c6958s, C6958s c6958s2, int i10) {
        float m22974b = m22974b(c6958s, c6958s2);
        float f10 = m22974b / i10;
        float m20119c = c6958s.m20119c();
        float m20120d = c6958s.m20120d();
        float m20119c2 = ((c6958s2.m20119c() - c6958s.m20119c()) * f10) / m22974b;
        float m20120d2 = (f10 * (c6958s2.m20120d() - c6958s.m20120d())) / m22974b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = i12;
            if (this.f17890a.m27603g(C9506a.m28273c((f11 * m20119c2) + m20119c), C9506a.m28273c((f11 * m20120d2) + m20120d))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    /* renamed from: a */
    public C7186a m22991a(boolean z10) {
        C6958s[] m22978f = m22978f(m22983k());
        if (z10) {
            C6958s c6958s = m22978f[0];
            m22978f[0] = m22978f[2];
            m22978f[2] = c6958s;
        }
        m22977e(m22978f);
        C9264b c9264b = this.f17890a;
        int i10 = this.f17895f;
        return new C7186a(m22989q(c9264b, m22978f[i10 % 4], m22978f[(i10 + 1) % 4], m22978f[(i10 + 2) % 4], m22978f[(i10 + 3) % 4]), m22984l(m22978f), this.f17891b, this.f17893d, this.f17892c);
    }
}
