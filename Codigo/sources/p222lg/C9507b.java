package p222lg;

import kg.C9264b;
import p066dg.C6952m;
import p066dg.C6958s;

/* renamed from: lg.b */
/* loaded from: classes2.dex */
public final class C9507b {

    /* renamed from: a */
    private final C9264b f23068a;

    /* renamed from: b */
    private final int f23069b;

    /* renamed from: c */
    private final int f23070c;

    /* renamed from: d */
    private final int f23071d;

    /* renamed from: e */
    private final int f23072e;

    /* renamed from: f */
    private final int f23073f;

    /* renamed from: g */
    private final int f23074g;

    public C9507b(C9264b c9264b) {
        this(c9264b, 10, c9264b.m27609m() / 2, c9264b.m27606j() / 2);
    }

    public C9507b(C9264b c9264b, int i10, int i11, int i12) {
        this.f23068a = c9264b;
        int m27606j = c9264b.m27606j();
        this.f23069b = m27606j;
        int m27609m = c9264b.m27609m();
        this.f23070c = m27609m;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.f23071d = i14;
        int i15 = i11 + i13;
        this.f23072e = i15;
        int i16 = i12 - i13;
        this.f23074g = i16;
        int i17 = i12 + i13;
        this.f23073f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= m27606j || i15 >= m27609m) {
            throw C6952m.m20106a();
        }
    }

    /* renamed from: a */
    private C6958s[] m28275a(C6958s c6958s, C6958s c6958s2, C6958s c6958s3, C6958s c6958s4) {
        float m20119c = c6958s.m20119c();
        float m20120d = c6958s.m20120d();
        float m20119c2 = c6958s2.m20119c();
        float m20120d2 = c6958s2.m20120d();
        float m20119c3 = c6958s3.m20119c();
        float m20120d3 = c6958s3.m20120d();
        float m20119c4 = c6958s4.m20119c();
        float m20120d4 = c6958s4.m20120d();
        return m20119c < ((float) this.f23070c) / 2.0f ? new C6958s[]{new C6958s(m20119c4 - 1.0f, m20120d4 + 1.0f), new C6958s(m20119c2 + 1.0f, m20120d2 + 1.0f), new C6958s(m20119c3 - 1.0f, m20120d3 - 1.0f), new C6958s(m20119c + 1.0f, m20120d - 1.0f)} : new C6958s[]{new C6958s(m20119c4 + 1.0f, m20120d4 + 1.0f), new C6958s(m20119c2 + 1.0f, m20120d2 - 1.0f), new C6958s(m20119c3 - 1.0f, m20120d3 + 1.0f), new C6958s(m20119c - 1.0f, m20120d - 1.0f)};
    }

    /* renamed from: b */
    private boolean m28276b(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.f23068a.m27603g(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.f23068a.m27603g(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    /* renamed from: d */
    private C6958s m28277d(float f10, float f11, float f12, float f13) {
        int m28273c = C9506a.m28273c(C9506a.m28271a(f10, f11, f12, f13));
        float f14 = m28273c;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < m28273c; i10++) {
            float f17 = i10;
            int m28273c2 = C9506a.m28273c((f17 * f15) + f10);
            int m28273c3 = C9506a.m28273c((f17 * f16) + f11);
            if (this.f23068a.m27603g(m28273c2, m28273c3)) {
                return new C6958s(m28273c2, m28273c3);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C6958s[] m28278c() {
        int i10 = this.f23071d;
        int i11 = this.f23072e;
        int i12 = this.f23074g;
        int i13 = this.f23073f;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = true;
        while (z15) {
            boolean z16 = false;
            boolean z17 = true;
            while (true) {
                if ((z17 || !z11) && i11 < this.f23070c) {
                    z17 = m28276b(i12, i13, i11, false);
                    if (z17) {
                        i11++;
                        z11 = true;
                        z16 = true;
                    } else if (!z11) {
                        i11++;
                    }
                }
            }
            if (i11 < this.f23070c) {
                boolean z18 = true;
                while (true) {
                    if ((z18 || !z12) && i13 < this.f23069b) {
                        z18 = m28276b(i10, i11, i13, true);
                        if (z18) {
                            i13++;
                            z12 = true;
                            z16 = true;
                        } else if (!z12) {
                            i13++;
                        }
                    }
                }
                if (i13 < this.f23069b) {
                    boolean z19 = true;
                    while (true) {
                        if ((z19 || !z13) && i10 >= 0) {
                            z19 = m28276b(i12, i13, i10, false);
                            if (z19) {
                                i10--;
                                z13 = true;
                                z16 = true;
                            } else if (!z13) {
                                i10--;
                            }
                        }
                    }
                    if (i10 >= 0) {
                        z15 = z16;
                        boolean z20 = true;
                        while (true) {
                            if ((z20 || !z14) && i12 >= 0) {
                                z20 = m28276b(i10, i11, i12, true);
                                if (z20) {
                                    i12--;
                                    z15 = true;
                                    z14 = true;
                                } else if (!z14) {
                                    i12--;
                                }
                            }
                        }
                        if (i12 < 0) {
                        }
                    }
                }
            }
            z10 = true;
            break;
        }
        if (z10) {
            throw C6952m.m20106a();
        }
        int i14 = i11 - i10;
        C6958s c6958s = null;
        C6958s c6958s2 = null;
        for (int i15 = 1; c6958s2 == null && i15 < i14; i15++) {
            c6958s2 = m28277d(i10, i13 - i15, i10 + i15, i13);
        }
        if (c6958s2 == null) {
            throw C6952m.m20106a();
        }
        C6958s c6958s3 = null;
        for (int i16 = 1; c6958s3 == null && i16 < i14; i16++) {
            c6958s3 = m28277d(i10, i12 + i16, i10 + i16, i12);
        }
        if (c6958s3 == null) {
            throw C6952m.m20106a();
        }
        C6958s c6958s4 = null;
        for (int i17 = 1; c6958s4 == null && i17 < i14; i17++) {
            c6958s4 = m28277d(i11, i12 + i17, i11 - i17, i12);
        }
        if (c6958s4 == null) {
            throw C6952m.m20106a();
        }
        for (int i18 = 1; c6958s == null && i18 < i14; i18++) {
            c6958s = m28277d(i11, i13 - i18, i11 - i18, i13);
        }
        if (c6958s != null) {
            return m28275a(c6958s, c6958s2, c6958s4, c6958s3);
        }
        throw C6952m.m20106a();
    }
}
