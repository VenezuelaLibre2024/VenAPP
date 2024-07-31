package pg;

import kg.AbstractC9274l;
import kg.C9264b;
import kg.C9269g;
import p066dg.C6952m;
import p066dg.C6958s;
import p222lg.C9507b;

/* renamed from: pg.a */
/* loaded from: classes2.dex */
public final class C10170a {

    /* renamed from: a */
    private final C9264b f24981a;

    /* renamed from: b */
    private final C9507b f24982b;

    public C10170a(C9264b c9264b) {
        this.f24981a = c9264b;
        this.f24982b = new C9507b(c9264b);
    }

    /* renamed from: a */
    private C6958s m30436a(C6958s[] c6958sArr) {
        C6958s c6958s = c6958sArr[0];
        C6958s c6958s2 = c6958sArr[1];
        C6958s c6958s3 = c6958sArr[2];
        C6958s c6958s4 = c6958sArr[3];
        int m30444j = m30444j(c6958s, c6958s4);
        C6958s m30442h = m30442h(c6958s, c6958s2, (m30444j(c6958s2, c6958s4) + 1) * 4);
        C6958s m30442h2 = m30442h(c6958s3, c6958s2, (m30444j + 1) * 4);
        int m30444j2 = m30444j(m30442h, c6958s4);
        int m30444j3 = m30444j(m30442h2, c6958s4);
        float f10 = m30444j2 + 1;
        C6958s c6958s5 = new C6958s(c6958s4.m20119c() + ((c6958s3.m20119c() - c6958s2.m20119c()) / f10), c6958s4.m20120d() + ((c6958s3.m20120d() - c6958s2.m20120d()) / f10));
        float f11 = m30444j3 + 1;
        C6958s c6958s6 = new C6958s(c6958s4.m20119c() + ((c6958s.m20119c() - c6958s2.m20119c()) / f11), c6958s4.m20120d() + ((c6958s.m20120d() - c6958s2.m20120d()) / f11));
        if (m30439e(c6958s5)) {
            return (m30439e(c6958s6) && m30444j(m30442h, c6958s5) + m30444j(m30442h2, c6958s5) <= m30444j(m30442h, c6958s6) + m30444j(m30442h2, c6958s6)) ? c6958s6 : c6958s5;
        }
        if (m30439e(c6958s6)) {
            return c6958s6;
        }
        return null;
    }

    /* renamed from: c */
    private C6958s[] m30437c(C6958s[] c6958sArr) {
        C6958s c6958s = c6958sArr[0];
        C6958s c6958s2 = c6958sArr[1];
        C6958s c6958s3 = c6958sArr[3];
        C6958s c6958s4 = c6958sArr[2];
        int m30444j = m30444j(c6958s, c6958s2);
        int m30444j2 = m30444j(c6958s2, c6958s3);
        int m30444j3 = m30444j(c6958s3, c6958s4);
        int m30444j4 = m30444j(c6958s4, c6958s);
        C6958s[] c6958sArr2 = {c6958s4, c6958s, c6958s2, c6958s3};
        if (m30444j > m30444j2) {
            c6958sArr2[0] = c6958s;
            c6958sArr2[1] = c6958s2;
            c6958sArr2[2] = c6958s3;
            c6958sArr2[3] = c6958s4;
            m30444j = m30444j2;
        }
        if (m30444j > m30444j3) {
            c6958sArr2[0] = c6958s2;
            c6958sArr2[1] = c6958s3;
            c6958sArr2[2] = c6958s4;
            c6958sArr2[3] = c6958s;
        } else {
            m30444j3 = m30444j;
        }
        if (m30444j3 > m30444j4) {
            c6958sArr2[0] = c6958s3;
            c6958sArr2[1] = c6958s4;
            c6958sArr2[2] = c6958s;
            c6958sArr2[3] = c6958s2;
        }
        return c6958sArr2;
    }

    /* renamed from: d */
    private C6958s[] m30438d(C6958s[] c6958sArr) {
        C6958s c6958s = c6958sArr[0];
        C6958s c6958s2 = c6958sArr[1];
        C6958s c6958s3 = c6958sArr[2];
        C6958s c6958s4 = c6958sArr[3];
        int m30444j = (m30444j(c6958s, c6958s4) + 1) * 4;
        if (m30444j(m30442h(c6958s2, c6958s3, m30444j), c6958s) < m30444j(m30442h(c6958s3, c6958s2, m30444j), c6958s4)) {
            c6958sArr[0] = c6958s;
            c6958sArr[1] = c6958s2;
            c6958sArr[2] = c6958s3;
            c6958sArr[3] = c6958s4;
        } else {
            c6958sArr[0] = c6958s2;
            c6958sArr[1] = c6958s3;
            c6958sArr[2] = c6958s4;
            c6958sArr[3] = c6958s;
        }
        return c6958sArr;
    }

    /* renamed from: e */
    private boolean m30439e(C6958s c6958s) {
        return c6958s.m20119c() >= 0.0f && c6958s.m20119c() <= ((float) (this.f24981a.m27609m() - 1)) && c6958s.m20120d() > 0.0f && c6958s.m20120d() <= ((float) (this.f24981a.m27606j() - 1));
    }

    /* renamed from: f */
    private static C6958s m30440f(C6958s c6958s, float f10, float f11) {
        float m20119c = c6958s.m20119c();
        float m20120d = c6958s.m20120d();
        return new C6958s(m20119c < f10 ? m20119c - 1.0f : m20119c + 1.0f, m20120d < f11 ? m20120d - 1.0f : m20120d + 1.0f);
    }

