package p276og;

import kg.C9264b;
import p066dg.C6947h;

/* renamed from: og.a */
/* loaded from: classes2.dex */
final class C9940a {

    /* renamed from: a */
    private final C9264b f24474a;

    /* renamed from: b */
    private final C9264b f24475b;

    /* renamed from: c */
    private final C9944e f24476c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9940a(C9264b c9264b) {
        int m27606j = c9264b.m27606j();
        if (m27606j < 8 || m27606j > 144 || (m27606j & 1) != 0) {
            throw C6947h.m20094a();
        }
        this.f24476c = m29702j(c9264b);
        C9264b m29695a = m29695a(c9264b);
        this.f24474a = m29695a;
        this.f24475b = new C9264b(m29695a.m27609m(), m29695a.m27606j());
    }

    /* renamed from: a */
    private C9264b m29695a(C9264b c9264b) {
        int m29726f = this.f24476c.m29726f();
        int m29725e = this.f24476c.m29725e();
        if (c9264b.m27606j() != m29726f) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int m29723c = this.f24476c.m29723c();
        int m29722b = this.f24476c.m29722b();
        int i10 = m29726f / m29723c;
        int i11 = m29725e / m29722b;
        C9264b c9264b2 = new C9264b(i11 * m29722b, i10 * m29723c);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 * m29723c;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = i14 * m29722b;
                for (int i16 = 0; i16 < m29723c; i16++) {
                    int i17 = ((m29723c + 2) * i12) + 1 + i16;
                    int i18 = i13 + i16;
                    for (int i19 = 0; i19 < m29722b; i19++) {
                        if (c9264b.m27603g(((m29722b + 2) * i14) + 1 + i19, i17)) {
                            c9264b2.m27612r(i15 + i19, i18);
                        }
                    }
                }
            }
        }
        return c9264b2;
    }

    /* renamed from: d */
    private int m29696d(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (m29700h(i12, 0, i10, i11) ? 1 : 0) << 1;
        if (m29700h(i12, 1, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m29700h(i12, 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (m29700h(0, i11 - 2, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        int i17 = i11 - 1;
        if (m29700h(0, i17, i10, i11)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (m29700h(1, i17, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (m29700h(2, i17, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        return m29700h(3, i17, i10, i11) ? i20 | 1 : i20;
    }

    /* renamed from: e */
    private int m29697e(int i10, int i11) {
        int i12 = (m29700h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (m29700h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m29700h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m29700h(0, i11 - 4, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (m29700h(0, i11 - 3, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (m29700h(0, i11 - 2, i10, i11)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        int i18 = i11 - 1;
        if (m29700h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        return m29700h(1, i18, i10, i11) ? i19 | 1 : i19;
    }

    /* renamed from: f */
    private int m29698f(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (m29700h(i12, 0, i10, i11) ? 1 : 0) << 1;
        int i14 = i11 - 1;
        if (m29700h(i12, i14, i10, i11)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        int i16 = i11 - 3;
        if (m29700h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i11 - 2;
        if (m29700h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (m29700h(0, i14, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (m29700h(1, i16, i10, i11)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (m29700h(1, i18, i10, i11)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        return m29700h(1, i14, i10, i11) ? i22 | 1 : i22;
    }

    /* renamed from: g */
    private int m29699g(int i10, int i11) {
        int i12 = (m29700h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (m29700h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m29700h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m29700h(0, i11 - 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        int i16 = i11 - 1;
        if (m29700h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (m29700h(1, i16, i10, i11)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (m29700h(2, i16, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        return m29700h(3, i16, i10, i11) ? i19 | 1 : i19;
    }

    /* renamed from: h */
    private boolean m29700h(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            i10 += i12;
            i11 += 4 - ((i12 + 4) & 7);
        }
        if (i11 < 0) {
            i11 += i13;
            i10 += 4 - ((i13 + 4) & 7);
        }
        if (i10 >= i12) {
            i10 -= i12;
        }
        this.f24475b.m27612r(i11, i10);
        return this.f24474a.m27603g(i11, i10);
    }

    /* renamed from: i */
    private int m29701i(int i10, int i11, int i12, int i13) {
        int i14 = i10 - 2;
        int i15 = i11 - 2;
        int i16 = (m29700h(i14, i15, i12, i13) ? 1 : 0) << 1;
        int i17 = i11 - 1;
        if (m29700h(i14, i17, i12, i13)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        int i19 = i10 - 1;
        if (m29700h(i19, i15, i12, i13)) {
            i18 |= 1;
        }
        int i20 = i18 << 1;
        if (m29700h(i19, i17, i12, i13)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (m29700h(i19, i11, i12, i13)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (m29700h(i10, i15, i12, i13)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (m29700h(i10, i17, i12, i13)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        return m29700h(i10, i11, i12, i13) ? i24 | 1 : i24;
    }

    /* renamed from: j */
    private static C9944e m29702j(C9264b c9264b) {
        return C9944e.m29721h(c9264b.m27606j(), c9264b.m27609m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C9944e m29703b() {
        return this.f24476c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m29704c() {
        byte[] bArr = new byte[this.f24476c.m29727g()];
        int m27606j = this.f24474a.m27606j();
        int m27609m = this.f24474a.m27609m();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i12 = 4;
        while (true) {
            if (i12 == m27606j && i10 == 0 && !z10) {
                bArr[i11] = (byte) m29696d(m27606j, m27609m);
                i12 -= 2;
                i10 += 2;
                i11++;
                z10 = true;
            } else {
                int i13 = m27606j - 2;
                if (i12 == i13 && i10 == 0 && (m27609m & 3) != 0 && !z11) {
                    bArr[i11] = (byte) m29697e(m27606j, m27609m);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z11 = true;
                } else if (i12 == m27606j + 4 && i10 == 2 && (m27609m & 7) == 0 && !z12) {
                    bArr[i11] = (byte) m29698f(m27606j, m27609m);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z12 = true;
                } else if (i12 == i13 && i10 == 0 && (m27609m & 7) == 4 && !z13) {
                    bArr[i11] = (byte) m29699g(m27606j, m27609m);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z13 = true;
                } else {
                    do {
                        if (i12 < m27606j && i10 >= 0 && !this.f24475b.m27603g(i10, i12)) {
                            bArr[i11] = (byte) m29701i(i12, i10, m27606j, m27609m);
                            i11++;
                        }
                        i12 -= 2;
                        i10 += 2;
                        if (i12 < 0) {
                            break;
                        }
                    } while (i10 < m27609m);
                    int i14 = i12 + 1;
                    int i15 = i10 + 3;
                    do {
                        if (i14 >= 0 && i15 < m27609m && !this.f24475b.m27603g(i15, i14)) {
                            bArr[i11] = (byte) m29701i(i14, i15, m27606j, m27609m);
                            i11++;
                        }
                        i14 += 2;
                        i15 -= 2;
                        if (i14 >= m27606j) {
                            break;
                        }
                    } while (i15 >= 0);
                    i12 = i14 + 3;
                    i10 = i15 + 1;
                }
            }
            if (i12 >= m27606j && i10 >= m27609m) {
                break;
            }
        }
        if (i11 == this.f24476c.m29727g()) {
            return bArr;
        }
        throw C6947h.m20094a();
    }
}