    /* renamed from: g */
    private static C9264b m30441g(C9264b c9264b, C6958s c6958s, C6958s c6958s2, C6958s c6958s3, C6958s c6958s4, int i10, int i11) {
        float f10 = i10 - 0.5f;
        float f11 = i11 - 0.5f;
        return AbstractC9274l.m27662b().mo27639c(c9264b, i10, i11, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, c6958s.m20119c(), c6958s.m20120d(), c6958s4.m20119c(), c6958s4.m20120d(), c6958s3.m20119c(), c6958s3.m20120d(), c6958s2.m20119c(), c6958s2.m20120d());
    }

    /* renamed from: h */
    private static C6958s m30442h(C6958s c6958s, C6958s c6958s2, int i10) {
        float f10 = i10 + 1;
        return new C6958s(c6958s.m20119c() + ((c6958s2.m20119c() - c6958s.m20119c()) / f10), c6958s.m20120d() + ((c6958s2.m20120d() - c6958s.m20120d()) / f10));
    }

    /* renamed from: i */
    private C6958s[] m30443i(C6958s[] c6958sArr) {
        C6958s c6958s = c6958sArr[0];
        C6958s c6958s2 = c6958sArr[1];
        C6958s c6958s3 = c6958sArr[2];
        C6958s c6958s4 = c6958sArr[3];
        int m30444j = m30444j(c6958s, c6958s4) + 1;
        C6958s m30442h = m30442h(c6958s, c6958s2, (m30444j(c6958s3, c6958s4) + 1) * 4);
        C6958s m30442h2 = m30442h(c6958s3, c6958s2, m30444j * 4);
        int m30444j2 = m30444j(m30442h, c6958s4) + 1;
        int m30444j3 = m30444j(m30442h2, c6958s4) + 1;
        if ((m30444j2 & 1) == 1) {
            m30444j2++;
        }
        if ((m30444j3 & 1) == 1) {
            m30444j3++;
        }
        float m20119c = (((c6958s.m20119c() + c6958s2.m20119c()) + c6958s3.m20119c()) + c6958s4.m20119c()) / 4.0f;
        float m20120d = (((c6958s.m20120d() + c6958s2.m20120d()) + c6958s3.m20120d()) + c6958s4.m20120d()) / 4.0f;
        C6958s m30440f = m30440f(c6958s, m20119c, m20120d);
        C6958s m30440f2 = m30440f(c6958s2, m20119c, m20120d);
        C6958s m30440f3 = m30440f(c6958s3, m20119c, m20120d);
        C6958s m30440f4 = m30440f(c6958s4, m20119c, m20120d);
        int i10 = m30444j3 * 4;
        int i11 = m30444j2 * 4;
        return new C6958s[]{m30442h(m30442h(m30440f, m30440f2, i10), m30440f4, i11), m30442h(m30442h(m30440f2, m30440f, i10), m30440f3, i11), m30442h(m30442h(m30440f3, m30440f4, i10), m30440f2, i11), m30442h(m30442h(m30440f4, m30440f3, i10), m30440f, i11)};
    }

    /* renamed from: j */
    private int m30444j(C6958s c6958s, C6958s c6958s2) {
        int m20119c = (int) c6958s.m20119c();
        int m20120d = (int) c6958s.m20120d();
        int m20119c2 = (int) c6958s2.m20119c();
        int min = Math.min(this.f24981a.m27606j() - 1, (int) c6958s2.m20120d());
        int i10 = 0;
        boolean z10 = Math.abs(min - m20120d) > Math.abs(m20119c2 - m20119c);
        if (z10) {
            m20120d = m20119c;
            m20119c = m20120d;
            min = m20119c2;
            m20119c2 = min;
        }
        int abs = Math.abs(m20119c2 - m20119c);
        int abs2 = Math.abs(min - m20120d);
        int i11 = (-abs) / 2;
        int i12 = m20120d < min ? 1 : -1;
        int i13 = m20119c >= m20119c2 ? -1 : 1;
        boolean m27603g = this.f24981a.m27603g(z10 ? m20120d : m20119c, z10 ? m20119c : m20120d);
        while (m20119c != m20119c2) {
            boolean m27603g2 = this.f24981a.m27603g(z10 ? m20120d : m20119c, z10 ? m20119c : m20120d);
            if (m27603g2 != m27603g) {
                i10++;
                m27603g = m27603g2;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (m20120d == min) {
                    break;
                }
                m20120d += i12;
                i11 -= abs;
            }
            m20119c += i13;
        }
        return i10;
    }

    /* renamed from: b */
    public C9269g m30445b() {
        int i10;
        int i11;
        C6958s[] m30438d = m30438d(m30437c(this.f24982b.m28278c()));
        C6958s m30436a = m30436a(m30438d);
        m30438d[3] = m30436a;
        if (m30436a == null) {
            throw C6952m.m20106a();
        }
        C6958s[] m30443i = m30443i(m30438d);
        C6958s c6958s = m30443i[0];
        C6958s c6958s2 = m30443i[1];
        C6958s c6958s3 = m30443i[2];
        C6958s c6958s4 = m30443i[3];
        int m30444j = m30444j(c6958s, c6958s4) + 1;
        int m30444j2 = m30444j(c6958s3, c6958s4) + 1;
        if ((m30444j & 1) == 1) {
            m30444j++;
        }
        if ((m30444j2 & 1) == 1) {
            m30444j2++;
        }
        if (m30444j * 4 >= m30444j2 * 6 || m30444j2 * 4 >= m30444j * 6) {
            i10 = m30444j;
            i11 = m30444j2;
        } else {
            i10 = Math.max(m30444j, m30444j2);
            i11 = i10;
        }
        return new C9269g(m30441g(this.f24981a, c6958s, c6958s2, c6958s3, c6958s4, i10, i11), new C6958s[]{c6958s, c6958s2, c6958s3, c6958s4});
    }
}
